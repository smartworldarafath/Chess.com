package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\t\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/google/android/qu0;", "brush", "Lcom/google/android/ei1;", "color", "defaultColor", "e", "(Lcom/google/android/qu0;JJ)Lcom/google/android/qu0;", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "LocalAutofillHighlightBrush", "b", "d", "getLocalAutofillHighlightColor$annotations", "()V", "LocalAutofillHighlightColor", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ma0 {
    private static final ks9<qu0> a = fs1.h(null, new Function0() { // from class: com.google.android.la0
        public final Object invoke() {
            return ma0.b();
        }
    }, 1, null);
    private static final ks9<ei1> b = fs1.h(null, a.a, 1, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function0<ei1> {
        public static final a a = new a();

        a() {
        }

        public final long a() {
            return na0.a();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return ei1.l(a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qu0 b() {
        return new SolidColor(na0.a(), null);
    }

    public static final ks9<qu0> c() {
        return a;
    }

    public static final ks9<ei1> d() {
        return b;
    }

    public static final qu0 e(qu0 qu0Var, long j, long j2) {
        return !ei1.r(j, j2) ? new SolidColor(j, null) : qu0Var;
    }
}
