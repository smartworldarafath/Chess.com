package androidx.lifecycle;

import com.google.inputmethod.exa;
import com.google.inputmethod.j00;
import com.google.inputmethod.mn8;
import com.google.inputmethod.n17;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class n<T> {
    static final Object k = new Object();
    final Object a;
    private exa<mn8<? super T>, n<T>.d> b;
    int c;
    private boolean d;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (n.this.a) {
                obj = n.this.f;
                n.this.f = n.k;
            }
            n.this.o(obj);
        }
    }

    private class b extends n<T>.d {
        b(mn8<? super T> mn8Var) {
            super(mn8Var);
        }

        @Override // androidx.lifecycle.n.d
        boolean d() {
            return true;
        }
    }

    class c extends n<T>.d implements i {
        final n17 e;

        c(n17 n17Var, mn8<? super T> mn8Var) {
            super(mn8Var);
            this.e = n17Var;
        }

        @Override // androidx.lifecycle.n.d
        void b() {
            this.e.getLifecycleRegistry().g(this);
        }

        @Override // androidx.lifecycle.n.d
        boolean c(n17 n17Var) {
            return this.e == n17Var;
        }

        @Override // androidx.lifecycle.n.d
        boolean d() {
            return this.e.getLifecycleRegistry().getState().c(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.i
        public void d6(n17 n17Var, Lifecycle.Event event) {
            Lifecycle.State stateD = this.e.getLifecycleRegistry().getState();
            if (stateD == Lifecycle.State.DESTROYED) {
                n.this.n(this.a);
                return;
            }
            Lifecycle.State state = null;
            while (state != stateD) {
                a(d());
                state = stateD;
                stateD = this.e.getLifecycleRegistry().getState();
            }
        }
    }

    private abstract class d {
        final mn8<? super T> a;
        boolean b;
        int c = -1;

        d(mn8<? super T> mn8Var) {
            this.a = mn8Var;
        }

        void a(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            n.this.c(z ? 1 : -1);
            if (this.b) {
                n.this.e(this);
            }
        }

        void b() {
        }

        boolean c(n17 n17Var) {
            return false;
        }

        abstract boolean d();
    }

    public n(T t) {
        this.a = new Object();
        this.b = new exa<>();
        this.c = 0;
        this.f = k;
        this.j = new a();
        this.e = t;
        this.g = 0;
    }

    static void b(String str) {
        if (j00.h().c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(n<T>.d dVar) {
        if (dVar.b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i = dVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            dVar.c = i2;
            dVar.a.a((Object) this.e);
        }
    }

    void c(int i) {
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 == i3) {
                    this.d = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    k();
                } else if (z2) {
                    l();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    void e(n<T>.d dVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                exa<mn8<? super T>, n<T>.d>.d dVarD = this.b.d();
                while (dVarD.hasNext()) {
                    d((d) dVarD.next().getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public T f() {
        T t = (T) this.e;
        if (t != k) {
            return t;
        }
        return null;
    }

    int g() {
        return this.g;
    }

    public boolean h() {
        return this.c > 0;
    }

    public void i(n17 n17Var, mn8<? super T> mn8Var) {
        b("observe");
        if (n17Var.getLifecycleRegistry().getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        c cVar = new c(n17Var, mn8Var);
        n<T>.d dVarI = this.b.i(mn8Var, cVar);
        if (dVarI != null && !dVarI.c(n17Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarI != null) {
            return;
        }
        n17Var.getLifecycleRegistry().c(cVar);
    }

    public void j(mn8<? super T> mn8Var) {
        b("observeForever");
        b bVar = new b(mn8Var);
        n<T>.d dVarI = this.b.i(mn8Var, bVar);
        if (dVarI instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarI != null) {
            return;
        }
        bVar.a(true);
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = t;
        }
        if (z) {
            j00.h().d(this.j);
        }
    }

    public void n(mn8<? super T> mn8Var) {
        b("removeObserver");
        n<T>.d dVarJ = this.b.j(mn8Var);
        if (dVarJ == null) {
            return;
        }
        dVarJ.b();
        dVarJ.a(false);
    }

    protected void o(T t) {
        b("setValue");
        this.g++;
        this.e = t;
        e(null);
    }

    public n() {
        this.a = new Object();
        this.b = new exa<>();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }
}
