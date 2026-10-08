package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/b;", "", "", "packedValue", "d", "(J)J", "", "h", "(J)Ljava/lang/String;", "", "f", "(J)I", "getComponentCount$annotations", "()V", "componentCount", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/b$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/b;", "Rgb", "J", "b", "()J", "Xyz", "c", "Lab", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.d;
        }

        public final long b() {
            return b.b;
        }

        public final long c() {
            return b.c;
        }

        private Companion() {
        }
    }

    static {
        long j = 3;
        long j2 = j << 32;
        b = d((((long) 0) & 4294967295L) | j2);
        c = d((((long) 1) & 4294967295L) | j2);
        d = d(j2 | (((long) 2) & 4294967295L));
        e = d((j & 4294967295L) | (((long) 4) << 32));
    }

    public static long d(long j) {
        return j;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final int f(long j) {
        return (int) (j >> 32);
    }

    public static int g(long j) {
        return Long.hashCode(j);
    }

    public static String h(long j) {
        if (e(j, b)) {
            return "Rgb";
        }
        if (e(j, c)) {
            return "Xyz";
        }
        if (e(j, d)) {
            return "Lab";
        }
        return e(j, e) ? "Cmyk" : "Unknown";
    }
}
