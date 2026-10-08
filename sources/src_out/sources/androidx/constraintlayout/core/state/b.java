package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class b {
    public static final Object i = new String("FIXED_DIMENSION");
    public static final Object j = new String("WRAP_DIMENSION");
    public static final Object k = new String("SPREAD_DIMENSION");
    public static final Object l = new String("PARENT_DIMENSION");
    public static final Object m = new String("PERCENT_DIMENSION");
    public static final Object n = new String("RATIO_DIMENSION");
    private final int a;
    int b;
    int c;
    float d;
    int e;
    String f;
    Object g;
    boolean h;

    private b() {
        this.a = -2;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.g = j;
        this.h = false;
    }

    @Deprecated
    public static b a(int i2) {
        return f(i2);
    }

    @Deprecated
    public static b b(Object obj) {
        b bVar = new b(i);
        bVar.k(obj);
        return bVar;
    }

    @Deprecated
    public static b c(Object obj) {
        return h(obj);
    }

    @Deprecated
    public static b d() {
        return i();
    }

    public static b f(int i2) {
        b bVar = new b(i);
        bVar.j(i2);
        return bVar;
    }

    public static b g(Object obj) {
        b bVar = new b(i);
        bVar.k(obj);
        return bVar;
    }

    public static b h(Object obj) {
        b bVar = new b();
        bVar.q(obj);
        return bVar;
    }

    public static b i() {
        return new b(j);
    }

    public void e(State state, ConstraintWidget constraintWidget, int i2) {
        String str = this.f;
        if (str != null) {
            constraintWidget.K0(str);
        }
        int i3 = 2;
        if (i2 == 0) {
            if (this.h) {
                constraintWidget.W0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.g;
                if (obj == j) {
                    i3 = 1;
                } else if (obj != m) {
                    i3 = 0;
                }
                constraintWidget.X0(i3, this.b, this.c, this.d);
                return;
            }
            int i4 = this.b;
            if (i4 > 0) {
                constraintWidget.h1(i4);
            }
            int i5 = this.c;
            if (i5 < Integer.MAX_VALUE) {
                constraintWidget.e1(i5);
            }
            Object obj2 = this.g;
            if (obj2 == j) {
                constraintWidget.W0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == l) {
                constraintWidget.W0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.W0(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.r1(this.e);
                    return;
                }
                return;
            }
        }
        if (this.h) {
            constraintWidget.n1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.g;
            if (obj3 == j) {
                i3 = 1;
            } else if (obj3 != m) {
                i3 = 0;
            }
            constraintWidget.o1(i3, this.b, this.c, this.d);
            return;
        }
        int i6 = this.b;
        if (i6 > 0) {
            constraintWidget.g1(i6);
        }
        int i7 = this.c;
        if (i7 < Integer.MAX_VALUE) {
            constraintWidget.d1(i7);
        }
        Object obj4 = this.g;
        if (obj4 == j) {
            constraintWidget.n1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == l) {
            constraintWidget.n1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.n1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.S0(this.e);
        }
    }

    public b j(int i2) {
        this.g = null;
        this.e = i2;
        return this;
    }

    public b k(Object obj) {
        this.g = obj;
        if (obj instanceof Integer) {
            this.e = ((Integer) obj).intValue();
            this.g = null;
        }
        return this;
    }

    int l() {
        return this.e;
    }

    public b m(int i2) {
        if (this.c >= 0) {
            this.c = i2;
        }
        return this;
    }

    public b n(Object obj) {
        Object obj2 = j;
        if (obj == obj2 && this.h) {
            this.g = obj2;
            this.c = Integer.MAX_VALUE;
        }
        return this;
    }

    public b o(int i2) {
        if (i2 >= 0) {
            this.b = i2;
        }
        return this;
    }

    public b p(Object obj) {
        if (obj == j) {
            this.b = -2;
        }
        return this;
    }

    public b q(Object obj) {
        this.g = obj;
        this.h = true;
        return this;
    }

    private b(Object obj) {
        this.a = -2;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.h = false;
        this.g = obj;
    }
}
