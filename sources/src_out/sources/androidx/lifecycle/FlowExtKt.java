package androidx.lifecycle;

import com.google.android.ai4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lcom/google/android/ai4;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minActiveState", "a", "(Lcom/google/android/ai4;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;)Lcom/google/android/ai4;", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FlowExtKt {
    public static final <T> ai4<T> a(ai4<? extends T> ai4Var, Lifecycle lifecycle, Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(ai4Var, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(state, "minActiveState");
        return kotlinx.coroutines.flow.d.g(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, ai4Var, null));
    }

    public static /* synthetic */ ai4 b(ai4 ai4Var, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return a(ai4Var, lifecycle, state);
    }
}
