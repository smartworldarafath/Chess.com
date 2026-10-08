package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/focus/b;", "", "", "value", "j", "(I)I", "", "n", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = j(1);
    private static final int d = j(2);
    private static final int e = j(3);
    private static final int f = j(4);
    private static final int g = j(5);
    private static final int h = j(6);
    private static final int i = j(7);
    private static final int j = j(8);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/b$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/b;", "Next", "I", "e", "()I", "Previous", "f", "Left", "d", "Right", "g", "Up", "h", "Down", "a", "Enter", "b", "Exit", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return b.h;
        }

        public final int b() {
            return b.i;
        }

        public final int c() {
            return b.j;
        }

        public final int d() {
            return b.e;
        }

        public final int e() {
            return b.c;
        }

        public final int f() {
            return b.d;
        }

        public final int g() {
            return b.f;
        }

        public final int h() {
            return b.g;
        }

        private Companion() {
        }
    }

    private /* synthetic */ b(int i2) {
        this.value = i2;
    }

    public static final /* synthetic */ b i(int i2) {
        return new b(i2);
    }

    public static int j(int i2) {
        return i2;
    }

    public static boolean k(int i2, Object obj) {
        return (obj instanceof b) && i2 == ((b) obj).getValue();
    }

    public static final boolean l(int i2, int i3) {
        return i2 == i3;
    }

    public static int m(int i2) {
        return Integer.hashCode(i2);
    }

    public static String n(int i2) {
        if (l(i2, c)) {
            return "Next";
        }
        if (l(i2, d)) {
            return "Previous";
        }
        if (l(i2, e)) {
            return "Left";
        }
        if (l(i2, f)) {
            return "Right";
        }
        if (l(i2, g)) {
            return "Up";
        }
        if (l(i2, h)) {
            return "Down";
        }
        if (l(i2, i)) {
            return "Enter";
        }
        return l(i2, j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object other) {
        return k(this.value, other);
    }

    public int hashCode() {
        return m(this.value);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return n(this.value);
    }
}
