package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {339}, m = "invokeSuspend", v = 1)
final class DraggableNode$onDragStopped$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ l.d $event;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DraggableNode$onDragStopped$1(DraggableNode draggableNode, l.d dVar, q22<? super DraggableNode$onDragStopped$1> q22Var) {
        super(2, q22Var);
        this.this$0 = draggableNode;
        this.$event = dVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        DraggableNode$onDragStopped$1 draggableNode$onDragStopped$1 = new DraggableNode$onDragStopped$1(this.this$0, this.$event, q22Var);
        draggableNode$onDragStopped$1.L$0 = obj;
        return draggableNode$onDragStopped$1;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ta2 ta2Var = (ta2) this.L$0;
            ps4 ps4Var = this.this$0.onDragStopped;
            Float fD = ut0.d(DraggableKt.k(this.this$0.q4(this.$event.getVelocity()), this.this$0.orientation));
            this.label = 1;
            if (ps4Var.invoke(ta2Var, fD, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }
}
