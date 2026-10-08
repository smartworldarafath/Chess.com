package com.google.inputmethod;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class pae extends h2c {

    static class a extends pae {
        a() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    public static class b extends pae {
        String f;
        SparseArray<ConstraintAttribute> g;
        float[] h;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f = str.split(",")[1];
            this.g = sparseArray;
        }

        @Override // com.google.inputmethod.h2c
        public void b(int i, float f) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // com.google.inputmethod.h2c
        public void d(int i) {
            int size = this.g.size();
            int iH = this.g.valueAt(0).h();
            double[] dArr = new double[size];
            this.h = new float[iH];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iH);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.g.keyAt(i2);
                ConstraintAttribute constraintAttributeValueAt = this.g.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                constraintAttributeValueAt.f(this.h);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.h;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = fi2.a(i, dArr, dArr2);
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            this.a.e(f, this.h);
            si2.b(this.g.valueAt(0), view, this.h);
        }

        public void h(int i, ConstraintAttribute constraintAttribute) {
            this.g.append(i, constraintAttribute);
        }
    }

    static class c extends pae {
        c() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class d extends pae {
        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
        }

        public void h(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    static class e extends pae {
        e() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    static class f extends pae {
        f() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    static class g extends pae {
        boolean f = false;

        g() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    static class h extends pae {
        h() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setRotation(a(f));
        }
    }

    static class i extends pae {
        i() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    static class j extends pae {
        j() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    static class k extends pae {
        k() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    static class l extends pae {
        l() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    static class m extends pae {
        m() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    static class n extends pae {
        n() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    static class o extends pae {
        o() {
        }

        @Override // com.google.inputmethod.pae
        public void g(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public static pae e(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new b(str, sparseArray);
    }

    public static pae f(String str) {
        str.getClass();
        switch (str) {
            case "rotationX":
                return new i();
            case "rotationY":
                return new j();
            case "translationX":
                return new m();
            case "translationY":
                return new n();
            case "translationZ":
                return new o();
            case "progress":
                return new g();
            case "scaleX":
                return new k();
            case "scaleY":
                return new l();
            case "waveVariesBy":
                return new a();
            case "transformPivotX":
                return new e();
            case "transformPivotY":
                return new f();
            case "rotation":
                return new h();
            case "elevation":
                return new c();
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new a();
            case "waveOffset":
                return new a();
            default:
                return null;
        }
    }

    public abstract void g(View view, float f2);
}
