package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.bg3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/bg3;", "", "<anonymous>", "(Lcom/google/android/bg3;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {323}, m = "invokeSuspend", v = 1)
final class DraggableNode$drag$2 extends SuspendLambda implements Function2<bg3, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<Function1<? super l.b, Unit>, q22<? super Unit>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DraggableNode$drag$2(Function2<? super Function1<? super l.b, Unit>, ? super q22<? super Unit>, ? extends Object> function2, DraggableNode draggableNode, q22<? super DraggableNode$drag$2> q22Var) {
        super(2, q22Var);
        this.$forEachDelta = function2;
        this.this$0 = draggableNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(bg3 bg3Var, DraggableNode draggableNode, l.b bVar) {
        bg3Var.a(DraggableKt.j(draggableNode.r4(bVar.getDelta()), draggableNode.orientation));
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        DraggableNode$drag$2 draggableNode$drag$2 = new DraggableNode$drag$2(this.$forEachDelta, this.this$0, q22Var);
        draggableNode$drag$2.L$0 = obj;
        return draggableNode$drag$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final bg3 bg3Var = (bg3) this.L$0;
            Function2<Function1<? super l.b, Unit>, q22<? super Unit>, Object> function2 = this.$forEachDelta;
            final DraggableNode draggableNode = this.this$0;
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.m
                public final Object invoke(Object obj2) {
                    return DraggableNode$drag$2.m(bg3Var, draggableNode, (l.b) obj2);
                }
            };
            this.label = 1;
            if (function2.invoke(function1, this) == objG) {
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

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object invoke(bg3 bg3Var, q22<? super Unit> q22Var) {
        return create(bg3Var, q22Var).invokeSuspend(Unit.a);
    }
}
