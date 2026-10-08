package com.google.inputmethod;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class y9e extends li6 {

    static class a extends y9e {
        a() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    static class b extends y9e {
        float[] h = new float[1];
        protected ConstraintAttribute i;

        b() {
        }

        @Override // com.google.inputmethod.li6
        protected void b(Object obj) {
            this.i = (ConstraintAttribute) obj;
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            this.h[0] = a(f);
            si2.b(this.i, view, this.h);
        }
    }

    static class c extends y9e {
        c() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class d extends y9e {
        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
        }

        public void j(View view, float f, double d, double d2) {
            view.setRotation(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    static class e extends y9e {
        boolean h = false;

        e() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.h = true;
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

    static class f extends y9e {
        f() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setRotation(a(f));
        }
    }

    static class g extends y9e {
        g() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    static class h extends y9e {
        h() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    static class i extends y9e {
        i() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    static class j extends y9e {
        j() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    static class k extends y9e {
        k() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    static class l extends y9e {
        l() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    static class m extends y9e {
        m() {
        }

        @Override // com.google.inputmethod.y9e
        public void i(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public static y9e h(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
        switch (str) {
            case "rotationX":
                return new g();
            case "rotationY":
                return new h();
            case "translationX":
                return new k();
            case "translationY":
                return new l();
            case "translationZ":
                return new m();
            case "progress":
                return new e();
            case "scaleX":
                return new i();
            case "scaleY":
                return new j();
            case "waveVariesBy":
                return new a();
            case "rotation":
                return new f();
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

    public abstract void i(View view, float f2);
}
