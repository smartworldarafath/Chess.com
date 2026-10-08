package com.google.inputmethod;

import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/f39;", "Landroid/graphics/PathEffect;", "c", "(Lcom/google/android/f39;)Landroid/graphics/PathEffect;", "", "radius", "a", "(F)Lcom/google/android/f39;", "", "intervals", "phase", "b", "([FF)Lcom/google/android/f39;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class mm {
    public static final f39 a(float f) {
        return new lm(new CornerPathEffect(f));
    }

    public static final f39 b(float[] fArr, float f) {
        return new lm(new DashPathEffect(fArr, f));
    }

    public static final PathEffect c(f39 f39Var) {
        Intrinsics.h(f39Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((lm) f39Var).getNativePathEffect();
    }
}
