package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/google/android/ks9;", "Lcom/google/android/moa;", "a", "Lcom/google/android/ks9;", "f", "()Lcom/google/android/ks9;", "LocalRippleConfiguration", "Lcom/google/android/apa;", "b", "Lcom/google/android/apa;", "DefaultBoundedRipple", "c", "DefaultUnboundedRipple", "Lcom/google/android/joa;", "d", "Lcom/google/android/joa;", "LightThemeHighContrastRippleAlpha", "e", "LightThemeLowContrastRippleAlpha", "DarkThemeRippleAlpha", "material"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class yoa {
    private static final ks9<RippleConfiguration> a = fs1.h(null, new Function0() { // from class: com.google.android.voa
        public final Object invoke() {
            return yoa.b();
        }
    }, 1, null);
    private static final apa b;
    private static final apa c;
    private static final RippleAlpha d;
    private static final RippleAlpha e;
    private static final RippleAlpha f;

    static {
        ff3.Companion companion = ff3.INSTANCE;
        float fC = companion.c();
        ei1.Companion companion2 = ei1.INSTANCE;
        b = new apa(true, fC, companion2.i(), (DefaultConstructorMarker) null);
        c = new apa(false, companion.c(), companion2.i(), (DefaultConstructorMarker) null);
        d = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        e = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        f = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RippleConfiguration b() {
        return new RippleConfiguration(0L, null, 3, null);
    }

    public static final ks9<RippleConfiguration> f() {
        return a;
    }
}
