package com.google.inputmethod;

import androidx.compose.ui.graphics.n;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/google/android/rf5;", "Lcom/google/android/xkb;", "<init>", "()V", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/graphics/n;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;)Landroidx/compose/ui/graphics/n;", "createOutline", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class rf5 implements xkb {
    public static final rf5 a = new rf5();

    private rf5() {
    }

    @Override // com.google.inputmethod.xkb
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public n mo5createOutlinePq9zytI(long size, LayoutDirection layoutDirection, f43 density) {
        float fO1 = density.O1(hf1.b());
        return new n.b(new gba(0.0f, -fO1, Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat((int) (size & 4294967295L)) + fO1));
    }
}
