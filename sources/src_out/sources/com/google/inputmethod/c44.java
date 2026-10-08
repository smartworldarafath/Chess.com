package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ColorSchemeKeyTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001d\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u0011\u0010\rR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b¨\u0006!"}, d2 = {"Lcom/google/android/c44;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerColor", "Lcom/google/android/ff3;", "c", "F", "()F", "ContainerElevation", "d", "FocusedContainerElevation", "e", "getFocusedIconColor", "FocusedIconColor", "f", "HoveredContainerElevation", "g", "getHoveredIconColor", "HoveredIconColor", "h", "getIconColor", "IconColor", "i", "PressedContainerElevation", "j", "getPressedIconColor", "PressedIconColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c44 {
    public static final c44 a = new c44();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.PrimaryContainer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float ContainerElevation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float FocusedContainerElevation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens FocusedIconColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float HoveredContainerElevation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens HoveredIconColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens IconColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float PressedContainerElevation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens PressedIconColor;

    static {
        go3 go3Var = go3.a;
        ContainerElevation = go3Var.d();
        FocusedContainerElevation = go3Var.d();
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnPrimaryContainer;
        FocusedIconColor = colorSchemeKeyTokens;
        HoveredContainerElevation = go3Var.e();
        HoveredIconColor = colorSchemeKeyTokens;
        IconColor = colorSchemeKeyTokens;
        PressedContainerElevation = go3Var.d();
        PressedIconColor = colorSchemeKeyTokens;
    }

    private c44() {
    }

    public final ColorSchemeKeyTokens a() {
        return ContainerColor;
    }

    public final float b() {
        return ContainerElevation;
    }

    public final float c() {
        return FocusedContainerElevation;
    }

    public final float d() {
        return HoveredContainerElevation;
    }

    public final float e() {
        return PressedContainerElevation;
    }
}
