package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/google/android/aa2;", "", "", "packedValue", "b", "(J)J", "", "e", "(J)Ljava/lang/String;", "a", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class aa2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long b = b(0);

    /* JADX INFO: renamed from: com.google.android.aa2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/android/aa2$a;", "", "<init>", "()V", "Lcom/google/android/aa2;", "Zero", "J", "a", "()J", "getZero-kKHJgLs$annotations", "ui-geometry"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return aa2.b;
        }

        private Companion() {
        }
    }

    public static long b(long j) {
        return j;
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static int d(long j) {
        return Long.hashCode(j);
    }

    public static String e(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + yv4.a(Float.intBitsToFloat(i), 1) + ')';
        }
        return "CornerRadius.elliptical(" + yv4.a(Float.intBitsToFloat(i), 1) + ", " + yv4.a(Float.intBitsToFloat(i2), 1) + ')';
    }
}
