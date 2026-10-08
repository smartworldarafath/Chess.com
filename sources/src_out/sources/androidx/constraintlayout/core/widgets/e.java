package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class e extends i {
    private ConstraintWidget[] H1;
    private int k1 = -1;
    private int l1 = -1;
    private int m1 = -1;
    private int n1 = -1;
    private int o1 = -1;
    private int p1 = -1;
    private float q1 = 0.5f;
    private float r1 = 0.5f;
    private float s1 = 0.5f;
    private float t1 = 0.5f;
    private float u1 = 0.5f;
    private float v1 = 0.5f;
    private int w1 = 0;
    private int x1 = 0;
    private int y1 = 2;
    private int z1 = 2;
    private int A1 = 0;
    private int B1 = -1;
    private int C1 = 0;
    private ArrayList<a> D1 = new ArrayList<>();
    private ConstraintWidget[] E1 = null;
    private ConstraintWidget[] F1 = null;
    private int[] G1 = null;
    private int I1 = 0;

    private class a {
        private int a;
        private ConstraintAnchor d;
        private ConstraintAnchor e;
        private ConstraintAnchor f;
        private ConstraintAnchor g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int q;
        private ConstraintWidget b = null;
        int c = 0;
        private int l = 0;
        private int m = 0;
        private int n = 0;
        private int o = 0;
        private int p = 0;

        a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = e.this.G1();
            this.i = e.this.I1();
            this.j = e.this.H1();
            this.k = e.this.F1();
            this.q = i2;
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.o;
            for (int i2 = 0; i2 < i && this.n + i2 < e.this.I1; i2++) {
                ConstraintWidget constraintWidget = e.this.H1[this.n + i2];
                if (this.a == 0) {
                    int iA0 = constraintWidget.a0();
                    int i3 = e.this.w1;
                    if (constraintWidget.Z() == 8) {
                        i3 = 0;
                    }
                    this.l += iA0 + i3;
                    int iR2 = e.this.r2(constraintWidget, this.q);
                    if (this.b == null || this.c < iR2) {
                        this.b = constraintWidget;
                        this.c = iR2;
                        this.m = iR2;
                    }
                } else {
                    int iS2 = e.this.s2(constraintWidget, this.q);
                    int iR3 = e.this.r2(constraintWidget, this.q);
                    int i4 = e.this.x1;
                    if (constraintWidget.Z() == 8) {
                        i4 = 0;
                    }
                    this.m += iR3 + i4;
                    if (this.b == null || this.c < iS2) {
                        this.b = constraintWidget;
                        this.c = iS2;
                        this.l = iS2;
                    }
                }
            }
        }

        public void b(ConstraintWidget constraintWidget) {
            if (this.a == 0) {
                int iS2 = e.this.s2(constraintWidget, this.q);
                if (constraintWidget.C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.p++;
                    iS2 = 0;
                }
                this.l += iS2 + (constraintWidget.Z() != 8 ? e.this.w1 : 0);
                int iR2 = e.this.r2(constraintWidget, this.q);
                if (this.b == null || this.c < iR2) {
                    this.b = constraintWidget;
                    this.c = iR2;
                    this.m = iR2;
                }
            } else {
                int iS3 = e.this.s2(constraintWidget, this.q);
                int iR3 = e.this.r2(constraintWidget, this.q);
                if (constraintWidget.X() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.p++;
                    iR3 = 0;
                }
                this.m += iR3 + (constraintWidget.Z() != 8 ? e.this.x1 : 0);
                if (this.b == null || this.c < iS3) {
                    this.b = constraintWidget;
                    this.c = iS3;
                    this.l = iS3;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            ConstraintWidget constraintWidget;
            int i2;
            char c;
            float f;
            float f2;
            int i3 = this.o;
            for (int i4 = 0; i4 < i3 && this.n + i4 < e.this.I1; i4++) {
                ConstraintWidget constraintWidget2 = e.this.H1[this.n + i4];
                if (constraintWidget2 != null) {
                    constraintWidget2.z0();
                }
            }
            if (i3 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i5 = -1;
            int i6 = -1;
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = z ? (i3 - 1) - i7 : i7;
                if (this.n + i8 >= e.this.I1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = e.this.H1[this.n + i8];
                if (constraintWidget3 != null && constraintWidget3.Z() == 0) {
                    if (i5 == -1) {
                        i5 = i7;
                    }
                    i6 = i7;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.a != 0) {
                ConstraintWidget constraintWidget5 = this.b;
                constraintWidget5.U0(e.this.k1);
                int i9 = this.h;
                if (i > 0) {
                    i9 += e.this.w1;
                }
                if (z) {
                    constraintWidget5.S.a(this.f, i9);
                    if (z2) {
                        constraintWidget5.Q.a(this.d, this.j);
                    }
                    if (i > 0) {
                        this.f.d.Q.a(constraintWidget5.S, 0);
                    }
                } else {
                    constraintWidget5.Q.a(this.d, i9);
                    if (z2) {
                        constraintWidget5.S.a(this.f, this.j);
                    }
                    if (i > 0) {
                        this.d.d.S.a(constraintWidget5.Q, 0);
                    }
                }
                for (int i10 = 0; i10 < i3 && this.n + i10 < e.this.I1; i10++) {
                    ConstraintWidget constraintWidget6 = e.this.H1[this.n + i10];
                    if (constraintWidget6 != null) {
                        if (i10 == 0) {
                            constraintWidget6.l(constraintWidget6.R, this.e, this.i);
                            int i11 = e.this.l1;
                            float f3 = e.this.r1;
                            if (this.n == 0 && e.this.n1 != -1) {
                                i11 = e.this.n1;
                                f3 = e.this.t1;
                            } else if (z2 && e.this.p1 != -1) {
                                i11 = e.this.p1;
                                f3 = e.this.v1;
                            }
                            constraintWidget6.l1(i11);
                            constraintWidget6.k1(f3);
                        }
                        if (i10 == i3 - 1) {
                            constraintWidget6.l(constraintWidget6.T, this.g, this.k);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.R.a(constraintWidget4.T, e.this.x1);
                            if (i10 == i5) {
                                constraintWidget6.R.u(this.i);
                            }
                            constraintWidget4.T.a(constraintWidget6.R, 0);
                            if (i10 == i6 + 1) {
                                constraintWidget4.T.u(this.k);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (z) {
                                int i12 = e.this.y1;
                                if (i12 == 0) {
                                    constraintWidget6.S.a(constraintWidget5.S, 0);
                                } else if (i12 == 1) {
                                    constraintWidget6.Q.a(constraintWidget5.Q, 0);
                                } else if (i12 == 2) {
                                    constraintWidget6.Q.a(constraintWidget5.Q, 0);
                                    constraintWidget6.S.a(constraintWidget5.S, 0);
                                }
                            } else {
                                int i13 = e.this.y1;
                                if (i13 == 0) {
                                    constraintWidget6.Q.a(constraintWidget5.Q, 0);
                                } else if (i13 == 1) {
                                    constraintWidget6.S.a(constraintWidget5.S, 0);
                                } else if (i13 == 2) {
                                    if (z3) {
                                        constraintWidget6.Q.a(this.d, this.h);
                                        constraintWidget6.S.a(this.f, this.j);
                                    } else {
                                        constraintWidget6.Q.a(constraintWidget5.Q, 0);
                                        constraintWidget6.S.a(constraintWidget5.S, 0);
                                    }
                                }
                            }
                        }
                        constraintWidget4 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.b;
            constraintWidget7.l1(e.this.l1);
            int i14 = this.i;
            if (i > 0) {
                i14 += e.this.x1;
            }
            constraintWidget7.R.a(this.e, i14);
            if (z2) {
                constraintWidget7.T.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.T.a(constraintWidget7.R, 0);
            }
            char c2 = 3;
            if (e.this.z1 != 3 || constraintWidget7.d0()) {
                constraintWidget = constraintWidget7;
                break;
            }
            int i15 = 0;
            while (true) {
                if (i15 < i3) {
                    int i16 = z ? (i3 - 1) - i15 : i15;
                    if (this.n + i16 < e.this.I1) {
                        constraintWidget = e.this.H1[this.n + i16];
                        if (constraintWidget.d0()) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                constraintWidget = constraintWidget7;
                break;
            }
            int i17 = 0;
            while (i17 < i3) {
                int i18 = z ? (i3 - 1) - i17 : i17;
                if (this.n + i18 >= e.this.I1) {
                    return;
                }
                ConstraintWidget constraintWidget8 = e.this.H1[this.n + i18];
                if (constraintWidget8 == null) {
                    constraintWidget8 = constraintWidget4;
                    c = c2;
                } else {
                    if (i17 == 0) {
                        i2 = 1;
                        constraintWidget8.l(constraintWidget8.Q, this.d, this.h);
                    } else {
                        i2 = 1;
                    }
                    if (i18 == 0) {
                        int i19 = e.this.k1;
                        float f4 = e.this.q1;
                        if (z) {
                            f4 = 1.0f - f4;
                        }
                        if (this.n == 0 && e.this.m1 != -1) {
                            i19 = e.this.m1;
                            if (z) {
                                f2 = e.this.s1;
                                f = 1.0f - f2;
                            } else {
                                f = e.this.s1;
                            }
                            f4 = f;
                        } else if (z2 && e.this.o1 != -1) {
                            i19 = e.this.o1;
                            if (z) {
                                f2 = e.this.u1;
                                f = 1.0f - f2;
                            } else {
                                f = e.this.u1;
                            }
                            f4 = f;
                        }
                        constraintWidget8.U0(i19);
                        constraintWidget8.T0(f4);
                    }
                    if (i17 == i3 - 1) {
                        constraintWidget8.l(constraintWidget8.S, this.f, this.j);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.Q.a(constraintWidget4.S, e.this.w1);
                        if (i17 == i5) {
                            constraintWidget8.Q.u(this.h);
                        }
                        constraintWidget4.S.a(constraintWidget8.Q, 0);
                        if (i17 == i6 + 1) {
                            constraintWidget4.S.u(this.j);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        c = 3;
                        if (e.this.z1 == 3 && constraintWidget.d0() && constraintWidget8 != constraintWidget && constraintWidget8.d0()) {
                            constraintWidget8.U.a(constraintWidget.U, 0);
                        } else {
                            int i20 = e.this.z1;
                            if (i20 == 0) {
                                constraintWidget8.R.a(constraintWidget7.R, 0);
                            } else if (i20 == i2) {
                                constraintWidget8.T.a(constraintWidget7.T, 0);
                            } else if (z3) {
                                constraintWidget8.R.a(this.e, this.i);
                                constraintWidget8.T.a(this.g, this.k);
                            } else {
                                constraintWidget8.R.a(constraintWidget7.R, 0);
                                constraintWidget8.T.a(constraintWidget7.T, 0);
                            }
                        }
                    } else {
                        c = 3;
                    }
                }
                i17++;
                c2 = c;
                constraintWidget4 = constraintWidget8;
            }
        }

        public int e() {
            return this.a == 1 ? this.m - e.this.x1 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - e.this.w1 : this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < e.this.I1; i5++) {
                ConstraintWidget constraintWidget = e.this.H1[this.n + i5];
                if (this.a == 0) {
                    if (constraintWidget != null && constraintWidget.C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.w == 0) {
                        e.this.K1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.X(), constraintWidget.z());
                    }
                } else if (constraintWidget != null && constraintWidget.X() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.x == 0) {
                    int i6 = i4;
                    e.this.K1(constraintWidget, constraintWidget.C(), constraintWidget.a0(), ConstraintWidget.DimensionBehaviour.FIXED, i6);
                    i4 = i6;
                }
            }
            h();
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    private void q2(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.G1 == null || this.F1 == null || this.E1 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.I1; i2++) {
            this.H1[i2].z0();
        }
        int[] iArr = this.G1;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.q1;
        ConstraintWidget constraintWidget2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.q1;
            } else {
                f = f2;
                i = i5;
            }
            ConstraintWidget constraintWidget3 = this.F1[i];
            if (constraintWidget3 != null && constraintWidget3.Z() != 8) {
                if (i5 == 0) {
                    constraintWidget3.l(constraintWidget3.Q, this.Q, G1());
                    constraintWidget3.U0(this.k1);
                    constraintWidget3.T0(f);
                }
                if (i5 == i3 - 1) {
                    constraintWidget3.l(constraintWidget3.S, this.S, H1());
                }
                if (i5 > 0 && constraintWidget2 != null) {
                    constraintWidget3.l(constraintWidget3.Q, constraintWidget2.S, this.w1);
                    constraintWidget2.l(constraintWidget2.S, constraintWidget3.Q, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            ConstraintWidget constraintWidget4 = this.E1[i6];
            if (constraintWidget4 != null && constraintWidget4.Z() != 8) {
                if (i6 == 0) {
                    constraintWidget4.l(constraintWidget4.R, this.R, I1());
                    constraintWidget4.l1(this.l1);
                    constraintWidget4.k1(this.r1);
                }
                if (i6 == i4 - 1) {
                    constraintWidget4.l(constraintWidget4.T, this.T, F1());
                }
                if (i6 > 0 && constraintWidget2 != null) {
                    constraintWidget4.l(constraintWidget4.R, constraintWidget2.T, this.x1);
                    constraintWidget2.l(constraintWidget2.T, constraintWidget4.R, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.C1 == 1) {
                    i9 = (i7 * i4) + i8;
                }
                ConstraintWidget[] constraintWidgetArr = this.H1;
                if (i9 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i9]) != null && constraintWidget.Z() != 8) {
                    ConstraintWidget constraintWidget5 = this.F1[i7];
                    ConstraintWidget constraintWidget6 = this.E1[i8];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.l(constraintWidget.Q, constraintWidget5.Q, 0);
                        constraintWidget.l(constraintWidget.S, constraintWidget5.S, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.l(constraintWidget.R, constraintWidget6.R, 0);
                        constraintWidget.l(constraintWidget.T, constraintWidget6.T, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int r2(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.X() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.x;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.E * i);
                if (i3 != constraintWidget.z()) {
                    constraintWidget.f1(true);
                    K1(constraintWidget, constraintWidget.C(), constraintWidget.a0(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.z();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.a0() * constraintWidget2.f0) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s2(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.w;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.B * i);
                if (i3 != constraintWidget.a0()) {
                    constraintWidget.f1(true);
                    K1(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.X(), constraintWidget.z());
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.a0();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.z() * constraintWidget2.f0) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.a0();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void t2(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.t2(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void u2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        e eVar;
        int i5;
        ConstraintAnchor constraintAnchor;
        int i6;
        e eVar2 = this;
        if (i == 0) {
            return;
        }
        eVar2.D1.clear();
        int i7 = i3;
        a aVar = eVar2.new a(i2, eVar2.Q, eVar2.R, eVar2.S, eVar2.T, i7);
        eVar2.D1.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i9];
                int iS2 = eVar2.s2(constraintWidget, i7);
                if (constraintWidget.C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i7 || (eVar2.w1 + i8) + iS2 > i7) && aVar.b != null;
                if (!z && i9 > 0 && (i6 = eVar2.B1) > 0 && i9 % i6 == 0) {
                    z = true;
                }
                if (z) {
                    aVar = eVar2.new a(i2, eVar2.Q, eVar2.R, eVar2.S, eVar2.T, i7);
                    aVar.i(i9);
                    eVar2.D1.add(aVar);
                } else {
                    if (i9 > 0) {
                        i8 += eVar2.w1 + iS2;
                    }
                    aVar.b(constraintWidget);
                    i9++;
                    i4 = i10;
                }
                i8 = iS2;
                aVar.b(constraintWidget);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i12];
                int iR2 = eVar2.r2(constraintWidget2, i7);
                if (constraintWidget2.X() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i7 || (eVar2.x1 + i11) + iR2 > i7) && aVar.b != null;
                if (!z2 && i12 > 0 && (i5 = eVar2.B1) > 0 && i12 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = eVar2.new a(i2, eVar2.Q, eVar2.R, eVar2.S, eVar2.T, i7);
                    eVar = eVar2;
                    aVar.i(i12);
                    eVar.D1.add(aVar);
                } else {
                    eVar = eVar2;
                    if (i12 > 0) {
                        i11 += eVar.x1 + iR2;
                    }
                    aVar.b(constraintWidget2);
                    i12++;
                    i7 = i3;
                    i4 = i13;
                    eVar2 = eVar;
                }
                i11 = iR2;
                aVar.b(constraintWidget2);
                i12++;
                i7 = i3;
                i4 = i13;
                eVar2 = eVar;
            }
        }
        e eVar3 = eVar2;
        int size = eVar3.D1.size();
        ConstraintAnchor constraintAnchor2 = eVar3.Q;
        ConstraintAnchor constraintAnchor3 = eVar3.R;
        ConstraintAnchor constraintAnchor4 = eVar3.S;
        ConstraintAnchor constraintAnchor5 = eVar3.T;
        int iG1 = eVar3.G1();
        int iI1 = eVar3.I1();
        int iH1 = eVar3.H1();
        int iF1 = eVar3.F1();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = eVar3.C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z3 = dimensionBehaviourC == dimensionBehaviour || eVar3.X() == dimensionBehaviour;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = eVar3.D1.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor2;
        int iF2 = iF1;
        int i15 = 0;
        int iH2 = iH1;
        int i16 = iI1;
        int i17 = iG1;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor3;
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            a aVar3 = eVar3.D1.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    constraintAnchor7 = eVar3.D1.get(i19 + 1).b.R;
                    iF2 = 0;
                } else {
                    constraintAnchor7 = eVar3.T;
                    iF2 = eVar3.F1();
                }
                ConstraintAnchor constraintAnchor10 = aVar3.b.T;
                int i20 = i18;
                aVar3.j(i2, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i17, i16, iH2, iF2, i3);
                int iMax = Math.max(i15, aVar3.f());
                int iE = aVar3.e() + i20;
                if (i19 > 0) {
                    iE += eVar3.x1;
                }
                i18 = iE;
                i15 = iMax;
                constraintAnchor9 = constraintAnchor10;
                i16 = 0;
            } else {
                int i21 = i15;
                int i22 = i18;
                if (i19 < size - 1) {
                    constraintAnchor = eVar3.D1.get(i19 + 1).b.Q;
                    iH2 = 0;
                } else {
                    constraintAnchor = eVar3.S;
                    iH2 = eVar3.H1();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = aVar3.b.S;
                aVar3.j(i2, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i17, i16, iH2, iF2, i3);
                int iF = aVar3.f() + i21;
                int iMax2 = Math.max(i22, aVar3.e());
                if (i19 > 0) {
                    iF += eVar3.w1;
                }
                int i23 = iF;
                i18 = iMax2;
                i15 = i23;
                i17 = 0;
                constraintAnchor6 = constraintAnchor11;
            }
        }
        iArr[0] = i15;
        iArr[1] = i18;
    }

    private void v2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        e eVar;
        int i5;
        ConstraintAnchor constraintAnchor;
        int i6;
        e eVar2 = this;
        if (i == 0) {
            return;
        }
        eVar2.D1.clear();
        int i7 = i3;
        a aVar = eVar2.new a(i2, eVar2.Q, eVar2.R, eVar2.S, eVar2.T, i7);
        eVar2.D1.add(aVar);
        boolean z = true;
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                i8++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i10];
                int iS2 = eVar2.s2(constraintWidget, i7);
                if (constraintWidget.C() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i11 = i4;
                boolean z2 = (i9 == i7 || (eVar2.w1 + i9) + iS2 > i7) && aVar.b != null;
                if (!z2 && i10 > 0 && (i6 = eVar2.B1) > 0 && i8 > i6) {
                    z2 = true;
                }
                if (z2) {
                    aVar = eVar2.new a(i2, eVar2.Q, eVar2.R, eVar2.S, eVar2.T, i7);
                    aVar.i(i10);
                    eVar2.D1.add(aVar);
                    i8 = 1;
                } else {
                    if (i10 > 0) {
                        i9 += eVar2.w1 + iS2;
                    }
                    aVar.b(constraintWidget);
                    i10++;
                    i4 = i11;
                }
                i9 = iS2;
                aVar.b(constraintWidget);
                i10++;
                i4 = i11;
            }
        } else {
            int i12 = 0;
            i4 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i) {
                i12++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i14];
                int iR2 = eVar2.r2(constraintWidget2, i7);
                if (constraintWidget2.X() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                boolean z3 = (i13 == i7 || (eVar2.x1 + i13) + iR2 > i7) && aVar.b != null;
                if (!z3 && i14 > 0 && (i5 = eVar2.B1) > 0 && i12 > i5) {
                    z3 = true;
                }
                if (z3) {
                    aVar = eVar2.new a(i2, eVar2.Q, eVar2.R, eVar2.S, eVar2.T, i7);
                    eVar = eVar2;
                    aVar.i(i14);
                    eVar.D1.add(aVar);
                    i12 = 1;
                } else {
                    eVar = eVar2;
                    if (i14 > 0) {
                        i13 += eVar.x1 + iR2;
                    }
                    aVar.b(constraintWidget2);
                    i14++;
                    i7 = i3;
                    i4 = i15;
                    eVar2 = eVar;
                }
                i13 = iR2;
                aVar.b(constraintWidget2);
                i14++;
                i7 = i3;
                i4 = i15;
                eVar2 = eVar;
            }
        }
        e eVar3 = eVar2;
        int size = eVar3.D1.size();
        ConstraintAnchor constraintAnchor2 = eVar3.Q;
        ConstraintAnchor constraintAnchor3 = eVar3.R;
        ConstraintAnchor constraintAnchor4 = eVar3.S;
        ConstraintAnchor constraintAnchor5 = eVar3.T;
        int iG1 = eVar3.G1();
        int iI1 = eVar3.I1();
        int iH1 = eVar3.H1();
        int iF1 = eVar3.F1();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourC = eVar3.C();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z4 = dimensionBehaviourC == dimensionBehaviour || eVar3.X() == dimensionBehaviour;
        if (i4 > 0 && z4) {
            for (int i16 = 0; i16 < size; i16++) {
                a aVar2 = eVar3.D1.get(i16);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor3;
        int iF2 = iF1;
        int i17 = 0;
        int i18 = 0;
        int iH2 = iH1;
        int i19 = iI1;
        int i20 = iG1;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor2;
        int i21 = 0;
        while (i18 < size) {
            a aVar3 = eVar3.D1.get(i18);
            if (i2 == 0) {
                if (i18 < size - 1) {
                    constraintAnchor7 = eVar3.D1.get(i18 + 1).b.R;
                    iF2 = 0;
                } else {
                    constraintAnchor7 = eVar3.T;
                    iF2 = eVar3.F1();
                }
                ConstraintAnchor constraintAnchor10 = aVar3.b.T;
                int i22 = i17;
                aVar3.j(i2, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i20, i19, iH2, iF2, i3);
                int iMax = Math.max(i21, aVar3.f());
                int iE = aVar3.e() + i22;
                if (i18 > 0) {
                    iE += eVar3.x1;
                }
                i17 = iE;
                i21 = iMax;
                constraintAnchor6 = constraintAnchor10;
                i19 = 0;
            } else {
                int i23 = i17;
                int i24 = i21;
                if (i18 < size - 1) {
                    constraintAnchor = eVar3.D1.get(i18 + 1).b.Q;
                    iH2 = 0;
                } else {
                    constraintAnchor = eVar3.S;
                    iH2 = eVar3.H1();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = aVar3.b.S;
                aVar3.j(i2, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i20, i19, iH2, iF2, i3);
                int iF = aVar3.f() + i24;
                int iMax2 = Math.max(i23, aVar3.e());
                if (i18 > 0) {
                    iF += eVar3.w1;
                }
                int i25 = iF;
                i17 = iMax2;
                i21 = i25;
                i20 = 0;
                constraintAnchor9 = constraintAnchor11;
            }
            i18++;
            z = z;
        }
        iArr[0] = i21;
        iArr[z ? 1 : 0] = i17;
    }

    private void w2(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.D1.size() == 0) {
            aVar = new a(i2, this.Q, this.R, this.S, this.T, i3);
            this.D1.add(aVar);
        } else {
            a aVar2 = this.D1.get(0);
            aVar2.c();
            aVar2.j(i2, this.Q, this.R, this.S, this.T, G1(), I1(), H1(), F1(), i3);
            aVar = aVar2;
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(constraintWidgetArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(int i) {
        this.n1 = i;
    }

    public void B2(int i) {
        this.y1 = i;
    }

    public void C2(float f) {
        this.q1 = f;
    }

    public void D2(int i) {
        this.w1 = i;
    }

    public void E2(int i) {
        this.k1 = i;
    }

    public void F2(float f) {
        this.u1 = f;
    }

    public void G2(int i) {
        this.o1 = i;
    }

    public void H2(float f) {
        this.v1 = f;
    }

    public void I2(int i) {
        this.p1 = i;
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public void J1(int i, int i2, int i3, int i4) {
        int i5;
        ConstraintWidget[] constraintWidgetArr;
        if (this.W0 > 0 && !L1()) {
            O1(0, 0);
            N1(false);
            return;
        }
        int iG1 = G1();
        int iH1 = H1();
        int iI1 = I1();
        int iF1 = F1();
        int[] iArr = new int[2];
        int i6 = (i2 - iG1) - iH1;
        int i7 = this.C1;
        if (i7 == 1) {
            i6 = (i4 - iI1) - iF1;
        }
        int i8 = i6;
        if (i7 == 0) {
            if (this.k1 == -1) {
                this.k1 = 0;
            }
            if (this.l1 == -1) {
                this.l1 = 0;
            }
        } else {
            if (this.k1 == -1) {
                this.k1 = 0;
            }
            if (this.l1 == -1) {
                this.l1 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = this.V0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = this.W0;
            if (i9 >= i5) {
                break;
            }
            if (this.V0[i9].Z() == 8) {
                i10++;
            }
            i9++;
        }
        if (i10 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i5 - i10];
            int i11 = 0;
            i5 = 0;
            while (i11 < this.W0) {
                ConstraintWidget constraintWidget = this.V0[i11];
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget.Z() != 8) {
                    constraintWidgetArr4[i5] = constraintWidget;
                    i5++;
                }
                i11++;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            constraintWidgetArr = constraintWidgetArr2;
        }
        int i12 = i5;
        this.H1 = constraintWidgetArr;
        this.I1 = i12;
        int i13 = this.A1;
        if (i13 == 0) {
            w2(constraintWidgetArr, i12, this.C1, i8, iArr);
        } else if (i13 == 1) {
            u2(constraintWidgetArr, i12, this.C1, i8, iArr);
        } else if (i13 == 2) {
            t2(constraintWidgetArr, i12, this.C1, i8, iArr);
        } else if (i13 == 3) {
            v2(constraintWidgetArr, i12, this.C1, i8, iArr);
        }
        int iMin = iArr[0] + iG1 + iH1;
        int iMin2 = iArr[1] + iI1 + iF1;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = 0;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = 0;
        }
        O1(iMin, iMin2);
        r1(iMin);
        S0(iMin2);
        N1(this.W0 > 0);
    }

    public void J2(int i) {
        this.B1 = i;
    }

    public void K2(int i) {
        this.C1 = i;
    }

    public void L2(int i) {
        this.z1 = i;
    }

    public void M2(float f) {
        this.r1 = f;
    }

    public void N2(int i) {
        this.x1 = i;
    }

    public void O2(int i) {
        this.l1 = i;
    }

    public void P2(int i) {
        this.A1 = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.d dVar, boolean z) {
        super.g(dVar, z);
        boolean z2 = N() != null && ((d) N()).Y1();
        int i = this.A1;
        if (i != 0) {
            if (i == 1) {
                int size = this.D1.size();
                int i2 = 0;
                while (i2 < size) {
                    this.D1.get(i2).d(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                q2(z2);
            } else if (i == 3) {
                int size2 = this.D1.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.D1.get(i3).d(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.D1.size() > 0) {
            this.D1.get(0).d(z2, 0, true);
        }
        N1(false);
    }

    @Override // com.google.inputmethod.gc5, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.n(constraintWidget, map);
        e eVar = (e) constraintWidget;
        this.k1 = eVar.k1;
        this.l1 = eVar.l1;
        this.m1 = eVar.m1;
        this.n1 = eVar.n1;
        this.o1 = eVar.o1;
        this.p1 = eVar.p1;
        this.q1 = eVar.q1;
        this.r1 = eVar.r1;
        this.s1 = eVar.s1;
        this.t1 = eVar.t1;
        this.u1 = eVar.u1;
        this.v1 = eVar.v1;
        this.w1 = eVar.w1;
        this.x1 = eVar.x1;
        this.y1 = eVar.y1;
        this.z1 = eVar.z1;
        this.A1 = eVar.A1;
        this.B1 = eVar.B1;
        this.C1 = eVar.C1;
    }

    public void x2(float f) {
        this.s1 = f;
    }

    public void y2(int i) {
        this.m1 = i;
    }

    public void z2(float f) {
        this.t1 = f;
    }
}
