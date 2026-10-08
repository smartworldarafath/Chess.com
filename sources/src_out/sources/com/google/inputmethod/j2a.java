package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ColorSchemeKeyTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\b¨\u0006)"}, d2 = {"Lcom/google/android/j2a;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledSelectedIconColor", "c", "DisabledUnselectedIconColor", "Lcom/google/android/ff3;", "d", "F", "()F", "IconSize", "e", "getSelectedFocusIconColor", "SelectedFocusIconColor", "f", "getSelectedHoverIconColor", "SelectedHoverIconColor", "g", "SelectedIconColor", "h", "getSelectedPressedIconColor", "SelectedPressedIconColor", "i", "StateLayerSize", "j", "getUnselectedFocusIconColor", "UnselectedFocusIconColor", "k", "getUnselectedHoverIconColor", "UnselectedHoverIconColor", "l", "UnselectedIconColor", "m", "getUnselectedPressedIconColor", "UnselectedPressedIconColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j2a {
    public static final j2a a = new j2a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledSelectedIconColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens DisabledUnselectedIconColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedFocusIconColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedHoverIconColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedIconColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens SelectedPressedIconColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float StateLayerSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedFocusIconColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedHoverIconColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedIconColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens UnselectedPressedIconColor;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        DisabledSelectedIconColor = colorSchemeKeyTokens;
        DisabledUnselectedIconColor = colorSchemeKeyTokens;
        IconSize = ff3.i((float) 20.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.Primary;
        SelectedFocusIconColor = colorSchemeKeyTokens2;
        SelectedHoverIconColor = colorSchemeKeyTokens2;
        SelectedIconColor = colorSchemeKeyTokens2;
        SelectedPressedIconColor = colorSchemeKeyTokens2;
        StateLayerSize = ff3.i((float) 40.0d);
        UnselectedFocusIconColor = colorSchemeKeyTokens;
        UnselectedHoverIconColor = colorSchemeKeyTokens;
        UnselectedIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        UnselectedPressedIconColor = colorSchemeKeyTokens;
    }

    private j2a() {
    }

    public final ColorSchemeKeyTokens a() {
        return DisabledSelectedIconColor;
    }

    public final ColorSchemeKeyTokens b() {
        return DisabledUnselectedIconColor;
    }

    public final float c() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens d() {
        return SelectedIconColor;
    }

    public final float e() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens f() {
        return UnselectedIconColor;
    }
}
