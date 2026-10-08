package com.google.inputmethod;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.e;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/google/android/cc0;", "Lcom/google/android/f43;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/input/pointer/e;", "f2", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lcom/google/android/q22;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "block", "m0", "(JLkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "r2", "Lcom/google/android/q16;", "a", "()J", "size", "Lcom/google/android/tsb;", "K1", "extendedTouchPadding", "a2", "()Landroidx/compose/ui/input/pointer/e;", "currentEvent", "Lcom/google/android/p7e;", "getViewConfiguration", "()Lcom/google/android/p7e;", "viewConfiguration", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface cc0 extends f43 {
    static /* synthetic */ Object E1(cc0 cc0Var, PointerEventPass pointerEventPass, q22 q22Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return cc0Var.f2(pointerEventPass, q22Var);
    }

    static /* synthetic */ <T> Object u0(cc0 cc0Var, long j, Function2<? super cc0, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return function2.invoke(cc0Var, q22Var);
    }

    static /* synthetic */ <T> Object w1(cc0 cc0Var, long j, Function2<? super cc0, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return function2.invoke(cc0Var, q22Var);
    }

    default long K1() {
        return tsb.INSTANCE.b();
    }

    long a();

    e a2();

    Object f2(PointerEventPass pointerEventPass, q22<? super e> q22Var);

    p7e getViewConfiguration();

    default <T> Object m0(long j, Function2<? super cc0, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return w1(this, j, function2, q22Var);
    }

    default <T> Object r2(long j, Function2<? super cc0, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return u0(this, j, function2, q22Var);
    }
}
