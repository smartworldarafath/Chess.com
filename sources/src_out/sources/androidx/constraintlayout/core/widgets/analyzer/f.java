package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class f {
    private static b.a a = new b.a();
    private static int b = 0;
    private static int c = 0;

    private static boolean a(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = constraintWidget.C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourX = constraintWidget.X();
        androidx.constraintlayout.core.widgets.d dVar = constraintWidget.N() != null ? (androidx.constraintlayout.core.widgets.d) constraintWidget.N() : null;
        if (dVar != null) {
            dVar.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            dVar.X();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = dimensionBehaviourC == dimensionBehaviour5 || constraintWidget.r0() || dimensionBehaviourC == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourC == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.w == 0 && constraintWidget.f0 == 0.0f && constraintWidget.e0(0)) || (dimensionBehaviourC == dimensionBehaviour2 && constraintWidget.w == 1 && constraintWidget.h0(0, constraintWidget.a0()));
        boolean z2 = dimensionBehaviourX == dimensionBehaviour5 || constraintWidget.s0() || dimensionBehaviourX == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourX == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.x == 0 && constraintWidget.f0 == 0.0f && constraintWidget.e0(1)) || (dimensionBehaviourX == dimensionBehaviour && constraintWidget.x == 1 && constraintWidget.h0(1, constraintWidget.z()));
        if (constraintWidget.f0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    private static void b(int i, ConstraintWidget constraintWidget, b.InterfaceC0068b interfaceC0068b, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.k0()) {
            return;
        }
        boolean z2 = true;
        b++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.q0()) {
            int i2 = i + 1;
            if (a(i2, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.b2(i2, constraintWidget, interfaceC0068b, new b.a(), b.a.k);
            }
        }
        ConstraintAnchor constraintAnchorQ = constraintWidget.q(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorQ2 = constraintWidget.q(ConstraintAnchor.Type.RIGHT);
        int iE = constraintAnchorQ.e();
        int iE2 = constraintAnchorQ2.e();
        if (constraintAnchorQ.d() != null && constraintAnchorQ.n()) {
            Iterator<ConstraintAnchor> it = constraintAnchorQ.d().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                int i3 = i + 1;
                boolean zA = a(i3, constraintWidget2);
                if (constraintWidget2.q0() && zA) {
                    androidx.constraintlayout.core.widgets.d.b2(i3, constraintWidget2, interfaceC0068b, new b.a(), b.a.k);
                }
                boolean z3 = ((next == constraintWidget2.Q && (constraintAnchor4 = constraintWidget2.S.f) != null && constraintAnchor4.n()) || (next == constraintWidget2.S && (constraintAnchor3 = constraintWidget2.Q.f) != null && constraintAnchor3.n())) ? z2 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourC = constraintWidget2.C();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourC != dimensionBehaviour || zA) {
                    if (!constraintWidget2.q0()) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget2.Q;
                        if (next == constraintAnchor5 && constraintWidget2.S.f == null) {
                            int iF = constraintAnchor5.f() + iE;
                            constraintWidget2.M0(iF, constraintWidget2.a0() + iF);
                            b(i3, constraintWidget2, interfaceC0068b, z);
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintWidget2.S;
                            if (next == constraintAnchor6 && constraintAnchor5.f == null) {
                                int iF2 = iE - constraintAnchor6.f();
                                constraintWidget2.M0(iF2 - constraintWidget2.a0(), iF2);
                                b(i3, constraintWidget2, interfaceC0068b, z);
                            } else if (z3 && !constraintWidget2.m0()) {
                                d(i3, interfaceC0068b, constraintWidget2, z);
                            }
                        }
                    }
                } else if (constraintWidget2.C() == dimensionBehaviour && constraintWidget2.A >= 0 && constraintWidget2.z >= 0 && ((constraintWidget2.Z() == 8 || (constraintWidget2.w == 0 && constraintWidget2.x() == 0.0f)) && !constraintWidget2.m0() && !constraintWidget2.p0() && z3 && !constraintWidget2.m0())) {
                    e(i3, constraintWidget, interfaceC0068b, constraintWidget2, z);
                }
                z2 = z2;
            }
        }
        boolean z4 = z2;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (constraintAnchorQ2.d() != null && constraintAnchorQ2.n()) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorQ2.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                int i4 = i + 1;
                boolean zA2 = a(i4, constraintWidget3);
                if (constraintWidget3.q0() && zA2) {
                    androidx.constraintlayout.core.widgets.d.b2(i4, constraintWidget3, interfaceC0068b, new b.a(), b.a.k);
                }
                boolean z5 = ((next2 == constraintWidget3.Q && (constraintAnchor2 = constraintWidget3.S.f) != null && constraintAnchor2.n()) || (next2 == constraintWidget3.S && (constraintAnchor = constraintWidget3.Q.f) != null && constraintAnchor.n())) ? z4 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourC2 = constraintWidget3.C();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourC2 != dimensionBehaviour2 || zA2) {
                    if (!constraintWidget3.q0()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget3.Q;
                        if (next2 == constraintAnchor7 && constraintWidget3.S.f == null) {
                            int iF3 = constraintAnchor7.f() + iE2;
                            constraintWidget3.M0(iF3, constraintWidget3.a0() + iF3);
                            b(i4, constraintWidget3, interfaceC0068b, z);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.S;
                            if (next2 == constraintAnchor8 && constraintAnchor7.f == null) {
                                int iF4 = iE2 - constraintAnchor8.f();
                                constraintWidget3.M0(iF4 - constraintWidget3.a0(), iF4);
                                b(i4, constraintWidget3, interfaceC0068b, z);
                            } else if (z5 && !constraintWidget3.m0()) {
                                d(i4, interfaceC0068b, constraintWidget3, z);
                            }
                        }
                    }
                } else if (constraintWidget3.C() == dimensionBehaviour2 && constraintWidget3.A >= 0 && constraintWidget3.z >= 0 && (constraintWidget3.Z() == 8 || (constraintWidget3.w == 0 && constraintWidget3.x() == 0.0f))) {
                    if (!constraintWidget3.m0() && !constraintWidget3.p0() && z5 && !constraintWidget3.m0()) {
                        e(i4, constraintWidget, interfaceC0068b, constraintWidget3, z);
                    }
                }
            }
        }
        constraintWidget.u0();
    }

    private static void c(int i, androidx.constraintlayout.core.widgets.a aVar, b.InterfaceC0068b interfaceC0068b, int i2, boolean z) {
        if (aVar.A1()) {
            if (i2 == 0) {
                b(i + 1, aVar, interfaceC0068b, z);
            } else {
                i(i + 1, aVar, interfaceC0068b);
            }
        }
    }

    private static void d(int i, b.InterfaceC0068b interfaceC0068b, ConstraintWidget constraintWidget, boolean z) {
        float fA = constraintWidget.A();
        int iE = constraintWidget.Q.f.e();
        int iE2 = constraintWidget.S.f.e();
        int iF = constraintWidget.Q.f() + iE;
        int iF2 = iE2 - constraintWidget.S.f();
        if (iE == iE2) {
            fA = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iA0 = constraintWidget.a0();
        int i2 = (iE2 - iE) - iA0;
        if (iE > iE2) {
            i2 = (iE - iE2) - iA0;
        }
        int i3 = ((int) (i2 > 0 ? (fA * i2) + 0.5f : fA * i2)) + iE;
        int i4 = i3 + iA0;
        if (iE > iE2) {
            i4 = i3 - iA0;
        }
        constraintWidget.M0(i3, i4);
        b(i + 1, constraintWidget, interfaceC0068b, z);
    }

    private static void e(int i, ConstraintWidget constraintWidget, b.InterfaceC0068b interfaceC0068b, ConstraintWidget constraintWidget2, boolean z) {
        float fA = constraintWidget2.A();
        int iE = constraintWidget2.Q.f.e() + constraintWidget2.Q.f();
        int iE2 = constraintWidget2.S.f.e() - constraintWidget2.S.f();
        if (iE2 >= iE) {
            int iA0 = constraintWidget2.a0();
            if (constraintWidget2.Z() != 8) {
                int i2 = constraintWidget2.w;
                if (i2 == 2) {
                    iA0 = (int) (constraintWidget2.A() * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.a0() : constraintWidget.N().a0()));
                } else if (i2 == 0) {
                    iA0 = iE2 - iE;
                }
                iA0 = Math.max(constraintWidget2.z, iA0);
                int i3 = constraintWidget2.A;
                if (i3 > 0) {
                    iA0 = Math.min(i3, iA0);
                }
            }
            int i4 = iE + ((int) ((fA * ((iE2 - iE) - iA0)) + 0.5f));
            constraintWidget2.M0(i4, iA0 + i4);
            b(i + 1, constraintWidget2, interfaceC0068b, z);
        }
    }

    private static void f(int i, b.InterfaceC0068b interfaceC0068b, ConstraintWidget constraintWidget) {
        float fV = constraintWidget.V();
        int iE = constraintWidget.R.f.e();
        int iE2 = constraintWidget.T.f.e();
        int iF = constraintWidget.R.f() + iE;
        int iF2 = iE2 - constraintWidget.T.f();
        if (iE == iE2) {
            fV = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iZ = constraintWidget.z();
        int i2 = (iE2 - iE) - iZ;
        if (iE > iE2) {
            i2 = (iE - iE2) - iZ;
        }
        int i3 = (int) (i2 > 0 ? (fV * i2) + 0.5f : fV * i2);
        int i4 = iE + i3;
        int i5 = i4 + iZ;
        if (iE > iE2) {
            i4 = iE - i3;
            i5 = i4 - iZ;
        }
        constraintWidget.P0(i4, i5);
        i(i + 1, constraintWidget, interfaceC0068b);
    }

    private static void g(int i, ConstraintWidget constraintWidget, b.InterfaceC0068b interfaceC0068b, ConstraintWidget constraintWidget2) {
        float fV = constraintWidget2.V();
        int iE = constraintWidget2.R.f.e() + constraintWidget2.R.f();
        int iE2 = constraintWidget2.T.f.e() - constraintWidget2.T.f();
        if (iE2 >= iE) {
            int iZ = constraintWidget2.z();
            if (constraintWidget2.Z() != 8) {
                int i2 = constraintWidget2.x;
                if (i2 == 2) {
                    iZ = (int) (fV * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.d ? constraintWidget.z() : constraintWidget.N().z()));
                } else if (i2 == 0) {
                    iZ = iE2 - iE;
                }
                iZ = Math.max(constraintWidget2.C, iZ);
                int i3 = constraintWidget2.D;
                if (i3 > 0) {
                    iZ = Math.min(i3, iZ);
                }
            }
            int i4 = iE + ((int) ((fV * ((iE2 - iE) - iZ)) + 0.5f));
            constraintWidget2.P0(i4, iZ + i4);
            i(i + 1, constraintWidget2, interfaceC0068b);
        }
    }

    public static void h(androidx.constraintlayout.core.widgets.d dVar, b.InterfaceC0068b interfaceC0068b) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = dVar.C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourX = dVar.X();
        b = 0;
        c = 0;
        dVar.A0();
        ArrayList<ConstraintWidget> arrayListZ1 = dVar.z1();
        int size = arrayListZ1.size();
        for (int i = 0; i < size; i++) {
            arrayListZ1.get(i).A0();
        }
        boolean zY1 = dVar.Y1();
        if (dimensionBehaviourC == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.M0(0, dVar.a0());
        } else {
            dVar.N0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = arrayListZ1.get(i2);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                if (fVar.z1() == 1) {
                    if (fVar.A1() != -1) {
                        fVar.D1(fVar.A1());
                    } else if (fVar.B1() != -1 && dVar.r0()) {
                        fVar.D1(dVar.a0() - fVar.B1());
                    } else if (dVar.r0()) {
                        fVar.D1((int) ((fVar.C1() * dVar.a0()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget).E1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = arrayListZ1.get(i3);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar2 = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                    if (fVar2.z1() == 1) {
                        b(0, fVar2, interfaceC0068b, zY1);
                    }
                }
            }
        }
        b(0, dVar, interfaceC0068b, zY1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = arrayListZ1.get(i4);
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget3;
                    if (aVar.E1() == 0) {
                        c(0, aVar, interfaceC0068b, 0, zY1);
                    }
                }
            }
        }
        if (dimensionBehaviourX == ConstraintWidget.DimensionBehaviour.FIXED) {
            dVar.P0(0, dVar.z());
        } else {
            dVar.O0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = arrayListZ1.get(i5);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar3 = (androidx.constraintlayout.core.widgets.f) constraintWidget4;
                if (fVar3.z1() == 0) {
                    if (fVar3.A1() != -1) {
                        fVar3.D1(fVar3.A1());
                    } else if (fVar3.B1() != -1 && dVar.s0()) {
                        fVar3.D1(dVar.z() - fVar3.B1());
                    } else if (dVar.s0()) {
                        fVar3.D1((int) ((fVar3.C1() * dVar.z()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) && ((androidx.constraintlayout.core.widgets.a) constraintWidget4).E1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = arrayListZ1.get(i6);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.f) {
                    androidx.constraintlayout.core.widgets.f fVar4 = (androidx.constraintlayout.core.widgets.f) constraintWidget5;
                    if (fVar4.z1() == 0) {
                        i(1, fVar4, interfaceC0068b);
                    }
                }
            }
        }
        i(0, dVar, interfaceC0068b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = arrayListZ1.get(i7);
                if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) constraintWidget6;
                    if (aVar2.E1() == 1) {
                        c(0, aVar2, interfaceC0068b, 1, zY1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = arrayListZ1.get(i8);
            if (constraintWidget7.q0() && a(0, constraintWidget7)) {
                androidx.constraintlayout.core.widgets.d.b2(0, constraintWidget7, interfaceC0068b, a, b.a.k);
                if (!(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.f)) {
                    b(0, constraintWidget7, interfaceC0068b, zY1);
                    i(0, constraintWidget7, interfaceC0068b);
                } else if (((androidx.constraintlayout.core.widgets.f) constraintWidget7).z1() == 0) {
                    i(0, constraintWidget7, interfaceC0068b);
                } else {
                    b(0, constraintWidget7, interfaceC0068b, zY1);
                }
            }
        }
    }

    private static void i(int i, ConstraintWidget constraintWidget, b.InterfaceC0068b interfaceC0068b) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.t0()) {
            return;
        }
        boolean z = true;
        c++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.q0()) {
            int i2 = i + 1;
            if (a(i2, constraintWidget)) {
                androidx.constraintlayout.core.widgets.d.b2(i2, constraintWidget, interfaceC0068b, new b.a(), b.a.k);
            }
        }
        ConstraintAnchor constraintAnchorQ = constraintWidget.q(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorQ2 = constraintWidget.q(ConstraintAnchor.Type.BOTTOM);
        int iE = constraintAnchorQ.e();
        int iE2 = constraintAnchorQ2.e();
        if (constraintAnchorQ.d() != null && constraintAnchorQ.n()) {
            Iterator<ConstraintAnchor> it = constraintAnchorQ.d().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.d;
                int i3 = i + 1;
                boolean zA = a(i3, constraintWidget2);
                if (constraintWidget2.q0() && zA) {
                    androidx.constraintlayout.core.widgets.d.b2(i3, constraintWidget2, interfaceC0068b, new b.a(), b.a.k);
                }
                boolean z2 = ((next == constraintWidget2.R && (constraintAnchor4 = constraintWidget2.T.f) != null && constraintAnchor4.n()) || (next == constraintWidget2.T && (constraintAnchor3 = constraintWidget2.R.f) != null && constraintAnchor3.n())) ? z : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourX = constraintWidget2.X();
                boolean z3 = z;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourX != dimensionBehaviour || zA) {
                    if (!constraintWidget2.q0()) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget2.R;
                        if (next == constraintAnchor5 && constraintWidget2.T.f == null) {
                            int iF = constraintAnchor5.f() + iE;
                            constraintWidget2.P0(iF, constraintWidget2.z() + iF);
                            i(i3, constraintWidget2, interfaceC0068b);
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintWidget2.T;
                            if (next == constraintAnchor6 && constraintAnchor5.f == null) {
                                int iF2 = iE - constraintAnchor6.f();
                                constraintWidget2.P0(iF2 - constraintWidget2.z(), iF2);
                                i(i3, constraintWidget2, interfaceC0068b);
                            } else if (z2 && !constraintWidget2.o0()) {
                                f(i3, interfaceC0068b, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.X() == dimensionBehaviour && constraintWidget2.D >= 0 && constraintWidget2.C >= 0 && ((constraintWidget2.Z() == 8 || (constraintWidget2.x == 0 && constraintWidget2.x() == 0.0f)) && !constraintWidget2.o0() && !constraintWidget2.p0() && z2 && !constraintWidget2.o0())) {
                    g(i3, constraintWidget, interfaceC0068b, constraintWidget2);
                }
                z = z3;
            }
        }
        boolean z4 = z;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        if (constraintAnchorQ2.d() != null && constraintAnchorQ2.n()) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorQ2.d().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.d;
                int i4 = i + 1;
                boolean zA2 = a(i4, constraintWidget3);
                if (constraintWidget3.q0() && zA2) {
                    androidx.constraintlayout.core.widgets.d.b2(i4, constraintWidget3, interfaceC0068b, new b.a(), b.a.k);
                }
                boolean z5 = ((next2 == constraintWidget3.R && (constraintAnchor2 = constraintWidget3.T.f) != null && constraintAnchor2.n()) || (next2 == constraintWidget3.T && (constraintAnchor = constraintWidget3.R.f) != null && constraintAnchor.n())) ? z4 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourX2 = constraintWidget3.X();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourX2 != dimensionBehaviour2 || zA2) {
                    if (!constraintWidget3.q0()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget3.R;
                        if (next2 == constraintAnchor7 && constraintWidget3.T.f == null) {
                            int iF3 = constraintAnchor7.f() + iE2;
                            constraintWidget3.P0(iF3, constraintWidget3.z() + iF3);
                            i(i4, constraintWidget3, interfaceC0068b);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.T;
                            if (next2 == constraintAnchor8 && constraintAnchor7.f == null) {
                                int iF4 = iE2 - constraintAnchor8.f();
                                constraintWidget3.P0(iF4 - constraintWidget3.z(), iF4);
                                i(i4, constraintWidget3, interfaceC0068b);
                            } else if (z5 && !constraintWidget3.o0()) {
                                f(i4, interfaceC0068b, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.X() == dimensionBehaviour2 && constraintWidget3.D >= 0 && constraintWidget3.C >= 0 && (constraintWidget3.Z() == 8 || (constraintWidget3.x == 0 && constraintWidget3.x() == 0.0f))) {
                    if (!constraintWidget3.o0() && !constraintWidget3.p0() && z5 && !constraintWidget3.o0()) {
                        g(i4, constraintWidget, interfaceC0068b, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorQ3 = constraintWidget.q(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorQ3.d() != null && constraintAnchorQ3.n()) {
            int iE3 = constraintAnchorQ3.e();
            for (ConstraintAnchor constraintAnchor9 : constraintAnchorQ3.d()) {
                ConstraintWidget constraintWidget4 = constraintAnchor9.d;
                int i5 = i + 1;
                boolean zA3 = a(i5, constraintWidget4);
                if (constraintWidget4.q0() && zA3) {
                    androidx.constraintlayout.core.widgets.d.b2(i5, constraintWidget4, interfaceC0068b, new b.a(), b.a.k);
                }
                if (constraintWidget4.X() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zA3) {
                    if (!constraintWidget4.q0() && constraintAnchor9 == constraintWidget4.U) {
                        constraintWidget4.L0(constraintAnchor9.f() + iE3);
                        i(i5, constraintWidget4, interfaceC0068b);
                    }
                }
            }
        }
        constraintWidget.v0();
    }
}
