package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0012B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, d2 = {"Lcom/google/android/q16;", "", "", "packedValue", "c", "(J)J", "", "other", "d", "(JI)J", "", "j", "(J)Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "h", "(J)I", "getWidth$annotations", "()V", "width", "g", "getHeight$annotations", "height", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q16 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long c = c(0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: com.google.android.q16$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/q16$a;", "", "<init>", "()V", "Lcom/google/android/q16;", "Zero", "J", "a", "()J", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return q16.c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ q16(long j) {
        this.packedValue = j;
    }

    public static final /* synthetic */ q16 b(long j) {
        return new q16(j);
    }

    public static long c(long j) {
        return j;
    }

    public static final long d(long j, int i) {
        return c((((long) (((int) (j >> 32)) / i)) << 32) | (((long) (((int) (j & 4294967295L)) / i)) & 4294967295L));
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof q16) && j == ((q16) obj).getPackedValue();
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final int g(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int h(long j) {
        return (int) (j >> 32);
    }

    public static int i(long j) {
        return Long.hashCode(j);
    }

    public static String j(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public boolean equals(Object other) {
        return e(this.packedValue, other);
    }

    public int hashCode() {
        return i(this.packedValue);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return j(this.packedValue);
    }
}
