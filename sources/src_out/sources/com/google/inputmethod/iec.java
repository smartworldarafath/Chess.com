package com.google.inputmethod;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class iec extends ActionMode {
    final Context a;
    final t7 b;

    public static class a implements t7.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<iec> c = new ArrayList<>();
        final qpb<Menu, Menu> d = new qpb<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            wq7 wq7Var = new wq7(this.b, (jec) menu);
            this.d.put(menu, wq7Var);
            return wq7Var;
        }

        @Override // com.google.android.t7.a
        public boolean a(t7 t7Var, Menu menu) {
            return this.a.onPrepareActionMode(e(t7Var), f(menu));
        }

        @Override // com.google.android.t7.a
        public boolean b(t7 t7Var, Menu menu) {
            return this.a.onCreateActionMode(e(t7Var), f(menu));
        }

        @Override // com.google.android.t7.a
        public boolean c(t7 t7Var, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(t7Var), new mq7(this.b, (lec) menuItem));
        }

        @Override // com.google.android.t7.a
        public void d(t7 t7Var) {
            this.a.onDestroyActionMode(e(t7Var));
        }

        public ActionMode e(t7 t7Var) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                iec iecVar = this.c.get(i);
                if (iecVar != null && iecVar.b == t7Var) {
                    return iecVar;
                }
            }
            iec iecVar2 = new iec(this.b, t7Var);
            this.c.add(iecVar2);
            return iecVar2;
        }
    }

    public iec(Context context, t7 t7Var) {
        this.a = context;
        this.b = t7Var;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new wq7(this.a, (jec) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.q(i);
    }
}
