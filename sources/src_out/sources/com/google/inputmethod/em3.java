package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/google/android/vl3;", "a", "Lcom/google/android/vl3;", "d", "()Lcom/google/android/vl3;", "FastOutSlowInEasing", "b", "f", "LinearOutSlowInEasing", "c", "FastOutLinearInEasing", "e", "LinearEasing", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class em3 {
    private static final vl3 a = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    private static final vl3 b = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);
    private static final vl3 c = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final vl3 d = new vl3() { // from class: com.google.android.dm3
        @Override // com.google.inputmethod.vl3
        public final float a(float f) {
            return em3.b(f);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f) {
        return f;
    }

    public static final vl3 c() {
        return c;
    }

    public static final vl3 d() {
        return a;
    }

    public static final vl3 e() {
        return d;
    }

    public static final vl3 f() {
        return b;
    }
}
