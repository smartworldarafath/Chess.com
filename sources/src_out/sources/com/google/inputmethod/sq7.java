package com.google.inputmethod;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class sq7 extends i47 implements lq7 {
    private static Method J;
    private lq7 I;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    public static class c extends zi3 {
        final int n;
        final int o;
        private lq7 p;
        private MenuItem q;

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.n = 21;
                this.o = 22;
            } else {
                this.n = 22;
                this.o = 21;
            }
        }

        @Override // com.google.inputmethod.zi3
        public /* bridge */ /* synthetic */ int d(int i, int i2, int i3, int i4, int i5) {
            return super.d(i, i2, i3, i4, i5);
        }

        @Override // com.google.inputmethod.zi3
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i) {
            return super.e(motionEvent, i);
        }

        @Override // com.google.inputmethod.zi3, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // com.google.inputmethod.zi3, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // com.google.inputmethod.zi3, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // com.google.inputmethod.zi3, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // com.google.inputmethod.zi3, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            d dVar;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (d) adapter;
                    headersCount = 0;
                }
                g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= dVar.getCount()) ? null : dVar.getItem(i);
                MenuItem menuItem = this.q;
                if (menuItem != item) {
                    e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.p.h(eVarB, menuItem);
                    }
                    this.q = item;
                    if (item != null) {
                        this.p.a(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.o) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (d) adapter).b().e(false);
            return true;
        }

        @Override // com.google.inputmethod.zi3, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(lq7 lq7Var) {
            this.p = lq7Var;
        }

        @Override // com.google.inputmethod.zi3, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public sq7(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void Q(Object obj) {
        a.a(this.F, (Transition) obj);
    }

    public void R(Object obj) {
        a.b(this.F, (Transition) obj);
    }

    public void S(lq7 lq7Var) {
        this.I = lq7Var;
    }

    public void T(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.F, z);
            return;
        }
        Method method = J;
        if (method != null) {
            try {
                method.invoke(this.F, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.inputmethod.lq7
    public void a(e eVar, MenuItem menuItem) {
        lq7 lq7Var = this.I;
        if (lq7Var != null) {
            lq7Var.a(eVar, menuItem);
        }
    }

    @Override // com.google.inputmethod.lq7
    public void h(e eVar, MenuItem menuItem) {
        lq7 lq7Var = this.I;
        if (lq7Var != null) {
            lq7Var.h(eVar, menuItem);
        }
    }

    @Override // com.google.inputmethod.i47
    zi3 q(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
