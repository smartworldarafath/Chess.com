package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/google/android/p14;", "", "<init>", "()V", "Lcom/google/android/ff3;", "b", "F", "a", "()F", "ContainerHeight", "c", "getIconLabelSpace-D9Ej5fM", "IconLabelSpace", "d", "getIconSize-D9Ej5fM", "IconSize", "e", "LeadingSpace", "f", "TrailingSpace", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p14 {
    public static final p14 a = new p14();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float ContainerHeight = ff3.i((float) 80.0d);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float IconLabelSpace = ff3.i((float) 16.0d);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float IconSize = ff3.i((float) 28.0d);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float LeadingSpace;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float TrailingSpace;

    static {
        float f = (float) 26.0d;
        LeadingSpace = ff3.i(f);
        TrailingSpace = ff3.i(f);
    }

    private p14() {
    }

    public final float a() {
        return ContainerHeight;
    }

    public final float b() {
        return LeadingSpace;
    }

    public final float c() {
        return TrailingSpace;
    }
}
