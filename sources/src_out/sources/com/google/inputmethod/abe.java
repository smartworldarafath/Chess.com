package com.google.inputmethod;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class abe extends n5d {

    static class a extends abe {
        a() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setAlpha(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    public static class b extends abe {
        String l;
        SparseArray<ConstraintAttribute> m;
        SparseArray<float[]> n = new SparseArray<>();
        float[] o;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.l = str.split(",")[1];
            this.m = sparseArray;
        }

        @Override // com.google.inputmethod.n5d
        public void b(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // com.google.inputmethod.n5d
        public void e(int i) {
            int size = this.m.size();
            int iH = this.m.valueAt(0).h();
            double[] dArr = new double[size];
            int i2 = iH + 2;
            this.o = new float[i2];
            this.g = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.m.keyAt(i3);
                ConstraintAttribute constraintAttributeValueAt = this.m.valueAt(i3);
                float[] fArrValueAt = this.n.valueAt(i3);
                dArr[i3] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.f(this.o);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.o;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iH] = fArrValueAt[0];
                dArr3[iH + 1] = fArrValueAt[1];
            }
            this.a = fi2.a(i, dArr, dArr2);
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            this.a.e(f, this.o);
            float[] fArr = this.o;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float fA = ki6Var.a(view, this.l, 0);
                this.j = fA;
                if (Float.isNaN(fA)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.j) + ((j2 * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.j = f4;
            this.i = j;
            float fA2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.g;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.h;
                float f5 = this.o[i];
                this.h = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fA2) + f3;
                i++;
            }
            si2.b(this.m.valueAt(0), view, this.g);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }

        public void j(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.m.append(i, constraintAttribute);
            this.n.append(i, new float[]{f, f2});
            this.b = Math.max(this.b, i2);
        }
    }

    static class c extends abe {
        c() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setElevation(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    public static class d extends abe {
        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            return this.h;
        }

        public boolean j(View view, ki6 ki6Var, float f, long j, double d, double d2) {
            view.setRotation(f(f, j, view, ki6Var) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.h;
        }
    }

    static class e extends abe {
        boolean l = false;

        e() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            e eVar;
            Method method;
            if (view instanceof MotionLayout) {
                eVar = this;
                ((MotionLayout) view).setProgress(eVar.f(f, j, view, ki6Var));
            } else {
                eVar = this;
                if (eVar.l) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    eVar.l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(eVar.f(f, j, view, ki6Var)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return eVar.h;
        }
    }

    static class f extends abe {
        f() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setRotation(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    static class g extends abe {
        g() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setRotationX(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    static class h extends abe {
        h() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setRotationY(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    static class i extends abe {
        i() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setScaleX(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    static class j extends abe {
        j() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setScaleY(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    static class k extends abe {
        k() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setTranslationX(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    static class l extends abe {
        l() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setTranslationY(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    static class m extends abe {
        m() {
        }

        @Override // com.google.inputmethod.abe
        public boolean i(View view, float f, long j, ki6 ki6Var) {
            view.setTranslationZ(f(f, j, view, ki6Var));
            return this.h;
        }
    }

    public static abe g(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    public static abe h(String str, long j2) {
        abe gVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.c(j2);
        return gVar;
    }

    public float f(float f2, long j2, View view, ki6 ki6Var) {
        this.a.e(f2, this.g);
        float[] fArr = this.g;
        float f3 = fArr[1];
        if (f3 == 0.0f) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            float fA = ki6Var.a(view, this.f, 0);
            this.j = fA;
            if (Float.isNaN(fA)) {
                this.j = 0.0f;
            }
        }
        float f4 = (float) ((((double) this.j) + (((j2 - this.i) * 1.0E-9d) * ((double) f3))) % 1.0d);
        this.j = f4;
        ki6Var.b(view, this.f, 0, f4);
        this.i = j2;
        float f5 = this.g[0];
        float fA2 = (a(this.j) * f5) + this.g[2];
        this.h = (f5 == 0.0f && f3 == 0.0f) ? false : true;
        return fA2;
    }

    public abstract boolean i(View view, float f2, long j2, ki6 ki6Var);
}
