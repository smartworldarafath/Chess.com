package androidx.lifecycle;

import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.n17;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\f\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "state", "Lkotlin/Function2;", "Lcom/google/android/ta2;", "Lcom/google/android/q22;", "", "", "block", "a", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/n17;", "b", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RepeatOnLifecycleKt {
    public static final Object a(Lifecycle lifecycle, Lifecycle.State state, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objG;
        if (state != Lifecycle.State.INITIALIZED) {
            return (lifecycle.getState() != Lifecycle.State.DESTROYED && (objG = kotlinx.coroutines.j.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, null), q22Var)) == kotlin.coroutines.intrinsics.a.g()) ? objG : Unit.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object b(n17 n17Var, Lifecycle.State state, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objA = a(n17Var.getLifecycleRegistry(), state, function2, q22Var);
        return objA == kotlin.coroutines.intrinsics.a.g() ? objA : Unit.a;
    }
}
