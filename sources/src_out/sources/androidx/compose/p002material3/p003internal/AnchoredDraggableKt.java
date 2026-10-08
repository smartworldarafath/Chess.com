package androidx.compose.p002material3.p003internal;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.b;
import com.google.android.q22;
import com.google.inputmethod.cg3;
import com.google.inputmethod.eg3;
import com.google.inputmethod.kx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001aH\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a[\u0010\"\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0001*\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u001d\u001a\u00020\u001c2*\u0010!\u001a&\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000 0\u0012H\u0000¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"", "T", "Lkotlin/Function1;", "Lcom/google/android/eg3;", "", "builder", "Lcom/google/android/cg3;", "a", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/cg3;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "targetValue", "", "velocity", "d", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;FLcom/google/android/q22;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lcom/google/android/q22;", "block", "g", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/material3/internal/i;", "f", "()Landroidx/compose/material3/internal/i;", "Landroidx/compose/ui/b;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lcom/google/android/q16;", "Lcom/google/android/kx1;", "Lkotlin/Pair;", "anchors", "e", "(Landroidx/compose/ui/b;Landroidx/compose/material3/internal/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/b;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AnchoredDraggableKt {
    public static final <T> cg3<T> a(Function1<? super eg3<T>, Unit> function1) {
        eg3 eg3Var = new eg3();
        function1.invoke(eg3Var);
        return new MapDraggableAnchors(eg3Var.b());
    }

    public static final <T> Object d(AnchoredDraggableState<T> anchoredDraggableState, T t, float f, q22<? super Unit> q22Var) {
        Object objK = AnchoredDraggableState.k(anchoredDraggableState, t, null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f, null), q22Var, 2, null);
        return objK == a.g() ? objK : Unit.a;
    }

    public static final <T> b e(b bVar, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, Function2<? super q16, ? super kx1, ? extends Pair<? extends cg3<T>, ? extends T>> function2) {
        return bVar.then(new e(anchoredDraggableState, function2, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> f() {
        return new MapDraggableAnchors<>(b0.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <I> Object g(Function0<? extends I> function0, Function2<? super I, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        if (q22Var instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) q22Var;
            int i = anchoredDraggableKt$restartable$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                anchoredDraggableKt$restartable$1.label = i - t04.INVALID_ID;
            } else {
                anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(q22Var);
            }
        } else {
            anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(q22Var);
        }
        Object obj = anchoredDraggableKt$restartable$1.result;
        Object objG = a.g();
        int i2 = anchoredDraggableKt$restartable$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(function0, function2, null);
                anchoredDraggableKt$restartable$1.label = 1;
                if (j.g(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == objG) {
                    return objG;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return Unit.a;
    }
}
