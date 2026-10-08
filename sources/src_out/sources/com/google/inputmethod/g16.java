package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006%"}, d2 = {"Lcom/google/android/g16;", "", "", "packedValue", "f", "(J)J", "", "d", "(J)I", "e", "x", "y", "g", "(JII)J", "other", "n", "(JJ)J", "o", "q", "", "p", "(J)Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "k", "getX$annotations", "()V", "l", "getY$annotations", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g16 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long c = f(0);
    private static final long d = f(9223372034707292159L);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: com.google.android.g16$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/android/g16$a;", "", "<init>", "()V", "Lcom/google/android/g16;", "Zero", "J", "b", "()J", "Max", "a", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return g16.d;
        }

        public final long b() {
            return g16.c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ g16(long j) {
        this.packedValue = j;
    }

    public static final /* synthetic */ g16 c(long j) {
        return new g16(j);
    }

    public static final int d(long j) {
        return k(j);
    }

    public static final int e(long j) {
        return l(j);
    }

    public static long f(long j) {
        return j;
    }

    public static final long g(long j, int i, int i2) {
        return f((((long) i) << 32) | (((long) i2) & 4294967295L));
    }

    public static /* synthetic */ long h(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (4294967295L & j);
        }
        return g(j, i, i2);
    }

    public static boolean i(long j, Object obj) {
        return (obj instanceof g16) && j == ((g16) obj).getPackedValue();
    }

    public static final boolean j(long j, long j2) {
        return j == j2;
    }

    public static final int k(long j) {
        return (int) (j >> 32);
    }

    public static final int l(long j) {
        return (int) (j & 4294967295L);
    }

    public static int m(long j) {
        return Long.hashCode(j);
    }

    public static final long n(long j, long j2) {
        return f((((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L));
    }

    public static final long o(long j, long j2) {
        return f((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L));
    }

    public static String p(long j) {
        return '(' + k(j) + ", " + l(j) + ')';
    }

    public static final long q(long j) {
        int i = -((int) (j >> 32));
        return f((((long) (-((int) (j & 4294967295L)))) & 4294967295L) | (((long) i) << 32));
    }

    public boolean equals(Object other) {
        return i(this.packedValue, other);
    }

    public int hashCode() {
        return m(this.packedValue);
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return p(this.packedValue);
    }
}
