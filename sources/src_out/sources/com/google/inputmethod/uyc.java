package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/google/android/uyc;", "", "", "value", "f", "(I)I", "", "i", "(I)Ljava/lang/String;", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class uyc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = f(1);
    private static final int c = f(2);
    private static final int d = f(3);
    private static final int e = f(4);
    private static final int f = f(5);

    /* JADX INFO: renamed from: com.google.android.uyc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/google/android/uyc$a;", "", "<init>", "()V", "Lcom/google/android/uyc;", "Clip", "I", "a", "()I", "getClip-gIe3tQ8$annotations", "Ellipsis", "b", "getEllipsis-gIe3tQ8$annotations", "Visible", "e", "getVisible-gIe3tQ8$annotations", "StartEllipsis", "d", "getStartEllipsis-gIe3tQ8$annotations", "MiddleEllipsis", "c", "getMiddleEllipsis-gIe3tQ8$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return uyc.b;
        }

        public final int b() {
            return uyc.c;
        }

        public final int c() {
            return uyc.f;
        }

        public final int d() {
            return uyc.e;
        }

        public final int e() {
            return uyc.d;
        }

        private Companion() {
        }
    }

    public static int f(int i) {
        return i;
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static int h(int i) {
        return Integer.hashCode(i);
    }

    public static String i(int i) {
        if (g(i, b)) {
            return "Clip";
        }
        if (g(i, c)) {
            return "Ellipsis";
        }
        if (g(i, f)) {
            return "MiddleEllipsis";
        }
        if (g(i, d)) {
            return "Visible";
        }
        return g(i, e) ? "StartEllipsis" : "Invalid";
    }
}
