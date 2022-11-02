package gg.essential.lib.okhttp3.internal.http2;

import java.io.*;
import java.util.*;
import gg.essential.lib.okio.*;

static final class Reader
{
    private final List<Header> headerList;
    private final BufferedSource source;
    private final int headerTableSizeSetting;
    private int maxDynamicTableByteCount;
    Header[] dynamicTable;
    int nextHeaderIndex;
    int headerCount;
    int dynamicTableByteCount;
    
    Reader(final Source source, final byte b) {
        this(source);
    }
    
    Reader(final Source source) {
        super();
        this.headerList = new ArrayList<Header>();
        this.dynamicTable = new Header[8];
        this.nextHeaderIndex = this.dynamicTable.length - 1;
        this.headerCount = 0;
        this.dynamicTableByteCount = 0;
        this.headerTableSizeSetting = 4096;
        this.maxDynamicTableByteCount = 4096;
        this.source = Okio.buffer(source);
    }
    
    private void adjustDynamicTableByteCount() {
        if (this.maxDynamicTableByteCount < this.dynamicTableByteCount) {
            if (this.maxDynamicTableByteCount == 0) {
                this.clearDynamicTable();
            }
            else {
                this.evictToRecoverBytes(this.dynamicTableByteCount - this.maxDynamicTableByteCount);
            }
        }
    }
    
    private void clearDynamicTable() {
        Arrays.fill(this.dynamicTable, null);
        this.nextHeaderIndex = this.dynamicTable.length - 1;
        this.headerCount = 0;
        this.dynamicTableByteCount = 0;
    }
    
    private int evictToRecoverBytes(int bytesToRecover) {
        int entriesToEvict = 0;
        if (bytesToRecover > 0) {
            for (int j = this.dynamicTable.length - 1; j >= this.nextHeaderIndex && bytesToRecover > 0; bytesToRecover -= this.dynamicTable[j].hpackSize, this.dynamicTableByteCount -= this.dynamicTable[j].hpackSize, --this.headerCount, ++entriesToEvict, --j) {}
            System.arraycopy(this.dynamicTable, this.nextHeaderIndex + 1, this.dynamicTable, this.nextHeaderIndex + 1 + entriesToEvict, this.headerCount);
            this.nextHeaderIndex += entriesToEvict;
        }
        return entriesToEvict;
    }
    
    void readHeaders() throws IOException {
        while (!this.source.exhausted()) {
            final int b = this.source.readByte() & 0xFF;
            if (b == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 0x80) == 0x80) {
                final int index = this.readInt(b, 127);
                this.readIndexedHeader(index - 1);
            }
            else if (b == 64) {
                this.readLiteralHeaderWithIncrementalIndexingNewName();
            }
            else if ((b & 0x40) == 0x40) {
                final int index = this.readInt(b, 63);
                this.readLiteralHeaderWithIncrementalIndexingIndexedName(index - 1);
            }
            else if ((b & 0x20) == 0x20) {
                this.maxDynamicTableByteCount = this.readInt(b, 31);
                if (this.maxDynamicTableByteCount < 0 || this.maxDynamicTableByteCount > 4096) {
                    throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                }
                this.adjustDynamicTableByteCount();
            }
            else if (b == 16 || b == 0) {
                this.readLiteralHeaderWithoutIndexingNewName();
            }
            else {
                final int index = this.readInt(b, 15);
                this.readLiteralHeaderWithoutIndexingIndexedName(index - 1);
            }
        }
    }
    
    public List<Header> getAndResetHeaderList() {
        final List<Header> result = new ArrayList<Header>(this.headerList);
        this.headerList.clear();
        return result;
    }
    
    private void readIndexedHeader(final int index) throws IOException {
        if (this.isStaticHeader(index)) {
            final Header staticEntry = Hpack.STATIC_HEADER_TABLE[index];
            this.headerList.add(staticEntry);
        }
        else {
            final int dynamicTableIndex = this.dynamicTableIndex(index - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex < 0 || dynamicTableIndex > this.dynamicTable.length - 1) {
                throw new IOException("Header index too large " + (index + 1));
            }
            this.headerList.add(this.dynamicTable[dynamicTableIndex]);
        }
    }
    
    private int dynamicTableIndex(final int index) {
        return this.nextHeaderIndex + 1 + index;
    }
    
    private void readLiteralHeaderWithoutIndexingIndexedName(final int index) throws IOException {
        final ByteString name = this.getName(index);
        final ByteString value = this.readByteString();
        this.headerList.add(new Header(name, value));
    }
    
    private void readLiteralHeaderWithoutIndexingNewName() throws IOException {
        final ByteString name = Hpack.checkLowercase(this.readByteString());
        final ByteString value = this.readByteString();
        this.headerList.add(new Header(name, value));
    }
    
    private void readLiteralHeaderWithIncrementalIndexingIndexedName(final int nameIndex) throws IOException {
        final ByteString name = this.getName(nameIndex);
        final ByteString value = this.readByteString();
        this.insertIntoDynamicTable$459e6471(new Header(name, value));
    }
    
    private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
        final ByteString name = Hpack.checkLowercase(this.readByteString());
        final ByteString value = this.readByteString();
        this.insertIntoDynamicTable$459e6471(new Header(name, value));
    }
    
    private ByteString getName(final int index) {
        if (this.isStaticHeader(index)) {
            return Hpack.STATIC_HEADER_TABLE[index].name;
        }
        return this.dynamicTable[this.dynamicTableIndex(index - Hpack.STATIC_HEADER_TABLE.length)].name;
    }
    
    private boolean isStaticHeader(final int index) {
        return index >= 0 && index <= Hpack.STATIC_HEADER_TABLE.length - 1;
    }
    
    private void insertIntoDynamicTable$459e6471(final Header entry) {
        this.headerList.add(entry);
        final int delta = entry.hpackSize;
        if (delta > this.maxDynamicTableByteCount) {
            this.clearDynamicTable();
            return;
        }
        final int bytesToRecover = this.dynamicTableByteCount + delta - this.maxDynamicTableByteCount;
        this.evictToRecoverBytes(bytesToRecover);
        if (this.headerCount + 1 > this.dynamicTable.length) {
            final Header[] doubled = new Header[this.dynamicTable.length * 2];
            System.arraycopy(this.dynamicTable, 0, doubled, this.dynamicTable.length, this.dynamicTable.length);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.dynamicTable = doubled;
        }
        final int index = this.nextHeaderIndex--;
        this.dynamicTable[index] = entry;
        ++this.headerCount;
        this.dynamicTableByteCount += delta;
    }
    
    private int readByte() throws IOException {
        return this.source.readByte() & 0xFF;
    }
    
    int readInt(final int firstByte, final int prefixMask) throws IOException {
        final int prefix = firstByte & prefixMask;
        if (prefix < prefixMask) {
            return prefix;
        }
        int result = prefixMask;
        int shift = 0;
        int b;
        while (true) {
            b = this.readByte();
            if ((b & 0x80) == 0x0) {
                break;
            }
            result += (b & 0x7F) << shift;
            shift += 7;
        }
        result += b << shift;
        return result;
    }
    
    ByteString readByteString() throws IOException {
        final int firstByte = this.readByte();
        final boolean huffmanDecode = (firstByte & 0x80) == 0x80;
        final int length = this.readInt(firstByte, 127);
        if (huffmanDecode) {
            return ByteString.of(Huffman.get().decode(this.source.readByteArray(length)));
        }
        return this.source.readByteString(length);
    }
}
