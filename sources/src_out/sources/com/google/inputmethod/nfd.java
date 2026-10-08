package com.google.inputmethod;

import androidx.compose.p000animation.ColorVectorConverterKt;
import androidx.compose.p000animation.core.InfiniteTransition;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "Lcom/google/android/ei1;", "initialValue", "targetValue", "Lcom/google/android/ov5;", "animationSpec", "", "label", "Lcom/google/android/q6c;", "a", "(Landroidx/compose/animation/core/InfiniteTransition;JJLcom/google/android/ov5;Ljava/lang/String;Landroidx/compose/runtime/d;II)Lcom/google/android/q6c;", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nfd {
    public static final q6c<ei1> a(InfiniteTransition infiniteTransition, long j, long j2, ov5<ei1> ov5Var, String str, d dVar, int i, int i2) {
        d dVar2;
        String str2 = (i2 & 8) != 0 ? "ColorAnimation" : str;
        if (e.k()) {
            e.o(1901963533, i, -1, "androidx.compose.animation.animateColor (Transition.kt:97)");
        }
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            objR = (tjd) ColorVectorConverterKt.a(ei1.INSTANCE).invoke(ei1.u(j2));
            dVar2 = dVar;
            dVar2.L(objR);
        } else {
            dVar2 = dVar;
        }
        int i3 = i << 3;
        q6c<ei1> q6cVarD = androidx.compose.p000animation.core.d.d(infiniteTransition, ei1.l(j), ei1.l(j2), (tjd) objR, ov5Var, str2, dVar2, InfiniteTransition.f | (i & 14) | (i & 112) | (i & 896) | (ov5.d << 12) | (57344 & i3) | (i3 & 458752), 0);
        if (e.k()) {
            e.n();
        }
        return q6cVarD;
    }
}
