package androidx.compose.p001foundation.text.selection;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1", f = "TextFieldSelectionManager.kt", l = {}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(TextFieldSelectionManager textFieldSelectionManager, q22<? super TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1> q22Var) {
        super(2, q22Var);
        this.this$0 = textFieldSelectionManager;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        TextFieldSelectionManager.D(this.this$0, false, 1, null);
        return Unit.a;
    }
}
