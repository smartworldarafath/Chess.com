package androidx.compose.p002material3;

import androidx.compose.p001foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.df9;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ClockDialNode$pointerInputDragNode$1 implements PointerInputEventHandler {
    final /* synthetic */ ClockDialNode a;

    ClockDialNode$pointerInputDragNode$1(ClockDialNode clockDialNode) {
        this.a = clockDialNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(ClockDialNode clockDialNode) {
        rw0.d(clockDialNode.L2(), (CoroutineContext) null, (CoroutineStart) null, new C0169ClockDialNode$pointerInputDragNode$1$1$1(clockDialNode, null), 3, (Object) null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(ClockDialNode clockDialNode, PointerInputChange pointerInputChange, rn8 rn8Var) {
        rw0.d(clockDialNode.L2(), (CoroutineContext) null, (CoroutineStart) null, new C0170ClockDialNode$pointerInputDragNode$1$2$1(clockDialNode, rn8Var, null), 3, (Object) null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(df9 df9Var, q22<? super Unit> q22Var) {
        final ClockDialNode clockDialNode = this.a;
        Function0 function0 = new Function0() { // from class: androidx.compose.material3.b
            public final Object invoke() {
                return ClockDialNode$pointerInputDragNode$1.c(clockDialNode);
            }
        };
        final ClockDialNode clockDialNode2 = this.a;
        Object objN = DragGestureDetectorKt.n(df9Var, null, function0, null, new Function2() { // from class: androidx.compose.material3.c
            public final Object invoke(Object obj, Object obj2) {
                return ClockDialNode$pointerInputDragNode$1.d(clockDialNode2, (PointerInputChange) obj, (rn8) obj2);
            }
        }, q22Var, 5, null);
        return objN == a.g() ? objN : Unit.a;
    }
}
