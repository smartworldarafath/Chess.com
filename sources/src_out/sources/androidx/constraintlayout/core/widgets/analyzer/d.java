package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.gc5;
import com.google.inputmethod.o43;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class d {
    private androidx.constraintlayout.core.widgets.d a;
    private androidx.constraintlayout.core.widgets.d d;
    private boolean b = true;
    private boolean c = true;
    private ArrayList<WidgetRun> e = new ArrayList<>();
    private ArrayList<k> f = new ArrayList<>();
    private b.InterfaceC0068b g = null;
    private b.a h = new b.a();
    ArrayList<k> i = new ArrayList<>();

    public d(androidx.constraintlayout.core.widgets.d dVar) {
        this.a = dVar;
        this.d = dVar;
    }

    private void a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<k> arrayList, k kVar) {
        int i3;
        DependencyNode dependencyNode3;
        ArrayList<k> arrayList2;
        WidgetRun widgetRun = dependencyNode.d;
        if (widgetRun.c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.a;
            if (widgetRun == dVar.e || widgetRun == dVar.f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(widgetRun, i2);
                arrayList.add(kVar);
            }
            k kVar2 = kVar;
            widgetRun.c = kVar2;
            kVar2.a(widgetRun);
            for (o43 o43Var : widgetRun.h.k) {
                if (o43Var instanceof DependencyNode) {
                    i3 = i;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                    a((DependencyNode) o43Var, i3, 0, dependencyNode3, arrayList2, kVar2);
                } else {
                    i3 = i;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                }
                i = i3;
                dependencyNode2 = dependencyNode3;
                arrayList = arrayList2;
            }
            int i4 = i;
            DependencyNode dependencyNode4 = dependencyNode2;
            ArrayList<k> arrayList3 = arrayList;
            for (o43 o43Var2 : widgetRun.i.k) {
                if (o43Var2 instanceof DependencyNode) {
                    a((DependencyNode) o43Var2, i4, 1, dependencyNode4, arrayList3, kVar2);
                }
            }
            if (i4 == 1 && (widgetRun instanceof l)) {
                for (o43 o43Var3 : ((l) widgetRun).k.k) {
                    if (o43Var3 instanceof DependencyNode) {
                        a((DependencyNode) o43Var3, i4, 2, dependencyNode4, arrayList3, kVar2);
                    }
                }
            }
            for (DependencyNode dependencyNode5 : widgetRun.h.l) {
                if (dependencyNode5 == dependencyNode4) {
                    kVar2.b = true;
                }
                a(dependencyNode5, i4, 0, dependencyNode4, arrayList3, kVar2);
            }
            for (DependencyNode dependencyNode6 : widgetRun.i.l) {
                if (dependencyNode6 == dependencyNode4) {
                    kVar2.b = true;
                }
                a(dependencyNode6, i4, 1, dependencyNode4, arrayList3, kVar2);
            }
            if (i4 == 1 && (widgetRun instanceof l)) {
                Iterator<DependencyNode> it = ((l) widgetRun).k.l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i4, 2, dependencyNode4, arrayList3, kVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private boolean b(androidx.constraintlayout.core.widgets.d dVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i;
        char c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        for (ConstraintWidget constraintWidget : dVar.V0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.b0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (constraintWidget.Z() == 8) {
                constraintWidget.a = true;
            } else {
                if (constraintWidget.B < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.w = 2;
                }
                if (constraintWidget.E < 1.0f && dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.x = 2;
                }
                if (constraintWidget.x() > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour6 == dimensionBehaviour8 && (dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.w = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour8 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.x = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour8 && dimensionBehaviour7 == dimensionBehaviour8) {
                        if (constraintWidget.w == 0) {
                            constraintWidget.w = 3;
                        }
                        if (constraintWidget.x == 0) {
                            constraintWidget.x = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour6 == dimensionBehaviour9 && constraintWidget.w == 1 && (constraintWidget.Q.f == null || constraintWidget.S.f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour7 == dimensionBehaviour9 && constraintWidget.x == 1 && (constraintWidget.R.f == null || constraintWidget.T.f == null)) {
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                j jVar = constraintWidget.e;
                jVar.d = dimensionBehaviour6;
                int i2 = constraintWidget.w;
                jVar.a = i2;
                l lVar = constraintWidget.f;
                lVar.d = dimensionBehaviour7;
                int i3 = constraintWidget.x;
                lVar.a = i3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour6 == dimensionBehaviour10 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour7 == dimensionBehaviour10 || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour7;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviour6;
                    int iA0 = constraintWidget.a0();
                    if (dimensionBehaviour12 == dimensionBehaviour10) {
                        iA0 = (dVar.a0() - constraintWidget.Q.g) - constraintWidget.S.g;
                        dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i4 = iA0;
                    int iZ = constraintWidget.z();
                    if (dimensionBehaviour11 == dimensionBehaviour10) {
                        iZ = (dVar.z() - constraintWidget.R.g) - constraintWidget.T.g;
                        dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    l(constraintWidget, dimensionBehaviour12, i4, dimensionBehaviour11, iZ);
                    constraintWidget.e.e.d(constraintWidget.a0());
                    constraintWidget.f.e.d(constraintWidget.z());
                    constraintWidget.a = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        dimensionBehaviour2 = dimensionBehaviour9;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        c = 0;
                        if (dimensionBehaviour7 != dimensionBehaviour13 && dimensionBehaviour7 != ConstraintWidget.DimensionBehaviour.FIXED) {
                            dimensionBehaviour = dimensionBehaviour7;
                            i = 3;
                        } else if (i2 == 3) {
                            if (dimensionBehaviour7 == dimensionBehaviour13) {
                                l(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour13, 0);
                            }
                            int iZ2 = constraintWidget.z();
                            int i5 = (int) ((iZ2 * constraintWidget.f0) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            l(constraintWidget, dimensionBehaviour14, i5, dimensionBehaviour14, iZ2);
                            constraintWidget.e.e.d(constraintWidget.a0());
                            constraintWidget.f.e.d(constraintWidget.z());
                            constraintWidget.a = true;
                        } else if (i2 == 1) {
                            l(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour7, 0);
                            constraintWidget.e.e.m = constraintWidget.a0();
                        } else {
                            dimensionBehaviour = dimensionBehaviour7;
                            i = 3;
                            if (i2 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dVar.b0[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour15 == dimensionBehaviour16 || dimensionBehaviour15 == dimensionBehaviour10) {
                                    l(constraintWidget, dimensionBehaviour16, (int) ((constraintWidget.B * dVar.a0()) + 0.5f), dimensionBehaviour, constraintWidget.z());
                                    constraintWidget.e.e.d(constraintWidget.a0());
                                    constraintWidget.f.e.d(constraintWidget.z());
                                    constraintWidget.a = true;
                                }
                            } else {
                                ConstraintAnchor[] constraintAnchorArr = constraintWidget.Y;
                                if (constraintAnchorArr[0].f == null || constraintAnchorArr[1].f == null) {
                                    l(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour, 0);
                                    constraintWidget.e.e.d(constraintWidget.a0());
                                    constraintWidget.f.e.d(constraintWidget.z());
                                    constraintWidget.a = true;
                                } else if (dimensionBehaviour == dimensionBehaviour2 || !(dimensionBehaviour6 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                                    dimensionBehaviour3 = dimensionBehaviour6;
                                    if (dimensionBehaviour3 != dimensionBehaviour2 && dimensionBehaviour == dimensionBehaviour2) {
                                        if (i2 == 1 || i3 == 1) {
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                            l(constraintWidget, dimensionBehaviour17, 0, dimensionBehaviour17, 0);
                                            constraintWidget.e.e.m = constraintWidget.a0();
                                            constraintWidget.f.e.m = constraintWidget.z();
                                        } else if (i3 == 2 && i2 == 2) {
                                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.b0;
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr2[c];
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                                            if (dimensionBehaviour18 == dimensionBehaviour19 && dimensionBehaviourArr2[1] == dimensionBehaviour19) {
                                                l(constraintWidget, dimensionBehaviour19, (int) ((constraintWidget.B * dVar.a0()) + 0.5f), dimensionBehaviour19, (int) ((constraintWidget.E * dVar.z()) + 0.5f));
                                                constraintWidget.e.e.d(constraintWidget.a0());
                                                constraintWidget.f.e.d(constraintWidget.z());
                                                constraintWidget.a = true;
                                            }
                                        }
                                    }
                                } else if (i3 == i) {
                                    if (dimensionBehaviour6 == dimensionBehaviour4) {
                                        l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                                    }
                                    int iA1 = constraintWidget.a0();
                                    float f = constraintWidget.f0;
                                    if (constraintWidget.y() == -1) {
                                        f = 1.0f / f;
                                    }
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.FIXED;
                                    l(constraintWidget, dimensionBehaviour20, iA1, dimensionBehaviour20, (int) ((iA1 * f) + 0.5f));
                                    constraintWidget.e.e.d(constraintWidget.a0());
                                    constraintWidget.f.e.d(constraintWidget.z());
                                    constraintWidget.a = true;
                                } else if (i3 == 1) {
                                    l(constraintWidget, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                                    constraintWidget.f.e.m = constraintWidget.z();
                                } else {
                                    dimensionBehaviour3 = dimensionBehaviour6;
                                    if (i3 == 2) {
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dVar.b0[1];
                                        dimensionBehaviour5 = dimensionBehaviour;
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.FIXED;
                                        if (dimensionBehaviour21 == dimensionBehaviour22 || dimensionBehaviour21 == dimensionBehaviour10) {
                                            l(constraintWidget, dimensionBehaviour3, constraintWidget.a0(), dimensionBehaviour22, (int) ((constraintWidget.E * dVar.z()) + 0.5f));
                                            constraintWidget.e.e.d(constraintWidget.a0());
                                            constraintWidget.f.e.d(constraintWidget.z());
                                            constraintWidget.a = true;
                                        } else {
                                            dimensionBehaviour = dimensionBehaviour5;
                                            if (dimensionBehaviour3 != dimensionBehaviour2) {
                                            }
                                        }
                                    } else {
                                        dimensionBehaviour5 = dimensionBehaviour;
                                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.Y;
                                        if (constraintAnchorArr2[2].f == null || constraintAnchorArr2[i].f == null) {
                                            l(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour5, 0);
                                            constraintWidget.e.e.d(constraintWidget.a0());
                                            constraintWidget.f.e.d(constraintWidget.z());
                                            constraintWidget.a = true;
                                        } else {
                                            dimensionBehaviour = dimensionBehaviour5;
                                            if (dimensionBehaviour3 != dimensionBehaviour2) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        dimensionBehaviour = dimensionBehaviour7;
                        i = 3;
                        c = 0;
                        dimensionBehaviour2 = dimensionBehaviour9;
                    }
                    if (dimensionBehaviour == dimensionBehaviour2) {
                    }
                    dimensionBehaviour3 = dimensionBehaviour6;
                    if (dimensionBehaviour3 != dimensionBehaviour2) {
                    }
                }
            }
        }
        return false;
    }

    private int e(androidx.constraintlayout.core.widgets.d dVar, int i) {
        int size = this.i.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.i.get(i2).b(dVar, i));
        }
        return (int) jMax;
    }

    private void i(WidgetRun widgetRun, int i, ArrayList<k> arrayList) {
        for (o43 o43Var : widgetRun.h.k) {
            if (o43Var instanceof DependencyNode) {
                a((DependencyNode) o43Var, i, 0, widgetRun.i, arrayList, null);
            } else if (o43Var instanceof WidgetRun) {
                a(((WidgetRun) o43Var).h, i, 0, widgetRun.i, arrayList, null);
            }
        }
        for (o43 o43Var2 : widgetRun.i.k) {
            if (o43Var2 instanceof DependencyNode) {
                a((DependencyNode) o43Var2, i, 1, widgetRun.h, arrayList, null);
            } else if (o43Var2 instanceof WidgetRun) {
                a(((WidgetRun) o43Var2).i, i, 1, widgetRun.h, arrayList, null);
            }
        }
        int i2 = i;
        if (i2 == 1) {
            for (o43 o43Var3 : ((l) widgetRun).k.k) {
                if (o43Var3 instanceof DependencyNode) {
                    a((DependencyNode) o43Var3, i2, 2, null, arrayList, null);
                }
                i2 = i;
            }
        }
    }

    private void l(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        b.a aVar = this.h;
        aVar.a = dimensionBehaviour;
        aVar.b = dimensionBehaviour2;
        aVar.c = i;
        aVar.d = i2;
        this.g.b(constraintWidget, aVar);
        constraintWidget.r1(this.h.e);
        constraintWidget.S0(this.h.f);
        constraintWidget.R0(this.h.h);
        constraintWidget.H0(this.h.g);
    }

    public void c() {
        d(this.e);
        this.i.clear();
        k.h = 0;
        i(this.a.e, 0, this.i);
        i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : this.d.V0) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                arrayList.add(new h(constraintWidget));
            } else {
                if (constraintWidget.m0()) {
                    if (constraintWidget.c == null) {
                        constraintWidget.c = new c(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.c);
                } else {
                    arrayList.add(constraintWidget.e);
                }
                if (constraintWidget.o0()) {
                    if (constraintWidget.d == null) {
                        constraintWidget.d = new c(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.d);
                } else {
                    arrayList.add(constraintWidget.f);
                }
                if (constraintWidget instanceof gc5) {
                    arrayList.add(new i(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.b != this.d) {
                widgetRun.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.b || this.c) {
            for (ConstraintWidget constraintWidget : this.a.V0) {
                constraintWidget.p();
                constraintWidget.a = false;
                constraintWidget.e.r();
                constraintWidget.f.q();
            }
            this.a.p();
            androidx.constraintlayout.core.widgets.d dVar = this.a;
            dVar.a = false;
            dVar.e.r();
            this.a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.t1(0);
        this.a.u1(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourW = this.a.w(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = this.a.w(1);
        if (this.b) {
            c();
        }
        int iB0 = this.a.b0();
        int iC0 = this.a.c0();
        this.a.e.h.d(iB0);
        this.a.f.h.d(iC0);
        m();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviourW == dimensionBehaviour || dimensionBehaviourW2 == dimensionBehaviour) {
            if (z) {
                Iterator<WidgetRun> it = this.e.iterator();
                while (it.hasNext()) {
                    if (!it.next().m()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviourW == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.a.W0(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar2 = this.a;
                dVar2.r1(e(dVar2, 0));
                androidx.constraintlayout.core.widgets.d dVar3 = this.a;
                dVar3.e.e.d(dVar3.a0());
            }
            if (z && dimensionBehaviourW2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.a.n1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar4 = this.a;
                dVar4.S0(e(dVar4, 1));
                androidx.constraintlayout.core.widgets.d dVar5 = this.a;
                dVar5.f.e.d(dVar5.z());
            }
        }
        androidx.constraintlayout.core.widgets.d dVar6 = this.a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar6.b0[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int iA0 = dVar6.a0() + iB0;
            this.a.e.i.d(iA0);
            this.a.e.e.d(iA0 - iB0);
            m();
            androidx.constraintlayout.core.widgets.d dVar7 = this.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dVar7.b0[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iZ = dVar7.z() + iC0;
                this.a.f.i.d(iZ);
                this.a.f.e.d(iZ - iC0);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        for (WidgetRun widgetRun : this.e) {
            if (widgetRun.b != this.a || widgetRun.g) {
                widgetRun.e();
            }
        }
        for (WidgetRun widgetRun2 : this.e) {
            if (z2 || widgetRun2.b != this.a) {
                if (!widgetRun2.h.j || ((!widgetRun2.i.j && !(widgetRun2 instanceof h)) || (!widgetRun2.e.j && !(widgetRun2 instanceof c) && !(widgetRun2 instanceof h)))) {
                    this.a.W0(dimensionBehaviourW);
                    this.a.n1(dimensionBehaviourW2);
                    return z3;
                }
            }
        }
        z3 = true;
        this.a.W0(dimensionBehaviourW);
        this.a.n1(dimensionBehaviourW2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            for (ConstraintWidget constraintWidget : this.a.V0) {
                constraintWidget.p();
                constraintWidget.a = false;
                j jVar = constraintWidget.e;
                jVar.e.j = false;
                jVar.g = false;
                jVar.r();
                l lVar = constraintWidget.f;
                lVar.e.j = false;
                lVar.g = false;
                lVar.q();
            }
            this.a.p();
            androidx.constraintlayout.core.widgets.d dVar = this.a;
            dVar.a = false;
            j jVar2 = dVar.e;
            jVar2.e.j = false;
            jVar2.g = false;
            jVar2.r();
            l lVar2 = this.a.f;
            lVar2.e.j = false;
            lVar2.g = false;
            lVar2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.t1(0);
        this.a.u1(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    public boolean h(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourW = this.a.w(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourW2 = this.a.w(1);
        int iB0 = this.a.b0();
        int iC0 = this.a.c0();
        if (z && (dimensionBehaviourW == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourW2 == dimensionBehaviour)) {
            for (WidgetRun widgetRun : this.e) {
                if (widgetRun.f == i && !widgetRun.m()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviourW == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.a.W0(ConstraintWidget.DimensionBehaviour.FIXED);
                    androidx.constraintlayout.core.widgets.d dVar = this.a;
                    dVar.r1(e(dVar, 0));
                    androidx.constraintlayout.core.widgets.d dVar2 = this.a;
                    dVar2.e.e.d(dVar2.a0());
                }
            } else if (z && dimensionBehaviourW2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.a.n1(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.d dVar3 = this.a;
                dVar3.S0(e(dVar3, 1));
                androidx.constraintlayout.core.widgets.d dVar4 = this.a;
                dVar4.f.e.d(dVar4.z());
            }
        }
        if (i == 0) {
            androidx.constraintlayout.core.widgets.d dVar5 = this.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dVar5.b0[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iA0 = dVar5.a0() + iB0;
                this.a.e.i.d(iA0);
                this.a.e.e.d(iA0 - iB0);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            androidx.constraintlayout.core.widgets.d dVar6 = this.a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dVar6.b0[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iZ = dVar6.z() + iC0;
                this.a.f.i.d(iZ);
                this.a.f.e.d(iZ - iC0);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        m();
        for (WidgetRun widgetRun2 : this.e) {
            if (widgetRun2.f == i && (widgetRun2.b != this.a || widgetRun2.g)) {
                widgetRun2.e();
            }
        }
        for (WidgetRun widgetRun3 : this.e) {
            if (widgetRun3.f == i && (z2 || widgetRun3.b != this.a)) {
                if (!widgetRun3.h.j || !widgetRun3.i.j || (!(widgetRun3 instanceof c) && !widgetRun3.e.j)) {
                    this.a.W0(dimensionBehaviourW);
                    this.a.n1(dimensionBehaviourW2);
                    return z3;
                }
            }
        }
        z3 = true;
        this.a.W0(dimensionBehaviourW);
        this.a.n1(dimensionBehaviourW2);
        return z3;
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public void m() {
        e eVar;
        for (ConstraintWidget constraintWidget : this.a.V0) {
            if (!constraintWidget.a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.b0;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.w;
                int i2 = constraintWidget.x;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                e eVar2 = constraintWidget.e.e;
                boolean z3 = eVar2.j;
                e eVar3 = constraintWidget.f.e;
                boolean z4 = eVar3.j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    l(constraintWidget, dimensionBehaviour4, eVar2.g, dimensionBehaviour4, eVar3.g);
                    constraintWidget.a = true;
                } else if (z3 && z) {
                    l(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, eVar2.g, dimensionBehaviour3, eVar3.g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f.e.m = constraintWidget.z();
                    } else {
                        constraintWidget.f.e.d(constraintWidget.z());
                        constraintWidget.a = true;
                    }
                } else if (z4 && z2) {
                    l(constraintWidget, dimensionBehaviour3, eVar2.g, ConstraintWidget.DimensionBehaviour.FIXED, eVar3.g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.e.e.m = constraintWidget.a0();
                    } else {
                        constraintWidget.e.e.d(constraintWidget.a0());
                        constraintWidget.a = true;
                    }
                }
                if (constraintWidget.a && (eVar = constraintWidget.f.l) != null) {
                    eVar.d(constraintWidget.r());
                }
            }
        }
    }

    public void n(b.InterfaceC0068b interfaceC0068b) {
        this.g = interfaceC0068b;
    }
}
