package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class d1 {
    private static final Unsafe a = A();
    private static final Class<?> b = androidx.datastore.preferences.protobuf.d.b();
    private static final boolean c = m(Long.TYPE);
    private static final boolean d = m(Integer.TYPE);
    private static final e e = y();
    private static final boolean f = Q();
    private static final boolean g = P();
    static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;
    private static final long p;
    private static final long q;
    private static final long r;
    private static final long s;
    private static final long t;
    private static final long u;
    private static final int v;
    static final boolean w;

    class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public boolean c(Object obj, long j) {
            return d1.w ? d1.q(obj, j) : d1.r(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public double d(Object obj, long j) {
            return Double.longBitsToDouble(g(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public float e(Object obj, long j) {
            return Float.intBitsToFloat(f(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void j(Object obj, long j, boolean z) {
            if (d1.w) {
                d1.F(obj, j, z);
            } else {
                d1.G(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void k(Object obj, long j, byte b) {
            if (d1.w) {
                d1.I(obj, j, b);
            } else {
                d1.J(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void l(Object obj, long j, double d) {
            o(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void m(Object obj, long j, float f) {
            n(obj, j, Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public boolean c(Object obj, long j) {
            return d1.w ? d1.q(obj, j) : d1.r(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public double d(Object obj, long j) {
            return Double.longBitsToDouble(g(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public float e(Object obj, long j) {
            return Float.intBitsToFloat(f(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void j(Object obj, long j, boolean z) {
            if (d1.w) {
                d1.F(obj, j, z);
            } else {
                d1.G(obj, j, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void k(Object obj, long j, byte b) {
            if (d1.w) {
                d1.I(obj, j, b);
            } else {
                d1.J(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void l(Object obj, long j, double d) {
            o(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void m(Object obj, long j, float f) {
            n(obj, j, Float.floatToIntBits(f));
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public boolean r() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public boolean c(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public double d(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public float e(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void j(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void k(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void l(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public void m(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                d1.D(th);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.d1.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                d1.D(th);
                return false;
            }
        }
    }

    private static abstract class e {
        Unsafe a;

        e(Unsafe unsafe) {
            this.a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j);

        public abstract double d(Object obj, long j);

        public abstract float e(Object obj, long j);

        public final int f(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long g(Object obj, long j) {
            return this.a.getLong(obj, j);
        }

        public final Object h(Object obj, long j) {
            return this.a.getObject(obj, j);
        }

        public final long i(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j, boolean z);

        public abstract void k(Object obj, long j, byte b);

        public abstract void l(Object obj, long j, double d);

        public abstract void m(Object obj, long j, float f);

        public final void n(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void o(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public final void p(Object obj, long j, Object obj2) {
            this.a.putObject(obj, j, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                d1.D(th);
                return false;
            }
        }

        public boolean r() {
            Unsafe unsafe = this.a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return d1.l() != null;
            } catch (Throwable th) {
                d1.D(th);
                return false;
            }
        }
    }

    static {
        long j2 = j(byte[].class);
        h = j2;
        i = j(boolean[].class);
        j = k(boolean[].class);
        k = j(int[].class);
        l = k(int[].class);
        m = j(long[].class);
        n = k(long[].class);
        o = j(float[].class);
        p = k(float[].class);
        q = j(double[].class);
        r = k(double[].class);
        s = j(Object[].class);
        t = k(Object[].class);
        u = o(l());
        v = (int) (j2 & 7);
        w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private d1() {
    }

    static Unsafe A() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean B() {
        return g;
    }

    static boolean C() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void D(Throwable th) {
        Logger.getLogger(d1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void E(Object obj, long j2, boolean z) {
        e.j(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j2, boolean z) {
        I(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j2, boolean z) {
        J(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j2, byte b2) {
        e.k(bArr, h + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int iW = w(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (iW & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        M(obj, j3, ((255 & b2) << i2) | (w(obj, j3) & (~(255 << i2))));
    }

    static void K(Object obj, long j2, double d2) {
        e.l(obj, j2, d2);
    }

    static void L(Object obj, long j2, float f2) {
        e.m(obj, j2, f2);
    }

    static void M(Object obj, long j2, int i2) {
        e.n(obj, j2, i2);
    }

    static void N(Object obj, long j2, long j3) {
        e.o(obj, j2, j3);
    }

    static void O(Object obj, long j2, Object obj2) {
        e.p(obj, j2, obj2);
    }

    private static boolean P() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.q();
    }

    private static boolean Q() {
        e eVar = e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static int j(Class<?> cls) {
        if (g) {
            return e.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (g) {
            return e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field fieldN;
        if (androidx.datastore.preferences.protobuf.d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    static boolean m(Class<?> cls) {
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = e) == null) {
            return -1L;
        }
        return eVar.i(field);
    }

    static boolean p(Object obj, long j2) {
        return e.c(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j2) {
        return s(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j2) {
        return t(obj, j2) != 0;
    }

    private static byte s(Object obj, long j2) {
        return (byte) ((w(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255);
    }

    private static byte t(Object obj, long j2) {
        return (byte) ((w(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    static double u(Object obj, long j2) {
        return e.d(obj, j2);
    }

    static float v(Object obj, long j2) {
        return e.e(obj, j2);
    }

    static int w(Object obj, long j2) {
        return e.f(obj, j2);
    }

    static long x(Object obj, long j2) {
        return e.g(obj, j2);
    }

    private static e y() {
        Unsafe unsafe = a;
        if (unsafe == null) {
            return null;
        }
        if (!androidx.datastore.preferences.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (c) {
            return new c(unsafe);
        }
        if (d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object z(Object obj, long j2) {
        return e.h(obj, j2);
    }
}
