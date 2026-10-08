package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ShapeKeyTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\rR\u0017\u0010 \u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\rR\u0017\u0010#\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\rR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006&"}, d2 = {"Lcom/google/android/cy0;", "", "<init>", "()V", "Lcom/google/android/ff3;", "b", "F", "a", "()F", "ContainerHeight", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShapeRound", "d", "getContainerShapeSquare", "ContainerShapeSquare", "e", "IconLabelSpace", "f", "getIconSize-D9Ej5fM", "IconSize", "g", "LeadingSpace", "h", "OutlinedOutlineWidth", "i", "getPressedContainerShape", "PressedContainerShape", "j", "getSelectedContainerShapeRound", "SelectedContainerShapeRound", "k", "getSelectedContainerShapeSquare", "SelectedContainerShapeSquare", "l", "TrailingSpace", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cy0 {
    public static final cy0 a = new cy0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float ContainerHeight = ff3.i((float) 40.0d);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final ShapeKeyTokens ContainerShapeRound;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final ShapeKeyTokens ContainerShapeSquare;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float IconLabelSpace;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float LeadingSpace;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float OutlinedOutlineWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final ShapeKeyTokens PressedContainerShape;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final ShapeKeyTokens SelectedContainerShapeRound;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final ShapeKeyTokens SelectedContainerShapeSquare;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final float TrailingSpace;

    static {
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        ContainerShapeRound = shapeKeyTokens;
        ShapeKeyTokens shapeKeyTokens2 = ShapeKeyTokens.CornerMedium;
        ContainerShapeSquare = shapeKeyTokens2;
        IconLabelSpace = ff3.i((float) 8.0d);
        IconSize = ff3.i((float) 20.0d);
        float f = (float) 16.0d;
        LeadingSpace = ff3.i(f);
        OutlinedOutlineWidth = ff3.i((float) 1.0d);
        PressedContainerShape = ShapeKeyTokens.CornerSmall;
        SelectedContainerShapeRound = shapeKeyTokens;
        SelectedContainerShapeSquare = shapeKeyTokens2;
        TrailingSpace = ff3.i(f);
    }

    private cy0() {
    }

    public final float a() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens b() {
        return ContainerShapeRound;
    }

    public final float c() {
        return IconLabelSpace;
    }

    public final float d() {
        return LeadingSpace;
    }

    public final float e() {
        return OutlinedOutlineWidth;
    }

    public final float f() {
        return TrailingSpace;
    }
}
