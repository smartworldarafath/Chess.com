package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u0088\u0001\t\u0092\u0001\u00020\b¨\u0006\f"}, d2 = {"Lcom/google/android/y5c;", "", "", "offsetMillis", "Lcom/google/android/d6c;", "offsetType", "a", "(II)J", "", "value", "b", "(J)J", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y5c {
    public static long a(int i, int i2) {
        return b(i * i2);
    }

    private static long b(long j) {
        return j;
    }

    public static /* synthetic */ long c(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = d6c.INSTANCE.a();
        }
        return a(i, i2);
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public static int e(long j) {
        return Long.hashCode(j);
    }
}
