package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.dg3;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qg4;
import com.google.inputmethod.rg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/google/android/rg;", "Lcom/google/android/dg3;", "it", "", "<anonymous>", "(Lcom/google/android/rg;Lcom/google/android/dg3;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", l = {473}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableNode$fling$2<T> extends SuspendLambda implements ps4<rg, dg3<T>, q22<? super Unit>, Object> {
    final /* synthetic */ Ref.FloatRef $leftoverVelocity;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/AnchoredDraggableNode$fling$2$a", "Lcom/google/android/p9b;", "", "pixels", "e", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p9b {
        final /* synthetic */ AnchoredDraggableNode<T> a;
        final /* synthetic */ rg b;

        a(AnchoredDraggableNode<T> anchoredDraggableNode, rg rgVar) {
            this.a = anchoredDraggableNode;
            this.b = rgVar;
        }

        @Override // com.google.inputmethod.p9b
        public float e(float pixels) {
            float fE = ((AnchoredDraggableNode) this.a).state.E(pixels);
            float fW = fE - ((AnchoredDraggableNode) this.a).state.w();
            rg.b(this.b, fE, 0.0f, 2, null);
            return fW;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$fling$2(AnchoredDraggableNode<T> anchoredDraggableNode, Ref.FloatRef floatRef, float f, q22<? super AnchoredDraggableNode$fling$2> q22Var) {
        super(3, q22Var);
        this.this$0 = anchoredDraggableNode;
        this.$leftoverVelocity = floatRef;
        this.$velocity = f;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(rg rgVar, dg3<T> dg3Var, q22<? super Unit> q22Var) {
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.this$0, this.$leftoverVelocity, this.$velocity, q22Var);
        anchoredDraggableNode$fling$2.L$0 = rgVar;
        return anchoredDraggableNode$fling$2.invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ref.FloatRef floatRef;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            a aVar = new a(this.this$0, (rg) this.L$0);
            qg4 qg4VarV4 = this.this$0.v4();
            Ref.FloatRef floatRef2 = this.$leftoverVelocity;
            float f = this.$velocity;
            this.L$0 = floatRef2;
            this.label = 1;
            obj = qg4VarV4.a(aVar, f, this);
            if (obj == objG) {
                return objG;
            }
            floatRef = floatRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) this.L$0;
            f.b(obj);
        }
        floatRef.element = ((Number) obj).floatValue();
        return Unit.a;
    }
}
