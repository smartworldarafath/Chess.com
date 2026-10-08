package androidx.compose.ui.adaptive;

import android.content.Context;
import com.google.android.ai4;
import com.google.android.kke;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.uhe;
import com.google.inputmethod.gsd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1", f = "MediaQuery.android.kt", l = {132}, m = "invokeSuspend", v = 1)
final class MediaQuery_androidKt$obtainUiMediaScope$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ gsd $scope;
    int label;

    /* JADX INFO: renamed from: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/kke;", "layout", "", "<anonymous>", "(Lcom/google/android/kke;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1", f = "MediaQuery.android.kt", l = {}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<kke, q22<? super Unit>, Object> {
        final /* synthetic */ gsd $scope;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(gsd gsdVar, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$scope = gsdVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kke kkeVar, q22<? super Unit> q22Var) {
            return create(kkeVar, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, q22Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.$scope.f(MediaQuery_androidKt.m((kke) this.L$0));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaQuery_androidKt$obtainUiMediaScope$1$1(Context context, gsd gsdVar, q22<? super MediaQuery_androidKt$obtainUiMediaScope$1$1> q22Var) {
        super(2, q22Var);
        this.$context = context;
        this.$scope = gsdVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new MediaQuery_androidKt$obtainUiMediaScope$1$1(this.$context, this.$scope, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ai4 ai4VarB = uhe.a.d(this.$context).b(this.$context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, null);
            this.label = 1;
            if (d.l(ai4VarB, anonymousClass1, this) == objG) {
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
