package com.google.inputmethod;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class of5 extends s71 {

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

    public of5(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.c, androidx.constraintlayout.core.state.a, com.google.inputmethod.bca
    public void apply() {
        Iterator<Object> it = this.n0.iterator();
        while (it.hasNext()) {
            this.l0.c(it.next()).n();
        }
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        for (Object obj : this.n0) {
            androidx.constraintlayout.core.state.a aVarC = this.l0.c(obj);
            if (aVar2 == null) {
                Object obj2 = this.O;
                if (obj2 != null) {
                    aVarC.U(obj2).C(this.m).E(this.s);
                } else {
                    Object obj3 = this.P;
                    if (obj3 != null) {
                        aVarC.T(obj3).C(this.m).E(this.s);
                    } else {
                        Object obj4 = this.K;
                        if (obj4 != null) {
                            aVarC.U(obj4).C(this.k).E(this.q);
                        } else {
                            Object obj5 = this.L;
                            if (obj5 != null) {
                                aVarC.T(obj5).C(this.k).E(this.q);
                            } else {
                                String string = aVarC.getKey().toString();
                                aVarC.U(State.j).D(Float.valueOf(g0(string))).F(Float.valueOf(f0(string)));
                            }
                        }
                    }
                }
                aVar2 = aVarC;
            }
            if (aVar != null) {
                String string2 = aVar.getKey().toString();
                String string3 = aVarC.getKey().toString();
                aVar.t(aVarC.getKey()).D(Float.valueOf(e0(string2))).F(Float.valueOf(d0(string2)));
                aVarC.T(aVar.getKey()).D(Float.valueOf(g0(string3))).F(Float.valueOf(f0(string3)));
            }
            float fH0 = h0(obj.toString());
            if (fH0 != -1.0f) {
                aVarC.M(fH0);
            }
            aVar = aVarC;
        }
        if (aVar != null) {
            Object obj6 = this.Q;
            if (obj6 != null) {
                aVar.t(obj6).C(this.n).E(this.t);
            } else {
                Object obj7 = this.R;
                if (obj7 != null) {
                    aVar.s(obj7).C(this.n).E(this.t);
                } else {
                    Object obj8 = this.M;
                    if (obj8 != null) {
                        aVar.t(obj8).C(this.l).E(this.r);
                    } else {
                        Object obj9 = this.N;
                        if (obj9 != null) {
                            aVar.s(obj9).C(this.l).E(this.r);
                        } else {
                            String string4 = aVar.getKey().toString();
                            aVar.s(State.j).D(Float.valueOf(e0(string4))).F(Float.valueOf(d0(string4)));
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f = this.p0;
        if (f != 0.5f) {
            aVar2.y(f);
        }
        int i = a.a[this.v0.ordinal()];
        if (i == 1) {
            aVar2.L(0);
        } else if (i == 2) {
            aVar2.L(1);
        } else {
            if (i != 3) {
                return;
            }
            aVar2.L(2);
        }
    }
}
