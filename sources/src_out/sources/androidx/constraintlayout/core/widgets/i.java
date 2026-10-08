package androidx.constraintlayout.core.widgets;

import com.google.inputmethod.gc5;
import java.util.HashSet;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class i extends gc5 {
    private int X0 = 0;
    private int Y0 = 0;
    private int Z0 = 0;
    private int a1 = 0;
    private int b1 = 0;
    private int c1 = 0;
    private int d1 = 0;
    private int e1 = 0;
    private boolean f1 = false;
    private int g1 = 0;
    private int h1 = 0;
    protected androidx.constraintlayout.core.widgets.analyzer.b.a i1 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b j1 = null;

    public void A1(boolean z) {
        int i = this.b1;
        if (i > 0 || this.c1 > 0) {
            if (z) {
                this.d1 = this.c1;
                this.e1 = i;
            } else {
                this.d1 = i;
                this.e1 = this.c1;
            }
        }
    }

    public void B1() {
        for (int i = 0; i < this.W0; i++) {
            ConstraintWidget constraintWidget = this.V0[i];
            if (constraintWidget != null) {
                constraintWidget.b1(true);
            }
        }
    }

    public boolean C1(HashSet<ConstraintWidget> hashSet) {
        for (int i = 0; i < this.W0; i++) {
            if (hashSet.contains(this.V0[i])) {
                return true;
            }
        }
        return false;
    }

    public int D1() {
        return this.h1;
    }

    public int E1() {
        return this.g1;
    }

    public int F1() {
        return this.Y0;
    }

    public int G1() {
        return this.d1;
    }

    public int H1() {
        return this.e1;
    }

    public int I1() {
        return this.X0;
    }

    public void J1(int i, int i2, int i3, int i4) {
    }

    protected void K1(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.j1 == null && N() != null) {
            this.j1 = ((d) N()).R1();
        }
        androidx.constraintlayout.core.widgets.analyzer.b.a aVar = this.i1;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        this.j1.b(constraintWidget, aVar);
        constraintWidget.r1(this.i1.e);
        constraintWidget.S0(this.i1.f);
        constraintWidget.R0(this.i1.h);
        constraintWidget.H0(this.i1.g);
    }

    protected boolean L1() {
        ConstraintWidget constraintWidget = this.c0;
        androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0068b interfaceC0068bR1 = constraintWidget != null ? ((d) constraintWidget).R1() : null;
        if (interfaceC0068bR1 == null) {
            return false;
        }
        for (int i = 0; i < this.W0; i++) {
            ConstraintWidget constraintWidget2 = this.V0[i];
            if (constraintWidget2 != null && !(constraintWidget2 instanceof f)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourW = constraintWidget2.w(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = constraintWidget2.w(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourW != dimensionBehaviour || constraintWidget2.w == 1 || dimensionBehaviourW2 != dimensionBehaviour || constraintWidget2.x == 1) {
                    if (dimensionBehaviourW == dimensionBehaviour) {
                        dimensionBehaviourW = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviourW2 == dimensionBehaviour) {
                        dimensionBehaviourW2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    androidx.constraintlayout.core.widgets.analyzer.b.a aVar = this.i1;
                    aVar.a = dimensionBehaviourW;
                    aVar.b = dimensionBehaviourW2;
                    aVar.c = constraintWidget2.a0();
                    this.i1.d = constraintWidget2.z();
                    interfaceC0068bR1.b(constraintWidget2, this.i1);
                    constraintWidget2.r1(this.i1.e);
                    constraintWidget2.S0(this.i1.f);
                    constraintWidget2.H0(this.i1.g);
                }
            }
        }
        return true;
    }

    public boolean M1() {
        return this.f1;
    }

    protected void N1(boolean z) {
        this.f1 = z;
    }

    public void O1(int i, int i2) {
        this.g1 = i;
        this.h1 = i2;
    }

    public void P1(int i) {
        this.Z0 = i;
        this.X0 = i;
        this.a1 = i;
        this.Y0 = i;
        this.b1 = i;
        this.c1 = i;
    }

    public void Q1(int i) {
        this.Y0 = i;
    }

    public void R1(int i) {
        this.c1 = i;
    }

    public void S1(int i) {
        this.Z0 = i;
        this.d1 = i;
    }

    public void T1(int i) {
        this.a1 = i;
        this.e1 = i;
    }

    public void U1(int i) {
        this.b1 = i;
        this.d1 = i;
        this.e1 = i;
    }

    public void V1(int i) {
        this.X0 = i;
    }

    @Override // com.google.inputmethod.gc5, com.google.inputmethod.fc5
    public void c(d dVar) {
        B1();
    }
}
