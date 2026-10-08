package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.a;
import androidx.constraintlayout.core.state.c;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class rc extends c {
    private float p0;

    public rc(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.p0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public void apply() {
        Iterator<Object> it = this.n0.iterator();
        while (it.hasNext()) {
            a aVarC = this.l0.c(it.next());
            aVarC.n();
            Object obj = this.O;
            if (obj != null) {
                aVarC.U(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    aVarC.T(obj2);
                } else {
                    aVarC.U(State.j);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                aVarC.t(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    aVarC.s(obj4);
                } else {
                    aVarC.s(State.j);
                }
            }
            float f = this.p0;
            if (f != 0.5f) {
                aVarC.y(f);
            }
        }
    }
}
