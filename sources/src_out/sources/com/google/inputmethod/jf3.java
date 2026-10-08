package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087@\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001d"}, d2 = {"Lcom/google/android/jf3;", "", "", "packedValue", "d", "(J)J", "", "j", "(J)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getPackedValue$annotations", "()V", "Lcom/google/android/ff3;", "h", "(J)F", "getWidth-D9Ej5fM$annotations", "width", "g", "getHeight-D9Ej5fM$annotations", "height", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jf3 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long c = d(0);
    private static final long d = d(9205357640488583168L);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: com.google.android.jf3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/google/android/jf3$a;", "", "<init>", "()V", "Lcom/google/android/jf3;", "Zero", "J", "b", "()J", "Unspecified", "a", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return jf3.d;
        }

        public final long b() {
            return jf3.c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ jf3(long j) {
        this.packedValue = j;
    }

    public static final /* synthetic */ jf3 c(long j) {
        return new jf3(j);
    }

    public static long d(long j) {
        return j;
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof jf3) && j == ((jf3) obj).getPackedValue();
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final float g(long j) {
        return ff3.i(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final float h(long j) {
        return ff3.i(Float.intBitsToFloat((int) (j >> 32)));
    }

    public static int i(long j) {
        return Long.hashCode(j);
    }

    public static String j(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) ff3.m(h(j))) + " x " + ((Object) ff3.m(g(j)));
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
