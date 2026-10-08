package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.o43;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class h extends WidgetRun {
    h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.e.f();
        constraintWidget.f.f();
        this.f = ((androidx.constraintlayout.core.widgets.f) constraintWidget).z1();
    }

    private void q(DependencyNode dependencyNode) {
        this.h.k.add(dependencyNode);
        dependencyNode.l.add(this.h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, com.google.inputmethod.o43
    public void a(o43 o43Var) {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.c && !dependencyNode.j) {
            this.h.d((int) ((dependencyNode.l.get(0).g * ((androidx.constraintlayout.core.widgets.f) this.b).C1()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) this.b;
        int iA1 = fVar.A1();
        int iB1 = fVar.B1();
        fVar.C1();
        if (fVar.z1() == 1) {
            if (iA1 != -1) {
                this.h.l.add(this.b.c0.e.h);
                this.b.c0.e.h.k.add(this.h);
                this.h.f = iA1;
            } else if (iB1 != -1) {
                this.h.l.add(this.b.c0.e.i);
                this.b.c0.e.i.k.add(this.h);
                this.h.f = -iB1;
            } else {
                DependencyNode dependencyNode = this.h;
                dependencyNode.b = true;
                dependencyNode.l.add(this.b.c0.e.i);
                this.b.c0.e.i.k.add(this.h);
            }
            q(this.b.e.h);
            q(this.b.e.i);
            return;
        }
        if (iA1 != -1) {
            this.h.l.add(this.b.c0.f.h);
            this.b.c0.f.h.k.add(this.h);
            this.h.f = iA1;
        } else if (iB1 != -1) {
            this.h.l.add(this.b.c0.f.i);
            this.b.c0.f.i.k.add(this.h);
            this.h.f = -iB1;
        } else {
            DependencyNode dependencyNode2 = this.h;
            dependencyNode2.b = true;
            dependencyNode2.l.add(this.b.c0.f.i);
            this.b.c0.f.i.k.add(this.h);
        }
        q(this.b.f.h);
        q(this.b.f.i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        if (((androidx.constraintlayout.core.widgets.f) this.b).z1() == 1) {
            this.b.t1(this.h.g);
        } else {
            this.b.u1(this.h.g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean m() {
        return false;
    }
}
