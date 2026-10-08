package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/google/android/dsc;", "", "", "value", "h", "(I)I", "", "l", "(I)Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getValue", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dsc {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int c = h(1);
    private static final int d = h(2);
    private static final int e = h(3);
    private static final int f = h(4);
    private static final int g = h(5);
    private static final int h = h(0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: com.google.android.dsc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/google/android/dsc$a;", "", "<init>", "()V", "Lcom/google/android/dsc;", "Ltr", "I", "d", "()I", "Rtl", "e", "Content", "a", "ContentOrLtr", "b", "ContentOrRtl", "c", "Unspecified", "f", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return dsc.e;
        }

        public final int b() {
            return dsc.f;
        }

        public final int c() {
            return dsc.g;
        }

        public final int d() {
            return dsc.c;
        }

        public final int e() {
            return dsc.d;
        }

        public final int f() {
            return dsc.h;
        }

        private Companion() {
        }
    }

    private /* synthetic */ dsc(int i) {
        this.value = i;
    }

    public static final /* synthetic */ dsc g(int i) {
        return new dsc(i);
    }

    public static int h(int i) {
        return i;
    }

    public static boolean i(int i, Object obj) {
        return (obj instanceof dsc) && i == ((dsc) obj).getValue();
    }

    public static final boolean j(int i, int i2) {
        return i == i2;
    }

    public static int k(int i) {
        return Integer.hashCode(i);
    }

    public static String l(int i) {
        if (j(i, c)) {
            return "Ltr";
        }
        if (j(i, d)) {
            return "Rtl";
        }
        if (j(i, e)) {
            return "Content";
        }
        if (j(i, f)) {
            return "ContentOrLtr";
        }
        if (j(i, g)) {
            return "ContentOrRtl";
        }
        return j(i, h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object other) {
        return i(this.value, other);
    }

    public int hashCode() {
        return k(this.value);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return l(this.value);
    }
}
