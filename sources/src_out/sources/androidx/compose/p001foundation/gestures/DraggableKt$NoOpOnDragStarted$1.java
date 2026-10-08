package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/ta2;", "Lcom/google/android/rn8;", "it", "", "<anonymous>", "(Lcom/google/android/ta2;Lcom/google/android/rn8;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend", v = 1)
final class DraggableKt$NoOpOnDragStarted$1 extends SuspendLambda implements ps4<ta2, rn8, q22<? super Unit>, Object> {
    int label;

    DraggableKt$NoOpOnDragStarted$1(q22<? super DraggableKt$NoOpOnDragStarted$1> q22Var) {
        super(3, q22Var);
    }

    public final Object a(ta2 ta2Var, long j, q22<? super Unit> q22Var) {
        return new DraggableKt$NoOpOnDragStarted$1(q22Var).invokeSuspend(Unit.a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((ta2) obj, ((rn8) obj2).getPackedValue(), (q22) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return Unit.a;
    }
}
