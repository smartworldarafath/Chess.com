package com.google.inputmethod;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class mr9 implements pic.d {
    private final ArrayList<lr9> a = new ArrayList<>();
    private final pic b;
    private uy5 c;
    private uy5 d;
    private int e;
    private boolean f;

    mr9(pic picVar, List<lr9> list) {
        uy5 uy5Var = uy5.e;
        this.c = uy5Var;
        this.d = uy5Var;
        f(list, false);
        f(list, true);
        picVar.g(this);
        this.b = picVar;
    }

    private void f(List<lr9> list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lr9 lr9Var = list.get(i);
            if (lr9Var.g() == z) {
                Object objD = lr9Var.d();
                if (objD != null) {
                    throw new IllegalStateException(lr9Var + " (" + (i + 1) + "/" + size + ") is already controlled by " + objD + " but is still added to " + this);
                }
                lr9Var.h(this);
                this.a.add(lr9Var);
            }
        }
    }

    private void j() {
        uy5 uy5VarB = uy5.e;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            uy5VarB = uy5.b(uy5VarB, this.a.get(size).b(this.c, this.d, uy5VarB));
        }
    }

    @Override // com.google.android.pic.d
    public void a(uy5 uy5Var, uy5 uy5Var2) {
        this.c = uy5Var;
        this.d = uy5Var2;
        j();
    }

    @Override // com.google.android.pic.d
    public void b() {
        this.e++;
    }

    @Override // com.google.android.pic.d
    public void c() {
        int i = this.e;
        boolean z = i > 0;
        int i2 = i - 1;
        this.e = i2;
        if (z && i2 == 0) {
            j();
        }
    }

    @Override // com.google.android.pic.d
    public void d(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            this.a.get(size).a(i);
        }
    }

    @Override // com.google.android.pic.d
    public void e(int i, uy5 uy5Var, RectF rectF) {
        uy5 uy5Var2 = this.d;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            lr9 lr9Var = this.a.get(size);
            int iE = lr9Var.e();
            if ((iE & i) != 0) {
                lr9Var.l(true);
                if (iE == 1) {
                    int i2 = uy5Var2.a;
                    if (i2 > 0) {
                        lr9Var.k(uy5Var.a / i2);
                    }
                    lr9Var.j(rectF.left);
                } else if (iE == 2) {
                    int i3 = uy5Var2.b;
                    if (i3 > 0) {
                        lr9Var.k(uy5Var.b / i3);
                    }
                    lr9Var.j(rectF.top);
                } else if (iE == 4) {
                    int i4 = uy5Var2.c;
                    if (i4 > 0) {
                        lr9Var.k(uy5Var.c / i4);
                    }
                    lr9Var.j(rectF.right);
                } else if (iE == 8) {
                    int i5 = uy5Var2.d;
                    if (i5 > 0) {
                        lr9Var.k(uy5Var.d / i5);
                    }
                    lr9Var.j(rectF.bottom);
                }
            }
        }
    }

    void g() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.b.m(this);
        for (int size = this.a.size() - 1; size >= 0; size--) {
            this.a.get(size).h(null);
        }
        this.a.clear();
    }

    lr9 h(int i) {
        return this.a.get(i);
    }

    int i() {
        return this.a.size();
    }
}
