package com.google.inputmethod;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class hhe {
    static int g;
    int b;
    int d;
    ArrayList<ConstraintWidget> a = new ArrayList<>();
    boolean c = false;
    ArrayList<a> e = null;
    private int f = -1;

    static class a {
        WeakReference<ConstraintWidget> a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        a(ConstraintWidget constraintWidget, d dVar, int i) {
            this.a = new WeakReference<>(constraintWidget);
            this.b = dVar.y(constraintWidget.Q);
            this.c = dVar.y(constraintWidget.R);
            this.d = dVar.y(constraintWidget.S);
            this.e = dVar.y(constraintWidget.T);
            this.f = dVar.y(constraintWidget.U);
            this.g = i;
        }
    }

    public hhe(int i) {
        int i2 = g;
        g = i2 + 1;
        this.b = i2;
        this.d = i;
    }

    private String e() {
        int i = this.d;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    private int j(d dVar, ArrayList<ConstraintWidget> arrayList, int i) {
        int iY;
        int iY2;
        androidx.constraintlayout.core.widgets.d dVar2 = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).N();
        dVar.E();
        dVar2.g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(dVar, false);
        }
        if (i == 0 && dVar2.g1 > 0) {
            b.b(dVar2, dVar, arrayList, 0);
        }
        if (i == 1 && dVar2.h1 > 0) {
            b.b(dVar2, dVar, arrayList, 1);
        }
        try {
            dVar.A();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new a(arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            iY = dVar.y(dVar2.Q);
            iY2 = dVar.y(dVar2.S);
            dVar.E();
        } else {
            iY = dVar.y(dVar2.R);
            iY2 = dVar.y(dVar2.T);
            dVar.E();
        }
        return iY2 - iY;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.a.contains(constraintWidget)) {
            return false;
        }
        this.a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList<hhe> arrayList) {
        int size = this.a.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                hhe hheVar = arrayList.get(i);
                if (this.f == hheVar.b) {
                    g(this.d, hheVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }

    public int f(d dVar, int i) {
        if (this.a.size() == 0) {
            return 0;
        }
        return j(dVar, this.a, i);
    }

    public void g(int i, hhe hheVar) {
        for (ConstraintWidget constraintWidget : this.a) {
            hheVar.a(constraintWidget);
            if (i == 0) {
                constraintWidget.S0 = hheVar.c();
            } else {
                constraintWidget.T0 = hheVar.c();
            }
        }
        this.f = hheVar.b;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(int i) {
        this.d = i;
    }

    public String toString() {
        String str = e() + " [" + this.b + "] <";
        Iterator<ConstraintWidget> it = this.a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().v();
        }
        return str + " >";
    }
}
