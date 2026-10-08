package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.fc5;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class b {
    private final ArrayList<ConstraintWidget> a = new ArrayList<>();
    private a b = new a();
    private androidx.constraintlayout.core.widgets.d c;

    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;
        public ConstraintWidget.DimensionBehaviour a;
        public ConstraintWidget.DimensionBehaviour b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.b$b, reason: collision with other inner class name */
    public interface InterfaceC0068b {
        void a();

        void b(ConstraintWidget constraintWidget, a aVar);
    }

    public b(androidx.constraintlayout.core.widgets.d dVar) {
        this.c = dVar;
    }

    private boolean a(InterfaceC0068b interfaceC0068b, ConstraintWidget constraintWidget, int i) {
        this.b.a = constraintWidget.C();
        this.b.b = constraintWidget.X();
        this.b.c = constraintWidget.a0();
        this.b.d = constraintWidget.z();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f0 > 0.0f;
        boolean z4 = z2 && constraintWidget.f0 > 0.0f;
        if (z3 && constraintWidget.y[0] == 4) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.y[1] == 4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        interfaceC0068b.b(constraintWidget, aVar);
        constraintWidget.r1(this.b.e);
        constraintWidget.S0(this.b.f);
        constraintWidget.R0(this.b.h);
        constraintWidget.H0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(androidx.constraintlayout.core.widgets.d dVar) {
        boolean z;
        j jVar;
        l lVar;
        int size = dVar.V0.size();
        boolean zC2 = dVar.c2(64);
        InterfaceC0068b interfaceC0068bR1 = dVar.R1();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.V0.get(i);
            if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.f) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.a) && !constraintWidget.p0() && (!zC2 || (jVar = constraintWidget.e) == null || (lVar = constraintWidget.f) == null || !jVar.e.j || !lVar.e.j)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourW = constraintWidget.w(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = constraintWidget.w(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z2 = dimensionBehaviourW == dimensionBehaviour && constraintWidget.w != 1 && dimensionBehaviourW2 == dimensionBehaviour && constraintWidget.x != 1;
                if (!z2 && dVar.c2(1) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.i)) {
                    if (dimensionBehaviourW == dimensionBehaviour && constraintWidget.w == 0 && dimensionBehaviourW2 != dimensionBehaviour && !constraintWidget.m0()) {
                        z2 = true;
                    }
                    if (dimensionBehaviourW2 == dimensionBehaviour && constraintWidget.x == 0 && dimensionBehaviourW != dimensionBehaviour && !constraintWidget.m0()) {
                        z2 = true;
                    }
                    z = (!(dimensionBehaviourW == dimensionBehaviour || dimensionBehaviourW2 == dimensionBehaviour) || constraintWidget.f0 <= 0.0f) ? z2 : true;
                }
                if (!z) {
                    a(interfaceC0068bR1, constraintWidget, a.k);
                }
            }
        }
        interfaceC0068bR1.a();
    }

    private void c(androidx.constraintlayout.core.widgets.d dVar, String str, int i, int i2, int i3) {
        dVar.getClass();
        int iL = dVar.L();
        int iK = dVar.K();
        dVar.h1(0);
        dVar.g1(0);
        dVar.r1(i2);
        dVar.S0(i3);
        dVar.h1(iL);
        dVar.g1(iK);
        this.c.g2(i);
        this.c.A1();
    }

    public long d(androidx.constraintlayout.core.widgets.d dVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zP1;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13;
        boolean z2;
        b bVar = this;
        InterfaceC0068b interfaceC0068bR1 = dVar.R1();
        int size = dVar.V0.size();
        int iA0 = dVar.a0();
        int iZ = dVar.z();
        boolean zB = androidx.constraintlayout.core.widgets.g.b(i, 128);
        boolean z3 = zB || androidx.constraintlayout.core.widgets.g.b(i, 64);
        if (z3) {
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget = dVar.V0.get(i14);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourC = constraintWidget.C();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z4 = (dimensionBehaviourC == dimensionBehaviour) && (constraintWidget.X() == dimensionBehaviour) && constraintWidget.x() > 0.0f;
                if ((constraintWidget.m0() && z4) || ((constraintWidget.o0() && z4) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.i) || constraintWidget.m0() || constraintWidget.o0())) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3) {
            boolean z5 = androidx.constraintlayout.core.d.s;
        }
        boolean z6 = z3 & ((i4 == 1073741824 && i6 == 1073741824) || zB);
        int i15 = 2;
        if (z6) {
            int iMin = Math.min(dVar.J(), i5);
            int iMin2 = Math.min(dVar.I(), i7);
            if (i4 == 1073741824 && dVar.a0() != iMin) {
                dVar.r1(iMin);
                dVar.V1();
            }
            if (i6 == 1073741824 && dVar.z() != iMin2) {
                dVar.S0(iMin2);
                dVar.V1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zP1 = dVar.N1(zB);
                i10 = 2;
            } else {
                boolean zO1 = dVar.O1(zB);
                if (i4 == 1073741824) {
                    zO1 &= dVar.P1(zB, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zP1 = dVar.P1(zB, 1) & zO1;
                    i10++;
                } else {
                    zP1 = zO1;
                }
            }
            if (zP1) {
                dVar.w1(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zP1 = false;
            i10 = 0;
        }
        if (zP1 && i10 == 2) {
            return 0L;
        }
        int iS1 = dVar.S1();
        if (size > 0) {
            b(dVar);
        }
        e(dVar);
        int size2 = bVar.a.size();
        if (size > 0) {
            bVar.c(dVar, "First pass", 0, iA0, iZ);
            i11 = iA0;
            i12 = iZ;
        } else {
            i11 = iA0;
            i12 = iZ;
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourC2 = dVar.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z7 = dimensionBehaviourC2 == dimensionBehaviour2;
            boolean z8 = dVar.X() == dimensionBehaviour2;
            int iMax = Math.max(dVar.a0(), bVar.c.L());
            int iMax2 = Math.max(dVar.z(), bVar.c.K());
            int i16 = 0;
            boolean zM1 = false;
            while (i16 < size2) {
                ConstraintWidget constraintWidget2 = bVar.a.get(i16);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.i) {
                    int iA1 = constraintWidget2.a0();
                    int iZ2 = constraintWidget2.z();
                    boolean zA = bVar.a(interfaceC0068bR1, constraintWidget2, a.l) | zM1;
                    int iA2 = constraintWidget2.a0();
                    int iZ3 = constraintWidget2.z();
                    if (iA2 != iA1) {
                        constraintWidget2.r1(iA2);
                        if (z7 && constraintWidget2.P() > iMax) {
                            iMax = Math.max(iMax, constraintWidget2.P() + constraintWidget2.q(ConstraintAnchor.Type.RIGHT).f());
                        }
                        z2 = true;
                    } else {
                        z2 = zA;
                    }
                    if (iZ3 != iZ2) {
                        constraintWidget2.S0(iZ3);
                        if (z8 && constraintWidget2.t() > iMax2) {
                            iMax2 = Math.max(iMax2, constraintWidget2.t() + constraintWidget2.q(ConstraintAnchor.Type.BOTTOM).f());
                        }
                        z2 = true;
                    }
                    zM1 = z2 | ((androidx.constraintlayout.core.widgets.i) constraintWidget2).M1();
                }
                i16++;
                i11 = i11;
                i15 = 2;
            }
            int i17 = i11;
            int i18 = i15;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = 0;
                while (i20 < size2) {
                    ConstraintWidget constraintWidget3 = bVar.a.get(i20);
                    if (((constraintWidget3 instanceof fc5) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.i)) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.f) || constraintWidget3.Z() == 8 || ((z6 && constraintWidget3.e.e.j && constraintWidget3.f.e.j) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.i))) {
                        z = z6;
                        i13 = size2;
                    } else {
                        int iA3 = constraintWidget3.a0();
                        int iZ4 = constraintWidget3.z();
                        z = z6;
                        int iR = constraintWidget3.r();
                        int i21 = a.l;
                        i13 = size2;
                        if (i19 == 1) {
                            i21 = a.m;
                        }
                        boolean zA2 = bVar.a(interfaceC0068bR1, constraintWidget3, i21) | zM1;
                        int iA4 = constraintWidget3.a0();
                        int iZ5 = constraintWidget3.z();
                        if (iA4 != iA3) {
                            constraintWidget3.r1(iA4);
                            if (z7 && constraintWidget3.P() > iMax) {
                                iMax = Math.max(iMax, constraintWidget3.P() + constraintWidget3.q(ConstraintAnchor.Type.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iZ5 != iZ4) {
                            constraintWidget3.S0(iZ5);
                            if (z8 && constraintWidget3.t() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget3.t() + constraintWidget3.q(ConstraintAnchor.Type.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zM1 = (!constraintWidget3.d0() || iR == constraintWidget3.r()) ? zA2 : true;
                    }
                    i20++;
                    bVar = this;
                    size2 = i13;
                    z6 = z;
                }
                boolean z9 = z6;
                int i22 = size2;
                if (!zM1) {
                    break;
                }
                i19++;
                c(dVar, "intermediate pass", i19, i17, i12);
                bVar = this;
                size2 = i22;
                z6 = z9;
                i18 = 2;
                zM1 = false;
            }
        }
        dVar.f2(iS1);
        return 0L;
    }

    public void e(androidx.constraintlayout.core.widgets.d dVar) {
        this.a.clear();
        int size = dVar.V0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = dVar.V0.get(i);
            ConstraintWidget.DimensionBehaviour dimensionBehaviourC = constraintWidget.C();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviourC == dimensionBehaviour || constraintWidget.X() == dimensionBehaviour) {
                this.a.add(constraintWidget);
            }
        }
        dVar.V1();
    }
}
