package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.ps4;
import com.google.inputmethod.pf3;
import com.google.inputmethod.tsb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements ps4<pf3, tsb, Function1<? super DrawScope, ? extends Unit>, Boolean> {
    AndroidComposeView$dragAndDropManager$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m((pf3) obj, ((tsb) obj2).getPackedValue(), (Function1) obj3);
    }

    public final Boolean m(pf3 pf3Var, long j, Function1<? super DrawScope, Unit> function1) {
        return Boolean.valueOf(((AndroidComposeView) ((CallableReference) this).receiver).t1(pf3Var, j, function1));
    }
}
