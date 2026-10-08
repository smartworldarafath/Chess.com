package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.p001foundation.gestures.snapping.g;
import androidx.compose.p001foundation.pager.PagerState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.android.q06;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0003\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/google/android/oy8;", "", "<init>", "()V", "Landroidx/compose/foundation/pager/PagerState;", "state", "Lcom/google/android/qz8;", "pagerSnapDistance", "Lcom/google/android/vq2;", "", "decayAnimationSpec", "Lcom/google/android/kr;", "snapAnimationSpec", "snapPositionalThreshold", "Lcom/google/android/omc;", "b", "(Landroidx/compose/foundation/pager/PagerState;Lcom/google/android/qz8;Lcom/google/android/vq2;Lcom/google/android/kr;FLandroidx/compose/runtime/d;II)Lcom/google/android/omc;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/re8;", "d", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/d;I)Lcom/google/android/re8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oy8 {
    public static final oy8 a = new oy8();

    private oy8() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(PagerState pagerState, LayoutDirection layoutDirection, float f, float f2, float f3, float f4) {
        return g.c(pagerState, layoutDirection, f, f2, f3, f4);
    }

    public final omc b(final PagerState pagerState, qz8 qz8Var, vq2<Float> vq2Var, kr<Float> krVar, final float f, d dVar, int i, int i2) {
        boolean z = true;
        if ((i2 & 2) != 0) {
            qz8Var = qz8.INSTANCE.a(1);
        }
        if ((i2 & 4) != 0) {
            vq2Var = g2c.b(dVar, 0);
        }
        if ((i2 & 8) != 0) {
            krVar = lr.j(0.0f, 400.0f, Float.valueOf(kce.b(q06.a)), 1, null);
        }
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        if (e.k()) {
            e.o(1559769181, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:386)");
        }
        if (!(0.0f <= f && f <= 1.0f)) {
            cx5.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f);
        }
        f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        final LayoutDirection layoutDirection = (LayoutDirection) dVar.v(CompositionLocalsKt.m());
        boolean zX = ((((i & 14) ^ 6) > 4 && dVar.x(pagerState)) || (i & 6) == 4) | dVar.x(vq2Var) | dVar.x(krVar);
        if ((((i & 112) ^ 48) <= 32 || !dVar.x(qz8Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean zX2 = zX | z | dVar.x(f43Var) | dVar.C(layoutDirection.ordinal());
        Object objR = dVar.R();
        if (zX2 || objR == d.INSTANCE.a()) {
            objR = SnapFlingBehaviorKt.p(g.a(pagerState, qz8Var, new ps4() { // from class: com.google.android.ny8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return Float.valueOf(oy8.c(pagerState, layoutDirection, f, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
                }
            }), vq2Var, krVar);
            dVar.L(objR);
        }
        omc omcVar = (omc) objR;
        if (e.k()) {
            e.n();
        }
        return omcVar;
    }

    public final re8 d(PagerState pagerState, Orientation orientation, d dVar, int i) {
        if (e.k()) {
            e.o(877583120, i, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:435)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && dVar.x(pagerState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && dVar.C(orientation.ordinal())) || (i & 48) == 32);
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            objR = new hy2(pagerState, orientation);
            dVar.L(objR);
        }
        hy2 hy2Var = (hy2) objR;
        if (e.k()) {
            e.n();
        }
        return hy2Var;
    }
}
