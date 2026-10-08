package androidx.compose.ui.text.font;

import com.google.inputmethod.ax5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.x, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/x;", "", "", "weight", "<init>", "(I)V", "other", "p", "(Landroidx/compose/ui/text/font/x;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "q", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FontWeight implements Comparable<FontWeight> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FontWeight c;
    private static final FontWeight d;
    private static final FontWeight e;
    private static final FontWeight f;
    private static final FontWeight g;
    private static final FontWeight h;
    private static final FontWeight i;
    private static final FontWeight j;
    private static final FontWeight k;
    private static final FontWeight l;
    private static final FontWeight m;
    private static final FontWeight n;
    private static final FontWeight o;
    private static final FontWeight p;
    private static final FontWeight q;
    private static final FontWeight r;
    private static final FontWeight s;
    private static final FontWeight t;
    private static final List<FontWeight> u;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int weight;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\bR \u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0006\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\b¨\u0006("}, d2 = {"Landroidx/compose/ui/text/font/x$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/x;", "W400", "Landroidx/compose/ui/text/font/x;", "h", "()Landroidx/compose/ui/text/font/x;", "getW400$annotations", "W500", "i", "getW500$annotations", "W600", "j", "getW600$annotations", "W800", "k", "getW800$annotations", "Light", "d", "getLight$annotations", "Normal", "f", "getNormal$annotations", "Medium", "e", "getMedium$annotations", "SemiBold", "g", "getSemiBold$annotations", "Bold", "b", "getBold$annotations", "ExtraBold", "c", "getExtraBold$annotations", "Black", "a", "getBlack$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontWeight a() {
            return FontWeight.t;
        }

        public final FontWeight b() {
            return FontWeight.r;
        }

        public final FontWeight c() {
            return FontWeight.s;
        }

        public final FontWeight d() {
            return FontWeight.n;
        }

        public final FontWeight e() {
            return FontWeight.p;
        }

        public final FontWeight f() {
            return FontWeight.o;
        }

        public final FontWeight g() {
            return FontWeight.q;
        }

        public final FontWeight h() {
            return FontWeight.f;
        }

        public final FontWeight i() {
            return FontWeight.g;
        }

        public final FontWeight j() {
            return FontWeight.h;
        }

        public final FontWeight k() {
            return FontWeight.j;
        }

        private Companion() {
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        c = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        d = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        e = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        f = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        g = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        h = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        i = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        j = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        k = fontWeight9;
        l = fontWeight;
        m = fontWeight2;
        n = fontWeight3;
        o = fontWeight4;
        p = fontWeight5;
        q = fontWeight6;
        r = fontWeight7;
        s = fontWeight8;
        t = fontWeight9;
        u = kotlin.collections.m.s(new FontWeight[]{fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9});
    }

    public FontWeight(int i2) {
        this.weight = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        ax5.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontWeight) && this.weight == ((FontWeight) other).weight;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getWeight() {
        return this.weight;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(FontWeight other) {
        return Intrinsics.i(this.weight, other.weight);
    }

    public final int q() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }
}
