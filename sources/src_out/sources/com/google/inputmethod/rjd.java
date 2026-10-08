package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/google/android/rjd;", "T", "Lcom/google/android/kk3;", "", "durationMillis", "delay", "Lcom/google/android/vl3;", "easing", "<init>", "(IILcom/google/android/vl3;)V", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "converter", "Lcom/google/android/r3e;", "h", "(Lcom/google/android/tjd;)Lcom/google/android/r3e;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "g", "b", "f", "c", "Lcom/google/android/vl3;", "getEasing", "()Lcom/google/android/vl3;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rjd<T> implements kk3<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int delay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final vl3 easing;

    public rjd() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(Object other) {
        if (other instanceof rjd) {
            rjd rjdVar = (rjd) other;
            if (rjdVar.durationMillis == this.durationMillis && rjdVar.delay == this.delay && Intrinsics.e(rjdVar.easing, this.easing)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // com.google.inputmethod.xa4, com.google.inputmethod.kr
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public <V extends ur> r3e<V> a(tjd<T, V> converter) {
        return new r3e<>(this.durationMillis, this.delay, this.easing);
    }

    public int hashCode() {
        return (((this.durationMillis * 31) + this.easing.hashCode()) * 31) + this.delay;
    }

    public rjd(int i, int i2, vl3 vl3Var) {
        this.durationMillis = i;
        this.delay = i2;
        this.easing = vl3Var;
    }

    public /* synthetic */ rjd(int i, int i2, vl3 vl3Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 300 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? em3.d() : vl3Var);
    }
}
