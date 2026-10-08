package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/google/android/cpc;", "", "", "value", "i", "(I)I", "", "m", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cpc {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = i(1);
    private static final int d = i(2);
    private static final int e = i(3);
    private static final int f = i(4);
    private static final int g = i(5);
    private static final int h = i(6);
    private static final int i = i(0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: com.google.android.cpc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/google/android/cpc$a;", "", "<init>", "()V", "Lcom/google/android/cpc;", "Left", "I", "d", "()I", "Right", "e", "Center", "a", "Justify", "c", "Start", "f", "End", "b", "Unspecified", "g", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return cpc.e;
        }

        public final int b() {
            return cpc.h;
        }

        public final int c() {
            return cpc.f;
        }

        public final int d() {
            return cpc.c;
        }

        public final int e() {
            return cpc.d;
        }

        public final int f() {
            return cpc.g;
        }

        public final int g() {
            return cpc.i;
        }

        private Companion() {
        }
    }

    private /* synthetic */ cpc(int i2) {
        this.value = i2;
    }

    public static final /* synthetic */ cpc h(int i2) {
        return new cpc(i2);
    }

    public static int i(int i2) {
        return i2;
    }

    public static boolean j(int i2, Object obj) {
        return (obj instanceof cpc) && i2 == ((cpc) obj).getValue();
    }

    public static final boolean k(int i2, int i3) {
        return i2 == i3;
    }

    public static int l(int i2) {
        return Integer.hashCode(i2);
    }

    public static String m(int i2) {
        if (k(i2, c)) {
            return "Left";
        }
        if (k(i2, d)) {
            return "Right";
        }
        if (k(i2, e)) {
            return "Center";
        }
        if (k(i2, f)) {
            return "Justify";
        }
        if (k(i2, g)) {
            return "Start";
        }
        if (k(i2, h)) {
            return "End";
        }
        return k(i2, i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object other) {
        return j(this.value, other);
    }

    public int hashCode() {
        return l(this.value);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return m(this.value);
    }
}
