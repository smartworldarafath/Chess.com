package androidx.compose.p000animation.core;

import androidx.compose.p000animation.core.AnimateAsStateKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q06;
import com.google.android.yg4;
import com.google.inputmethod.ff3;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.kce;
import com.google.inputmethod.kr;
import com.google.inputmethod.lr;
import com.google.inputmethod.o58;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tjd;
import com.google.inputmethod.tsb;
import com.google.inputmethod.ur;
import com.google.inputmethod.vn3;
import com.google.inputmethod.w2c;
import com.google.inputmethod.w2e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0001\u001a\u00020\u00102\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0013\"\b\b\u0001\u0010\u0015*\u00020\u00142\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001c\"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001c\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001c\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001c¨\u0006/²\u0006 \u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00138\nX\u008a\u0084\u0002²\u0006\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00138\nX\u008a\u0084\u0002"}, d2 = {"", "targetValue", "Lcom/google/android/kr;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "", "finishedListener", "Lcom/google/android/q6c;", "e", "(FLcom/google/android/kr;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "Lcom/google/android/ff3;", "d", "(FLcom/google/android/kr;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "", "f", "(ILcom/google/android/kr;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "T", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "typeConverter", "g", "(Ljava/lang/Object;Lcom/google/android/tjd;Lcom/google/android/kr;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "Lcom/google/android/w2c;", "a", "Lcom/google/android/w2c;", "defaultAnimation", "b", "dpDefaultSpring", "Lcom/google/android/tsb;", "c", "sizeDefaultSpring", "Lcom/google/android/rn8;", "offsetDefaultSpring", "Lcom/google/android/gba;", "rectDefaultSpring", "intDefaultSpring", "Lcom/google/android/g16;", "intOffsetDefaultSpring", "Lcom/google/android/q16;", "h", "intSizeDefaultSpring", "listener", "animSpec", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnimateAsStateKt {
    private static final w2c<Float> a = lr.j(0.0f, 0.0f, null, 7, null);
    private static final w2c<ff3> b = lr.j(0.0f, 0.0f, ff3.e(kce.a(ff3.INSTANCE)), 3, null);
    private static final w2c<tsb> c = lr.j(0.0f, 0.0f, tsb.c(kce.f(tsb.INSTANCE)), 3, null);
    private static final w2c<rn8> d = lr.j(0.0f, 0.0f, rn8.d(kce.e(rn8.INSTANCE)), 3, null);
    private static final w2c<gba> e = lr.j(0.0f, 0.0f, kce.g(gba.INSTANCE), 3, null);
    private static final w2c<Integer> f = lr.j(0.0f, 0.0f, Integer.valueOf(kce.b(q06.a)), 3, null);
    private static final w2c<g16> g = lr.j(0.0f, 0.0f, g16.c(kce.c(g16.INSTANCE)), 3, null);
    private static final w2c<q16> h = lr.j(0.0f, 0.0f, q16.b(kce.d(q16.INSTANCE)), 3, null);

    public static final q6c<ff3> d(float f2, kr<ff3> krVar, String str, Function1<? super ff3, Unit> function1, d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            krVar = b;
        }
        kr<ff3> krVar2 = krVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        Function1<? super ff3, Unit> function2 = function1;
        if (e.k()) {
            e.o(-1407150062, i, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:123)");
        }
        int i3 = i << 6;
        q6c<ff3> q6cVarG = g(ff3.e(f2), w2e.L(ff3.INSTANCE), krVar2, null, str2, function2, dVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }

    public static final q6c<Float> e(float f2, kr<Float> krVar, float f3, String str, Function1<? super Float, Unit> function1, d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            krVar = a;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.01f;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1<? super Float, Unit> function2 = (i2 & 16) != 0 ? null : function1;
        if (e.k()) {
            e.o(668842840, i, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:74)");
        }
        if (krVar == a) {
            dVar.y(1144115775);
            boolean z = (((i & 896) ^ 384) > 256 && dVar.B(f3)) || (i & 384) == 256;
            Object objR = dVar.R();
            if (z || objR == d.INSTANCE.a()) {
                objR = lr.j(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                dVar.L(objR);
            }
            krVar = (w2c) objR;
            dVar.u();
        } else {
            dVar.y(1144225701);
            dVar.u();
        }
        int i3 = i << 3;
        q6c<Float> q6cVarG = g(Float.valueOf(f2), w2e.N(yg4.a), krVar, f3 != 0.01f ? Float.valueOf(f3) : null, str2, function2, dVar, (i & 14) | (57344 & i3) | (i3 & 458752), 0);
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }

    public static final q6c<Integer> f(int i, kr<Integer> krVar, String str, Function1<? super Integer, Unit> function1, d dVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            krVar = f;
        }
        kr<Integer> krVar2 = krVar;
        if ((i3 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1<? super Integer, Unit> function2 = function1;
        if (e.k()) {
            e.o(428074472, i2, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:282)");
        }
        int i4 = i2 << 6;
        q6c<Integer> q6cVarG = g(Integer.valueOf(i), w2e.O(q06.a), krVar2, null, str2, function2, dVar, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }

    public static final <T, V extends ur> q6c<T> g(final T t, tjd<T, V> tjdVar, kr<T> krVar, T t2, String str, Function1<? super T, Unit> function1, d dVar, int i, int i2) {
        kr<T> krVarI;
        h81 h81Var;
        if ((i2 & 4) != 0) {
            Object objR = dVar.R();
            if (objR == d.INSTANCE.a()) {
                objR = lr.j(0.0f, 0.0f, null, 7, null);
                dVar.L(objR);
            }
            krVarI = (w2c) objR;
        } else {
            krVarI = krVar;
        }
        T t3 = (i2 & 8) != 0 ? null : t2;
        String str2 = (i2 & 16) != 0 ? "ValueAnimation" : str;
        Function1<? super T, Unit> function2 = (i2 & 32) != 0 ? null : function1;
        if (e.k()) {
            e.o(-1994373980, i, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:407)");
        }
        Object objR2 = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR2 == companion.a()) {
            objR2 = s0.e(null, null, 2, null);
            dVar.L(objR2);
        }
        o58 o58Var = (o58) objR2;
        Object objR3 = dVar.R();
        if (objR3 == companion.a()) {
            objR3 = new Animatable(t, tjdVar, t3, str2);
            dVar.L(objR3);
        }
        Animatable animatable = (Animatable) objR3;
        q6c q6cVarR = p0.r(function2, dVar, (i >> 15) & 14);
        if (t3 != null && (krVarI instanceof w2c)) {
            w2c w2cVar = (w2c) krVarI;
            if (!Intrinsics.e(w2cVar.h(), t3)) {
                krVarI = lr.i(w2cVar.getDampingRatio(), w2cVar.getStiffness(), t3);
            }
        }
        q6c q6cVarR2 = p0.r(krVarI, dVar, 0);
        Object objR4 = dVar.R();
        if (objR4 == companion.a()) {
            objR4 = p81.b(-1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
            dVar.L(objR4);
        }
        final h81 h81Var2 = (h81) objR4;
        boolean zT = ((((i & 14) ^ 6) > 4 && dVar.T(t)) || (i & 6) == 4) | dVar.T(h81Var2);
        Object objR5 = dVar.R();
        if (zT || objR5 == companion.a()) {
            objR5 = new Function0() { // from class: com.google.android.qq
                public final Object invoke() {
                    return AnimateAsStateKt.j(h81Var2, t);
                }
            };
            dVar.L(objR5);
        }
        vn3.i((Function0) objR5, dVar, 0);
        boolean zT2 = dVar.T(h81Var2) | dVar.T(animatable) | dVar.x(q6cVarR2) | dVar.x(q6cVarR);
        Object objR6 = dVar.R();
        if (zT2 || objR6 == companion.a()) {
            h81Var = h81Var2;
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(h81Var, animatable, q6cVarR2, q6cVarR, null);
            dVar.L(animateAsStateKt$animateValueAsState$3$1);
            objR6 = animateAsStateKt$animateValueAsState$3$1;
        } else {
            h81Var = h81Var2;
        }
        vn3.g(h81Var, (Function2) objR6, dVar, 0);
        q6c<T> q6cVarG = (q6c) o58Var.getValue();
        if (q6cVarG == null) {
            q6cVarG = animatable.g();
        }
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function1<T, Unit> h(q6c<? extends Function1<? super T, Unit>> q6cVar) {
        return q6cVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> kr<T> i(q6c<? extends kr<T>> q6cVar) {
        return q6cVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(h81 h81Var, Object obj) {
        h81Var.e(obj);
        return Unit.a;
    }
}
