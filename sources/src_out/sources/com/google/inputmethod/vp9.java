package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lcom/google/android/vp9;", "", "<init>", "()V", "Lcom/google/android/ei1;", "b", "J", "Color", "Lcom/google/android/ti1;", "c", "Lcom/google/android/ti1;", "a", "()Lcom/google/android/ti1;", "IndicatorColorProvider", "d", "getBackgroundColorProvider", "BackgroundColorProvider", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class vp9 {
    public static final vp9 a = new vp9();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long Color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final ti1 IndicatorColorProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final ti1 BackgroundColorProvider;
    public static final int e;

    static {
        long jD = ki1.d(4284612846L);
        Color = jD;
        IndicatorColorProvider = vi1.b(jD);
        BackgroundColorProvider = vi1.b(ei1.p(jD, 0.24f, 0.0f, 0.0f, 0.0f, 14, null));
        e = 8;
    }

    private vp9() {
    }

    public final ti1 a() {
        return IndicatorColorProvider;
    }
}
