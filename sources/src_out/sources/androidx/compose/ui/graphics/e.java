package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "", "value", "D", "(I)I", "", "G", "(I)Ljava/lang/String;", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = D(0);
    private static final int c = D(1);
    private static final int d = D(2);
    private static final int e = D(3);
    private static final int f = D(4);
    private static final int g = D(5);
    private static final int h = D(6);
    private static final int i = D(7);
    private static final int j = D(8);
    private static final int k = D(9);
    private static final int l = D(10);
    private static final int m = D(11);
    private static final int n = D(12);
    private static final int o = D(13);
    private static final int p = D(14);
    private static final int q = D(15);
    private static final int r = D(16);
    private static final int s = D(17);
    private static final int t = D(18);
    private static final int u = D(19);
    private static final int v = D(20);
    private static final int w = D(21);
    private static final int x = D(22);
    private static final int y = D(23);
    private static final int z = D(24);
    private static final int A = D(25);
    private static final int B = D(26);
    private static final int C = D(27);
    private static final int D = D(28);

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\b¨\u0006A"}, d2 = {"Landroidx/compose/ui/graphics/e$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/e;", "Clear", "I", "a", "()I", "Src", "x", "Dst", "g", "SrcOver", "B", "DstOver", "k", "SrcIn", "z", "DstIn", "i", "SrcOut", "A", "DstOut", "j", "SrcAtop", "y", "DstAtop", "h", "Xor", "C", "Plus", "t", "Modulate", "q", "Screen", "v", "Overlay", "s", "Darken", "e", "Lighten", "o", "ColorDodge", "d", "ColorBurn", "c", "Hardlight", "m", "Softlight", "w", "Difference", "f", "Exclusion", "l", "Multiply", "r", "Hue", "n", "Saturation", "u", "Color", "b", "Luminosity", "p", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return e.i;
        }

        public final int B() {
            return e.e;
        }

        public final int C() {
            return e.m;
        }

        public final int a() {
            return e.b;
        }

        public final int b() {
            return e.C;
        }

        public final int c() {
            return e.u;
        }

        public final int d() {
            return e.t;
        }

        public final int e() {
            return e.r;
        }

        public final int f() {
            return e.x;
        }

        public final int g() {
            return e.d;
        }

        public final int h() {
            return e.l;
        }

        public final int i() {
            return e.h;
        }

        public final int j() {
            return e.j;
        }

        public final int k() {
            return e.f;
        }

        public final int l() {
            return e.y;
        }

        public final int m() {
            return e.v;
        }

        public final int n() {
            return e.A;
        }

        public final int o() {
            return e.s;
        }

        public final int p() {
            return e.D;
        }

        public final int q() {
            return e.o;
        }

        public final int r() {
            return e.z;
        }

        public final int s() {
            return e.q;
        }

        public final int t() {
            return e.n;
        }

        public final int u() {
            return e.B;
        }

        public final int v() {
            return e.p;
        }

        public final int w() {
            return e.w;
        }

        public final int x() {
            return e.c;
        }

        public final int y() {
            return e.k;
        }

        public final int z() {
            return e.g;
        }

        private Companion() {
        }
    }

    public static int D(int i2) {
        return i2;
    }

    public static final boolean E(int i2, int i3) {
        return i2 == i3;
    }

    public static int F(int i2) {
        return Integer.hashCode(i2);
    }

    public static String G(int i2) {
        if (E(i2, b)) {
            return "Clear";
        }
        if (E(i2, c)) {
            return "Src";
        }
        if (E(i2, d)) {
            return "Dst";
        }
        if (E(i2, e)) {
            return "SrcOver";
        }
        if (E(i2, f)) {
            return "DstOver";
        }
        if (E(i2, g)) {
            return "SrcIn";
        }
        if (E(i2, h)) {
            return "DstIn";
        }
        if (E(i2, i)) {
            return "SrcOut";
        }
        if (E(i2, j)) {
            return "DstOut";
        }
        if (E(i2, k)) {
            return "SrcAtop";
        }
        if (E(i2, l)) {
            return "DstAtop";
        }
        if (E(i2, m)) {
            return "Xor";
        }
        if (E(i2, n)) {
            return "Plus";
        }
        if (E(i2, o)) {
            return "Modulate";
        }
        if (E(i2, p)) {
            return "Screen";
        }
        if (E(i2, q)) {
            return "Overlay";
        }
        if (E(i2, r)) {
            return "Darken";
        }
        if (E(i2, s)) {
            return "Lighten";
        }
        if (E(i2, t)) {
            return "ColorDodge";
        }
        if (E(i2, u)) {
            return "ColorBurn";
        }
        if (E(i2, v)) {
            return "HardLight";
        }
        if (E(i2, w)) {
            return "Softlight";
        }
        if (E(i2, x)) {
            return "Difference";
        }
        if (E(i2, y)) {
            return "Exclusion";
        }
        if (E(i2, z)) {
            return "Multiply";
        }
        if (E(i2, A)) {
            return "Hue";
        }
        if (E(i2, B)) {
            return "Saturation";
        }
        if (E(i2, C)) {
            return "Color";
        }
        return E(i2, D) ? "Luminosity" : "Unknown";
    }
}
