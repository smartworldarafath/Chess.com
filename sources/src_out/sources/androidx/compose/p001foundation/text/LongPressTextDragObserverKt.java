package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p001foundation.gestures.ForEachGestureKt;
import androidx.compose.p001foundation.text.LongPressTextDragObserverKt;
import androidx.compose.p001foundation.text.selection.f;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.q22;
import com.google.inputmethod.df9;
import com.google.inputmethod.gsc;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/google/android/df9;", "Lcom/google/android/gsc;", "observer", "", "g", "(Lcom/google/android/df9;Lcom/google/android/gsc;Lcom/google/android/q22;)Ljava/lang/Object;", "m", "h", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LongPressTextDragObserverKt {
    public static final Object g(df9 df9Var, gsc gscVar, q22<? super Unit> q22Var) {
        Object objG = j.g(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(df9Var, gscVar, null), q22Var);
        return objG == a.g() ? objG : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(df9 df9Var, final gsc gscVar, q22<? super Unit> q22Var) {
        Object objM = DragGestureDetectorKt.m(df9Var, new Function1() { // from class: com.google.android.z97
            public final Object invoke(Object obj) {
                return LongPressTextDragObserverKt.i(gscVar, (rn8) obj);
            }
        }, new Function0() { // from class: com.google.android.aa7
            public final Object invoke() {
                return LongPressTextDragObserverKt.j(gscVar);
            }
        }, new Function0() { // from class: com.google.android.ba7
            public final Object invoke() {
                return LongPressTextDragObserverKt.k(gscVar);
            }
        }, new Function2() { // from class: com.google.android.ca7
            public final Object invoke(Object obj, Object obj2) {
                return LongPressTextDragObserverKt.l(gscVar, (PointerInputChange) obj, (rn8) obj2);
            }
        }, q22Var);
        return objM == a.g() ? objM : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(gsc gscVar, rn8 rn8Var) {
        gscVar.c(rn8Var.getPackedValue(), f.INSTANCE.l());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(gsc gscVar) {
        gscVar.g();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(gsc gscVar) {
        gscVar.onCancel();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(gsc gscVar, PointerInputChange pointerInputChange, rn8 rn8Var) {
        gscVar.b(rn8Var.getPackedValue());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(df9 df9Var, gsc gscVar, q22<? super Unit> q22Var) {
        Object objD = ForEachGestureKt.d(df9Var, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(gscVar, null), q22Var);
        return objD == a.g() ? objD : Unit.a;
    }
}
