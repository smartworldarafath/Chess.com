package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001ac\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\" \u0010\u0011\u001a\u00020\u000e*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"T", "Lcom/google/android/ur;", "V", "Lcom/google/android/kr;", "animationSpec", "Lcom/google/android/tjd;", "typeConverter", "initialValue", "targetValue", "initialVelocity", "Lcom/google/android/lmc;", "a", "(Lcom/google/android/kr;Lcom/google/android/tjd;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/lmc;", "Lcom/google/android/zq;", "", "b", "(Lcom/google/android/zq;)J", "durationMillis", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hr {
    public static final <T, V extends ur> lmc<T, V> a(kr<T> krVar, tjd<T, V> tjdVar, T t, T t2, T t3) {
        return new lmc<>(krVar, tjdVar, t, t2, (ur) tjdVar.a().invoke(t3));
    }

    public static final long b(zq<?, ?> zqVar) {
        return zqVar.getDurationNanos() / 1000000;
    }
}
