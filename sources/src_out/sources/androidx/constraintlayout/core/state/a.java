package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.bca;
import com.google.inputmethod.k44;
import com.google.inputmethod.lo6;
import java.util.HashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class a implements bca {
    private Object a;
    final State b;
    private float c0;
    private float d0;
    b f0;
    b g0;
    private Object h0;
    private ConstraintWidget i0;
    private HashMap<String, Integer> j0;
    private HashMap<String, Float> k0;
    String c = null;
    k44 d = null;
    int e = 0;
    int f = 0;
    float g = -1.0f;
    float h = -1.0f;
    protected float i = 0.5f;
    protected float j = 0.5f;
    protected int k = 0;
    protected int l = 0;
    protected int m = 0;
    protected int n = 0;
    protected int o = 0;
    protected int p = 0;
    protected int q = 0;
    protected int r = 0;
    protected int s = 0;
    protected int t = 0;
    protected int u = 0;
    protected int v = 0;
    int w = 0;
    int x = 0;
    float y = Float.NaN;
    float z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    float I = Float.NaN;
    int J = 0;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    protected Object T = null;
    Object U = null;
    protected Object V = null;
    protected Object W = null;
    Object X = null;
    Object Y = null;
    Object Z = null;
    Object a0 = null;
    Object b0 = null;
    State.Constraint e0 = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0067a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[State.Constraint.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[State.Constraint.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[State.Constraint.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public a(State state) {
        Object obj = b.j;
        this.f0 = b.g(obj);
        this.g0 = b.g(obj);
        this.j0 = new HashMap<>();
        this.k0 = new HashMap<>();
        this.b = state;
    }

    private void e(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget constraintWidgetW = w(obj);
        if (constraintWidgetW == null) {
            return;
        }
        int[] iArr = C0067a.a;
        int i = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.q(type).b(constraintWidgetW.q(type), this.k, this.q, false);
                break;
            case 2:
                constraintWidget.q(ConstraintAnchor.Type.LEFT).b(constraintWidgetW.q(ConstraintAnchor.Type.RIGHT), this.k, this.q, false);
                break;
            case 3:
                constraintWidget.q(ConstraintAnchor.Type.RIGHT).b(constraintWidgetW.q(ConstraintAnchor.Type.LEFT), this.l, this.r, false);
                break;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.q(type2).b(constraintWidgetW.q(type2), this.l, this.r, false);
                break;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.q(type3).b(constraintWidgetW.q(type3), this.m, this.s, false);
                break;
            case 6:
                constraintWidget.q(ConstraintAnchor.Type.LEFT).b(constraintWidgetW.q(ConstraintAnchor.Type.RIGHT), this.m, this.s, false);
                break;
            case 7:
                constraintWidget.q(ConstraintAnchor.Type.RIGHT).b(constraintWidgetW.q(ConstraintAnchor.Type.LEFT), this.n, this.t, false);
                break;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.q(type4).b(constraintWidgetW.q(type4), this.n, this.t, false);
                break;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.q(type5).b(constraintWidgetW.q(type5), this.o, this.u, false);
                break;
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                constraintWidget.q(ConstraintAnchor.Type.TOP).b(constraintWidgetW.q(ConstraintAnchor.Type.BOTTOM), this.o, this.u, false);
                break;
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                constraintWidget.i0(ConstraintAnchor.Type.TOP, constraintWidgetW, ConstraintAnchor.Type.BASELINE, this.o, this.u);
                break;
            case 12:
                constraintWidget.q(ConstraintAnchor.Type.BOTTOM).b(constraintWidgetW.q(ConstraintAnchor.Type.TOP), this.p, this.v, false);
                break;
            case 13:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.q(type6).b(constraintWidgetW.q(type6), this.p, this.v, false);
                break;
            case 14:
                constraintWidget.i0(ConstraintAnchor.Type.BOTTOM, constraintWidgetW, ConstraintAnchor.Type.BASELINE, this.p, this.v);
                break;
            case 15:
                constraintWidget.i0(ConstraintAnchor.Type.BASELINE, constraintWidgetW, ConstraintAnchor.Type.BOTTOM, this.w, this.x);
                break;
            case 16:
                constraintWidget.i0(ConstraintAnchor.Type.BASELINE, constraintWidgetW, ConstraintAnchor.Type.TOP, this.w, this.x);
                break;
            case 17:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.i0(type7, constraintWidgetW, type7, this.w, this.x);
                break;
            case 18:
                constraintWidget.m(constraintWidgetW, this.c0, (int) this.d0);
                break;
        }
    }

    private void q() {
        this.K = u(this.K);
        this.L = u(this.L);
        this.M = u(this.M);
        this.N = u(this.N);
        this.O = u(this.O);
        this.P = u(this.P);
        this.Q = u(this.Q);
        this.R = u(this.R);
        this.S = u(this.S);
        this.T = u(this.T);
        this.V = u(this.V);
        this.W = u(this.W);
        this.Y = u(this.Y);
        this.Z = u(this.Z);
        this.a0 = u(this.a0);
    }

    private Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.b.k(obj) : obj;
    }

    private ConstraintWidget w(Object obj) {
        if (obj instanceof bca) {
            return ((bca) obj).a();
        }
        return null;
    }

    public a A(Object obj) {
        this.e0 = State.Constraint.LEFT_TO_LEFT;
        this.K = obj;
        return this;
    }

    public a B(Object obj) {
        this.e0 = State.Constraint.LEFT_TO_RIGHT;
        this.L = obj;
        return this;
    }

    public a C(int i) {
        State.Constraint constraint = this.e0;
        if (constraint == null) {
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            this.p = i;
            return this;
        }
        switch (C0067a.a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.k = i;
                break;
            case 3:
            case 4:
                this.l = i;
                break;
            case 5:
            case 6:
                this.m = i;
                break;
            case 7:
            case 8:
                this.n = i;
                break;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                this.o = i;
                break;
            case 12:
            case 13:
            case 14:
                this.p = i;
                break;
            case 15:
            case 16:
            case 17:
                this.w = i;
                break;
            case 18:
                this.d0 = i;
                break;
        }
        return this;
    }

    public a D(Object obj) {
        return C(this.b.d(obj));
    }

    public a E(int i) {
        State.Constraint constraint = this.e0;
        if (constraint == null) {
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            this.v = i;
            return this;
        }
        switch (C0067a.a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.q = i;
                break;
            case 3:
            case 4:
                this.r = i;
                break;
            case 5:
            case 6:
                this.s = i;
                break;
            case 7:
            case 8:
                this.t = i;
                break;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                this.u = i;
                break;
            case 12:
            case 13:
            case 14:
                this.v = i;
                break;
            case 15:
            case 16:
            case 17:
                this.x = i;
                break;
        }
        return this;
    }

    public a F(Object obj) {
        return E(this.b.d(obj));
    }

    public a G() {
        if (this.M != null) {
            this.e0 = State.Constraint.RIGHT_TO_LEFT;
            return this;
        }
        this.e0 = State.Constraint.RIGHT_TO_RIGHT;
        return this;
    }

    public a H(Object obj) {
        this.e0 = State.Constraint.RIGHT_TO_LEFT;
        this.M = obj;
        return this;
    }

    public a I(Object obj) {
        this.e0 = State.Constraint.RIGHT_TO_RIGHT;
        this.N = obj;
        return this;
    }

    public void J(k44 k44Var) {
        this.d = k44Var;
        if (k44Var != null) {
            b(k44Var.a());
        }
    }

    public a K(b bVar) {
        this.g0 = bVar;
        return this;
    }

    public void L(int i) {
        this.e = i;
    }

    public void M(float f) {
        this.g = f;
    }

    public void N(String str) {
        this.c = str;
    }

    public void O(int i) {
        this.f = i;
    }

    public void P(float f) {
        this.h = f;
    }

    public void Q(Object obj) {
        this.h0 = obj;
        ConstraintWidget constraintWidget = this.i0;
        if (constraintWidget != null) {
            constraintWidget.I0(obj);
        }
    }

    public a R(b bVar) {
        this.f0 = bVar;
        return this;
    }

    public a S() {
        if (this.O != null) {
            this.e0 = State.Constraint.START_TO_START;
            return this;
        }
        this.e0 = State.Constraint.START_TO_END;
        return this;
    }

    public a T(Object obj) {
        this.e0 = State.Constraint.START_TO_END;
        this.P = obj;
        return this;
    }

    public a U(Object obj) {
        this.e0 = State.Constraint.START_TO_START;
        this.O = obj;
        return this;
    }

    public a V() {
        if (this.S != null) {
            this.e0 = State.Constraint.TOP_TO_TOP;
            return this;
        }
        this.e0 = State.Constraint.TOP_TO_BOTTOM;
        return this;
    }

    public a W(Object obj) {
        this.e0 = State.Constraint.TOP_TO_BOTTOM;
        this.T = obj;
        return this;
    }

    public a X(Object obj) {
        this.e0 = State.Constraint.TOP_TO_TOP;
        this.S = obj;
        return this;
    }

    public a Y(float f) {
        this.j = f;
        return this;
    }

    public a Z(b bVar) {
        return R(bVar);
    }

    @Override // com.google.inputmethod.bca
    public ConstraintWidget a() {
        if (this.i0 == null) {
            ConstraintWidget constraintWidgetP = p();
            this.i0 = constraintWidgetP;
            constraintWidgetP.I0(this.h0);
        }
        return this.i0;
    }

    @Override // com.google.inputmethod.bca
    public void apply() {
        if (this.i0 == null) {
            return;
        }
        k44 k44Var = this.d;
        if (k44Var != null) {
            k44Var.apply();
        }
        this.f0.e(this.b, this.i0, 0);
        this.g0.e(this.b, this.i0, 1);
        q();
        f();
        int i = this.e;
        if (i != 0) {
            this.i0.U0(i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            this.i0.l1(i2);
        }
        float f = this.g;
        if (f != -1.0f) {
            this.i0.Y0(f);
        }
        float f2 = this.h;
        if (f2 != -1.0f) {
            this.i0.p1(f2);
        }
        this.i0.T0(this.i);
        this.i0.k1(this.j);
        ConstraintWidget constraintWidget = this.i0;
        d dVar = constraintWidget.n;
        dVar.f = this.y;
        dVar.g = this.z;
        dVar.h = this.A;
        dVar.i = this.B;
        dVar.j = this.C;
        dVar.k = this.D;
        dVar.l = this.E;
        dVar.m = this.F;
        dVar.n = this.H;
        dVar.o = this.I;
        dVar.p = this.G;
        int i3 = this.J;
        dVar.r = i3;
        constraintWidget.q1(i3);
        this.i0.n.h(null);
        HashMap<String, Integer> map = this.j0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.i0.n.g(str, 902, this.j0.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.k0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.i0.n.f(str2, 901, this.k0.get(str2).floatValue());
            }
        }
    }

    @Override // com.google.inputmethod.bca
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.i0 = constraintWidget;
        constraintWidget.I0(this.h0);
    }

    @Override // com.google.inputmethod.bca
    public void c(Object obj) {
        this.a = obj;
    }

    @Override // com.google.inputmethod.bca
    public k44 d() {
        return this.d;
    }

    public void f() {
        e(this.i0, this.K, State.Constraint.LEFT_TO_LEFT);
        e(this.i0, this.L, State.Constraint.LEFT_TO_RIGHT);
        e(this.i0, this.M, State.Constraint.RIGHT_TO_LEFT);
        e(this.i0, this.N, State.Constraint.RIGHT_TO_RIGHT);
        e(this.i0, this.O, State.Constraint.START_TO_START);
        e(this.i0, this.P, State.Constraint.START_TO_END);
        e(this.i0, this.Q, State.Constraint.END_TO_START);
        e(this.i0, this.R, State.Constraint.END_TO_END);
        e(this.i0, this.S, State.Constraint.TOP_TO_TOP);
        e(this.i0, this.T, State.Constraint.TOP_TO_BOTTOM);
        e(this.i0, this.U, State.Constraint.TOP_TO_BASELINE);
        e(this.i0, this.V, State.Constraint.BOTTOM_TO_TOP);
        e(this.i0, this.W, State.Constraint.BOTTOM_TO_BOTTOM);
        e(this.i0, this.X, State.Constraint.BOTTOM_TO_BASELINE);
        e(this.i0, this.Y, State.Constraint.BASELINE_TO_BASELINE);
        e(this.i0, this.Z, State.Constraint.BASELINE_TO_TOP);
        e(this.i0, this.a0, State.Constraint.BASELINE_TO_BOTTOM);
        e(this.i0, this.b0, State.Constraint.CIRCULAR_CONSTRAINT);
    }

    public a g() {
        this.e0 = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    @Override // com.google.inputmethod.bca
    public Object getKey() {
        return this.a;
    }

    public a h(Object obj) {
        this.e0 = State.Constraint.BASELINE_TO_BASELINE;
        this.Y = obj;
        return this;
    }

    public a i() {
        if (this.V != null) {
            this.e0 = State.Constraint.BOTTOM_TO_TOP;
            return this;
        }
        this.e0 = State.Constraint.BOTTOM_TO_BOTTOM;
        return this;
    }

    public a j(Object obj) {
        this.e0 = State.Constraint.BOTTOM_TO_BOTTOM;
        this.W = obj;
        return this;
    }

    public a k(Object obj) {
        this.e0 = State.Constraint.BOTTOM_TO_TOP;
        this.V = obj;
        return this;
    }

    public a l() {
        State.Constraint constraint = this.e0;
        if (constraint == null) {
            m();
            return this;
        }
        switch (C0067a.a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.K = null;
                this.L = null;
                this.k = 0;
                this.q = 0;
                break;
            case 3:
            case 4:
                this.M = null;
                this.N = null;
                this.l = 0;
                this.r = 0;
                break;
            case 5:
            case 6:
                this.O = null;
                this.P = null;
                this.m = 0;
                this.s = 0;
                break;
            case 7:
            case 8:
                this.Q = null;
                this.R = null;
                this.n = 0;
                this.t = 0;
                break;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                this.S = null;
                this.T = null;
                this.U = null;
                this.o = 0;
                this.u = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.V = null;
                this.W = null;
                this.X = null;
                this.p = 0;
                this.v = 0;
                break;
            case 17:
                this.Y = null;
                break;
            case 18:
                this.b0 = null;
                break;
        }
        return this;
    }

    public a m() {
        this.K = null;
        this.L = null;
        this.k = 0;
        this.M = null;
        this.N = null;
        this.l = 0;
        this.O = null;
        this.P = null;
        this.m = 0;
        this.Q = null;
        this.R = null;
        this.n = 0;
        this.S = null;
        this.T = null;
        this.o = 0;
        this.V = null;
        this.W = null;
        this.p = 0;
        this.Y = null;
        this.b0 = null;
        this.i = 0.5f;
        this.j = 0.5f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        return this;
    }

    public a n() {
        S().l();
        r().l();
        z().l();
        G().l();
        return this;
    }

    public a o() {
        V().l();
        g().l();
        i().l();
        return this;
    }

    public ConstraintWidget p() {
        return new ConstraintWidget(x().l(), v().l());
    }

    public a r() {
        if (this.Q != null) {
            this.e0 = State.Constraint.END_TO_START;
            return this;
        }
        this.e0 = State.Constraint.END_TO_END;
        return this;
    }

    public a s(Object obj) {
        this.e0 = State.Constraint.END_TO_END;
        this.R = obj;
        return this;
    }

    public a t(Object obj) {
        this.e0 = State.Constraint.END_TO_START;
        this.Q = obj;
        return this;
    }

    public b v() {
        return this.g0;
    }

    public b x() {
        return this.f0;
    }

    public a y(float f) {
        this.i = f;
        return this;
    }

    public a z() {
        if (this.K != null) {
            this.e0 = State.Constraint.LEFT_TO_LEFT;
            return this;
        }
        this.e0 = State.Constraint.LEFT_TO_RIGHT;
        return this;
    }
}
