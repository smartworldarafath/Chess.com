package com.google.inputmethod;

import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u00060\u0001j\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/xm6;", "", "<init>", "()V", "", "d", "f", "c", "(Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "a", "Ljava/lang/Object;", "lock", "", "Lcom/google/android/q22;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xm6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<q22<Unit>> awaiters = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List<q22<Unit>> spareList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean _isOpen = true;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function1<Throwable, Unit> {
        final /* synthetic */ g41<Unit> b;

        a(g41<? super Unit> g41Var) {
            this.b = g41Var;
        }

        public final void a(Throwable th) {
            Object obj = xm6.this.lock;
            xm6 xm6Var = xm6.this;
            g41<Unit> g41Var = this.b;
            synchronized (obj) {
                xm6Var.awaiters.remove(g41Var);
                Unit unit = Unit.a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    public final Object c(q22<? super Unit> q22Var) {
        if (e()) {
            return Unit.a;
        }
        e eVar = new e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        synchronized (this.lock) {
            this.awaiters.add(eVar);
        }
        eVar.D(new a(eVar));
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY == kotlin.coroutines.intrinsics.a.g() ? objY : Unit.a;
    }

    public final void d() {
        synchronized (this.lock) {
            this._isOpen = false;
            Unit unit = Unit.a;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                if (e()) {
                    return;
                }
                List<q22<Unit>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    q22<Unit> q22Var = list.get(i);
                    Result.a aVar = Result.a;
                    q22Var.resumeWith(Result.b(Unit.a));
                }
                list.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
