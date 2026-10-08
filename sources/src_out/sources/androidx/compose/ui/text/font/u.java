package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\nR\u0014\u0010\u0014\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/u;", "", "", "value", "f", "(I)I", "", "l", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "k", "(I)Z", "isWeightOn", "j", "isStyleOn", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = f(0);
    private static final int d = f(1);
    private static final int e = f(2);
    private static final int f = f(65535);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/u$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/u;", "None", "I", "b", "()I", "Weight", "d", "Style", "c", "All", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return u.f;
        }

        public final int b() {
            return u.c;
        }

        public final int c() {
            return u.e;
        }

        public final int d() {
            return u.d;
        }

        private Companion() {
        }
    }

    private /* synthetic */ u(int i) {
        this.value = i;
    }

    public static final /* synthetic */ u e(int i) {
        return new u(i);
    }

    public static int f(int i) {
        return i;
    }

    public static boolean g(int i, Object obj) {
        return (obj instanceof u) && i == ((u) obj).getValue();
    }

    public static final boolean h(int i, int i2) {
        return i == i2;
    }

    public static int i(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean j(int i) {
        return (i & 2) != 0;
    }

    public static final boolean k(int i) {
        return (i & 1) != 0;
    }

    public static String l(int i) {
        if (h(i, c)) {
            return "None";
        }
        if (h(i, d)) {
            return "Weight";
        }
        if (h(i, e)) {
            return "Style";
        }
        return h(i, f) ? "All" : "Invalid";
    }

    public boolean equals(Object other) {
        return g(this.value, other);
    }

    public int hashCode() {
        return i(this.value);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return l(this.value);
    }
}
