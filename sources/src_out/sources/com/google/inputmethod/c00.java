package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/google/android/c00;", "T", "Lcom/google/android/kk3;", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "converter", "Lcom/google/android/i3e;", "a", "(Lcom/google/android/tjd;)Lcom/google/android/i3e;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/android/e00;", "I", "h", "mode", "b", "g", "durationMillis", "c", "f", "delayMillis", "Lcom/google/android/vl3;", "d", "Lcom/google/android/vl3;", "getEasing", "()Lcom/google/android/vl3;", "easing", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c00<T> implements kk3<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int mode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int durationMillis;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int delayMillis;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final vl3 easing;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c00)) {
            return false;
        }
        c00 c00Var = (c00) other;
        if (e00.c(this.mode, c00Var.mode) && this.durationMillis == c00Var.durationMillis && this.delayMillis == c00Var.delayMillis) {
            return Intrinsics.e(this.easing, c00Var.easing);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    public int hashCode() {
        return (((((e00.d(this.mode) * 31) + this.durationMillis) * 31) + this.delayMillis) * 31) + this.easing.hashCode();
    }

    @Override // com.google.inputmethod.xa4, com.google.inputmethod.kr
    public <V extends ur> i3e<V> a(tjd<T, V> converter) {
        return new o3e(y06.c(0, this.durationMillis), f16.a(), this.durationMillis, this.delayMillis, this.easing, this.mode, null);
    }
}
