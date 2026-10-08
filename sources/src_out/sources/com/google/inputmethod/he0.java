package com.google.inputmethod;

import androidx.compose.p002material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p002material3.tokens.ShapeKeyTokens;
import androidx.compose.p002material3.tokens.TypographyKeyTokens;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\n\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\r\u0010\u001dR\u0017\u0010 \u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0017\u0010\"\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006#"}, d2 = {"Lcom/google/android/he0;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "b", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "a", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "Color", "c", "getLargeColor", "LargeColor", "d", "getLargeLabelTextColor", "LargeLabelTextColor", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "e", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "LargeLabelTextFont", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "f", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "LargeShape", "Lcom/google/android/ff3;", "g", "F", "()F", "LargeSize", "h", "Shape", "i", "Size", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class he0 {
    public static final he0 a = new he0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens Color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens LargeColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final ColorSchemeKeyTokens LargeLabelTextColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final TypographyKeyTokens LargeLabelTextFont;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final ShapeKeyTokens LargeShape;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float LargeSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final ShapeKeyTokens Shape;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float Size;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Error;
        Color = colorSchemeKeyTokens;
        LargeColor = colorSchemeKeyTokens;
        LargeLabelTextColor = ColorSchemeKeyTokens.OnError;
        LargeLabelTextFont = TypographyKeyTokens.LabelSmall;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        LargeShape = shapeKeyTokens;
        LargeSize = ff3.i((float) 16.0d);
        Shape = shapeKeyTokens;
        Size = ff3.i((float) 6.0d);
    }

    private he0() {
    }

    public final ColorSchemeKeyTokens a() {
        return Color;
    }

    public final TypographyKeyTokens b() {
        return LargeLabelTextFont;
    }

    public final ShapeKeyTokens c() {
        return LargeShape;
    }

    public final float d() {
        return LargeSize;
    }

    public final ShapeKeyTokens e() {
        return Shape;
    }

    public final float f() {
        return Size;
    }
}
