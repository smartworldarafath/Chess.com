package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.j;
import androidx.constraintlayout.core.widgets.analyzer.l;
import com.google.inputmethod.lo6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class ConstraintWidget {
    public static float U0 = 0.5f;
    public int A;
    int A0;
    public float B;
    int B0;
    public int C;
    boolean C0;
    public int D;
    boolean D0;
    public float E;
    boolean E0;
    public boolean F;
    boolean F0;
    public boolean G;
    boolean G0;
    int H;
    boolean H0;
    float I;
    boolean I0;
    private int[] J;
    int J0;
    public float K;
    int K0;
    private boolean L;
    boolean L0;
    private boolean M;
    boolean M0;
    private boolean N;
    public float[] N0;
    private int O;
    protected ConstraintWidget[] O0;
    private int P;
    protected ConstraintWidget[] P0;
    public ConstraintAnchor Q;
    ConstraintWidget Q0;
    public ConstraintAnchor R;
    ConstraintWidget R0;
    public ConstraintAnchor S;
    public int S0;
    public ConstraintAnchor T;
    public int T0;
    public ConstraintAnchor U;
    ConstraintAnchor V;
    ConstraintAnchor W;
    public ConstraintAnchor X;
    public ConstraintAnchor[] Y;
    protected ArrayList<ConstraintAnchor> Z;
    public boolean a;
    private boolean[] a0;
    public WidgetRun[] b;
    public DimensionBehaviour[] b0;
    public androidx.constraintlayout.core.widgets.analyzer.c c;
    public ConstraintWidget c0;
    public androidx.constraintlayout.core.widgets.analyzer.c d;
    int d0;
    public j e;
    int e0;
    public l f;
    public float f0;
    public boolean[] g;
    protected int g0;
    boolean h;
    protected int h0;
    private boolean i;
    protected int i0;
    private boolean j;
    int j0;
    private boolean k;
    int k0;
    private int l;
    protected int l0;
    private int m;
    protected int m0;
    public androidx.constraintlayout.core.state.d n;
    int n0;
    public String o;
    protected int o0;
    private boolean p;
    protected int p0;
    private boolean q;
    float q0;
    private boolean r;
    float r0;
    private boolean s;
    private Object s0;
    public int t;
    private int t0;
    public int u;
    private int u0;
    private int v;
    private boolean v0;
    public int w;
    private String w0;
    public int x;
    private String x0;
    public int[] y;
    int y0;
    public int z;
    int z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintWidget() {
        this.a = false;
        this.b = new WidgetRun[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new androidx.constraintlayout.core.state.d(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = Float.NaN;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.X = constraintAnchor;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor};
        this.Z = new ArrayList<>();
        this.a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = U0;
        this.q0 = f;
        this.r0 = f;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = new ConstraintWidget[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
    }

    private void C0(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    private void D0(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private void E0(StringBuilder sb, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(str2);
        sb.append(",\n");
    }

    private void F0(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    private void S(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, DimensionBehaviour dimensionBehaviour, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        E0(sb, "      behavior", dimensionBehaviour.toString(), DimensionBehaviour.FIXED.toString());
        D0(sb, "      size", i, 0);
        D0(sb, "      min", i2, 0);
        D0(sb, "      max", i3, Integer.MAX_VALUE);
        D0(sb, "      matchMin", i5, 0);
        D0(sb, "      matchDef", i6, 0);
        C0(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private void T(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f);
        sb.append("'");
        if (constraintAnchor.h != Integer.MIN_VALUE || constraintAnchor.g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.g);
            if (constraintAnchor.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0582  */
    private void i(androidx.constraintlayout.core.d dVar, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        boolean z12;
        int iMin;
        int i9;
        SolverVariable solverVariable3;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        SolverVariable solverVariableQ;
        SolverVariable solverVariableQ2;
        int i12;
        char c;
        char c2;
        ConstraintAnchor constraintAnchor3;
        boolean z15;
        SolverVariable solverVariable4;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        boolean z18;
        boolean z19;
        SolverVariable solverVariable5;
        ConstraintWidget constraintWidget;
        int i15;
        boolean z20;
        int iMin2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        ConstraintWidget constraintWidget2;
        int i23;
        ConstraintWidget constraintWidget3;
        dVar = dVar;
        SolverVariable solverVariableQ3 = dVar.q(constraintAnchor);
        SolverVariable solverVariableQ4 = dVar.q(constraintAnchor2);
        SolverVariable solverVariableQ5 = dVar.q(constraintAnchor.j());
        SolverVariable solverVariableQ6 = dVar.q(constraintAnchor2.j());
        androidx.constraintlayout.core.d.x();
        boolean zO = constraintAnchor.o();
        boolean zO2 = constraintAnchor2.o();
        boolean zO3 = this.X.o();
        int i24 = zO2 ? (zO ? 1 : 0) + 1 : zO ? 1 : 0;
        if (zO3) {
            i24++;
        }
        int i25 = z6 ? 3 : i5;
        SolverVariable solverVariable6 = solverVariableQ6;
        int iOrdinal = dimensionBehaviour.ordinal();
        boolean z21 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i25 == 4) ? false : true;
        int i26 = this.l;
        if (i26 != -1 && z) {
            this.l = -1;
            i2 = i26;
            z21 = false;
        }
        int i27 = this.m;
        if (i27 == -1 || z) {
            i27 = i2;
        } else {
            this.m = -1;
            z21 = false;
        }
        int i28 = i27;
        if (this.u0 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            z12 = z21;
            iMin = i28;
        }
        if (z11) {
            if (!zO && !zO2 && !zO3) {
                dVar.f(solverVariableQ3, i);
            } else if (zO && !zO2) {
                i9 = 8;
                dVar.e(solverVariableQ3, solverVariableQ5, constraintAnchor.f(), 8);
            }
            i9 = 8;
        } else {
            i9 = 8;
        }
        if (z12 == 0) {
            if (z5) {
                dVar.e(solverVariableQ4, solverVariableQ3, 0, 3);
                if (i3 > 0) {
                    dVar.h(solverVariableQ4, solverVariableQ3, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    dVar.j(solverVariableQ4, solverVariableQ3, i4, 8);
                }
            } else {
                dVar.e(solverVariableQ4, solverVariableQ3, iMin, i9);
            }
            i11 = i8;
            solverVariable3 = solverVariableQ4;
            i24 = i24 == true ? 1 : 0;
            solverVariable6 = solverVariable6;
            z13 = z12;
            z14 = z4;
            i10 = i7;
        } else if (i24 == 2 || z6 || !(i25 == 1 || i25 == 0)) {
            int i29 = i7 == -2 ? iMin : i7;
            int i30 = i8 == -2 ? iMin : i8;
            if (iMin > 0 && i25 != 1) {
                iMin = 0;
            }
            if (i29 > 0) {
                dVar.h(solverVariableQ4, solverVariableQ3, i29, 8);
                iMin = Math.max(iMin, i29);
            }
            if (i30 > 0) {
                if (!z2 || i25 != 1) {
                    dVar.j(solverVariableQ4, solverVariableQ3, i30, 8);
                }
                iMin = Math.min(iMin, i30);
            }
            if (i25 == 1) {
                if (z2) {
                    dVar.e(solverVariableQ4, solverVariableQ3, iMin, 8);
                } else if (z8) {
                    dVar.e(solverVariableQ4, solverVariableQ3, iMin, 5);
                    dVar.j(solverVariableQ4, solverVariableQ3, iMin, 8);
                } else {
                    dVar.e(solverVariableQ4, solverVariableQ3, iMin, 5);
                    dVar.j(solverVariableQ4, solverVariableQ3, iMin, 8);
                }
                solverVariable3 = solverVariableQ4;
                solverVariable6 = solverVariable6;
                z13 = z12;
                z14 = z4;
                i10 = i29;
                i11 = i30;
                i24 = i24 == true ? 1 : 0;
            } else {
                if (i25 == 2) {
                    ConstraintAnchor.Type typeK = constraintAnchor.k();
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.TOP;
                    if (typeK == type || constraintAnchor.k() == ConstraintAnchor.Type.BOTTOM) {
                        solverVariableQ = dVar.q(this.c0.q(type));
                        solverVariableQ2 = dVar.q(this.c0.q(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableQ = dVar.q(this.c0.q(ConstraintAnchor.Type.LEFT));
                        solverVariableQ2 = dVar.q(this.c0.q(ConstraintAnchor.Type.RIGHT));
                    }
                    SolverVariable solverVariable7 = solverVariableQ2;
                    solverVariable3 = solverVariableQ4;
                    dVar.d(dVar.r().k(solverVariable3, solverVariableQ3, solverVariable7, solverVariableQ, f2));
                    if (z2) {
                        z12 = false;
                    }
                    z14 = z4;
                    z13 = z12;
                } else {
                    solverVariable3 = solverVariableQ4;
                    z13 = z12;
                    z14 = true;
                }
                i10 = i29;
                i11 = i30;
            }
        } else {
            int iMax = Math.max(i7, iMin);
            if (i8 > 0) {
                iMax = Math.min(i8, iMax);
            }
            dVar.e(solverVariableQ4, solverVariableQ3, iMax, 8);
            i10 = i7;
            i11 = i8;
            solverVariable3 = solverVariableQ4;
            i24 = i24 == true ? 1 : 0;
            solverVariable6 = solverVariable6;
            z13 = false;
            z14 = z4;
        }
        if (!z11) {
            i12 = 8;
            c = 1;
            c2 = 2;
        } else {
            if (!z8) {
                if (!zO && !zO2 && !zO3) {
                    i17 = 5;
                    z20 = z2;
                    i23 = i17;
                } else if (!zO || zO2) {
                    if (zO || !zO2) {
                        if (zO && zO2) {
                            ConstraintWidget constraintWidget4 = constraintAnchor.f.d;
                            ConstraintWidget constraintWidget5 = constraintAnchor2.f.d;
                            ConstraintWidget constraintWidgetN = N();
                            int i31 = 6;
                            if (!z13) {
                                z15 = true;
                                if (solverVariableQ5.g && solverVariable6.g) {
                                    SolverVariable solverVariable8 = solverVariable6;
                                    dVar.c(solverVariableQ3, solverVariableQ5, constraintAnchor.f(), f, solverVariable8, solverVariable3, constraintAnchor2.f(), 8);
                                    if (z2 && z14) {
                                        int iF = constraintAnchor2.f != null ? constraintAnchor2.f() : 0;
                                        if (solverVariable8 != solverVariable2) {
                                            dVar.h(solverVariable2, solverVariable3, iF, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                SolverVariable solverVariable9 = solverVariable6;
                                solverVariableQ3 = solverVariableQ3;
                                solverVariable4 = solverVariable9;
                                dVar = dVar;
                                solverVariableQ5 = solverVariableQ5;
                                z16 = true;
                                z17 = true;
                                i31 = 6;
                                i13 = 5;
                                i14 = 4;
                                z18 = false;
                            } else if (i25 == 0) {
                                if (i11 != 0 || i10 != 0) {
                                    i21 = 5;
                                    i22 = 5;
                                    z17 = true;
                                    z18 = false;
                                    z16 = true;
                                } else if (solverVariableQ5.g && solverVariable6.g) {
                                    dVar.e(solverVariableQ3, solverVariableQ5, constraintAnchor.f(), 8);
                                    dVar.e(solverVariable3, solverVariable6, -constraintAnchor2.f(), 8);
                                    return;
                                } else {
                                    i21 = 8;
                                    i22 = 8;
                                    z17 = false;
                                    z18 = true;
                                    z16 = false;
                                }
                                if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.a)) {
                                    solverVariable4 = solverVariable6;
                                    z15 = true;
                                    i14 = 4;
                                } else {
                                    solverVariable4 = solverVariable6;
                                    i14 = i22;
                                    z15 = true;
                                }
                                i13 = i21;
                                solverVariableQ5 = solverVariableQ5;
                                i31 = 6;
                            } else {
                                if (i25 == 2) {
                                    if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.a)) {
                                        solverVariable4 = solverVariable6;
                                        z15 = true;
                                        i14 = 4;
                                    } else {
                                        solverVariable4 = solverVariable6;
                                        z15 = true;
                                        i14 = 5;
                                    }
                                    i13 = 5;
                                } else if (i25 == 1) {
                                    SolverVariable solverVariable10 = solverVariable6;
                                    solverVariableQ3 = solverVariableQ3;
                                    solverVariable4 = solverVariable10;
                                    solverVariableQ5 = solverVariableQ5;
                                    i31 = 6;
                                    z15 = true;
                                    i14 = 4;
                                    i13 = 8;
                                } else if (i25 != 3) {
                                    z15 = true;
                                    SolverVariable solverVariable11 = solverVariable6;
                                    solverVariableQ3 = solverVariableQ3;
                                    solverVariable4 = solverVariable11;
                                    dVar = dVar;
                                    solverVariableQ5 = solverVariableQ5;
                                    i31 = 6;
                                    i14 = 4;
                                    i13 = 5;
                                    z16 = false;
                                    z17 = false;
                                    z18 = false;
                                } else if (this.H == -1) {
                                    if (z9) {
                                        SolverVariable solverVariable12 = solverVariable6;
                                        solverVariableQ3 = solverVariableQ3;
                                        solverVariable4 = solverVariable12;
                                        dVar = dVar;
                                        solverVariableQ5 = solverVariableQ5;
                                        z15 = true;
                                        i31 = z2 ? 5 : 4;
                                    } else {
                                        SolverVariable solverVariable13 = solverVariable6;
                                        solverVariableQ3 = solverVariableQ3;
                                        solverVariable4 = solverVariable13;
                                        dVar = dVar;
                                        solverVariableQ5 = solverVariableQ5;
                                        z15 = true;
                                        i31 = 8;
                                    }
                                    i14 = 5;
                                    i13 = 8;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    if (z6) {
                                        if (i6 != 2) {
                                            z15 = true;
                                            if (i6 != 1) {
                                                i19 = 8;
                                                i20 = 5;
                                            }
                                            solverVariable4 = solverVariable6;
                                            i13 = i19;
                                            i14 = i20;
                                            z16 = z15;
                                            z17 = z16;
                                            z18 = z17;
                                        } else {
                                            z15 = true;
                                        }
                                        i19 = 5;
                                        i20 = 4;
                                        solverVariable4 = solverVariable6;
                                        i13 = i19;
                                        i14 = i20;
                                        z16 = z15;
                                        z17 = z16;
                                        z18 = z17;
                                    } else {
                                        z15 = true;
                                        if (i11 > 0) {
                                            solverVariable4 = solverVariable6;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                            i14 = 5;
                                        } else if (i11 != 0 || i10 != 0) {
                                            solverVariable4 = solverVariable6;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                            i14 = 4;
                                        } else if (z9) {
                                            solverVariable4 = solverVariable6;
                                            i13 = (constraintWidget4 == constraintWidgetN || constraintWidget5 == constraintWidgetN) ? 5 : 4;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                            i14 = 4;
                                        } else {
                                            solverVariable4 = solverVariable6;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                            i14 = 8;
                                        }
                                        i13 = 5;
                                    }
                                    dVar = dVar;
                                }
                                z16 = true;
                                z17 = true;
                                z18 = false;
                            }
                            if (z16 && solverVariableQ5 == solverVariable4 && constraintWidget4 != constraintWidgetN) {
                                z16 = false;
                                z19 = false;
                            } else {
                                z19 = z15;
                            }
                            if (z17) {
                                if (z13 || z7 || z9 || solverVariableQ5 != solverVariable || solverVariable4 != solverVariable2) {
                                    i18 = i31;
                                    z20 = z2;
                                } else {
                                    i18 = 8;
                                    z20 = false;
                                    i13 = 8;
                                    z19 = false;
                                }
                                SolverVariable solverVariable14 = solverVariableQ3;
                                constraintWidget = constraintWidgetN;
                                i15 = 8;
                                SolverVariable solverVariable15 = solverVariable3;
                                dVar.c(solverVariable14, solverVariableQ5, constraintAnchor.f(), f, solverVariable4, solverVariable15, constraintAnchor2.f(), i18);
                                SolverVariable solverVariable16 = solverVariable4;
                                solverVariable5 = solverVariable14;
                                solverVariable6 = solverVariable16;
                                solverVariable3 = solverVariable15;
                            } else {
                                solverVariable6 = solverVariable4;
                                solverVariable5 = solverVariableQ3;
                                constraintWidget = constraintWidgetN;
                                z15 = z15;
                                i15 = 8;
                                z20 = z2;
                            }
                            if (this.u0 == i15 && !constraintAnchor2.m()) {
                                return;
                            }
                            if (z16) {
                                int i32 = (!z20 || solverVariableQ5 == solverVariable6 || z13 || !((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.a))) ? i13 : 6;
                                dVar.h(solverVariable5, solverVariableQ5, constraintAnchor.f(), i32);
                                dVar.j(solverVariable3, solverVariable6, -constraintAnchor2.f(), i32);
                                i13 = i32;
                            }
                            if (!z20 || !z10 || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.a) || constraintWidget5 == constraintWidget) {
                                iMin2 = i14;
                                i16 = i13;
                                z15 = z19;
                            } else {
                                iMin2 = 6;
                                i16 = 6;
                            }
                            if (z15) {
                                if (z18 && (!z9 || z3)) {
                                    if (constraintWidget4 != constraintWidget && constraintWidget5 != constraintWidget) {
                                        i31 = iMin2;
                                    }
                                    if ((constraintWidget4 instanceof f) || (constraintWidget5 instanceof f)) {
                                        i31 = 5;
                                    }
                                    if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.a)) {
                                        i31 = 5;
                                    }
                                    iMin2 = Math.max(z9 ? 5 : i31, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i16, iMin2);
                                    if (z6 && !z9 && (constraintWidget4 == constraintWidget || constraintWidget5 == constraintWidget)) {
                                        iMin2 = 4;
                                    }
                                }
                                dVar.e(solverVariable5, solverVariableQ5, constraintAnchor.f(), iMin2);
                                dVar.e(solverVariable3, solverVariable6, -constraintAnchor2.f(), iMin2);
                            }
                            if (z20) {
                                int iF2 = solverVariable == solverVariableQ5 ? constraintAnchor.f() : 0;
                                if (solverVariableQ5 != solverVariable) {
                                    dVar.h(solverVariable5, solverVariable, iF2, 5);
                                }
                            }
                            if (!z20 || !z13 || i3 != 0 || i10 != 0) {
                                i17 = 5;
                            } else if (z13 && i25 == 3) {
                                dVar.h(solverVariable3, solverVariable5, 0, i15);
                                i17 = 5;
                            } else {
                                i17 = 5;
                                dVar.h(solverVariable3, solverVariable5, 0, 5);
                            }
                        }
                        i23 = i17;
                    } else {
                        dVar.e(solverVariable3, solverVariable6, -constraintAnchor2.f(), 8);
                        if (z2) {
                            if (this.j && solverVariableQ3.g && (constraintWidget2 = this.c0) != null) {
                                d dVar2 = (d) constraintWidget2;
                                if (z) {
                                    dVar2.H1(constraintAnchor);
                                } else {
                                    dVar2.M1(constraintAnchor);
                                }
                            } else {
                                i17 = 5;
                                dVar.h(solverVariableQ3, solverVariable, 0, 5);
                            }
                        }
                        z20 = z2;
                        i23 = i17;
                    }
                    i17 = 5;
                    z20 = z2;
                    i23 = i17;
                } else {
                    i23 = (z2 && (constraintAnchor.f.d instanceof androidx.constraintlayout.core.widgets.a)) ? 8 : 5;
                    z20 = z2;
                    solverVariable6 = solverVariable6;
                }
                if (z20 && z14) {
                    int iF3 = constraintAnchor2.f != null ? constraintAnchor2.f() : 0;
                    if (solverVariable6 != solverVariable2) {
                        if (!this.j || !solverVariable3.g || (constraintWidget3 = this.c0) == null) {
                            dVar.h(solverVariable2, solverVariable3, iF3, i23);
                            return;
                        }
                        d dVar3 = (d) constraintWidget3;
                        if (z) {
                            dVar3.G1(constraintAnchor2);
                            return;
                        } else {
                            dVar3.L1(constraintAnchor2);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            c2 = 2;
            i12 = 8;
            c = 1;
        }
        if (i24 < c2 && z2 && z14) {
            dVar.h(solverVariableQ3, solverVariable, 0, i12);
            char c3 = (z || this.U.f == null) ? c : (char) 0;
            if (!z && (constraintAnchor3 = this.U.f) != null) {
                ConstraintWidget constraintWidget6 = constraintAnchor3.d;
                if (constraintWidget6.f0 != 0.0f) {
                    DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.b0;
                    DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                    DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[c] == dimensionBehaviour3) {
                        c3 = c;
                    } else {
                        c3 = 0;
                    }
                } else {
                    c3 = 0;
                }
            }
            if (c3 != 0) {
                dVar.h(solverVariable2, solverVariable3, 0, i12);
            }
        }
    }

    private boolean j0(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.Y;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return (constraintAnchor4 == null || constraintAnchor4.f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f) == null || constraintAnchor2.f != constraintAnchor) ? false : true;
    }

    public float A() {
        return this.q0;
    }

    public void A0() {
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            this.Z.get(i).r();
        }
    }

    public int B() {
        return this.J0;
    }

    public void B0(androidx.constraintlayout.core.c cVar) {
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
        this.X.s(cVar);
        this.V.s(cVar);
        this.W.s(cVar);
    }

    public DimensionBehaviour C() {
        return this.b0[0];
    }

    public int D() {
        ConstraintAnchor constraintAnchor = this.Q;
        int i = constraintAnchor != null ? constraintAnchor.g : 0;
        ConstraintAnchor constraintAnchor2 = this.S;
        return constraintAnchor2 != null ? i + constraintAnchor2.g : i;
    }

    public int E() {
        return this.O;
    }

    public int F() {
        return this.P;
    }

    public int G() {
        return b0();
    }

    public void G0(boolean z) {
        this.v0 = z;
    }

    public int H(int i) {
        if (i == 0) {
            return a0();
        }
        if (i == 1) {
            return z();
        }
        return 0;
    }

    public void H0(int i) {
        this.n0 = i;
        this.L = i > 0;
    }

    public int I() {
        return this.J[1];
    }

    public void I0(Object obj) {
        this.s0 = obj;
    }

    public int J() {
        return this.J[0];
    }

    public void J0(String str) {
        this.w0 = str;
    }

    public int K() {
        return this.p0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
  0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void K0(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f0 = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f0 = fAbs;
            this.g0 = i3;
        }
    }

    public int L() {
        return this.o0;
    }

    public void L0(int i) {
        if (this.L) {
            int i2 = i - this.n0;
            int i3 = this.e0 + i2;
            this.i0 = i2;
            this.R.t(i2);
            this.T.t(i3);
            this.U.t(i);
            this.q = true;
        }
    }

    public ConstraintWidget M(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.T).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public void M0(int i, int i2) {
        if (this.p) {
            return;
        }
        this.Q.t(i);
        this.S.t(i2);
        this.h0 = i;
        this.d0 = i2 - i;
        this.p = true;
    }

    public ConstraintWidget N() {
        return this.c0;
    }

    public void N0(int i) {
        this.Q.t(i);
        this.h0 = i;
    }

    public ConstraintWidget O(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.R).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.Q;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public void O0(int i) {
        this.R.t(i);
        this.i0 = i;
    }

    public int P() {
        return b0() + this.d0;
    }

    public void P0(int i, int i2) {
        if (this.q) {
            return;
        }
        this.R.t(i);
        this.T.t(i2);
        this.i0 = i;
        this.e0 = i2 - i;
        if (this.L) {
            this.U.t(i + this.n0);
        }
        this.q = true;
    }

    public WidgetRun Q(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public void Q0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.h0 = i;
        this.i0 = i2;
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.d0)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.e0)) {
            i8 = i5;
        }
        this.d0 = i7;
        this.e0 = i8;
        int i9 = this.p0;
        if (i8 < i9) {
            this.e0 = i9;
        }
        int i10 = this.o0;
        if (i7 < i10) {
            this.d0 = i10;
        }
        int i11 = this.A;
        if (i11 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.d0 = Math.min(this.d0, i11);
        }
        int i12 = this.D;
        if (i12 > 0 && this.b0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.e0 = Math.min(this.e0, i12);
        }
        int i13 = this.d0;
        if (i7 != i13) {
            this.l = i13;
        }
        int i14 = this.e0;
        if (i8 != i14) {
            this.m = i14;
        }
    }

    public void R(StringBuilder sb) {
        sb.append("  " + this.o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.d0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.e0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.h0);
        sb.append("\n");
        sb.append("    actualTop:" + this.i0);
        sb.append("\n");
        T(sb, "left", this.Q);
        T(sb, "top", this.R);
        T(sb, "right", this.S);
        T(sb, "bottom", this.T);
        T(sb, "baseline", this.U);
        T(sb, "centerX", this.V);
        T(sb, "centerY", this.W);
        S(sb, "    width", this.d0, this.o0, this.J[0], this.l, this.z, this.w, this.B, this.b0[0], this.N0[0]);
        S(sb, "    height", this.e0, this.p0, this.J[1], this.m, this.C, this.x, this.E, this.b0[1], this.N0[1]);
        F0(sb, "    dimensionRatio", this.f0, this.g0);
        C0(sb, "    horizontalBias", this.q0, U0);
        C0(sb, "    verticalBias", this.r0, U0);
        D0(sb, "    horizontalChainStyle", this.J0, 0);
        D0(sb, "    verticalChainStyle", this.K0, 0);
        sb.append("  }");
    }

    public void R0(boolean z) {
        this.L = z;
    }

    public void S0(int i) {
        this.e0 = i;
        int i2 = this.p0;
        if (i < i2) {
            this.e0 = i2;
        }
    }

    public void T0(float f) {
        this.q0 = f;
    }

    public int U() {
        return c0();
    }

    public void U0(int i) {
        this.J0 = i;
    }

    public float V() {
        return this.r0;
    }

    public void V0(int i, int i2) {
        this.h0 = i;
        int i3 = i2 - i;
        this.d0 = i3;
        int i4 = this.o0;
        if (i3 < i4) {
            this.d0 = i4;
        }
    }

    public int W() {
        return this.K0;
    }

    public void W0(DimensionBehaviour dimensionBehaviour) {
        this.b0[0] = dimensionBehaviour;
    }

    public DimensionBehaviour X() {
        return this.b0[1];
    }

    public void X0(int i, int i2, int i3, float f) {
        this.w = i;
        this.z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.A = i3;
        this.B = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.w = 2;
    }

    public int Y() {
        int i = this.Q != null ? this.R.g : 0;
        return this.S != null ? i + this.T.g : i;
    }

    public void Y0(float f) {
        this.N0[0] = f;
    }

    public int Z() {
        return this.u0;
    }

    protected void Z0(int i, boolean z) {
        this.a0[i] = z;
    }

    public int a0() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.d0;
    }

    public void a1(boolean z) {
        this.M = z;
    }

    public int b0() {
        ConstraintWidget constraintWidget = this.c0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.h0 : ((d) constraintWidget).c1 + this.h0;
    }

    public void b1(boolean z) {
        this.N = z;
    }

    public int c0() {
        ConstraintWidget constraintWidget = this.c0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.i0 : ((d) constraintWidget).d1 + this.i0;
    }

    public void c1(int i, int i2) {
        this.O = i;
        this.P = i2;
        f1(false);
    }

    public boolean d0() {
        return this.L;
    }

    public void d1(int i) {
        this.J[1] = i;
    }

    public void e(d dVar, androidx.constraintlayout.core.d dVar2, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, dVar2, this);
            hashSet.remove(this);
            g(dVar2, dVar.c2(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSetD = this.Q.d();
            if (hashSetD != null) {
                Iterator<ConstraintAnchor> it = hashSetD.iterator();
                while (it.hasNext()) {
                    it.next().d.e(dVar, dVar2, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSetD2 = this.S.d();
            if (hashSetD2 != null) {
                Iterator<ConstraintAnchor> it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    it2.next().d.e(dVar, dVar2, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSetD3 = this.R.d();
        if (hashSetD3 != null) {
            Iterator<ConstraintAnchor> it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                it3.next().d.e(dVar, dVar2, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSetD4 = this.T.d();
        if (hashSetD4 != null) {
            Iterator<ConstraintAnchor> it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                it4.next().d.e(dVar, dVar2, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSetD5 = this.U.d();
        if (hashSetD5 != null) {
            Iterator<ConstraintAnchor> it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                it5.next().d.e(dVar, dVar2, hashSet, i, true);
            }
        }
    }

    public boolean e0(int i) {
        if (i == 0) {
            return (this.Q.f != null ? 1 : 0) + (this.S.f != null ? 1 : 0) < 2;
        }
        return ((this.R.f != null ? 1 : 0) + (this.T.f != null ? 1 : 0)) + (this.U.f != null ? 1 : 0) < 2;
    }

    public void e1(int i) {
        this.J[0] = i;
    }

    boolean f() {
        return (this instanceof i) || (this instanceof f);
    }

    public boolean f0() {
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            if (this.Z.get(i).m()) {
                return true;
            }
        }
        return false;
    }

    public void f1(boolean z) {
        this.i = z;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02be  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x030b  */
    /* JADX WARN: Code duplicated, block: B:230:0x036a  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x0449  */
    /* JADX WARN: Code duplicated, block: B:264:0x045b  */
    /* JADX WARN: Code duplicated, block: B:265:0x045d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0460  */
    /* JADX WARN: Code duplicated, block: B:304:0x0537  */
    /* JADX WARN: Code duplicated, block: B:306:0x053e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0545  */
    /* JADX WARN: Code duplicated, block: B:309:0x0554  */
    /* JADX WARN: Code duplicated, block: B:310:0x0557  */
    /* JADX WARN: Code duplicated, block: B:313:0x056f  */
    /* JADX WARN: Multi-variable type inference failed */
    public void g(androidx.constraintlayout.core.d dVar, boolean z) {
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean z4;
        boolean z5;
        int i;
        SolverVariable solverVariable;
        int i2;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        boolean z8;
        int i5;
        int i6;
        boolean z9;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        int i7;
        int i8;
        char c;
        int i9;
        int i10;
        androidx.constraintlayout.core.d dVar2;
        boolean z10;
        l lVar;
        j jVar;
        int i11;
        int i12;
        boolean zM0;
        boolean zO0;
        j jVar2;
        l lVar2;
        androidx.constraintlayout.core.d dVar3 = dVar;
        SolverVariable solverVariableQ = dVar3.q(this.Q);
        SolverVariable solverVariableQ2 = dVar3.q(this.S);
        SolverVariable solverVariableQ3 = dVar3.q(this.R);
        SolverVariable solverVariableQ4 = dVar3.q(this.T);
        SolverVariable solverVariableQ5 = dVar3.q(this.U);
        ConstraintWidget constraintWidget3 = this.c0;
        if (constraintWidget3 == null) {
            z2 = false;
            z3 = false;
        } else {
            z3 = constraintWidget3 != null && constraintWidget3.b0[0] == DimensionBehaviour.WRAP_CONTENT;
            z2 = constraintWidget3 != null && constraintWidget3.b0[1] == DimensionBehaviour.WRAP_CONTENT;
            int i13 = this.v;
            if (i13 == 1) {
                z2 = false;
            } else if (i13 == 2) {
                z3 = false;
            } else if (i13 == 3) {
                z2 = false;
                z3 = false;
            }
        }
        if (this.u0 == 8 && !this.v0 && !f0()) {
            boolean[] zArr = this.a0;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z11 = this.p;
        if (z11 || this.q) {
            if (z11) {
                dVar3.f(solverVariableQ, this.h0);
                dVar3.f(solverVariableQ2, this.h0 + this.d0);
                if (z3 && (constraintWidget2 = this.c0) != null) {
                    if (this.k) {
                        d dVar4 = (d) constraintWidget2;
                        dVar4.H1(this.Q);
                        dVar4.G1(this.S);
                    } else {
                        dVar3.h(dVar3.q(constraintWidget2.S), solverVariableQ2, 0, 5);
                    }
                }
            }
            if (this.q) {
                dVar3.f(solverVariableQ3, this.i0);
                dVar3.f(solverVariableQ4, this.i0 + this.e0);
                if (this.U.m()) {
                    dVar3.f(solverVariableQ5, this.i0 + this.n0);
                }
                if (z2 && (constraintWidget = this.c0) != null) {
                    if (this.k) {
                        d dVar5 = (d) constraintWidget;
                        dVar5.M1(this.R);
                        dVar5.L1(this.T);
                    } else {
                        dVar3.h(dVar3.q(constraintWidget.T), solverVariableQ4, 0, 5);
                    }
                }
            }
            if (this.p && this.q) {
                this.p = false;
                this.q = false;
                return;
            }
        }
        boolean z12 = androidx.constraintlayout.core.d.s;
        if (z && (jVar2 = this.e) != null && (lVar2 = this.f) != null) {
            DependencyNode dependencyNode = jVar2.h;
            if (dependencyNode.j && jVar2.i.j && lVar2.h.j && lVar2.i.j) {
                dVar3.f(solverVariableQ, dependencyNode.g);
                dVar3.f(solverVariableQ2, this.e.i.g);
                dVar3.f(solverVariableQ3, this.f.h.g);
                dVar3.f(solverVariableQ4, this.f.i.g);
                dVar3.f(solverVariableQ5, this.f.k.g);
                if (this.c0 != null) {
                    if (z3 && this.g[0] && !m0()) {
                        dVar3.h(dVar3.q(this.c0.S), solverVariableQ2, 0, 8);
                    }
                    if (z2 && this.g[1] && !o0()) {
                        dVar3.h(dVar3.q(this.c0.T), solverVariableQ4, 0, 8);
                    }
                }
                this.p = false;
                this.q = false;
                return;
            }
        }
        if (this.c0 != null) {
            if (j0(0)) {
                ((d) this.c0).D1(this, 0);
                zM0 = true;
            } else {
                zM0 = m0();
            }
            if (j0(1)) {
                ((d) this.c0).D1(this, 1);
                zO0 = true;
            } else {
                zO0 = o0();
            }
            if (!zM0 && z3 && this.u0 != 8 && this.Q.f == null && this.S.f == null) {
                dVar3.h(dVar3.q(this.c0.S), solverVariableQ2, 0, 1);
            }
            if (!zO0 && z2 && this.u0 != 8 && this.R.f == null && this.T.f == null && this.U == null) {
                dVar3.h(dVar3.q(this.c0.T), solverVariableQ4, 0, 1);
            }
            z4 = zM0;
            z5 = zO0;
        } else {
            z4 = false;
            z5 = false;
        }
        int i14 = this.d0;
        int i15 = this.o0;
        if (i14 >= i15) {
            i15 = i14;
        }
        int i16 = this.e0;
        int i17 = this.p0;
        if (i16 >= i17) {
            i17 = i16;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour4 = DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z13 = dimensionBehaviour3 != dimensionBehaviour4;
        DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
        boolean z14 = dimensionBehaviour5 != dimensionBehaviour4;
        int i18 = this.g0;
        this.H = i18;
        int i19 = i15;
        float f = this.f0;
        this.I = f;
        int i20 = this.w;
        int i21 = this.x;
        if (f > 0.0f) {
            i = i17;
            if (this.u0 != 8) {
                i2 = (dimensionBehaviour3 == dimensionBehaviour4 && i20 == 0) ? 3 : i20;
                int i22 = (dimensionBehaviour5 == dimensionBehaviour4 && i21 == 0) ? 3 : i21;
                if (dimensionBehaviour3 == dimensionBehaviour4 && dimensionBehaviour5 == dimensionBehaviour4) {
                    solverVariable = solverVariableQ2;
                    i12 = 3;
                    if (i2 == 3 && i22 == 3) {
                        v1(z3, z2, z13, z14);
                    }
                    i3 = i22;
                    z6 = true;
                    int[] iArr = this.y;
                    iArr[0] = i2;
                    iArr[1] = i3;
                    this.h = z6;
                    if (z6) {
                        int i23 = this.H;
                        i4 = -1;
                        boolean z15 = i23 != 0 || i23 == -1;
                        if (z6 || !((i11 = this.H) == 1 || i11 == i4)) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        dimensionBehaviour = this.b0[0];
                        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour == dimensionBehaviour2 || !(this instanceof d)) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z8) {
                            i5 = 0;
                        } else {
                            i5 = i19;
                        }
                        boolean z16 = !this.X.o();
                        boolean[] zArr2 = this.a0;
                        boolean z17 = zArr2[0];
                        boolean z18 = zArr2[1];
                        if (this.t != 2 || this.p) {
                            i6 = i2;
                            z9 = z3;
                        } else {
                            if (z && (jVar = this.e) != null) {
                                DependencyNode dependencyNode2 = jVar.h;
                                if (dependencyNode2.j && jVar.i.j) {
                                    if (z) {
                                        dVar3.f(solverVariableQ, dependencyNode2.g);
                                        SolverVariable solverVariable5 = solverVariable;
                                        dVar3.f(solverVariable5, this.e.i.g);
                                        if (this.c0 != null && z3 && this.g[0] && !m0()) {
                                            dVar3.h(dVar3.q(this.c0.S), solverVariable5, 0, 8);
                                        }
                                        solverVariable = solverVariable5;
                                    }
                                    i6 = i2;
                                    z9 = z3;
                                }
                            }
                            SolverVariable solverVariable6 = solverVariable;
                            ConstraintWidget constraintWidget4 = this.c0;
                            SolverVariable solverVariableQ6 = constraintWidget4 != null ? dVar3.q(constraintWidget4.S) : null;
                            ConstraintWidget constraintWidget5 = this.c0;
                            SolverVariable solverVariableQ7 = constraintWidget5 != null ? dVar3.q(constraintWidget5.Q) : null;
                            boolean z19 = this.g[0];
                            DimensionBehaviour[] dimensionBehaviourArr2 = this.b0;
                            solverVariable = solverVariable6;
                            DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[0];
                            ConstraintAnchor constraintAnchor = this.Q;
                            SolverVariable solverVariable7 = solverVariableQ7;
                            ConstraintAnchor constraintAnchor2 = this.S;
                            z6 = z6;
                            z9 = z3;
                            int i24 = this.h0;
                            int i25 = this.o0;
                            int i26 = this.J[0];
                            float f2 = this.q0;
                            boolean z20 = dimensionBehaviourArr2[1] == dimensionBehaviour4;
                            solverVariableQ = solverVariableQ;
                            boolean z21 = z2;
                            SolverVariable solverVariable8 = solverVariableQ6;
                            z2 = z21;
                            i6 = i2;
                            dimensionBehaviour2 = dimensionBehaviour2;
                            dVar3 = dVar;
                            i(dVar3, true, z9, z2, z19, solverVariable7, solverVariable8, dimensionBehaviour6, z8, constraintAnchor, constraintAnchor2, i24, i5, i25, i26, f2, z15, z20, z4, z5, z17, i6, i3, this.z, this.A, this.B, z16);
                        }
                        if (z || (lVar = this.f) == null) {
                            solverVariable2 = r24;
                            solverVariable3 = r25;
                            solverVariable4 = r26;
                            i7 = 0;
                            i8 = 8;
                            c = 1;
                            i9 = 1;
                        } else {
                            DependencyNode dependencyNode3 = lVar.h;
                            if (dependencyNode3.j && lVar.i.j) {
                                int i27 = dependencyNode3.g;
                                solverVariable2 = solverVariableQ3;
                                dVar3.f(solverVariable2, i27);
                                solverVariable3 = solverVariableQ4;
                                dVar3.f(solverVariable3, this.f.i.g);
                                solverVariable4 = solverVariableQ5;
                                dVar3.f(solverVariable4, this.f.k.g);
                                ConstraintWidget constraintWidget6 = this.c0;
                                if (constraintWidget6 == null || z5 || !z2) {
                                    i7 = 0;
                                    i8 = 8;
                                    c = 1;
                                } else {
                                    c = 1;
                                    if (this.g[1]) {
                                        i7 = 0;
                                        i8 = 8;
                                        dVar3.h(dVar3.q(constraintWidget6.T), solverVariable3, 0, 8);
                                    } else {
                                        i7 = 0;
                                        i8 = 8;
                                    }
                                }
                                i9 = i7;
                            } else {
                                solverVariable2 = r24;
                                solverVariable3 = r25;
                                solverVariable4 = r26;
                                i7 = 0;
                                i8 = 8;
                                c = 1;
                                i9 = 1;
                            }
                        }
                        if (this.u == 2) {
                            i10 = i7;
                        } else {
                            i10 = i9;
                        }
                        if (i10 == 0 && !this.q) {
                            boolean z22 = (this.b0[c] == dimensionBehaviour2 && (this instanceof d)) ? c : i7;
                            int i28 = z22 != 0 ? i7 : i;
                            ConstraintWidget constraintWidget7 = this.c0;
                            SolverVariable solverVariableQ8 = constraintWidget7 != null ? dVar3.q(constraintWidget7.T) : null;
                            ConstraintWidget constraintWidget8 = this.c0;
                            SolverVariable solverVariableQ9 = constraintWidget8 != null ? dVar3.q(constraintWidget8.R) : null;
                            if (this.n0 > 0 || this.u0 == i8) {
                                z10 = z16;
                                ConstraintAnchor constraintAnchor3 = this.U;
                                if (constraintAnchor3.f != null) {
                                    dVar3.e(solverVariable4, solverVariable2, r(), i8);
                                    dVar3.e(solverVariable4, dVar3.q(this.U.f), this.U.f(), i8);
                                    if (z2) {
                                        dVar3.h(solverVariableQ8, dVar3.q(this.T), i7, 5);
                                    }
                                    z10 = i7;
                                } else if (this.u0 == i8) {
                                    dVar3.e(solverVariable4, solverVariable2, constraintAnchor3.f(), i8);
                                    z10 = z16;
                                } else {
                                    dVar3.e(solverVariable4, solverVariable2, r(), i8);
                                    z10 = z16;
                                }
                            }
                            z10 = z16;
                            boolean z23 = this.g[c];
                            DimensionBehaviour[] dimensionBehaviourArr3 = this.b0;
                            int i29 = i7;
                            i(dVar, false, z2, z9, z23, solverVariableQ9, solverVariableQ8, dimensionBehaviourArr3[c], z22, this.R, this.T, this.i0, i28, this.p0, this.J[c], this.r0, z7, dimensionBehaviourArr3[i29] == dimensionBehaviour4 ? c : i29, z5, z4, z18, i3, i6, this.C, this.D, this.E, z10);
                        }
                        if (!z6) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.p = false;
                        this.q = false;
                    }
                    i4 = -1;
                    if (z6) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    dimensionBehaviour = this.b0[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        i5 = 0;
                    } else {
                        i5 = i19;
                    }
                    boolean z110 = !this.X.o();
                    boolean[] zArr3 = this.a0;
                    boolean z111 = zArr3[0];
                    boolean z112 = zArr3[1];
                    if (this.t != 2) {
                        i6 = i2;
                        z9 = z3;
                    } else {
                        i6 = i2;
                        z9 = z3;
                    }
                    if (z) {
                        solverVariable2 = r24;
                        solverVariable3 = r25;
                        solverVariable4 = r26;
                        i7 = 0;
                        i8 = 8;
                        c = 1;
                        i9 = 1;
                    } else {
                        solverVariable2 = r24;
                        solverVariable3 = r25;
                        solverVariable4 = r26;
                        i7 = 0;
                        i8 = 8;
                        c = 1;
                        i9 = 1;
                    }
                    if (this.u == 2) {
                        i10 = i7;
                    } else {
                        i10 = i9;
                    }
                    if (i10 == 0) {
                    }
                    if (!z6) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.p = false;
                    this.q = false;
                }
                solverVariable = solverVariableQ2;
                i12 = 3;
                if (dimensionBehaviour3 == dimensionBehaviour4 && i2 == i12) {
                    this.H = 0;
                    i19 = (int) (i16 * f);
                    if (dimensionBehaviour5 != dimensionBehaviour4) {
                        i2 = 4;
                        i3 = i22;
                    } else {
                        i3 = i22;
                        z6 = true;
                    }
                    int[] iArr2 = this.y;
                    iArr2[0] = i2;
                    iArr2[1] = i3;
                    this.h = z6;
                    if (z6) {
                        int i210 = this.H;
                        i4 = -1;
                        if (i210 != 0) {
                        }
                        if (z6) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        dimensionBehaviour = this.b0[0];
                        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour == dimensionBehaviour2) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            i5 = 0;
                        } else {
                            i5 = i19;
                        }
                        boolean z113 = !this.X.o();
                        boolean[] zArr4 = this.a0;
                        boolean z114 = zArr4[0];
                        boolean z115 = zArr4[1];
                        if (this.t != 2) {
                            i6 = i2;
                            z9 = z3;
                        } else {
                            i6 = i2;
                            z9 = z3;
                        }
                        if (z) {
                            solverVariable2 = r24;
                            solverVariable3 = r25;
                            solverVariable4 = r26;
                            i7 = 0;
                            i8 = 8;
                            c = 1;
                            i9 = 1;
                        } else {
                            solverVariable2 = r24;
                            solverVariable3 = r25;
                            solverVariable4 = r26;
                            i7 = 0;
                            i8 = 8;
                            c = 1;
                            i9 = 1;
                        }
                        if (this.u == 2) {
                            i10 = i7;
                        } else {
                            i10 = i9;
                        }
                        if (i10 == 0) {
                        }
                        if (!z6) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.p = false;
                        this.q = false;
                    }
                    i4 = -1;
                    if (z6) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    dimensionBehaviour = this.b0[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        i5 = 0;
                    } else {
                        i5 = i19;
                    }
                    boolean z116 = !this.X.o();
                    boolean[] zArr5 = this.a0;
                    boolean z117 = zArr5[0];
                    boolean z118 = zArr5[1];
                    if (this.t != 2) {
                        i6 = i2;
                        z9 = z3;
                    } else {
                        i6 = i2;
                        z9 = z3;
                    }
                    if (z) {
                        solverVariable2 = r24;
                        solverVariable3 = r25;
                        solverVariable4 = r26;
                        i7 = 0;
                        i8 = 8;
                        c = 1;
                        i9 = 1;
                    } else {
                        solverVariable2 = r24;
                        solverVariable3 = r25;
                        solverVariable4 = r26;
                        i7 = 0;
                        i8 = 8;
                        c = 1;
                        i9 = 1;
                    }
                    if (this.u == 2) {
                        i10 = i7;
                    } else {
                        i10 = i9;
                    }
                    if (i10 == 0) {
                    }
                    if (!z6) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.p = false;
                    this.q = false;
                }
                if (dimensionBehaviour5 == dimensionBehaviour4 && i22 == i12) {
                    this.H = 1;
                    if (i18 == -1) {
                        this.I = 1.0f / f;
                    }
                    i = (int) (this.I * i14);
                    if (dimensionBehaviour3 != dimensionBehaviour4) {
                        i3 = 4;
                    }
                    int[] iArr3 = this.y;
                    iArr3[0] = i2;
                    iArr3[1] = i3;
                    this.h = z6;
                    if (z6) {
                        int i211 = this.H;
                        i4 = -1;
                        if (i211 != 0) {
                        }
                        if (z6) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        dimensionBehaviour = this.b0[0];
                        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour == dimensionBehaviour2) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z8) {
                            i5 = 0;
                        } else {
                            i5 = i19;
                        }
                        boolean z119 = !this.X.o();
                        boolean[] zArr6 = this.a0;
                        boolean z1110 = zArr6[0];
                        boolean z1111 = zArr6[1];
                        if (this.t != 2) {
                            i6 = i2;
                            z9 = z3;
                        } else {
                            i6 = i2;
                            z9 = z3;
                        }
                        if (z) {
                            solverVariable2 = r24;
                            solverVariable3 = r25;
                            solverVariable4 = r26;
                            i7 = 0;
                            i8 = 8;
                            c = 1;
                            i9 = 1;
                        } else {
                            solverVariable2 = r24;
                            solverVariable3 = r25;
                            solverVariable4 = r26;
                            i7 = 0;
                            i8 = 8;
                            c = 1;
                            i9 = 1;
                        }
                        if (this.u == 2) {
                            i10 = i7;
                        } else {
                            i10 = i9;
                        }
                        if (i10 == 0) {
                        }
                        if (!z6) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.p = false;
                        this.q = false;
                    }
                    i4 = -1;
                    if (z6) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    dimensionBehaviour = this.b0[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        i5 = 0;
                    } else {
                        i5 = i19;
                    }
                    boolean z1112 = !this.X.o();
                    boolean[] zArr7 = this.a0;
                    boolean z1113 = zArr7[0];
                    boolean z1114 = zArr7[1];
                    if (this.t != 2) {
                        i6 = i2;
                        z9 = z3;
                    } else {
                        i6 = i2;
                        z9 = z3;
                    }
                    if (z) {
                        solverVariable2 = r24;
                        solverVariable3 = r25;
                        solverVariable4 = r26;
                        i7 = 0;
                        i8 = 8;
                        c = 1;
                        i9 = 1;
                    } else {
                        solverVariable2 = r24;
                        solverVariable3 = r25;
                        solverVariable4 = r26;
                        i7 = 0;
                        i8 = 8;
                        c = 1;
                        i9 = 1;
                    }
                    if (this.u == 2) {
                        i10 = i7;
                    } else {
                        i10 = i9;
                    }
                    if (i10 == 0) {
                    }
                    if (!z6) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.p = false;
                    this.q = false;
                }
                i3 = i22;
                z6 = true;
                int[] iArr4 = this.y;
                iArr4[0] = i2;
                iArr4[1] = i3;
                this.h = z6;
                if (z6) {
                    int i212 = this.H;
                    i4 = -1;
                    if (i212 != 0) {
                    }
                    if (z6) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    dimensionBehaviour = this.b0[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        i5 = 0;
                    } else {
                        i5 = i19;
                    }
                    boolean z1115 = !this.X.o();
                    boolean[] zArr8 = this.a0;
                    boolean z1116 = zArr8[0];
                    boolean z1117 = zArr8[1];
                    if (this.t != 2) {
                        i6 = i2;
                        z9 = z3;
                    } else {
                        i6 = i2;
                        z9 = z3;
                    }
                    if (z) {
                        solverVariable2 = r24;
                        solverVariable3 = r25;
                        solverVariable4 = r26;
                        i7 = 0;
                        i8 = 8;
                        c = 1;
                        i9 = 1;
                    } else {
                        solverVariable2 = r24;
                        solverVariable3 = r25;
                        solverVariable4 = r26;
                        i7 = 0;
                        i8 = 8;
                        c = 1;
                        i9 = 1;
                    }
                    if (this.u == 2) {
                        i10 = i7;
                    } else {
                        i10 = i9;
                    }
                    if (i10 == 0) {
                    }
                    if (!z6) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.p = false;
                    this.q = false;
                }
                i4 = -1;
                if (z6) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                dimensionBehaviour = this.b0[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i5 = 0;
                } else {
                    i5 = i19;
                }
                boolean z1118 = !this.X.o();
                boolean[] zArr9 = this.a0;
                boolean z1119 = zArr9[0];
                boolean z11110 = zArr9[1];
                if (this.t != 2) {
                    i6 = i2;
                    z9 = z3;
                } else {
                    i6 = i2;
                    z9 = z3;
                }
                if (z) {
                    solverVariable2 = r24;
                    solverVariable3 = r25;
                    solverVariable4 = r26;
                    i7 = 0;
                    i8 = 8;
                    c = 1;
                    i9 = 1;
                } else {
                    solverVariable2 = r24;
                    solverVariable3 = r25;
                    solverVariable4 = r26;
                    i7 = 0;
                    i8 = 8;
                    c = 1;
                    i9 = 1;
                }
                if (this.u == 2) {
                    i10 = i7;
                } else {
                    i10 = i9;
                }
                if (i10 == 0) {
                }
                if (!z6) {
                    dVar2 = dVar;
                } else if (this.H == 1) {
                    dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                    dVar2 = dVar;
                }
                if (this.X.o()) {
                    dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                }
                this.p = false;
                this.q = false;
            }
            z6 = false;
            int[] iArr5 = this.y;
            iArr5[0] = i2;
            iArr5[1] = i3;
            this.h = z6;
            if (z6) {
                int i213 = this.H;
                i4 = -1;
                if (i213 != 0) {
                }
                if (z6) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                dimensionBehaviour = this.b0[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i5 = 0;
                } else {
                    i5 = i19;
                }
                boolean z11111 = !this.X.o();
                boolean[] zArr10 = this.a0;
                boolean z11112 = zArr10[0];
                boolean z11113 = zArr10[1];
                if (this.t != 2) {
                    i6 = i2;
                    z9 = z3;
                } else {
                    i6 = i2;
                    z9 = z3;
                }
                if (z) {
                    solverVariable2 = r24;
                    solverVariable3 = r25;
                    solverVariable4 = r26;
                    i7 = 0;
                    i8 = 8;
                    c = 1;
                    i9 = 1;
                } else {
                    solverVariable2 = r24;
                    solverVariable3 = r25;
                    solverVariable4 = r26;
                    i7 = 0;
                    i8 = 8;
                    c = 1;
                    i9 = 1;
                }
                if (this.u == 2) {
                    i10 = i7;
                } else {
                    i10 = i9;
                }
                if (i10 == 0) {
                }
                if (!z6) {
                    dVar2 = dVar;
                } else if (this.H == 1) {
                    dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                    dVar2 = dVar;
                }
                if (this.X.o()) {
                    dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                }
                this.p = false;
                this.q = false;
            }
            i4 = -1;
            if (z6) {
                z7 = false;
            } else {
                z7 = false;
            }
            dimensionBehaviour = this.b0[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z8) {
                i5 = 0;
            } else {
                i5 = i19;
            }
            boolean z11114 = !this.X.o();
            boolean[] zArr11 = this.a0;
            boolean z11115 = zArr11[0];
            boolean z11116 = zArr11[1];
            if (this.t != 2) {
                i6 = i2;
                z9 = z3;
            } else {
                i6 = i2;
                z9 = z3;
            }
            if (z) {
                solverVariable2 = r24;
                solverVariable3 = r25;
                solverVariable4 = r26;
                i7 = 0;
                i8 = 8;
                c = 1;
                i9 = 1;
            } else {
                solverVariable2 = r24;
                solverVariable3 = r25;
                solverVariable4 = r26;
                i7 = 0;
                i8 = 8;
                c = 1;
                i9 = 1;
            }
            if (this.u == 2) {
                i10 = i7;
            } else {
                i10 = i9;
            }
            if (i10 == 0) {
            }
            if (!z6) {
                dVar2 = dVar;
            } else if (this.H == 1) {
                dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                dVar2 = dVar;
            } else {
                dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                dVar2 = dVar;
            }
            if (this.X.o()) {
                dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
            }
            this.p = false;
            this.q = false;
        }
        i = i17;
        solverVariable = solverVariableQ2;
        i2 = i20;
        i3 = i21;
        z6 = false;
        int[] iArr6 = this.y;
        iArr6[0] = i2;
        iArr6[1] = i3;
        this.h = z6;
        if (z6) {
            int i214 = this.H;
            i4 = -1;
            if (i214 != 0) {
            }
            if (z6) {
                z7 = false;
            } else {
                z7 = false;
            }
            dimensionBehaviour = this.b0[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z8) {
                i5 = 0;
            } else {
                i5 = i19;
            }
            boolean z11117 = !this.X.o();
            boolean[] zArr12 = this.a0;
            boolean z11118 = zArr12[0];
            boolean z11119 = zArr12[1];
            if (this.t != 2) {
                i6 = i2;
                z9 = z3;
            } else {
                i6 = i2;
                z9 = z3;
            }
            if (z) {
                solverVariable2 = r24;
                solverVariable3 = r25;
                solverVariable4 = r26;
                i7 = 0;
                i8 = 8;
                c = 1;
                i9 = 1;
            } else {
                solverVariable2 = r24;
                solverVariable3 = r25;
                solverVariable4 = r26;
                i7 = 0;
                i8 = 8;
                c = 1;
                i9 = 1;
            }
            if (this.u == 2) {
                i10 = i7;
            } else {
                i10 = i9;
            }
            if (i10 == 0) {
            }
            if (!z6) {
                dVar2 = dVar;
            } else if (this.H == 1) {
                dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
                dVar2 = dVar;
            } else {
                dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
                dVar2 = dVar;
            }
            if (this.X.o()) {
                dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
            }
            this.p = false;
            this.q = false;
        }
        i4 = -1;
        if (z6) {
            z7 = false;
        } else {
            z7 = false;
        }
        dimensionBehaviour = this.b0[0];
        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour2) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z8) {
            i5 = 0;
        } else {
            i5 = i19;
        }
        boolean z111110 = !this.X.o();
        boolean[] zArr13 = this.a0;
        boolean z111111 = zArr13[0];
        boolean z111112 = zArr13[1];
        if (this.t != 2) {
            i6 = i2;
            z9 = z3;
        } else {
            i6 = i2;
            z9 = z3;
        }
        if (z) {
            solverVariable2 = r24;
            solverVariable3 = r25;
            solverVariable4 = r26;
            i7 = 0;
            i8 = 8;
            c = 1;
            i9 = 1;
        } else {
            solverVariable2 = r24;
            solverVariable3 = r25;
            solverVariable4 = r26;
            i7 = 0;
            i8 = 8;
            c = 1;
            i9 = 1;
        }
        if (this.u == 2) {
            i10 = i7;
        } else {
            i10 = i9;
        }
        if (i10 == 0) {
        }
        if (!z6) {
            dVar2 = dVar;
        } else if (this.H == 1) {
            dVar.k(solverVariable3, solverVariable2, solverVariable, solverVariableQ, this.I, 8);
            dVar2 = dVar;
        } else {
            dVar.k(solverVariable, solverVariableQ, solverVariable3, solverVariable2, this.I, 8);
            dVar2 = dVar;
        }
        if (this.X.o()) {
            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
        }
        this.p = false;
        this.q = false;
    }

    public boolean g0() {
        return (this.l == -1 && this.m == -1) ? false : true;
    }

    public void g1(int i) {
        if (i < 0) {
            this.p0 = 0;
        } else {
            this.p0 = i;
        }
    }

    public boolean h() {
        return this.u0 != 8;
    }

    public boolean h0(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.Q.f;
            return constraintAnchor3 != null && constraintAnchor3.n() && (constraintAnchor2 = this.S.f) != null && constraintAnchor2.n() && (this.S.f.e() - this.S.f()) - (this.Q.f.e() + this.Q.f()) >= i2;
        }
        ConstraintAnchor constraintAnchor4 = this.R.f;
        if (constraintAnchor4 != null && constraintAnchor4.n() && (constraintAnchor = this.T.f) != null && constraintAnchor.n() && (this.T.f.e() - this.T.f()) - (this.R.f.e() + this.R.f()) >= i2) {
            return true;
        }
        return false;
    }

    public void h1(int i) {
        if (i < 0) {
            this.o0 = 0;
        } else {
            this.o0 = i;
        }
    }

    public void i0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        q(type).b(constraintWidget.q(type2), i, i2, true);
    }

    public void i1(int i, int i2) {
        this.h0 = i;
        this.i0 = i2;
    }

    public void j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        k(type, constraintWidget, type2, 0);
    }

    public void j1(ConstraintWidget constraintWidget) {
        this.c0 = constraintWidget;
    }

    public void k(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    k(type6, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    q(type5).a(constraintWidget.q(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    k(type7, constraintWidget, type2, 0);
                    k(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    q(type5).a(constraintWidget.q(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorQ = q(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorQ2 = q(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorQ3 = q(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorQ4 = q(type11);
            boolean z2 = true;
            if ((constraintAnchorQ == null || !constraintAnchorQ.o()) && (constraintAnchorQ2 == null || !constraintAnchorQ2.o())) {
                k(type8, constraintWidget, type8, 0);
                k(type9, constraintWidget, type9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((constraintAnchorQ3 == null || !constraintAnchorQ3.o()) && (constraintAnchorQ4 == null || !constraintAnchorQ4.o())) {
                k(type10, constraintWidget, type10, 0);
                k(type11, constraintWidget, type11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                q(type5).a(constraintWidget.q(type5), 0);
                return;
            }
            if (z) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                q(type12).a(constraintWidget.q(type12), 0);
                return;
            } else {
                if (z2) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    q(type13).a(constraintWidget.q(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorQ5 = q(type4);
            ConstraintAnchor constraintAnchorQ6 = constraintWidget.q(type2);
            ConstraintAnchor constraintAnchorQ7 = q(ConstraintAnchor.Type.RIGHT);
            constraintAnchorQ5.a(constraintAnchorQ6, 0);
            constraintAnchorQ7.a(constraintAnchorQ6, 0);
            q(type14).a(constraintAnchorQ6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor constraintAnchorQ8 = constraintWidget.q(type2);
            q(type3).a(constraintAnchorQ8, 0);
            q(ConstraintAnchor.Type.BOTTOM).a(constraintAnchorQ8, 0);
            q(type15).a(constraintAnchorQ8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            q(type16).a(constraintWidget.q(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            q(type17).a(constraintWidget.q(type17), 0);
            q(type14).a(constraintWidget.q(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            q(type18).a(constraintWidget.q(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            q(type19).a(constraintWidget.q(type19), 0);
            q(type15).a(constraintWidget.q(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorQ9 = q(type);
        ConstraintAnchor constraintAnchorQ10 = constraintWidget.q(type2);
        if (constraintAnchorQ9.p(constraintAnchorQ10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor constraintAnchorQ11 = q(ConstraintAnchor.Type.TOP);
                ConstraintAnchor constraintAnchorQ12 = q(ConstraintAnchor.Type.BOTTOM);
                if (constraintAnchorQ11 != null) {
                    constraintAnchorQ11.q();
                }
                if (constraintAnchorQ12 != null) {
                    constraintAnchorQ12.q();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor constraintAnchorQ13 = q(type20);
                if (constraintAnchorQ13 != null) {
                    constraintAnchorQ13.q();
                }
                ConstraintAnchor constraintAnchorQ14 = q(type5);
                if (constraintAnchorQ14.j() != constraintAnchorQ10) {
                    constraintAnchorQ14.q();
                }
                ConstraintAnchor constraintAnchorG = q(type).g();
                ConstraintAnchor constraintAnchorQ15 = q(type15);
                if (constraintAnchorQ15.o()) {
                    constraintAnchorG.q();
                    constraintAnchorQ15.q();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor constraintAnchorQ16 = q(type5);
                if (constraintAnchorQ16.j() != constraintAnchorQ10) {
                    constraintAnchorQ16.q();
                }
                ConstraintAnchor constraintAnchorG2 = q(type).g();
                ConstraintAnchor constraintAnchorQ17 = q(type14);
                if (constraintAnchorQ17.o()) {
                    constraintAnchorG2.q();
                    constraintAnchorQ17.q();
                }
            }
            constraintAnchorQ9.a(constraintAnchorQ10, i);
        }
    }

    public boolean k0() {
        return this.r;
    }

    public void k1(float f) {
        this.r0 = f;
    }

    public void l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.h() == this) {
            k(constraintAnchor.k(), constraintAnchor2.h(), constraintAnchor2.k(), i);
        }
    }

    public boolean l0(int i) {
        return this.a0[i];
    }

    public void l1(int i) {
        this.K0 = i;
    }

    public void m(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        i0(type, constraintWidget, type, i, 0);
        this.K = f;
    }

    public boolean m0() {
        ConstraintAnchor constraintAnchor = this.Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public void m1(int i, int i2) {
        this.i0 = i;
        int i3 = i2 - i;
        this.e0 = i3;
        int i4 = this.p0;
        if (i3 < i4) {
            this.e0 = i4;
        }
    }

    public void n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.t = constraintWidget.t;
        this.u = constraintWidget.u;
        this.w = constraintWidget.w;
        this.x = constraintWidget.x;
        int[] iArr = this.y;
        int[] iArr2 = constraintWidget.y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.z = constraintWidget.z;
        this.A = constraintWidget.A;
        this.C = constraintWidget.C;
        this.D = constraintWidget.D;
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.H = constraintWidget.H;
        this.I = constraintWidget.I;
        int[] iArr3 = constraintWidget.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = constraintWidget.K;
        this.L = constraintWidget.L;
        this.M = constraintWidget.M;
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.b0 = (DimensionBehaviour[]) Arrays.copyOf(this.b0, 2);
        this.c0 = this.c0 == null ? null : map.get(constraintWidget.c0);
        this.d0 = constraintWidget.d0;
        this.e0 = constraintWidget.e0;
        this.f0 = constraintWidget.f0;
        this.g0 = constraintWidget.g0;
        this.h0 = constraintWidget.h0;
        this.i0 = constraintWidget.i0;
        this.j0 = constraintWidget.j0;
        this.k0 = constraintWidget.k0;
        this.l0 = constraintWidget.l0;
        this.m0 = constraintWidget.m0;
        this.n0 = constraintWidget.n0;
        this.o0 = constraintWidget.o0;
        this.p0 = constraintWidget.p0;
        this.q0 = constraintWidget.q0;
        this.r0 = constraintWidget.r0;
        this.s0 = constraintWidget.s0;
        this.t0 = constraintWidget.t0;
        this.u0 = constraintWidget.u0;
        this.v0 = constraintWidget.v0;
        this.w0 = constraintWidget.w0;
        this.x0 = constraintWidget.x0;
        this.y0 = constraintWidget.y0;
        this.z0 = constraintWidget.z0;
        this.A0 = constraintWidget.A0;
        this.B0 = constraintWidget.B0;
        this.C0 = constraintWidget.C0;
        this.D0 = constraintWidget.D0;
        this.E0 = constraintWidget.E0;
        this.F0 = constraintWidget.F0;
        this.G0 = constraintWidget.G0;
        this.H0 = constraintWidget.H0;
        this.J0 = constraintWidget.J0;
        this.K0 = constraintWidget.K0;
        this.L0 = constraintWidget.L0;
        this.M0 = constraintWidget.M0;
        float[] fArr = this.N0;
        float[] fArr2 = constraintWidget.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.O0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.O0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.P0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.P0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.Q0;
        this.Q0 = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.R0;
        this.R0 = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public boolean n0() {
        return this.M;
    }

    public void n1(DimensionBehaviour dimensionBehaviour) {
        this.b0[1] = dimensionBehaviour;
    }

    public void o(androidx.constraintlayout.core.d dVar) {
        dVar.q(this.Q);
        dVar.q(this.R);
        dVar.q(this.S);
        dVar.q(this.T);
        if (this.n0 > 0) {
            dVar.q(this.U);
        }
    }

    public boolean o0() {
        ConstraintAnchor constraintAnchor = this.R;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.T;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public void o1(int i, int i2, int i3, float f) {
        this.x = i;
        this.C = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.D = i3;
        this.E = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.x = 2;
    }

    public void p() {
        if (this.e == null) {
            this.e = new j(this);
        }
        if (this.f == null) {
            this.f = new l(this);
        }
    }

    public boolean p0() {
        return this.N;
    }

    public void p1(float f) {
        this.N0[1] = f;
    }

    public ConstraintAnchor q(ConstraintAnchor.Type type) {
        switch (a.a[type.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public boolean q0() {
        return this.i && this.u0 != 8;
    }

    public void q1(int i) {
        this.u0 = i;
    }

    public int r() {
        return this.n0;
    }

    public boolean r0() {
        if (this.p) {
            return true;
        }
        return this.Q.n() && this.S.n();
    }

    public void r1(int i) {
        this.d0 = i;
        int i2 = this.o0;
        if (i < i2) {
            this.d0 = i2;
        }
    }

    public float s(int i) {
        if (i == 0) {
            return this.q0;
        }
        if (i == 1) {
            return this.r0;
        }
        return -1.0f;
    }

    public boolean s0() {
        if (this.q) {
            return true;
        }
        return this.R.n() && this.T.n();
    }

    public void s1(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.v = i;
    }

    public int t() {
        return c0() + this.e0;
    }

    public boolean t0() {
        return this.s;
    }

    public void t1(int i) {
        this.h0 = i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.x0 != null) {
            str = "type: " + this.x0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.w0 != null) {
            str2 = "id: " + this.w0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.h0);
        sb.append(", ");
        sb.append(this.i0);
        sb.append(") - (");
        sb.append(this.d0);
        sb.append(" x ");
        sb.append(this.e0);
        sb.append(")");
        return sb.toString();
    }

    public Object u() {
        return this.s0;
    }

    public void u0() {
        this.r = true;
    }

    public void u1(int i) {
        this.i0 = i;
    }

    public String v() {
        return this.w0;
    }

    public void v0() {
        this.s = true;
    }

    public void v1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.H == -1) {
            if (z3 && !z4) {
                this.H = 0;
            } else if (!z3 && z4) {
                this.H = 1;
                if (this.g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.o() || !this.T.o())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.o() || !this.S.o())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.o() || !this.T.o() || !this.Q.o() || !this.S.o())) {
            if (this.R.o() && this.T.o()) {
                this.H = 0;
            } else if (this.Q.o() && this.S.o()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i = this.z;
            if (i > 0 && this.C == 0) {
                this.H = 0;
            } else {
                if (i != 0 || this.C <= 0) {
                    return;
                }
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public DimensionBehaviour w(int i) {
        if (i == 0) {
            return C();
        }
        if (i == 1) {
            return X();
        }
        return null;
    }

    public boolean w0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void w1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zK = z & this.e.k();
        boolean zK2 = z2 & this.f.k();
        j jVar = this.e;
        int i3 = jVar.h.g;
        l lVar = this.f;
        int i4 = lVar.h.g;
        int i5 = jVar.i.g;
        int i6 = lVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zK) {
            this.h0 = i3;
        }
        if (zK2) {
            this.i0 = i4;
        }
        if (this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        if (zK) {
            if (this.b0[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.d0)) {
                i8 = i2;
            }
            this.d0 = i8;
            int i10 = this.o0;
            if (i8 < i10) {
                this.d0 = i10;
            }
        }
        if (zK2) {
            if (this.b0[1] == DimensionBehaviour.FIXED && i9 < (i = this.e0)) {
                i9 = i;
            }
            this.e0 = i9;
            int i11 = this.p0;
            if (i9 < i11) {
                this.e0 = i11;
            }
        }
    }

    public float x() {
        return this.f0;
    }

    public void x0() {
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.c0 = null;
        this.K = Float.NaN;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = 0;
        float f = U0;
        this.q0 = f;
        this.r0 = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.b0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.s0 = null;
        this.t0 = 0;
        this.u0 = 0;
        this.x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.t = -1;
        this.u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.w = 0;
        this.x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.z = 0;
        this.C = 0;
        this.h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.i = true;
        int[] iArr2 = this.y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public void x1(androidx.constraintlayout.core.d dVar, boolean z) {
        l lVar;
        j jVar;
        int iY = dVar.y(this.Q);
        int iY2 = dVar.y(this.R);
        int iY3 = dVar.y(this.S);
        int iY4 = dVar.y(this.T);
        if (z && (jVar = this.e) != null) {
            DependencyNode dependencyNode = jVar.h;
            if (dependencyNode.j) {
                DependencyNode dependencyNode2 = jVar.i;
                if (dependencyNode2.j) {
                    iY = dependencyNode.g;
                    iY3 = dependencyNode2.g;
                }
            }
        }
        if (z && (lVar = this.f) != null) {
            DependencyNode dependencyNode3 = lVar.h;
            if (dependencyNode3.j) {
                DependencyNode dependencyNode4 = lVar.i;
                if (dependencyNode4.j) {
                    iY2 = dependencyNode3.g;
                    iY4 = dependencyNode4.g;
                }
            }
        }
        int i = iY4 - iY2;
        if (iY3 - iY < 0 || i < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        Q0(iY, iY2, iY3, iY4);
    }

    public int y() {
        return this.g0;
    }

    public void y0() {
        z0();
        k1(U0);
        T0(U0);
    }

    public int z() {
        if (this.u0 == 8) {
            return 0;
        }
        return this.e0;
    }

    public void z0() {
        ConstraintWidget constraintWidgetN = N();
        if (constraintWidgetN != null && (constraintWidgetN instanceof d) && ((d) N()).U1()) {
            return;
        }
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            this.Z.get(i).q();
        }
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.a = false;
        this.b = new WidgetRun[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new androidx.constraintlayout.core.state.d(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.K = Float.NaN;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.W = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.X = constraintAnchor;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor};
        this.Z = new ArrayList<>();
        this.a0 = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.b0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.c0 = null;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = U0;
        this.q0 = f;
        this.r0 = f;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = new ConstraintWidget[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        this.h0 = i;
        this.i0 = i2;
        this.d0 = i3;
        this.e0 = i4;
        d();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }
}
