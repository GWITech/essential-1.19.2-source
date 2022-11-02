package gg.essential.lib.okhttp3.internal.http2;

private static final class Node
{
    final Node[] children;
    final int symbol;
    final int terminalBits;
    
    Node() {
        super();
        this.children = new Node[256];
        this.symbol = 0;
        this.terminalBits = 0;
    }
    
    Node(final int symbol, final int bits) {
        super();
        this.children = null;
        this.symbol = symbol;
        final int b = bits & 0x7;
        this.terminalBits = ((b == 0) ? 8 : b);
    }
}
