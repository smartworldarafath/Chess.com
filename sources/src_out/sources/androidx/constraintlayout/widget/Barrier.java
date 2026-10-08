package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.gc5;
import com.google.inputmethod.v0a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class Barrier extends a {
    private int j;
    private int k;
    private androidx.constraintlayout.core.widgets.a l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void x(ConstraintWidget constraintWidget, int i, boolean z) {
        this.k = i;
        if (z) {
            int i2 = this.j;
            if (i2 == 5) {
                this.k = 1;
            } else if (i2 == 6) {
                this.k = 0;
            }
        } else {
            int i3 = this.j;
            if (i3 == 5) {
                this.k = 0;
            } else if (i3 == 6) {
                this.k = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).H1(this.k);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.l.B1();
    }

    public int getMargin() {
        return this.l.D1();
    }

    public int getType() {
        return this.j;
    }

    @Override // androidx.constraintlayout.widget.a
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.l = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v0a.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == v0a.l1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.k1) {
                    this.l.G1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == v0a.m1) {
                    this.l.I1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.l;
        w();
    }

    @Override // androidx.constraintlayout.widget.a
    public void p(c.a aVar, gc5 gc5Var, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        super.p(aVar, gc5Var, bVar, sparseArray);
        if (gc5Var instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar2 = (androidx.constraintlayout.core.widgets.a) gc5Var;
            x(aVar2, aVar.e.h0, ((androidx.constraintlayout.core.widgets.d) gc5Var.N()).Y1());
            aVar2.G1(aVar.e.p0);
            aVar2.I1(aVar.e.i0);
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public void q(ConstraintWidget constraintWidget, boolean z) {
        x(constraintWidget, this.j, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.l.G1(z);
    }

    public void setDpMargin(int i) {
        this.l.I1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.l.I1(i);
    }

    public void setType(int i) {
        this.j = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
