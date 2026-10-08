package androidx.compose.ui.viewinterop;

import com.google.inputmethod.dl4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends FunctionReferenceImpl implements Function2<dl4, dl4, Unit> {
    FocusTargetInteropNode$focusTargetNode$1(Object obj) {
        super(2, obj, FocusTargetInteropNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        m((dl4) obj, (dl4) obj2);
        return Unit.a;
    }

    public final void m(dl4 dl4Var, dl4 dl4Var2) {
        ((FocusTargetInteropNode) ((CallableReference) this).receiver).t3(dl4Var, dl4Var2);
    }
}
