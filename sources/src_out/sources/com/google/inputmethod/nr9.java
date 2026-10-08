package com.google.inputmethod;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class nr9 extends FrameLayout {
    private static final Object c = new Object();
    private final List<lr9> a;
    private mr9 b;

    class a implements lr9.a.InterfaceC0114a {
        final /* synthetic */ FrameLayout.LayoutParams a;
        final /* synthetic */ View b;

        a(FrameLayout.LayoutParams layoutParams, View view) {
            this.a = layoutParams;
            this.b = view;
        }

        @Override // com.google.android.lr9.a.InterfaceC0114a
        public void a(Drawable drawable) {
            this.b.setBackground(drawable);
        }

        @Override // com.google.android.lr9.a.InterfaceC0114a
        public void b(int i) {
            FrameLayout.LayoutParams layoutParams = this.a;
            layoutParams.height = i;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.lr9.a.InterfaceC0114a
        public void c(float f) {
            this.b.setAlpha(f);
        }

        @Override // com.google.android.lr9.a.InterfaceC0114a
        public void d(int i) {
            FrameLayout.LayoutParams layoutParams = this.a;
            layoutParams.width = i;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.lr9.a.InterfaceC0114a
        public void e(float f) {
            this.b.setTranslationX(f);
        }

        @Override // com.google.android.lr9.a.InterfaceC0114a
        public void f(float f) {
            this.b.setTranslationY(f);
        }

        @Override // com.google.android.lr9.a.InterfaceC0114a
        public void g(uy5 uy5Var) {
            FrameLayout.LayoutParams layoutParams = this.a;
            layoutParams.leftMargin = uy5Var.a;
            layoutParams.topMargin = uy5Var.b;
            layoutParams.rightMargin = uy5Var.c;
            layoutParams.bottomMargin = uy5Var.d;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.lr9.a.InterfaceC0114a
        public void onVisibilityChanged(boolean z) {
            this.b.setVisibility(z ? 0 : 8);
        }
    }

    public nr9(Context context, List<lr9> list) {
        super(context);
        this.a = new ArrayList();
        setProtections(list);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    private void a(Context context, int i, lr9 lr9Var) {
        int iQ;
        int i2;
        int iM;
        lr9.a aVarC = lr9Var.c();
        int iE = lr9Var.e();
        int i3 = -1;
        if (iE != 1) {
            if (iE == 2) {
                iM = aVarC.m();
                i2 = 48;
            } else if (iE == 4) {
                iQ = aVarC.q();
                i2 = 5;
            } else {
                if (iE != 8) {
                    throw new IllegalArgumentException("Unexpected side: " + lr9Var.e());
                }
                iM = aVarC.m();
                i2 = 80;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, iM, i2);
            uy5 uy5VarN = aVarC.n();
            layoutParams.leftMargin = uy5VarN.a;
            layoutParams.topMargin = uy5VarN.b;
            layoutParams.rightMargin = uy5VarN.c;
            layoutParams.bottomMargin = uy5VarN.d;
            View view = new View(context);
            view.setTag(c);
            view.setTranslationX(aVarC.o());
            view.setTranslationY(aVarC.p());
            view.setAlpha(aVarC.k());
            view.setVisibility(aVarC.r() ? 0 : 8);
            view.setBackground(aVarC.l());
            aVarC.t(new a(layoutParams, view));
            addView(view, i, layoutParams);
        }
        iQ = aVarC.q();
        i2 = 3;
        i3 = iQ;
        iM = -1;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i3, iM, i2);
        uy5 uy5VarN2 = aVarC.n();
        layoutParams2.leftMargin = uy5VarN2.a;
        layoutParams2.topMargin = uy5VarN2.b;
        layoutParams2.rightMargin = uy5VarN2.c;
        layoutParams2.bottomMargin = uy5VarN2.d;
        View view2 = new View(context);
        view2.setTag(c);
        view2.setTranslationX(aVarC.o());
        view2.setTranslationY(aVarC.p());
        view2.setAlpha(aVarC.k());
        view2.setVisibility(aVarC.r() ? 0 : 8);
        view2.setBackground(aVarC.l());
        aVarC.t(new a(layoutParams2, view2));
        addView(view2, i, layoutParams2);
    }

    private void b() {
        if (this.a.isEmpty()) {
            d();
            return;
        }
        pic orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        d();
        this.b = new mr9(orInstallSystemBarStateMonitor, this.a);
        int childCount = getChildCount();
        int i = this.b.i();
        for (int i2 = 0; i2 < i; i2++) {
            a(getContext(), i2 + childCount, this.b.h(i2));
        }
    }

    private void c() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(bz9.R);
        if (tag instanceof pic) {
            pic picVar = (pic) tag;
            if (picVar.l()) {
                return;
            }
            picVar.i();
            viewGroup.setTag(bz9.R, null);
        }
    }

    private void d() {
        if (this.b != null) {
            removeViews(getChildCount() - this.b.i(), this.b.i());
            int i = this.b.i();
            for (int i2 = 0; i2 < i; i2++) {
                this.b.h(i2).c().t(null);
            }
            this.b.g();
            this.b = null;
        }
    }

    private pic getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(bz9.R);
        if (tag instanceof pic) {
            return (pic) tag;
        }
        pic picVar = new pic(viewGroup);
        viewGroup.setTag(bz9.R, picVar);
        return picVar;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != c) {
            mr9 mr9Var = this.b;
            int childCount = getChildCount() - (mr9Var != null ? mr9Var.i() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        c();
    }

    public void setProtections(List<lr9> list) {
        this.a.clear();
        this.a.addAll(list);
        if (isAttachedToWindow()) {
            b();
            requestApplyInsets();
        }
    }
}
