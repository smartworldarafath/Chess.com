package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/d;", "", "", "value", "l", "(I)I", "", "p", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = l(0);
    private static final int d = l(1);
    private static final int e = l(2);
    private static final int f = l(3);
    private static final int g = l(4);
    private static final int h = l(5);
    private static final int i = l(6);
    private static final int j = l(7);
    private static final int k = l(8);
    private static final int l = l(9);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.text.input.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/input/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/d;", "Unspecified", "I", "i", "()I", "getUnspecified-PjHm6EE$annotations", "Text", "h", "getText-PjHm6EE$annotations", "Ascii", "a", "getAscii-PjHm6EE$annotations", "Number", "d", "getNumber-PjHm6EE$annotations", "Phone", "g", "getPhone-PjHm6EE$annotations", "Uri", "j", "getUri-PjHm6EE$annotations", "Email", "c", "getEmail-PjHm6EE$annotations", "Password", "f", "getPassword-PjHm6EE$annotations", "NumberPassword", "e", "getNumberPassword-PjHm6EE$annotations", "Decimal", "b", "getDecimal-PjHm6EE$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.e;
        }

        public final int b() {
            return d.l;
        }

        public final int c() {
            return d.i;
        }

        public final int d() {
            return d.f;
        }

        public final int e() {
            return d.k;
        }

        public final int f() {
            return d.j;
        }

        public final int g() {
            return d.g;
        }

        public final int h() {
            return d.d;
        }

        public final int i() {
            return d.c;
        }

        public final int j() {
            return d.h;
        }

        private Companion() {
        }
    }

    private /* synthetic */ d(int i2) {
        this.value = i2;
    }

    public static final /* synthetic */ d k(int i2) {
        return new d(i2);
    }

    private static int l(int i2) {
        return i2;
    }

    public static boolean m(int i2, Object obj) {
        return (obj instanceof d) && i2 == ((d) obj).getValue();
    }

    public static final boolean n(int i2, int i3) {
        return i2 == i3;
    }

    public static int o(int i2) {
        return Integer.hashCode(i2);
    }

    public static String p(int i2) {
        if (n(i2, c)) {
            return "Unspecified";
        }
        if (n(i2, d)) {
            return "Text";
        }
        if (n(i2, e)) {
            return "Ascii";
        }
        if (n(i2, f)) {
            return "Number";
        }
        if (n(i2, g)) {
            return "Phone";
        }
        if (n(i2, h)) {
            return "Uri";
        }
        if (n(i2, i)) {
            return "Email";
        }
        if (n(i2, j)) {
            return "Password";
        }
        if (n(i2, k)) {
            return "NumberPassword";
        }
        return n(i2, l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object other) {
        return m(this.value, other);
    }

    public int hashCode() {
        return o(this.value);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return p(this.value);
    }
}
