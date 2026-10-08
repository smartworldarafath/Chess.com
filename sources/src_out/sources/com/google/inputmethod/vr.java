package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "v1", "Lcom/google/android/qr;", "a", "(F)Lcom/google/android/qr;", "v2", "Lcom/google/android/rr;", "b", "(FF)Lcom/google/android/rr;", "v3", "Lcom/google/android/sr;", "c", "(FFF)Lcom/google/android/sr;", "v4", "Lcom/google/android/tr;", "d", "(FFFF)Lcom/google/android/tr;", "Lcom/google/android/ur;", "T", "g", "(Lcom/google/android/ur;)Lcom/google/android/ur;", "e", "source", "", "f", "(Lcom/google/android/ur;Lcom/google/android/ur;)V", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vr {
    public static final qr a(float f) {
        return new qr(f);
    }

    public static final rr b(float f, float f2) {
        return new rr(f, f2);
    }

    public static final sr c(float f, float f2, float f3) {
        return new sr(f, f2, f3);
    }

    public static final tr d(float f, float f2, float f3, float f4) {
        return new tr(f, f2, f3, f4);
    }

    public static final <T extends ur> T e(T t) {
        T t2 = (T) g(t);
        int size = t2.getSize();
        for (int i = 0; i < size; i++) {
            t2.e(i, t.a(i));
        }
        return t2;
    }

    public static final <T extends ur> void f(T t, T t2) {
        int size = t.getSize();
        for (int i = 0; i < size; i++) {
            t.e(i, t2.a(i));
        }
    }

    public static final <T extends ur> T g(T t) {
        T t2 = (T) t.c();
        Intrinsics.h(t2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t2;
    }
}
