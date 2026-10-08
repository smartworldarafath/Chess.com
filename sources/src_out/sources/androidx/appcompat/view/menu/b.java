package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.inputmethod.j15;
import com.google.inputmethod.lq7;
import com.google.inputmethod.rz9;
import com.google.inputmethod.sq7;
import com.google.inputmethod.sx9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = rz9.e;
    boolean A;
    private final Context b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    final Handler g;
    private View o;
    View p;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean w;
    private j.a x;
    ViewTreeObserver y;
    private PopupWindow.OnDismissListener z;
    private final List<e> h = new ArrayList();
    final List<d> i = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    private final View.OnAttachStateChangeListener k = new ViewOnAttachStateChangeListenerC0009b();
    private final lq7 l = new c();
    private int m = 0;
    private int n = 0;
    private boolean v = false;
    private int q = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.isShowing() || b.this.i.size() <= 0 || b.this.i.get(0).a.z()) {
                return;
            }
            View view = b.this.p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.i.iterator();
            while (it.hasNext()) {
                it.next().a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0009b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0009b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.y.removeGlobalOnLayoutListener(bVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements lq7 {

        class a implements Runnable {
            final /* synthetic */ d a;
            final /* synthetic */ MenuItem b;
            final /* synthetic */ e c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.a = dVar;
                this.b = menuItem;
                this.c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.b.e(false);
                    b.this.A = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.c.O(this.b, 4);
                }
            }
        }

        c() {
        }

        @Override // com.google.inputmethod.lq7
        public void a(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(null);
            int size = b.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (eVar == b.this.i.get(i).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.g.postAtTime(new a(i2 < b.this.i.size() ? b.this.i.get(i2) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // com.google.inputmethod.lq7
        public void h(e eVar, MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {
        public final sq7 a;
        public final e b;
        public final int c;

        public d(sq7 sq7Var, e eVar, int i) {
            this.a = sq7Var;
            this.b = eVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.i();
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(sx9.d));
        this.g = new Handler();
    }

    private int A(e eVar) {
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            if (eVar == this.i.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = eVar.getItem(i);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return this.o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int E(int i) {
        List<d> list = this.i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect);
        if (this.q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View viewC;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f, B);
        if (!isShowing() && this.v) {
            dVar2.d(true);
        } else if (isShowing()) {
            dVar2.d(h.x(eVar));
        }
        int iO = h.o(dVar2, null, this.b, this.c);
        sq7 sq7VarZ = z();
        sq7VarZ.n(dVar2);
        sq7VarZ.D(iO);
        sq7VarZ.E(this.n);
        if (this.i.size() > 0) {
            List<d> list = this.i;
            dVar = list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            sq7VarZ.T(false);
            sq7VarZ.Q(null);
            int iE = E(iO);
            boolean z = iE == 1;
            this.q = iE;
            sq7VarZ.B(viewC);
            if ((this.n & 5) != 5) {
                iO = z ? viewC.getWidth() : 0 - iO;
            } else if (!z) {
                iO = 0 - viewC.getWidth();
            }
            sq7VarZ.k(iO);
            sq7VarZ.L(true);
            sq7VarZ.d(0);
        } else {
            if (this.r) {
                sq7VarZ.k(this.t);
            }
            if (this.s) {
                sq7VarZ.d(this.u);
            }
            sq7VarZ.F(n());
        }
        this.i.add(new d(sq7VarZ, eVar, this.q));
        sq7VarZ.show();
        ListView listViewI = sq7VarZ.i();
        listViewI.setOnKeyListener(this);
        if (dVar == null && this.w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(rz9.l, (ViewGroup) listViewI, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            listViewI.addHeaderView(frameLayout, null, false);
            sq7VarZ.show();
        }
    }

    private sq7 z() {
        sq7 sq7Var = new sq7(this.b, null, this.d, this.e);
        sq7Var.S(this.l);
        sq7Var.J(this);
        sq7Var.I(this);
        sq7Var.B(this.o);
        sq7Var.E(this.n);
        sq7Var.H(true);
        sq7Var.G(2);
        return sq7Var;
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(e eVar, boolean z) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i = iA + 1;
        if (i < this.i.size()) {
            this.i.get(i).b.e(false);
        }
        d dVarRemove = this.i.remove(iA);
        dVarRemove.b.R(this);
        if (this.A) {
            dVarRemove.a.R(null);
            dVarRemove.a.C(0);
        }
        dVarRemove.a.dismiss();
        int size = this.i.size();
        if (size > 0) {
            this.q = this.i.get(size - 1).c;
        } else {
            this.q = D();
        }
        if (size != 0) {
            if (z) {
                this.i.get(0).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.x;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable c() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z) {
        Iterator<d> it = this.i.iterator();
        while (it.hasNext()) {
            h.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // com.google.inputmethod.gob
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.i.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.x = aVar;
    }

    @Override // com.google.inputmethod.gob
    public ListView i() {
        if (this.i.isEmpty()) {
            return null;
        }
        List<d> list = this.i;
        return list.get(list.size() - 1).a();
    }

    @Override // com.google.inputmethod.gob
    public boolean isShowing() {
        return this.i.size() > 0 && this.i.get(0).a.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public void j(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        for (d dVar : this.i) {
            if (mVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.x;
        if (aVar != null) {
            aVar.b(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.b);
        if (isShowing()) {
            F(eVar);
        } else {
            this.h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.i.get(i);
            if (!dVar.a.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = j15.b(this.m, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = j15.b(i, this.o.getLayoutDirection());
        }
    }

    @Override // com.google.inputmethod.gob
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator<e> it = this.h.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.h.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z) {
        this.w = z;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i) {
        this.s = true;
        this.u = i;
    }
}
