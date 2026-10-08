package com.google.inputmethod;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class fi2 {

    static class a extends fi2 {
        double a;
        double[] b;

        a(double d, double[] dArr) {
            this.a = d;
            this.b = dArr;
        }

        @Override // com.google.inputmethod.fi2
        public double c(double d, int i) {
            return this.b[i];
        }

        @Override // com.google.inputmethod.fi2
        public void d(double d, double[] dArr) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // com.google.inputmethod.fi2
        public void e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // com.google.inputmethod.fi2
        public void f(double d, double[] dArr) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // com.google.inputmethod.fi2
        public double[] g() {
            return new double[]{this.a};
        }
    }

    public static fi2 a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            return i != 2 ? new j27(dArr, dArr2) : new a(dArr[0], dArr2[0]);
        }
        return new jz7(dArr, dArr2);
    }

    public static fi2 b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new d00(iArr, dArr, dArr2);
    }

    public abstract double c(double d, int i);

    public abstract void d(double d, double[] dArr);

    public abstract void e(double d, float[] fArr);

    public abstract void f(double d, double[] dArr);

    public abstract double[] g();
}
