package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.inputmethod.dh4;
import com.google.inputmethod.ul3;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class k implements Comparable<k> {
    static String[] t = {"position", "x", "y", "width", "height", "pathRotate"};
    ul3 a;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    int k;
    int l;
    float m;
    j n;
    LinkedHashMap<String, ConstraintAttribute> o;
    int p;
    int q;
    double[] r;
    double[] s;
    int b = 0;
    float i = Float.NaN;
    float j = Float.NaN;

    k() {
        int i = a.f;
        this.k = i;
        this.l = i;
        this.m = Float.NaN;
        this.n = null;
        this.o = new LinkedHashMap<>();
        this.p = 0;
        this.r = new double[18];
        this.s = new double[18];
    }

    private boolean d(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public void a(androidx.constraintlayout.widget.c.a aVar) {
        this.a = ul3.c(aVar.d.d);
        androidx.constraintlayout.widget.c.C0071c c0071c = aVar.d;
        this.k = c0071c.e;
        this.l = c0071c.b;
        this.i = c0071c.i;
        this.b = c0071c.f;
        this.q = c0071c.c;
        this.j = aVar.c.e;
        this.m = aVar.e.D;
        for (String str : aVar.g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.g.get(str);
            if (constraintAttribute != null && constraintAttribute.g()) {
                this.o.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.d, kVar.d);
    }

    void e(k kVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean zD = d(this.e, kVar.e);
        boolean zD2 = d(this.f, kVar.f);
        zArr[0] = zArr[0] | d(this.d, kVar.d);
        boolean z2 = zD | zD2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | d(this.g, kVar.g);
        zArr[4] = d(this.h, kVar.h) | zArr[4];
    }

    void g(double[] dArr, int[] iArr) {
        float[] fArr = {this.d, this.e, this.f, this.g, this.h, this.i};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    void h(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.e;
        float fCos = this.f;
        float f = this.g;
        float f2 = this.h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        j jVar = this.n;
        if (jVar != null) {
            float[] fArr2 = new float[2];
            jVar.i(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (d3 * Math.cos(d4))) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = fSin + (f / 2.0f) + 0.0f;
        fArr[i + 1] = fCos + (f2 / 2.0f) + 0.0f;
    }

    void i(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float fSin = this.e;
        float fCos = this.f;
        float f2 = this.g;
        float f3 = this.h;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f8 = (float) dArr[i];
            float f9 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                fSin = f8;
                f4 = f9;
            } else if (i2 == 2) {
                fCos = f8;
                f6 = f9;
            } else if (i2 == 3) {
                f2 = f8;
                f5 = f9;
            } else if (i2 == 4) {
                f3 = f8;
                f7 = f9;
            }
        }
        float f10 = (f5 / 2.0f) + f4;
        float fCos2 = (f7 / 2.0f) + f6;
        j jVar = this.n;
        if (jVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            jVar.i(d, fArr3, fArr4);
            float f11 = fArr3[0];
            float f12 = fArr3[1];
            float f13 = fArr4[0];
            float f14 = fArr4[1];
            f = 2.0f;
            double d2 = fSin;
            double d3 = fCos;
            fSin = (float) ((((double) f11) + (Math.sin(d3) * d2)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f12) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
            double d4 = f4;
            double dSin = ((double) f13) + (Math.sin(d3) * d4);
            double d5 = f6;
            float fCos3 = (float) (dSin + (Math.cos(d3) * d5));
            fCos2 = (float) ((((double) f14) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f10 = fCos3;
        } else {
            f = 2.0f;
        }
        fArr[0] = fSin + (f2 / f) + 0.0f;
        fArr[1] = fCos + (f3 / f) + 0.0f;
        fArr2[0] = f10;
        fArr2[1] = fCos2;
    }

    int j(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.o.get(str);
        int i2 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.h() == 1) {
            dArr[i] = constraintAttribute.e();
            return 1;
        }
        int iH = constraintAttribute.h();
        float[] fArr = new float[iH];
        constraintAttribute.f(fArr);
        while (i2 < iH) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return iH;
    }

    int k(String str) {
        ConstraintAttribute constraintAttribute = this.o.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.h();
    }

    void l(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.e;
        float fCos = this.f;
        float f2 = this.g;
        float f3 = this.h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        j jVar = this.n;
        if (jVar != null) {
            float fJ = jVar.j();
            float fK = this.n.k();
            double d = f;
            double d2 = fCos;
            float fSin = (float) ((((double) fJ) + (Math.sin(d2) * d)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) fK) - (d * Math.cos(d2))) - ((double) (f3 / 2.0f)));
            f = fSin;
        }
        float f5 = f2 + f;
        float f6 = f3 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = f + 0.0f;
        fArr[i + 1] = fCos + 0.0f;
        fArr[i + 2] = f5 + 0.0f;
        fArr[i + 3] = fCos + 0.0f;
        fArr[i + 4] = f5 + 0.0f;
        fArr[i + 5] = f6 + 0.0f;
        fArr[i + 6] = f + 0.0f;
        fArr[i + 7] = f6 + 0.0f;
    }

    boolean m(String str) {
        return this.o.containsKey(str);
    }

    void p(e eVar, k kVar, k kVar2) {
        float f = eVar.a / 100.0f;
        this.c = f;
        this.b = eVar.j;
        float f2 = Float.isNaN(eVar.k) ? f : eVar.k;
        float f3 = Float.isNaN(eVar.l) ? f : eVar.l;
        float f4 = kVar2.g;
        float f5 = kVar.g;
        float f6 = f4 - f5;
        float f7 = kVar2.h;
        float f8 = kVar.h;
        float f9 = f7 - f8;
        this.d = this.c;
        float f10 = kVar.e;
        float f11 = (f5 / 2.0f) + f10;
        float f12 = kVar.f;
        float f13 = f12 + (f8 / 2.0f);
        float f14 = f;
        float f15 = kVar2.e + (f4 / 2.0f);
        float f16 = kVar2.f + (f7 / 2.0f);
        if (f11 > f15) {
            f11 = f15;
            f15 = f11;
        }
        if (f13 <= f16) {
            f13 = f16;
            f16 = f13;
        }
        float f17 = f15 - f11;
        float f18 = f13 - f16;
        float f19 = f6 * f2;
        float f20 = f19 / 2.0f;
        this.e = (int) ((f10 + (f17 * f14)) - f20);
        float f21 = f9 * f3;
        float f22 = f21 / 2.0f;
        this.f = (int) ((f12 + (f18 * f14)) - f22);
        this.g = (int) (f5 + f19);
        this.h = (int) (f8 + f21);
        float f23 = Float.isNaN(eVar.m) ? f14 : eVar.m;
        float f24 = Float.isNaN(eVar.p) ? 0.0f : eVar.p;
        if (!Float.isNaN(eVar.n)) {
            f14 = eVar.n;
        }
        float f25 = Float.isNaN(eVar.o) ? 0.0f : eVar.o;
        this.p = 0;
        this.e = (int) (((kVar.e + (f23 * f17)) + (f25 * f18)) - f20);
        this.f = (int) (((kVar.f + (f17 * f24)) + (f18 * f14)) - f22);
        this.a = ul3.c(eVar.h);
        this.k = eVar.i;
    }

    void q(e eVar, k kVar, k kVar2) {
        float f = eVar.a / 100.0f;
        this.c = f;
        this.b = eVar.j;
        float f2 = Float.isNaN(eVar.k) ? f : eVar.k;
        float f3 = Float.isNaN(eVar.l) ? f : eVar.l;
        float f4 = kVar2.g;
        float f5 = kVar.g;
        float f6 = kVar2.h;
        float f7 = kVar.h;
        this.d = this.c;
        float f8 = kVar.e;
        float f9 = kVar.f;
        float f10 = f;
        float f11 = (kVar2.e + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f12 = (kVar2.f + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f13 = (f4 - f5) * f2;
        float f14 = f13 / 2.0f;
        this.e = (int) ((f8 + (f11 * f10)) - f14);
        float f15 = (f6 - f7) * f3;
        float f16 = f15 / 2.0f;
        this.f = (int) ((f9 + (f12 * f10)) - f16);
        this.g = (int) (f5 + f13);
        this.h = (int) (f7 + f15);
        float f17 = Float.isNaN(eVar.m) ? f10 : eVar.m;
        float f18 = Float.isNaN(eVar.p) ? 0.0f : eVar.p;
        if (!Float.isNaN(eVar.n)) {
            f10 = eVar.n;
        }
        float f19 = Float.isNaN(eVar.o) ? 0.0f : eVar.o;
        this.p = 0;
        this.e = (int) (((kVar.e + (f17 * f11)) + (f19 * f12)) - f14);
        this.f = (int) (((kVar.f + (f11 * f18)) + (f12 * f10)) - f16);
        this.a = ul3.c(eVar.h);
        this.k = eVar.i;
    }

    void r(e eVar, k kVar, k kVar2) {
        float f = eVar.a / 100.0f;
        this.c = f;
        this.b = eVar.j;
        float f2 = Float.isNaN(eVar.k) ? f : eVar.k;
        float f3 = Float.isNaN(eVar.l) ? f : eVar.l;
        float f4 = kVar2.g - kVar.g;
        float f5 = kVar2.h - kVar.h;
        this.d = this.c;
        if (!Float.isNaN(eVar.m)) {
            f = eVar.m;
        }
        float f6 = kVar.e;
        float f7 = kVar.g;
        float f8 = kVar.f;
        float f9 = kVar.h;
        float f10 = f;
        float f11 = (kVar2.e + (kVar2.g / 2.0f)) - ((f7 / 2.0f) + f6);
        float f12 = (kVar2.f + (kVar2.h / 2.0f)) - ((f9 / 2.0f) + f8);
        float f13 = f11 * f10;
        float f14 = f4 * f2;
        float f15 = f14 / 2.0f;
        this.e = (int) ((f6 + f13) - f15);
        float f16 = f12 * f10;
        float f17 = f5 * f3;
        float f18 = f17 / 2.0f;
        this.f = (int) ((f8 + f16) - f18);
        this.g = (int) (f7 + f14);
        this.h = (int) (f9 + f17);
        float f19 = Float.isNaN(eVar.n) ? 0.0f : eVar.n;
        this.p = 1;
        float f20 = (int) ((kVar.e + f13) - f15);
        float f21 = (int) ((kVar.f + f16) - f18);
        this.e = f20 + ((-f12) * f19);
        this.f = f21 + (f11 * f19);
        this.l = this.l;
        this.a = ul3.c(eVar.h);
        this.k = eVar.i;
    }

    void s(int i, int i2, e eVar, k kVar, k kVar2) {
        float fMin;
        float f;
        float f2 = eVar.a / 100.0f;
        this.c = f2;
        this.b = eVar.j;
        this.p = eVar.q;
        float f3 = Float.isNaN(eVar.k) ? f2 : eVar.k;
        float f4 = Float.isNaN(eVar.l) ? f2 : eVar.l;
        float f5 = kVar2.g;
        float f6 = kVar.g;
        float f7 = kVar2.h;
        float f8 = kVar.h;
        this.d = this.c;
        this.g = (int) (f6 + ((f5 - f6) * f3));
        this.h = (int) (f8 + ((f7 - f8) * f4));
        if (eVar.q != 2) {
            float f9 = Float.isNaN(eVar.m) ? f2 : eVar.m;
            float f10 = kVar2.e;
            float f11 = kVar.e;
            this.e = (f9 * (f10 - f11)) + f11;
            if (!Float.isNaN(eVar.n)) {
                f2 = eVar.n;
            }
            float f12 = kVar2.f;
            float f13 = kVar.f;
            this.f = (f2 * (f12 - f13)) + f13;
        } else {
            if (Float.isNaN(eVar.m)) {
                float f14 = kVar2.e;
                float f15 = kVar.e;
                fMin = ((f14 - f15) * f2) + f15;
            } else {
                fMin = Math.min(f4, f3) * eVar.m;
            }
            this.e = fMin;
            if (Float.isNaN(eVar.n)) {
                float f16 = kVar2.f;
                float f17 = kVar.f;
                f = (f2 * (f16 - f17)) + f17;
            } else {
                f = eVar.n;
            }
            this.f = f;
        }
        this.l = kVar.l;
        this.a = ul3.c(eVar.h);
        this.k = eVar.i;
    }

    void t(int i, int i2, e eVar, k kVar, k kVar2) {
        float f = eVar.a / 100.0f;
        this.c = f;
        this.b = eVar.j;
        float f2 = Float.isNaN(eVar.k) ? f : eVar.k;
        float f3 = Float.isNaN(eVar.l) ? f : eVar.l;
        float f4 = kVar2.g;
        float f5 = kVar.g;
        float f6 = kVar2.h;
        float f7 = kVar.h;
        this.d = this.c;
        float f8 = kVar.e;
        float f9 = kVar.f;
        float f10 = kVar2.e + (f4 / 2.0f);
        float f11 = kVar2.f + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.e = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f3;
        this.f = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f));
        this.g = (int) (f5 + f12);
        this.h = (int) (f7 + f13);
        this.p = 2;
        if (!Float.isNaN(eVar.m)) {
            this.e = (int) (eVar.m * (i - ((int) this.g)));
        }
        if (!Float.isNaN(eVar.n)) {
            this.f = (int) (eVar.n * (i2 - ((int) this.h)));
        }
        this.l = this.l;
        this.a = ul3.c(eVar.h);
        this.k = eVar.i;
    }

    void u(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    void w(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void x(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        float f3 = this.e;
        float f4 = this.f;
        float f5 = this.g;
        float f6 = this.h;
        if (iArr.length != 0 && this.r.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.r = new double[i];
            this.s = new double[i];
        }
        Arrays.fill(this.r, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.r;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.s[i3] = dArr2[i2];
        }
        float f7 = Float.NaN;
        int i4 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr5 = this.r;
            if (i4 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f2 = f7;
            } else {
                double d = dArr3 != null ? dArr3[i4] : 0.0d;
                if (!Double.isNaN(this.r[i4])) {
                    d = this.r[i4] + d;
                }
                f2 = f7;
                float f12 = (float) d;
                float f13 = (float) this.s[i4];
                if (i4 == 1) {
                    f7 = f2;
                    f3 = f12;
                    f8 = f13;
                } else if (i4 == 2) {
                    f7 = f2;
                    f4 = f12;
                    f9 = f13;
                } else if (i4 == 3) {
                    f7 = f2;
                    f5 = f12;
                    f10 = f13;
                } else if (i4 == 4) {
                    f7 = f2;
                    f6 = f12;
                    f11 = f13;
                } else if (i4 == 5) {
                    f7 = f12;
                }
                i4++;
            }
            f7 = f2;
            i4++;
        }
        float f14 = f7;
        j jVar = this.n;
        if (jVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            jVar.i(f, fArr, fArr2);
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d2 = f3;
            double d3 = f4;
            float fSin = (float) ((((double) f15) + (Math.sin(d3) * d2)) - ((double) (f5 / 2.0f)));
            float fCos = (float) ((((double) f16) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
            double d4 = f8;
            double d5 = f9;
            float fSin2 = (float) (((double) f17) + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float fCos2 = (float) ((((double) f18) - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            if (dArr2.length >= 2) {
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f14)) {
                view.setRotation((float) (((double) f14) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f3 = fSin;
            f4 = fCos;
        } else if (!Float.isNaN(f14)) {
            view.setRotation(f14 + ((float) Math.toDegrees(Math.atan2(f9 + (f11 / 2.0f), f8 + (f10 / 2.0f)))) + 0.0f);
        }
        if (view instanceof dh4) {
            ((dh4) view).a(f3, f4, f5 + f3, f6 + f4);
            return;
        }
        float f19 = f3 + 0.5f;
        int i5 = (int) f19;
        float f20 = f4 + 0.5f;
        int i6 = (int) f20;
        int i7 = (int) (f19 + f5);
        int i8 = (int) (f20 + f6);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight() || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    public void y(j jVar, k kVar) {
        double d = ((this.e + (this.g / 2.0f)) - kVar.e) - (kVar.g / 2.0f);
        double d2 = ((this.f + (this.h / 2.0f)) - kVar.f) - (kVar.h / 2.0f);
        this.n = jVar;
        this.e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.m)) {
            this.f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f = (float) Math.toRadians(this.m);
        }
    }

    k(int i, int i2, e eVar, k kVar, k kVar2) {
        int i3 = a.f;
        this.k = i3;
        this.l = i3;
        this.m = Float.NaN;
        this.n = null;
        this.o = new LinkedHashMap<>();
        this.p = 0;
        this.r = new double[18];
        this.s = new double[18];
        if (kVar.l != a.f) {
            s(i, i2, eVar, kVar, kVar2);
            return;
        }
        int i4 = eVar.q;
        if (i4 == 1) {
            r(eVar, kVar, kVar2);
            return;
        }
        if (i4 == 2) {
            t(i, i2, eVar, kVar, kVar2);
        } else if (i4 != 3) {
            q(eVar, kVar, kVar2);
        } else {
            p(eVar, kVar, kVar2);
        }
    }
}
