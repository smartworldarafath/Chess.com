package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0010\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/b;", "", "enabled", "showHoverIcon", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "b", "(Landroidx/compose/ui/b;ZZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "a", "F", "getHandwritingBoundsVerticalOffset", "()F", "HandwritingBoundsVerticalOffset", "getHandwritingBoundsHorizontalOffset", "HandwritingBoundsHorizontalOffset", "Lcom/google/android/kf3;", "c", "Lcom/google/android/kf3;", "()Lcom/google/android/kf3;", "HandwritingBoundsExpansion", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hcc {
    private static final float a;
    private static final float b;
    private static final DpTouchBoundsExpansion c;

    static {
        float fI = ff3.i(40);
        a = fI;
        float fI2 = ff3.i(10);
        b = fI2;
        c = qbd.a(fI2, fI, fI2, fI);
    }

    public static final DpTouchBoundsExpansion a() {
        return c;
    }

    public static final b b(b bVar, boolean z, boolean z2, Function0<Unit> function0) {
        if (!z || !icc.a()) {
            return bVar;
        }
        if (z2) {
            bVar = pe9.c(bVar, xyc.a(), false, c);
        }
        return bVar.then(new gcc(function0));
    }
}
