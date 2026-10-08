package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p002material3.tokens.ShapeKeyTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b¨\u0006#"}, d2 = {"Lcom/google/android/vq7;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Lcom/google/android/ff3;", "c", "F", "()F", "ContainerElevation", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "d", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerShape", "e", "getFocusIndicatorColor", "FocusIndicatorColor", "f", "getListItemSelectedContainerColor", "ListItemSelectedContainerColor", "g", "getListItemSelectedLabelTextColor", "ListItemSelectedLabelTextColor", "h", "getListItemSelectedLeadingTrailingIconColor", "ListItemSelectedLeadingTrailingIconColor", "i", "getMenuListItemLeadingIconColor", "MenuListItemLeadingIconColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class vq7 {
    public static final vq7 a = new vq7();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float ContainerElevation = go3.a.c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraSmall;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusIndicatorColor = ColorSchemeKeyTokens.Secondary;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ListItemSelectedContainerColor = ColorSchemeKeyTokens.SecondaryContainer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ListItemSelectedLabelTextColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ListItemSelectedLeadingTrailingIconColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens MenuListItemLeadingIconColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSecondaryContainer;
        ListItemSelectedLabelTextColor = colorSchemeKeyTokens;
        ListItemSelectedLeadingTrailingIconColor = colorSchemeKeyTokens;
        MenuListItemLeadingIconColor = colorSchemeKeyTokens;
    }

    private vq7() {
    }

    public final ColorSchemeKeyTokens a() {
        return ContainerColor;
    }

    public final float b() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens c() {
        return ContainerShape;
    }
}
