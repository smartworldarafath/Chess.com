package androidx.compose.p001foundation.text.selection;

import androidx.compose.ui.text.x;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.qb9;
import com.google.inputmethod.zn8;
import com.google.inputmethod.zyc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {571}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ zn8 $offsetMapping;
    final /* synthetic */ qb9 $platformSelectionBehaviors;
    final /* synthetic */ x $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$maybeSuggestSelection$1(qb9 qb9Var, String str, long j, x xVar, TextFieldSelectionManager textFieldSelectionManager, zn8 zn8Var, q22<? super TextFieldSelectionManager$maybeSuggestSelection$1> q22Var) {
        super(2, q22Var);
        this.$platformSelectionBehaviors = qb9Var;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = xVar;
        this.this$0 = textFieldSelectionManager;
        this.$offsetMapping = zn8Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            qb9 qb9Var = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            obj = qb9Var.b(str, j, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        x xVar = (x) obj;
        if (xVar == null) {
            return Unit.a;
        }
        zn8 zn8Var = this.$offsetMapping;
        long packedValue = xVar.getPackedValue();
        long jB = zyc.b(zn8Var.a(x.n(packedValue)), zn8Var.a(x.i(packedValue)));
        if (!x.f(jB, this.$selection) && Intrinsics.e(this.this$0.p0().m(), this.$text) && this.$offsetMapping == this.this$0.getOffsetMapping()) {
            Function1<TextFieldValue, Unit> function1I0 = this.this$0.i0();
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            function1I0.invoke(textFieldSelectionManager.G(textFieldSelectionManager.p0().getText(), jB));
            this.this$0.K0(x.b(jB));
        }
        return Unit.a;
    }
}
