package androidx.compose.p001foundation.gestures;

import com.google.android.q22;
import com.google.inputmethod.t3e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1 extends AdaptedFunctionReference implements Function2<t3e, q22<? super Unit>, Object> {
    ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1(Object obj) {
        super(2, obj, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
    }

    public final Object a(long j, q22<? super Unit> q22Var) {
        return ScrollableNode.u4((ScrollableNode) ((AdaptedFunctionReference) this).receiver, j, q22Var);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((t3e) obj).getPackedValue(), (q22) obj2);
    }
}
