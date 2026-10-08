package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u0000 %2\u00020\u0001:\u0001\u0012B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\"¨\u0006&"}, d2 = {"Lcom/google/android/nw7;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/y;", "inputTextStyle", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/y;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;)V", "Lcom/google/android/kx1;", "inConstraints", "", "minLines", "c", "(JI)J", "a", "Landroidx/compose/ui/unit/LayoutDirection;", "g", "()Landroidx/compose/ui/unit/LayoutDirection;", "b", "Landroidx/compose/ui/text/y;", "f", "()Landroidx/compose/ui/text/y;", "Lcom/google/android/f43;", "d", "()Lcom/google/android/f43;", "Landroidx/compose/ui/text/font/l$b;", "e", "()Landroidx/compose/ui/text/font/l$b;", "resolvedStyle", "", "F", "lineHeightCache", "oneLineHeightCache", "h", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nw7 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int i = 8;
    private static nw7 j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextStyle inputTextStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final f43 density;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final l.b fontFamilyResolver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextStyle resolvedStyle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float lineHeightCache = Float.NaN;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float oneLineHeightCache = Float.NaN;

    /* JADX INFO: renamed from: com.google.android.nw7$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/nw7$a;", "", "<init>", "()V", "Lcom/google/android/nw7;", "minMaxUtil", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/y;", "paramStyle", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "a", "(Lcom/google/android/nw7;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/y;Lcom/google/android/f43;Landroidx/compose/ui/text/font/l$b;)Lcom/google/android/nw7;", "last", "Lcom/google/android/nw7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nw7 a(nw7 minMaxUtil, LayoutDirection layoutDirection, TextStyle paramStyle, f43 density, l.b fontFamilyResolver) {
            if (minMaxUtil != null && layoutDirection == minMaxUtil.getLayoutDirection() && Intrinsics.e(vzc.d(paramStyle, layoutDirection), minMaxUtil.getInputTextStyle()) && density.getDensity() == minMaxUtil.getDensity().getDensity() && fontFamilyResolver == minMaxUtil.getFontFamilyResolver()) {
                return minMaxUtil;
            }
            nw7 nw7Var = nw7.j;
            if (nw7Var != null && layoutDirection == nw7Var.getLayoutDirection() && Intrinsics.e(vzc.d(paramStyle, layoutDirection), nw7Var.getInputTextStyle()) && density.getDensity() == nw7Var.getDensity().getDensity() && fontFamilyResolver == nw7Var.getFontFamilyResolver()) {
                return nw7Var;
            }
            nw7 nw7Var2 = new nw7(layoutDirection, vzc.d(paramStyle, layoutDirection), k43.a(density.getDensity(), density.getFontScale()), fontFamilyResolver);
            nw7.j = nw7Var2;
            return nw7Var2;
        }

        private Companion() {
        }
    }

    public nw7(LayoutDirection layoutDirection, TextStyle textStyle, f43 f43Var, l.b bVar) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = f43Var;
        this.fontFamilyResolver = bVar;
        this.resolvedStyle = vzc.d(textStyle, layoutDirection);
    }

    public final long c(long inConstraints, int minLines) {
        float f = this.oneLineHeightCache;
        float f2 = this.lineHeightCache;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = ow7.a;
            TextStyle textStyle = this.resolvedStyle;
            long jB = nx1.b(0, 0, 0, 0, 15, null);
            f43 f43Var = this.density;
            l.b bVar = this.fontFamilyResolver;
            uyc.Companion companion = uyc.INSTANCE;
            float height = androidx.compose.ui.text.l.a(str, textStyle, jB, f43Var, bVar, (64 & 32) != 0 ? m.p() : null, (64 & 64) != 0 ? m.p() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 1, (64 & 256) != 0 ? uyc.INSTANCE.a() : companion.a()).getHeight();
            float height2 = androidx.compose.ui.text.l.a(ow7.b, this.resolvedStyle, nx1.b(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, (64 & 32) != 0 ? m.p() : null, (64 & 64) != 0 ? m.p() : null, (64 & 128) != 0 ? Integer.MAX_VALUE : 2, (64 & 256) != 0 ? uyc.INSTANCE.a() : companion.a()).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
            f2 = height2;
            f = height;
        }
        return nx1.a(kx1.n(inConstraints), kx1.l(inConstraints), minLines != 1 ? g.j(g.e(Math.round(f + (f2 * (minLines - 1))), 0), kx1.k(inConstraints)) : kx1.m(inConstraints), kx1.k(inConstraints));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }
}
