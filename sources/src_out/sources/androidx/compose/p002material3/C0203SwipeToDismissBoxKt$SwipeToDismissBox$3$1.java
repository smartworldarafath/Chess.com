package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$3$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.SwipeToDismissBoxKt$SwipeToDismissBox$3$1", f = "SwipeToDismissBox.kt", l = {}, m = "invokeSuspend")
final class C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Function1<SwipeToDismissBoxValue, Unit> $onDismiss;
    final /* synthetic */ s1 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(s1 s1Var, Function1<? super SwipeToDismissBoxValue, Unit> function1, q22<? super C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1> q22Var) {
        super(2, q22Var);
        this.$state = s1Var;
        this.$onDismiss = function1;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0203SwipeToDismissBoxKt$SwipeToDismissBox$3$1(this.$state, this.$onDismiss, q22Var);
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
        if (this.$state.h() != SwipeToDismissBoxValue.Settled) {
            this.$onDismiss.invoke(this.$state.e());
        }
        return Unit.a;
    }
}
