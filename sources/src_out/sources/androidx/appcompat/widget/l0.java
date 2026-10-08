package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.google.inputmethod.ax9;
import com.google.inputmethod.bs2;
import com.google.inputmethod.cy9;
import com.google.inputmethod.d1a;
import com.google.inputmethod.e0a;
import com.google.inputmethod.eae;
import com.google.inputmethod.hae;
import com.google.inputmethod.k7e;
import com.google.inputmethod.oy9;
import com.google.inputmethod.s7;
import com.google.inputmethod.uv;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class l0 implements bs2 {
    Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private ActionMenuPresenter n;
    private int o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {
        final s7 a;

        a() {
            this.a = new s7(l0.this.a.getContext(), 0, R.id.home, 0, 0, l0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l0 l0Var = l0.this;
            Window.Callback callback = l0Var.l;
            if (callback == null || !l0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.a);
        }
    }

    class b extends hae {
        private boolean a = false;
        final /* synthetic */ int b;

        b(int i) {
            this.b = i;
        }

        @Override // com.google.inputmethod.hae, com.google.inputmethod.gae
        public void a(View view) {
            this.a = true;
        }

        @Override // com.google.inputmethod.gae
        public void b(View view) {
            if (this.a) {
                return;
            }
            l0.this.a.setVisibility(this.b);
        }

        @Override // com.google.inputmethod.hae, com.google.inputmethod.gae
        public void c(View view) {
            l0.this.a.setVisibility(0);
        }
    }

    public l0(Toolbar toolbar, boolean z) {
        this(toolbar, z, e0a.a, cy9.n);
    }

    private void E(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
            if (this.h) {
                k7e.o0(this.a.getRootView(), charSequence);
            }
        }
    }

    private void F() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.p);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void G() {
        if ((this.b & 4) == 0) {
            this.a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.g;
        if (drawable == null) {
            drawable = this.q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void H() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }

    private int x() {
        if (this.a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f = drawable;
        H();
    }

    public void B(int i) {
        C(i == 0 ? null : getContext().getString(i));
    }

    public void C(CharSequence charSequence) {
        this.k = charSequence;
        F();
    }

    public void D(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // com.google.inputmethod.bs2
    public boolean a() {
        return this.a.canShowOverflowMenu();
    }

    @Override // com.google.inputmethod.bs2
    public boolean b() {
        return this.a.showOverflowMenu();
    }

    @Override // com.google.inputmethod.bs2
    public boolean c() {
        return this.a.isOverflowMenuShowing();
    }

    @Override // com.google.inputmethod.bs2
    public void collapseActionView() {
        this.a.collapseActionView();
    }

    @Override // com.google.inputmethod.bs2
    public boolean d() {
        return this.a.hideOverflowMenu();
    }

    @Override // com.google.inputmethod.bs2
    public void e(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        if (this.n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.a.getContext());
            this.n = actionMenuPresenter;
            actionMenuPresenter.r(oy9.g);
        }
        this.n.h(aVar);
        this.a.setMenu((androidx.appcompat.view.menu.e) menu, this.n);
    }

    @Override // com.google.inputmethod.bs2
    public void f() {
        this.m = true;
    }

    @Override // com.google.inputmethod.bs2
    public boolean g() {
        return this.a.isOverflowMenuShowPending();
    }

    @Override // com.google.inputmethod.bs2
    public Context getContext() {
        return this.a.getContext();
    }

    @Override // com.google.inputmethod.bs2
    public CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // com.google.inputmethod.bs2
    public boolean h() {
        return this.a.hasExpandedActionView();
    }

    @Override // com.google.inputmethod.bs2
    public void i(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    F();
                }
                G();
            }
            if ((i2 & 3) != 0) {
                H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    this.a.setSubtitle(this.j);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // com.google.inputmethod.bs2
    public int j() {
        return this.o;
    }

    @Override // com.google.inputmethod.bs2
    public void k() {
    }

    @Override // com.google.inputmethod.bs2
    public void l(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // com.google.inputmethod.bs2
    public void m() {
        this.a.dismissPopupMenus();
    }

    @Override // com.google.inputmethod.bs2
    public int n() {
        return this.b;
    }

    @Override // com.google.inputmethod.bs2
    public void o() {
    }

    @Override // com.google.inputmethod.bs2
    public void p(Drawable drawable) {
        this.g = drawable;
        G();
    }

    @Override // com.google.inputmethod.bs2
    public Menu q() {
        return this.a.getMenu();
    }

    @Override // com.google.inputmethod.bs2
    public eae r(int i, long j) {
        return k7e.f(this.a).b(i == 0 ? 1.0f : 0.0f).e(j).g(new b(i));
    }

    @Override // com.google.inputmethod.bs2
    public ViewGroup s() {
        return this.a;
    }

    @Override // com.google.inputmethod.bs2
    public void setIcon(int i) {
        setIcon(i != 0 ? uv.b(getContext(), i) : null);
    }

    @Override // com.google.inputmethod.bs2
    public void setTitle(CharSequence charSequence) {
        this.h = true;
        E(charSequence);
    }

    @Override // com.google.inputmethod.bs2
    public void setVisibility(int i) {
        this.a.setVisibility(i);
    }

    @Override // com.google.inputmethod.bs2
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // com.google.inputmethod.bs2
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        E(charSequence);
    }

    @Override // com.google.inputmethod.bs2
    public void t(boolean z) {
    }

    @Override // com.google.inputmethod.bs2
    public void u(e0 e0Var) {
        View view = this.c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = e0Var;
        if (e0Var == null || this.o != 2) {
            return;
        }
        this.a.addView(e0Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.a = 8388691;
        e0Var.setAllowCollapse(true);
    }

    @Override // com.google.inputmethod.bs2
    public void v(int i) {
        A(i != 0 ? uv.b(getContext(), i) : null);
    }

    @Override // com.google.inputmethod.bs2
    public void w(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.a.setMenuCallbacks(aVar, aVar2);
    }

    public void y(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    public void z(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            B(this.p);
        }
    }

    public l0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        k0 k0VarV = k0.v(toolbar.getContext(), null, d1a.a, ax9.c, 0);
        this.q = k0VarV.g(d1a.l);
        if (z) {
            CharSequence charSequenceP = k0VarV.p(d1a.r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = k0VarV.p(d1a.p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                D(charSequenceP2);
            }
            Drawable drawableG = k0VarV.g(d1a.n);
            if (drawableG != null) {
                A(drawableG);
            }
            Drawable drawableG2 = k0VarV.g(d1a.m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                p(drawable);
            }
            i(k0VarV.k(d1a.h, 0));
            int iN = k0VarV.n(d1a.g, 0);
            if (iN != 0) {
                y(LayoutInflater.from(this.a.getContext()).inflate(iN, (ViewGroup) this.a, false));
                i(this.b | 16);
            }
            int iM = k0VarV.m(d1a.j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = iM;
                this.a.setLayoutParams(layoutParams);
            }
            int iE = k0VarV.e(d1a.f, -1);
            int iE2 = k0VarV.e(d1a.e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.a.setContentInsetsRelative(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = k0VarV.n(d1a.s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iN2);
            }
            int iN3 = k0VarV.n(d1a.q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iN3);
            }
            int iN4 = k0VarV.n(d1a.o, 0);
            if (iN4 != 0) {
                this.a.setPopupTheme(iN4);
            }
        } else {
            this.b = x();
        }
        k0VarV.x();
        z(i);
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new a());
    }

    @Override // com.google.inputmethod.bs2
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        H();
    }
}
