package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ShapeKeyTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/google/android/o14;", "", "<init>", "()V", "Lcom/google/android/ff3;", "b", "F", "a", "()F", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "getIconLabelSpace-D9Ej5fM", "IconLabelSpace", "e", "getIconSize-D9Ej5fM", "IconSize", "f", "LeadingSpace", "g", "TrailingSpace", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o14 {
    public static final o14 a = new o14();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float ContainerHeight = ff3.i((float) 96.0d);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraLarge;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float IconLabelSpace = ff3.i((float) 20.0d);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float IconSize = ff3.i((float) 32.0d);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float LeadingSpace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float TrailingSpace;

    static {
        float f = (float) 28.0d;
        LeadingSpace = ff3.i(f);
        TrailingSpace = ff3.i(f);
    }

    private o14() {
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
