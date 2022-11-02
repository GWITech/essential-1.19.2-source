package gg.essential.lib.kdiscordipc.core.socket.impl;

import kotlin.*;
import java.io.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kdiscordipc.core.socket.*;
import gg.essential.lib.kdiscordipc.core.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0014" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/socket/impl/WindowsSocket;", "Lgg/essential/lib/kdiscordipc/core/socket/Socket;", "()V", "_connected", "", "connected", "getConnected", "()Z", "randomAccessFile", "Ljava/io/RandomAccessFile;", "close", "", "connect", "file", "Ljava/io/File;", "read", "Lgg/essential/lib/kdiscordipc/core/socket/RawPacket;", "write", "bytes", "", "KDiscordIPC" })
public final class WindowsSocket implements Socket
{
    private RandomAccessFile randomAccessFile;
    private boolean _connected;
    
    public WindowsSocket() {
        super();
    }
    
    @Override
    public boolean getConnected() {
        return this._connected;
    }
    
    @Override
    public void connect(@NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)file, "file");
        this.randomAccessFile = new RandomAccessFile(file, "rw");
        this._connected = true;
    }
    
    @Override
    public void close() {
        RandomAccessFile randomAccessFile;
        if ((randomAccessFile = this.randomAccessFile) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("randomAccessFile");
            randomAccessFile = null;
        }
        randomAccessFile.close();
        this._connected = false;
    }
    
    @NotNull
    @Override
    public RawPacket read() {
        while (this._connected) {
            RandomAccessFile randomAccessFile;
            if ((randomAccessFile = this.randomAccessFile) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("randomAccessFile");
                randomAccessFile = null;
            }
            if (randomAccessFile.length() != 0L) {
                break;
            }
            Thread.sleep(50L);
        }
        RandomAccessFile randomAccessFile2;
        if ((randomAccessFile2 = this.randomAccessFile) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("randomAccessFile");
            randomAccessFile2 = null;
        }
        final int opcode = IntegerKt.reverse(randomAccessFile2.readInt());
        RandomAccessFile randomAccessFile3;
        if ((randomAccessFile3 = this.randomAccessFile) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("randomAccessFile");
            randomAccessFile3 = null;
        }
        final int length = IntegerKt.reverse(randomAccessFile3.readInt());
        final byte[] data = new byte[length];
        RandomAccessFile randomAccessFile4;
        if ((randomAccessFile4 = this.randomAccessFile) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("randomAccessFile");
            randomAccessFile4 = null;
        }
        randomAccessFile4.readFully(data);
        return new RawPacket(opcode, length, data);
    }
    
    @Override
    public void write(@NotNull final byte[] bytes) {
        Intrinsics.checkNotNullParameter((Object)bytes, "bytes");
        RandomAccessFile randomAccessFile;
        if ((randomAccessFile = this.randomAccessFile) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("randomAccessFile");
            randomAccessFile = null;
        }
        randomAccessFile.write(bytes);
    }
}
