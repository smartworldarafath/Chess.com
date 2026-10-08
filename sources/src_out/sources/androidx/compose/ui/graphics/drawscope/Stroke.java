package androidx.compose.ui.graphics.drawscope;

import com.google.inputmethod.f39;
import com.google.inputmethod.wbc;
import com.google.inputmethod.ybc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.d, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Landroidx/compose/ui/graphics/drawscope/b;", "", "width", "miter", "Lcom/google/android/wbc;", "cap", "Lcom/google/android/ybc;", "join", "Lcom/google/android/f39;", "pathEffect", "<init>", "(FFIILcom/google/android/f39;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "F", "f", "()F", "c", "d", "I", "e", "Lcom/google/android/f39;", "()Lcom/google/android/f39;", "g", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Stroke extends b {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int h = 8;
    private static final int i = wbc.INSTANCE.a();
    private static final int j = ybc.INSTANCE.b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float miter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int cap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int join;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final f39 pathEffect;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d$a;", "", "<init>", "()V", "Lcom/google/android/wbc;", "DefaultCap", "I", "a", "()I", "", "HairlineWidth", "F", "DefaultMiter", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Stroke.i;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Stroke(float f, float f2, int i2, int i3, f39 f39Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i2, i3, f39Var);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCap() {
        return this.cap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getJoin() {
        return this.join;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMiter() {
        return this.miter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f39 getPathEffect() {
        return this.pathEffect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        return this.width == stroke.width && this.miter == stroke.miter && wbc.e(this.cap, stroke.cap) && ybc.e(this.join, stroke.join) && Intrinsics.e(this.pathEffect, stroke.pathEffect);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + wbc.f(this.cap)) * 31) + ybc.f(this.join)) * 31;
        f39 f39Var = this.pathEffect;
        return iHashCode + (f39Var != null ? f39Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) wbc.g(this.cap)) + ", join=" + ((Object) ybc.g(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    private Stroke(float f, float f2, int i2, int i3, f39 f39Var) {
        super(null);
        this.width = f;
        this.miter = f2;
        this.cap = i2;
        this.join = i3;
        this.pathEffect = f39Var;
    }

    public /* synthetic */ Stroke(float f, float f2, int i2, int i3, f39 f39Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0.0f : f, (i4 & 2) != 0 ? 4.0f : f2, (i4 & 4) != 0 ? i : i2, (i4 & 8) != 0 ? j : i3, (i4 & 16) != 0 ? null : f39Var, null);
    }
}
