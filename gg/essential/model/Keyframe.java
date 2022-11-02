package gg.essential.model;

import gg.essential.model.file.*;
import kotlin.*;
import gg.essential.model.molang.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.*;

@Serializable(with = KeyframeSerializer.class)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BI\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001f\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u00c6\u0003J\u001f\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\bH\u00c6\u0003JS\u0010\u0012\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R'\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a" }, d2 = { "Lgg/essential/model/Keyframe;", "", "pre", "Lkotlin/Triple;", "Lgg/essential/model/molang/MolangExpression;", "Lgg/essential/model/MolangVector;", "post", "smooth", "", "(Lkotlin/Triple;Lkotlin/Triple;Z)V", "getPost", "()Lkotlin/Triple;", "getPre", "getSmooth", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "cosmetics" })
public final class Keyframe
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Triple<MolangExpression, MolangExpression, MolangExpression> pre;
    @NotNull
    private final Triple<MolangExpression, MolangExpression, MolangExpression> post;
    private final boolean smooth;
    
    public Keyframe(@NotNull final Triple<? extends MolangExpression, ? extends MolangExpression, ? extends MolangExpression> pre, @NotNull final Triple<? extends MolangExpression, ? extends MolangExpression, ? extends MolangExpression> post, final boolean smooth) {
        Intrinsics.checkNotNullParameter((Object)pre, "pre");
        Intrinsics.checkNotNullParameter((Object)post, "post");
        super();
        this.pre = (Triple<MolangExpression, MolangExpression, MolangExpression>)pre;
        this.post = (Triple<MolangExpression, MolangExpression, MolangExpression>)post;
        this.smooth = smooth;
    }
    
    @NotNull
    public final Triple<MolangExpression, MolangExpression, MolangExpression> getPre() {
        return this.pre;
    }
    
    @NotNull
    public final Triple<MolangExpression, MolangExpression, MolangExpression> getPost() {
        return this.post;
    }
    
    public final boolean getSmooth() {
        return this.smooth;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Keyframe(pre=" + this.pre + ", post=" + this.post + ", smooth=" + this.smooth + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.pre.hashCode();
        result = result * 31 + this.post.hashCode();
        final int n = result * 31;
        int smooth;
        if ((smooth = (this.smooth ? 1 : 0)) != 0) {
            smooth = 1;
        }
        result = n + smooth;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Keyframe)) {
            return false;
        }
        final Keyframe keyframe = (Keyframe)other;
        return Intrinsics.areEqual((Object)this.pre, (Object)keyframe.pre) && Intrinsics.areEqual((Object)this.post, (Object)keyframe.post) && this.smooth == keyframe.smooth;
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/Keyframe$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/Keyframe;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Keyframe> serializer() {
            return (KSerializer<Keyframe>)KeyframeSerializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
