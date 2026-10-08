package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.gc5;
import com.google.inputmethod.hhe;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class g {
    public static hhe a(ConstraintWidget constraintWidget, int i, ArrayList<hhe> arrayList, hhe hheVar) {
        int iZ1;
        int i2 = i == 0 ? constraintWidget.S0 : constraintWidget.T0;
        if (i2 != -1 && (hheVar == null || i2 != hheVar.c())) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                hhe hheVar2 = arrayList.get(i3);
                if (hheVar2.c() == i2) {
                    if (hheVar != null) {
                        hheVar.g(i, hheVar2);
                        arrayList.remove(hheVar);
                    }
                    hheVar = hheVar2;
                    break;
                }
            }
        } else if (i2 != -1) {
            return hheVar;
        }
        if (hheVar == null) {
            if ((constraintWidget instanceof gc5) && (iZ1 = ((gc5) constraintWidget).z1(i)) != -1) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    hhe hheVar3 = arrayList.get(i4);
                    if (hheVar3.c() == iZ1) {
                        hheVar = hheVar3;
                        break;
                    }
                }
            }
            if (hheVar == null) {
                hheVar = new hhe(i);
            }
            arrayList.add(hheVar);
        }
        if (hheVar.a(constraintWidget)) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                fVar.y1().c(fVar.z1() == 0 ? 1 : 0, arrayList, hheVar);
            }
            if (i == 0) {
                constraintWidget.S0 = hheVar.c();
                constraintWidget.Q.c(i, arrayList, hheVar);
                constraintWidget.S.c(i, arrayList, hheVar);
            } else {
                constraintWidget.T0 = hheVar.c();
                constraintWidget.R.c(i, arrayList, hheVar);
                constraintWidget.U.c(i, arrayList, hheVar);
                constraintWidget.T.c(i, arrayList, hheVar);
            }
            constraintWidget.X.c(i, arrayList, hheVar);
        }
        return hheVar;
    }

    private static hhe b(ArrayList<hhe> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hhe hheVar = arrayList.get(i2);
            if (i == hheVar.c()) {
                return hheVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0349  */
    public static boolean c(androidx.constraintlayout.core.widgets.d dVar, b.InterfaceC0068b interfaceC0068b) {
        hhe hheVar;
        boolean z;
        hhe hheVar2;
        ArrayList<ConstraintWidget> arrayListZ1 = dVar.z1();
        int size = arrayListZ1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = arrayListZ1.get(i2);
            if (!d(dVar.C(), dVar.X(), constraintWidget.C(), constraintWidget.X()) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.e)) {
                return false;
            }
        }
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList<gc5> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<gc5> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i3 < size) {
            ConstraintWidget constraintWidget2 = arrayListZ1.get(i3);
            if (!d(dVar.C(), dVar.X(), constraintWidget2.C(), constraintWidget2.X())) {
                androidx.constraintlayout.core.widgets.d.b2(i, constraintWidget2, interfaceC0068b, dVar.z1, b.a.k);
            }
            boolean z2 = constraintWidget2 instanceof androidx.constraintlayout.core.widgets.f;
            if (z2) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget2;
                if (fVar.z1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(fVar);
                }
                if (fVar.z1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fVar);
                }
            }
            if (constraintWidget2 instanceof gc5) {
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a) {
                    androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) constraintWidget2;
                    if (aVar.E1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    if (aVar.E1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(aVar);
                    }
                } else {
                    gc5 gc5Var = (gc5) constraintWidget2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(gc5Var);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(gc5Var);
                }
            }
            if (constraintWidget2.Q.f == null && constraintWidget2.S.f == null && !z2 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(constraintWidget2);
            }
            if (constraintWidget2.R.f == null && constraintWidget2.T.f == null && constraintWidget2.U.f == null && !z2 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(constraintWidget2);
            }
            i3++;
            i = 0;
        }
        ArrayList<hhe> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((androidx.constraintlayout.core.widgets.f) it.next(), 0, arrayList7, null);
            }
        }
        hhe hheVar3 = null;
        int i4 = 0;
        if (arrayList2 != null) {
            for (gc5 gc5Var2 : arrayList2) {
                hhe hheVarA = a(gc5Var2, i4, arrayList7, hheVar3);
                gc5Var2.y1(arrayList7, i4, hheVarA);
                hheVarA.b(arrayList7);
                hheVar3 = null;
                i4 = 0;
            }
        }
        ConstraintAnchor constraintAnchorQ = dVar.q(ConstraintAnchor.Type.LEFT);
        if (constraintAnchorQ.d() != null) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorQ.d().iterator();
            while (it2.hasNext()) {
                a(it2.next().d, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ2 = dVar.q(ConstraintAnchor.Type.RIGHT);
        if (constraintAnchorQ2.d() != null) {
            Iterator<ConstraintAnchor> it3 = constraintAnchorQ2.d().iterator();
            while (it3.hasNext()) {
                a(it3.next().d, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ3 = dVar.q(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorQ3.d() != null) {
            Iterator<ConstraintAnchor> it4 = constraintAnchorQ3.d().iterator();
            while (it4.hasNext()) {
                a(it4.next().d, 0, arrayList7, null);
            }
        }
        hhe hheVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((ConstraintWidget) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((androidx.constraintlayout.core.widgets.f) it6.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            for (gc5 gc5Var3 : arrayList4) {
                hhe hheVarA2 = a(gc5Var3, i5, arrayList7, hheVar4);
                gc5Var3.y1(arrayList7, i5, hheVarA2);
                hheVarA2.b(arrayList7);
                hheVar4 = null;
                i5 = 1;
            }
        }
        ConstraintAnchor constraintAnchorQ4 = dVar.q(ConstraintAnchor.Type.TOP);
        if (constraintAnchorQ4.d() != null) {
            Iterator<ConstraintAnchor> it7 = constraintAnchorQ4.d().iterator();
            while (it7.hasNext()) {
                a(it7.next().d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ5 = dVar.q(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorQ5.d() != null) {
            Iterator<ConstraintAnchor> it8 = constraintAnchorQ5.d().iterator();
            while (it8.hasNext()) {
                a(it8.next().d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ6 = dVar.q(ConstraintAnchor.Type.BOTTOM);
        if (constraintAnchorQ6.d() != null) {
            Iterator<ConstraintAnchor> it9 = constraintAnchorQ6.d().iterator();
            while (it9.hasNext()) {
                a(it9.next().d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorQ7 = dVar.q(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorQ7.d() != null) {
            Iterator<ConstraintAnchor> it10 = constraintAnchorQ7.d().iterator();
            while (it10.hasNext()) {
                a(it10.next().d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((ConstraintWidget) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget3 = arrayListZ1.get(i6);
            if (constraintWidget3.w0()) {
                hhe hheVarB = b(arrayList7, constraintWidget3.S0);
                hhe hheVarB2 = b(arrayList7, constraintWidget3.T0);
                if (hheVarB != null && hheVarB2 != null) {
                    hheVarB.g(0, hheVarB2);
                    hheVarB2.i(2);
                    arrayList7.remove(hheVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (dVar.C() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            hheVar = null;
            int i7 = 0;
            for (hhe hheVar5 : arrayList7) {
                if (hheVar5.d() != 1) {
                    hheVar5.h(false);
                    int iF = hheVar5.f(dVar.T1(), 0);
                    if (iF > i7) {
                        hheVar = hheVar5;
                        i7 = iF;
                    }
                }
            }
            if (hheVar != null) {
                dVar.W0(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.r1(i7);
                hheVar.h(true);
            } else {
                hheVar = null;
            }
        } else {
            hheVar = null;
        }
        if (dVar.X() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            hhe hheVar6 = null;
            int i8 = 0;
            for (hhe hheVar7 : arrayList7) {
                if (hheVar7.d() != 0) {
                    hheVar7.h(false);
                    int iF2 = hheVar7.f(dVar.T1(), 1);
                    if (iF2 > i8) {
                        hheVar6 = hheVar7;
                        i8 = iF2;
                    }
                }
            }
            z = true;
            if (hheVar6 != null) {
                dVar.n1(ConstraintWidget.DimensionBehaviour.FIXED);
                dVar.S0(i8);
                hheVar6.h(true);
                hheVar2 = hheVar6;
            }
            if (hheVar == null || hheVar2 != null) {
                return z;
            }
            return false;
        }
        z = true;
        hheVar2 = null;
        if (hheVar == null) {
        }
        return z;
    }

    public static boolean d(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
