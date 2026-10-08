package com.google.inputmethod;

import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.n;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/y;", "start", "stop", "", "fraction", "c", "(Landroidx/compose/ui/text/y;Landroidx/compose/ui/text/y;F)Landroidx/compose/ui/text/y;", "style", "Landroidx/compose/ui/unit/LayoutDirection;", "direction", "d", "(Landroidx/compose/ui/text/y;Landroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/y;", "layoutDirection", "Lcom/google/android/dsc;", "textDirection", "e", "(Landroidx/compose/ui/unit/LayoutDirection;I)I", "Lcom/google/android/vb9;", "platformSpanStyle", "Landroidx/compose/ui/text/o;", "platformParagraphStyle", "Lcom/google/android/cc9;", "b", "(Lcom/google/android/vb9;Landroidx/compose/ui/text/o;)Lcom/google/android/cc9;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class vzc {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle b(vb9 vb9Var, PlatformParagraphStyle platformParagraphStyle) {
        if (vb9Var == null && platformParagraphStyle == null) {
            return null;
        }
        return ro.a(vb9Var, platformParagraphStyle);
    }

    public static final TextStyle c(TextStyle textStyle, TextStyle textStyle2, float f) {
        return new TextStyle(wzb.d(textStyle.getSpanStyle(), textStyle2.getSpanStyle(), f), n.b(textStyle.getParagraphStyle(), textStyle2.getParagraphStyle(), f));
    }

    public static final TextStyle d(TextStyle textStyle, LayoutDirection layoutDirection) {
        return new TextStyle(wzb.j(textStyle.y()), n.e(textStyle.v(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final int e(LayoutDirection layoutDirection, int i) throws NoWhenBranchMatchedException {
        dsc.Companion companion = dsc.INSTANCE;
        if (dsc.j(i, companion.a())) {
            int i2 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                return companion.b();
            }
            if (i2 == 2) {
                return companion.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!dsc.j(i, companion.f())) {
            return i;
        }
        int i3 = a.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            return companion.d();
        }
        if (i3 == 2) {
            return companion.e();
        }
        throw new NoWhenBranchMatchedException();
    }
}
