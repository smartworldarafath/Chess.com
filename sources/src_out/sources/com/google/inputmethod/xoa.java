package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0015"}, d2 = {"", "bounded", "Lcom/google/android/ff3;", "radius", "Lcom/google/android/ei1;", "color", "Lcom/google/android/av5;", "d", "(ZFJ)Lcom/google/android/av5;", "Lcom/google/android/ks9;", "Lcom/google/android/loa;", "a", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "LocalRippleConfiguration", "Lcom/google/android/zoa;", "b", "Lcom/google/android/zoa;", "DefaultBoundedRipple", "DefaultUnboundedRipple", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class xoa {
    private static final ks9<RippleConfiguration> a = fs1.h(null, new Function0() { // from class: com.google.android.uoa
        public final Object invoke() {
            return xoa.b();
        }
    }, 1, null);
    private static final zoa b;
    private static final zoa c;

    static {
        ff3.Companion companion = ff3.INSTANCE;
        float fC = companion.c();
        ei1.Companion companion2 = ei1.INSTANCE;
        b = new zoa(true, fC, companion2.i(), (DefaultConstructorMarker) null);
        c = new zoa(false, companion.c(), companion2.i(), (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleConfiguration b() {
        return new RippleConfiguration(0L, null, 3, null);
    }

    public static final ks9<RippleConfiguration> c() {
        return a;
    }

    public static final av5 d(boolean z, float f, long j) {
        if (ff3.k(f, ff3.INSTANCE.c()) && ei1.r(j, ei1.INSTANCE.i())) {
            return z ? b : c;
        }
        return new zoa(z, f, j, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ av5 e(boolean z, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = ff3.INSTANCE.c();
        }
        if ((i & 4) != 0) {
            j = ei1.INSTANCE.i();
        }
        return d(z, f, j);
    }
}
