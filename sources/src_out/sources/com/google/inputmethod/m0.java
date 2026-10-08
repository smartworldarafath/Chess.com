package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\bR \u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0016\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010#\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b \u0010!R \u0010&\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001f\u0012\u0004\b%\u0010\u0003\u001a\u0004\b\u0005\u0010!¨\u0006'"}, d2 = {"Lcom/google/android/m0;", "", "<init>", "()V", "Lcom/google/android/tc;", "b", "Lcom/google/android/tc;", "c", "()Lcom/google/android/tc;", "getTopLeft$annotations", "TopLeft", "d", "getTopRight$annotations", "TopRight", "getCenterLeft", "getCenterLeft$annotations", "CenterLeft", "e", "getCenterRight", "getCenterRight$annotations", "CenterRight", "f", "getBottomLeft", "getBottomLeft$annotations", "BottomLeft", "g", "getBottomRight", "getBottomRight$annotations", "BottomRight", "Lcom/google/android/tc$b;", "h", "Lcom/google/android/tc$b;", "a", "()Lcom/google/android/tc$b;", "getLeft$annotations", "Left", "i", "getRight$annotations", "Right", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 {
    public static final m0 a = new m0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final tc TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final tc TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final tc CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final tc CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final tc BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final tc BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final tc.b Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final tc.b Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    private m0() {
    }

    public final tc.b a() {
        return Left;
    }

    public final tc.b b() {
        return Right;
    }

    public final tc c() {
        return TopLeft;
    }

    public final tc d() {
        return TopRight;
    }
}
