package androidx.p008glance.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.glance.layout.a, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0012\u0015\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/glance/layout/a;", "", "Landroidx/glance/layout/a$b;", "horizontal", "Landroidx/glance/layout/a$c;", "vertical", "<init>", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "f", "b", "g", "c", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Alignment {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final int d = 0;
    private static final Alignment e;
    private static final Alignment f;
    private static final Alignment g;
    private static final Alignment h;
    private static final Alignment i;
    private static final Alignment j;
    private static final Alignment k;
    private static final Alignment l;
    private static final Alignment m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final int s;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int horizontal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int vertical;

    /* JADX INFO: renamed from: androidx.glance.layout.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\u000e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/glance/layout/a$a;", "", "<init>", "()V", "Landroidx/glance/layout/a;", "TopStart", "Landroidx/glance/layout/a;", "e", "()Landroidx/glance/layout/a;", "CenterStart", "b", "Center", "a", "Landroidx/glance/layout/a$c;", "Top", "I", "d", "()I", "Landroidx/glance/layout/a$b;", "Start", "c", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Alignment a() {
            return Alignment.i;
        }

        public final Alignment b() {
            return Alignment.h;
        }

        public final int c() {
            return Alignment.q;
        }

        public final int d() {
            return Alignment.n;
        }

        public final Alignment e() {
            return Alignment.e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.glance.layout.a$b */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/glance/layout/a$b;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "b", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int c = e(0);
        private static final int d = e(1);
        private static final int e = e(2);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: androidx.glance.layout.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/glance/layout/a$b$a;", "", "<init>", "()V", "Landroidx/glance/layout/a$b;", "Start", "I", "c", "()I", "CenterHorizontally", "a", "End", "b", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.d;
            }

            public final int b() {
                return b.e;
            }

            public final int c() {
                return b.c;
            }

            private Companion() {
            }
        }

        private /* synthetic */ b(int i) {
            this.value = i;
        }

        public static final /* synthetic */ b d(int i) {
            return new b(i);
        }

        private static int e(int i) {
            return i;
        }

        public static boolean f(int i, Object obj) {
            return (obj instanceof b) && i == ((b) obj).getValue();
        }

        public static final boolean g(int i, int i2) {
            return i == i2;
        }

        public static int h(int i) {
            return Integer.hashCode(i);
        }

        public static String i(int i) {
            return "Horizontal(value=" + i + ')';
        }

        public boolean equals(Object obj) {
            return f(this.value, obj);
        }

        public int hashCode() {
            return h(this.value);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public String toString() {
            return i(this.value);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.layout.a$c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/glance/layout/a$c;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "b", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int c = e(0);
        private static final int d = e(1);
        private static final int e = e(2);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: androidx.glance.layout.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/glance/layout/a$c$a;", "", "<init>", "()V", "Landroidx/glance/layout/a$c;", "Top", "I", "c", "()I", "CenterVertically", "b", "Bottom", "a", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.e;
            }

            public final int b() {
                return c.d;
            }

            public final int c() {
                return c.c;
            }

            private Companion() {
            }
        }

        private /* synthetic */ c(int i) {
            this.value = i;
        }

        public static final /* synthetic */ c d(int i) {
            return new c(i);
        }

        private static int e(int i) {
            return i;
        }

        public static boolean f(int i, Object obj) {
            return (obj instanceof c) && i == ((c) obj).getValue();
        }

        public static final boolean g(int i, int i2) {
            return i == i2;
        }

        public static int h(int i) {
            return Integer.hashCode(i);
        }

        public static String i(int i) {
            return "Vertical(value=" + i + ')';
        }

        public boolean equals(Object obj) {
            return f(this.value, obj);
        }

        public int hashCode() {
            return h(this.value);
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public String toString() {
            return i(this.value);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        b.Companion companion = b.INSTANCE;
        int iC = companion.c();
        c.Companion companion2 = c.INSTANCE;
        e = new Alignment(iC, companion2.c(), defaultConstructorMarker);
        f = new Alignment(companion.a(), companion2.c(), defaultConstructorMarker);
        g = new Alignment(companion.b(), companion2.c(), defaultConstructorMarker);
        h = new Alignment(companion.c(), companion2.b(), defaultConstructorMarker);
        i = new Alignment(companion.a(), companion2.b(), defaultConstructorMarker);
        j = new Alignment(companion.b(), companion2.b(), defaultConstructorMarker);
        k = new Alignment(companion.c(), companion2.a(), defaultConstructorMarker);
        l = new Alignment(companion.a(), companion2.a(), defaultConstructorMarker);
        m = new Alignment(companion.b(), companion2.a(), defaultConstructorMarker);
        n = companion2.c();
        o = companion2.b();
        p = companion2.a();
        q = companion.c();
        r = companion.a();
        s = companion.b();
    }

    public /* synthetic */ Alignment(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(Alignment.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        Alignment alignment = (Alignment) other;
        return b.g(this.horizontal, alignment.horizontal) && c.g(this.vertical, alignment.vertical);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getHorizontal() {
        return this.horizontal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return (b.h(this.horizontal) * 31) + c.h(this.vertical);
    }

    public String toString() {
        return "Alignment(horizontal=" + ((Object) b.i(this.horizontal)) + ", vertical=" + ((Object) c.i(this.vertical)) + ')';
    }

    private Alignment(int i2, int i3) {
        this.horizontal = i2;
        this.vertical = i3;
    }
}
