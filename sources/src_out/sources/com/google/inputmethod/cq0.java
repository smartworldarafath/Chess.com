package com.google.inputmethod;

import android.graphics.BlurMaskFilter;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\b*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u0000¢\u0006\u0004\b\t\u0010\n*\f\b\u0000\u0010\u000b\"\u00020\u00022\u00020\u0002¨\u0006\f"}, d2 = {"", "radius", "Landroid/graphics/BlurMaskFilter;", "Landroidx/compose/ui/graphics/shadow/BlurFilter;", "a", "(F)Landroid/graphics/BlurMaskFilter;", "Lcom/google/android/q09;", "blur", "", "b", "(Lcom/google/android/q09;Landroid/graphics/BlurMaskFilter;)V", "BlurFilter", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cq0 {
    public static final BlurMaskFilter a(float f) {
        return new BlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
    }

    public static final void b(q09 q09Var, BlurMaskFilter blurMaskFilter) {
        dm.f(q09Var).setMaskFilter(blurMaskFilter);
    }
}
