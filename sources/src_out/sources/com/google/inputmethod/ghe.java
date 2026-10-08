package com.google.inputmethod;

import androidx.constraintlayout.core.c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class ghe extends ConstraintWidget {
    public ArrayList<ConstraintWidget> V0;

    public ghe() {
        this.V0 = new ArrayList<>();
    }

    public void A1() {
        ArrayList<ConstraintWidget> arrayList = this.V0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.V0.get(i);
            if (constraintWidget instanceof ghe) {
                ((ghe) constraintWidget).A1();
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void B0(c cVar) {
        super.B0(cVar);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            this.V0.get(i).B0(cVar);
        }
    }

    public void B1(ConstraintWidget constraintWidget) {
        this.V0.remove(constraintWidget);
        constraintWidget.x0();
    }

    public void C1() {
        this.V0.clear();
    }

    public void a(ConstraintWidget constraintWidget) {
        this.V0.add(constraintWidget);
        if (constraintWidget.N() != null) {
            ((ghe) constraintWidget.N()).B1(constraintWidget);
        }
        constraintWidget.j1(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void x0() {
        this.V0.clear();
        super.x0();
    }

    public void y1(ConstraintWidget... constraintWidgetArr) {
        for (ConstraintWidget constraintWidget : constraintWidgetArr) {
            a(constraintWidget);
        }
    }

    public ArrayList<ConstraintWidget> z1() {
        return this.V0;
    }

    public ghe(int i, int i2) {
        super(i, i2);
        this.V0 = new ArrayList<>();
    }
}
