package gg.essential.lib.okio;

import javax.annotation.*;
import java.nio.charset.*;
import java.io.*;

public final class Buffer implements Cloneable, BufferedSink, BufferedSource
{
    private static final byte[] DIGITS;
    @Nullable
    Segment head;
    long size;
    
    public Buffer() {
        super();
    }
    
    public long size() {
        return this.size;
    }
    
    @Override
    public Buffer buffer() {
        return this;
    }
    
    @Override
    public Buffer emitCompleteSegments() {
        return this;
    }
    
    @Override
    public boolean exhausted() {
        return this.size == 0L;
    }
    
    @Override
    public void require(final long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }
    
    public Buffer copyTo(final Buffer out, long offset, long byteCount) {
        if (out == null) {
            throw new IllegalArgumentException("out == null");
        }
        Util.checkOffsetAndCount(this.size, offset, byteCount);
        if (byteCount == 0L) {
            return this;
        }
        out.size += byteCount;
        Segment s;
        for (s = this.head; offset >= s.limit - s.pos; offset -= s.limit - s.pos, s = s.next) {}
        while (byteCount > 0L) {
            final Segment segment;
            final Segment copy = segment = new Segment(s);
            segment.pos += (int)offset;
            copy.limit = Math.min(copy.pos + (int)byteCount, copy.limit);
            if (out.head == null) {
                final Segment segment2 = copy;
                final Segment segment3 = copy;
                final Segment head = copy;
                segment3.prev = head;
                segment2.next = head;
                out.head = head;
            }
            else {
                out.head.prev.push(copy);
            }
            byteCount -= copy.limit - copy.pos;
            offset = 0L;
            s = s.next;
        }
        return this;
    }
    
    public long completeSegmentByteCount() {
        long result = this.size;
        if (result == 0L) {
            return 0L;
        }
        final Segment tail = this.head.prev;
        if (tail.limit < 8192 && tail.owner) {
            result -= tail.limit - tail.pos;
        }
        return result;
    }
    
    @Override
    public byte readByte() {
        if (this.size == 0L) {
            throw new IllegalStateException("size == 0");
        }
        final Segment segment = this.head;
        int pos = segment.pos;
        final int limit = segment.limit;
        final byte[] data = segment.data;
        final byte b = data[pos++];
        --this.size;
        if (pos == limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        else {
            segment.pos = pos;
        }
        return b;
    }
    
    public byte getByte(long pos) {
        Util.checkOffsetAndCount(this.size, pos, 1L);
        Segment s = this.head;
        while (true) {
            final int segmentByteCount = s.limit - s.pos;
            if (pos < segmentByteCount) {
                break;
            }
            pos -= segmentByteCount;
            s = s.next;
        }
        return s.data[s.pos + (int)pos];
    }
    
    @Override
    public short readShort() {
        if (this.size < 2L) {
            throw new IllegalStateException("size < 2: " + this.size);
        }
        final Segment segment = this.head;
        int pos = segment.pos;
        final int limit = segment.limit;
        if (limit - pos < 2) {
            final int s = (this.readByte() & 0xFF) << 8 | (this.readByte() & 0xFF);
            return (short)s;
        }
        final byte[] data = segment.data;
        final int s2 = (data[pos++] & 0xFF) << 8 | (data[pos++] & 0xFF);
        this.size -= 2L;
        if (pos == limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        else {
            segment.pos = pos;
        }
        return (short)s2;
    }
    
    @Override
    public int readInt() {
        if (this.size < 4L) {
            throw new IllegalStateException("size < 4: " + this.size);
        }
        final Segment segment = this.head;
        int pos = segment.pos;
        final int limit = segment.limit;
        if (limit - pos < 4) {
            return (this.readByte() & 0xFF) << 24 | (this.readByte() & 0xFF) << 16 | (this.readByte() & 0xFF) << 8 | (this.readByte() & 0xFF);
        }
        final byte[] data = segment.data;
        final int i = (data[pos++] & 0xFF) << 24 | (data[pos++] & 0xFF) << 16 | (data[pos++] & 0xFF) << 8 | (data[pos++] & 0xFF);
        this.size -= 4L;
        if (pos == limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        else {
            segment.pos = pos;
        }
        return i;
    }
    
    @Override
    public short readShortLe() {
        return Util.reverseBytesShort(this.readShort());
    }
    
    @Override
    public int readIntLe() {
        return Util.reverseBytesInt(this.readInt());
    }
    
    @Override
    public long readHexadecimalUnsignedLong() {
        if (this.size == 0L) {
            throw new IllegalStateException("size == 0");
        }
        long value = 0L;
        int seen = 0;
        boolean done = false;
        do {
            final Segment segment = this.head;
            final byte[] data = segment.data;
            int pos;
            int limit;
            for (pos = segment.pos, limit = segment.limit; pos < limit; ++pos, ++seen) {
                final byte b = data[pos];
                int digit;
                if (b >= 48 && b <= 57) {
                    digit = b - 48;
                }
                else if (b >= 97 && b <= 102) {
                    digit = b - 97 + 10;
                }
                else if (b >= 65 && b <= 70) {
                    digit = b - 65 + 10;
                }
                else {
                    if (seen == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b));
                    }
                    done = true;
                    break;
                }
                if ((value & 0xF000000000000000L) != 0x0L) {
                    final Buffer buffer = new Buffer().writeHexadecimalUnsignedLong(value).writeByte((int)b);
                    throw new NumberFormatException("Number too large: " + buffer.readUtf8());
                }
                value <<= 4;
                value |= digit;
            }
            if (pos == limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            else {
                segment.pos = pos;
            }
        } while (!done && this.head != null);
        this.size -= seen;
        return value;
    }
    
    public ByteString readByteString() {
        return new ByteString(this.readByteArray());
    }
    
    @Override
    public ByteString readByteString(final long byteCount) throws EOFException {
        return new ByteString(this.readByteArray(byteCount));
    }
    
    public String readUtf8() {
        try {
            return this.readString(this.size, Util.UTF_8);
        }
        catch (final EOFException e) {
            throw new AssertionError((Object)e);
        }
    }
    
    public String readUtf8(final long byteCount) throws EOFException {
        return this.readString(byteCount, Util.UTF_8);
    }
    
    @Override
    public String readString(final Charset charset) {
        try {
            return this.readString(this.size, charset);
        }
        catch (final EOFException e) {
            throw new AssertionError((Object)e);
        }
    }
    
    public String readString(final long byteCount, final Charset charset) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, byteCount);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (byteCount > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
        }
        if (byteCount == 0L) {
            return "";
        }
        final Segment s = this.head;
        if (s.pos + byteCount > s.limit) {
            return new String(this.readByteArray(byteCount), charset);
        }
        final String result = new String(s.data, s.pos, (int)byteCount, charset);
        final Segment segment = s;
        segment.pos += (int)byteCount;
        this.size -= byteCount;
        if (s.pos == s.limit) {
            this.head = s.pop();
            SegmentPool.recycle(s);
        }
        return result;
    }
    
    @Override
    public String readUtf8LineStrict() throws EOFException {
        return this.readUtf8LineStrict$2f33e691();
    }
    
    public String readUtf8LineStrict$2f33e691() throws EOFException {
        if (Long.MAX_VALUE < 0L) {
            throw new IllegalArgumentException("limit < 0: " + Long.MAX_VALUE);
        }
        final long scanLength = (Long.MAX_VALUE == Long.MAX_VALUE) ? Long.MAX_VALUE : Long.MIN_VALUE;
        final long newline = this.indexOf((byte)10, 0L, scanLength);
        if (newline != -1L) {
            return this.readUtf8Line(newline);
        }
        if (scanLength < this.size() && this.getByte(scanLength - 1L) == 13 && this.getByte(scanLength) == 10) {
            return this.readUtf8Line(scanLength);
        }
        final Buffer data = new Buffer();
        this.copyTo(data, 0L, Math.min(32L, this.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.size(), Long.MAX_VALUE) + " content=" + data.readByteString().hex() + '\u2026');
    }
    
    String readUtf8Line(final long newline) throws EOFException {
        if (newline > 0L && this.getByte(newline - 1L) == 13) {
            final String result = this.readUtf8(newline - 1L);
            this.skip(2L);
            return result;
        }
        final String result = this.readUtf8(newline);
        this.skip(1L);
        return result;
    }
    
    public byte[] readByteArray() {
        try {
            return this.readByteArray(this.size);
        }
        catch (final EOFException e) {
            throw new AssertionError((Object)e);
        }
    }
    
    @Override
    public byte[] readByteArray(final long byteCount) throws EOFException {
        Util.checkOffsetAndCount(this.size, 0L, byteCount);
        if (byteCount > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + byteCount);
        }
        final byte[] result = new byte[(int)byteCount];
        this.readFully(result);
        return result;
    }
    
    @Override
    public void readFully(final byte[] sink) throws EOFException {
        int read;
        for (int offset = 0; offset < sink.length; offset += read) {
            read = this.read(sink, offset, sink.length - offset);
            if (read == -1) {
                throw new EOFException();
            }
        }
    }
    
    public int read(final byte[] sink, final int offset, final int byteCount) {
        Util.checkOffsetAndCount(sink.length, offset, byteCount);
        final Segment s = this.head;
        if (s == null) {
            return -1;
        }
        final int toCopy = Math.min(byteCount, s.limit - s.pos);
        System.arraycopy(s.data, s.pos, sink, offset, toCopy);
        final Segment segment = s;
        segment.pos += toCopy;
        this.size -= toCopy;
        if (s.pos == s.limit) {
            this.head = s.pop();
            SegmentPool.recycle(s);
        }
        return toCopy;
    }
    
    public void clear() {
        try {
            this.skip(this.size);
        }
        catch (final EOFException e) {
            throw new AssertionError((Object)e);
        }
    }
    
    @Override
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0L) {
            if (this.head == null) {
                throw new EOFException();
            }
            final int toSkip = (int)Math.min(byteCount, this.head.limit - this.head.pos);
            this.size -= toSkip;
            byteCount -= toSkip;
            final Segment head = this.head;
            head.pos += toSkip;
            if (this.head.pos != this.head.limit) {
                continue;
            }
            final Segment toRecycle = this.head;
            this.head = toRecycle.pop();
            SegmentPool.recycle(toRecycle);
        }
    }
    
    @Override
    public Buffer write(final ByteString byteString) {
        if (byteString == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        byteString.write(this);
        return this;
    }
    
    @Override
    public Buffer writeUtf8(final String string) {
        return this.writeUtf8(string, 0, string.length());
    }
    
    public Buffer writeUtf8(final String string, final int beginIndex, final int endIndex) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + beginIndex);
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + string.length());
        }
        int i = beginIndex;
        while (i < endIndex) {
            int c = string.charAt(i);
            if (c < 128) {
                final Segment tail = this.writableSegment(1);
                final byte[] data = tail.data;
                final int segmentOffset = tail.limit - i;
                final int runLimit = Math.min(endIndex, 8192 - segmentOffset);
                data[segmentOffset + i++] = (byte)c;
                while (i < runLimit) {
                    c = string.charAt(i);
                    if (c >= 128) {
                        break;
                    }
                    data[segmentOffset + i++] = (byte)c;
                }
                final int runSize = i + segmentOffset - tail.limit;
                final Segment segment = tail;
                segment.limit += runSize;
                this.size += runSize;
            }
            else if (c < 2048) {
                this.writeByte(c >> 6 | 0xC0);
                this.writeByte((c & 0x3F) | 0x80);
                ++i;
            }
            else if (c < 55296 || c > 57343) {
                this.writeByte(c >> 12 | 0xE0);
                this.writeByte((c >> 6 & 0x3F) | 0x80);
                this.writeByte((c & 0x3F) | 0x80);
                ++i;
            }
            else {
                final int low = (i + 1 < endIndex) ? string.charAt(i + 1) : '\0';
                if (c > 56319 || low < 56320 || low > 57343) {
                    this.writeByte(63);
                    ++i;
                }
                else {
                    final int codePoint = 65536 + ((c & 0xFFFF27FF) << 10 | (low & 0xFFFF23FF));
                    this.writeByte(codePoint >> 18 | 0xF0);
                    this.writeByte((codePoint >> 12 & 0x3F) | 0x80);
                    this.writeByte((codePoint >> 6 & 0x3F) | 0x80);
                    this.writeByte((codePoint & 0x3F) | 0x80);
                    i += 2;
                }
            }
        }
        return this;
    }
    
    public Buffer writeUtf8CodePoint(final int codePoint) {
        if (codePoint < 128) {
            this.writeByte(codePoint);
        }
        else if (codePoint < 2048) {
            this.writeByte(codePoint >> 6 | 0xC0);
            this.writeByte((codePoint & 0x3F) | 0x80);
        }
        else if (codePoint < 65536) {
            if (codePoint >= 55296 && codePoint <= 57343) {
                this.writeByte(63);
            }
            else {
                this.writeByte(codePoint >> 12 | 0xE0);
                this.writeByte((codePoint >> 6 & 0x3F) | 0x80);
                this.writeByte((codePoint & 0x3F) | 0x80);
            }
        }
        else {
            if (codePoint > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(codePoint));
            }
            this.writeByte(codePoint >> 18 | 0xF0);
            this.writeByte((codePoint >> 12 & 0x3F) | 0x80);
            this.writeByte((codePoint >> 6 & 0x3F) | 0x80);
            this.writeByte((codePoint & 0x3F) | 0x80);
        }
        return this;
    }
    
    public Buffer writeString(final String string, final int beginIndex, final int endIndex, final Charset charset) {
        if (string == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (beginIndex < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + beginIndex);
        }
        if (endIndex < beginIndex) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + endIndex + " < " + beginIndex);
        }
        if (endIndex > string.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + endIndex + " > " + string.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(Util.UTF_8)) {
            return this.writeUtf8(string, beginIndex, endIndex);
        }
        final byte[] data = string.substring(beginIndex, endIndex).getBytes(charset);
        return this.write(data, 0, data.length);
    }
    
    @Override
    public Buffer write(final byte[] source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        return this.write(source, 0, source.length);
    }
    
    @Override
    public Buffer write(final byte[] source, int offset, final int byteCount) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        Util.checkOffsetAndCount(source.length, offset, byteCount);
        Segment tail;
        int toCopy;
        Segment segment;
        for (int limit = offset + byteCount; offset < limit; offset += toCopy, segment = tail, segment.limit += toCopy) {
            tail = this.writableSegment(1);
            toCopy = Math.min(limit - offset, 8192 - tail.limit);
            System.arraycopy(source, offset, tail.data, tail.limit, toCopy);
        }
        this.size += byteCount;
        return this;
    }
    
    @Override
    public long writeAll(final Source source) throws IOException {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        long totalBytesRead = 0L;
        long readCount;
        while ((readCount = source.read(this, 8192L)) != -1L) {
            totalBytesRead += readCount;
        }
        return totalBytesRead;
    }
    
    @Override
    public Buffer writeByte(final int b) {
        final Segment tail = this.writableSegment(1);
        tail.data[tail.limit++] = (byte)b;
        ++this.size;
        return this;
    }
    
    @Override
    public Buffer writeShort(final int s) {
        final Segment tail = this.writableSegment(2);
        final byte[] data = tail.data;
        int limit = tail.limit;
        data[limit++] = (byte)(s >>> 8 & 0xFF);
        data[limit++] = (byte)(s & 0xFF);
        tail.limit = limit;
        this.size += 2L;
        return this;
    }
    
    @Override
    public Buffer writeInt(final int i) {
        final Segment tail = this.writableSegment(4);
        final byte[] data = tail.data;
        int limit = tail.limit;
        data[limit++] = (byte)(i >>> 24 & 0xFF);
        data[limit++] = (byte)(i >>> 16 & 0xFF);
        data[limit++] = (byte)(i >>> 8 & 0xFF);
        data[limit++] = (byte)(i & 0xFF);
        tail.limit = limit;
        this.size += 4L;
        return this;
    }
    
    @Override
    public Buffer writeDecimalLong(long v) {
        if (v == 0L) {
            return this.writeByte(48);
        }
        boolean negative = false;
        if (v < 0L) {
            v = -v;
            if (v < 0L) {
                return this.writeUtf8("-9223372036854775808");
            }
            negative = true;
        }
        int width = (v < 100000000L) ? ((v < 10000L) ? ((v < 100L) ? ((v < 10L) ? 1 : 2) : ((v < 1000L) ? 3 : 4)) : ((v < 1000000L) ? ((v < 100000L) ? 5 : 6) : ((v < 10000000L) ? 7 : 8))) : ((v < 1000000000000L) ? ((v < 10000000000L) ? ((v < 1000000000L) ? 9 : 10) : ((v < 100000000000L) ? 11 : 12)) : ((v < 1000000000000000L) ? ((v < 10000000000000L) ? 13 : ((v < 100000000000000L) ? 14 : 15)) : ((v < 100000000000000000L) ? ((v < 10000000000000000L) ? 16 : 17) : ((v < 1000000000000000000L) ? 18 : 19))));
        if (negative) {
            ++width;
        }
        final Segment tail = this.writableSegment(width);
        final byte[] data = tail.data;
        int pos = tail.limit + width;
        while (v != 0L) {
            final int digit = (int)(v % 10L);
            data[--pos] = Buffer.DIGITS[digit];
            v /= 10L;
        }
        if (negative) {
            data[--pos] = 45;
        }
        final Segment segment = tail;
        segment.limit += width;
        this.size += width;
        return this;
    }
    
    @Override
    public Buffer writeHexadecimalUnsignedLong(long v) {
        if (v == 0L) {
            return this.writeByte(48);
        }
        final int width = Long.numberOfTrailingZeros(Long.highestOneBit(v)) / 4 + 1;
        final Segment tail = this.writableSegment(width);
        final byte[] data = tail.data;
        for (int pos = tail.limit + width - 1, start = tail.limit; pos >= start; --pos) {
            data[pos] = Buffer.DIGITS[(int)(v & 0xFL)];
            v >>>= 4;
        }
        final Segment segment = tail;
        segment.limit += width;
        this.size += width;
        return this;
    }
    
    Segment writableSegment(final int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.head == null) {
            this.head = SegmentPool.take();
            final Segment head = this.head;
            final Segment head2 = this.head;
            final Segment head3 = this.head;
            head2.prev = head3;
            return head.next = head3;
        }
        Segment tail = this.head.prev;
        if (tail.limit + minimumCapacity > 8192 || !tail.owner) {
            tail = tail.push(SegmentPool.take());
        }
        return tail;
    }
    
    @Override
    public void write(final Buffer source, long byteCount) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        Util.checkOffsetAndCount(source.size, 0L, byteCount);
        while (byteCount > 0L) {
            if (byteCount < source.head.limit - source.head.pos) {
                final Segment tail = (this.head != null) ? this.head.prev : null;
                if (tail != null && tail.owner && byteCount + tail.limit - (tail.shared ? 0 : tail.pos) <= 8192L) {
                    source.head.writeTo(tail, (int)byteCount);
                    source.size -= byteCount;
                    this.size += byteCount;
                    return;
                }
                source.head = source.head.split((int)byteCount);
            }
            final Segment segmentToMove = source.head;
            final long movedByteCount = segmentToMove.limit - segmentToMove.pos;
            source.head = segmentToMove.pop();
            if (this.head == null) {
                this.head = segmentToMove;
                final Segment head = this.head;
                final Segment head2 = this.head;
                final Segment head3 = this.head;
                head2.prev = head3;
                head.next = head3;
            }
            else {
                Segment tail2 = this.head.prev;
                tail2 = tail2.push(segmentToMove);
                tail2.compact();
            }
            source.size -= movedByteCount;
            this.size += movedByteCount;
            byteCount -= movedByteCount;
        }
    }
    
    @Override
    public long read(final Buffer sink, long byteCount) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (byteCount < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + byteCount);
        }
        if (this.size == 0L) {
            return -1L;
        }
        if (byteCount > this.size) {
            byteCount = this.size;
        }
        sink.write(this, byteCount);
        return byteCount;
    }
    
    @Override
    public long indexOf$132bdb() {
        return this.indexOf((byte)0, 0L, Long.MAX_VALUE);
    }
    
    public long indexOf(final byte b, long fromIndex, long toIndex) {
        if (fromIndex < 0L || toIndex < fromIndex) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", this.size, fromIndex, toIndex));
        }
        if (toIndex > this.size) {
            toIndex = this.size;
        }
        if (fromIndex == toIndex) {
            return -1L;
        }
        Segment s = this.head;
        if (s == null) {
            return -1L;
        }
        long offset;
        if (this.size - fromIndex < fromIndex) {
            for (offset = this.size; offset > fromIndex; offset -= s.limit - s.pos) {
                s = s.prev;
            }
        }
        else {
            long nextOffset;
            for (offset = 0L; (nextOffset = offset + (s.limit - s.pos)) < fromIndex; s = s.next, offset = nextOffset) {}
        }
        while (offset < toIndex) {
            final byte[] data = s.data;
            for (int limit = (int)Math.min(s.limit, s.pos + toIndex - offset), pos = (int)(s.pos + fromIndex - offset); pos < limit; ++pos) {
                if (data[pos] == b) {
                    return pos - s.pos + offset;
                }
            }
            offset = (fromIndex = offset + (s.limit - s.pos));
            s = s.next;
        }
        return -1L;
    }
    
    @Override
    public boolean rangeEquals$45b61a70(final ByteString bytes) {
        return this.rangeEquals$4f587030$710da61b(bytes, bytes.size());
    }
    
    public boolean rangeEquals$4f587030$710da61b(final ByteString bytes, final int byteCount) {
        if (0L < 0L || byteCount < 0 || this.size - 0L < byteCount || bytes.size() - 0 < byteCount) {
            return false;
        }
        for (int i = 0; i < byteCount; ++i) {
            if (this.getByte(0L + i) != bytes.getByte(0 + i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public Timeout timeout() {
        return Timeout.NONE;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Buffer)) {
            return false;
        }
        final Buffer that = (Buffer)o;
        if (this.size != that.size) {
            return false;
        }
        if (this.size == 0L) {
            return true;
        }
        Segment sa = this.head;
        Segment sb = that.head;
        int posA = sa.pos;
        int posB = sb.pos;
        long count;
        for (long pos = 0L; pos < this.size; pos += count) {
            count = Math.min(sa.limit - posA, sb.limit - posB);
            for (int i = 0; i < count; ++i) {
                if (sa.data[posA++] != sb.data[posB++]) {
                    return false;
                }
            }
            if (posA == sa.limit) {
                sa = sa.next;
                posA = sa.pos;
            }
            if (posB == sb.limit) {
                sb = sb.next;
                posB = sb.pos;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        Segment s = this.head;
        if (s == null) {
            return 0;
        }
        int result = 1;
        do {
            for (int pos = s.pos, limit = s.limit; pos < limit; ++pos) {
                result = 31 * result + s.data[pos];
            }
            s = s.next;
        } while (s != this.head);
        return result;
    }
    
    @Override
    public String toString() {
        return this.snapshot().toString();
    }
    
    public Buffer clone() {
        final Buffer result = new Buffer();
        if (this.size == 0L) {
            return result;
        }
        result.head = new Segment(this.head);
        final Segment head = result.head;
        final Segment head2 = result.head;
        final Segment head3 = result.head;
        head2.prev = head3;
        head.next = head3;
        for (Segment s = this.head.next; s != this.head; s = s.next) {
            result.head.prev.push(new Segment(s));
        }
        result.size = this.size;
        return result;
    }
    
    public ByteString snapshot() {
        if (this.size > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.size);
        }
        return this.snapshot((int)this.size);
    }
    
    public ByteString snapshot(final int byteCount) {
        if (byteCount == 0) {
            return ByteString.EMPTY;
        }
        return new SegmentedByteString(this, byteCount);
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
    
    @Override
    public /* bridge */ BufferedSink emitCompleteSegments() throws IOException {
        return this.emitCompleteSegments();
    }
    
    @Override
    public /* bridge */ BufferedSink writeHexadecimalUnsignedLong(final long v) throws IOException {
        return this.writeHexadecimalUnsignedLong(v);
    }
    
    @Override
    public /* bridge */ BufferedSink writeDecimalLong(final long v) throws IOException {
        return this.writeDecimalLong(v);
    }
    
    @Override
    public /* bridge */ BufferedSink writeInt(final int i) throws IOException {
        return this.writeInt(i);
    }
    
    @Override
    public /* bridge */ BufferedSink writeShort(final int s) throws IOException {
        return this.writeShort(s);
    }
    
    @Override
    public /* bridge */ BufferedSink writeByte(final int b) throws IOException {
        return this.writeByte(b);
    }
    
    @Override
    public /* bridge */ BufferedSink writeUtf8(final String string) throws IOException {
        return this.writeUtf8(string);
    }
    
    @Override
    public /* bridge */ BufferedSink write(final byte[] source, final int offset, final int byteCount) throws IOException {
        return this.write(source, offset, byteCount);
    }
    
    @Override
    public /* bridge */ BufferedSink write(final byte[] source) throws IOException {
        return this.write(source);
    }
    
    @Override
    public /* bridge */ BufferedSink write(final ByteString byteString) throws IOException {
        return this.write(byteString);
    }
    
    static {
        DIGITS = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    }
}
