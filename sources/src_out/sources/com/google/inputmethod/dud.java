package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\f\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0011\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0011\u0010\rJ!\u0010\u0012\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0012\u0010\u0010\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0013"}, d2 = {"Lcom/google/android/dud;", "T", "", "Landroidx/compose/runtime/d;", "composer", "c", "(Landroidx/compose/runtime/d;)Landroidx/compose/runtime/d;", "V", "value", "Lkotlin/Function2;", "", "block", "i", "(Landroidx/compose/runtime/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "e", "(Landroidx/compose/runtime/d;Lkotlin/jvm/functions/Function1;)V", "d", "g", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dud<T> {
    public static <T> d c(d dVar) {
        return dVar;
    }

    public static final <V> void d(d dVar, V v, Function2<? super T, ? super V, Unit> function2) {
        if (dVar.E()) {
            dVar.e(v, function2);
        }
    }

    public static final void e(d dVar, final Function1<? super T, Unit> function1) {
        if (dVar.E()) {
            dVar.e(Unit.a, new Function2() { // from class: com.google.android.cud
                public final Object invoke(Object obj, Object obj2) {
                    return dud.f(function1, obj, (Unit) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, Object obj, Unit unit) {
        function1.invoke(obj);
        return Unit.a;
    }

    public static final void g(d dVar, final Function1<? super T, Unit> function1) {
        dVar.e(Unit.a, new Function2() { // from class: com.google.android.bud
            public final Object invoke(Object obj, Object obj2) {
                return dud.h(function1, obj, (Unit) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1, Object obj, Unit unit) {
        function1.invoke(obj);
        return Unit.a;
    }

    public static final <V> void i(d dVar, V v, Function2<? super T, ? super V, Unit> function2) {
        if (dVar.E() || !Intrinsics.e(dVar.R(), v)) {
            dVar.L(v);
            dVar.e(v, function2);
        }
    }
}
