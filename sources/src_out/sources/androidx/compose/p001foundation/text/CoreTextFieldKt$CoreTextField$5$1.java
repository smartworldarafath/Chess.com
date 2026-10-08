package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.text.input.ImeOptions;
import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.inputmethod.dxc;
import com.google.inputmethod.k07;
import com.google.inputmethod.q6c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {363}, m = "invokeSuspend", v = 1)
final class CoreTextFieldKt$CoreTextField$5$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ k07 $state;
    final /* synthetic */ dxc $textInputService;
    final /* synthetic */ q6c<Boolean> $writeable$delegate;
    int label;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> implements ui4 {
        final /* synthetic */ k07 a;
        final /* synthetic */ dxc b;
        final /* synthetic */ TextFieldSelectionManager c;
        final /* synthetic */ ImeOptions d;

        a(k07 k07Var, dxc dxcVar, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions) {
            this.a = k07Var;
            this.b = dxcVar;
            this.c = textFieldSelectionManager;
            this.d = imeOptions;
        }

        public final Object a(boolean z, q22<? super Unit> q22Var) {
            if (z && this.a.h()) {
                CoreTextFieldKt.i0(this.b, this.a, this.c.p0(), this.d, this.c.getOffsetMapping());
            } else {
                CoreTextFieldKt.e0(this.a);
            }
            return Unit.a;
        }

        public /* bridge */ /* synthetic */ Object emit(Object obj, q22 q22Var) {
            return a(((Boolean) obj).booleanValue(), q22Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$5$1(k07 k07Var, q6c<Boolean> q6cVar, dxc dxcVar, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, q22<? super CoreTextFieldKt$CoreTextField$5$1> q22Var) {
        super(2, q22Var);
        this.$state = k07Var;
        this.$writeable$delegate = q6cVar;
        this.$textInputService = dxcVar;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = imeOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(q6c q6cVar) {
        return CoreTextFieldKt.C(q6cVar);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new CoreTextFieldKt$CoreTextField$5$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                final q6c<Boolean> q6cVar = this.$writeable$delegate;
                ai4 ai4VarS = p0.s(new Function0() { // from class: androidx.compose.foundation.text.d
                    public final Object invoke() {
                        return Boolean.valueOf(CoreTextFieldKt$CoreTextField$5$1.l(q6cVar));
                    }
                });
                a aVar = new a(this.$state, this.$textInputService, this.$manager, this.$imeOptions);
                this.label = 1;
                if (ai4VarS.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            CoreTextFieldKt.e0(this.$state);
            return Unit.a;
        } catch (Throwable th) {
            CoreTextFieldKt.e0(this.$state);
            throw th;
        }
    }
}
