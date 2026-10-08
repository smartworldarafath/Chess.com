package com.google.inputmethod;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class i47 implements gob {
    private static Method G;
    private static Method H;
    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;
    private Context a;
    private ListAdapter b;
    zi3 c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    int o;
    private View p;
    private int q;
    private DataSetObserver r;
    private View s;
    private Drawable t;
    private AdapterView.OnItemClickListener u;
    private AdapterView.OnItemSelectedListener v;
    final i w;
    private final h x;
    private final g y;
    private final e z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewR = i47.this.r();
            if (viewR == null || viewR.getWindowToken() == null) {
                return;
            }
            i47.this.show();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            zi3 zi3Var;
            if (i == -1 || (zi3Var = i47.this.c) == null) {
                return;
            }
            zi3Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i47.this.p();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (i47.this.isShowing()) {
                i47.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            i47.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || i47.this.y() || i47.this.F.getContentView() == null) {
                return;
            }
            i47 i47Var = i47.this;
            i47Var.B.removeCallbacks(i47Var.w);
            i47.this.w.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = i47.this.F) != null && popupWindow.isShowing() && x >= 0 && x < i47.this.F.getWidth() && y >= 0 && y < i47.this.F.getHeight()) {
                i47 i47Var = i47.this;
                i47Var.B.postDelayed(i47Var.w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            i47 i47Var2 = i47.this;
            i47Var2.B.removeCallbacks(i47Var2.w);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zi3 zi3Var = i47.this.c;
            if (zi3Var == null || !zi3Var.isAttachedToWindow() || i47.this.c.getCount() <= i47.this.c.getChildCount()) {
                return;
            }
            int childCount = i47.this.c.getChildCount();
            i47 i47Var = i47.this;
            if (childCount <= i47Var.o) {
                i47Var.F.setInputMethodMode(2);
                i47.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public i47(Context context) {
        this(context, null, ax9.G);
    }

    private void A() {
        View view = this.p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.p);
            }
        }
    }

    private void M(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.F, z);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    private int o() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        if (this.c == null) {
            Context context = this.a;
            this.A = new a();
            zi3 zi3VarQ = q(context, !this.E);
            this.c = zi3VarQ;
            Drawable drawable = this.t;
            if (drawable != null) {
                zi3VarQ.setSelector(drawable);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new b());
            this.c.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.v;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            zi3 zi3Var = this.c;
            View view2 = this.p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.q;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(zi3Var, layoutParams);
                } else if (i4 == 1) {
                    linearLayout.addView(zi3Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.e;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = zi3Var;
            }
            this.F.setContentView(view);
        } else {
            View view3 = this.p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.i) {
                this.g = -i6;
            }
        } else {
            this.C.setEmpty();
            i2 = 0;
        }
        int iS = s(r(), this.g, this.F.getInputMethodMode() == 2);
        if (this.m || this.d == -1) {
            return iS + i2;
        }
        int i7 = this.e;
        if (i7 == -2) {
            int i8 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), t04.INVALID_ID);
        } else if (i7 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.c.d(iMakeMeasureSpec, 0, -1, iS - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i2 + this.c.getPaddingTop() + this.c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int s(View view, int i2, boolean z) {
        return c.a(this.F, view, i2, z);
    }

    public void B(View view) {
        this.s = view;
    }

    public void C(int i2) {
        this.F.setAnimationStyle(i2);
    }

    public void D(int i2) {
        Drawable background = this.F.getBackground();
        if (background == null) {
            P(i2);
            return;
        }
        background.getPadding(this.C);
        Rect rect = this.C;
        this.e = rect.left + rect.right + i2;
    }

    public void E(int i2) {
        this.l = i2;
    }

    public void F(Rect rect) {
        this.D = rect != null ? new Rect(rect) : null;
    }

    public void G(int i2) {
        this.F.setInputMethodMode(i2);
    }

    public void H(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    public void I(PopupWindow.OnDismissListener onDismissListener) {
        this.F.setOnDismissListener(onDismissListener);
    }

    public void J(AdapterView.OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
    }

    public void K(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.v = onItemSelectedListener;
    }

    public void L(boolean z) {
        this.k = true;
        this.j = z;
    }

    public void N(int i2) {
        this.q = i2;
    }

    public void O(int i2) {
        zi3 zi3Var = this.c;
        if (!isShowing() || zi3Var == null) {
            return;
        }
        zi3Var.setListSelectionHidden(false);
        zi3Var.setSelection(i2);
        if (zi3Var.getChoiceMode() != 0) {
            zi3Var.setItemChecked(i2, true);
        }
    }

    public void P(int i2) {
        this.e = i2;
    }

    public void b(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public Drawable c() {
        return this.F.getBackground();
    }

    public void d(int i2) {
        this.g = i2;
        this.i = true;
    }

    @Override // com.google.inputmethod.gob
    public void dismiss() {
        this.F.dismiss();
        A();
        this.F.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.w);
    }

    public int g() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    @Override // com.google.inputmethod.gob
    public ListView i() {
        return this.c;
    }

    @Override // com.google.inputmethod.gob
    public boolean isShowing() {
        return this.F.isShowing();
    }

    public int j() {
        return this.f;
    }

    public void k(int i2) {
        this.f = i2;
    }

    public void n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.r;
        if (dataSetObserver == null) {
            this.r = new f();
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.r);
        }
        zi3 zi3Var = this.c;
        if (zi3Var != null) {
            zi3Var.setAdapter(this.b);
        }
    }

    public void p() {
        zi3 zi3Var = this.c;
        if (zi3Var != null) {
            zi3Var.setListSelectionHidden(true);
            zi3Var.requestLayout();
        }
    }

    zi3 q(Context context, boolean z) {
        return new zi3(context, z);
    }

    public View r() {
        return this.s;
    }

    @Override // com.google.inputmethod.gob
    public void show() {
        int iO = o();
        boolean zY = y();
        tg9.b(this.F, this.h);
        if (this.F.isShowing()) {
            if (r().isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = r().getWidth();
                }
                int i2 = this.d;
                if (i2 == -1) {
                    if (!zY) {
                        iO = -1;
                    }
                    if (zY) {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(0);
                    } else {
                        this.F.setWidth(this.e == -1 ? -1 : 0);
                        this.F.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iO = i2;
                }
                this.F.setOutsideTouchable((this.n || this.m) ? false : true);
                this.F.update(r(), this.f, this.g, width < 0 ? -1 : width, iO < 0 ? -1 : iO);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = r().getWidth();
        }
        int i3 = this.d;
        if (i3 == -1) {
            iO = -1;
        } else if (i3 != -2) {
            iO = i3;
        }
        this.F.setWidth(width2);
        this.F.setHeight(iO);
        M(true);
        this.F.setOutsideTouchable((this.n || this.m) ? false : true);
        this.F.setTouchInterceptor(this.x);
        if (this.k) {
            tg9.a(this.F, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.F, this.D);
                } catch (Exception unused) {
                }
            }
        } else {
            d.a(this.F, this.D);
        }
        tg9.c(this.F, r(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if (!this.E || this.c.isInTouchMode()) {
            p();
        }
        if (this.E) {
            return;
        }
        this.B.post(this.z);
    }

    public Object t() {
        if (isShowing()) {
            return this.c.getSelectedItem();
        }
        return null;
    }

    public long u() {
        if (isShowing()) {
            return this.c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int v() {
        if (isShowing()) {
            return this.c.getSelectedItemPosition();
        }
        return -1;
    }

    public View w() {
        if (isShowing()) {
            return this.c.getSelectedView();
        }
        return null;
    }

    public int x() {
        return this.e;
    }

    public boolean y() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean z() {
        return this.E;
    }

    public i47(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public i47(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = Integer.MAX_VALUE;
        this.q = 0;
        this.w = new i();
        this.x = new h();
        this.y = new g();
        this.z = new e();
        this.C = new Rect();
        this.a = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d1a.l1, i2, i3);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(d1a.m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(d1a.n1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        tv tvVar = new tv(context, attributeSet, i2, i3);
        this.F = tvVar;
        tvVar.setInputMethodMode(1);
    }
}
