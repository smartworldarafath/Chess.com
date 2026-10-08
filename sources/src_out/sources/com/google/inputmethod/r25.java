package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class r25 implements k44, bca {
    final State a;
    private int b;
    private f c;
    private int d = -1;
    private int e = -1;
    private float f = 0.0f;
    private Object g;

    public r25(State state) {
        this.a = state;
    }

    @Override // com.google.inputmethod.k44, com.google.inputmethod.bca
    public ConstraintWidget a() {
        if (this.c == null) {
            this.c = new f();
        }
        return this.c;
    }

    @Override // com.google.inputmethod.k44, com.google.inputmethod.bca
    public void apply() {
        this.c.H1(this.b);
        int i = this.d;
        if (i != -1) {
            this.c.E1(i);
            return;
        }
        int i2 = this.e;
        if (i2 != -1) {
            this.c.F1(i2);
        } else {
            this.c.G1(this.f);
        }
    }

    @Override // com.google.inputmethod.bca
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof f) {
            this.c = (f) constraintWidget;
        } else {
            this.c = null;
        }
    }

    @Override // com.google.inputmethod.bca
    public void c(Object obj) {
        this.g = obj;
    }

    @Override // com.google.inputmethod.bca
    public k44 d() {
        return null;
    }

    public r25 e(float f) {
        this.d = -1;
        this.e = -1;
        this.f = f;
        return this;
    }

    public void f(int i) {
        this.b = i;
    }

    @Override // com.google.inputmethod.bca
    public Object getKey() {
        return this.g;
    }
}
