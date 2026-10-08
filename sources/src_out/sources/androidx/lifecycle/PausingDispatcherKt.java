package androidx.lifecycle;

import com.google.android.fc3;
import com.google.android.q22;
import com.google.android.r43;
import com.google.android.rw0;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\t\u0010\b\u001aF\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0087@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Landroidx/lifecycle/Lifecycle;", "Lkotlin/Function2;", "Lcom/google/android/ta2;", "Lcom/google/android/q22;", "", "block", "b", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Landroidx/lifecycle/Lifecycle$State;", "minState", "c", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "lifecycle-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PausingDispatcherKt {
    @r43
    public static final <T> Object a(Lifecycle lifecycle, Function2<? super ta2, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return c(lifecycle, Lifecycle.State.RESUMED, function2, q22Var);
    }

    @r43
    public static final <T> Object b(Lifecycle lifecycle, Function2<? super ta2, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return c(lifecycle, Lifecycle.State.STARTED, function2, q22Var);
    }

    @r43
    public static final <T> Object c(Lifecycle lifecycle, Lifecycle.State state, Function2<? super ta2, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return rw0.g(fc3.c().t0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, function2, null), q22Var);
    }
}
