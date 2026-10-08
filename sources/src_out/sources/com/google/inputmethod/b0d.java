package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010!\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006#"}, d2 = {"Lcom/google/android/b0d;", "", "", "packedValue", "c", "(J)J", "", "l", "(J)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "f", "getRawType$annotations", "()V", "rawType", "Lcom/google/android/d0d;", "g", "type", "k", "(J)Z", "isSp", "j", "isEm", "", "h", "(J)F", "value", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final d0d[] c;
    private static final long d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: com.google.android.b0d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/android/b0d$a;", "", "<init>", "()V", "Lcom/google/android/b0d;", "Unspecified", "J", "a", "()J", "getUnspecified-XSAIIZE$annotations", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b0d.d;
        }

        private Companion() {
        }
    }

    static {
        d0d.Companion companion = d0d.INSTANCE;
        c = new d0d[]{d0d.d(companion.c()), d0d.d(companion.b()), d0d.d(companion.a())};
        d = c0d.k(0L, Float.NaN);
    }

    private /* synthetic */ b0d(long j) {
        this.packedValue = j;
    }

    public static final /* synthetic */ b0d b(long j) {
        return new b0d(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof b0d) && j == ((b0d) obj).getPackedValue();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final long f(long j) {
        return j & 1095216660480L;
    }

    public static final long g(long j) {
        return c[(int) (f(j) >>> 32)].getType();
    }

    public static final float h(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int i(long j) {
        return Long.hashCode(j);
    }

    public static final boolean j(long j) {
        return f(j) == 8589934592L;
    }

    public static final boolean k(long j) {
        return f(j) == 4294967296L;
    }

    public static String l(long j) {
        long jG = g(j);
        d0d.Companion companion = d0d.INSTANCE;
        if (d0d.g(jG, companion.c())) {
            return "Unspecified";
        }
        if (d0d.g(jG, companion.b())) {
            return h(j) + ".sp";
        }
        if (!d0d.g(jG, companion.a())) {
            return "Invalid";
        }
        return h(j) + ".em";
    }

    public boolean equals(Object other) {
        return d(this.packedValue, other);
    }

    public int hashCode() {
        return i(this.packedValue);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return l(this.packedValue);
    }
}
