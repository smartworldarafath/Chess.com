package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.c;
import androidx.constraintlayout.core.widgets.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class ij4 extends c {
    protected int A0;
    protected int B0;
    protected int C0;
    protected int D0;
    protected int E0;
    protected int F0;
    protected int G0;
    protected float H0;
    protected float I0;
    protected float J0;
    protected float K0;
    protected e p0;
    protected int q0;
    protected int r0;
    protected int s0;
    protected int t0;
    protected int u0;
    protected int v0;
    protected int w0;
    protected int x0;
    protected int y0;
    protected int z0;

    public ij4(State state, State.Helper helper) {
        super(state, helper);
        this.q0 = 0;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = 2;
        this.y0 = 2;
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = -1;
        this.G0 = 0;
        this.H0 = 0.5f;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        if (helper == State.Helper.VERTICAL_FLOW) {
            this.G0 = 1;
        }
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public void apply() {
        c0();
        b(this.p0);
        this.p0.K2(this.G0);
        this.p0.P2(this.q0);
        int i = this.F0;
        if (i != -1) {
            this.p0.J2(i);
        }
        int i2 = this.B0;
        if (i2 != 0) {
            this.p0.S1(i2);
        }
        int i3 = this.D0;
        if (i3 != 0) {
            this.p0.V1(i3);
        }
        int i4 = this.C0;
        if (i4 != 0) {
            this.p0.T1(i4);
        }
        int i5 = this.E0;
        if (i5 != 0) {
            this.p0.Q1(i5);
        }
        int i6 = this.A0;
        if (i6 != 0) {
            this.p0.D2(i6);
        }
        int i7 = this.z0;
        if (i7 != 0) {
            this.p0.N2(i7);
        }
        float f = this.i;
        if (f != 0.5f) {
            this.p0.C2(f);
        }
        float f2 = this.J0;
        if (f2 != 0.5f) {
            this.p0.x2(f2);
        }
        float f3 = this.K0;
        if (f3 != 0.5f) {
            this.p0.F2(f3);
        }
        float f4 = this.j;
        if (f4 != 0.5f) {
            this.p0.M2(f4);
        }
        float f5 = this.H0;
        if (f5 != 0.5f) {
            this.p0.z2(f5);
        }
        float f6 = this.I0;
        if (f6 != 0.5f) {
            this.p0.H2(f6);
        }
        int i8 = this.y0;
        if (i8 != 2) {
            this.p0.B2(i8);
        }
        int i9 = this.x0;
        if (i9 != 2) {
            this.p0.L2(i9);
        }
        int i10 = this.r0;
        if (i10 != -1) {
            this.p0.O2(i10);
        }
        int i11 = this.s0;
        if (i11 != -1) {
            this.p0.A2(i11);
        }
        int i12 = this.t0;
        if (i12 != -1) {
            this.p0.I2(i12);
        }
        int i13 = this.u0;
        if (i13 != -1) {
            this.p0.E2(i13);
        }
        int i14 = this.v0;
        if (i14 != -1) {
            this.p0.y2(i14);
        }
        int i15 = this.w0;
        if (i15 != -1) {
            this.p0.G2(i15);
        }
        b0();
    }

    @Override // androidx.constraintlayout.core.state.c
    public gc5 c0() {
        if (this.p0 == null) {
            this.p0 = new e();
        }
        return this.p0;
    }
}
