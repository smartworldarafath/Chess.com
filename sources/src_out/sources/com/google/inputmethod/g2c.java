package com.google.inputmethod;

import android.view.ViewConfiguration;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"T", "Lcom/google/android/vq2;", "b", "(Landroidx/compose/runtime/d;I)Lcom/google/android/vq2;", "", "a", "F", "()F", "platformFlingScrollFriction", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g2c {
    private static final float a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return a;
    }

    public static final <T> vq2<T> b(d dVar, int i) {
        if (e.k()) {
            e.o(904445851, i, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        boolean zB = dVar.B(f43Var.getDensity());
        Object objR = dVar.R();
        if (zB || objR == d.INSTANCE.a()) {
            objR = xq2.d(new f2c(f43Var));
            dVar.L(objR);
        }
        vq2<T> vq2Var = (vq2) objR;
        if (e.k()) {
            e.n();
        }
        return vq2Var;
    }
}
