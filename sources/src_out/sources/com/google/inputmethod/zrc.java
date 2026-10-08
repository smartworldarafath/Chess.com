package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/google/android/zrc;", "", "<init>", "()V", "Lcom/google/android/ti1;", "b", "Lcom/google/android/ti1;", "a", "()Lcom/google/android/ti1;", "defaultTextColor", "Lcom/google/android/uzc;", "c", "Lcom/google/android/uzc;", "()Lcom/google/android/uzc;", "defaultTextStyle", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zrc {
    public static final zrc a = new zrc();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ti1 defaultTextColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final TextStyle defaultTextStyle;
    public static final int d;

    static {
        ti1 ti1VarB = vi1.b(ei1.INSTANCE.a());
        defaultTextColor = ti1VarB;
        defaultTextStyle = new TextStyle(ti1VarB, null, null, null, null, null, null, 126, null);
        d = 8;
    }

    private zrc() {
    }

    public final ti1 a() {
        return defaultTextColor;
    }

    public final TextStyle b() {
        return defaultTextStyle;
    }
}
