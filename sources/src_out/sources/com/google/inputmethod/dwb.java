package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/google/android/dwb;", "T", "Lcom/google/android/kk3;", "", "delay", "<init>", "(I)V", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "converter", "Lcom/google/android/i3e;", "a", "(Lcom/google/android/tjd;)Lcom/google/android/i3e;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "f", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dwb<T> implements kk3<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int delay;

    public dwb() {
        this(0, 1, null);
    }

    public boolean equals(Object other) {
        return (other instanceof dwb) && ((dwb) other).delay == this.delay;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    public dwb(int i) {
        this.delay = i;
    }

    @Override // com.google.inputmethod.xa4, com.google.inputmethod.kr
    public <V extends ur> i3e<V> a(tjd<T, V> converter) {
        return new p3e(this.delay);
    }

    public /* synthetic */ dwb(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
