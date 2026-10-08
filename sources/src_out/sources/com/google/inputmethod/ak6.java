package com.google.inputmethod;

import com.google.inputmethod.wj6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nR,\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8\u0007@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8\u0007@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/google/android/ak6;", "T", "Lcom/google/android/wj6;", "E", "", "<init>", "()V", "Lcom/google/android/vl3;", "easing", "e", "(Lcom/google/android/wj6;Lcom/google/android/vl3;)Lcom/google/android/wj6;", "", "value", "a", "I", "b", "()I", "d", "(I)V", "durationMillis", "setDelayMillis", "delayMillis", "Lcom/google/android/o48;", "c", "Lcom/google/android/o48;", "()Lcom/google/android/o48;", "keyframes", "Lcom/google/android/zj6$b;", "Lcom/google/android/bk6$a;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ak6<T, E extends wj6<T>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int durationMillis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int delayMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o48<E> keyframes;

    public /* synthetic */ ak6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final o48<E> c() {
        return this.keyframes;
    }

    public final void d(int i) {
        this.durationMillis = i;
    }

    public final E e(E e, vl3 vl3Var) {
        e.c(vl3Var);
        return e;
    }

    private ak6() {
        this.durationMillis = 300;
        this.keyframes = f16.c();
    }
}
