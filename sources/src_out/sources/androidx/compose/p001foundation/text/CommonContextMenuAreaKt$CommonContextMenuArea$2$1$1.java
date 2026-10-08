package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.o58;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1", f = "CommonContextMenuArea.kt", l = {62}, m = "invokeSuspend", v = 1)
final class CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ o58<o> $menuItemsAvailability;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(o58<o> o58Var, TextFieldSelectionManager textFieldSelectionManager, q22<? super CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1> q22Var) {
        super(2, q22Var);
        this.$menuItemsAvailability = o58Var;
        this.$manager = textFieldSelectionManager;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(this.$menuItemsAvailability, this.$manager, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        o58 o58Var;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            o58<o> o58Var2 = this.$menuItemsAvailability;
            TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            this.L$0 = o58Var2;
            this.label = 1;
            Object objH = CommonContextMenuAreaKt.h(textFieldSelectionManager, this);
            if (objH == objG) {
                return objG;
            }
            o58Var = o58Var2;
            obj = objH;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o58Var = (o58) this.L$0;
            f.b(obj);
        }
        o58Var.setValue(obj);
        return Unit.a;
    }
}
