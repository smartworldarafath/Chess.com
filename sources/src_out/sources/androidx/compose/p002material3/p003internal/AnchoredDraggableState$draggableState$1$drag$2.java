package androidx.compose.p002material3.p003internal;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.bg3;
import com.google.inputmethod.cg3;
import com.google.inputmethod.qg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/google/android/qg;", "Lcom/google/android/cg3;", "it", "", "<anonymous>", "(Lcom/google/android/qg;Lcom/google/android/cg3;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend")
final class AnchoredDraggableState$draggableState$1$drag$2<T> extends SuspendLambda implements ps4<qg, cg3<T>, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<bg3, q22<? super Unit>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState$draggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableState$draggableState$1$drag$2(AnchoredDraggableState$draggableState$1 anchoredDraggableState$draggableState$1, Function2<? super bg3, ? super q22<? super Unit>, ? extends Object> function2, q22<? super AnchoredDraggableState$draggableState$1$drag$2> q22Var) {
        super(3, q22Var);
        this.this$0 = anchoredDraggableState$draggableState$1;
        this.$block = function2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qg qgVar, cg3<T> cg3Var, q22<? super Unit> q22Var) {
        return new AnchoredDraggableState$draggableState$1$drag$2(this.this$0, this.$block, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AnchoredDraggableState$draggableState$1.a aVar = this.this$0.dragScope;
            Function2<bg3, q22<? super Unit>, Object> function2 = this.$block;
            this.label = 1;
            if (function2.invoke(aVar, this) == objG) {
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
