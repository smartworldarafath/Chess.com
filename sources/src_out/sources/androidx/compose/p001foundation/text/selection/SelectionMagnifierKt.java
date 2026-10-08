package androidx.compose.p001foundation.text.selection;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p001foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.b;
import com.google.android.ps4;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rn8;
import com.google.inputmethod.rr;
import com.google.inputmethod.tjd;
import com.google.inputmethod.vn3;
import com.google.inputmethod.w2c;
import com.google.inputmethod.w2e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#²\u0006\f\u0010!\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function0;", "Lcom/google/android/rn8;", "magnifierCenter", "Lkotlin/Function1;", "platformMagnifier", "h", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/b;", "targetCalculation", "Lcom/google/android/q6c;", "m", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "Lcom/google/android/rr;", "a", "Lcom/google/android/rr;", "UnspecifiedAnimationVector2D", "Lcom/google/android/tjd;", "b", "Lcom/google/android/tjd;", "getUnspecifiedSafeOffsetVectorConverter", "()Lcom/google/android/tjd;", "UnspecifiedSafeOffsetVectorConverter", "c", "J", "getOffsetDisplacementThreshold", "()J", "OffsetDisplacementThreshold", "Lcom/google/android/w2c;", "d", "Lcom/google/android/w2c;", "l", "()Lcom/google/android/w2c;", "MagnifierSpringSpec", "animatedCenter", "targetValue", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SelectionMagnifierKt {
    private static final rr a = new rr(Float.NaN, Float.NaN);
    private static final tjd<rn8, rr> b = w2e.K(new Function1() { // from class: com.google.android.jeb
        public final Object invoke(Object obj) {
            return SelectionMagnifierKt.e((rn8) obj);
        }
    }, new Function1() { // from class: com.google.android.keb
        public final Object invoke(Object obj) {
            return SelectionMagnifierKt.f((rr) obj);
        }
    });
    private static final long c;
    private static final w2c<rn8> d;

    static {
        long jE = rn8.e((((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L));
        c = jE;
        d = new w2c<>(0.0f, 0.0f, rn8.d(jE), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rr e(rn8 rn8Var) {
        return (rn8Var.getPackedValue() & 9223372034707292159L) != 9205357640488583168L ? new rr(Float.intBitsToFloat((int) (rn8Var.getPackedValue() >> 32)), Float.intBitsToFloat((int) (rn8Var.getPackedValue() & 4294967295L))) : a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 f(rr rrVar) {
        float v1 = rrVar.getV1();
        float v2 = rrVar.getV2();
        return rn8.d(rn8.e((((long) Float.floatToRawIntBits(v1)) << 32) | (((long) Float.floatToRawIntBits(v2)) & 4294967295L)));
    }

    public static final b h(b bVar, final Function0<rn8> function0, final Function1<? super Function0<rn8>, ? extends b> function1) {
        return ComposedModifierKt.c(bVar, null, new ps4() { // from class: com.google.android.leb
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SelectionMagnifierKt.i(function0, function1, (b) obj, (d) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b i(Function0 function0, Function1 function1, b bVar, d dVar, int i) {
        dVar.y(759876635);
        if (e.k()) {
            e.o(759876635, i, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
        }
        final q6c<rn8> q6cVarM = m(function0, dVar, 0);
        boolean zX = dVar.x(q6cVarM);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new Function0() { // from class: com.google.android.meb
                public final Object invoke() {
                    return SelectionMagnifierKt.k(q6cVarM);
                }
            };
            dVar.L(objR);
        }
        b bVar2 = (b) function1.invoke((Function0) objR);
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return bVar2;
    }

    private static final long j(q6c<rn8> q6cVar) {
        return q6cVar.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 k(q6c q6cVar) {
        return rn8.d(j(q6cVar));
    }

    public static final w2c<rn8> l() {
        return d;
    }

    private static final q6c<rn8> m(Function0<rn8> function0, d dVar, int i) {
        if (e.k()) {
            e.o(-1589795249, i, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:73)");
        }
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = p0.e(function0);
            dVar.L(objR);
        }
        q6c q6cVar = (q6c) objR;
        Object objR2 = dVar.R();
        if (objR2 == companion.a()) {
            Object animatable = new Animatable(rn8.d(n(q6cVar)), b, rn8.d(c), null, 8, null);
            dVar.L(animatable);
            objR2 = animatable;
        }
        Animatable animatable2 = (Animatable) objR2;
        Unit unit = Unit.a;
        boolean zT = dVar.T(animatable2);
        Object objR3 = dVar.R();
        if (zT || objR3 == companion.a()) {
            objR3 = new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(q6cVar, animatable2, null);
            dVar.L(objR3);
        }
        vn3.g(unit, (Function2) objR3, dVar, 6);
        q6c<rn8> q6cVarG = animatable2.g();
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(q6c<rn8> q6cVar) {
        return q6cVar.getValue().getPackedValue();
    }
}
