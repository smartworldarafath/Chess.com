package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/a;", "", "", "value", "k", "(I)I", "", "o", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = k(-1);
    private static final int d = k(1);
    private static final int e = k(0);
    private static final int f = k(2);
    private static final int g = k(3);
    private static final int h = k(4);
    private static final int i = k(5);
    private static final int j = k(6);
    private static final int k = k(7);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/a$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/a;", "Unspecified", "I", "i", "()I", "getUnspecified-eUduSuo$annotations", "Default", "a", "getDefault-eUduSuo$annotations", "None", "e", "getNone-eUduSuo$annotations", "Go", "c", "getGo-eUduSuo$annotations", "Search", "g", "getSearch-eUduSuo$annotations", "Send", "h", "getSend-eUduSuo$annotations", "Previous", "f", "getPrevious-eUduSuo$annotations", "Next", "d", "getNext-eUduSuo$annotations", "Done", "b", "getDone-eUduSuo$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.d;
        }

        public final int b() {
            return a.k;
        }

        public final int c() {
            return a.f;
        }

        public final int d() {
            return a.j;
        }

        public final int e() {
            return a.e;
        }

        public final int f() {
            return a.i;
        }

        public final int g() {
            return a.g;
        }

        public final int h() {
            return a.h;
        }

        public final int i() {
            return a.c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ a(int i2) {
        this.value = i2;
    }

    public static final /* synthetic */ a j(int i2) {
        return new a(i2);
    }

    private static int k(int i2) {
        return i2;
    }

    public static boolean l(int i2, Object obj) {
        return (obj instanceof a) && i2 == ((a) obj).getValue();
    }

    public static final boolean m(int i2, int i3) {
        return i2 == i3;
    }

    public static int n(int i2) {
        return Integer.hashCode(i2);
    }

    public static String o(int i2) {
        if (m(i2, c)) {
            return "Unspecified";
        }
        if (m(i2, e)) {
            return "None";
        }
        if (m(i2, d)) {
            return "Default";
        }
        if (m(i2, f)) {
            return "Go";
        }
        if (m(i2, g)) {
            return "Search";
        }
        if (m(i2, h)) {
            return "Send";
        }
        if (m(i2, i)) {
            return "Previous";
        }
        if (m(i2, j)) {
            return "Next";
        }
        return m(i2, k) ? "Done" : "Invalid";
    }

    public boolean equals(Object other) {
        return l(this.value, other);
    }

    public int hashCode() {
        return n(this.value);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return o(this.value);
    }
}
