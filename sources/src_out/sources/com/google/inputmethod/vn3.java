package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.g0;
import androidx.compose.p004runtime.q;
import com.google.android.q22;
import com.google.android.sl1;
import com.google.android.ta2;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\n\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a7\u0010\r\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0010\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a;\u0010\u0014\u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0012\"\u0004\u0018\u00010\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a=\u0010\u001a\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aG\u0010\u001c\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aQ\u0010\u001e\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aK\u0010 \u001a\u00020\u00012\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0012\"\u0004\u0018\u00010\u00052\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016H\u0007¢\u0006\u0004\b \u0010!\u001a\u001f\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b&\u0010'\"\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(¨\u0006*"}, d2 = {"Lkotlin/Function0;", "", "effect", "i", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/d;I)V", "", "key1", "Lkotlin/Function1;", "Lcom/google/android/kd3;", "Lcom/google/android/jd3;", "c", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)V", "key2", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)V", "key3", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)V", "", "keys", "d", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/d;I)V", "Lkotlin/Function2;", "Lcom/google/android/ta2;", "Lcom/google/android/q22;", "block", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "h", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/runtime/d;", "composer", "k", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/d;)Lcom/google/android/ta2;", "Lcom/google/android/kd3;", "InternalDisposableEffectScope", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vn3 {
    private static final kd3 a = new kd3();

    public static final void a(Object obj, Object obj2, Object obj3, Function1<? super kd3, ? extends jd3> function1, d dVar, int i) {
        if (e.k()) {
            e.o(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:230)");
        }
        boolean zX = dVar.x(obj) | dVar.x(obj2) | dVar.x(obj3);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new id3(function1);
            dVar.L(objR);
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void b(Object obj, Object obj2, Function1<? super kd3, ? extends jd3> function1, d dVar, int i) {
        if (e.k()) {
            e.o(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:192)");
        }
        boolean zX = dVar.x(obj) | dVar.x(obj2);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new id3(function1);
            dVar.L(objR);
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void c(Object obj, Function1<? super kd3, ? extends jd3> function1, d dVar, int i) {
        if (e.k()) {
            e.o(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:155)");
        }
        boolean zX = dVar.x(obj);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new id3(function1);
            dVar.L(objR);
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void d(Object[] objArr, Function1<? super kd3, ? extends jd3> function1, d dVar, int i) {
        if (e.k()) {
            e.o(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:266)");
        }
        boolean zX = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zX |= dVar.x(obj);
        }
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            dVar.L(new id3(function1));
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        if (e.k()) {
            e.o(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:387)");
        }
        CoroutineContext coroutineContextK = dVar.K();
        boolean zX = dVar.x(obj) | dVar.x(obj2) | dVar.x(obj3);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new q(coroutineContextK, function2);
            dVar.L(objR);
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void f(Object obj, Object obj2, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        if (e.k()) {
            e.o(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:363)");
        }
        CoroutineContext coroutineContextK = dVar.K();
        boolean zX = dVar.x(obj) | dVar.x(obj2);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new q(coroutineContextK, function2);
            dVar.L(objR);
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void g(Object obj, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        if (e.k()) {
            e.o(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:344)");
        }
        CoroutineContext coroutineContextK = dVar.K();
        boolean zX = dVar.x(obj);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new q(coroutineContextK, function2);
            dVar.L(objR);
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void h(Object[] objArr, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        if (e.k()) {
            e.o(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");
        }
        CoroutineContext coroutineContextK = dVar.K();
        boolean zX = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zX |= dVar.x(obj);
        }
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            dVar.L(new q(coroutineContextK, function2));
        }
        if (e.k()) {
            e.n();
        }
    }

    public static final void i(Function0<Unit> function0, d dVar, int i) {
        if (e.k()) {
            e.o(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:53)");
        }
        dVar.n(function0);
        if (e.k()) {
            e.n();
        }
    }

    public static final ta2 k(CoroutineContext coroutineContext, d dVar) {
        if (coroutineContext.get(s.u2) == null) {
            return new g0(dVar.K(), coroutineContext);
        }
        sl1 sl1VarB = u.b((s) null, 1, (Object) null);
        sl1VarB.a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return j.a(sl1VarB);
    }
}
