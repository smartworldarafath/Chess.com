package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.c;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class jf0 extends c {
    private State.Direction p0;
    private int q0;
    private androidx.constraintlayout.core.widgets.a r0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.Direction.values().length];
            a = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public jf0(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.state.a C(int i) {
        this.q0 = i;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.state.a D(Object obj) {
        C(this.l0.d(obj));
        return this;
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public void apply() {
        c0();
        int i = a.a[this.p0.ordinal()];
        int i2 = 3;
        if (i == 3 || i == 4) {
            i2 = 1;
        } else if (i == 5) {
            i2 = 2;
        } else if (i != 6) {
            i2 = 0;
        }
        this.r0.H1(i2);
        this.r0.I1(this.q0);
    }

    @Override // androidx.constraintlayout.core.state.c
    public gc5 c0() {
        if (this.r0 == null) {
            this.r0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.r0;
    }

    public void d0(State.Direction direction) {
        this.p0 = direction;
    }
}
