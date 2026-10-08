package androidx.constraintlayout.core;

import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class b implements d.a {
    public a e;
    SolverVariable a = null;
    float b = 0.0f;
    boolean c = false;
    ArrayList<SolverVariable> d = new ArrayList<>();
    boolean f = false;

    public interface a {
        boolean a(SolverVariable solverVariable);

        SolverVariable b(int i);

        void c(SolverVariable solverVariable, float f);

        void clear();

        float d(SolverVariable solverVariable);

        void e(float f);

        void f(SolverVariable solverVariable, float f, boolean z);

        void g();

        float h(SolverVariable solverVariable, boolean z);

        int i();

        float j(b bVar, boolean z);

        float k(int i);
    }

    public b() {
    }

    private boolean u(SolverVariable solverVariable, d dVar) {
        return solverVariable.m <= 1;
    }

    private SolverVariable w(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int i = this.e.i();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            float fK = this.e.k(i2);
            if (fK < 0.0f) {
                SolverVariable solverVariableB = this.e.b(i2);
                if ((zArr == null || !zArr[solverVariableB.c]) && solverVariableB != solverVariable && (((type = solverVariableB.j) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fK < f)) {
                    f = fK;
                    solverVariable2 = solverVariableB;
                }
            }
        }
        return solverVariable2;
    }

    public void A(d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.g) {
            return;
        }
        this.b += solverVariable.f * this.e.d(solverVariable);
        this.e.h(solverVariable, z);
        if (z) {
            solverVariable.e(this);
        }
        if (d.u && this.e.i() == 0) {
            this.f = true;
            dVar.b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z) {
        this.b += bVar.b * this.e.j(bVar, z);
        if (z) {
            bVar.a.e(this);
        }
        if (d.u && this.a != null && this.e.i() == 0) {
            this.f = true;
            dVar.b = true;
        }
    }

    public void C(d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.n) {
            return;
        }
        float fD = this.e.d(solverVariable);
        this.b += solverVariable.p * fD;
        this.e.h(solverVariable, z);
        if (z) {
            solverVariable.e(this);
        }
        this.e.f(dVar.o.d[solverVariable.o], fD, z);
        if (d.u && this.e.i() == 0) {
            this.f = true;
            dVar.b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.h.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int i = this.e.i();
            for (int i2 = 0; i2 < i; i2++) {
                SolverVariable solverVariableB = this.e.b(i2);
                if (solverVariableB.d != -1 || solverVariableB.g || solverVariableB.n) {
                    this.d.add(solverVariableB);
                }
            }
            int size = this.d.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    SolverVariable solverVariable = this.d.get(i3);
                    if (solverVariable.g) {
                        A(dVar, solverVariable, true);
                    } else if (solverVariable.n) {
                        C(dVar, solverVariable, true);
                    } else {
                        B(dVar, dVar.h[solverVariable.d], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
        if (d.u && this.a != null && this.e.i() == 0) {
            this.f = true;
            dVar.b = true;
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public SolverVariable a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // androidx.constraintlayout.core.d.a
    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < bVar.e.i(); i++) {
                this.e.f(bVar.e.b(i), bVar.e.k(i), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public void c(SolverVariable solverVariable) {
        int i = solverVariable.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.c(solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.d.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(d dVar, int i) {
        this.e.c(dVar.o(i, "ep"), 1.0f);
        this.e.c(dVar.o(i, "em"), -1.0f);
        return this;
    }

    b e(SolverVariable solverVariable, int i) {
        this.e.c(solverVariable, i);
        return this;
    }

    boolean f(d dVar) {
        boolean z;
        SolverVariable solverVariableG = g(dVar);
        if (solverVariableG == null) {
            z = true;
        } else {
            x(solverVariableG);
            z = false;
        }
        if (this.e.i() == 0) {
            this.f = true;
        }
        return z;
    }

    SolverVariable g(d dVar) {
        int i = this.e.i();
        SolverVariable solverVariable = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        SolverVariable solverVariable2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            float fK = this.e.k(i2);
            SolverVariable solverVariableB = this.e.b(i2);
            if (solverVariableB.j == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null || f > fK) {
                    boolean zU = u(solverVariableB, dVar);
                    z = zU;
                    f = fK;
                    solverVariable = solverVariableB;
                } else if (!z && u(solverVariableB, dVar)) {
                    f = fK;
                    solverVariable = solverVariableB;
                    z = true;
                }
            } else if (solverVariable == null && fK < 0.0f) {
                if (solverVariable2 == null || f2 > fK) {
                    boolean zU2 = u(solverVariableB, dVar);
                    z2 = zU2;
                    f2 = fK;
                    solverVariable2 = solverVariableB;
                } else if (!z2 && u(solverVariableB, dVar)) {
                    f2 = fK;
                    solverVariable2 = solverVariableB;
                    z2 = true;
                }
            }
        }
        return solverVariable != null ? solverVariable : solverVariable2;
    }

    @Override // androidx.constraintlayout.core.d.a
    public SolverVariable getKey() {
        return this.a;
    }

    b h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable4, 1.0f);
            this.e.c(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            this.e.c(solverVariable3, -1.0f);
            this.e.c(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return this;
            }
        } else {
            if (f <= 0.0f) {
                this.e.c(solverVariable, -1.0f);
                this.e.c(solverVariable2, 1.0f);
                this.b = i;
                return this;
            }
            if (f >= 1.0f) {
                this.e.c(solverVariable4, -1.0f);
                this.e.c(solverVariable3, 1.0f);
                this.b = -i2;
                return this;
            }
            float f2 = 1.0f - f;
            this.e.c(solverVariable, f2 * 1.0f);
            this.e.c(solverVariable2, f2 * (-1.0f));
            this.e.c(solverVariable3, (-1.0f) * f);
            this.e.c(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
                return this;
            }
        }
        return this;
    }

    b i(SolverVariable solverVariable, int i) {
        this.a = solverVariable;
        float f = i;
        solverVariable.f = f;
        this.b = f;
        this.f = true;
        return this;
    }

    @Override // androidx.constraintlayout.core.d.a
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.e.i() == 0;
    }

    b j(SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        this.e.c(solverVariable, -1.0f);
        this.e.c(solverVariable2, f);
        return this;
    }

    public b k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.e.c(solverVariable, -1.0f);
        this.e.c(solverVariable2, 1.0f);
        this.e.c(solverVariable3, f);
        this.e.c(solverVariable4, -f);
        return this;
    }

    public b l(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            this.e.c(solverVariable4, 1.0f);
            this.e.c(solverVariable3, -1.0f);
            return this;
        }
        if (f == 0.0f) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            return this;
        }
        if (f3 == 0.0f) {
            this.e.c(solverVariable3, 1.0f);
            this.e.c(solverVariable4, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.e.c(solverVariable, 1.0f);
        this.e.c(solverVariable2, -1.0f);
        this.e.c(solverVariable4, f4);
        this.e.c(solverVariable3, -f4);
        return this;
    }

    public b m(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.c(solverVariable, 1.0f);
            return this;
        }
        this.b = i;
        this.e.c(solverVariable, -1.0f);
        return this;
    }

    public b n(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            return this;
        }
        this.e.c(solverVariable, -1.0f);
        this.e.c(solverVariable2, 1.0f);
        return this;
    }

    public b o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            this.e.c(solverVariable3, -1.0f);
            return this;
        }
        this.e.c(solverVariable, -1.0f);
        this.e.c(solverVariable2, 1.0f);
        this.e.c(solverVariable3, 1.0f);
        return this;
    }

    public b p(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.e.c(solverVariable, 1.0f);
            this.e.c(solverVariable2, -1.0f);
            this.e.c(solverVariable3, 1.0f);
            return this;
        }
        this.e.c(solverVariable, -1.0f);
        this.e.c(solverVariable2, 1.0f);
        this.e.c(solverVariable3, -1.0f);
        return this;
    }

    public b q(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.e.c(solverVariable3, 0.5f);
        this.e.c(solverVariable4, 0.5f);
        this.e.c(solverVariable, -0.5f);
        this.e.c(solverVariable2, -0.5f);
        this.b = -f;
        return this;
    }

    void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.g();
        }
    }

    boolean s() {
        SolverVariable solverVariable = this.a;
        if (solverVariable != null) {
            return solverVariable.j == SolverVariable.Type.UNRESTRICTED || this.b >= 0.0f;
        }
        return false;
    }

    boolean t(SolverVariable solverVariable) {
        return this.e.a(solverVariable);
    }

    public String toString() {
        return z();
    }

    public SolverVariable v(SolverVariable solverVariable) {
        return w(null, solverVariable);
    }

    void x(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.a;
        if (solverVariable2 != null) {
            this.e.c(solverVariable2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float fH = this.e.h(solverVariable, true) * (-1.0f);
        this.a = solverVariable;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        this.e.e(fH);
    }

    public void y() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    String z() {
        boolean z;
        String str = (this.a == null ? "0" : "" + this.a) + " = ";
        if (this.b != 0.0f) {
            str = str + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.i();
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable solverVariableB = this.e.b(i2);
            if (solverVariableB != null) {
                float fK = this.e.k(i2);
                if (fK != 0.0f) {
                    String string = solverVariableB.toString();
                    if (z) {
                        if (fK > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fK *= -1.0f;
                        }
                    } else if (fK < 0.0f) {
                        str = str + "- ";
                        fK *= -1.0f;
                    }
                    str = fK == 1.0f ? str + string : str + fK + " " + string;
                    z = true;
                }
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }

    public b(c cVar) {
        this.e = new androidx.constraintlayout.core.a(this, cVar);
    }
}
