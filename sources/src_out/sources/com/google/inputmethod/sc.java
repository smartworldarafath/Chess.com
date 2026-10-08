package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.a;
import androidx.constraintlayout.core.state.c;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class sc extends c {
    private float p0;

    public sc(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.p0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public void apply() {
        Iterator<Object> it = this.n0.iterator();
        while (it.hasNext()) {
            a aVarC = this.l0.c(it.next());
            aVarC.o();
            Object obj = this.S;
            if (obj != null) {
                aVarC.X(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    aVarC.W(obj2);
                } else {
                    aVarC.X(State.j);
                }
            }
            Object obj3 = this.V;
            if (obj3 != null) {
                aVarC.k(obj3);
            } else {
                Object obj4 = this.W;
                if (obj4 != null) {
                    aVarC.j(obj4);
                } else {
                    aVarC.j(State.j);
                }
            }
            float f = this.p0;
            if (f != 0.5f) {
                aVarC.Y(f);
            }
        }
    }
}
