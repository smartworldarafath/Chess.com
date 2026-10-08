package com.google.inputmethod;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class iq7 {
    private final Runnable a;
    private final CopyOnWriteArrayList<uq7> b = new CopyOnWriteArrayList<>();
    private final Map<uq7, a> c = new HashMap();

    private static class a {
        final Lifecycle a;
        private i b;

        a(Lifecycle lifecycle, i iVar) {
            this.a = lifecycle;
            this.b = iVar;
            lifecycle.c(iVar);
        }

        void a() {
            this.a.g(this.b);
            this.b = null;
        }
    }

    public iq7(Runnable runnable) {
        this.a = runnable;
    }

    public static /* synthetic */ void a(iq7 iq7Var, Lifecycle.State state, uq7 uq7Var, n17 n17Var, Lifecycle.Event event) {
        iq7Var.getClass();
        if (event == Lifecycle.Event.e(state)) {
            iq7Var.c(uq7Var);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            iq7Var.j(uq7Var);
        } else if (event == Lifecycle.Event.c(state)) {
            iq7Var.b.remove(uq7Var);
            iq7Var.a.run();
        }
    }

    public static /* synthetic */ void b(iq7 iq7Var, uq7 uq7Var, n17 n17Var, Lifecycle.Event event) {
        iq7Var.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            iq7Var.j(uq7Var);
        }
    }

    public void c(uq7 uq7Var) {
        this.b.add(uq7Var);
        this.a.run();
    }

    public void d(final uq7 uq7Var, n17 n17Var) {
        c(uq7Var);
        Lifecycle lifecycleRegistry = n17Var.getLifecycleRegistry();
        a aVarRemove = this.c.remove(uq7Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.c.put(uq7Var, new a(lifecycleRegistry, new i() { // from class: com.google.android.hq7
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var2, Lifecycle.Event event) {
                iq7.b(this.a, uq7Var, n17Var2, event);
            }
        }));
    }

    public void e(final uq7 uq7Var, n17 n17Var, final Lifecycle.State state) {
        Lifecycle lifecycleRegistry = n17Var.getLifecycleRegistry();
        a aVarRemove = this.c.remove(uq7Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.c.put(uq7Var, new a(lifecycleRegistry, new i() { // from class: com.google.android.gq7
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var2, Lifecycle.Event event) {
                iq7.a(this.a, state, uq7Var, n17Var2, event);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator<uq7> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator<uq7> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator<uq7> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator<uq7> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c(menu);
        }
    }

    public void j(uq7 uq7Var) {
        this.b.remove(uq7Var);
        a aVarRemove = this.c.remove(uq7Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.a.run();
    }
}
