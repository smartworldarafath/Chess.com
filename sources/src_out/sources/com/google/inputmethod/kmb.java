package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p002material3.tokens.ShapeKeyTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b¨\u0006#"}, d2 = {"Lcom/google/android/kmb;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DockedContainerColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "c", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DockedContainerShape", "d", "DockedDragHandleColor", "Lcom/google/android/ff3;", "e", "F", "()F", "DockedDragHandleHeight", "f", "DockedDragHandleWidth", "g", "getDockedMinimizedContainerShape", "DockedMinimizedContainerShape", "h", "DockedModalContainerElevation", "i", "getDockedStandardContainerElevation-D9Ej5fM", "DockedStandardContainerElevation", "j", "getFocusIndicatorColor", "FocusIndicatorColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kmb {
    public static final kmb a = new kmb();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DockedContainerColor = ColorSchemeKeyTokens.SurfaceContainerLow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final ShapeKeyTokens DockedContainerShape = ShapeKeyTokens.CornerExtraLargeTop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DockedDragHandleColor = ColorSchemeKeyTokens.OnSurfaceVariant;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float DockedDragHandleHeight = ff3.i((float) 4.0d);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float DockedDragHandleWidth = ff3.i((float) 32.0d);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final ShapeKeyTokens DockedMinimizedContainerShape = ShapeKeyTokens.CornerNone;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float DockedModalContainerElevation;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float DockedStandardContainerElevation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusIndicatorColor;

    static {
        go3 go3Var = go3.a;
        DockedModalContainerElevation = go3Var.b();
        DockedStandardContainerElevation = go3Var.b();
        FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;
    }

    private kmb() {
    }

    public final ColorSchemeKeyTokens a() {
        return DockedContainerColor;
    }

    public final ShapeKeyTokens b() {
        return DockedContainerShape;
    }

    public final ColorSchemeKeyTokens c() {
        return DockedDragHandleColor;
    }

    public final float d() {
        return DockedDragHandleHeight;
    }

    public final float e() {
        return DockedDragHandleWidth;
    }

    public final float f() {
        return DockedModalContainerElevation;
    }
}
