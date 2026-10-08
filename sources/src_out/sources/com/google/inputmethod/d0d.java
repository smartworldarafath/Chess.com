package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/google/android/d0d;", "", "", "type", "e", "(J)J", "", "i", "(J)Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long c = e(0);
    private static final long d = e(4294967296L);
    private static final long e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long type;

    /* JADX INFO: renamed from: com.google.android.d0d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/google/android/d0d$a;", "", "<init>", "()V", "Lcom/google/android/d0d;", "Unspecified", "J", "c", "()J", "Sp", "b", "Em", "a", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return d0d.e;
        }

        public final long b() {
            return d0d.d;
        }

        public final long c() {
            return d0d.c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ d0d(long j) {
        this.type = j;
    }

    public static final /* synthetic */ d0d d(long j) {
        return new d0d(j);
    }

    public static long e(long j) {
        return j;
    }

    public static boolean f(long j, Object obj) {
        return (obj instanceof d0d) && j == ((d0d) obj).getType();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static int h(long j) {
        return Long.hashCode(j);
    }

    public static String i(long j) {
        if (g(j, c)) {
            return "Unspecified";
        }
        if (g(j, d)) {
            return "Sp";
        }
        return g(j, e) ? "Em" : "Invalid";
    }

    public boolean equals(Object other) {
        return f(this.type, other);
    }

    public int hashCode() {
        return h(this.type);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ long getType() {
        return this.type;
    }

    public String toString() {
        return i(this.type);
    }
}
