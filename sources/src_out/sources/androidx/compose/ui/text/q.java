package androidx.compose.ui.text;

import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.q;
import com.google.inputmethod.d27;
import com.google.inputmethod.k0b;
import com.google.inputmethod.n0b;
import com.google.inputmethod.o0b;
import com.google.inputmethod.ryc;
import com.google.inputmethod.wi8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004\"$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u00188@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0000*\u00020\u001e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u0000*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/google/android/k0b;", "Landroidx/compose/ui/text/o;", "", "a", "Lcom/google/android/k0b;", "PlatformParagraphStyleSaver", "Landroidx/compose/ui/text/e;", "b", "getEmojiSupportMatchSaver", "()Lcom/google/android/k0b;", "emojiSupportMatchSaver", "Lcom/google/android/d27;", "c", "LineBreakSaver", "Lcom/google/android/ryc;", "d", "TextMotionSaver", "Lcom/google/android/ryc$b;", "e", "TextMotionLinearitySaver", "Landroidx/compose/ui/text/o$a;", "v", "(Landroidx/compose/ui/text/o$a;)Lcom/google/android/k0b;", "Saver", "Landroidx/compose/ui/text/e$a;", "u", "(Landroidx/compose/ui/text/e$a;)Lcom/google/android/k0b;", "Lcom/google/android/d27$a;", "w", "(Lcom/google/android/d27$a;)Lcom/google/android/k0b;", "Lcom/google/android/ryc$a;", "x", "(Lcom/google/android/ryc$a;)Lcom/google/android/k0b;", "Lcom/google/android/ryc$b$a;", "y", "(Lcom/google/android/ryc$b$a;)Lcom/google/android/k0b;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    private static final k0b<PlatformParagraphStyle, Object> a = n0b.e(new Function2() { // from class: com.google.android.z2b
        public final Object invoke(Object obj, Object obj2) {
            return q.m((o0b) obj, (PlatformParagraphStyle) obj2);
        }
    }, new Function1() { // from class: com.google.android.a3b
        public final Object invoke(Object obj) {
            return q.n(obj);
        }
    });
    private static final k0b<e, Object> b = n0b.e(new Function2() { // from class: com.google.android.b3b
        public final Object invoke(Object obj, Object obj2) {
            return q.s((o0b) obj, (e) obj2);
        }
    }, new Function1() { // from class: com.google.android.c3b
        public final Object invoke(Object obj) {
            return q.t(obj);
        }
    });
    private static final k0b<d27, Object> c = n0b.e(new Function2() { // from class: com.google.android.d3b
        public final Object invoke(Object obj, Object obj2) {
            return q.k((o0b) obj, (d27) obj2);
        }
    }, new Function1() { // from class: com.google.android.e3b
        public final Object invoke(Object obj) {
            return q.l(obj);
        }
    });
    private static final k0b<ryc, Object> d = n0b.e(new Function2() { // from class: com.google.android.f3b
        public final Object invoke(Object obj, Object obj2) {
            return q.q((o0b) obj, (ryc) obj2);
        }
    }, new Function1() { // from class: com.google.android.g3b
        public final Object invoke(Object obj) {
            return q.r(obj);
        }
    });
    private static final k0b<ryc.b, Object> e = n0b.e(new Function2() { // from class: com.google.android.h3b
        public final Object invoke(Object obj, Object obj2) {
            return q.o((o0b) obj, (ryc.b) obj2);
        }
    }, new Function1() { // from class: com.google.android.i3b
        public final Object invoke(Object obj) {
            return q.p(obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(o0b o0bVar, d27 d27Var) {
        return Integer.valueOf(d27Var.getMask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d27 l(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return d27.d(d27.e(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(o0b o0bVar, PlatformParagraphStyle platformParagraphStyle) {
        return kotlin.collections.m.i(new Object[]{p.S1(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), p.T1(e.d(platformParagraphStyle.getEmojiSupportMatch()), u(e.INSTANCE), o0bVar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformParagraphStyle n(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        Intrinsics.g(bool);
        boolean zBooleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        k0b<e, Object> k0bVarU = u(e.INSTANCE);
        e eVarB = ((!Intrinsics.e(obj3, Boolean.FALSE) || (k0bVarU instanceof wi8)) && obj3 != null) ? k0bVarU.b(obj3) : null;
        Intrinsics.g(eVarB);
        return new PlatformParagraphStyle(eVarB.getValue(), zBooleanValue, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(o0b o0bVar, ryc.b bVar) {
        return Integer.valueOf(bVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ryc.b p(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return ryc.b.d(ryc.b.e(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(o0b o0bVar, ryc rycVar) {
        return kotlin.collections.m.i(new Object[]{p.T1(ryc.b.d(rycVar.getLinearity()), y(ryc.b.INSTANCE), o0bVar), p.S1(Boolean.valueOf(rycVar.getSubpixelTextPositioning()))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ryc r(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        k0b<ryc.b, Object> k0bVarY = y(ryc.b.INSTANCE);
        ryc.b bVarB = ((!Intrinsics.e(obj2, Boolean.FALSE) || (k0bVarY instanceof wi8)) && obj2 != null) ? k0bVarY.b(obj2) : null;
        Intrinsics.g(bVarB);
        int value = bVarB.getValue();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        Intrinsics.g(bool);
        return new ryc(value, bool.booleanValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object s(o0b o0bVar, e eVar) {
        return Integer.valueOf(eVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e t(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return e.d(e.e(((Integer) obj).intValue()));
    }

    public static final k0b<e, Object> u(e.Companion companion) {
        return b;
    }

    public static final k0b<PlatformParagraphStyle, Object> v(PlatformParagraphStyle.Companion companion) {
        return a;
    }

    public static final k0b<d27, Object> w(d27.Companion companion) {
        return c;
    }

    public static final k0b<ryc, Object> x(ryc.Companion companion) {
        return d;
    }

    private static final k0b<ryc.b, Object> y(ryc.b.Companion companion) {
        return e;
    }
}
