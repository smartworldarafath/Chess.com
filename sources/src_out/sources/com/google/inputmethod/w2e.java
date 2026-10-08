package com.google.inputmethod;

import com.google.android.q06;
import com.google.android.yg4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\b\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\f\" \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\f\" \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\f\" \u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\f\" \u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\f\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006*\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u0006*\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u0006*\u00020/8F¢\u0006\u0006\u001a\u0004\b0\u00101\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0006*\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0006*\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0006*\u0002088F¢\u0006\u0006\u001a\u0004\b\u0000\u00109\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u0006*\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u0006*\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?\"!\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00150\u0006*\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006C"}, d2 = {"T", "Lcom/google/android/ur;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Lcom/google/android/tjd;", "K", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/tjd;", "", "Lcom/google/android/qr;", "a", "Lcom/google/android/tjd;", "FloatToVector", "", "b", "IntToVector", "Lcom/google/android/ff3;", "c", "DpToVector", "Lcom/google/android/if3;", "Lcom/google/android/rr;", "d", "DpOffsetToVector", "Lcom/google/android/tsb;", "e", "SizeToVector", "Lcom/google/android/rn8;", "f", "OffsetToVector", "Lcom/google/android/g16;", "g", "IntOffsetToVector", "Lcom/google/android/q16;", "h", "IntSizeToVector", "Lcom/google/android/gba;", "Lcom/google/android/tr;", "i", "RectToVector", "Lkotlin/Float$Companion;", "N", "(Lcom/google/android/yg4;)Lcom/google/android/tjd;", "VectorConverter", "Lkotlin/Int$Companion;", "O", "(Lcom/google/android/q06;)Lcom/google/android/tjd;", "Lcom/google/android/gba$a;", "S", "(Lcom/google/android/gba$a;)Lcom/google/android/tjd;", "Lcom/google/android/ff3$a;", "L", "(Lcom/google/android/ff3$a;)Lcom/google/android/tjd;", "Lcom/google/android/if3$a;", "M", "(Lcom/google/android/if3$a;)Lcom/google/android/tjd;", "Lcom/google/android/tsb$a;", "(Lcom/google/android/tsb$a;)Lcom/google/android/tjd;", "Lcom/google/android/rn8$a;", "R", "(Lcom/google/android/rn8$a;)Lcom/google/android/tjd;", "Lcom/google/android/g16$a;", "P", "(Lcom/google/android/g16$a;)Lcom/google/android/tjd;", "Lcom/google/android/q16$a;", "Q", "(Lcom/google/android/q16$a;)Lcom/google/android/tjd;", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w2e {
    private static final tjd<Float, qr> a = K(new Function1() { // from class: com.google.android.e2e
        public final Object invoke(Object obj) {
            return w2e.w(((Float) obj).floatValue());
        }
    }, new Function1() { // from class: com.google.android.v2e
        public final Object invoke(Object obj) {
            return Float.valueOf(w2e.x((qr) obj));
        }
    });
    private static final tjd<Integer, qr> b = K(new Function1() { // from class: com.google.android.f2e
        public final Object invoke(Object obj) {
            return w2e.C(((Integer) obj).intValue());
        }
    }, new Function1() { // from class: com.google.android.g2e
        public final Object invoke(Object obj) {
            return Integer.valueOf(w2e.D((qr) obj));
        }
    });
    private static final tjd<ff3, qr> c = K(new Function1() { // from class: com.google.android.h2e
        public final Object invoke(Object obj) {
            return w2e.u((ff3) obj);
        }
    }, new Function1() { // from class: com.google.android.i2e
        public final Object invoke(Object obj) {
            return w2e.v((qr) obj);
        }
    });
    private static final tjd<if3, rr> d = K(new Function1() { // from class: com.google.android.j2e
        public final Object invoke(Object obj) {
            return w2e.s((if3) obj);
        }
    }, new Function1() { // from class: com.google.android.k2e
        public final Object invoke(Object obj) {
            return w2e.t((rr) obj);
        }
    });
    private static final tjd<tsb, rr> e = K(new Function1() { // from class: com.google.android.l2e
        public final Object invoke(Object obj) {
            return w2e.I((tsb) obj);
        }
    }, new Function1() { // from class: com.google.android.m2e
        public final Object invoke(Object obj) {
            return w2e.J((rr) obj);
        }
    });
    private static final tjd<rn8, rr> f = K(new Function1() { // from class: com.google.android.n2e
        public final Object invoke(Object obj) {
            return w2e.E((rn8) obj);
        }
    }, new Function1() { // from class: com.google.android.o2e
        public final Object invoke(Object obj) {
            return w2e.F((rr) obj);
        }
    });
    private static final tjd<g16, rr> g = K(new Function1() { // from class: com.google.android.p2e
        public final Object invoke(Object obj) {
            return w2e.y((g16) obj);
        }
    }, new Function1() { // from class: com.google.android.q2e
        public final Object invoke(Object obj) {
            return w2e.z((rr) obj);
        }
    });
    private static final tjd<q16, rr> h = K(new Function1() { // from class: com.google.android.r2e
        public final Object invoke(Object obj) {
            return w2e.A((q16) obj);
        }
    }, new Function1() { // from class: com.google.android.s2e
        public final Object invoke(Object obj) {
            return w2e.B((rr) obj);
        }
    });
    private static final tjd<gba, tr> i = K(new Function1() { // from class: com.google.android.t2e
        public final Object invoke(Object obj) {
            return w2e.G((gba) obj);
        }
    }, new Function1() { // from class: com.google.android.u2e
        public final Object invoke(Object obj) {
            return w2e.H((tr) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr A(q16 q16Var) {
        return new rr((int) (q16Var.getPackedValue() >> 32), (int) (q16Var.getPackedValue() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q16 B(rr rrVar) {
        int iRound = Math.round(rrVar.getV1());
        if (iRound < 0) {
            iRound = 0;
        }
        int iRound2 = Math.round(rrVar.getV2());
        return q16.b(q16.c((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qr C(int i2) {
        return new qr(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(qr qrVar) {
        return (int) qrVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr E(rn8 rn8Var) {
        return new rr(Float.intBitsToFloat((int) (rn8Var.getPackedValue() >> 32)), Float.intBitsToFloat((int) (rn8Var.getPackedValue() & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 F(rr rrVar) {
        float v1 = rrVar.getV1();
        float v2 = rrVar.getV2();
        return rn8.d(rn8.e((((long) Float.floatToRawIntBits(v1)) << 32) | (((long) Float.floatToRawIntBits(v2)) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tr G(gba gbaVar) {
        return new tr(gbaVar.getLeft(), gbaVar.getTop(), gbaVar.getRight(), gbaVar.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gba H(tr trVar) {
        return new gba(trVar.getV1(), trVar.getV2(), trVar.getV3(), trVar.getV4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr I(tsb tsbVar) {
        return new rr(Float.intBitsToFloat((int) (tsbVar.getPackedValue() >> 32)), Float.intBitsToFloat((int) (tsbVar.getPackedValue() & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tsb J(rr rrVar) {
        float v1 = rrVar.getV1();
        float v2 = rrVar.getV2();
        return tsb.c(tsb.d((((long) Float.floatToRawIntBits(v1)) << 32) | (((long) Float.floatToRawIntBits(v2)) & 4294967295L)));
    }

    public static final <T, V extends ur> tjd<T, V> K(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function2) {
        return new ujd(function1, function2);
    }

    public static final tjd<ff3, qr> L(ff3.Companion companion) {
        return c;
    }

    public static final tjd<if3, rr> M(if3.Companion companion) {
        return d;
    }

    public static final tjd<Float, qr> N(yg4 yg4Var) {
        return a;
    }

    public static final tjd<Integer, qr> O(q06 q06Var) {
        return b;
    }

    public static final tjd<g16, rr> P(g16.Companion companion) {
        return g;
    }

    public static final tjd<q16, rr> Q(q16.Companion companion) {
        return h;
    }

    public static final tjd<rn8, rr> R(rn8.Companion companion) {
        return f;
    }

    public static final tjd<gba, tr> S(gba.Companion companion) {
        return i;
    }

    public static final tjd<tsb, rr> T(tsb.Companion companion) {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr s(if3 if3Var) {
        return new rr(if3.f(if3Var.getPackedValue()), if3.g(if3Var.getPackedValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final if3 t(rr rrVar) {
        float fI = ff3.i(rrVar.getV1());
        float fI2 = ff3.i(rrVar.getV2());
        return if3.b(if3.c((((long) Float.floatToRawIntBits(fI)) << 32) | (((long) Float.floatToRawIntBits(fI2)) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qr u(ff3 ff3Var) {
        return new qr(ff3Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff3 v(qr qrVar) {
        return ff3.e(ff3.i(qrVar.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qr w(float f2) {
        return new qr(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float x(qr qrVar) {
        return qrVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr y(g16 g16Var) {
        return new rr(g16.k(g16Var.getPackedValue()), g16.l(g16Var.getPackedValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g16 z(rr rrVar) {
        return g16.c(g16.f((((long) Math.round(rrVar.getV1())) << 32) | (((long) Math.round(rrVar.getV2())) & 4294967295L)));
    }
}
