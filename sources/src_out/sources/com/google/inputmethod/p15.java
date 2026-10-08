package com.google.inputmethod;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.i;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class p15 extends i {
    private int[][] B1;
    private int C1;
    private int[][] D1;
    d k1;
    private ConstraintWidget[] l1;
    private int n1;
    private int o1;
    private int p1;
    private int q1;
    private float r1;
    private float s1;
    private String t1;
    private String u1;
    private String v1;
    private String w1;
    private int x1;
    private boolean[][] z1;
    private boolean m1 = false;
    private int y1 = 0;
    Set<String> A1 = new HashSet();
    private int E1 = 0;

    public p15() {
        E2();
        j2();
    }

    private void D2(boolean z) {
        int[][] iArrP2;
        if (this.n1 < 1 || this.p1 < 1) {
            return;
        }
        if (z) {
            for (int i = 0; i < this.z1.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.z1;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            this.A1.clear();
        }
        this.y1 = 0;
        String str = this.w1;
        if (str != null && !str.trim().isEmpty() && (iArrP2 = p2(this.w1, false)) != null) {
            h2(iArrP2);
        }
        String str2 = this.v1;
        if (str2 != null && !str2.trim().isEmpty()) {
            this.D1 = p2(this.v1, true);
        }
        c2();
        int[][] iArr = this.D1;
        if (iArr != null) {
            i2(iArr);
        }
    }

    private void E2() {
        int i;
        int i2 = this.o1;
        if (i2 != 0 && (i = this.q1) != 0) {
            this.n1 = i2;
            this.p1 = i;
            return;
        }
        int i3 = this.q1;
        if (i3 > 0) {
            this.p1 = i3;
            this.n1 = ((this.W0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.n1 = i2;
            this.p1 = ((this.W0 + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.W0) + 1.5d);
            this.n1 = iSqrt;
            this.p1 = ((this.W0 + iSqrt) - 1) / iSqrt;
        }
    }

    public static /* synthetic */ int W1(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    private void X1() {
        s2();
        r2();
        Y1();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    private void Y1() {
        int[][] iArr;
        int i;
        for (int i2 = 0; i2 < this.W0; i2++) {
            if (!this.A1.contains(this.V0[i2].o)) {
                int iF2 = f2();
                int iG2 = g2(iF2);
                int iE2 = e2(iF2);
                if (iF2 == -1) {
                    return;
                }
                if (!m2() || (iArr = this.D1) == null || (i = this.E1) >= iArr.length) {
                    b2(this.V0[i2], iG2, iE2, 1, 1);
                } else {
                    int[] iArr2 = iArr[i];
                    if (iArr2[0] == iF2) {
                        this.z1[iG2][iE2] = true;
                        if (l2(iG2, iE2, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget = this.V0[i2];
                            int[] iArr3 = this.D1[this.E1];
                            b2(constraintWidget, iG2, iE2, iArr3[1], iArr3[2]);
                            this.E1++;
                        }
                    } else {
                        b2(this.V0[i2], iG2, iE2, 1, 1);
                    }
                }
            }
        }
    }

    private void Z1(ConstraintWidget constraintWidget) {
        constraintWidget.Y0(-1.0f);
        constraintWidget.Q.q();
        constraintWidget.S.q();
    }

    private void a2(ConstraintWidget constraintWidget) {
        constraintWidget.p1(-1.0f);
        constraintWidget.R.q();
        constraintWidget.T.q();
        constraintWidget.U.q();
    }

    private void b2(ConstraintWidget constraintWidget, int i, int i2, int i3, int i4) {
        constraintWidget.Q.a(this.l1[i2].Q, 0);
        constraintWidget.R.a(this.l1[i].R, 0);
        constraintWidget.S.a(this.l1[(i2 + i4) - 1].S, 0);
        constraintWidget.T.a(this.l1[(i + i3) - 1].T, 0);
    }

    private void c2() {
        int iMax = Math.max(this.n1, this.p1);
        ConstraintWidget[] constraintWidgetArr = this.l1;
        int i = 0;
        if (constraintWidgetArr == null) {
            this.l1 = new ConstraintWidget[iMax];
            while (true) {
                ConstraintWidget[] constraintWidgetArr2 = this.l1;
                if (i >= constraintWidgetArr2.length) {
                    return;
                }
                constraintWidgetArr2[i] = o2();
                i++;
            }
        } else {
            if (iMax == constraintWidgetArr.length) {
                return;
            }
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[iMax];
            while (i < iMax) {
                ConstraintWidget[] constraintWidgetArr4 = this.l1;
                if (i < constraintWidgetArr4.length) {
                    constraintWidgetArr3[i] = constraintWidgetArr4[i];
                } else {
                    constraintWidgetArr3[i] = o2();
                }
                i++;
            }
            while (true) {
                ConstraintWidget[] constraintWidgetArr5 = this.l1;
                if (iMax >= constraintWidgetArr5.length) {
                    this.l1 = constraintWidgetArr3;
                    return;
                } else {
                    this.k1.B1(constraintWidgetArr5[iMax]);
                    iMax++;
                }
            }
        }
    }

    private void d2(boolean z) {
        int[][] iArrP2;
        int[][] iArrP3;
        if (z) {
            for (int i = 0; i < this.z1.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.z1;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.B1.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr = this.B1;
                    if (i4 < iArr[0].length) {
                        iArr[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.y1 = 0;
        String str = this.w1;
        if (str != null && !str.trim().isEmpty() && (iArrP3 = p2(this.w1, false)) != null) {
            h2(iArrP3);
        }
        String str2 = this.v1;
        if (str2 == null || str2.trim().isEmpty() || (iArrP2 = p2(this.v1, true)) == null) {
            return;
        }
        i2(iArrP2);
    }

    private int e2(int i) {
        return this.x1 == 1 ? i / this.n1 : i % this.p1;
    }

    private int f2() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.y1;
            if (i >= this.n1 * this.p1) {
                return -1;
            }
            int iG2 = g2(i);
            int iE2 = e2(this.y1);
            boolean[] zArr = this.z1[iG2];
            if (zArr[iE2]) {
                zArr[iE2] = false;
                z = true;
            }
            this.y1++;
        }
        return i;
    }

    private int g2(int i) {
        return this.x1 == 1 ? i % this.n1 : i / this.p1;
    }

    private void h2(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!l2(g2(iArr2[0]), e2(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void i2(int[][] iArr) {
        if (!m2()) {
            for (int i = 0; i < iArr.length; i++) {
                int iG2 = g2(iArr[i][0]);
                int iE2 = e2(iArr[i][0]);
                int[] iArr2 = iArr[i];
                if (!l2(iG2, iE2, iArr2[1], iArr2[2])) {
                    break;
                }
                ConstraintWidget constraintWidget = this.V0[i];
                int[] iArr3 = iArr[i];
                b2(constraintWidget, iG2, iE2, iArr3[1], iArr3[2]);
                this.A1.add(this.V0[i].o);
            }
        }
    }

    private void j2() {
        boolean[][] zArr;
        int[][] iArr = this.B1;
        boolean z = false;
        if (iArr != null && iArr.length == this.W0 && (zArr = this.z1) != null && zArr.length == this.n1 && zArr[0].length == this.p1) {
            z = true;
        }
        if (!z) {
            k2();
        }
        d2(z);
    }

    private void k2() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.n1, this.p1);
        this.z1 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.W0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.B1 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean l2(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.z1;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean m2() {
        return (this.C1 & 2) > 0;
    }

    private boolean n2() {
        return (this.C1 & 1) > 0;
    }

    private ConstraintWidget o2() {
        ConstraintWidget constraintWidget = new ConstraintWidget();
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.b0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        constraintWidget.o = String.valueOf(constraintWidget.hashCode());
        return constraintWidget;
    }

    private int[][] p2(String str, boolean z) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new Comparator() { // from class: com.google.android.o15
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return p15.W1((String) obj, (String) obj2);
                }
            });
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.n1 != 1 && this.p1 != 1) {
                for (int i = 0; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
                    if (n2()) {
                        iArr[i][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                String[] strArrSplit4 = strArrSplit[i4].trim().split(":");
                iArr[i4][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i4];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.p1 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i2 += iArr[i4][1];
                    if (z) {
                        i2--;
                    }
                }
                if (this.n1 == 1) {
                    iArr[i4][2] = Integer.parseInt(strArrSplit4[1]);
                    i3 += iArr[i4][2];
                    if (z) {
                        i3--;
                    }
                }
            }
            if (i2 != 0 && !this.m1) {
                z2(this.n1 + i2);
            }
            if (i3 != 0 && !this.m1) {
                u2(this.p1 + i3);
            }
            this.m1 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] q2(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < strArrSplit.length) {
                try {
                    fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + strArrSplit[i2] + "`: " + e.getMessage());
                    fArr[i2] = 1.0f;
                }
            } else {
                fArr[i2] = 1.0f;
            }
        }
        return fArr;
    }

    private void r2() {
        int i;
        int iMax = Math.max(this.n1, this.p1);
        ConstraintWidget constraintWidget = this.l1[0];
        float[] fArrQ2 = q2(this.p1, this.u1);
        if (this.p1 == 1) {
            Z1(constraintWidget);
            constraintWidget.Q.a(this.Q, 0);
            constraintWidget.S.a(this.S, 0);
            return;
        }
        int i2 = 0;
        while (true) {
            i = this.p1;
            if (i2 >= i) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.l1[i2];
            Z1(constraintWidget2);
            if (fArrQ2 != null) {
                constraintWidget2.Y0(fArrQ2[i2]);
            }
            if (i2 > 0) {
                constraintWidget2.Q.a(this.l1[i2 - 1].S, 0);
            } else {
                constraintWidget2.Q.a(this.Q, 0);
            }
            if (i2 < this.p1 - 1) {
                constraintWidget2.S.a(this.l1[i2 + 1].Q, 0);
            } else {
                constraintWidget2.S.a(this.S, 0);
            }
            if (i2 > 0) {
                constraintWidget2.Q.g = (int) this.r1;
            }
            i2++;
        }
        while (i < iMax) {
            ConstraintWidget constraintWidget3 = this.l1[i];
            Z1(constraintWidget3);
            constraintWidget3.Q.a(this.Q, 0);
            constraintWidget3.S.a(this.S, 0);
            i++;
        }
    }

    private void s2() {
        int i;
        int iMax = Math.max(this.n1, this.p1);
        ConstraintWidget constraintWidget = this.l1[0];
        float[] fArrQ2 = q2(this.n1, this.t1);
        if (this.n1 == 1) {
            a2(constraintWidget);
            constraintWidget.R.a(this.R, 0);
            constraintWidget.T.a(this.T, 0);
            return;
        }
        int i2 = 0;
        while (true) {
            i = this.n1;
            if (i2 >= i) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.l1[i2];
            a2(constraintWidget2);
            if (fArrQ2 != null) {
                constraintWidget2.p1(fArrQ2[i2]);
            }
            if (i2 > 0) {
                constraintWidget2.R.a(this.l1[i2 - 1].T, 0);
            } else {
                constraintWidget2.R.a(this.R, 0);
            }
            if (i2 < this.n1 - 1) {
                constraintWidget2.T.a(this.l1[i2 + 1].R, 0);
            } else {
                constraintWidget2.T.a(this.T, 0);
            }
            if (i2 > 0) {
                constraintWidget2.R.g = (int) this.s1;
            }
            i2++;
        }
        while (i < iMax) {
            ConstraintWidget constraintWidget3 = this.l1[i];
            a2(constraintWidget3);
            constraintWidget3.R.a(this.R, 0);
            constraintWidget3.T.a(this.T, 0);
            i++;
        }
    }

    public void A2(String str) {
        String str2 = this.w1;
        if (str2 == null || !str2.equals(str)) {
            this.m1 = false;
            this.w1 = str;
        }
    }

    public void B2(CharSequence charSequence) {
        String str = this.v1;
        if (str == null || !str.equals(charSequence.toString())) {
            this.m1 = false;
            this.v1 = charSequence.toString();
        }
    }

    public void C2(float f) {
        if (f >= 0.0f && this.s1 != f) {
            this.s1 = f;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public void J1(int i, int i2, int i3, int i4) {
        super.J1(i, i2, i3, i4);
        this.k1 = (d) N();
        D2(false);
        this.k1.y1(this.l1);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(androidx.constraintlayout.core.d dVar, boolean z) {
        super.g(dVar, z);
        X1();
    }

    public void t2(String str) {
        String str2 = this.u1;
        if (str2 == null || !str2.equals(str)) {
            this.u1 = str;
        }
    }

    public void u2(int i) {
        if (i <= 50 && this.q1 != i) {
            this.q1 = i;
            E2();
            k2();
        }
    }

    public void v2(int i) {
        this.C1 = i;
    }

    public void w2(float f) {
        if (f >= 0.0f && this.r1 != f) {
            this.r1 = f;
        }
    }

    public void x2(int i) {
        if ((i == 0 || i == 1) && this.x1 != i) {
            this.x1 = i;
        }
    }

    public void y2(String str) {
        String str2 = this.t1;
        if (str2 == null || !str2.equals(str)) {
            this.t1 = str;
        }
    }

    public void z2(int i) {
        if (i <= 50 && this.o1 != i) {
            this.o1 = i;
            E2();
            k2();
        }
    }
}
