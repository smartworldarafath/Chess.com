package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/google/android/t58;", "T", "", "Lcom/google/android/r58;", "vector", "Lkotlin/Function0;", "", "onVectorMutated", "<init>", "(Lcom/google/android/r58;Lkotlin/jvm/functions/Function0;)V", "b", "()V", "", "index", "element", "a", "(ILjava/lang/Object;)V", "d", "(I)Ljava/lang/Object;", "Lcom/google/android/r58;", "c", "()Lcom/google/android/r58;", "Lkotlin/jvm/functions/Function0;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t58<T> {
    public static final int c = r58.d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final r58<T> vector;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<Unit> onVectorMutated;

    public t58(r58<T> r58Var, Function0<Unit> function0) {
        this.vector = r58Var;
        this.onVectorMutated = function0;
    }

    public final void a(int index, T element) {
        this.vector.b(index, element);
        this.onVectorMutated.invoke();
    }

    public final void b() {
        this.vector.j();
        this.onVectorMutated.invoke();
    }

    public final r58<T> c() {
        return this.vector;
    }

    public final T d(int index) {
        T tU = this.vector.u(index);
        this.onVectorMutated.invoke();
        return tU;
    }
}
