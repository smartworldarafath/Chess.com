package com.google.inputmethod;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class c9c extends ul3 {
    jz7 d;

    c9c(String str) {
        this.a = str;
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.d = d(Arrays.copyOf(dArr, i + 1));
    }

    private static jz7 d(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        jz7 jz7Var = new jz7(dArr3, dArr2);
        System.out.println(" 0 " + jz7Var.c(0.0d, 0));
        System.out.println(" 1 " + jz7Var.c(1.0d, 0));
        return jz7Var;
    }

    @Override // com.google.inputmethod.ul3
    public double a(double d) {
        return this.d.c(d, 0);
    }

    @Override // com.google.inputmethod.ul3
    public double b(double d) {
        return this.d.k(d, 0);
    }
}
