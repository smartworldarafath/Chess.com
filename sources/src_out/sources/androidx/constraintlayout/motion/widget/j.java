package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.inputmethod.abe;
import com.google.inputmethod.fi2;
import com.google.inputmethod.hq2;
import com.google.inputmethod.ki6;
import com.google.inputmethod.pae;
import com.google.inputmethod.qae;
import com.google.inputmethod.si2;
import com.google.inputmethod.ul3;
import com.google.inputmethod.y9e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class j {
    private HashMap<String, abe> B;
    private HashMap<String, pae> C;
    private HashMap<String, y9e> D;
    private h[] E;
    private int F;
    private int G;
    private View H;
    private int I;
    private float J;
    private Interpolator K;
    private boolean L;
    View b;
    int c;
    String e;
    private fi2[] k;
    private fi2 l;
    float p;
    float q;
    private int[] r;
    private double[] s;
    private double[] t;
    private String[] u;
    private int[] v;
    Rect a = new Rect();
    boolean d = false;
    private int f = -1;
    private k g = new k();
    private k h = new k();
    private i i = new i();
    private i j = new i();
    float m = Float.NaN;
    float n = 0.0f;
    float o = 1.0f;
    private int w = 4;
    private float[] x = new float[4];
    private ArrayList<k> y = new ArrayList<>();
    private float[] z = new float[1];
    private ArrayList<androidx.constraintlayout.motion.widget.a> A = new ArrayList<>();

    class a implements Interpolator {
        final /* synthetic */ ul3 a;

        a(ul3 ul3Var) {
            this.a = ul3Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.a.a(f);
        }
    }

    j(View view) {
        int i = androidx.constraintlayout.motion.widget.a.f;
        this.F = i;
        this.G = i;
        this.H = null;
        this.I = i;
        this.J = Float.NaN;
        this.K = null;
        this.L = false;
        E(view);
    }

    private float g(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.o;
            if (f3 != 1.0d) {
                float f4 = this.n;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        ul3 ul3Var = this.g.a;
        float f5 = Float.NaN;
        for (k kVar : this.y) {
            ul3 ul3Var2 = kVar.a;
            if (ul3Var2 != null) {
                float f6 = kVar.c;
                if (f6 < f) {
                    ul3Var = ul3Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = kVar.c;
                }
            }
        }
        if (ul3Var != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) ul3Var.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) ul3Var.b(d);
            }
        }
        return f;
    }

    private static Interpolator p(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            return new a(ul3.c(str));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    private float r() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double dA = f2;
            ul3 ul3Var = this.g.a;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (k kVar : this.y) {
                ul3 ul3Var2 = kVar.a;
                if (ul3Var2 != null) {
                    float f5 = kVar.c;
                    if (f5 < f2) {
                        ul3Var = ul3Var2;
                        f4 = f5;
                    } else if (Float.isNaN(f3)) {
                        f3 = kVar.c;
                    }
                }
            }
            if (ul3Var != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                float f6 = f3 - f4;
                dA = (((float) ul3Var.a((f2 - f4) / f6)) * f6) + f4;
            }
            double d3 = dA;
            this.k[0].d(d3, this.s);
            int i2 = i;
            this.g.h(d3, this.r, this.s, fArr, 0);
            if (i2 > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return fHypot;
    }

    private void t(k kVar) {
        int iBinarySearch = Collections.binarySearch(this.y, kVar);
        if (iBinarySearch == 0) {
            float f = kVar.d;
        }
        this.y.add((-iBinarySearch) - 1, kVar);
    }

    private void v(k kVar) {
        kVar.u((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    public void A(int i) {
        this.F = i;
    }

    void B(View view) {
        k kVar = this.g;
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        kVar.u(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.i.l(view);
    }

    void C(Rect rect, androidx.constraintlayout.widget.c cVar, int i, int i2) {
        j jVar;
        Rect rect2;
        int i3 = cVar.e;
        if (i3 != 0) {
            jVar = this;
            rect2 = rect;
            jVar.x(rect2, this.a, i3, i, i2);
        } else {
            jVar = this;
            rect2 = rect;
        }
        k kVar = jVar.g;
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        v(kVar);
        jVar.g.u(rect2.left, rect2.top, rect2.width(), rect2.height());
        androidx.constraintlayout.widget.c.a aVarA = cVar.A(jVar.c);
        jVar.g.a(aVarA);
        jVar.m = aVarA.d.g;
        jVar.i.k(rect2, cVar, i3, jVar.c);
        jVar.G = aVarA.f.i;
        androidx.constraintlayout.widget.c.C0071c c0071c = aVarA.d;
        jVar.I = c0071c.k;
        jVar.J = c0071c.j;
        Context context = jVar.b.getContext();
        androidx.constraintlayout.widget.c.C0071c c0071c2 = aVarA.d;
        jVar.K = p(context, c0071c2.m, c0071c2.l, c0071c2.n);
    }

    public void D(qae qaeVar, View view, int i, int i2, int i3) {
        k kVar = this.g;
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        Rect rect = new Rect();
        if (i == 1) {
            int i4 = qaeVar.b + qaeVar.d;
            rect.left = ((qaeVar.c + qaeVar.e) - qaeVar.b()) / 2;
            rect.top = i2 - ((i4 + qaeVar.a()) / 2);
            rect.right = rect.left + qaeVar.b();
            rect.bottom = rect.top + qaeVar.a();
        } else if (i == 2) {
            int i5 = qaeVar.b + qaeVar.d;
            rect.left = i3 - (((qaeVar.c + qaeVar.e) + qaeVar.b()) / 2);
            rect.top = (i5 - qaeVar.a()) / 2;
            rect.right = rect.left + qaeVar.b();
            rect.bottom = rect.top + qaeVar.a();
        }
        this.g.u(rect.left, rect.top, rect.width(), rect.height());
        this.i.j(rect, view, i, qaeVar.a);
    }

    public void E(View view) {
        this.b = view;
        this.c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.e = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void F(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        ConstraintAttribute constraintAttribute;
        abe abeVarH;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        pae paeVarF;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i3 = this.F;
        if (i3 != androidx.constraintlayout.motion.widget.a.f) {
            this.g.k = i3;
        }
        this.i.h(this.j, hashSet2);
        ArrayList<androidx.constraintlayout.motion.widget.a> arrayList2 = this.A;
        if (arrayList2 != null) {
            arrayList = null;
            for (androidx.constraintlayout.motion.widget.a aVar : arrayList2) {
                if (aVar instanceof e) {
                    e eVar = (e) aVar;
                    t(new k(i, i2, eVar, this.g, this.h));
                    int i4 = eVar.g;
                    if (i4 != androidx.constraintlayout.motion.widget.a.f) {
                        this.f = i4;
                    }
                } else if (aVar instanceof c) {
                    aVar.d(hashSet3);
                } else if (aVar instanceof g) {
                    aVar.d(hashSet);
                } else if (aVar instanceof h) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((h) aVar);
                } else {
                    aVar.g(map);
                    aVar.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        int i5 = 0;
        if (arrayList != null) {
            this.E = (h[]) arrayList.toArray(new h[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.C = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (androidx.constraintlayout.motion.widget.a aVar2 : this.A) {
                        HashMap<String, ConstraintAttribute> map2 = aVar2.e;
                        if (map2 != null && (constraintAttribute3 = map2.get(str2)) != null) {
                            sparseArray.append(aVar2.a, constraintAttribute3);
                        }
                    }
                    paeVarF = pae.e(str, sparseArray);
                } else {
                    paeVarF = pae.f(str);
                }
                if (paeVarF != null) {
                    paeVarF.c(str);
                    this.C.put(str, paeVarF);
                }
            }
            ArrayList<androidx.constraintlayout.motion.widget.a> arrayList3 = this.A;
            if (arrayList3 != null) {
                for (androidx.constraintlayout.motion.widget.a aVar3 : arrayList3) {
                    if (aVar3 instanceof b) {
                        aVar3.a(this.C);
                    }
                }
            }
            this.i.a(this.C, 0);
            this.j.a(this.C, 100);
            for (String str3 : this.C.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                pae paeVar = this.C.get(str3);
                if (paeVar != null) {
                    paeVar.d(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.B == null) {
                this.B = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.B.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (androidx.constraintlayout.motion.widget.a aVar4 : this.A) {
                            HashMap<String, ConstraintAttribute> map3 = aVar4.e;
                            if (map3 != null && (constraintAttribute2 = map3.get(str5)) != null) {
                                sparseArray2.append(aVar4.a, constraintAttribute2);
                            }
                        }
                        abeVarH = abe.g(str4, sparseArray2);
                    } else {
                        abeVarH = abe.h(str4, j);
                    }
                    if (abeVarH != null) {
                        abeVarH.d(str4);
                        this.B.put(str4, abeVarH);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.motion.widget.a> arrayList4 = this.A;
            if (arrayList4 != null) {
                for (androidx.constraintlayout.motion.widget.a aVar5 : arrayList4) {
                    if (aVar5 instanceof g) {
                        ((g) aVar5).Q(this.B);
                    }
                }
            }
            for (String str6 : this.B.keySet()) {
                this.B.get(str6).e(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.y.size();
        int i6 = size + 2;
        k[] kVarArr = new k[i6];
        kVarArr[0] = this.g;
        kVarArr[size + 1] = this.h;
        if (this.y.size() > 0 && this.f == -1) {
            this.f = 0;
        }
        Iterator<k> it = this.y.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            kVarArr[i7] = it.next();
            i7++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.h.o.keySet()) {
            if (this.g.o.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.u = strArr2;
        this.v = new int[strArr2.length];
        int i8 = 0;
        while (true) {
            strArr = this.u;
            if (i8 >= strArr.length) {
                break;
            }
            String str8 = strArr[i8];
            this.v[i8] = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (kVarArr[i9].o.containsKey(str8) && (constraintAttribute = kVarArr[i9].o.get(str8)) != null) {
                    int[] iArr = this.v;
                    iArr[i8] = iArr[i8] + constraintAttribute.h();
                    break;
                }
            }
            i8++;
        }
        boolean z = kVarArr[0].k != androidx.constraintlayout.motion.widget.a.f;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 1; i10 < i6; i10++) {
            kVarArr[i10].e(kVarArr[i10 - 1], zArr, this.u, z);
        }
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                i11++;
            }
        }
        this.r = new int[i11];
        int i13 = 2;
        int iMax = Math.max(2, i11);
        this.s = new double[iMax];
        this.t = new double[iMax];
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                this.r[i14] = i15;
                i14++;
            }
        }
        int[] iArr2 = {i6, this.r.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i6];
        for (int i16 = 0; i16 < i6; i16++) {
            kVarArr[i16].g(dArr[i16], this.r);
            dArr2[i16] = kVarArr[i16].c;
        }
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.r;
            if (i17 >= iArr3.length) {
                break;
            }
            if (iArr3[i17] < k.t.length) {
                String str9 = k.t[this.r[i17]] + " [";
                for (int i18 = 0; i18 < i6; i18++) {
                    str9 = str9 + dArr[i18][i17];
                }
            }
            i17++;
        }
        this.k = new fi2[this.u.length + 1];
        int i19 = 0;
        while (true) {
            String[] strArr3 = this.u;
            if (i19 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i19];
            int i20 = i5;
            int i21 = i20;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i20 < i6) {
                char c2 = c;
                if (kVarArr[i20].m(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i6];
                        int[] iArr4 = new int[i13];
                        iArr4[c2] = kVarArr[i20].k(str10);
                        iArr4[i5] = i6;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) cls, iArr4);
                    }
                    k kVar = kVarArr[i20];
                    dArr3[i21] = kVar.c;
                    kVar.j(str10, dArr4[i21], 0);
                    i21++;
                }
                i20++;
                c = c2;
                kVarArr = kVarArr;
                i13 = 2;
                i5 = 0;
            }
            i19++;
            this.k[i19] = fi2.a(this.f, Arrays.copyOf(dArr3, i21), (double[][]) Arrays.copyOf(dArr4, i21));
            c = c;
            kVarArr = kVarArr;
            i13 = 2;
            i5 = 0;
        }
        k[] kVarArr2 = kVarArr;
        char c3 = c;
        this.k[0] = fi2.a(this.f, dArr2, dArr);
        if (kVarArr2[0].k != androidx.constraintlayout.motion.widget.a.f) {
            int[] iArr5 = new int[i6];
            double[] dArr5 = new double[i6];
            int[] iArr6 = new int[2];
            iArr6[c3] = 2;
            iArr6[0] = i6;
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) cls, iArr6);
            for (int i22 = 0; i22 < i6; i22++) {
                k kVar2 = kVarArr2[i22];
                iArr5[i22] = kVar2.k;
                dArr5[i22] = kVar2.c;
                double[] dArr7 = dArr6[i22];
                dArr7[0] = kVar2.e;
                dArr7[c3] = kVar2.f;
            }
            this.l = fi2.b(iArr5, dArr5, dArr6);
        }
        this.D = new HashMap<>();
        if (this.A != null) {
            float fR = Float.NaN;
            for (String str11 : hashSet3) {
                y9e y9eVarH = y9e.h(str11);
                if (y9eVarH != null) {
                    if (y9eVarH.g() && Float.isNaN(fR)) {
                        fR = r();
                    }
                    y9eVarH.e(str11);
                    this.D.put(str11, y9eVarH);
                }
            }
            for (androidx.constraintlayout.motion.widget.a aVar6 : this.A) {
                if (aVar6 instanceof c) {
                    ((c) aVar6).U(this.D);
                }
            }
            Iterator<y9e> it2 = this.D.values().iterator();
            while (it2.hasNext()) {
                it2.next().f(fR);
            }
        }
    }

    public void G(j jVar) {
        this.g.y(jVar, jVar.g);
        this.h.y(jVar, jVar.h);
    }

    public void a(androidx.constraintlayout.motion.widget.a aVar) {
        this.A.add(aVar);
    }

    void b(ArrayList<androidx.constraintlayout.motion.widget.a> arrayList) {
        this.A.addAll(arrayList);
    }

    int c(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrG = this.k[0].g();
        if (iArr != null) {
            Iterator<k> it = this.y.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().p;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < dArrG.length; i3++) {
            this.k[0].d(dArrG[i3], this.s);
            this.g.h(dArrG[i3], this.r, this.s, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    void d(float[] fArr, int i) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap<String, pae> map = this.C;
        pae paeVar = map == null ? null : map.get("translationX");
        HashMap<String, pae> map2 = this.C;
        pae paeVar2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, y9e> map3 = this.D;
        y9e y9eVar = map3 == null ? null : map3.get("translationX");
        HashMap<String, y9e> map4 = this.D;
        y9e y9eVar2 = map4 != null ? map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float fMin = i3 * f2;
            float f3 = this.o;
            float f4 = 0.0f;
            if (f3 != f) {
                float f5 = this.n;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            double dA = fMin;
            ul3 ul3Var = this.g.a;
            float f6 = Float.NaN;
            for (k kVar : this.y) {
                ul3 ul3Var2 = kVar.a;
                if (ul3Var2 != null) {
                    float f7 = kVar.c;
                    if (f7 < fMin) {
                        f4 = f7;
                        ul3Var = ul3Var2;
                    } else if (Float.isNaN(f6)) {
                        f6 = kVar.c;
                    }
                }
            }
            if (ul3Var != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                dA = (((float) ul3Var.a((fMin - f4) / f8)) * f8) + f4;
            }
            this.k[0].d(dA, this.s);
            fi2 fi2Var = this.l;
            if (fi2Var != null) {
                double[] dArr = this.s;
                if (dArr.length > 0) {
                    fi2Var.d(dA, dArr);
                }
            }
            int i4 = i3 * 2;
            this.g.h(dA, this.r, this.s, fArr, i4);
            if (y9eVar != null) {
                fArr[i4] = fArr[i4] + y9eVar.a(fMin);
            } else if (paeVar != null) {
                fArr[i4] = fArr[i4] + paeVar.a(fMin);
            }
            if (y9eVar2 != null) {
                int i5 = i4 + 1;
                fArr[i5] = fArr[i5] + y9eVar2.a(fMin);
            } else if (paeVar2 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + paeVar2.a(fMin);
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    void e(float f, float[] fArr, int i) {
        this.k[0].d(g(f, null), this.s);
        this.g.l(this.r, this.s, fArr, i);
    }

    void f(boolean z) {
        if (!"button".equals(hq2.d(this.b)) || this.E == null) {
            return;
        }
        int i = 0;
        while (true) {
            h[] hVarArr = this.E;
            if (i >= hVarArr.length) {
                return;
            }
            hVarArr[i].u(z ? -100.0f : 100.0f, this.b);
            i++;
        }
    }

    public int h() {
        return this.g.l;
    }

    public void i(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.k[0].d(d, dArr);
        this.k[0].f(d, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.g.i(d, this.r, dArr, fArr, dArr2, fArr2);
    }

    public float j() {
        return this.p;
    }

    public float k() {
        return this.q;
    }

    void l(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float fG = g(f, this.z);
        fi2[] fi2VarArr = this.k;
        int i = 0;
        if (fi2VarArr == null) {
            k kVar = this.h;
            float f4 = kVar.e;
            k kVar2 = this.g;
            float f5 = f4 - kVar2.e;
            float f6 = kVar.f - kVar2.f;
            float f7 = (kVar.g - kVar2.g) + f5;
            float f8 = (kVar.h - kVar2.h) + f6;
            fArr[0] = (f5 * (1.0f - f2)) + (f7 * f2);
            fArr[1] = (f6 * (1.0f - f3)) + (f8 * f3);
            return;
        }
        double d = fG;
        fi2VarArr[0].f(d, this.t);
        this.k[0].d(d, this.s);
        float f9 = this.z[0];
        while (true) {
            dArr = this.t;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        fi2 fi2Var = this.l;
        if (fi2Var == null) {
            this.g.w(f2, f3, fArr, this.r, dArr, this.s);
            return;
        }
        double[] dArr2 = this.s;
        if (dArr2.length > 0) {
            fi2Var.d(d, dArr2);
            this.l.f(d, this.t);
            this.g.w(f2, f3, fArr, this.r, this.t, this.s);
        }
    }

    public int m() {
        int iMax = this.g.b;
        Iterator<k> it = this.y.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().b);
        }
        return Math.max(iMax, this.h.b);
    }

    public float n() {
        return this.h.e;
    }

    public float o() {
        return this.h.f;
    }

    k q(int i) {
        return this.y.get(i);
    }

    public View s() {
        return this.b;
    }

    public String toString() {
        return " start: x: " + this.g.e + " y: " + this.g.f + " end: x: " + this.h.e + " y: " + this.h.f;
    }

    boolean u(View view, float f, long j, ki6 ki6Var) {
        abe.d dVar;
        boolean zJ;
        View view2;
        View view3;
        float f2;
        double d;
        View view4 = view;
        float fG = g(f, null);
        int i = this.I;
        if (i != androidx.constraintlayout.motion.widget.a.f) {
            float f3 = 1.0f / i;
            float fFloor = ((float) Math.floor(fG / f3)) * f3;
            float f4 = (fG % f3) / f3;
            if (!Float.isNaN(this.J)) {
                f4 = (f4 + this.J) % 1.0f;
            }
            Interpolator interpolator = this.K;
            fG = ((interpolator != null ? interpolator.getInterpolation(f4) : ((double) f4) > 0.5d ? 1.0f : 0.0f) * f3) + fFloor;
        }
        HashMap<String, pae> map = this.C;
        if (map != null) {
            Iterator<pae> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().g(view4, fG);
            }
        }
        HashMap<String, abe> map2 = this.B;
        if (map2 != null) {
            abe.d dVar2 = null;
            boolean zI = false;
            for (abe abeVar : map2.values()) {
                if (abeVar instanceof abe.d) {
                    dVar2 = (abe.d) abeVar;
                } else {
                    zI |= abeVar.i(view4, fG, j, ki6Var);
                    view4 = view;
                }
            }
            zJ = zI;
            dVar = dVar2;
        } else {
            dVar = null;
            zJ = false;
        }
        fi2[] fi2VarArr = this.k;
        if (fi2VarArr != null) {
            double d2 = fG;
            fi2VarArr[0].d(d2, this.s);
            this.k[0].f(d2, this.t);
            fi2 fi2Var = this.l;
            if (fi2Var != null) {
                double[] dArr = this.s;
                if (dArr.length > 0) {
                    fi2Var.d(d2, dArr);
                    this.l.f(d2, this.t);
                }
            }
            if (this.L) {
                view3 = view;
                f2 = 0.0f;
                d = d2;
            } else {
                float f5 = fG;
                d = d2;
                f2 = 0.0f;
                this.g.x(f5, view, this.r, this.s, this.t, null, this.d);
                fG = f5;
                view3 = view;
                this.d = false;
            }
            if (this.G != androidx.constraintlayout.motion.widget.a.f) {
                if (this.H == null) {
                    this.H = ((View) view3.getParent()).findViewById(this.G);
                }
                View view5 = this.H;
                if (view5 != null) {
                    float top = (view5.getTop() + this.H.getBottom()) / 2.0f;
                    float left = (this.H.getLeft() + this.H.getRight()) / 2.0f;
                    if (view3.getRight() - view3.getLeft() > 0 && view3.getBottom() - view3.getTop() > 0) {
                        float left2 = left - view3.getLeft();
                        float top2 = top - view3.getTop();
                        view3.setPivotX(left2);
                        view3.setPivotY(top2);
                    }
                }
            }
            HashMap<String, pae> map3 = this.C;
            if (map3 != null) {
                for (pae paeVar : map3.values()) {
                    if (paeVar instanceof pae.d) {
                        double[] dArr2 = this.t;
                        if (dArr2.length > 1) {
                            ((pae.d) paeVar).h(view3, fG, dArr2[0], dArr2[1]);
                        }
                    }
                    view3 = view;
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.t;
                view2 = view;
                float f6 = fG;
                fG = f6;
                zJ |= dVar.j(view2, ki6Var, f6, j, dArr3[0], dArr3[1]);
            } else {
                view2 = view;
            }
            int i2 = 1;
            while (true) {
                fi2[] fi2VarArr2 = this.k;
                if (i2 >= fi2VarArr2.length) {
                    break;
                }
                fi2VarArr2[i2].e(d, this.x);
                si2.b(this.g.o.get(this.u[i2 - 1]), view2, this.x);
                i2++;
            }
            i iVar = this.i;
            if (iVar.b == 0) {
                if (fG <= f2) {
                    view2.setVisibility(iVar.c);
                } else if (fG >= 1065353216) {
                    view2.setVisibility(this.j.c);
                } else if (this.j.c != iVar.c) {
                    view2.setVisibility(0);
                }
            }
            if (this.E != null) {
                int i3 = 0;
                while (true) {
                    h[] hVarArr = this.E;
                    if (i3 >= hVarArr.length) {
                        break;
                    }
                    hVarArr[i3].u(fG, view2);
                    i3++;
                }
            }
        } else {
            view2 = view;
            k kVar = this.g;
            float f7 = kVar.e;
            k kVar2 = this.h;
            float f8 = f7 + ((kVar2.e - f7) * fG);
            float f9 = kVar.f;
            float f10 = f9 + ((kVar2.f - f9) * fG);
            float f11 = kVar.g;
            float f12 = kVar2.g;
            float f13 = kVar.h;
            float f14 = kVar2.h;
            float f15 = f8 + 0.5f;
            int i4 = (int) f15;
            float f16 = f10 + 0.5f;
            int i5 = (int) f16;
            int i6 = (int) (f15 + ((f12 - f11) * fG) + f11);
            int i7 = (int) (f16 + ((f14 - f13) * fG) + f13);
            int i8 = i6 - i4;
            int i9 = i7 - i5;
            if (f12 != f11 || f14 != f13 || this.d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                this.d = false;
            }
            view2.layout(i4, i5, i6, i7);
        }
        HashMap<String, y9e> map4 = this.D;
        if (map4 != null) {
            for (y9e y9eVar : map4.values()) {
                if (y9eVar instanceof y9e.d) {
                    double[] dArr4 = this.t;
                    ((y9e.d) y9eVar).j(view2, fG, dArr4[0], dArr4[1]);
                } else {
                    y9eVar.i(view2, fG);
                }
            }
        }
        return zJ;
    }

    public void w() {
        this.d = true;
    }

    void x(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((i4 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((i6 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void y(View view) {
        k kVar = this.g;
        kVar.c = 0.0f;
        kVar.d = 0.0f;
        this.L = true;
        kVar.u(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.h.u(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.i.l(view);
        this.j.l(view);
    }

    void z(Rect rect, androidx.constraintlayout.widget.c cVar, int i, int i2) {
        j jVar;
        int i3 = cVar.e;
        if (i3 != 0) {
            jVar = this;
            jVar.x(rect, this.a, i3, i, i2);
            rect = jVar.a;
        } else {
            jVar = this;
        }
        k kVar = jVar.h;
        kVar.c = 1.0f;
        kVar.d = 1.0f;
        v(kVar);
        jVar.h.u(rect.left, rect.top, rect.width(), rect.height());
        jVar.h.a(cVar.A(jVar.c));
        jVar.j.k(rect, cVar, i3, jVar.c);
    }
}
