package com.google.inputmethod;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/q09;", "Lcom/google/android/ei1;", "color", "Landroidx/compose/ui/graphics/e;", "blendMode", "Landroid/graphics/BlurMaskFilter;", "Landroidx/compose/ui/graphics/shadow/BlurFilter;", "blurFilter", "Lcom/google/android/w09;", "style", "a", "(Lcom/google/android/q09;JILandroid/graphics/BlurMaskFilter;I)Lcom/google/android/q09;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class bq0 {
    public static final q09 a(q09 q09Var, long j, int i, BlurMaskFilter blurMaskFilter, int i2) {
        q09Var.n(j);
        q09Var.e(i);
        q09Var.y(i2);
        cq0.b(q09Var, blurMaskFilter);
        return q09Var;
    }

    public static /* synthetic */ q09 b(q09 q09Var, long j, int i, BlurMaskFilter blurMaskFilter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = ei1.INSTANCE.a();
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = e.INSTANCE.B();
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            blurMaskFilter = null;
        }
        BlurMaskFilter blurMaskFilter2 = blurMaskFilter;
        if ((i3 & 8) != 0) {
            i2 = w09.INSTANCE.a();
        }
        return a(q09Var, j2, i4, blurMaskFilter2, i2);
    }
}
