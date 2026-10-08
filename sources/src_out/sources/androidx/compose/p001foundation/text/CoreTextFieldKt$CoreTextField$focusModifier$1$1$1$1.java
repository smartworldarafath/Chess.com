package androidx.compose.p001foundation.text;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.asc;
import com.google.inputmethod.cu0;
import com.google.inputmethod.k07;
import com.google.inputmethod.wxc;
import com.google.inputmethod.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {346}, m = "invokeSuspend", v = 1)
final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ cu0 $bringIntoViewRequester;
    final /* synthetic */ wxc $layoutResult;
    final /* synthetic */ zn8 $offsetMapping;
    final /* synthetic */ k07 $state;
    final /* synthetic */ TextFieldValue $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(cu0 cu0Var, TextFieldValue textFieldValue, k07 k07Var, wxc wxcVar, zn8 zn8Var, q22<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1> q22Var) {
        super(2, q22Var);
        this.$bringIntoViewRequester = cu0Var;
        this.$value = textFieldValue;
        this.$state = k07Var;
        this.$layoutResult = wxcVar;
        this.$offsetMapping = zn8Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            cu0 cu0Var = this.$bringIntoViewRequester;
            TextFieldValue textFieldValue = this.$value;
            asc textDelegate = this.$state.getTextDelegate();
            TextLayoutResult value = this.$layoutResult.getValue();
            zn8 zn8Var = this.$offsetMapping;
            this.label = 1;
            if (CoreTextFieldKt.b0(cu0Var, textFieldValue, textDelegate, value, zn8Var, this) == objG) {
                return objG;
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
