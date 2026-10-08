package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.b;
import com.google.inputmethod.lt6;
import com.google.inputmethod.tu6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/b;", "Lkotlin/Function0;", "Lcom/google/android/lt6;", "itemProviderLambda", "Lcom/google/android/tu6;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "userScrollEnabled", "reverseScrolling", "c", "(Landroidx/compose/ui/b;Lkotlin/jvm/functions/Function0;Lcom/google/android/tu6;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/d;I)Landroidx/compose/ui/b;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "b", "(II)F", "canScrollForward", "a", "(IIZ)F", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final float a(int i, int i2, boolean z) {
        return z ? b(i, i2) + 100 : b(i, i2);
    }

    public static final float b(int i, int i2) {
        return i2 + (i * 500);
    }

    public static final b c(b bVar, Function0<? extends lt6> function0, tu6 tu6Var, Orientation orientation, boolean z, boolean z2, d dVar, int i) {
        if (e.k()) {
            e.o(1070136913, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        b bVarThen = bVar.then(new g(function0, tu6Var, orientation, z, z2));
        if (e.k()) {
            e.n();
        }
        return bVarThen;
    }
}
