package androidx.compose.ui.platform;

import androidx.compose.p004runtime.p0;
import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.bc9;
import com.google.inputmethod.wb9;
import com.google.inputmethod.xb9;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend", v = 1)
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends SuspendLambda implements Function2<Unit, q22<?>, Object> {
    final /* synthetic */ bc9 $parentSession;
    final /* synthetic */ xb9 $request;
    int label;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/wb9;", "interceptor", "", "<anonymous>", "(Lcom/google/android/wb9;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<wb9, q22<? super Unit>, Object> {
        final /* synthetic */ bc9 $parentSession;
        final /* synthetic */ xb9 $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(xb9 xb9Var, bc9 bc9Var, q22<? super AnonymousClass2> q22Var) {
            super(2, q22Var);
            this.$request = xb9Var;
            this.$parentSession = bc9Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(wb9 wb9Var, q22<? super Unit> q22Var) {
            return create(wb9Var, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, q22Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                wb9 wb9Var = (wb9) this.L$0;
                xb9 xb9Var = this.$request;
                bc9 bc9Var = this.$parentSession;
                this.label = 1;
                if (wb9Var.a(xb9Var, bc9Var, this) == objG) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, xb9 xb9Var, bc9 bc9Var, q22<? super ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3> q22Var) {
        super(2, q22Var);
        this.this$0 = chainedPlatformTextInputInterceptor;
        this.$request = xb9Var;
        this.$parentSession = bc9Var;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Unit unit, q22<?> q22Var) {
        return create(unit, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.this$0, this.$request, this.$parentSession, q22Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            final ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.this$0;
            ai4 ai4VarS = p0.s(new Function0<wb9>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final wb9 invoke() {
                    return chainedPlatformTextInputInterceptor.b();
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.d.l(ai4VarS, anonymousClass2, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}
