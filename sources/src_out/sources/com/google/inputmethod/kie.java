package com.google.inputmethod;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class kie {
    public static final kie b;
    private final r a;

    private static class d extends c {
        d() {
        }

        @Override // com.google.android.kie.i
        void d(int i, uy5 uy5Var) {
            this.f.setInsets(t.a(i), uy5Var.g());
        }

        d(kie kieVar) {
            super(kieVar);
        }
    }

    private static class e extends d {
        e() {
        }

        e(kie kieVar) {
            super(kieVar);
        }
    }

    private static class f extends e {
        f() {
        }

        @Override // com.google.android.kie.d, com.google.android.kie.i
        void d(int i, uy5 uy5Var) {
            this.f.setInsets(u.a(i), uy5Var.g());
        }

        f(kie kieVar) {
            super(kieVar);
        }
    }

    private static class h extends g {
        h() {
        }

        h(kie kieVar) {
            super(kieVar);
        }
    }

    private static class i {
        private final kie a;
        uy5[] b;
        bd3 c;
        Rect[][] d;
        Rect[][] e;

        i() {
            this(new kie((kie) null));
        }

        protected final void a() {
            uy5[] uy5VarArr = this.b;
            if (uy5VarArr != null) {
                uy5 uy5VarG = uy5VarArr[s.e(1)];
                uy5 uy5VarG2 = this.b[s.e(2)];
                if (uy5VarG2 == null) {
                    uy5VarG2 = this.a.g(2);
                }
                if (uy5VarG == null) {
                    uy5VarG = this.a.g(1);
                }
                h(uy5.b(uy5VarG, uy5VarG2));
                uy5 uy5Var = this.b[s.e(16)];
                if (uy5Var != null) {
                    g(uy5Var);
                }
                uy5 uy5Var2 = this.b[s.e(32)];
                if (uy5Var2 != null) {
                    e(uy5Var2);
                }
                uy5 uy5Var3 = this.b[s.e(64)];
                if (uy5Var3 != null) {
                    i(uy5Var3);
                }
            }
        }

        kie b() {
            throw null;
        }

        void c(kie kieVar) {
            for (int i = 1; i <= 512; i <<= 1) {
                List<Rect> listD = kieVar.d(i);
                int iE = s.e(i);
                this.d[iE] = (Rect[]) listD.toArray(new Rect[listD.size()]);
                if (i != 8) {
                    List<Rect> listE = kieVar.e(i);
                    this.e[iE] = (Rect[]) listE.toArray(new Rect[listE.size()]);
                }
            }
        }

        void d(int i, uy5 uy5Var) {
            if (this.b == null) {
                this.b = new uy5[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[s.e(i2)] = uy5Var;
                }
            }
        }

        void e(uy5 uy5Var) {
        }

        void f(uy5 uy5Var) {
            throw null;
        }

        void g(uy5 uy5Var) {
        }

        void h(uy5 uy5Var) {
            throw null;
        }

        void i(uy5 uy5Var) {
        }

        i(kie kieVar) {
            this.d = new Rect[10][];
            this.e = new Rect[10][];
            this.a = kieVar;
            c(kieVar);
        }
    }

    private static class l extends k {
        l(kie kieVar, WindowInsets windowInsets) {
            super(kieVar, windowInsets);
        }

        @Override // com.google.android.kie.r
        kie a() {
            return kie.F(this.c.consumeDisplayCutout());
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Objects.equals(this.c, lVar.c) && Objects.equals(this.g, lVar.g) && j.M(this.h, lVar.h);
        }

        @Override // com.google.android.kie.r
        yc3 h() {
            return yc3.h(this.c.getDisplayCutout());
        }

        @Override // com.google.android.kie.r
        public int hashCode() {
            return this.c.hashCode();
        }

        l(kie kieVar, l lVar) {
            super(kieVar, lVar);
        }
    }

    private static class n extends m {
        static final kie w = kie.F(WindowInsets.CONSUMED);

        n(kie kieVar, WindowInsets windowInsets) {
            super(kieVar, windowInsets);
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        final void d(View view) {
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        public uy5 i(int i) {
            return uy5.f(this.c.getInsets(t.a(i)));
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        public uy5 j(int i) {
            return uy5.f(this.c.getInsetsIgnoringVisibility(t.a(i)));
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        public boolean u(int i) {
            return this.c.isVisible(t.a(i));
        }

        n(kie kieVar, n nVar) {
            super(kieVar, nVar);
        }
    }

    private static class o extends n {
        o(kie kieVar, WindowInsets windowInsets) {
            super(kieVar, windowInsets);
        }

        o(kie kieVar, o oVar) {
            super(kieVar, oVar);
        }
    }

    private static class p extends o {
        static final kie x = kie.F(WindowInsets.CONSUMED);

        p(kie kieVar, WindowInsets windowInsets) {
            super(kieVar, windowInsets);
        }

        @Override // com.google.android.kie.n, com.google.android.kie.j, com.google.android.kie.r
        public uy5 i(int i) {
            return uy5.f(this.c.getInsets(u.a(i)));
        }

        @Override // com.google.android.kie.n, com.google.android.kie.j, com.google.android.kie.r
        public uy5 j(int i) {
            return uy5.f(this.c.getInsetsIgnoringVisibility(u.a(i)));
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        void p(View view) {
        }

        @Override // com.google.android.kie.n, com.google.android.kie.j, com.google.android.kie.r
        public boolean u(int i) {
            return this.c.isVisible(u.a(i));
        }

        p(kie kieVar, p pVar) {
            super(kieVar, pVar);
        }
    }

    private static class q extends p {
        q(kie kieVar, WindowInsets windowInsets) {
            super(kieVar, windowInsets);
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        List<Rect> f(int i) {
            return this.c.getBoundingRects(u.a(i));
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        List<Rect> g(int i) {
            return this.c.getBoundingRectsIgnoringVisibility(u.a(i));
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        void q() {
        }

        q(kie kieVar, q qVar) {
            super(kieVar, qVar);
        }
    }

    private static class r {
        static final kie b = new a().a().a().b().c();
        final kie a;

        r(kie kieVar) {
            this.a = kieVar;
        }

        void A(int i) {
        }

        void B(Rect[][] rectArr) {
        }

        void C(Rect[][] rectArr) {
        }

        kie a() {
            return this.a;
        }

        kie b() {
            return this.a;
        }

        kie c() {
            return this.a;
        }

        void d(View view) {
        }

        void e(kie kieVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return t() == rVar.t() && s() == rVar.s() && mm8.a(n(), rVar.n()) && mm8.a(l(), rVar.l()) && mm8.a(h(), rVar.h());
        }

        List<Rect> f(int i) {
            return Collections.EMPTY_LIST;
        }

        List<Rect> g(int i) {
            return Collections.EMPTY_LIST;
        }

        yc3 h() {
            return null;
        }

        public int hashCode() {
            return mm8.b(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
        }

        uy5 i(int i) {
            return uy5.e;
        }

        uy5 j(int i) {
            if ((i & 8) == 0) {
                return uy5.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        uy5 k() {
            return n();
        }

        uy5 l() {
            return uy5.e;
        }

        uy5 m() {
            return n();
        }

        uy5 n() {
            return uy5.e;
        }

        uy5 o() {
            return n();
        }

        void p(View view) {
        }

        void q() {
        }

        kie r(int i, int i2, int i3, int i4) {
            return b;
        }

        boolean s() {
            return false;
        }

        boolean t() {
            return false;
        }

        boolean u(int i) {
            return true;
        }

        public void v(bd3 bd3Var) {
        }

        public void w(uy5[] uy5VarArr) {
        }

        void x(uy5 uy5Var) {
        }

        void y(kie kieVar) {
        }

        public void z(uy5 uy5Var) {
        }
    }

    public static final class s {
        static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        static int e(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            if (i == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 519;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    private static final class t {
        static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    private static final class u {
        static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            b = p.x;
        } else if (i2 >= 30) {
            b = n.w;
        } else {
            b = r.b;
        }
    }

    private kie(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            this.a = new q(this, windowInsets);
            return;
        }
        if (i2 >= 34) {
            this.a = new p(this, windowInsets);
            return;
        }
        if (i2 >= 31) {
            this.a = new o(this, windowInsets);
            return;
        }
        if (i2 >= 30) {
            this.a = new n(this, windowInsets);
        } else if (i2 >= 29) {
            this.a = new m(this, windowInsets);
        } else {
            this.a = new l(this, windowInsets);
        }
    }

    public static kie F(WindowInsets windowInsets) {
        return G(windowInsets, null);
    }

    public static kie G(WindowInsets windowInsets, View view) {
        kie kieVar = new kie((WindowInsets) di9.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            kieVar.z(k7e.F(view));
            kieVar.p(view.getRootView());
            kieVar.B(view.getWindowSystemUiVisibility());
        }
        return kieVar;
    }

    static uy5 r(uy5 uy5Var, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, uy5Var.a - i2);
        int iMax2 = Math.max(0, uy5Var.b - i3);
        int iMax3 = Math.max(0, uy5Var.c - i4);
        int iMax4 = Math.max(0, uy5Var.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? uy5Var : uy5.d(iMax, iMax2, iMax3, iMax4);
    }

    void A(uy5 uy5Var) {
        this.a.z(uy5Var);
    }

    void B(int i2) {
        this.a.A(i2);
    }

    void C(Rect[][] rectArr) {
        this.a.B(rectArr);
    }

    void D(Rect[][] rectArr) {
        this.a.C(rectArr);
    }

    public WindowInsets E() {
        r rVar = this.a;
        if (rVar instanceof j) {
            return ((j) rVar).c;
        }
        return null;
    }

    @Deprecated
    public kie a() {
        return this.a.a();
    }

    @Deprecated
    public kie b() {
        return this.a.b();
    }

    @Deprecated
    public kie c() {
        return this.a.c();
    }

    public List<Rect> d(int i2) {
        return this.a.f(i2);
    }

    public List<Rect> e(int i2) {
        return this.a.g(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kie) {
            return mm8.a(this.a, ((kie) obj).a);
        }
        return false;
    }

    public yc3 f() {
        return this.a.h();
    }

    public uy5 g(int i2) {
        return this.a.i(i2);
    }

    public uy5 h(int i2) {
        return this.a.j(i2);
    }

    public int hashCode() {
        r rVar = this.a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    @Deprecated
    public uy5 i() {
        return this.a.l();
    }

    @Deprecated
    public uy5 j() {
        return this.a.m();
    }

    @Deprecated
    public int k() {
        return this.a.n().d;
    }

    @Deprecated
    public int l() {
        return this.a.n().a;
    }

    @Deprecated
    public int m() {
        return this.a.n().c;
    }

    @Deprecated
    public int n() {
        return this.a.n().b;
    }

    public boolean o() {
        uy5 uy5VarG = g(s.a());
        uy5 uy5Var = uy5.e;
        return (uy5VarG.equals(uy5Var) && h(s.a() ^ s.d()).equals(uy5Var) && f() == null) ? false : true;
    }

    void p(View view) {
        this.a.d(view);
        this.a.p(view);
        this.a.q();
    }

    public kie q(int i2, int i3, int i4, int i5) {
        return this.a.r(i2, i3, i4, i5);
    }

    public boolean s() {
        return this.a.s();
    }

    public boolean t() {
        return this.a.t();
    }

    public boolean u(int i2) {
        return this.a.u(i2);
    }

    @Deprecated
    public kie v(int i2, int i3, int i4, int i5) {
        return new a(this).d(uy5.d(i2, i3, i4, i5)).a();
    }

    void w(bd3 bd3Var) {
        this.a.v(bd3Var);
    }

    void x(uy5[] uy5VarArr) {
        this.a.w(uy5VarArr);
    }

    void y(uy5 uy5Var) {
        this.a.x(uy5Var);
    }

    void z(kie kieVar) {
        this.a.y(kieVar);
    }

    private static class b extends i {
        private static Field h = null;
        private static boolean i = false;
        private static Constructor<WindowInsets> j = null;
        private static boolean k = false;
        private WindowInsets f;
        private uy5 g;

        b() {
            this.f = j();
        }

        private static WindowInsets j() {
            if (!i) {
                try {
                    h = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                i = true;
            }
            Field field = h;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!k) {
                try {
                    j = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                k = true;
            }
            Constructor<WindowInsets> constructor = j;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // com.google.android.kie.i
        kie b() {
            a();
            kie kieVarF = kie.F(this.f);
            kieVarF.x(this.b);
            kieVarF.A(this.g);
            kieVarF.w(this.c);
            kieVarF.C(this.d);
            kieVarF.D(this.e);
            return kieVarF;
        }

        @Override // com.google.android.kie.i
        void f(uy5 uy5Var) {
            this.g = uy5Var;
        }

        @Override // com.google.android.kie.i
        void h(uy5 uy5Var) {
            WindowInsets windowInsets = this.f;
            if (windowInsets != null) {
                this.f = windowInsets.replaceSystemWindowInsets(uy5Var.a, uy5Var.b, uy5Var.c, uy5Var.d);
            }
        }

        b(kie kieVar) {
            super(kieVar);
            this.f = kieVar.E();
        }
    }

    private static class c extends i {
        final WindowInsets.Builder f;

        c() {
            this.f = t1c.a();
        }

        @Override // com.google.android.kie.i
        kie b() {
            a();
            kie kieVarF = kie.F(this.f.build());
            kieVarF.x(this.b);
            kieVarF.w(this.c);
            kieVarF.C(this.d);
            kieVarF.D(this.e);
            return kieVarF;
        }

        @Override // com.google.android.kie.i
        void e(uy5 uy5Var) {
            this.f.setMandatorySystemGestureInsets(uy5Var.g());
        }

        @Override // com.google.android.kie.i
        void f(uy5 uy5Var) {
            this.f.setStableInsets(uy5Var.g());
        }

        @Override // com.google.android.kie.i
        void g(uy5 uy5Var) {
            this.f.setSystemGestureInsets(uy5Var.g());
        }

        @Override // com.google.android.kie.i
        void h(uy5 uy5Var) {
            this.f.setSystemWindowInsets(uy5Var.g());
        }

        @Override // com.google.android.kie.i
        void i(uy5 uy5Var) {
            this.f.setTappableElementInsets(uy5Var.g());
        }

        c(kie kieVar) {
            WindowInsets.Builder builderA;
            super(kieVar);
            WindowInsets windowInsetsE = kieVar.E();
            if (windowInsetsE != null) {
                builderA = qie.a(windowInsetsE);
            } else {
                builderA = t1c.a();
            }
            this.f = builderA;
        }
    }

    private static class k extends j {
        private uy5 s;

        k(kie kieVar, WindowInsets windowInsets) {
            super(kieVar, windowInsets);
            this.s = null;
        }

        @Override // com.google.android.kie.r
        kie b() {
            return kie.F(this.c.consumeStableInsets());
        }

        @Override // com.google.android.kie.r
        kie c() {
            return kie.F(this.c.consumeSystemWindowInsets());
        }

        @Override // com.google.android.kie.r
        final uy5 l() {
            if (this.s == null) {
                this.s = uy5.d(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.s;
        }

        @Override // com.google.android.kie.r
        boolean s() {
            return this.c.isConsumed();
        }

        @Override // com.google.android.kie.r
        public void z(uy5 uy5Var) {
            this.s = uy5Var;
        }

        k(kie kieVar, k kVar) {
            super(kieVar, kVar);
            this.s = null;
            this.s = kVar.s;
        }
    }

    private static class g extends f {
        private boolean g;
        private boolean h;

        g() {
            this.g = false;
            this.h = false;
        }

        @Override // com.google.android.kie.i
        void c(kie kieVar) {
        }

        @Override // com.google.android.kie.f, com.google.android.kie.d, com.google.android.kie.i
        void d(int i, uy5 uy5Var) {
            super.d(i, uy5Var);
            this.g = true;
        }

        g(kie kieVar) {
            super(kieVar);
            this.g = false;
            this.h = false;
            if (kieVar.s()) {
                return;
            }
            this.g = true;
            this.h = true;
        }
    }

    private static class m extends l {
        private uy5 t;
        private uy5 u;
        private uy5 v;

        m(kie kieVar, WindowInsets windowInsets) {
            super(kieVar, windowInsets);
            this.t = null;
            this.u = null;
            this.v = null;
        }

        @Override // com.google.android.kie.r
        uy5 k() {
            if (this.u == null) {
                this.u = uy5.f(this.c.getMandatorySystemGestureInsets());
            }
            return this.u;
        }

        @Override // com.google.android.kie.r
        uy5 m() {
            if (this.t == null) {
                this.t = uy5.f(this.c.getSystemGestureInsets());
            }
            return this.t;
        }

        @Override // com.google.android.kie.r
        uy5 o() {
            if (this.v == null) {
                this.v = uy5.f(this.c.getTappableElementInsets());
            }
            return this.v;
        }

        @Override // com.google.android.kie.j, com.google.android.kie.r
        kie r(int i, int i2, int i3, int i4) {
            return kie.F(this.c.inset(i, i2, i3, i4));
        }

        @Override // com.google.android.kie.k, com.google.android.kie.r
        public void z(uy5 uy5Var) {
        }

        m(kie kieVar, m mVar) {
            super(kieVar, mVar);
            this.t = null;
            this.u = null;
            this.v = null;
        }
    }

    private static class j extends r {
        private static boolean n = false;
        private static Method o;
        private static Class<?> p;
        private static Field q;
        private static Field r;
        final WindowInsets c;
        private uy5[] d;
        private uy5 e;
        private kie f;
        uy5 g;
        int h;
        bd3 i;
        int j;
        int k;
        private Rect[][] l;
        private Rect[][] m;

        j(kie kieVar, WindowInsets windowInsets) {
            super(kieVar);
            this.e = null;
            this.l = new Rect[10][];
            this.m = new Rect[10][];
            this.c = windowInsets;
        }

        private bd3 D(View view) {
            Display display;
            if (view == null || (display = view.getDisplay()) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (this.a.t()) {
                return bd3.a(point.x, point.y, true, 0, 0, 0, 0);
            }
            jqa jqaVarA = wc3.a(display, 0);
            jqa jqaVarA2 = wc3.a(display, 1);
            jqa jqaVarA3 = wc3.a(display, 2);
            jqa jqaVarA4 = wc3.a(display, 3);
            return bd3.a(point.x, point.y, false, jqaVarA != null ? jqaVarA.b() : 0, jqaVarA2 != null ? jqaVarA2.b() : 0, jqaVarA3 != null ? jqaVarA3.b() : 0, jqaVarA4 != null ? jqaVarA4.b() : 0);
        }

        private static List<Rect> E(Rect[][] rectArr, int i) {
            Rect[] rectArr2;
            Rect[] rectArr3 = null;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && (rectArr2 = rectArr[s.e(i2)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                        System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                        System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                        rectArr3 = rectArr4;
                    }
                }
            }
            return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
        }

        private Rect[] F(uy5 uy5Var) {
            ArrayList arrayList = new ArrayList();
            if (uy5Var.a != 0) {
                arrayList.add(new Rect(0, 0, uy5Var.a, this.j));
            }
            if (uy5Var.b != 0) {
                arrayList.add(new Rect(0, 0, this.k, uy5Var.b));
            }
            if (uy5Var.c != 0) {
                int i = this.k;
                arrayList.add(new Rect(i - uy5Var.c, 0, i, this.j));
            }
            if (uy5Var.d != 0) {
                int i2 = this.j;
                arrayList.add(new Rect(0, i2 - uy5Var.d, this.k, i2));
            }
            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
        }

        private uy5 G(int i, boolean z) {
            uy5 uy5VarB = uy5.e;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    uy5VarB = uy5.b(uy5VarB, H(i2, z));
                }
            }
            return uy5VarB;
        }

        private uy5 I() {
            kie kieVar = this.f;
            return kieVar != null ? kieVar.i() : uy5.e;
        }

        private uy5 J(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!n) {
                L();
            }
            Method method = o;
            if (method != null && p != null && q != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) q.get(r.get(objInvoke));
                    if (rect != null) {
                        return uy5.e(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    e.getMessage();
                }
            }
            return null;
        }

        private static void L() {
            try {
                o = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                p = cls;
                q = cls.getDeclaredField("mVisibleInsets");
                r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                q.setAccessible(true);
                r.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            n = true;
        }

        static boolean M(int i, int i2) {
            return (i & 6) == (i2 & 6);
        }

        @Override // com.google.android.kie.r
        void A(int i) {
            this.h = i;
        }

        @Override // com.google.android.kie.r
        void B(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.l = (Rect[][]) rectArr.clone();
        }

        @Override // com.google.android.kie.r
        void C(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.m = (Rect[][]) rectArr.clone();
        }

        protected uy5 H(int i, boolean z) {
            uy5 uy5VarI;
            int i2;
            if (i == 1) {
                if (z) {
                    return uy5.d(0, Math.max(I().b, n().b), 0, 0);
                }
                return (this.h & 4) != 0 ? uy5.e : uy5.d(0, n().b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    uy5 uy5VarI2 = I();
                    uy5 uy5VarL = l();
                    return uy5.d(Math.max(uy5VarI2.a, uy5VarL.a), 0, Math.max(uy5VarI2.c, uy5VarL.c), Math.max(uy5VarI2.d, uy5VarL.d));
                }
                if ((this.h & 2) != 0) {
                    return uy5.e;
                }
                uy5 uy5VarN = n();
                kie kieVar = this.f;
                uy5VarI = kieVar != null ? kieVar.i() : null;
                int iMin = uy5VarN.d;
                if (uy5VarI != null) {
                    iMin = Math.min(iMin, uy5VarI.d);
                }
                return uy5.d(uy5VarN.a, 0, uy5VarN.c, iMin);
            }
            if (i != 8) {
                if (i == 16) {
                    return m();
                }
                if (i == 32) {
                    return k();
                }
                if (i == 64) {
                    return o();
                }
                if (i != 128) {
                    return uy5.e;
                }
                kie kieVar2 = this.f;
                yc3 yc3VarF = kieVar2 != null ? kieVar2.f() : h();
                return yc3VarF != null ? uy5.d(yc3VarF.d(), yc3VarF.f(), yc3VarF.e(), yc3VarF.c()) : uy5.e;
            }
            uy5[] uy5VarArr = this.d;
            uy5VarI = uy5VarArr != null ? uy5VarArr[s.e(8)] : null;
            if (uy5VarI != null) {
                return uy5VarI;
            }
            uy5 uy5VarN2 = n();
            uy5 uy5VarI3 = I();
            int i3 = uy5VarN2.d;
            if (i3 > uy5VarI3.d) {
                return uy5.d(0, 0, 0, i3);
            }
            uy5 uy5Var = this.g;
            return (uy5Var == null || uy5Var.equals(uy5.e) || (i2 = this.g.d) <= uy5VarI3.d) ? uy5.e : uy5.d(0, 0, 0, i2);
        }

        protected boolean K(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !H(i, false).equals(uy5.e);
        }

        @Override // com.google.android.kie.r
        void d(View view) {
            this.k = view.getWidth();
            this.j = view.getHeight();
            uy5 uy5VarJ = J(view);
            if (uy5VarJ == null) {
                uy5VarJ = uy5.e;
            }
            x(uy5VarJ);
        }

        @Override // com.google.android.kie.r
        void e(kie kieVar) {
            kieVar.z(this.f);
            kieVar.y(this.g);
            kieVar.B(this.h);
            kieVar.w(this.i);
            kieVar.C(this.l);
            kieVar.D(this.m);
        }

        @Override // com.google.android.kie.r
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.g, jVar.g) && M(this.h, jVar.h);
        }

        @Override // com.google.android.kie.r
        List<Rect> f(int i) {
            return E(this.l, i);
        }

        @Override // com.google.android.kie.r
        List<Rect> g(int i) {
            return E(this.m, i);
        }

        @Override // com.google.android.kie.r
        public uy5 i(int i) {
            return G(i, false);
        }

        @Override // com.google.android.kie.r
        public uy5 j(int i) {
            return G(i, true);
        }

        @Override // com.google.android.kie.r
        final uy5 n() {
            if (this.e == null) {
                this.e = uy5.d(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // com.google.android.kie.r
        void p(View view) {
            this.i = D(view);
        }

        @Override // com.google.android.kie.r
        void q() {
            for (int i = 1; i <= 512; i <<= 1) {
                int iE = s.e(i);
                this.l[iE] = F(i(i));
                if (i != 8) {
                    this.m[iE] = F(j(i));
                }
            }
        }

        @Override // com.google.android.kie.r
        kie r(int i, int i2, int i3, int i4) {
            a aVar = new a(kie.F(this.c));
            aVar.d(kie.r(n(), i, i2, i3, i4));
            aVar.c(kie.r(l(), i, i2, i3, i4));
            return aVar.a();
        }

        @Override // com.google.android.kie.r
        boolean t() {
            return this.c.isRound();
        }

        @Override // com.google.android.kie.r
        boolean u(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && !K(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.kie.r
        public void v(bd3 bd3Var) {
            this.i = bd3Var;
        }

        @Override // com.google.android.kie.r
        public void w(uy5[] uy5VarArr) {
            this.d = uy5VarArr;
        }

        @Override // com.google.android.kie.r
        void x(uy5 uy5Var) {
            this.g = uy5Var;
        }

        @Override // com.google.android.kie.r
        void y(kie kieVar) {
            this.f = kieVar;
        }

        j(kie kieVar, j jVar) {
            this(kieVar, new WindowInsets(jVar.c));
        }
    }

    public static final class a {
        private final i a;

        public a() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 36) {
                this.a = new h();
                return;
            }
            if (i >= 35) {
                this.a = new g();
                return;
            }
            if (i >= 34) {
                this.a = new f();
                return;
            }
            if (i >= 31) {
                this.a = new e();
                return;
            }
            if (i >= 30) {
                this.a = new d();
            } else if (i >= 29) {
                this.a = new c();
            } else {
                this.a = new b();
            }
        }

        public kie a() {
            return this.a.b();
        }

        public a b(int i, uy5 uy5Var) {
            this.a.d(i, uy5Var);
            return this;
        }

        @Deprecated
        public a c(uy5 uy5Var) {
            this.a.f(uy5Var);
            return this;
        }

        @Deprecated
        public a d(uy5 uy5Var) {
            this.a.h(uy5Var);
            return this;
        }

        public a(kie kieVar) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 36) {
                this.a = new h(kieVar);
                return;
            }
            if (i >= 35) {
                this.a = new g(kieVar);
                return;
            }
            if (i >= 34) {
                this.a = new f(kieVar);
                return;
            }
            if (i >= 31) {
                this.a = new e(kieVar);
                return;
            }
            if (i >= 30) {
                this.a = new d(kieVar);
            } else if (i >= 29) {
                this.a = new c(kieVar);
            } else {
                this.a = new b(kieVar);
            }
        }
    }

    public kie(kie kieVar) {
        if (kieVar != null) {
            r rVar = kieVar.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35 && (rVar instanceof q)) {
                this.a = new q(this, (q) rVar);
            } else if (i2 >= 34 && (rVar instanceof p)) {
                this.a = new p(this, (p) rVar);
            } else if (i2 >= 31 && (rVar instanceof o)) {
                this.a = new o(this, (o) rVar);
            } else if (i2 >= 30 && (rVar instanceof n)) {
                this.a = new n(this, (n) rVar);
            } else if (i2 >= 29 && (rVar instanceof m)) {
                this.a = new m(this, (m) rVar);
            } else if (rVar instanceof l) {
                this.a = new l(this, (l) rVar);
            } else if (rVar instanceof k) {
                this.a = new k(this, (k) rVar);
            } else if (rVar instanceof j) {
                this.a = new j(this, (j) rVar);
            } else {
                this.a = new r(this);
            }
            rVar.e(this);
            return;
        }
        this.a = new r(this);
    }
}
