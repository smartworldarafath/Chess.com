package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.AnchoredDraggableKt;
import androidx.compose.p001foundation.gestures.AnchoredDraggableState;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/google/android/tg;", "", "<init>", "()V", "T", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "Lkotlin/Function1;", "", "positionalThreshold", "Lcom/google/android/kr;", "animationSpec", "Lcom/google/android/omc;", "c", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lkotlin/jvm/functions/Function1;Lcom/google/android/kr;Landroidx/compose/runtime/d;II)Lcom/google/android/omc;", "b", "Lcom/google/android/kr;", "f", "()Lcom/google/android/kr;", "SnapAnimationSpec", "Lkotlin/jvm/functions/Function1;", "e", "()Lkotlin/jvm/functions/Function1;", "PositionalThreshold", "Lcom/google/android/vq2;", "d", "Lcom/google/android/vq2;", "()Lcom/google/android/vq2;", "DecayAnimationSpec", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class tg {
    public static final tg a = new tg();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final kr<Float> SnapAnimationSpec = lr.l(0, 0, null, 7, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final Function1<Float, Float> PositionalThreshold = new Function1() { // from class: com.google.android.sg
        public final Object invoke(Object obj) {
            return Float.valueOf(tg.b(((Float) obj).floatValue()));
        }
    };

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final vq2<Float> DecayAnimationSpec = xq2.c(0.0f, 0.0f, 3, null);
    public static final int e = 8;

    private tg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f) {
        return f / 2.0f;
    }

    public final <T> omc c(AnchoredDraggableState<T> anchoredDraggableState, Function1<? super Float, Float> function1, kr<Float> krVar, d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            function1 = PositionalThreshold;
        }
        if ((i2 & 4) != 0) {
            krVar = SnapAnimationSpec;
        }
        if (e.k()) {
            e.o(-952742024, i, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1554)");
        }
        f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        boolean zX = ((((i & 14) ^ 6) > 4 && dVar.x(anchoredDraggableState)) || (i & 6) == 4) | dVar.x(f43Var) | ((((i & 112) ^ 48) > 32 && dVar.x(function1)) || (i & 48) == 32) | dVar.x(krVar);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = AnchoredDraggableKt.s(anchoredDraggableState, f43Var, function1, krVar);
            dVar.L(objR);
        }
        omc omcVar = (omc) objR;
        if (e.k()) {
            e.n();
        }
        return omcVar;
    }

    public final vq2<Float> d() {
        return DecayAnimationSpec;
    }

    public final Function1<Float, Float> e() {
        return PositionalThreshold;
    }

    public final kr<Float> f() {
        return SnapAnimationSpec;
    }
}
