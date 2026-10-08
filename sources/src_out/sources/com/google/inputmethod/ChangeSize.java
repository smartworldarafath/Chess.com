package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.f81, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Lcom/google/android/f81;", "", "Lcom/google/android/tc;", "alignment", "Lkotlin/Function1;", "Lcom/google/android/q16;", "size", "Lcom/google/android/xa4;", "animationSpec", "", "clip", "<init>", "(Lcom/google/android/tc;Lkotlin/jvm/functions/Function1;Lcom/google/android/xa4;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/tc;", "()Lcom/google/android/tc;", "b", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "c", "Lcom/google/android/xa4;", "()Lcom/google/android/xa4;", "Z", "()Z", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ChangeSize {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final tc alignment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final Function1<q16, q16> size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final xa4<q16> animationSpec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean clip;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(tc tcVar, Function1<? super q16, q16> function1, xa4<q16> xa4Var, boolean z) {
        this.alignment = tcVar;
        this.size = function1;
        this.animationSpec = xa4Var;
        this.clip = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final tc getAlignment() {
        return this.alignment;
    }

    public final xa4<q16> b() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final Function1<q16, q16> d() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) other;
        return Intrinsics.e(this.alignment, changeSize.alignment) && Intrinsics.e(this.size, changeSize.size) && Intrinsics.e(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    public int hashCode() {
        return (((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31) + Boolean.hashCode(this.clip);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }
}
