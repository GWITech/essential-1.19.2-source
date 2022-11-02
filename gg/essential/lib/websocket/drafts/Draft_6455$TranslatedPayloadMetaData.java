package gg.essential.lib.websocket.drafts;

private class TranslatedPayloadMetaData
{
    private int payloadLength;
    private int realPackageSize;
    
    private int getPayloadLength() {
        return this.payloadLength;
    }
    
    private int getRealPackageSize() {
        return this.realPackageSize;
    }
    
    TranslatedPayloadMetaData(final int newPayloadLength, final int newRealPackageSize) {
        super();
        this.payloadLength = newPayloadLength;
        this.realPackageSize = newRealPackageSize;
    }
    
    static /* synthetic */ int access$000(final TranslatedPayloadMetaData x0) {
        return x0.getPayloadLength();
    }
    
    static /* synthetic */ int access$100(final TranslatedPayloadMetaData x0) {
        return x0.getRealPackageSize();
    }
}
