package androidx.compose.p004runtime;

import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import com.google.android.ai4;
import com.google.android.q22;
import com.google.android.r6c;
import com.google.inputmethod.SnapshotStateMap;
import com.google.inputmethod.bxb;
import com.google.inputmethod.io9;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.r58;
import com.google.inputmethod.x43;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"androidx/compose/runtime/q0", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/r0", "androidx/compose/runtime/s0"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class p0 {
    public static final <T extends R, R> q6c<R> a(ai4<? extends T> ai4Var, R r, CoroutineContext coroutineContext, d dVar, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.a(ai4Var, r, coroutineContext, dVar, i, i2);
    }

    public static final <T> q6c<T> b(r6c<? extends T> r6cVar, CoroutineContext coroutineContext, d dVar, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.b(r6cVar, coroutineContext, dVar, i, i2);
    }

    public static final r58<x43> c() {
        return q0.b();
    }

    public static final <T> q6c<T> d(bxb<T> bxbVar, Function0<? extends T> function0) {
        return q0.c(bxbVar, function0);
    }

    public static final <T> q6c<T> e(Function0<? extends T> function0) {
        return q0.d(function0);
    }

    public static final <T> SnapshotStateList<T> f() {
        return s0.a();
    }

    public static final <T> SnapshotStateList<T> g(T... tArr) {
        return s0.b(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> h() {
        return s0.c();
    }

    public static final <T> o58<T> i(T t, bxb<T> bxbVar) {
        return s0.d(t, bxbVar);
    }

    public static final <T> bxb<T> k() {
        return r0.a();
    }

    public static final <T> q6c<T> l(T t, Object obj, Object obj2, Object obj3, Function2<? super io9<T>, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        return SnapshotStateKt__ProduceStateKt.a(t, obj, obj2, obj3, function2, dVar, i);
    }

    public static final <T> q6c<T> m(T t, Object obj, Object obj2, Function2<? super io9<T>, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        return SnapshotStateKt__ProduceStateKt.b(t, obj, obj2, function2, dVar, i);
    }

    public static final <T> q6c<T> n(T t, Object obj, Function2<? super io9<T>, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        return SnapshotStateKt__ProduceStateKt.c(t, obj, function2, dVar, i);
    }

    public static final <T> q6c<T> o(T t, Function2<? super io9<T>, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        return SnapshotStateKt__ProduceStateKt.d(t, function2, dVar, i);
    }

    public static final <T> q6c<T> p(T t, Object[] objArr, Function2<? super io9<T>, ? super q22<? super Unit>, ? extends Object> function2, d dVar, int i) {
        return SnapshotStateKt__ProduceStateKt.e(t, objArr, function2, dVar, i);
    }

    public static final <T> bxb<T> q() {
        return r0.b();
    }

    public static final <T> q6c<T> r(T t, d dVar, int i) {
        return s0.f(t, dVar, i);
    }

    public static final <T> ai4<T> s(Function0<? extends T> function0) {
        return SnapshotStateKt__SnapshotFlowKt.c(function0);
    }

    public static final <T> bxb<T> t() {
        return r0.c();
    }
}
