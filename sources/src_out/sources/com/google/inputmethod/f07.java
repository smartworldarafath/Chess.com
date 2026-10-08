package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\"\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\n\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u0017\u0010\u000f¨\u00062"}, d2 = {"Lcom/google/android/f07;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/y;", "resolvedStyle", "typeface", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;Landroidx/compose/ui/text/y;Ljava/lang/Object;)V", "Lcom/google/android/q16;", "a", "()J", "", "c", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "b", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "setDensity", "(Lcom/google/android/f43;)V", "Landroidx/compose/ui/text/font/l$b;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/l$b;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/l$b;)V", "d", "Landroidx/compose/ui/text/y;", "getResolvedStyle", "()Landroidx/compose/ui/text/y;", "setResolvedStyle", "(Landroidx/compose/ui/text/y;)V", "e", "Ljava/lang/Object;", "getTypeface", "()Ljava/lang/Object;", "setTypeface", "(Ljava/lang/Object;)V", "value", "f", "J", "minSize", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f07 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private l.b fontFamilyResolver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private TextStyle resolvedStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Object typeface;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long minSize = a();

    public f07(LayoutDirection layoutDirection, f43 f43Var, l.b bVar, TextStyle textStyle, Object obj) {
        this.layoutDirection = layoutDirection;
        this.density = f43Var;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = textStyle;
        this.typeface = obj;
    }

    private final long a() {
        return ysc.b(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMinSize() {
        return this.minSize;
    }

    public final void c(LayoutDirection layoutDirection, f43 density, l.b fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        if (layoutDirection == this.layoutDirection && Intrinsics.e(density, this.density) && Intrinsics.e(fontFamilyResolver, this.fontFamilyResolver) && Intrinsics.e(resolvedStyle, this.resolvedStyle) && Intrinsics.e(typeface, this.typeface)) {
            return;
        }
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        this.typeface = typeface;
        this.minSize = a();
    }
}
