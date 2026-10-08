package com.google.inputmethod;

import androidx.compose.p002material3.ButtonElevation;
import androidx.compose.p002material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J7\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J7\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\rJA\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010\"\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010$\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010(\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010 R\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b#\u0010.R\u0017\u00102\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010.R\u0014\u00104\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010 R\u0017\u00107\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010.R\u0014\u00109\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010 R\u0017\u0010;\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b:\u0010.R\u0017\u0010>\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b<\u0010 \u001a\u0004\b3\u0010=R\u0017\u0010?\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b0\u0010=R\u0017\u0010A\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b@\u0010=R\u0017\u0010B\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b,\u0010=R\u0011\u0010E\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\b8\u0010DR\u0011\u0010F\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\b5\u0010DR\u0011\u0010G\u001a\u00020C8G¢\u0006\u0006\u001a\u0004\b<\u0010DR\u0018\u0010J\u001a\u00020\u0004*\u00020H8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010IR\u0018\u0010K\u001a\u00020\u0004*\u00020H8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010IR\u0018\u0010L\u001a\u00020\u0004*\u00020H8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010I¨\u0006M"}, d2 = {"Lcom/google/android/wx0;", "", "<init>", "()V", "Lcom/google/android/vx0;", "a", "(Landroidx/compose/runtime/d;I)Lcom/google/android/vx0;", "Lcom/google/android/ei1;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "b", "(JJJJLandroidx/compose/runtime/d;II)Lcom/google/android/vx0;", "p", "q", "r", "s", "Lcom/google/android/ff3;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "Landroidx/compose/material3/ButtonElevation;", "c", "(FFFFFLandroidx/compose/runtime/d;II)Landroidx/compose/material3/ButtonElevation;", "", "enabled", "Lcom/google/android/or0;", "o", "(ZLandroidx/compose/runtime/d;II)Lcom/google/android/or0;", "F", "ButtonLeadingSpace", "ButtonTrailingSpace", "d", "ButtonWithIconStartpadding", "e", "SmallStartPadding", "f", "SmallEndPadding", "g", "ButtonVerticalPadding", "Lcom/google/android/rx8;", "h", "Lcom/google/android/rx8;", "()Lcom/google/android/rx8;", "ContentPadding", "i", "getButtonWithIconContentPadding", "ButtonWithIconContentPadding", "j", "TextButtonHorizontalPadding", "k", "m", "TextButtonContentPadding", "l", "TextButtonWithIconHorizontalEndPadding", "getTextButtonWithIconContentPadding", "TextButtonWithIconContentPadding", "n", "()F", "MinWidth", "MinHeight", "getIconSize-D9Ej5fM", "IconSize", "IconSpacing", "Lcom/google/android/xkb;", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "shape", "outlinedShape", "textShape", "Lcom/google/android/yi1;", "(Lcom/google/android/yi1;)Lcom/google/android/vx0;", "defaultButtonColors", "defaultOutlinedButtonColors", "defaultTextButtonColors", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wx0 {
    public static final wx0 a = new wx0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float ButtonLeadingSpace;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float ButtonTrailingSpace;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float ButtonWithIconStartpadding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float SmallStartPadding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float SmallEndPadding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final rx8 ContentPadding;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final rx8 ButtonWithIconContentPadding;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final rx8 TextButtonContentPadding;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final float TextButtonWithIconHorizontalEndPadding;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final rx8 TextButtonWithIconContentPadding;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final float MinWidth;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final float MinHeight;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final float IconSize;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final float IconSpacing;
    public static final int r = 0;

    static {
        vg0 vg0Var = vg0.a;
        float fA = vg0Var.a();
        ButtonLeadingSpace = fA;
        float fB = vg0Var.b();
        ButtonTrailingSpace = fB;
        float f = 16;
        float fI = ff3.i(f);
        ButtonWithIconStartpadding = fI;
        cy0 cy0Var = cy0.a;
        SmallStartPadding = cy0Var.d();
        SmallEndPadding = cy0Var.f();
        float fI2 = ff3.i(8);
        ButtonVerticalPadding = fI2;
        rx8 rx8VarH = nx8.h(fA, fI2, fB, fI2);
        ContentPadding = rx8VarH;
        ButtonWithIconContentPadding = nx8.h(fI, fI2, fB, fI2);
        float fI3 = ff3.i(12);
        TextButtonHorizontalPadding = fI3;
        TextButtonContentPadding = nx8.h(fI3, rx8VarH.getTop(), fI3, rx8VarH.getBottom());
        float fI4 = ff3.i(f);
        TextButtonWithIconHorizontalEndPadding = fI4;
        TextButtonWithIconContentPadding = nx8.h(fI3, rx8VarH.getTop(), fI4, rx8VarH.getBottom());
        MinWidth = ff3.i(58);
        MinHeight = cy0Var.a();
        IconSize = ff3.i(18);
        IconSpacing = cy0Var.c();
    }

    private wx0() {
    }

    public final vx0 a(d dVar, int i) {
        if (e.k()) {
            e.o(1449248637, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:572)");
        }
        vx0 vx0VarE = e(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return vx0VarE;
    }

    public final vx0 b(long j, long j2, long j3, long j4, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ei1.INSTANCE.i();
        }
        if ((i2 & 2) != 0) {
            j2 = ei1.INSTANCE.i();
        }
        if ((i2 & 4) != 0) {
            j3 = ei1.INSTANCE.i();
        }
        if ((i2 & 8) != 0) {
            j4 = ei1.INSTANCE.i();
        }
        if (e.k()) {
            e.o(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:590)");
        }
        long j5 = j;
        vx0 vx0VarC = e(kh7.a.a(dVar, 6)).c(j5, j2, j3, j4);
        if (e.k()) {
            e.n();
        }
        return vx0VarC;
    }

    public final ButtonElevation c(float f, float f2, float f3, float f4, float f5, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = v94.a.b();
        }
        if ((i2 & 2) != 0) {
            f2 = v94.a.k();
        }
        if ((i2 & 4) != 0) {
            f3 = v94.a.h();
        }
        if ((i2 & 8) != 0) {
            f4 = v94.a.i();
        }
        float f6 = f4;
        if ((i2 & 16) != 0) {
            f5 = v94.a.d();
        }
        if (e.k()) {
            e.o(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:811)");
        }
        float f7 = f5;
        float f8 = f3;
        ButtonElevation buttonElevation = new ButtonElevation(f, f2, f8, f6, f7, null);
        if (e.k()) {
            e.n();
        }
        return buttonElevation;
    }

    public final rx8 d() {
        return ContentPadding;
    }

    public final vx0 e(ColorScheme colorScheme) {
        vx0 defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        v94 v94Var = v94.a;
        vx0 vx0Var = new vx0(bj1.j(colorScheme, v94Var.a()), bj1.j(colorScheme, v94Var.j()), ei1.p(bj1.j(colorScheme, v94Var.c()), v94Var.e(), 0.0f, 0.0f, 0.0f, 14, null), ei1.p(bj1.j(colorScheme, v94Var.f()), v94Var.g(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.l0(vx0Var);
        return vx0Var;
    }

    public final vx0 f(ColorScheme colorScheme) {
        vx0 defaultOutlinedButtonColorsCached = colorScheme.getDefaultOutlinedButtonColorsCached();
        if (defaultOutlinedButtonColorsCached != null) {
            return defaultOutlinedButtonColorsCached;
        }
        ei1.Companion companion = ei1.INSTANCE;
        long jH = companion.h();
        qu8 qu8Var = qu8.a;
        vx0 vx0Var = new vx0(jH, bj1.j(colorScheme, qu8Var.d()), companion.h(), ei1.p(bj1.j(colorScheme, qu8Var.b()), qu8Var.c(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.s0(vx0Var);
        return vx0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final vx0 g(ColorScheme colorScheme) throws NoWhenBranchMatchedException {
        vx0 defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        ei1.Companion companion = ei1.INSTANCE;
        long jH = companion.h();
        long j = bj1.j(colorScheme, ColorSchemeKeyTokens.Primary);
        long jH2 = companion.h();
        uqc uqcVar = uqc.a;
        vx0 vx0Var = new vx0(jH, j, jH2, ei1.p(bj1.j(colorScheme, uqcVar.a()), uqcVar.b(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.w0(vx0Var);
        return vx0Var;
    }

    public final float h() {
        return IconSpacing;
    }

    public final float i() {
        return MinHeight;
    }

    public final float j() {
        return MinWidth;
    }

    public final xkb k(d dVar, int i) {
        if (e.k()) {
            e.o(-2045213065, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:562)");
        }
        xkb xkbVarI = ulb.i(cy0.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final xkb l(d dVar, int i) {
        if (e.k()) {
            e.o(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:550)");
        }
        xkb xkbVarI = ulb.i(cy0.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final rx8 m() {
        return TextButtonContentPadding;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb n(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:566)");
        }
        xkb xkbVarI = ulb.i(cy0.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final BorderStroke o(boolean z, d dVar, int i, int i2) {
        long jP;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (e.k()) {
            e.o(-626854767, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:898)");
        }
        float fE = cy0.a.e();
        if (z) {
            dVar.y(-112346942);
            jP = bj1.l(qu8.a.e(), dVar, 6);
            dVar.u();
        } else {
            dVar.y(-112259336);
            qu8 qu8Var = qu8.a;
            jP = ei1.p(bj1.l(qu8Var.e(), dVar, 6), qu8Var.a(), 0.0f, 0.0f, 0.0f, 14, null);
            dVar.u();
        }
        BorderStroke borderStrokeA = pr0.a(fE, jP);
        if (e.k()) {
            e.n();
        }
        return borderStrokeA;
    }

    public final vx0 p(d dVar, int i) {
        if (e.k()) {
            e.o(-1344886725, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:709)");
        }
        vx0 vx0VarF = f(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return vx0VarF;
    }

    public final vx0 q(long j, long j2, long j3, long j4, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ei1.INSTANCE.i();
        }
        if ((i2 & 2) != 0) {
            j2 = ei1.INSTANCE.i();
        }
        if ((i2 & 4) != 0) {
            j3 = ei1.INSTANCE.i();
        }
        if ((i2 & 8) != 0) {
            j4 = ei1.INSTANCE.i();
        }
        if (e.k()) {
            e.o(-1778526249, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:727)");
        }
        long j5 = j;
        vx0 vx0VarC = f(kh7.a.a(dVar, 6)).c(j5, j2, j3, j4);
        if (e.k()) {
            e.n();
        }
        return vx0VarC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final vx0 r(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(1880341584, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:752)");
        }
        vx0 vx0VarG = g(kh7.a.a(dVar, 6));
        if (e.k()) {
            e.n();
        }
        return vx0VarG;
    }

    public final vx0 s(long j, long j2, long j3, long j4, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = ei1.INSTANCE.i();
        }
        if ((i2 & 2) != 0) {
            j2 = ei1.INSTANCE.i();
        }
        if ((i2 & 4) != 0) {
            j3 = ei1.INSTANCE.i();
        }
        if ((i2 & 8) != 0) {
            j4 = ei1.INSTANCE.i();
        }
        if (e.k()) {
            e.o(-1402274782, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:770)");
        }
        long j5 = j;
        vx0 vx0VarC = g(kh7.a.a(dVar, 6)).c(j5, j2, j3, j4);
        if (e.k()) {
            e.n();
        }
        return vx0VarC;
    }
}
