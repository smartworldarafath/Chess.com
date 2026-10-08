package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087@\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Lcom/google/android/if3;", "", "", "packedValue", "c", "(J)J", "", "i", "(J)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPackedValue", "()J", "Lcom/google/android/ff3;", "f", "(J)F", "getX-D9Ej5fM$annotations", "()V", "x", "g", "getY-D9Ej5fM$annotations", "y", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class if3 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long c = c(0);
    private static final long d = c(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: com.google.android.if3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/if3$a;", "", "<init>", "()V", "Lcom/google/android/if3;", "Zero", "J", "a", "()J", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return if3.c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ if3(long j) {
        this.packedValue = j;
    }

    public static final /* synthetic */ if3 b(long j) {
        return new if3(j);
    }

    public static long c(long j) {
        return j;
    }

    public static boolean d(long j, Object obj) {
        return (obj instanceof if3) && j == ((if3) obj).getPackedValue();
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static final float f(long j) {
        return ff3.i(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static final float g(long j) {
        return ff3.i(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + ((Object) ff3.m(f(j))) + ", " + ((Object) ff3.m(g(j))) + ')';
    }

    public boolean equals(Object other) {
        return d(this.packedValue, other);
    }

    public int hashCode() {
        return h(this.packedValue);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return i(this.packedValue);
    }
}
