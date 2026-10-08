package com.google.inputmethod;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class li6 {
    private fi2 a;
    private b b;
    private String c;
    private int d = 0;
    private String e = null;
    public int f = 0;
    ArrayList<c> g = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return Integer.compare(cVar.a, cVar2.a);
        }
    }

    static class b {
        private final int a;
        eu8 b;
        private final int c;
        private final int d;
        private final int e;
        float[] f;
        double[] g;
        float[] h;
        float[] i;
        float[] j;
        float[] k;
        int l;
        fi2 m;
        double[] n;
        double[] o;
        float p;

        b(int i, String str, int i2, int i3) {
            eu8 eu8Var = new eu8();
            this.b = eu8Var;
            this.c = 0;
            this.d = 1;
            this.e = 2;
            this.l = i;
            this.a = i2;
            eu8Var.e(i, str);
            this.f = new float[i3];
            this.g = new double[i3];
            this.h = new float[i3];
            this.i = new float[i3];
            this.j = new float[i3];
            this.k = new float[i3];
        }

        public double a(float f) {
            fi2 fi2Var = this.m;
            if (fi2Var != null) {
                fi2Var.d(f, this.n);
            } else {
                double[] dArr = this.n;
                dArr[0] = this.i[0];
                dArr[1] = this.j[0];
                dArr[2] = this.f[0];
            }
            double[] dArr2 = this.n;
            return dArr2[0] + (this.b.c(f, dArr2[1]) * this.n[2]);
        }

        public void b(int i, int i2, float f, float f2, float f3, float f4) {
            this.g[i] = ((double) i2) / 100.0d;
            this.h[i] = f;
            this.i[i] = f2;
            this.j[i] = f3;
            this.f[i] = f4;
        }

        public void c(float f) {
            this.p = f;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.g.length, 3);
            float[] fArr = this.f;
            this.n = new double[fArr.length + 2];
            this.o = new double[fArr.length + 2];
            if (this.g[0] > 0.0d) {
                this.b.a(0.0d, this.h[0]);
            }
            double[] dArr2 = this.g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.b.a(1.0d, this.h[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.i[i];
                dArr3[1] = this.j[i];
                dArr3[2] = this.f[i];
                this.b.a(this.g[i], this.h[i]);
            }
            this.b.d();
            double[] dArr4 = this.g;
            if (dArr4.length > 1) {
                this.m = fi2.a(0, dArr4, dArr);
            } else {
                this.m = null;
            }
        }
    }

    static class c {
        int a;
        float b;
        float c;
        float d;
        float e;

        c(int i, float f, float f2, float f3, float f4) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public float a(float f) {
        return (float) this.b.a(f);
    }

    protected void b(Object obj) {
    }

    public void c(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.g.add(new c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f = i3;
        }
        this.d = i2;
        this.e = str;
    }

    public void d(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.g.add(new c(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f = i3;
        }
        this.d = i2;
        b(obj);
        this.e = str;
    }

    public void e(String str) {
        this.c = str;
    }

    public void f(float f) {
        int size = this.g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.b = new b(this.d, this.e, this.f, size);
        int i = 0;
        for (c cVar : this.g) {
            float f2 = cVar.d;
            dArr[i] = ((double) f2) * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = cVar.b;
            dArr3[0] = f3;
            float f4 = cVar.c;
            dArr3[1] = f4;
            float f5 = cVar.e;
            dArr3[2] = f5;
            this.b.b(i, cVar.a, f2, f4, f5, f3);
            i++;
        }
        this.b.c(f);
        this.a = fi2.a(0, dArr, dArr2);
    }

    public boolean g() {
        return this.f == 1;
    }

    public String toString() {
        String str = this.c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (c cVar : this.g) {
            str = str + "[" + cVar.a + " , " + decimalFormat.format(cVar.b) + "] ";
        }
        return str;
    }
}
