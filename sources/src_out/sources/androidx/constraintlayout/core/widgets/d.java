package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.google.inputmethod.ev7;
import com.google.inputmethod.ghe;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class d extends ghe {
    androidx.constraintlayout.core.widgets.analyzer.b W0;
    public androidx.constraintlayout.core.widgets.analyzer.d X0;
    private int Y0;
    protected androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b Z0;
    private boolean a1;
    protected androidx.constraintlayout.core.d b1;
    int c1;
    int d1;
    int e1;
    int f1;
    public int g1;
    public int h1;
    c[] i1;
    c[] j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public int o1;
    private int p1;
    public boolean q1;
    private boolean r1;
    private boolean s1;
    int t1;
    private WeakReference<ConstraintAnchor> u1;
    private WeakReference<ConstraintAnchor> v1;
    private WeakReference<ConstraintAnchor> w1;
    private WeakReference<ConstraintAnchor> x1;
    HashSet<ConstraintWidget> y1;
    public androidx.constraintlayout.core.widgets.analyzer.b.a z1;

    public d() {
        this.W0 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.X0 = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        this.Z0 = null;
        this.a1 = false;
        this.b1 = new androidx.constraintlayout.core.d();
        this.g1 = 0;
        this.h1 = 0;
        this.i1 = new c[4];
        this.j1 = new c[4];
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.n1 = 0;
        this.o1 = 0;
        this.p1 = 257;
        this.q1 = false;
        this.r1 = false;
        this.s1 = false;
        this.t1 = 0;
        this.u1 = null;
        this.v1 = null;
        this.w1 = null;
        this.x1 = null;
        this.y1 = new HashSet<>();
        this.z1 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }

    private void F1(ConstraintWidget constraintWidget) {
        int i = this.g1 + 1;
        c[] cVarArr = this.j1;
        if (i >= cVarArr.length) {
            this.j1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.j1[this.g1] = new c(constraintWidget, 0, Y1());
        this.g1++;
    }

    private void I1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.b1.h(solverVariable, this.b1.q(constraintAnchor), 0, 5);
    }

    private void J1(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.b1.h(this.b1.q(constraintAnchor), solverVariable, 0, 5);
    }

    private void K1(ConstraintWidget constraintWidget) {
        int i = this.h1 + 1;
        c[] cVarArr = this.i1;
        if (i >= cVarArr.length) {
            this.i1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.i1[this.h1] = new c(constraintWidget, 1, Y1());
        this.h1++;
    }

    public static boolean b2(int i, ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b interfaceC0068b, androidx.constraintlayout.core.widgets.analyzer.b.a aVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0068b == null) {
            return false;
        }
        if (constraintWidget.Z() == 8 || (constraintWidget instanceof f) || (constraintWidget instanceof a)) {
            aVar.e = 0;
            aVar.f = 0;
            return false;
        }
        aVar.a = constraintWidget.C();
        aVar.b = constraintWidget.X();
        aVar.c = constraintWidget.a0();
        aVar.d = constraintWidget.z();
        aVar.i = false;
        aVar.j = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = aVar.b == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f0 > 0.0f;
        boolean z4 = z2 && constraintWidget.f0 > 0.0f;
        if (z && constraintWidget.e0(0) && constraintWidget.w == 0 && !z3) {
            aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.x == 0) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.e0(1) && constraintWidget.x == 0 && !z4) {
            aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.w == 0) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.r0()) {
            aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.s0()) {
            aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.y[0] == 4) {
                aVar.a = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.b;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i4 = aVar.d;
                } else {
                    aVar.a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0068b.b(constraintWidget, aVar);
                    i4 = aVar.f;
                }
                aVar.a = dimensionBehaviour4;
                aVar.c = (int) (constraintWidget.x() * i4);
            }
        }
        if (z4) {
            if (constraintWidget.y[1] == 4) {
                aVar.b = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i3 = aVar.c;
                } else {
                    aVar.b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0068b.b(constraintWidget, aVar);
                    i3 = aVar.e;
                }
                aVar.b = dimensionBehaviour6;
                if (constraintWidget.y() == -1) {
                    aVar.d = (int) (i3 / constraintWidget.x());
                } else {
                    aVar.d = (int) (constraintWidget.x() * i3);
                }
            }
        }
        interfaceC0068b.b(constraintWidget, aVar);
        constraintWidget.r1(aVar.e);
        constraintWidget.S0(aVar.f);
        constraintWidget.R0(aVar.h);
        constraintWidget.H0(aVar.g);
        aVar.j = androidx.constraintlayout.core.widgets.analyzer.b.a.k;
        return aVar.i;
    }

    private void d2() {
        this.g1 = 0;
        this.h1 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0214  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0226 A[LOOP:5: B:123:0x0224->B:124:0x0226, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0308  */
    /* JADX WARN: Code duplicated, block: B:164:0x0329 A[PHI: r13 r19
  0x0329: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
  0x0329: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x032d  */
    /* JADX WARN: Code duplicated, block: B:167:0x0330  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // com.google.inputmethod.ghe
    public void A1() {
        int i;
        int i2;
        boolean z;
        int i3;
        ?? r18;
        char c;
        ?? E1;
        int i4;
        ?? I2;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r13;
        int iMax2;
        ?? r111;
        ?? r14;
        int i5;
        ?? r112;
        ?? r15;
        ?? r16;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ?? r6;
        ?? r17;
        ?? r0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        int i6 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.r1 = false;
        this.s1 = false;
        int size = this.V0.size();
        int iMax3 = Math.max(0, a0());
        int iMax4 = Math.max(0, z());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        boolean z2 = true;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
        if (this.Y0 == 0 && g.b(this.p1, 1)) {
            androidx.constraintlayout.core.widgets.analyzer.f.h(this, R1());
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget = this.V0.get(i7);
                if (constraintWidget.q0() && !(constraintWidget instanceof f) && !(constraintWidget instanceof a) && !(constraintWidget instanceof i) && !constraintWidget.p0()) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourW = constraintWidget.w(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = constraintWidget.w(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviourW != dimensionBehaviour6 || constraintWidget.w == 1 || dimensionBehaviourW2 != dimensionBehaviour6 || constraintWidget.x == 1) {
                        b2(0, constraintWidget, this.Z0, new androidx.constraintlayout.core.widgets.analyzer.b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.k);
                    }
                }
            }
        }
        char c2 = 2;
        if (size <= 2 || !((dimensionBehaviour5 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour4 == dimensionBehaviour3) && g.b(this.p1, 1024) && androidx.constraintlayout.core.widgets.analyzer.g.c(this, R1()))) {
            i = iMax4;
            i2 = iMax3;
            z = false;
        } else {
            if (dimensionBehaviour5 == dimensionBehaviour3) {
                if (iMax3 >= a0() || iMax3 <= 0) {
                    iMax3 = a0();
                } else {
                    r1(iMax3);
                    this.r1 = true;
                }
            }
            if (dimensionBehaviour4 == dimensionBehaviour3) {
                if (iMax4 >= z() || iMax4 <= 0) {
                    iMax4 = z();
                } else {
                    S0(iMax4);
                    this.s1 = true;
                }
            }
            i = iMax4;
            i2 = iMax3;
            z = true;
        }
        boolean z3 = c2(64) || c2(128);
        androidx.constraintlayout.core.d dVar = this.b1;
        dVar.i = false;
        dVar.j = false;
        if (this.p1 != 0 && z3) {
            dVar.j = true;
        }
        ArrayList<ConstraintWidget> arrayList = this.V0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z4 = dimensionBehaviourC == dimensionBehaviour7 || X() == dimensionBehaviour7;
        d2();
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget2 = this.V0.get(i8);
            if (constraintWidget2 instanceof ghe) {
                ((ghe) constraintWidget2).A1();
            }
        }
        boolean zC2 = c2(64);
        ?? r113 = z;
        int i9 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i10 = i9 + 1;
            try {
                this.b1.E();
                d2();
                o(this.b1);
                int i11 = i6;
                while (i11 < size) {
                    i3 = i6;
                    try {
                        c = c2;
                        try {
                            this.V0.get(i11).o(this.b1);
                            i11++;
                            i6 = i3;
                            c2 = c;
                        } catch (Exception e) {
                            e = e;
                            r18 = z2;
                            E1 = r114;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (E1 != 0) {
                                I2 = i2(this.b1, g.a);
                            } else {
                                x1(this.b1, zC2);
                                for (i4 = i3; i4 < size; i4++) {
                                    this.V0.get(i4).x1(this.b1, zC2);
                                }
                                I2 = i3;
                            }
                            if (z4) {
                                r19 = I2 == true ? 1 : 0;
                            } else {
                                r19 = I2 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.o0, a0());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > a0()) {
                                r1(iMax);
                                this.b0[i3] = ConstraintWidget.DimensionBehaviour.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.p0, z());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > z()) {
                                S0(iMax2);
                                this.b0[r18] = ConstraintWidget.DimensionBehaviour.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                dimensionBehaviour = this.b0[i3];
                                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                if (dimensionBehaviour == dimensionBehaviour2) {
                                    r14 = r17;
                                    r6 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                } else {
                                    r14 = r17;
                                    r6 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                }
                                if (this.b0[r6] == dimensionBehaviour2) {
                                    r14 = r17;
                                    i5 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                } else {
                                    r14 = r17;
                                    i5 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                }
                            } else {
                                r14 = r17;
                                i5 = 8;
                                r15 = r14;
                                r112 = r111;
                            }
                            if (i10 > i5) {
                                r16 = i3;
                            } else {
                                r16 = r112;
                            }
                            i9 = i10;
                            i6 = i3;
                            c2 = c;
                            z2 = true;
                            r113 = r15;
                            r114 = r16;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c = c2;
                    }
                }
                i3 = i6;
                c = c2;
                E1 = E1(this.b1);
                WeakReference<ConstraintAnchor> weakReference = this.u1;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z2;
                } else {
                    boolean z5 = z2;
                    try {
                        J1(this.u1.get(), this.b1.q(this.R));
                        this.u1 = null;
                        r18 = z5;
                    } catch (Exception e3) {
                        e = e3;
                        E1 = E1;
                        r18 = z5;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference<ConstraintAnchor> weakReference2 = this.w1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    I1(this.w1.get(), this.b1.q(this.T));
                    this.w1 = null;
                }
                WeakReference<ConstraintAnchor> weakReference3 = this.v1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    J1(this.v1.get(), this.b1.q(this.Q));
                    this.v1 = null;
                }
                WeakReference<ConstraintAnchor> weakReference4 = this.x1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    I1(this.x1.get(), this.b1.q(this.S));
                    this.x1 = null;
                }
                if (E1 != 0) {
                    this.b1.A();
                }
            } catch (Exception e4) {
                e = e4;
                i3 = i6;
                r18 = z2;
                c = c2;
                E1 = r114;
            }
            if (E1 != 0) {
                I2 = i2(this.b1, g.a);
            } else {
                x1(this.b1, zC2);
                while (i4 < size) {
                    this.V0.get(i4).x1(this.b1, zC2);
                }
                I2 = i3;
            }
            if (z4 || i10 >= 8 || !g.a[c]) {
                r19 = I2 == true ? 1 : 0;
            } else {
                int i12 = i3;
                int iMax5 = i12;
                int iMax6 = iMax5;
                while (i12 < size) {
                    r0 = I2;
                    ConstraintWidget constraintWidget3 = this.V0.get(i12);
                    iMax5 = Math.max(iMax5, constraintWidget3.h0 + constraintWidget3.a0());
                    iMax6 = Math.max(iMax6, constraintWidget3.i0 + constraintWidget3.z());
                    i12++;
                    r0 = r0 == true ? 1 : 0;
                }
                r0 = I2;
                ?? r116 = r0;
                int iMax7 = Math.max(this.o0, iMax5);
                int iMax8 = Math.max(this.p0, iMax6);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (dimensionBehaviour5 == dimensionBehaviour8 && a0() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    r1(iMax7);
                    this.b0[i3] = dimensionBehaviour8;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (dimensionBehaviour4 == dimensionBehaviour8 && z() < iMax8) {
                    S0(iMax8);
                    this.b0[r18] = dimensionBehaviour8;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.o0, a0());
            r13 = r113;
            r110 = r19;
            if (iMax > a0()) {
                r1(iMax);
                this.b0[i3] = ConstraintWidget.DimensionBehaviour.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.p0, z());
            r14 = r13;
            r111 = r110;
            if (iMax2 > z()) {
                S0(iMax2);
                this.b0[r18] = ConstraintWidget.DimensionBehaviour.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                dimensionBehaviour = this.b0[i3];
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2 || i2 <= 0 || a0() <= i2) {
                    r14 = r17;
                    r6 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r7 = r18;
                    this.r1 = r7;
                    this.b0[i3] = ConstraintWidget.DimensionBehaviour.FIXED;
                    r1(i2);
                    boolean z6 = r7 == true ? 1 : 0;
                    r111 = z6 ? 1 : 0;
                    r6 = r7;
                    r14 = z6;
                }
                if (this.b0[r6] == dimensionBehaviour2 || i <= 0 || z() <= i) {
                    r14 = r17;
                    i5 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.s1 = r6;
                    this.b0[r6] = ConstraintWidget.DimensionBehaviour.FIXED;
                    S0(i);
                    i5 = 8;
                    r15 = 1;
                    r112 = 1;
                }
            } else {
                r14 = r17;
                i5 = 8;
                r15 = r14;
                r112 = r111;
            }
            if (i10 > i5) {
                r16 = i3;
            } else {
                r16 = r112;
            }
            i9 = i10;
            i6 = i3;
            c2 = c;
            z2 = true;
            r113 = r15;
            r114 = r16;
        }
        int i13 = i6;
        this.V0 = arrayList;
        if (r113 != 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.b0;
            dimensionBehaviourArr2[i13] = dimensionBehaviour5;
            dimensionBehaviourArr2[1] = dimensionBehaviour4;
        }
        B0(this.b1.w());
    }

    void D1(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            F1(constraintWidget);
        } else if (i == 1) {
            K1(constraintWidget);
        }
    }

    public boolean E1(androidx.constraintlayout.core.d dVar) {
        d dVar2;
        androidx.constraintlayout.core.d dVar3;
        boolean zC2 = c2(64);
        g(dVar, zC2);
        int size = this.V0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.V0.get(i);
            constraintWidget.Z0(0, false);
            constraintWidget.Z0(1, false);
            if (constraintWidget instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.V0.get(i2);
                if (constraintWidget2 instanceof a) {
                    ((a) constraintWidget2).F1();
                }
            }
        }
        this.y1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.V0.get(i3);
            if (constraintWidget3.f()) {
                if (constraintWidget3 instanceof i) {
                    this.y1.add(constraintWidget3);
                } else {
                    constraintWidget3.g(dVar, zC2);
                }
            }
        }
        while (this.y1.size() > 0) {
            int size2 = this.y1.size();
            Iterator<ConstraintWidget> it = this.y1.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar.C1(this.y1)) {
                    iVar.g(dVar, zC2);
                    this.y1.remove(iVar);
                    break;
                }
            }
            if (size2 == this.y1.size()) {
                Iterator<ConstraintWidget> it2 = this.y1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, zC2);
                }
                this.y1.clear();
            }
        }
        if (androidx.constraintlayout.core.d.s) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget4 = this.V0.get(i4);
                if (!constraintWidget4.f()) {
                    hashSet.add(constraintWidget4);
                }
            }
            dVar2 = this;
            dVar3 = dVar;
            dVar2.e(this, dVar3, hashSet, C() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget5 : hashSet) {
                g.a(this, dVar3, constraintWidget5);
                constraintWidget5.g(dVar3, zC2);
            }
        } else {
            dVar2 = this;
            dVar3 = dVar;
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget6 = dVar2.V0.get(i5);
                if (constraintWidget6 instanceof d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.b0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.W0(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.n1(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.g(dVar3, zC2);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.W0(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.n1(dimensionBehaviour2);
                    }
                } else {
                    g.a(this, dVar3, constraintWidget6);
                    if (!constraintWidget6.f()) {
                        constraintWidget6.g(dVar3, zC2);
                    }
                }
            }
        }
        if (dVar2.g1 > 0) {
            b.b(this, dVar3, null, 0);
        }
        if (dVar2.h1 > 0) {
            b.b(this, dVar3, null, 1);
        }
        return true;
    }

    public void G1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.x1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.x1.get().e()) {
            this.x1 = new WeakReference<>(constraintAnchor);
        }
    }

    public void H1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.v1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.v1.get().e()) {
            this.v1 = new WeakReference<>(constraintAnchor);
        }
    }

    void L1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.w1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.w1.get().e()) {
            this.w1 = new WeakReference<>(constraintAnchor);
        }
    }

    void M1(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.u1;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.e() > this.u1.get().e()) {
            this.u1 = new WeakReference<>(constraintAnchor);
        }
    }

    public boolean N1(boolean z) {
        return this.X0.f(z);
    }

    public boolean O1(boolean z) {
        return this.X0.g(z);
    }

    public boolean P1(boolean z, int i) {
        return this.X0.h(z, i);
    }

    public void Q1(ev7 ev7Var) {
        this.b1.v(ev7Var);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void R(StringBuilder sb) {
        sb.append(this.o + ":{\n");
        sb.append("  actualWidth:" + this.d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.e0);
        sb.append("\n");
        Iterator<ConstraintWidget> it = z1().iterator();
        while (it.hasNext()) {
            it.next().R(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b R1() {
        return this.Z0;
    }

    public int S1() {
        return this.p1;
    }

    public androidx.constraintlayout.core.d T1() {
        return this.b1;
    }

    public boolean U1() {
        return false;
    }

    public void V1() {
        this.X0.j();
    }

    public void W1() {
        this.X0.k();
    }

    public boolean X1() {
        return this.s1;
    }

    public boolean Y1() {
        return this.a1;
    }

    public boolean Z1() {
        return this.r1;
    }

    public long a2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.c1 = i8;
        this.d1 = i9;
        return this.W0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean c2(int i) {
        return (this.p1 & i) == i;
    }

    public void e2(androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b interfaceC0068b) {
        this.Z0 = interfaceC0068b;
        this.X0.n(interfaceC0068b);
    }

    public void f2(int i) {
        this.p1 = i;
        androidx.constraintlayout.core.d.s = c2(512);
    }

    public void g2(int i) {
        this.Y0 = i;
    }

    public void h2(boolean z) {
        this.a1 = z;
    }

    public boolean i2(androidx.constraintlayout.core.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zC2 = c2(64);
        x1(dVar, zC2);
        int size = this.V0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.V0.get(i);
            constraintWidget.x1(dVar, zC2);
            if (constraintWidget.g0()) {
                z = true;
            }
        }
        return z;
    }

    public void j2() {
        this.W0.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void w1(boolean z, boolean z2) {
        super.w1(z, z2);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            this.V0.get(i).w1(z, z2);
        }
    }

    @Override // com.google.inputmethod.ghe, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void x0() {
        this.b1.E();
        this.c1 = 0;
        this.e1 = 0;
        this.d1 = 0;
        this.f1 = 0;
        this.q1 = false;
        super.x0();
    }

    public d(int i, int i2) {
        super(i, i2);
        this.W0 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.X0 = new androidx.constraintlayout.core.widgets.analyzer.d(this);
        this.Z0 = null;
        this.a1 = false;
        this.b1 = new androidx.constraintlayout.core.d();
        this.g1 = 0;
        this.h1 = 0;
        this.i1 = new c[4];
        this.j1 = new c[4];
        this.k1 = false;
        this.l1 = false;
        this.m1 = false;
        this.n1 = 0;
        this.o1 = 0;
        this.p1 = 257;
        this.q1 = false;
        this.r1 = false;
        this.s1 = false;
        this.t1 = 0;
        this.u1 = null;
        this.v1 = null;
        this.w1 = null;
        this.x1 = null;
        this.y1 = new HashSet<>();
        this.z1 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }
}
