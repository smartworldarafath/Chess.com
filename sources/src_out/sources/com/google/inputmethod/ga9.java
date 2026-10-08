package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/google/android/ga9;", "", "", "value", "h", "(I)I", "", "k", "(I)Ljava/lang/String;", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ga9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = h(1);
    private static final int c = h(2);
    private static final int d = h(3);
    private static final int e = h(4);
    private static final int f = h(5);
    private static final int g = h(6);
    private static final int h = h(7);

    /* JADX INFO: renamed from: com.google.android.ga9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/google/android/ga9$a;", "", "<init>", "()V", "Lcom/google/android/ga9;", "AboveBaseline", "I", "a", "()I", "Top", "g", "Bottom", "b", "Center", "c", "TextTop", "f", "TextBottom", "d", "TextCenter", "e", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return ga9.b;
        }

        public final int b() {
            return ga9.d;
        }

        public final int c() {
            return ga9.e;
        }

        public final int d() {
            return ga9.g;
        }

        public final int e() {
            return ga9.h;
        }

        public final int f() {
            return ga9.f;
        }

        public final int g() {
            return ga9.c;
        }

        private Companion() {
        }
    }

    public static int h(int i) {
        return i;
    }

    public static final boolean i(int i, int i2) {
        return i == i2;
    }

    public static int j(int i) {
        return Integer.hashCode(i);
    }

    public static String k(int i) {
        if (i(i, b)) {
            return "AboveBaseline";
        }
        if (i(i, c)) {
            return "Top";
        }
        if (i(i, d)) {
            return "Bottom";
        }
        if (i(i, e)) {
            return "Center";
        }
        if (i(i, f)) {
            return "TextTop";
        }
        if (i(i, g)) {
            return "TextBottom";
        }
        return i(i, h) ? "TextCenter" : "Invalid";
    }
}
