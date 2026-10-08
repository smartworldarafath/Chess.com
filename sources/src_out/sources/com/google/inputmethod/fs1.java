package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0014\u001a\u00020\u00122\u001a\u0010\u0011\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f\"\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u0017\u001a\u00020\u00122\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "Lcom/google/android/bxb;", "policy", "Lkotlin/Function0;", "defaultFactory", "Lcom/google/android/ks9;", "g", "(Lcom/google/android/bxb;Lkotlin/jvm/functions/Function0;)Lcom/google/android/ks9;", "j", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/ks9;", "Lkotlin/Function1;", "Lcom/google/android/as1;", "defaultComputation", "i", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/ks9;", "", "Lcom/google/android/os9;", "values", "", "content", "d", "([Lcom/google/android/os9;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "value", "c", "(Lcom/google/android/os9;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class fs1 {
    public static final void c(final os9<?> os9Var, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        d dVarF = dVar.F(-149765515);
        if (e.k()) {
            e.o(-149765515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:425)");
        }
        dVarF.r(os9Var);
        function2.invoke(dVarF, Integer.valueOf((i >> 3) & 14));
        dVarF.l();
        if (e.k()) {
            e.n();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.ds1
                public final Object invoke(Object obj, Object obj2) {
                    return fs1.f(os9Var, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void d(final os9<?>[] os9VarArr, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        d dVarF = dVar.F(415205898);
        if (e.k()) {
            e.o(415205898, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:405)");
        }
        dVarF.i(os9VarArr);
        function2.invoke(dVarF, Integer.valueOf((i >> 3) & 14));
        dVarF.X();
        if (e.k()) {
            e.n();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.es1
                public final Object invoke(Object obj, Object obj2) {
                    return fs1.e(os9VarArr, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(os9[] os9VarArr, Function2 function2, int i, d dVar, int i2) {
        d(os9VarArr, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(os9 os9Var, Function2 function2, int i, d dVar, int i2) {
        c(os9Var, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final <T> ks9<T> g(bxb<T> bxbVar, Function0<? extends T> function0) {
        return new el3(bxbVar, function0);
    }

    public static /* synthetic */ ks9 h(bxb bxbVar, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            bxbVar = p0.t();
        }
        return g(bxbVar, function0);
    }

    public static final <T> ks9<T> i(Function1<? super as1, ? extends T> function1) {
        return new us1(function1);
    }

    public static final <T> ks9<T> j(Function0<? extends T> function0) {
        return new b8c(function0);
    }
}
