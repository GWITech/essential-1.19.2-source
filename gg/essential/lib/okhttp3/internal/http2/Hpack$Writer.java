package gg.essential.lib.okhttp3.internal.http2;

import java.util.*;
import gg.essential.lib.okhttp3.internal.*;
import java.io.*;
import gg.essential.lib.okio.*;

static final class Writer
{
    private final Buffer out;
    private int smallestHeaderTableSizeSetting;
    private boolean emitDynamicTableSizeUpdate;
    int maxDynamicTableByteCount;
    Header[] dynamicTable;
    int nextHeaderIndex;
    int headerCount;
    int dynamicTableByteCount;
    
    Writer(final Buffer out) {
        this(out, (byte)0);
    }
    
    Writer(final Buffer out, final byte b) {
        super();
        this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
        this.dynamicTable = new Header[8];
        this.nextHeaderIndex = this.dynamicTable.length - 1;
        this.headerCount = 0;
        this.dynamicTableByteCount = 0;
        this.maxDynamicTableByteCount = 4096;
        this.out = out;
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
            Arrays.fill(this.dynamicTable, this.nextHeaderIndex + 1, this.nextHeaderIndex + 1 + entriesToEvict, null);
            this.nextHeaderIndex += entriesToEvict;
        }
        return entriesToEvict;
    }
    
    private void insertIntoDynamicTable(final Header entry) {
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
    
    void writeHeaders(final List<Header> headerBlock) throws IOException {
        if (this.emitDynamicTableSizeUpdate) {
            if (this.smallestHeaderTableSizeSetting < this.maxDynamicTableByteCount) {
                this.writeInt(this.smallestHeaderTableSizeSetting, 31, 32);
            }
            this.emitDynamicTableSizeUpdate = false;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.writeInt(this.maxDynamicTableByteCount, 31, 32);
        }
        for (int i = 0, size = headerBlock.size(); i < size; ++i) {
            final Header header = headerBlock.get(i);
            final ByteString name = header.name.toAsciiLowercase();
            final ByteString value = header.value;
            int headerIndex = -1;
            int headerNameIndex = -1;
            final Integer staticIndex = Hpack.NAME_TO_FIRST_INDEX.get(name);
            if (staticIndex != null) {
                headerNameIndex = staticIndex + 1;
                if (headerNameIndex > 1 && headerNameIndex < 8) {
                    if (Util.equal(Hpack.STATIC_HEADER_TABLE[headerNameIndex - 1].value, value)) {
                        headerIndex = headerNameIndex;
                    }
                    else if (Util.equal(Hpack.STATIC_HEADER_TABLE[headerNameIndex].value, value)) {
                        headerIndex = headerNameIndex + 1;
                    }
                }
            }
            if (headerIndex == -1) {
                for (int j = this.nextHeaderIndex + 1, length = this.dynamicTable.length; j < length; ++j) {
                    if (Util.equal(this.dynamicTable[j].name, name)) {
                        if (Util.equal(this.dynamicTable[j].value, value)) {
                            headerIndex = j - this.nextHeaderIndex + Hpack.STATIC_HEADER_TABLE.length;
                            break;
                        }
                        if (headerNameIndex == -1) {
                            headerNameIndex = j - this.nextHeaderIndex + Hpack.STATIC_HEADER_TABLE.length;
                        }
                    }
                }
            }
            if (headerIndex != -1) {
                this.writeInt(headerIndex, 127, 128);
            }
            else if (headerNameIndex == -1) {
                this.out.writeByte(64);
                this.writeByteString(name);
                this.writeByteString(value);
                this.insertIntoDynamicTable(header);
            }
            else if (name.startsWith(Header.PSEUDO_PREFIX) && !Header.TARGET_AUTHORITY.equals(name)) {
                this.writeInt(headerNameIndex, 15, 0);
                this.writeByteString(value);
            }
            else {
                this.writeInt(headerNameIndex, 63, 64);
                this.writeByteString(value);
                this.insertIntoDynamicTable(header);
            }
        }
    }
    
    void writeInt(int value, final int prefixMask, final int bits) {
        if (value < prefixMask) {
            this.out.writeByte(bits | value);
            return;
        }
        this.out.writeByte(bits | prefixMask);
        int b;
        for (value -= prefixMask; value >= 128; value >>>= 7) {
            b = (value & 0x7F);
            this.out.writeByte(b | 0x80);
        }
        this.out.writeByte(value);
    }
    
    void writeByteString(final ByteString data) throws IOException {
        if (Huffman.get().encodedLength(data) < data.size()) {
            final Buffer huffmanBuffer = new Buffer();
            Huffman.get().encode(data, huffmanBuffer);
            final ByteString huffmanBytes = huffmanBuffer.readByteString();
            this.writeInt(huffmanBytes.size(), 127, 128);
            this.out.write(huffmanBytes);
        }
        else {
            this.writeInt(data.size(), 127, 0);
            this.out.write(data);
        }
    }
    
    void setHeaderTableSizeSetting(final int headerTableSizeSetting) {
        final int effectiveHeaderTableSize = Math.min(headerTableSizeSetting, 16384);
        if (this.maxDynamicTableByteCount == effectiveHeaderTableSize) {
            return;
        }
        if (effectiveHeaderTableSize < this.maxDynamicTableByteCount) {
            this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, effectiveHeaderTableSize);
        }
        this.emitDynamicTableSizeUpdate = true;
        this.maxDynamicTableByteCount = effectiveHeaderTableSize;
        this.adjustDynamicTableByteCount();
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
}
