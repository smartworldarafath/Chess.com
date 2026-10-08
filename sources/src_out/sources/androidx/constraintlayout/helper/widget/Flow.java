package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.google.inputmethod.cce;
import com.google.inputmethod.gc5;
import com.google.inputmethod.v0a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class Flow extends cce {
    private e l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.inputmethod.cce, androidx.constraintlayout.widget.a
    protected void o(AttributeSet attributeSet) {
        super.o(attributeSet);
        this.l = new e();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v0a.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == v0a.W0) {
                    this.l.K2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.X0) {
                    this.l.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.h1) {
                    this.l.U1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.i1) {
                    this.l.R1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.Y0) {
                    this.l.S1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.Z0) {
                    this.l.V1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.a1) {
                    this.l.T1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.b1) {
                    this.l.Q1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.H1) {
                    this.l.P2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.x1) {
                    this.l.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.G1) {
                    this.l.O2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.r1) {
                    this.l.y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.z1) {
                    this.l.G2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.t1) {
                    this.l.A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.B1) {
                    this.l.I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == v0a.v1) {
                    this.l.C2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == v0a.q1) {
                    this.l.x2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == v0a.y1) {
                    this.l.F2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == v0a.s1) {
                    this.l.z2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == v0a.A1) {
                    this.l.H2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == v0a.E1) {
                    this.l.M2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == v0a.u1) {
                    this.l.B2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == v0a.D1) {
                    this.l.L2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == v0a.w1) {
                    this.l.D2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.F1) {
                    this.l.N2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == v0a.C1) {
                    this.l.J2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.l;
        w();
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    protected void onMeasure(int i, int i2) {
        x(this.l, i, i2);
    }

    @Override // androidx.constraintlayout.widget.a
    public void p(c.a aVar, gc5 gc5Var, ConstraintLayout.b bVar, SparseArray<ConstraintWidget> sparseArray) {
        super.p(aVar, gc5Var, bVar, sparseArray);
        if (gc5Var instanceof e) {
            e eVar = (e) gc5Var;
            int i = bVar.Z;
            if (i != -1) {
                eVar.K2(i);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public void q(ConstraintWidget constraintWidget, boolean z) {
        this.l.A1(z);
    }

    public void setFirstHorizontalBias(float f) {
        this.l.x2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.l.y2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.l.z2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.l.A2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.l.B2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.l.C2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.l.D2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.l.E2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.l.F2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.l.G2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.l.H2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.l.I2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.l.J2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.l.K2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.l.P1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.l.Q1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.l.S1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.l.T1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.l.V1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.l.L2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.l.M2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.l.N2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.l.O2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.l.P2(i);
        requestLayout();
    }

    @Override // com.google.inputmethod.cce
    public void x(i iVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (iVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            iVar.J1(mode, size, mode2, size2);
            setMeasuredDimension(iVar.E1(), iVar.D1());
        }
    }
}
