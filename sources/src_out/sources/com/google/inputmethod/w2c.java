package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/google/android/w2c;", "T", "Lcom/google/android/xa4;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "converter", "Lcom/google/android/q3e;", "i", "(Lcom/google/android/tjd;)Lcom/google/android/q3e;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "f", "()F", "b", "g", "c", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w2c<T> implements xa4<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float stiffness;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final T visibilityThreshold;

    public w2c() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(Object other) {
        if (other instanceof w2c) {
            w2c w2cVar = (w2c) other;
            if (w2cVar.dampingRatio == this.dampingRatio && w2cVar.stiffness == this.stiffness && Intrinsics.e(w2cVar.visibilityThreshold, this.visibilityThreshold)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }

    public final T h() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t = this.visibilityThreshold;
        return ((((t != null ? t.hashCode() : 0) * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }

    @Override // com.google.inputmethod.xa4, com.google.inputmethod.kr
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends ur> q3e<V> a(tjd<T, V> converter) {
        return new q3e<>(this.dampingRatio, this.stiffness, lr.b(converter, this.visibilityThreshold));
    }

    public w2c(float f, float f2, T t) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = t;
    }

    public /* synthetic */ w2c(float f, float f2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
