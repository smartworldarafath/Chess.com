package com.google.inputmethod;

import androidx.compose.ui.graphics.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.b4b, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/android/b4b;", "", "", "scale", "Landroidx/compose/ui/graphics/t;", "transformOrigin", "Lcom/google/android/xa4;", "animationSpec", "<init>", "(FJLcom/google/android/xa4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "J", "c", "()J", "Lcom/google/android/xa4;", "()Lcom/google/android/xa4;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Scale {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float scale;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long transformOrigin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final xa4<Float> animationSpec;

    public /* synthetic */ Scale(float f, long j, xa4 xa4Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, xa4Var);
    }

    public final xa4<Float> a() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) other;
        return Float.compare(this.scale, scale.scale) == 0 && t.e(this.transformOrigin, scale.transformOrigin) && Intrinsics.e(this.animationSpec, scale.animationSpec);
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + t.h(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) t.i(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }

    private Scale(float f, long j, xa4<Float> xa4Var) {
        this.scale = f;
        this.transformOrigin = j;
        this.animationSpec = xa4Var;
    }
}
