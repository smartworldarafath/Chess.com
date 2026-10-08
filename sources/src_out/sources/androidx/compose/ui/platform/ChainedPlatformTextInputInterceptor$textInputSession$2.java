package androidx.compose.ui.platform;

import androidx.compose.ui.SessionMutex;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.bc9;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/bc9;", "", "<anonymous>", "(Lcom/google/android/bc9;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend", v = 1)
final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends SuspendLambda implements Function2<bc9, q22<?>, Object> {
    final /* synthetic */ Function2<bc9, q22<?>, Object> $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChainedPlatformTextInputInterceptor$textInputSession$2(Function2<? super bc9, ? super q22<?>, ? extends Object> function2, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, q22<? super ChainedPlatformTextInputInterceptor$textInputSession$2> q22Var) {
        super(2, q22Var);
        this.$session = function2;
        this.this$0 = chainedPlatformTextInputInterceptor;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(bc9 bc9Var, q22<?> q22Var) {
        return create(bc9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(this.$session, this.this$0, q22Var);
        chainedPlatformTextInputInterceptor$textInputSession$2.L$0 = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((bc9) this.L$0, SessionMutex.a(), this.this$0);
            Function2<bc9, q22<?>, Object> function2 = this.$session;
            this.label = 1;
            if (function2.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
