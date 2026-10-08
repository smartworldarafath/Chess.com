package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class s4e extends s71 {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            a = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public s4e(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public void apply() {
        Iterator<Object> it = this.n0.iterator();
        while (it.hasNext()) {
            this.l0.c(it.next()).o();
        }
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        for (Object obj : this.n0) {
            androidx.constraintlayout.core.state.a aVarC = this.l0.c(obj);
            if (aVar2 == null) {
                Object obj2 = this.S;
                if (obj2 != null) {
                    aVarC.X(obj2).C(this.o).E(this.u);
                } else {
                    Object obj3 = this.T;
                    if (obj3 != null) {
                        aVarC.W(obj3).C(this.o).E(this.u);
                    } else {
                        String string = aVarC.getKey().toString();
                        aVarC.X(State.j).D(Float.valueOf(g0(string))).F(Float.valueOf(f0(string)));
                    }
                }
                aVar2 = aVarC;
            }
            if (aVar != null) {
                String string2 = aVar.getKey().toString();
                String string3 = aVarC.getKey().toString();
                aVar.k(aVarC.getKey()).D(Float.valueOf(e0(string2))).F(Float.valueOf(d0(string2)));
                aVarC.W(aVar.getKey()).D(Float.valueOf(g0(string3))).F(Float.valueOf(f0(string3)));
            }
            float fH0 = h0(obj.toString());
            if (fH0 != -1.0f) {
                aVarC.P(fH0);
            }
            aVar = aVarC;
        }
        if (aVar != null) {
            Object obj4 = this.V;
            if (obj4 != null) {
                aVar.k(obj4).C(this.p).E(this.v);
            } else {
                Object obj5 = this.W;
                if (obj5 != null) {
                    aVar.j(obj5).C(this.p).E(this.v);
                } else {
                    String string4 = aVar.getKey().toString();
                    aVar.j(State.j).D(Float.valueOf(e0(string4))).F(Float.valueOf(d0(string4)));
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f = this.p0;
        if (f != 0.5f) {
            aVar2.Y(f);
        }
        int i = a.a[this.v0.ordinal()];
        if (i == 1) {
            aVar2.O(0);
        } else if (i == 2) {
            aVar2.O(1);
        } else {
            if (i != 3) {
                return;
            }
            aVar2.O(2);
        }
    }
}
