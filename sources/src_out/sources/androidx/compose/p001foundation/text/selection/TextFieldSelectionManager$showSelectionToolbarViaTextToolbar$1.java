package androidx.compose.p001foundation.text.selection;

import androidx.compose.p004runtime.snapshots.g;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.yzc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1", f = "TextFieldSelectionManager.kt", l = {1083}, m = "invokeSuspend", v = 1)
final class TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(TextFieldSelectionManager textFieldSelectionManager, q22<? super TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1> q22Var) {
        super(2, q22Var);
        this.this$0 = textFieldSelectionManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(TextFieldSelectionManager textFieldSelectionManager) {
        ta2 coroutineScope = textFieldSelectionManager.getCoroutineScope();
        if (coroutineScope != null) {
            rw0.d(coroutineScope, (CoroutineContext) null, CoroutineStart.d, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$paste$1$1(textFieldSelectionManager, null), 1, (Object) null);
        }
        textFieldSelectionManager.r0();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.y0();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.v();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(TextFieldSelectionManager textFieldSelectionManager) {
        ta2 coroutineScope = textFieldSelectionManager.getCoroutineScope();
        if (coroutineScope != null) {
            rw0.d(coroutineScope, (CoroutineContext) null, CoroutineStart.d, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$copy$1$1(textFieldSelectionManager, null), 1, (Object) null);
        }
        textFieldSelectionManager.r0();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(TextFieldSelectionManager textFieldSelectionManager) {
        ta2 coroutineScope = textFieldSelectionManager.getCoroutineScope();
        if (coroutineScope != null) {
            rw0.d(coroutineScope, (CoroutineContext) null, CoroutineStart.d, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1$1$cut$1$1(textFieldSelectionManager, null), 1, (Object) null);
        }
        textFieldSelectionManager.r0();
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            this.label = 1;
            if (textFieldSelectionManager.X0(this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        g.Companion companion = g.INSTANCE;
        final TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
        g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        g gVarE = companion.e(gVarD);
        try {
            Function0<Unit> function0 = textFieldSelectionManager2.x() ? new Function0() { // from class: androidx.compose.foundation.text.selection.p
                public final Object invoke() {
                    return TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.x(textFieldSelectionManager2);
                }
            } : null;
            Function0<Unit> function1 = textFieldSelectionManager2.y() ? new Function0() { // from class: androidx.compose.foundation.text.selection.q
                public final Object invoke() {
                    return TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.y(textFieldSelectionManager2);
                }
            } : null;
            Function0<Unit> function2 = textFieldSelectionManager2.z() ? new Function0() { // from class: androidx.compose.foundation.text.selection.r
                public final Object invoke() {
                    return TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.A(textFieldSelectionManager2);
                }
            } : null;
            Function0<Unit> function3 = textFieldSelectionManager2.A() ? new Function0() { // from class: androidx.compose.foundation.text.selection.s
                public final Object invoke() {
                    return TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.B(textFieldSelectionManager2);
                }
            } : null;
            Function0<Unit> function4 = textFieldSelectionManager2.w() ? new Function0() { // from class: androidx.compose.foundation.text.selection.t
                public final Object invoke() {
                    return TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1.C(textFieldSelectionManager2);
                }
            } : null;
            yzc textToolbar = textFieldSelectionManager2.getTextToolbar();
            if (textToolbar != null) {
                textToolbar.b(textFieldSelectionManager2.Q(), function0, function2, function1, function3, function4);
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }
}
