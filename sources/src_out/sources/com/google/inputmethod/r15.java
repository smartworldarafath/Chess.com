package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.c;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class r15 extends c {
    private String A0;
    private String B0;
    private String C0;
    private int D0;
    private p15 p0;
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private int v0;
    private int w0;
    private float x0;
    private float y0;
    private String z0;

    public r15(State state, State.Helper helper) {
        super(state, helper);
        this.q0 = 0;
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = 0;
        if (helper == State.Helper.ROW) {
            this.v0 = 1;
        } else if (helper == State.Helper.COLUMN) {
            this.w0 = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public void apply() {
        c0();
        this.p0.x2(this.u0);
        int i = this.v0;
        if (i != 0) {
            this.p0.z2(i);
        }
        int i2 = this.w0;
        if (i2 != 0) {
            this.p0.u2(i2);
        }
        float f = this.x0;
        if (f != 0.0f) {
            this.p0.w2(f);
        }
        float f2 = this.y0;
        if (f2 != 0.0f) {
            this.p0.C2(f2);
        }
        String str = this.z0;
        if (str != null && !str.isEmpty()) {
            this.p0.y2(this.z0);
        }
        String str2 = this.A0;
        if (str2 != null && !str2.isEmpty()) {
            this.p0.t2(this.A0);
        }
        String str3 = this.B0;
        if (str3 != null && !str3.isEmpty()) {
            this.p0.B2(this.B0);
        }
        String str4 = this.C0;
        if (str4 != null && !str4.isEmpty()) {
            this.p0.A2(this.C0);
        }
        this.p0.v2(this.D0);
        this.p0.U1(this.q0);
        this.p0.R1(this.r0);
        this.p0.V1(this.s0);
        this.p0.Q1(this.t0);
        b0();
    }

    @Override // androidx.constraintlayout.core.state.c
    public gc5 c0() {
        if (this.p0 == null) {
            this.p0 = new p15();
        }
        return this.p0;
    }
}
