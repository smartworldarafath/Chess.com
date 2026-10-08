package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0081@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B1\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u0088\u0001\n\u0092\u0001\u00020\t¨\u0006\u0011"}, d2 = {"Lcom/google/android/cj6;", "", "", "isAltPressed", "isCtrlPressed", "isMetaPressed", "isShiftPressed", "i", "(ZZZZ)I", "", "flags", "h", "(I)I", "other", "k", "(II)I", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cj6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = h(0);
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;

    /* JADX INFO: renamed from: com.google.android.cj6$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006¨\u0006!"}, d2 = {"Lcom/google/android/cj6$a;", "", "<init>", "()V", "Lcom/google/android/cj6;", "None", "I", "e", "()I", "getNone-AuQ4EfA$annotations", "Alt", "a", "getAlt-AuQ4EfA$annotations", "Ctrl", "c", "getCtrl-AuQ4EfA$annotations", "Shift", "f", "getShift-AuQ4EfA$annotations", "AltShift", "b", "getAltShift-AuQ4EfA$annotations", "CtrlShift", "d", "getCtrlShift-AuQ4EfA$annotations", "ShiftMeta", "g", "getShiftMeta-AuQ4EfA$annotations", "", "ALT_FLAG", "CTRL_FLAG", "META_FLAG", "SHIFT_FLAG", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return cj6.c;
        }

        public final int b() {
            return cj6.g;
        }

        public final int c() {
            return cj6.d;
        }

        public final int d() {
            return cj6.h;
        }

        public final int e() {
            return cj6.b;
        }

        public final int f() {
            return cj6.f;
        }

        public final int g() {
            return cj6.i;
        }

        private Companion() {
        }
    }

    static {
        int iH = h(1);
        c = iH;
        int iH2 = h(2);
        d = iH2;
        int iH3 = h(4);
        e = iH3;
        int iH4 = h(8);
        f = iH4;
        g = k(iH, iH4);
        h = k(iH2, iH4);
        i = k(iH3, iH4);
        j = k(iH2, iH);
        k = k(iH2, iH3);
        l = k(iH3, iH4);
    }

    private static int h(int i2) {
        return i2;
    }

    public static int i(boolean z, boolean z2, boolean z3, boolean z4) {
        return h((z ? 1 : 0) | (z2 ? 2 : 0) | (z3 ? 4 : 0) | (z4 ? 8 : 0));
    }

    public static final boolean j(int i2, int i3) {
        return i2 == i3;
    }

    public static final int k(int i2, int i3) {
        return h(i2 | i3);
    }
}
