package com.google.inputmethod;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class whe {
    private e a;

    public static abstract class b {
        kie a;
        private final int b;

        public b(int i) {
            this.b = i;
        }

        public final int b() {
            return this.b;
        }

        public void c(whe wheVar) {
        }

        public void d(whe wheVar) {
        }

        public abstract kie e(kie kieVar, List<whe> list);

        public a f(whe wheVar, a aVar) {
            return aVar;
        }
    }

    private static class c extends e {
        private static final Interpolator f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        private static final Interpolator g = new o54();
        private static final Interpolator h = new DecelerateInterpolator(1.5f);
        private static final Interpolator i = new AccelerateInterpolator(1.5f);

        private static class a implements View.OnApplyWindowInsetsListener {
            final b a;
            private kie b;

            /* JADX INFO: renamed from: com.google.android.whe$c$a$a, reason: collision with other inner class name */
            class C0129a implements ValueAnimator.AnimatorUpdateListener {
                final /* synthetic */ whe a;
                final /* synthetic */ kie b;
                final /* synthetic */ kie c;
                final /* synthetic */ int d;
                final /* synthetic */ View e;

                C0129a(whe wheVar, kie kieVar, kie kieVar2, int i, View view) {
                    this.a = wheVar;
                    this.b = kieVar;
                    this.c = kieVar2;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.f(valueAnimator.getAnimatedFraction());
                    c.l(this.e, c.p(this.b, this.c, this.a.c(), this.d), Collections.singletonList(this.a));
                }
            }

            class b extends AnimatorListenerAdapter {
                final /* synthetic */ whe a;
                final /* synthetic */ View b;

                b(whe wheVar, View view) {
                    this.a = wheVar;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.a.f(1.0f);
                    c.j(this.b, this.a);
                }
            }

            /* JADX INFO: renamed from: com.google.android.whe$c$a$c, reason: collision with other inner class name */
            class RunnableC0130c implements Runnable {
                final /* synthetic */ View a;
                final /* synthetic */ whe b;
                final /* synthetic */ a c;
                final /* synthetic */ ValueAnimator d;

                RunnableC0130c(View view, whe wheVar, a aVar, ValueAnimator valueAnimator) {
                    this.a = view;
                    this.b = wheVar;
                    this.c = aVar;
                    this.d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m(this.a, this.b, this.c);
                    this.d.start();
                }
            }

            a(View view, b bVar) {
                this.a = bVar;
                kie kieVarF = k7e.F(view);
                this.b = kieVarF != null ? new kie.a(kieVarF).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.b = kie.G(windowInsets, view);
                    return c.n(view, windowInsets);
                }
                kie kieVarG = kie.G(windowInsets, view);
                if (this.b == null) {
                    this.b = k7e.F(view);
                }
                if (this.b == null) {
                    this.b = kieVarG;
                    return c.n(view, windowInsets);
                }
                b bVarO = c.o(view);
                if (bVarO != null && Objects.equals(bVarO.a, kieVarG)) {
                    return c.n(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.f(kieVarG, this.b, iArr, iArr2);
                int i = iArr[0];
                int i2 = iArr2[0];
                int i3 = i | i2;
                if (i3 == 0) {
                    this.b = kieVarG;
                    return c.n(view, windowInsets);
                }
                kie kieVar = this.b;
                whe wheVar = new whe(i3, c.h(i, i2), (kie.s.d() & i3) != 0 ? 160L : 250L);
                wheVar.f(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(wheVar.b());
                a aVarG = c.g(kieVarG, kieVar, i3);
                c.k(view, wheVar, kieVarG, false);
                duration.addUpdateListener(new C0129a(wheVar, kieVarG, kieVar, i3, view));
                duration.addListener(new b(wheVar, view));
                hs8.a(view, new RunnableC0130c(view, wheVar, aVarG, duration));
                this.b = kieVarG;
                return c.n(view, windowInsets);
            }
        }

        c(int i2, Interpolator interpolator, long j) {
            super(i2, interpolator, j);
        }

        static void f(kie kieVar, kie kieVar2, int[] iArr, int[] iArr2) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                uy5 uy5VarG = kieVar.g(i2);
                uy5 uy5VarG2 = kieVar2.g(i2);
                int i3 = uy5VarG.a;
                int i4 = uy5VarG2.a;
                boolean z = i3 > i4 || uy5VarG.b > uy5VarG2.b || uy5VarG.c > uy5VarG2.c || uy5VarG.d > uy5VarG2.d;
                if (z != (i3 < i4 || uy5VarG.b < uy5VarG2.b || uy5VarG.c < uy5VarG2.c || uy5VarG.d < uy5VarG2.d)) {
                    if (z) {
                        iArr[0] = iArr[0] | i2;
                    } else {
                        iArr2[0] = iArr2[0] | i2;
                    }
                }
            }
        }

        static a g(kie kieVar, kie kieVar2, int i2) {
            uy5 uy5VarG = kieVar.g(i2);
            uy5 uy5VarG2 = kieVar2.g(i2);
            return new a(uy5.d(Math.min(uy5VarG.a, uy5VarG2.a), Math.min(uy5VarG.b, uy5VarG2.b), Math.min(uy5VarG.c, uy5VarG2.c), Math.min(uy5VarG.d, uy5VarG2.d)), uy5.d(Math.max(uy5VarG.a, uy5VarG2.a), Math.max(uy5VarG.b, uy5VarG2.b), Math.max(uy5VarG.c, uy5VarG2.c), Math.max(uy5VarG.d, uy5VarG2.d)));
        }

        static Interpolator h(int i2, int i3) {
            if ((kie.s.d() & i2) != 0) {
                return f;
            }
            if ((kie.s.d() & i3) != 0) {
                return g;
            }
            if ((i2 & kie.s.i()) != 0) {
                return h;
            }
            if ((kie.s.i() & i3) != 0) {
                return i;
            }
            return null;
        }

        private static View.OnApplyWindowInsetsListener i(View view, b bVar) {
            return new a(view, bVar);
        }

        static void j(View view, whe wheVar) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.c(wheVar);
                if (bVarO.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    j(viewGroup.getChildAt(i2), wheVar);
                }
            }
        }

        static void k(View view, whe wheVar, kie kieVar, boolean z) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.a = kieVar;
                if (!z) {
                    bVarO.d(wheVar);
                    z = bVarO.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    k(viewGroup.getChildAt(i2), wheVar, kieVar, z);
                }
            }
        }

        static void l(View view, kie kieVar, List<whe> list) {
            b bVarO = o(view);
            if (bVarO != null) {
                kieVar = bVarO.e(kieVar, list);
                if (bVarO.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    l(viewGroup.getChildAt(i2), kieVar, list);
                }
            }
        }

        static void m(View view, whe wheVar, a aVar) {
            b bVarO = o(view);
            if (bVarO != null) {
                bVarO.f(wheVar, aVar);
                if (bVarO.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    m(viewGroup.getChildAt(i2), wheVar, aVar);
                }
            }
        }

        static WindowInsets n(View view, WindowInsets windowInsets) {
            return view.getTag(bz9.M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b o(View view) {
            Object tag = view.getTag(bz9.S);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }

        static kie p(kie kieVar, kie kieVar2, float f2, int i2) {
            kie.a aVar = new kie.a(kieVar);
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) == 0) {
                    aVar.b(i3, kieVar.g(i3));
                } else {
                    uy5 uy5VarG = kieVar.g(i3);
                    uy5 uy5VarG2 = kieVar2.g(i3);
                    float f3 = 1.0f - f2;
                    aVar.b(i3, kie.r(uy5VarG, (int) (((double) ((uy5VarG.a - uy5VarG2.a) * f3)) + 0.5d), (int) (((double) ((uy5VarG.b - uy5VarG2.b) * f3)) + 0.5d), (int) (((double) ((uy5VarG.c - uy5VarG2.c) * f3)) + 0.5d), (int) (((double) ((uy5VarG.d - uy5VarG2.d) * f3)) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void q(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerI = bVar != null ? i(view, bVar) : null;
            view.setTag(bz9.S, onApplyWindowInsetsListenerI);
            if (view.getTag(bz9.L) == null && view.getTag(bz9.M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerI);
            }
        }
    }

    private static class e {
        private final int a;
        private float b;
        private final Interpolator c;
        private final long d;
        private float e = 1.0f;

        e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public float a() {
            return this.e;
        }

        public long b() {
            return this.d;
        }

        public float c() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int d() {
            return this.a;
        }

        public void e(float f) {
            this.b = f;
        }
    }

    public whe(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i, interpolator, j);
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    static void e(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.i(view, bVar);
        } else {
            c.q(view, bVar);
        }
    }

    static whe g(WindowInsetsAnimation windowInsetsAnimation) {
        return new whe(windowInsetsAnimation);
    }

    public float a() {
        return this.a.a();
    }

    public long b() {
        return this.a.b();
    }

    public float c() {
        return this.a.c();
    }

    public int d() {
        return this.a.d();
    }

    public void f(float f) {
        this.a.e(f);
    }

    private static class d extends e {
        private final WindowInsetsAnimation f;

        private static class a extends WindowInsetsAnimation$Callback {
            private final b a;
            private List<whe> b;
            private ArrayList<whe> c;
            private final HashMap<WindowInsetsAnimation, whe> d;

            a(b bVar) {
                super(bVar.b());
                this.d = new HashMap<>();
                this.a = bVar;
            }

            private whe a(WindowInsetsAnimation windowInsetsAnimation) {
                whe wheVar = this.d.get(windowInsetsAnimation);
                if (wheVar != null) {
                    return wheVar;
                }
                whe wheVarG = whe.g(windowInsetsAnimation);
                this.d.put(windowInsetsAnimation, wheVarG);
                return wheVarG;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<whe> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<whe> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = iie.a(list.get(size));
                    whe wheVarA = a(windowInsetsAnimationA);
                    wheVarA.f(windowInsetsAnimationA.getFraction());
                    this.c.add(wheVarA);
                }
                return this.a.e(kie.F(windowInsets), this.b).E();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.f(a(windowInsetsAnimation), a.e(bounds)).d();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds f(a aVar) {
            yhe.a();
            return hie.a(aVar.a().g(), aVar.b().g());
        }

        public static uy5 g(WindowInsetsAnimation.Bounds bounds) {
            return uy5.f(bounds.getUpperBound());
        }

        public static uy5 h(WindowInsetsAnimation.Bounds bounds) {
            return uy5.f(bounds.getLowerBound());
        }

        public static void i(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // com.google.android.whe.e
        public float a() {
            return this.f.getAlpha();
        }

        @Override // com.google.android.whe.e
        public long b() {
            return this.f.getDurationMillis();
        }

        @Override // com.google.android.whe.e
        public float c() {
            return this.f.getInterpolatedFraction();
        }

        @Override // com.google.android.whe.e
        public int d() {
            return this.f.getTypeMask();
        }

        @Override // com.google.android.whe.e
        public void e(float f) {
            this.f.setFraction(f);
        }

        d(int i, Interpolator interpolator, long j) {
            this(gie.a(i, interpolator, j));
        }
    }

    public static final class a {
        private final uy5 a;
        private final uy5 b;

        public a(uy5 uy5Var, uy5 uy5Var2) {
            this.a = uy5Var;
            this.b = uy5Var2;
        }

        public static a e(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public uy5 a() {
            return this.a;
        }

        public uy5 b() {
            return this.b;
        }

        public a c(uy5 uy5Var) {
            return new a(kie.r(this.a, uy5Var.a, uy5Var.b, uy5Var.c, uy5Var.d), kie.r(this.b, uy5Var.a, uy5Var.b, uy5Var.c, uy5Var.d));
        }

        public WindowInsetsAnimation.Bounds d() {
            return d.f(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.h(bounds);
            this.b = d.g(bounds);
        }
    }

    private whe(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        this.a = new d(windowInsetsAnimation);
    }
}
