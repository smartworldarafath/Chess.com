package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ShapeKeyTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/google/android/a44;", "", "<init>", "()V", "Lcom/google/android/ff3;", "b", "F", "a", "()F", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "d", "ContainerWidth", "e", "getIconSize-D9Ej5fM", "IconSize", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a44 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float ContainerHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float ContainerWidth;
    public static final a44 a = new a44();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerLarge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float IconSize = ff3.i((float) 24.0d);

    static {
        float f = (float) 56.0d;
        ContainerHeight = ff3.i(f);
        ContainerWidth = ff3.i(f);
    }

    private a44() {
    }

    public final float a() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens b() {
        return ContainerShape;
    }

    public final float c() {
        return ContainerWidth;
    }
}
