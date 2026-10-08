package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.google.inputmethod.o43;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class c extends WidgetRun {
    ArrayList<WidgetRun> k;
    private int l;

    public c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.k = new ArrayList<>();
        this.f = i;
        q();
    }

    private void q() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.b;
        ConstraintWidget constraintWidgetO = constraintWidget2.O(this.f);
        while (true) {
            ConstraintWidget constraintWidget3 = constraintWidgetO;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                constraintWidgetO = constraintWidget2.O(this.f);
            }
        }
        this.b = constraintWidget;
        this.k.add(constraintWidget.Q(this.f));
        ConstraintWidget constraintWidgetM = constraintWidget.M(this.f);
        while (constraintWidgetM != null) {
            this.k.add(constraintWidgetM.Q(this.f));
            constraintWidgetM = constraintWidgetM.M(this.f);
        }
        for (WidgetRun widgetRun : this.k) {
            int i = this.f;
            if (i == 0) {
                widgetRun.b.c = this;
            } else if (i == 1) {
                widgetRun.b.d = this;
            }
        }
        if (this.f == 0 && ((androidx.constraintlayout.core.widgets.d) this.b.N()).Y1() && this.k.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.k;
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        this.l = this.f == 0 ? this.b.B() : this.b.W();
    }

    private ConstraintWidget r() {
        for (int i = 0; i < this.k.size(); i++) {
            WidgetRun widgetRun = this.k.get(i);
            if (widgetRun.b.Z() != 8) {
                return widgetRun.b;
            }
        }
        return null;
    }

    private ConstraintWidget s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.k.get(size);
            if (widgetRun.b.Z() != 8) {
                return widgetRun.b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, com.google.inputmethod.o43
    public void a(o43 o43Var) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        if (this.h.j && this.i.j) {
            ConstraintWidget constraintWidgetN = this.b.N();
            boolean zY1 = constraintWidgetN instanceof androidx.constraintlayout.core.widgets.d ? ((androidx.constraintlayout.core.widgets.d) constraintWidgetN).Y1() : false;
            int i11 = this.i.g - this.h.g;
            int size = this.k.size();
            int i12 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i12 >= size) {
                    i12 = -1;
                    break;
                } else if (this.k.get(i12).b.Z() != 8) {
                    break;
                } else {
                    i12++;
                }
            }
            int i13 = size - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                if (this.k.get(i14).b.Z() != 8) {
                    i = i14;
                    break;
                }
            }
            int i15 = 0;
            while (true) {
                if (i15 >= 2) {
                    z = zY1;
                    f = 0.0f;
                    f2 = 0.0f;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    break;
                }
                int i16 = 0;
                i4 = 0;
                i5 = 0;
                int i17 = 0;
                f2 = 0.0f;
                while (i16 < size) {
                    WidgetRun widgetRun = this.k.get(i16);
                    if (widgetRun.b.Z() == i2) {
                        z2 = zY1;
                    } else {
                        i17++;
                        if (i16 > 0 && i16 >= i12) {
                            i4 += widgetRun.h.f;
                        }
                        e eVar = widgetRun.e;
                        int i18 = eVar.g;
                        boolean z3 = widgetRun.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z3) {
                            int i19 = this.f;
                            if (i19 == 0 && !widgetRun.b.e.e.j) {
                                return;
                            }
                            if (i19 == 1 && !widgetRun.b.f.e.j) {
                                return;
                            } else {
                                z2 = zY1;
                            }
                        } else {
                            z2 = zY1;
                            if (widgetRun.a == 1 && i15 == 0) {
                                i18 = eVar.m;
                                i5++;
                            } else if (eVar.j) {
                            }
                            z3 = true;
                        }
                        if (z3) {
                            i4 += i18;
                        } else {
                            i5++;
                            float f4 = widgetRun.b.N0[this.f];
                            if (f4 >= 0.0f) {
                                f2 += f4;
                            }
                        }
                        if (i16 < i13 && i16 < i) {
                            i4 += -widgetRun.i.f;
                        }
                    }
                    i16++;
                    zY1 = z2;
                    i2 = 8;
                }
                z = zY1;
                f = 0.0f;
                if (i4 < i11 || i5 == 0) {
                    i3 = i17;
                    break;
                } else {
                    i15++;
                    zY1 = z;
                    i2 = 8;
                }
            }
            int i20 = this.h.g;
            if (z) {
                i20 = this.i.g;
            }
            float f5 = 0.5f;
            if (i4 > i11) {
                i20 = z ? i20 + ((int) (((i4 - i11) / 2.0f) + 0.5f)) : i20 - ((int) (((i4 - i11) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f6 = i11 - i4;
                int i21 = (int) ((f6 / i5) + 0.5f);
                int i22 = 0;
                int i23 = 0;
                while (i22 < size) {
                    WidgetRun widgetRun2 = this.k.get(i22);
                    float f7 = f5;
                    int i24 = i20;
                    if (widgetRun2.b.Z() != 8 && widgetRun2.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        e eVar2 = widgetRun2.e;
                        if (eVar2.j) {
                            i21 = i21;
                            i23 = i23;
                        } else {
                            int i25 = f2 > f ? (int) (((widgetRun2.b.N0[this.f] * f6) / f2) + f7) : i21;
                            if (this.f == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.b;
                                i9 = constraintWidget.A;
                                i10 = constraintWidget.z;
                            } else {
                                ConstraintWidget constraintWidget2 = widgetRun2.b;
                                i9 = constraintWidget2.D;
                                i10 = constraintWidget2.C;
                            }
                            int i26 = i23;
                            int iMax = Math.max(i10, widgetRun2.a == 1 ? Math.min(i25, eVar2.m) : i25);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i25) {
                                i23 = i26 + 1;
                                i25 = iMax;
                            } else {
                                i23 = i26;
                            }
                            widgetRun2.e.d(i25);
                        }
                    } else {
                        i21 = i21;
                        i23 = i23;
                    }
                    i22++;
                    f5 = f7;
                    i20 = i24;
                    f6 = f6;
                    i21 = i21;
                }
                i6 = i20;
                f3 = f5;
                int i27 = i23;
                if (i27 > 0) {
                    i5 -= i27;
                    i4 = 0;
                    for (int i28 = 0; i28 < size; i28++) {
                        WidgetRun widgetRun3 = this.k.get(i28);
                        if (widgetRun3.b.Z() != 8) {
                            if (i28 > 0 && i28 >= i12) {
                                i4 += widgetRun3.h.f;
                            }
                            i4 += widgetRun3.e.g;
                            if (i28 < i13 && i28 < i) {
                                i4 += -widgetRun3.i.f;
                            }
                        }
                    }
                }
                i8 = 2;
                if (this.l == 2 && i27 == 0) {
                    i7 = 0;
                    this.l = 0;
                } else {
                    i7 = 0;
                }
            } else {
                i6 = i20;
                f3 = 0.5f;
                i7 = 0;
                i8 = 2;
            }
            if (i4 > i11) {
                this.l = i8;
            }
            if (i3 > 0 && i5 == 0 && i12 == i) {
                this.l = i8;
            }
            int i29 = this.l;
            if (i29 == 1) {
                int i30 = i3 > 1 ? (i11 - i4) / (i3 - 1) : i3 == 1 ? (i11 - i4) / 2 : i7;
                if (i5 > 0) {
                    i30 = i7;
                }
                int i31 = i6;
                while (i7 < size) {
                    WidgetRun widgetRun4 = this.k.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun4.b.Z() == 8) {
                        widgetRun4.h.d(i31);
                        widgetRun4.i.d(i31);
                    } else {
                        if (i7 > 0) {
                            i31 = z ? i31 - i30 : i31 + i30;
                        }
                        if (i7 > 0 && i7 >= i12) {
                            i31 = z ? i31 - widgetRun4.h.f : i31 + widgetRun4.h.f;
                        }
                        if (z) {
                            widgetRun4.i.d(i31);
                        } else {
                            widgetRun4.h.d(i31);
                        }
                        e eVar3 = widgetRun4.e;
                        int i32 = eVar3.g;
                        if (widgetRun4.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.a == 1) {
                            i32 = eVar3.m;
                        }
                        i31 = z ? i31 - i32 : i31 + i32;
                        if (z) {
                            widgetRun4.h.d(i31);
                        } else {
                            widgetRun4.i.d(i31);
                        }
                        widgetRun4.g = true;
                        if (i7 < i13 && i7 < i) {
                            i31 = z ? i31 - (-widgetRun4.i.f) : i31 + (-widgetRun4.i.f);
                        }
                    }
                    i7++;
                }
                return;
            }
            if (i29 == 0) {
                int i33 = (i11 - i4) / (i3 + 1);
                if (i5 > 0) {
                    i33 = i7;
                }
                int i34 = i6;
                while (i7 < size) {
                    WidgetRun widgetRun5 = this.k.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun5.b.Z() == 8) {
                        widgetRun5.h.d(i34);
                        widgetRun5.i.d(i34);
                    } else {
                        int i35 = z ? i34 - i33 : i34 + i33;
                        if (i7 > 0 && i7 >= i12) {
                            i35 = z ? i35 - widgetRun5.h.f : i35 + widgetRun5.h.f;
                        }
                        if (z) {
                            widgetRun5.i.d(i35);
                        } else {
                            widgetRun5.h.d(i35);
                        }
                        e eVar4 = widgetRun5.e;
                        int iMin = eVar4.g;
                        if (widgetRun5.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.a == 1) {
                            iMin = Math.min(iMin, eVar4.m);
                        }
                        i34 = z ? i35 - iMin : i35 + iMin;
                        if (z) {
                            widgetRun5.h.d(i34);
                        } else {
                            widgetRun5.i.d(i34);
                        }
                        if (i7 < i13 && i7 < i) {
                            i34 = z ? i34 - (-widgetRun5.i.f) : i34 + (-widgetRun5.i.f);
                        }
                    }
                    i7++;
                }
                return;
            }
            if (i29 == 2) {
                float fA = this.f == 0 ? this.b.A() : this.b.V();
                if (z) {
                    fA = 1.0f - fA;
                }
                int i36 = (int) (((i11 - i4) * fA) + f3);
                if (i36 < 0 || i5 > 0) {
                    i36 = i7;
                }
                int i37 = z ? i6 - i36 : i6 + i36;
                while (i7 < size) {
                    WidgetRun widgetRun6 = this.k.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun6.b.Z() == 8) {
                        widgetRun6.h.d(i37);
                        widgetRun6.i.d(i37);
                    } else {
                        if (i7 > 0 && i7 >= i12) {
                            i37 = z ? i37 - widgetRun6.h.f : i37 + widgetRun6.h.f;
                        }
                        if (z) {
                            widgetRun6.i.d(i37);
                        } else {
                            widgetRun6.h.d(i37);
                        }
                        e eVar5 = widgetRun6.e;
                        int i38 = eVar5.g;
                        if (widgetRun6.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.a == 1) {
                            i38 = eVar5.m;
                        }
                        i37 = z ? i37 - i38 : i37 + i38;
                        if (z) {
                            widgetRun6.h.d(i37);
                        } else {
                            widgetRun6.i.d(i37);
                        }
                        if (i7 < i13 && i7 < i) {
                            i37 = z ? i37 - (-widgetRun6.i.f) : i37 + (-widgetRun6.i.f);
                        }
                    }
                    i7++;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.k.get(0).b;
        ConstraintWidget constraintWidget2 = this.k.get(size - 1).b;
        if (this.f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.Q;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.S;
            DependencyNode dependencyNodeI = i(constraintAnchor, 0);
            int iF = constraintAnchor.f();
            ConstraintWidget constraintWidgetR = r();
            if (constraintWidgetR != null) {
                iF = constraintWidgetR.Q.f();
            }
            if (dependencyNodeI != null) {
                b(this.h, dependencyNodeI, iF);
            }
            DependencyNode dependencyNodeI2 = i(constraintAnchor2, 0);
            int iF2 = constraintAnchor2.f();
            ConstraintWidget constraintWidgetS = s();
            if (constraintWidgetS != null) {
                iF2 = constraintWidgetS.S.f();
            }
            if (dependencyNodeI2 != null) {
                b(this.i, dependencyNodeI2, -iF2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.R;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.T;
            DependencyNode dependencyNodeI3 = i(constraintAnchor3, 1);
            int iF3 = constraintAnchor3.f();
            ConstraintWidget constraintWidgetR2 = r();
            if (constraintWidgetR2 != null) {
                iF3 = constraintWidgetR2.R.f();
            }
            if (dependencyNodeI3 != null) {
                b(this.h, dependencyNodeI3, iF3);
            }
            DependencyNode dependencyNodeI4 = i(constraintAnchor4, 1);
            int iF4 = constraintAnchor4.f();
            ConstraintWidget constraintWidgetS2 = s();
            if (constraintWidgetS2 != null) {
                iF4 = constraintWidgetS2.T.f();
            }
            if (dependencyNodeI4 != null) {
                b(this.i, dependencyNodeI4, -iF4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        Iterator<WidgetRun> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.k.get(i);
            j = j + ((long) widgetRun.h.f) + widgetRun.j() + ((long) widgetRun.i.f);
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.k) {
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }
}
