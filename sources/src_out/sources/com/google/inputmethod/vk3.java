package com.google.inputmethod;

import android.util.AndroidRuntimeException;
import android.view.View;
import com.google.inputmethod.vk3;
import java.util.ArrayList;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class vk3<T extends vk3<T>> implements cr.c {
    float a;
    float b;
    boolean c;
    final Object d;
    final ih4 e;
    boolean f;
    float g;
    float h;
    private long i;
    private float j;
    private final ArrayList<q> k;
    private final ArrayList<r> l;
    private cr m;
    public static final s n = new g("translationX");
    public static final s o = new h("translationY");
    public static final s p = new i("translationZ");
    public static final s q = new j("scaleX");
    public static final s r = new k("scaleY");
    public static final s s = new l("rotation");
    public static final s t = new m("rotationX");
    public static final s u = new n("rotationY");
    public static final s v = new o("x");
    public static final s w = new a("y");
    public static final s x = new b("z");
    public static final s y = new c("alpha");
    public static final s z = new d("scrollX");
    public static final s A = new e("scrollY");

    class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setY(f);
        }
    }

    class b extends s {
        b(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return k7e.L(view);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            k7e.H0(view, f);
        }
    }

    class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setAlpha(f);
        }
    }

    class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    class f extends ih4 {
        final /* synthetic */ qh4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, qh4 qh4Var) {
            super(str);
            this.b = qh4Var;
        }

        @Override // com.google.inputmethod.ih4
        public float a(Object obj) {
            return this.b.a();
        }

        @Override // com.google.inputmethod.ih4
        public void b(Object obj, float f) {
            this.b.b(f);
        }
    }

    class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return k7e.I(view);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            k7e.F0(view, f);
        }
    }

    class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScaleX(f);
        }
    }

    class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setScaleY(f);
        }
    }

    class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotation(f);
        }
    }

    class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotationX(f);
        }
    }

    class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setRotationY(f);
        }
    }

    class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // com.google.inputmethod.ih4
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f) {
            view.setX(f);
        }
    }

    static class p {
        float a;
        float b;

        p() {
        }
    }

    public interface q {
        void a(vk3 vk3Var, boolean z, float f, float f2);
    }

    public interface r {
        void g(vk3 vk3Var, float f, float f2);
    }

    public static abstract class s extends ih4<View> {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    vk3(qh4 qh4Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -Float.MAX_VALUE;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = null;
        this.e = new f("FloatValueHolder", qh4Var);
        this.j = 1.0f;
    }

    private void e(boolean z2) {
        this.f = false;
        f().k(this);
        this.i = 0L;
        this.c = false;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2) != null) {
                this.k.get(i2).a(this, z2, this.b, this.a);
            }
        }
        l(this.k);
    }

    private float g() {
        return this.e.a(this.d);
    }

    private static <T> void k(ArrayList<T> arrayList, T t2) {
        int iIndexOf = arrayList.indexOf(t2);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    private static <T> void l(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void u() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = g();
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        f().d(this, 0L);
    }

    @Override // com.google.android.cr.c
    public boolean a(long j2) {
        long j3 = this.i;
        if (j3 == 0) {
            this.i = j2;
            p(this.b);
            return false;
        }
        long j4 = j2 - j3;
        this.i = j2;
        float fG = f().g();
        boolean zV = v(fG == 0.0f ? 2147483647L : (long) (j4 / fG));
        float fMin = Math.min(this.b, this.g);
        this.b = fMin;
        float fMax = Math.max(fMin, this.h);
        this.b = fMax;
        p(fMax);
        if (zV) {
            e(false);
        }
        return zV;
    }

    public T b(q qVar) {
        if (!this.k.contains(qVar)) {
            this.k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (i()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.l.contains(rVar)) {
            this.l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (!f().j()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f) {
            e(true);
        }
    }

    public cr f() {
        cr crVar = this.m;
        return crVar != null ? crVar : cr.h();
    }

    float h() {
        return this.j * 0.75f;
    }

    public boolean i() {
        return this.f;
    }

    public void j(q qVar) {
        k(this.k, qVar);
    }

    public T m(float f2) {
        this.g = f2;
        return this;
    }

    public T n(float f2) {
        this.h = f2;
        return this;
    }

    public T o(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.j = f2;
        s(f2 * 0.75f);
        return this;
    }

    void p(float f2) {
        this.e.b(this.d, f2);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            if (this.l.get(i2) != null) {
                this.l.get(i2).g(this, this.b, this.a);
            }
        }
        l(this.l);
    }

    public T q(float f2) {
        this.b = f2;
        this.c = true;
        return this;
    }

    public T r(float f2) {
        this.a = f2;
        return this;
    }

    abstract void s(float f2);

    public void t() {
        if (!f().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            return;
        }
        u();
    }

    abstract boolean v(long j2);

    <K> vk3(K k2, ih4<K> ih4Var) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -Float.MAX_VALUE;
        this.i = 0L;
        this.k = new ArrayList<>();
        this.l = new ArrayList<>();
        this.d = k2;
        this.e = ih4Var;
        if (ih4Var != s && ih4Var != t && ih4Var != u) {
            if (ih4Var == y) {
                this.j = 0.00390625f;
                return;
            } else if (ih4Var != q && ih4Var != r) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.002f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
