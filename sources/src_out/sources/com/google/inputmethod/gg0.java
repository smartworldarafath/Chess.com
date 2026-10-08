package com.google.inputmethod;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
abstract class gg0 {
    final Context a;
    private qpb<lec, MenuItem> b;
    private qpb<wec, SubMenu> c;

    gg0(Context context) {
        this.a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof lec)) {
            return menuItem;
        }
        lec lecVar = (lec) menuItem;
        if (this.b == null) {
            this.b = new qpb<>();
        }
        MenuItem menuItem2 = this.b.get(lecVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        mq7 mq7Var = new mq7(this.a, lecVar);
        this.b.put(lecVar, mq7Var);
        return mq7Var;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof wec)) {
            return subMenu;
        }
        wec wecVar = (wec) subMenu;
        if (this.c == null) {
            this.c = new qpb<>();
        }
        SubMenu subMenu2 = this.c.get(wecVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        lcc lccVar = new lcc(this.a, wecVar);
        this.c.put(wecVar, lccVar);
        return lccVar;
    }

    final void e() {
        qpb<lec, MenuItem> qpbVar = this.b;
        if (qpbVar != null) {
            qpbVar.clear();
        }
        qpb<wec, SubMenu> qpbVar2 = this.c;
        if (qpbVar2 != null) {
            qpbVar2.clear();
        }
    }

    final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.getSize()) {
            if (this.b.f(i2).getGroupId() == i) {
                this.b.h(i2);
                i2--;
            }
            i2++;
        }
    }

    final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.getSize(); i2++) {
            if (this.b.f(i2).getItemId() == i) {
                this.b.h(i2);
                return;
            }
        }
    }
}
