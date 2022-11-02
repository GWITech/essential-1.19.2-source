package gg.essential.handlers.io;

import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.nio.file.*;
import java.util.*;
import net.minecraft.client.*;
import gg.essential.util.*;
import gg.essential.handlers.screenshot.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000X
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\u0018\u001a\u00020\u000e2\u001c\u0010\u0019\u001a\u0018\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bj\u0002`\u000fJ\u001c\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00032
                                                   \u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R*\u0010	\u001a\u001e\u0012\u001a\u0012\u0018\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bj\u0002`\u000f0
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0016\u0010\u0013\u001a
                                                    \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006 """ }, d2 = { "Lgg/essential/handlers/io/DirectoryWatcher;", "", "base", "Ljava/nio/file/Path;", "batchOperationDelay", "", "batchOperationUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/nio/file/Path;JLjava/util/concurrent/TimeUnit;)V", "delayedBatchEventListeners", "", "Lkotlin/Function1;", "", "Lgg/essential/handlers/screenshot/FileSystemEvent;", "", "Lgg/essential/handlers/io/FileSystemEventListConsumer;", "filesystemOperations", "updateThread", "Ljava/lang/Thread;", "watchService", "Ljava/nio/file/WatchService;", "kotlin.jvm.PlatformType", "workerIds", "", "onBatchUpdate", "event", "processEvent", "path", "kind", "Ljava/nio/file/WatchEvent$Kind;", "processEvents", "scheduleOperationDrainer", "essential" })
public final class DirectoryWatcher
{
    @NotNull
    private final Path base;
    @NotNull
    private final TimeUnit batchOperationUnit;
    private final WatchService watchService;
    private int workerIds;
    @NotNull
    private final List<FileSystemEvent> filesystemOperations;
    @NotNull
    private final List<Function1<List<FileSystemEvent>, Unit>> delayedBatchEventListeners;
    @NotNull
    private final Thread updateThread;
    
    public DirectoryWatcher(@NotNull final Path base, @NotNull final TimeUnit batchOperationUnit) {
        Intrinsics.checkNotNullParameter((Object)base, "base");
        Intrinsics.checkNotNullParameter((Object)batchOperationUnit, "batchOperationUnit");
        super();
        this.base = base;
        this.batchOperationUnit = batchOperationUnit;
        this.watchService = this.base.getFileSystem().newWatchService();
        this.filesystemOperations = new ArrayList<FileSystemEvent>();
        this.delayedBatchEventListeners = new ArrayList<Function1<List<FileSystemEvent>, Unit>>();
        (this.updateThread = new Thread(DirectoryWatcher::updateThread$lambda-0, "essential-watch-service-" + this.base.getFileName())).start();
        this.base.register(this.watchService, (WatchEvent.Kind<?>[])new WatchEvent.Kind[] { (WatchEvent.Kind)StandardWatchEventKinds.ENTRY_CREATE, (WatchEvent.Kind)StandardWatchEventKinds.ENTRY_MODIFY, (WatchEvent.Kind)StandardWatchEventKinds.ENTRY_DELETE });
    }
    
    private final void processEvents() {
    Block_1:
        while (true) {
            final WatchKey key = this.watchService.take();
            for (final WatchEvent event : key.pollEvents()) {
                final WatchEvent.Kind kind = (WatchEvent.Kind)event.kind();
                final Path context = event.context();
                if (context == null) {
                    break Block_1;
                }
                final Path name = context;
                final Path path = this.base.resolve(name);
                Intrinsics.checkNotNullExpressionValue((Object)path, "path");
                final Path path2 = path;
                Intrinsics.checkNotNullExpressionValue((Object)kind, "kind");
                this.processEvent(path2, kind);
            }
            key.reset();
        }
        throw new NullPointerException("null cannot be cast to non-null type java.nio.file.Path");
    }
    
    public final void onBatchUpdate(@NotNull final Function1<? super List<FileSystemEvent>, Unit> event) {
        Intrinsics.checkNotNullParameter((Object)event, "event");
        this.delayedBatchEventListeners.add((Function1<List<FileSystemEvent>, Unit>)event);
    }
    
    private final void processEvent(final Path path, final WatchEvent.Kind<?> kind) {
        final MinecraftClient instance = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)instance, "getInstance()");
        ExtensionsKt.getExecutor(instance).execute(DirectoryWatcher::processEvent$lambda-1);
    }
    
    private final void scheduleOperationDrainer() {
        ++this.workerIds;
        final int nextID = this.workerIds;
        Multithreading.schedule(DirectoryWatcher::scheduleOperationDrainer$lambda-4, 1L, this.batchOperationUnit);
    }
    
    private static final void updateThread$lambda-0(final DirectoryWatcher this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.processEvents();
    }
    
    private static final void processEvent$lambda-1(final WatchEvent.Kind $kind, final DirectoryWatcher this$0, final Path $path) {
        Intrinsics.checkNotNullParameter((Object)$kind, "$kind");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$path, "$path");
        if (Intrinsics.areEqual((Object)$kind, (Object)StandardWatchEventKinds.ENTRY_CREATE)) {
            this$0.filesystemOperations.add(new FileSystemEvent($path, FileEventType.CREATE));
        }
        else if (Intrinsics.areEqual((Object)$kind, (Object)StandardWatchEventKinds.ENTRY_DELETE)) {
            this$0.filesystemOperations.add(new FileSystemEvent($path, FileEventType.DELETE));
        }
        else if (Intrinsics.areEqual((Object)$kind, (Object)StandardWatchEventKinds.ENTRY_MODIFY)) {
            this$0.filesystemOperations.add(new FileSystemEvent($path, FileEventType.MODIFY));
        }
        this$0.scheduleOperationDrainer();
    }
    
    private static final void scheduleOperationDrainer$lambda-4$lambda-3(final int $nextID, final DirectoryWatcher this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        if ($nextID != this$0.workerIds) {
            return;
        }
        final List list = CollectionsKt.toList((Iterable)this$0.filesystemOperations);
        this$0.filesystemOperations.clear();
        final Iterable $this$forEach$iv = this$0.delayedBatchEventListeners;
        for (final Object element$iv : $this$forEach$iv) {
            final Function1 it = (Function1)element$iv;
            it.invoke((Object)list);
        }
    }
    
    private static final void scheduleOperationDrainer$lambda-4(final int $nextID, final DirectoryWatcher this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        final MinecraftClient instance = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue((Object)instance, "getInstance()");
        ExtensionsKt.getExecutor(instance).execute(DirectoryWatcher::scheduleOperationDrainer$lambda-4$lambda-3);
    }
}
