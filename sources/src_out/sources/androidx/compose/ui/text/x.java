package androidx.compose.ui.text;

import com.google.inputmethod.zyc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087@\u0018\u0000 (2\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\tJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010 \u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010#\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010'\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/x;", "", "", "packedValue", "c", "(J)J", "other", "", "p", "(JJ)Z", "d", "", "offset", "e", "(JI)Z", "", "q", "(J)Ljava/lang/String;", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", "J", "n", "(J)I", "start", "i", "end", "l", "min", "k", "max", "h", "(J)Z", "collapsed", "m", "reversed", "j", "length", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long c = zyc.a(0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: androidx.compose.ui.text.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/x$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/x;", "Zero", "J", "a", "()J", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return x.c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ x(long j) {
        this.packedValue = j;
    }

    public static final /* synthetic */ x b(long j) {
        return new x(j);
    }

    public static long c(long j) {
        return j;
    }

    public static final boolean d(long j, long j2) {
        return (l(j) <= l(j2)) & (k(j2) <= k(j));
    }

    public static final boolean e(long j, int i) {
        return i < k(j) && l(j) <= i;
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof x) && j == ((x) obj).getPackedValue();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static final boolean h(long j) {
        return n(j) == i(j);
    }

    public static final int i(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int j(long j) {
        return k(j) - l(j);
    }

    public static final int k(long j) {
        return Math.max(n(j), i(j));
    }

    public static final int l(long j) {
        return Math.min(n(j), i(j));
    }

    public static final boolean m(long j) {
        return n(j) > i(j);
    }

    public static final int n(long j) {
        return (int) (j >> 32);
    }

    public static int o(long j) {
        return Long.hashCode(j);
    }

    public static final boolean p(long j, long j2) {
        return (l(j) < k(j2)) & (l(j2) < k(j));
    }

    public static String q(long j) {
        return "TextRange(" + n(j) + ", " + i(j) + ')';
    }

    public boolean equals(Object other) {
        return f(this.packedValue, other);
    }

    public int hashCode() {
        return o(this.packedValue);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return q(this.packedValue);
    }
}
