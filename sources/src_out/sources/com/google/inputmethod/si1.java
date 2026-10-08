package com.google.inputmethod;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class si1 extends lr9 {
    private final ColorDrawable p;
    private boolean q;
    private int r;

    public si1(int i) {
        super(i);
        this.p = new ColorDrawable();
        this.r = 0;
    }

    private void q(int i) {
        if (this.r != i) {
            this.r = i;
            this.p.setColor(i);
            i(this.p);
        }
    }

    @Override // com.google.inputmethod.lr9
    void a(int i) {
        if (this.q) {
            return;
        }
        q(i);
    }

    @Override // com.google.inputmethod.lr9
    boolean g() {
        return true;
    }

    public void p(int i) {
        this.q = true;
        q(i);
    }

    public si1(int i, int i2) {
        this(i);
        p(i2);
    }
}
