package androidx.compose.p001foundation.text.selection;

import androidx.compose.ui.text.b;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ef1;
import com.google.inputmethod.jf1;
import com.google.inputmethod.mf1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {891}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$copy$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ boolean $cancelSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$copy$1(TextFieldSelectionManager textFieldSelectionManager, boolean z, q22<? super TextFieldSelectionManager$copy$1> q22Var) {
        super(2, q22Var);
        this.this$0 = textFieldSelectionManager;
        this.$cancelSelection = z;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TextFieldSelectionManager$copy$1(this.this$0, this.$cancelSelection, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            b bVarE = this.this$0.E(this.$cancelSelection);
            if (bVarE == null) {
                return Unit.a;
            }
            jf1 clipboard = this.this$0.getClipboard();
            if (clipboard != null) {
                ef1 ef1VarF = mf1.f(bVarE);
                this.label = 1;
                if (clipboard.a(ef1VarF, this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }
}
