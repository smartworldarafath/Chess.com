package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.dg3;
import com.google.inputmethod.rg;
import com.google.inputmethod.rn8;
import com.google.inputmethod.we8;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/google/android/rg;", "Lcom/google/android/dg3;", "it", "", "<anonymous>", "(Lcom/google/android/rg;Lcom/google/android/dg3;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {412}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableNode$drag$2<T> extends SuspendLambda implements ps4<rg, dg3<T>, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<Function1<? super l.b, Unit>, q22<? super Unit>, Object> $forEachDelta;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$drag$2(Function2<? super Function1<? super l.b, Unit>, ? super q22<? super Unit>, ? extends Object> function2, AnchoredDraggableNode<T> anchoredDraggableNode, q22<? super AnchoredDraggableNode$drag$2> q22Var) {
        super(3, q22Var);
        this.$forEachDelta = function2;
        this.this$0 = anchoredDraggableNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(final AnchoredDraggableNode anchoredDraggableNode, final rg rgVar, l.b bVar) {
        float fB4 = anchoredDraggableNode.B4(anchoredDraggableNode.y4(bVar.getDelta()));
        if (anchoredDraggableNode.overscrollEffect == null) {
            rg.b(rgVar, anchoredDraggableNode.state.E(fB4), 0.0f, 2, null);
        } else {
            zv8 zv8Var = anchoredDraggableNode.overscrollEffect;
            Intrinsics.g(zv8Var);
            rn8.d(zv8Var.c(anchoredDraggableNode.C4(fB4), we8.INSTANCE.b(), new Function1() { // from class: androidx.compose.foundation.gestures.d
                public final Object invoke(Object obj) {
                    return AnchoredDraggableNode$drag$2.p(anchoredDraggableNode, rgVar, (rn8) obj);
                }
            }));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 p(AnchoredDraggableNode anchoredDraggableNode, rg rgVar, rn8 rn8Var) {
        float fE = anchoredDraggableNode.state.E(anchoredDraggableNode.B4(rn8Var.getPackedValue()));
        long jC4 = anchoredDraggableNode.C4(fE - anchoredDraggableNode.state.G());
        rg.b(rgVar, fE, 0.0f, 2, null);
        return rn8.d(jC4);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final rg rgVar = (rg) this.L$0;
            Function2<Function1<? super l.b, Unit>, q22<? super Unit>, Object> function2 = this.$forEachDelta;
            final AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.c
                public final Object invoke(Object obj2) {
                    return AnchoredDraggableNode$drag$2.o(anchoredDraggableNode, rgVar, (l.b) obj2);
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

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object invoke(rg rgVar, dg3<T> dg3Var, q22<? super Unit> q22Var) {
        AnchoredDraggableNode$drag$2 anchoredDraggableNode$drag$2 = new AnchoredDraggableNode$drag$2(this.$forEachDelta, this.this$0, q22Var);
        anchoredDraggableNode$drag$2.L$0 = rgVar;
        return anchoredDraggableNode$drag$2.invokeSuspend(Unit.a);
    }
}
