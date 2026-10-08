package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.o43;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class i extends WidgetRun {
    i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    private void q(DependencyNode dependencyNode) {
        this.h.k.add(dependencyNode);
        dependencyNode.l.add(this.h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, com.google.inputmethod.o43
    public void a(o43 o43Var) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.b;
        int iC1 = aVar.C1();
        Iterator<DependencyNode> it = this.h.l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iC1 == 0 || iC1 == 2) {
            this.h.d(i2 + aVar.D1());
        } else {
            this.h.d(i + aVar.D1());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            this.h.b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget;
            int iC1 = aVar.C1();
            boolean zB1 = aVar.B1();
            int i = 0;
            if (iC1 == 0) {
                this.h.e = DependencyNode.Type.LEFT;
                while (i < aVar.W0) {
                    ConstraintWidget constraintWidget2 = aVar.V0[i];
                    if (zB1 || constraintWidget2.Z() != 8) {
                        DependencyNode dependencyNode = constraintWidget2.e.h;
                        dependencyNode.k.add(this.h);
                        this.h.l.add(dependencyNode);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (iC1 == 1) {
                this.h.e = DependencyNode.Type.RIGHT;
                while (i < aVar.W0) {
                    ConstraintWidget constraintWidget3 = aVar.V0[i];
                    if (zB1 || constraintWidget3.Z() != 8) {
                        DependencyNode dependencyNode2 = constraintWidget3.e.i;
                        dependencyNode2.k.add(this.h);
                        this.h.l.add(dependencyNode2);
                    }
                    i++;
                }
                q(this.b.e.h);
                q(this.b.e.i);
                return;
            }
            if (iC1 == 2) {
                this.h.e = DependencyNode.Type.TOP;
                while (i < aVar.W0) {
                    ConstraintWidget constraintWidget4 = aVar.V0[i];
                    if (zB1 || constraintWidget4.Z() != 8) {
                        DependencyNode dependencyNode3 = constraintWidget4.f.h;
                        dependencyNode3.k.add(this.h);
                        this.h.l.add(dependencyNode3);
                    }
                    i++;
                }
                q(this.b.f.h);
                q(this.b.f.i);
                return;
            }
            if (iC1 != 3) {
                return;
            }
            this.h.e = DependencyNode.Type.BOTTOM;
            while (i < aVar.W0) {
                ConstraintWidget constraintWidget5 = aVar.V0[i];
                if (zB1 || constraintWidget5.Z() != 8) {
                    DependencyNode dependencyNode4 = constraintWidget5.f.i;
                    dependencyNode4.k.add(this.h);
                    this.h.l.add(dependencyNode4);
                }
                i++;
            }
            q(this.b.f.h);
            q(this.b.f.i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget = this.b;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            int iC1 = ((androidx.constraintlayout.core.widgets.a) constraintWidget).C1();
            if (iC1 == 0 || iC1 == 1) {
                this.b.t1(this.h.g);
            } else {
                this.b.u1(this.h.g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        this.h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean m() {
        return false;
    }
}
