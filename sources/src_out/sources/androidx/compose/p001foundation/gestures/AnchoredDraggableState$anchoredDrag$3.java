package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", l = {1204}, m = "anchoredDrag", v = 1)
final class AnchoredDraggableState$anchoredDrag$3 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableState$anchoredDrag$3(AnchoredDraggableState<T> anchoredDraggableState, q22<? super AnchoredDraggableState$anchoredDrag$3> q22Var) {
        super(q22Var);
        this.this$0 = anchoredDraggableState;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= t04.INVALID_ID;
        return this.this$0.k(null, null, null, (q22<? super Unit>) this);
    }
}
