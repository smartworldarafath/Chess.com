package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.ev7;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class d {
    public static boolean s = false;
    public static boolean t = true;
    public static boolean u = true;
    public static boolean v = true;
    public static boolean w = false;
    public static long x;
    public static long y;
    private a e;
    final c o;
    private a r;
    private int a = 1000;
    public boolean b = false;
    int c = 0;
    private HashMap<String, SolverVariable> d = null;
    private int f = 32;
    private int g = 32;
    public boolean i = false;
    public boolean j = false;
    private boolean[] k = new boolean[32];
    int l = 1;
    int m = 0;
    private int n = 32;
    private SolverVariable[] p = new SolverVariable[1000];
    private int q = 0;
    androidx.constraintlayout.core.b[] h = new androidx.constraintlayout.core.b[32];

    interface a {
        SolverVariable a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        boolean isEmpty();
    }

    static class b extends androidx.constraintlayout.core.b {
        b(c cVar) {
            this.e = new h(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.o = cVar;
        this.e = new g(cVar);
        if (w) {
            this.r = new b(cVar);
        } else {
            this.r = new androidx.constraintlayout.core.b(cVar);
        }
    }

    private int C(a aVar, boolean z) {
        for (int i = 0; i < this.l; i++) {
            this.k[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 < this.l * 2) {
                if (aVar.getKey() != null) {
                    this.k[aVar.getKey().c] = true;
                }
                SolverVariable solverVariableA = aVar.a(this, this.k);
                if (solverVariableA != null) {
                    boolean[] zArr = this.k;
                    int i3 = solverVariableA.c;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                    }
                }
                if (solverVariableA != null) {
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    for (int i5 = 0; i5 < this.m; i5++) {
                        androidx.constraintlayout.core.b bVar = this.h[i5];
                        if (bVar.a.j != SolverVariable.Type.UNRESTRICTED && !bVar.f && bVar.t(solverVariableA)) {
                            float fD = bVar.e.d(solverVariableA);
                            if (fD < 0.0f) {
                                float f2 = (-bVar.b) / fD;
                                if (f2 < f) {
                                    i4 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    if (i4 > -1) {
                        androidx.constraintlayout.core.b bVar2 = this.h[i4];
                        bVar2.a.d = -1;
                        bVar2.x(solverVariableA);
                        SolverVariable solverVariable = bVar2.a;
                        solverVariable.d = i4;
                        solverVariable.j(this, bVar2);
                    }
                } else {
                    z2 = true;
                }
            }
            return i2;
        }
        return i2;
    }

    private void D() {
        int i = 0;
        if (w) {
            while (i < this.m) {
                androidx.constraintlayout.core.b bVar = this.h[i];
                if (bVar != null) {
                    this.o.a.release(bVar);
                }
                this.h[i] = null;
                i++;
            }
            return;
        }
        while (i < this.m) {
            androidx.constraintlayout.core.b bVar2 = this.h[i];
            if (bVar2 != null) {
                this.o.b.release(bVar2);
            }
            this.h[i] = null;
            i++;
        }
    }

    private SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable solverVariableAcquire = this.o.c.acquire();
        if (solverVariableAcquire == null) {
            solverVariableAcquire = new SolverVariable(type, str);
            solverVariableAcquire.i(type, str);
        } else {
            solverVariableAcquire.g();
            solverVariableAcquire.i(type, str);
        }
        int i = this.q;
        int i2 = this.a;
        if (i >= i2) {
            int i3 = i2 * 2;
            this.a = i3;
            this.p = (SolverVariable[]) Arrays.copyOf(this.p, i3);
        }
        SolverVariable[] solverVariableArr = this.p;
        int i4 = this.q;
        this.q = i4 + 1;
        solverVariableArr[i4] = solverVariableAcquire;
        return solverVariableAcquire;
    }

    private void l(androidx.constraintlayout.core.b bVar) {
        int i;
        if (u && bVar.f) {
            bVar.a.h(this, bVar.b);
        } else {
            androidx.constraintlayout.core.b[] bVarArr = this.h;
            int i2 = this.m;
            bVarArr[i2] = bVar;
            SolverVariable solverVariable = bVar.a;
            solverVariable.d = i2;
            this.m = i2 + 1;
            solverVariable.j(this, bVar);
        }
        if (u && this.b) {
            int i3 = 0;
            while (i3 < this.m) {
                if (this.h[i3] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.b bVar2 = this.h[i3];
                if (bVar2 != null && bVar2.f) {
                    bVar2.a.h(this, bVar2.b);
                    if (w) {
                        this.o.a.release(bVar2);
                    } else {
                        this.o.b.release(bVar2);
                    }
                    this.h[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.m;
                        if (i4 >= i) {
                            break;
                        }
                        androidx.constraintlayout.core.b[] bVarArr2 = this.h;
                        int i6 = i4 - 1;
                        androidx.constraintlayout.core.b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        SolverVariable solverVariable2 = bVar3.a;
                        if (solverVariable2.d == i4) {
                            solverVariable2.d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.h[i5] = null;
                    }
                    this.m = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    private void n() {
        for (int i = 0; i < this.m; i++) {
            androidx.constraintlayout.core.b bVar = this.h[i];
            bVar.a.f = bVar.b;
        }
    }

    public static androidx.constraintlayout.core.b s(d dVar, SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        return dVar.r().j(solverVariable, solverVariable2, f);
    }

    private int u(a aVar) throws Exception {
        float f;
        for (int i = 0; i < this.m; i++) {
            androidx.constraintlayout.core.b bVar = this.h[i];
            if (bVar.a.j != SolverVariable.Type.UNRESTRICTED) {
                float f2 = 0.0f;
                if (bVar.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f3 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (true) {
                            if (i3 >= this.m) {
                                break;
                            }
                            androidx.constraintlayout.core.b bVar2 = this.h[i3];
                            if (bVar2.a.j == SolverVariable.Type.UNRESTRICTED || bVar2.f || bVar2.b >= f2) {
                                f = f2;
                            } else if (v) {
                                int i7 = bVar2.e.i();
                                int i8 = 0;
                                while (i8 < i7) {
                                    SolverVariable solverVariableB = bVar2.e.b(i8);
                                    float fD = bVar2.e.d(solverVariableB);
                                    if (fD > f2) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f4 = solverVariableB.h[i9] / fD;
                                            if ((f4 < f3 && i9 == i6) || i9 > i6) {
                                                i6 = i9;
                                                i5 = solverVariableB.c;
                                                i4 = i3;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i8++;
                                    f2 = f2;
                                }
                                f = f2;
                            } else {
                                f = f2;
                                for (int i10 = 1; i10 < this.l; i10++) {
                                    SolverVariable solverVariable = this.o.d[i10];
                                    float fD2 = bVar2.e.d(solverVariable);
                                    if (fD2 > f) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f5 = solverVariable.h[i11] / fD2;
                                            if ((f5 < f3 && i11 == i6) || i11 > i6) {
                                                i6 = i11;
                                                i4 = i3;
                                                i5 = i10;
                                                f3 = f5;
                                            }
                                        }
                                    }
                                }
                            }
                            i3++;
                            f2 = f;
                        }
                        float f6 = f2;
                        if (i4 != -1) {
                            androidx.constraintlayout.core.b bVar3 = this.h[i4];
                            bVar3.a.d = -1;
                            bVar3.x(this.o.d[i5]);
                            SolverVariable solverVariable2 = bVar3.a;
                            solverVariable2.d = i4;
                            solverVariable2.j(this, bVar3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.l / 2) {
                            z = true;
                        }
                        f2 = f6;
                    }
                    return i2;
                }
            }
        }
        return 0;
    }

    public static ev7 x() {
        return null;
    }

    private void z() {
        int i = this.f * 2;
        this.f = i;
        this.h = (androidx.constraintlayout.core.b[]) Arrays.copyOf(this.h, i);
        c cVar = this.o;
        cVar.d = (SolverVariable[]) Arrays.copyOf(cVar.d, this.f);
        int i2 = this.f;
        this.k = new boolean[i2];
        this.g = i2;
        this.n = i2;
    }

    public void A() throws Exception {
        if (this.e.isEmpty()) {
            n();
            return;
        }
        if (!this.i && !this.j) {
            B(this.e);
            return;
        }
        for (int i = 0; i < this.m; i++) {
            if (!this.h[i].f) {
                B(this.e);
                return;
            }
        }
        n();
    }

    void B(a aVar) throws Exception {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.o;
            SolverVariable[] solverVariableArr = cVar.d;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.g();
            }
            i++;
        }
        cVar.c.a(this.p, this.q);
        this.q = 0;
        Arrays.fill(this.o.d, (Object) null);
        HashMap<String, SolverVariable> map = this.d;
        if (map != null) {
            map.clear();
        }
        this.c = 0;
        this.e.clear();
        this.l = 1;
        for (int i2 = 0; i2 < this.m; i2++) {
            androidx.constraintlayout.core.b bVar = this.h[i2];
            if (bVar != null) {
                bVar.c = false;
            }
        }
        D();
        this.m = 0;
        if (w) {
            this.r = new b(this.o);
        } else {
            this.r = new androidx.constraintlayout.core.b(this.o);
        }
    }

    public void b(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableQ = q(constraintWidget.q(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableQ2 = q(constraintWidget.q(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableQ3 = q(constraintWidget.q(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableQ4 = q(constraintWidget.q(type4));
        SolverVariable solverVariableQ5 = q(constraintWidget2.q(type));
        SolverVariable solverVariableQ6 = q(constraintWidget2.q(type2));
        SolverVariable solverVariableQ7 = q(constraintWidget2.q(type3));
        SolverVariable solverVariableQ8 = q(constraintWidget2.q(type4));
        androidx.constraintlayout.core.b bVarR = r();
        double d = f;
        double d2 = i;
        bVarR.q(solverVariableQ2, solverVariableQ4, solverVariableQ6, solverVariableQ8, (float) (Math.sin(d) * d2));
        d(bVarR);
        androidx.constraintlayout.core.b bVarR2 = r();
        bVarR2.q(solverVariableQ, solverVariableQ3, solverVariableQ5, solverVariableQ7, (float) (Math.cos(d) * d2));
        d(bVarR2);
    }

    public void c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.h(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i3 != 8) {
            bVarR.d(this, i3);
        }
        d(bVarR);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    public void d(androidx.constraintlayout.core.b bVar) {
        SolverVariable solverVariableV;
        if (bVar == null) {
            return;
        }
        boolean z = true;
        if (this.m + 1 >= this.n || this.l + 1 >= this.g) {
            z();
        }
        boolean z2 = false;
        if (!bVar.f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                SolverVariable solverVariableP = p();
                bVar.a = solverVariableP;
                int i = this.m;
                l(bVar);
                if (this.m == i + 1) {
                    this.r.b(bVar);
                    C(this.r, true);
                    if (solverVariableP.d == -1) {
                        if (bVar.a == solverVariableP && (solverVariableV = bVar.v(solverVariableP)) != null) {
                            bVar.x(solverVariableV);
                        }
                        if (!bVar.f) {
                            bVar.a.j(this, bVar);
                        }
                        if (w) {
                            this.o.a.release(bVar);
                        } else {
                            this.o.b.release(bVar);
                        }
                        this.m--;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        l(bVar);
    }

    public androidx.constraintlayout.core.b e(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (t && i2 == 8 && solverVariable2.g && solverVariable.d == -1) {
            solverVariable.h(this, solverVariable2.f + i);
            return null;
        }
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.n(solverVariable, solverVariable2, i);
        if (i2 != 8) {
            bVarR.d(this, i2);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(SolverVariable solverVariable, int i) {
        if (t && solverVariable.d == -1) {
            float f = i;
            solverVariable.h(this, f);
            for (int i2 = 0; i2 < this.c + 1; i2++) {
                SolverVariable solverVariable2 = this.o.d[i2];
                if (solverVariable2 != null && solverVariable2.n && solverVariable2.o == solverVariable.c) {
                    solverVariable2.h(this, solverVariable2.p + f);
                }
            }
            return;
        }
        int i3 = solverVariable.d;
        if (i3 == -1) {
            androidx.constraintlayout.core.b bVarR = r();
            bVarR.i(solverVariable, i);
            d(bVarR);
            return;
        }
        androidx.constraintlayout.core.b bVar = this.h[i3];
        if (bVar.f) {
            bVar.b = i;
            return;
        }
        if (bVar.e.i() == 0) {
            bVar.f = true;
            bVar.b = i;
        } else {
            androidx.constraintlayout.core.b bVarR2 = r();
            bVarR2.m(solverVariable, i);
            d(bVarR2);
        }
    }

    public void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.e = 0;
        bVarR.o(solverVariable, solverVariable2, solverVariableT, i);
        d(bVarR);
    }

    public void h(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.e = 0;
        bVarR.o(solverVariable, solverVariable2, solverVariableT, i);
        if (i2 != 8) {
            m(bVarR, (int) (bVarR.e.d(solverVariableT) * (-1.0f)), i2);
        }
        d(bVarR);
    }

    public void i(SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.e = 0;
        bVarR.p(solverVariable, solverVariable2, solverVariableT, i);
        d(bVarR);
    }

    public void j(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        androidx.constraintlayout.core.b bVarR = r();
        SolverVariable solverVariableT = t();
        solverVariableT.e = 0;
        bVarR.p(solverVariable, solverVariable2, solverVariableT, i);
        if (i2 != 8) {
            m(bVarR, (int) (bVarR.e.d(solverVariableT) * (-1.0f)), i2);
        }
        d(bVarR);
    }

    public void k(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        androidx.constraintlayout.core.b bVarR = r();
        bVarR.k(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 8) {
            bVarR.d(this, i);
        }
        d(bVarR);
    }

    void m(androidx.constraintlayout.core.b bVar, int i, int i2) {
        bVar.e(o(i2, null), i);
    }

    public SolverVariable o(int i, String str) {
        if (this.l + 1 >= this.g) {
            z();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.ERROR, str);
        int i2 = this.c + 1;
        this.c = i2;
        this.l++;
        solverVariableA.c = i2;
        solverVariableA.e = i;
        this.o.d[i2] = solverVariableA;
        this.e.c(solverVariableA);
        return solverVariableA;
    }

    public SolverVariable p() {
        if (this.l + 1 >= this.g) {
            z();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i = this.c + 1;
        this.c = i;
        this.l++;
        solverVariableA.c = i;
        this.o.d[i] = solverVariableA;
        return solverVariableA;
    }

    public SolverVariable q(Object obj) {
        SolverVariable solverVariableI = null;
        if (obj == null) {
            return null;
        }
        if (this.l + 1 >= this.g) {
            z();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariableI = constraintAnchor.i();
            if (solverVariableI == null) {
                constraintAnchor.s(this.o);
                solverVariableI = constraintAnchor.i();
            }
            int i = solverVariableI.c;
            if (i != -1 && i <= this.c && this.o.d[i] != null) {
                return solverVariableI;
            }
            if (i != -1) {
                solverVariableI.g();
            }
            int i2 = this.c + 1;
            this.c = i2;
            this.l++;
            solverVariableI.c = i2;
            solverVariableI.j = SolverVariable.Type.UNRESTRICTED;
            this.o.d[i2] = solverVariableI;
        }
        return solverVariableI;
    }

    public androidx.constraintlayout.core.b r() {
        androidx.constraintlayout.core.b bVarAcquire;
        if (w) {
            bVarAcquire = this.o.a.acquire();
            if (bVarAcquire == null) {
                bVarAcquire = new b(this.o);
                y++;
            } else {
                bVarAcquire.y();
            }
        } else {
            bVarAcquire = this.o.b.acquire();
            if (bVarAcquire == null) {
                bVarAcquire = new androidx.constraintlayout.core.b(this.o);
                x++;
            } else {
                bVarAcquire.y();
            }
        }
        SolverVariable.d();
        return bVarAcquire;
    }

    public SolverVariable t() {
        if (this.l + 1 >= this.g) {
            z();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i = this.c + 1;
        this.c = i;
        this.l++;
        solverVariableA.c = i;
        this.o.d[i] = solverVariableA;
        return solverVariableA;
    }

    public void v(ev7 ev7Var) {
    }

    public c w() {
        return this.o;
    }

    public int y(Object obj) {
        SolverVariable solverVariableI = ((ConstraintAnchor) obj).i();
        if (solverVariableI != null) {
            return (int) (solverVariableI.f + 0.5f);
        }
        return 0;
    }
}
