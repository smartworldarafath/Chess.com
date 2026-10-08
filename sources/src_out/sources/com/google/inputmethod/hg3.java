package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.AnchoredDraggableState;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Landroidx/compose/ui/b;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function2;", "Lcom/google/android/q16;", "Lcom/google/android/kx1;", "Lkotlin/Pair;", "Lcom/google/android/dg3;", "anchors", "a", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/b;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hg3 {
    public static final <T> b a(b bVar, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, Function2<? super q16, ? super kx1, ? extends Pair<? extends dg3<T>, ? extends T>> function2) {
        return bVar.then(new gg3(anchoredDraggableState, function2, orientation));
    }
}
