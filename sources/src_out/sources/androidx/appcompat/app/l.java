package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import com.google.inputmethod.ax9;
import com.google.inputmethod.bs2;
import com.google.inputmethod.d1a;
import com.google.inputmethod.eae;
import com.google.inputmethod.fae;
import com.google.inputmethod.gae;
import com.google.inputmethod.hae;
import com.google.inputmethod.iae;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kec;
import com.google.inputmethod.oy9;
import com.google.inputmethod.p7;
import com.google.inputmethod.t7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class l extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;
    Context a;
    private Context b;
    private Activity c;
    ActionBarOverlayLayout d;
    ActionBarContainer e;
    bs2 f;
    ActionBarContextView g;
    View h;
    e0 i;
    private boolean l;
    d m;
    t7 n;
    t7.a o;
    private boolean p;
    private boolean r;
    boolean u;
    boolean v;
    private boolean w;
    fae y;
    private boolean z;
    private ArrayList<Object> j = new ArrayList<>();
    private int k = -1;
    private ArrayList<androidx.appcompat.app.a.b> q = new ArrayList<>();
    private int s = 0;
    boolean t = true;
    private boolean x = true;
    final gae B = new a();
    final gae C = new b();
    final iae D = new c();

    class a extends hae {
        a() {
        }

        @Override // com.google.inputmethod.gae
        public void b(View view) {
            View view2;
            l lVar = l.this;
            if (lVar.t && (view2 = lVar.h) != null) {
                view2.setTranslationY(0.0f);
                l.this.e.setTranslationY(0.0f);
            }
            l.this.e.setVisibility(8);
            l.this.e.setTransitioning(false);
            l lVar2 = l.this;
            lVar2.y = null;
            lVar2.z();
            ActionBarOverlayLayout actionBarOverlayLayout = l.this.d;
            if (actionBarOverlayLayout != null) {
                k7e.i0(actionBarOverlayLayout);
            }
        }
    }

    class b extends hae {
        b() {
        }

        @Override // com.google.inputmethod.gae
        public void b(View view) {
            l lVar = l.this;
            lVar.y = null;
            lVar.e.requestLayout();
        }
    }

    class c implements iae {
        c() {
        }

        @Override // com.google.inputmethod.iae
        public void a(View view) {
            ((View) l.this.e.getParent()).invalidate();
        }
    }

    public class d extends t7 implements androidx.appcompat.view.menu.e.a {
        private final Context c;
        private final androidx.appcompat.view.menu.e d;
        private t7.a e;
        private WeakReference<View> f;

        public d(Context context, t7.a aVar) {
            this.c = context;
            this.e = aVar;
            androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(context).X(1);
            this.d = eVarX;
            eVarX.W(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            t7.a aVar = this.e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.e == null) {
                return;
            }
            k();
            l.this.g.l();
        }

        @Override // com.google.inputmethod.t7
        public void c() {
            l lVar = l.this;
            if (lVar.m != this) {
                return;
            }
            if (l.y(lVar.u, lVar.v, false)) {
                this.e.d(this);
            } else {
                l lVar2 = l.this;
                lVar2.n = this;
                lVar2.o = this.e;
            }
            this.e = null;
            l.this.x(false);
            l.this.g.g();
            l lVar3 = l.this;
            lVar3.d.setHideOnContentScrollEnabled(lVar3.A);
            l.this.m = null;
        }

        @Override // com.google.inputmethod.t7
        public View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // com.google.inputmethod.t7
        public Menu e() {
            return this.d;
        }

        @Override // com.google.inputmethod.t7
        public MenuInflater f() {
            return new kec(this.c);
        }

        @Override // com.google.inputmethod.t7
        public CharSequence g() {
            return l.this.g.getSubtitle();
        }

        @Override // com.google.inputmethod.t7
        public CharSequence i() {
            return l.this.g.getTitle();
        }

        @Override // com.google.inputmethod.t7
        public void k() {
            if (l.this.m != this) {
                return;
            }
            this.d.i0();
            try {
                this.e.a(this, this.d);
            } finally {
                this.d.h0();
            }
        }

        @Override // com.google.inputmethod.t7
        public boolean l() {
            return l.this.g.j();
        }

        @Override // com.google.inputmethod.t7
        public void m(View view) {
            l.this.g.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // com.google.inputmethod.t7
        public void n(int i) {
            o(l.this.a.getResources().getString(i));
        }

        @Override // com.google.inputmethod.t7
        public void o(CharSequence charSequence) {
            l.this.g.setSubtitle(charSequence);
        }

        @Override // com.google.inputmethod.t7
        public void q(int i) {
            r(l.this.a.getResources().getString(i));
        }

        @Override // com.google.inputmethod.t7
        public void r(CharSequence charSequence) {
            l.this.g.setTitle(charSequence);
        }

        @Override // com.google.inputmethod.t7
        public void s(boolean z) {
            super.s(z);
            l.this.g.setTitleOptional(z);
        }

        public boolean t() {
            this.d.i0();
            try {
                return this.e.b(this, this.d);
            } finally {
                this.d.h0();
            }
        }
    }

    public l(Activity activity, boolean z) {
        this.c = activity;
        View decorView = activity.getWindow().getDecorView();
        F(decorView);
        if (z) {
            return;
        }
        this.h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private bs2 C(View view) {
        if (view instanceof bs2) {
            return (bs2) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void E() {
        if (this.w) {
            this.w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            N(false);
        }
    }

    private void F(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(oy9.p);
        this.d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f = C(view.findViewById(oy9.a));
        this.g = (ActionBarContextView) view.findViewById(oy9.f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(oy9.c);
        this.e = actionBarContainer;
        bs2 bs2Var = this.f;
        if (bs2Var == null || this.g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.a = bs2Var.getContext();
        boolean z = (this.f.n() & 4) != 0;
        if (z) {
            this.l = true;
        }
        p7 p7VarB = p7.b(this.a);
        K(p7VarB.a() || z);
        I(p7VarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, d1a.a, ax9.c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(d1a.k, false)) {
            J(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(d1a.i, 0);
        if (dimensionPixelSize != 0) {
            H(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void I(boolean z) {
        this.r = z;
        if (z) {
            this.e.setTabContainer(null);
            this.f.u(this.i);
        } else {
            this.f.u(null);
            this.e.setTabContainer(this.i);
        }
        boolean z2 = D() == 2;
        e0 e0Var = this.i;
        if (e0Var != null) {
            if (z2) {
                e0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.d;
                if (actionBarOverlayLayout != null) {
                    k7e.i0(actionBarOverlayLayout);
                }
            } else {
                e0Var.setVisibility(8);
            }
        }
        this.f.l(!this.r && z2);
        this.d.setHasNonEmbeddedTabs(!this.r && z2);
    }

    private boolean L() {
        return this.e.isLaidOut();
    }

    private void M() {
        if (this.w) {
            return;
        }
        this.w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        N(false);
    }

    private void N(boolean z) {
        if (y(this.u, this.v, this.w)) {
            if (this.x) {
                return;
            }
            this.x = true;
            B(z);
            return;
        }
        if (this.x) {
            this.x = false;
            A(z);
        }
    }

    static boolean y(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public void A(boolean z) {
        View view;
        fae faeVar = this.y;
        if (faeVar != null) {
            faeVar.a();
        }
        if (this.s != 0 || (!this.z && !z)) {
            this.B.b(null);
            return;
        }
        this.e.setAlpha(1.0f);
        this.e.setTransitioning(true);
        fae faeVar2 = new fae();
        float f = -this.e.getHeight();
        if (z) {
            int[] iArr = {0, 0};
            this.e.getLocationInWindow(iArr);
            f -= iArr[1];
        }
        eae eaeVarL = k7e.f(this.e).l(f);
        eaeVarL.j(this.D);
        faeVar2.c(eaeVarL);
        if (this.t && (view = this.h) != null) {
            faeVar2.c(k7e.f(view).l(f));
        }
        faeVar2.f(E);
        faeVar2.e(250L);
        faeVar2.g(this.B);
        this.y = faeVar2;
        faeVar2.h();
    }

    public void B(boolean z) {
        View view;
        View view2;
        fae faeVar = this.y;
        if (faeVar != null) {
            faeVar.a();
        }
        this.e.setVisibility(0);
        if (this.s == 0 && (this.z || z)) {
            this.e.setTranslationY(0.0f);
            float f = -this.e.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.e.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            this.e.setTranslationY(f);
            fae faeVar2 = new fae();
            eae eaeVarL = k7e.f(this.e).l(0.0f);
            eaeVarL.j(this.D);
            faeVar2.c(eaeVarL);
            if (this.t && (view2 = this.h) != null) {
                view2.setTranslationY(f);
                faeVar2.c(k7e.f(this.h).l(0.0f));
            }
            faeVar2.f(F);
            faeVar2.e(250L);
            faeVar2.g(this.C);
            this.y = faeVar2;
            faeVar2.h();
        } else {
            this.e.setAlpha(1.0f);
            this.e.setTranslationY(0.0f);
            if (this.t && (view = this.h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.d;
        if (actionBarOverlayLayout != null) {
            k7e.i0(actionBarOverlayLayout);
        }
    }

    public int D() {
        return this.f.j();
    }

    public void G(int i, int i2) {
        int iN = this.f.n();
        if ((i2 & 4) != 0) {
            this.l = true;
        }
        this.f.i((i & i2) | ((~i2) & iN));
    }

    public void H(float f) {
        k7e.s0(this.e, f);
    }

    public void J(boolean z) {
        if (z && !this.d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z;
        this.d.setHideOnContentScrollEnabled(z);
    }

    public void K(boolean z) {
        this.f.t(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.v) {
            this.v = false;
            N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        if (this.v) {
            return;
        }
        this.v = true;
        N(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        fae faeVar = this.y;
        if (faeVar != null) {
            faeVar.a();
            this.y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z) {
        this.t = z;
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        bs2 bs2Var = this.f;
        if (bs2Var == null || !bs2Var.h()) {
            return false;
        }
        this.f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z) {
        if (z == this.p) {
            return;
        }
        this.p = z;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            this.q.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f.n();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(ax9.g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        I(p7.b(this.a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i) {
        this.s = i;
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z) {
        if (this.l) {
            return;
        }
        r(z);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        G(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f.p(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z) {
        fae faeVar;
        this.z = z;
        if (z || (faeVar = this.y) == null) {
            return;
        }
        faeVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void u(CharSequence charSequence) {
        this.f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public t7 w(t7.a aVar) {
        d dVar = this.m;
        if (dVar != null) {
            dVar.c();
        }
        this.d.setHideOnContentScrollEnabled(false);
        this.g.k();
        d dVar2 = new d(this.g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.m = dVar2;
        dVar2.k();
        this.g.h(dVar2);
        x(true);
        return dVar2;
    }

    public void x(boolean z) {
        eae eaeVarR;
        eae eaeVarF;
        if (z) {
            M();
        } else {
            E();
        }
        if (!L()) {
            if (z) {
                this.f.setVisibility(4);
                this.g.setVisibility(0);
                return;
            } else {
                this.f.setVisibility(0);
                this.g.setVisibility(8);
                return;
            }
        }
        if (z) {
            eaeVarF = this.f.r(4, 100L);
            eaeVarR = this.g.f(0, 200L);
        } else {
            eaeVarR = this.f.r(0, 200L);
            eaeVarF = this.g.f(8, 100L);
        }
        fae faeVar = new fae();
        faeVar.d(eaeVarF, eaeVarR);
        faeVar.h();
    }

    void z() {
        t7.a aVar = this.o;
        if (aVar != null) {
            aVar.d(this.n);
            this.n = null;
            this.o = null;
        }
    }

    public l(Dialog dialog) {
        F(dialog.getWindow().getDecorView());
    }
}
