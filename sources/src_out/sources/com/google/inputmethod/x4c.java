package com.google.inputmethod;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class x4c extends t7 implements e.a {
    private Context c;
    private ActionBarContextView d;
    private t7.a e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private e i;

    public x4c(Context context, ActionBarContextView actionBarContextView, t7.a aVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = aVar;
        e eVarX = new e(actionBarContextView.getContext()).X(1);
        this.i = eVarX;
        eVarX.W(this);
        this.h = z;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(e eVar, MenuItem menuItem) {
        return this.e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(e eVar) {
        k();
        this.d.l();
    }

    @Override // com.google.inputmethod.t7
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.d(this);
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
        return this.i;
    }

    @Override // com.google.inputmethod.t7
    public MenuInflater f() {
        return new kec(this.d.getContext());
    }

    @Override // com.google.inputmethod.t7
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // com.google.inputmethod.t7
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override // com.google.inputmethod.t7
    public void k() {
        this.e.a(this, this.i);
    }

    @Override // com.google.inputmethod.t7
    public boolean l() {
        return this.d.j();
    }

    @Override // com.google.inputmethod.t7
    public void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // com.google.inputmethod.t7
    public void n(int i) {
        o(this.c.getString(i));
    }

    @Override // com.google.inputmethod.t7
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // com.google.inputmethod.t7
    public void q(int i) {
        r(this.c.getString(i));
    }

    @Override // com.google.inputmethod.t7
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // com.google.inputmethod.t7
    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
