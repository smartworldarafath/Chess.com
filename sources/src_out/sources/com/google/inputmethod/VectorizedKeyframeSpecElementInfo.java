package com.google.inputmethod;

import com.google.inputmethod.ur;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.n3e, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/google/android/n3e;", "Lcom/google/android/ur;", "V", "", "vectorValue", "Lcom/google/android/vl3;", "easing", "Lcom/google/android/e00;", "arcMode", "<init>", "(Lcom/google/android/ur;Lcom/google/android/vl3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/ur;", "c", "()Lcom/google/android/ur;", "b", "Lcom/google/android/vl3;", "()Lcom/google/android/vl3;", "I", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VectorizedKeyframeSpecElementInfo<V extends ur> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final V vectorValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final vl3 easing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int arcMode;

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(ur urVar, vl3 vl3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(urVar, vl3Var, i);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getArcMode() {
        return this.arcMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vl3 getEasing() {
        return this.easing;
    }

    public final V c() {
        return this.vectorValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) other;
        return Intrinsics.e(this.vectorValue, vectorizedKeyframeSpecElementInfo.vectorValue) && Intrinsics.e(this.easing, vectorizedKeyframeSpecElementInfo.easing) && e00.c(this.arcMode, vectorizedKeyframeSpecElementInfo.arcMode);
    }

    public int hashCode() {
        return (((this.vectorValue.hashCode() * 31) + this.easing.hashCode()) * 31) + e00.d(this.arcMode);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.vectorValue + ", easing=" + this.easing + ", arcMode=" + ((Object) e00.e(this.arcMode)) + ')';
    }

    private VectorizedKeyframeSpecElementInfo(V v, vl3 vl3Var, int i) {
        this.vectorValue = v;
        this.easing = vl3Var;
        this.arcMode = i;
    }
}
