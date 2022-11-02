package gg.essential.universal;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007J'\u0010	\u001a\u0002H
                                                   "\u0004\b\u0000\u0010
                                                   2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H
                                                   0\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u000f""" }, d2 = { "Lgg/essential/universal/UMatrixStack$Compat;", "", "()V", "DEPRECATED", "", "stack", "", "Lgg/essential/universal/UMatrixStack;", "get", "runLegacyMethod", "R", "matrixStack", "block", "Lkotlin/Function0;", "(Lgg/essential/universal/UMatrixStack;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "universalcraft" })
public static final class Compat
{
    @NotNull
    public static final Compat INSTANCE;
    @NotNull
    public static final String DEPRECATED = """
                                            For 1.17 this method requires you pass a UMatrixStack as the first argument.
                                            
                                            If you are currently extending this method, you should instead extend the method with the added argument.
                                            Note however for this to be non-breaking, your parent class needs to transition before you do.
                                            
                                            If you are calling this method and you cannot guarantee that your target class has been fully updated (such as when
                                            calling an open method on an open class), you should instead call the method with the "Compat" suffix, which will
                                            call both methods, the new and the deprecated one.
                                            If you are sure that your target class has been updated (such as when calling the super method), you should
                                            (for super calls you must!) instead just call the method with the original name and added argument.""";
    @NotNull
    private static final List<UMatrixStack> stack;
    
    private Compat() {
        super();
    }
    
    public final <R> R runLegacyMethod(@NotNull final UMatrixStack matrixStack, @NotNull final Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)block, "block");
        Compat.stack.add(matrixStack);
        final Object it = block.invoke();
        final int n = 0;
        Compat.stack.remove(CollectionsKt.getLastIndex((List)Compat.stack));
        return (R)it;
    }
    
    @NotNull
    public final UMatrixStack get() {
        UMatrixStack uMatrixStack;
        if ((uMatrixStack = (UMatrixStack)CollectionsKt.lastOrNull((List)Compat.stack)) == null) {
            uMatrixStack = new UMatrixStack();
        }
        return uMatrixStack;
    }
    
    static {
        INSTANCE = new Compat();
        stack = new ArrayList<UMatrixStack>();
    }
}
