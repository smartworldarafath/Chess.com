package androidx.compose.p002material3;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.r43;
import com.google.inputmethod.bj1;
import com.google.inputmethod.c13;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.g16;
import com.google.inputmethod.ha9;
import com.google.inputmethod.hf3;
import com.google.inputmethod.k16;
import com.google.inputmethod.rg9;
import com.google.inputmethod.ulb;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010 R\u0011\u0010%\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\"8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010$¨\u0006'"}, d2 = {"Landroidx/compose/material3/s2;", "", "<init>", "()V", "Lcom/google/android/ff3;", "spacingBetweenTooltipAndAnchor", "Lcom/google/android/rg9;", "e", "(FLandroidx/compose/runtime/d;II)Lcom/google/android/rg9;", "Landroidx/compose/material3/q2;", "positioning", "f", "(IFLandroidx/compose/runtime/d;II)Lcom/google/android/rg9;", "Lcom/google/android/jf3;", "b", "J", "getCaretSize-MYxV2XQ", "()J", "caretSize", "c", "F", "d", "()F", "plainTooltipMaxWidth", "getRichTooltipMaxWidth-D9Ej5fM", "richTooltipMaxWidth", "Lcom/google/android/c13;", "Lcom/google/android/c13;", "getDefaultCaretShape$material3", "()Lcom/google/android/c13;", "DefaultCaretShape", "Lcom/google/android/xkb;", "(Landroidx/compose/runtime/d;I)Lcom/google/android/xkb;", "plainTooltipContainerShape", "Lcom/google/android/ei1;", "a", "(Landroidx/compose/runtime/d;I)J", "plainTooltipContainerColor", "plainTooltipContentColor", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s2 {
    public static final s2 a = new s2();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long caretSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float plainTooltipMaxWidth;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float richTooltipMaxWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final c13 DefaultCaretShape;
    public static final int f = 0;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/compose/material3/s2$a", "Lcom/google/android/rg9;", "Lcom/google/android/k16;", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Lcom/google/android/g16;", "a", "(Lcom/google/android/k16;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements rg9 {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // com.google.inputmethod.rg9
        public long a(k16 anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
            int left = anchorBounds.getLeft() + ((anchorBounds.r() - ((int) (popupContentSize >> 32))) / 2);
            int top = (anchorBounds.getTop() - ((int) (popupContentSize & 4294967295L))) - this.a;
            if (top < 0) {
                top = this.a + anchorBounds.getBottom();
            }
            return g16.f((((long) left) << 32) | (((long) top) & 4294967295L));
        }
    }

    static {
        long jA = hf3.a(ff3.i(16), ff3.i(8));
        caretSize = jA;
        plainTooltipMaxWidth = ff3.i(200);
        richTooltipMaxWidth = ff3.i(320);
        DefaultCaretShape = new c13(jA, null);
    }

    private s2() {
    }

    public final long a(d dVar, int i) {
        if (e.k()) {
            e.o(102696215, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:626)");
        }
        long jL = bj1.l(ha9.a.a(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final xkb b(d dVar, int i) throws NoWhenBranchMatchedException {
        if (e.k()) {
            e.o(49570325, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:622)");
        }
        xkb xkbVarI = ulb.i(ha9.a.b(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return xkbVarI;
    }

    public final long c(d dVar, int i) {
        if (e.k()) {
            e.o(-1982928937, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:630)");
        }
        long jL = bj1.l(ha9.a.c(), dVar, 6);
        if (e.k()) {
            e.n();
        }
        return jL;
    }

    public final float d() {
        return plainTooltipMaxWidth;
    }

    @r43
    public final rg9 e(float f2, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            f2 = TooltipKt.p();
        }
        if (e.k()) {
            e.o(1047866909, i, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:707)");
        }
        int iO1 = ((f43) dVar.v(CompositionLocalsKt.g())).O1(f2);
        boolean zC = dVar.C(iO1);
        Object objR = dVar.R();
        if (zC || objR == d.INSTANCE.a()) {
            objR = new a(iO1);
            dVar.L(objR);
        }
        a aVar = (a) objR;
        if (e.k()) {
            e.n();
        }
        return aVar;
    }

    public final rg9 f(int i, float f2, d dVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            f2 = TooltipKt.p();
        }
        if (e.k()) {
            e.o(-573803578, i2, -1, "androidx.compose.material3.TooltipDefaults.rememberTooltipPositionProvider (Tooltip.kt:849)");
        }
        int iO1 = ((f43) dVar.v(CompositionLocalsKt.g())).O1(f2);
        boolean zC = ((((i2 & 14) ^ 6) > 4 && dVar.C(i)) || (i2 & 6) == 4) | dVar.C(iO1);
        Object objR = dVar.R();
        if (zC || objR == d.INSTANCE.a()) {
            objR = new u2(i, iO1, null);
            dVar.L(objR);
        }
        u2 u2Var = (u2) objR;
        if (e.k()) {
            e.n();
        }
        return u2Var;
    }
}
