package com.google.inputmethod;

import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class s2c extends vk3<s2c> {
    private u2c B;
    private float C;
    private boolean D;

    public s2c(qh4 qh4Var) {
        super(qh4Var);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    private void A() {
        u2c u2cVar = this.B;
        if (u2cVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dB = u2cVar.b();
        if (dB > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dB < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public s2c B(u2c u2cVar) {
        this.B = u2cVar;
        return this;
    }

    public void C() {
        if (!x()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!f().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.D = true;
        }
    }

    @Override // com.google.inputmethod.vk3
    public void d() {
        super.d();
        float f = this.C;
        if (f != Float.MAX_VALUE) {
            u2c u2cVar = this.B;
            if (u2cVar == null) {
                this.B = new u2c(f);
            } else {
                u2cVar.g(f);
            }
            this.C = Float.MAX_VALUE;
        }
    }

    @Override // com.google.inputmethod.vk3
    void s(float f) {
    }

    @Override // com.google.inputmethod.vk3
    public void t() {
        A();
        this.B.i(h());
        super.t();
    }

    @Override // com.google.inputmethod.vk3
    boolean v(long j) {
        if (this.D) {
            float f = this.C;
            if (f != Float.MAX_VALUE) {
                this.B.g(f);
                this.C = Float.MAX_VALUE;
            }
            this.b = this.B.b();
            this.a = 0.0f;
            this.D = false;
            return true;
        }
        if (this.C != Float.MAX_VALUE) {
            long j2 = j / 2;
            vk3.p pVarJ = this.B.j(this.b, this.a, j2);
            this.B.g(this.C);
            this.C = Float.MAX_VALUE;
            vk3.p pVarJ2 = this.B.j(pVarJ.a, pVarJ.b, j2);
            this.b = pVarJ2.a;
            this.a = pVarJ2.b;
        } else {
            vk3.p pVarJ3 = this.B.j(this.b, this.a, j);
            this.b = pVarJ3.a;
            this.a = pVarJ3.b;
        }
        float fMax = Math.max(this.b, this.h);
        this.b = fMax;
        float fMin = Math.min(fMax, this.g);
        this.b = fMin;
        if (!z(fMin, this.a)) {
            return false;
        }
        this.b = this.B.b();
        this.a = 0.0f;
        return true;
    }

    public void w(float f) {
        if (i()) {
            this.C = f;
            return;
        }
        if (this.B == null) {
            this.B = new u2c(f);
        }
        this.B.g(f);
        t();
    }

    public boolean x() {
        return this.B.b > 0.0d;
    }

    public u2c y() {
        return this.B;
    }

    boolean z(float f, float f2) {
        return this.B.e(f, f2);
    }

    public <K> s2c(K k, ih4<K> ih4Var) {
        super(k, ih4Var);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    public <K> s2c(K k, ih4<K> ih4Var, float f) {
        super(k, ih4Var);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
        this.B = new u2c(f);
    }
}
