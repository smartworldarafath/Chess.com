package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import com.google.inputmethod.bs2;
import com.google.inputmethod.di9;
import com.google.inputmethod.k7e;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class i extends androidx.appcompat.app.a {
    final bs2 a;
    final Window.Callback b;
    final androidx.appcompat.app.e.g c;
    boolean d;
    private boolean e;
    private boolean f;
    private ArrayList<androidx.appcompat.app.a.b> g = new ArrayList<>();
    private final Runnable h = new a();
    private final Toolbar.h i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.y();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return i.this.b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements androidx.appcompat.view.menu.j.a {
        private boolean a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (this.a) {
                return;
            }
            this.a = true;
            i.this.a.m();
            i.this.b.onPanelClosed(108, eVar);
            this.a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            i.this.b.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (i.this.a.c()) {
                i.this.b.onPanelClosed(108, eVar);
            } else if (i.this.b.onPreparePanel(0, null, eVar)) {
                i.this.b.onMenuOpened(108, eVar);
            }
        }
    }

    private class e implements androidx.appcompat.app.e.g {
        e() {
        }

        @Override // androidx.appcompat.app.e.g
        public boolean a(int i) {
            if (i != 0) {
                return false;
            }
            i iVar = i.this;
            if (iVar.d) {
                return false;
            }
            iVar.a.f();
            i.this.d = true;
            return false;
        }

        @Override // androidx.appcompat.app.e.g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(i.this.a.getContext());
            }
            return null;
        }
    }

    i(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.i = bVar;
        di9.g(toolbar);
        l0 l0Var = new l0(toolbar, false);
        this.a = l0Var;
        this.b = (Window.Callback) di9.g(callback);
        l0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        l0Var.setWindowTitle(charSequence);
        this.c = new e();
    }

    private Menu x() {
        if (!this.e) {
            this.a.w(new c(), new d());
            this.e = true;
        }
        return this.a.q();
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.a.d();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.a.h()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.a.n();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        this.a.s().removeCallbacks(this.h);
        k7e.d0(this.a.s(), this.h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        super.l(configuration);
    }

    @Override // androidx.appcompat.app.a
    void m() {
        this.a.s().removeCallbacks(this.h);
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i, KeyEvent keyEvent) {
        Menu menuX = x();
        if (menuX == null) {
            return false;
        }
        menuX.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuX.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            p();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean p() {
        return this.a.b();
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        z(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.a.p(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void u(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    void y() {
        Menu menuX = x();
        androidx.appcompat.view.menu.e eVar = menuX instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuX : null;
        if (eVar != null) {
            eVar.i0();
        }
        try {
            menuX.clear();
            if (!this.b.onCreatePanelMenu(0, menuX) || !this.b.onPreparePanel(0, null, menuX)) {
                menuX.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.h0();
            }
        }
    }

    public void z(int i, int i2) {
        this.a.i((i & i2) | ((~i2) & this.a.n()));
    }
}
