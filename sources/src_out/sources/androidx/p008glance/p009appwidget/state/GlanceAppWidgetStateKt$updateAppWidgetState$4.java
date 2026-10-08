package androidx.p008glance.p009appwidget.state;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.h58;
import com.google.inputmethod.uk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/uk9;", "it", "<anonymous>", "(Lcom/google/android/uk9;)Lcom/google/android/uk9;"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.state.GlanceAppWidgetStateKt$updateAppWidgetState$4", f = "GlanceAppWidgetState.kt", l = {75}, m = "invokeSuspend")
final class GlanceAppWidgetStateKt$updateAppWidgetState$4 extends SuspendLambda implements Function2<uk9, q22<? super uk9>, Object> {
    final /* synthetic */ Function2<h58, q22<? super Unit>, Object> $updateState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GlanceAppWidgetStateKt$updateAppWidgetState$4(Function2<? super h58, ? super q22<? super Unit>, ? extends Object> function2, q22<? super GlanceAppWidgetStateKt$updateAppWidgetState$4> q22Var) {
        super(2, q22Var);
        this.$updateState = function2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(uk9 uk9Var, q22<? super uk9> q22Var) {
        return create(uk9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        GlanceAppWidgetStateKt$updateAppWidgetState$4 glanceAppWidgetStateKt$updateAppWidgetState$4 = new GlanceAppWidgetStateKt$updateAppWidgetState$4(this.$updateState, q22Var);
        glanceAppWidgetStateKt$updateAppWidgetState$4.L$0 = obj;
        return glanceAppWidgetStateKt$updateAppWidgetState$4;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h58 h58Var = (h58) this.L$0;
            f.b(obj);
            return h58Var;
        }
        f.b(obj);
        h58 h58VarD = ((uk9) this.L$0).d();
        Function2<h58, q22<? super Unit>, Object> function2 = this.$updateState;
        this.L$0 = h58VarD;
        this.label = 1;
        return function2.invoke(h58VarD, this) == objG ? objG : h58VarD;
    }
}
