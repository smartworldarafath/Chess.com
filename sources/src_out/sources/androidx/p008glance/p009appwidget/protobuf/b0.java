package androidx.p008glance.p009appwidget.protobuf;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class b0 implements v0 {
    private static final h0 b = new a();
    private final h0 a;

    class a implements h0 {
        a() {
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.h0
        public g0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.h0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            a = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements h0 {
        private h0[] a;

        c(h0... h0VarArr) {
            this.a = h0VarArr;
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.h0
        public g0 a(Class<?> cls) {
            for (h0 h0Var : this.a) {
                if (h0Var.b(cls)) {
                    return h0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.h0
        public boolean b(Class<?> cls) {
            for (h0 h0Var : this.a) {
                if (h0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public b0() {
        this(c());
    }

    private static boolean b(g0 g0Var) {
        return b.a[g0Var.getSyntax().ordinal()] != 1;
    }

    private static h0 c() {
        return new c(s.c(), d());
    }

    private static h0 d() {
        if (q0.d) {
            return b;
        }
        try {
            return (h0) Class.forName("androidx.glance.appwidget.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    private static <T> u0<T> e(Class<T> cls, g0 g0Var) {
        if (f(cls)) {
            return k0.O(cls, g0Var, o0.b(), z.b(), w0.L(), b(g0Var) ? o.b() : null, f0.b());
        }
        m0 m0VarA = o0.a();
        m<?> mVarA = null;
        x xVarA = z.a();
        a1<?, ?> a1VarK = w0.K();
        if (b(g0Var)) {
            mVarA = o.a();
        }
        return k0.O(cls, g0Var, m0VarA, xVarA, a1VarK, mVarA, f0.a());
    }

    private static boolean f(Class<?> cls) {
        return q0.d || GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.p008glance.p009appwidget.protobuf.v0
    public <T> u0<T> a(Class<T> cls) {
        w0.H(cls);
        g0 g0VarA = this.a.a(cls);
        if (g0VarA.a()) {
            return f(cls) ? l0.l(w0.L(), o.b(), g0VarA.b()) : l0.l(w0.K(), o.a(), g0VarA.b());
        }
        return e(cls, g0VarA);
    }

    private b0(h0 h0Var) {
        this.a = (h0) u.b(h0Var, "messageInfoFactory");
    }
}
