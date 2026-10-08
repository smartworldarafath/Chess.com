package androidx.activity.android;

import com.google.android.ai4;
import com.google.android.h81;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.BackEventCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.d;

/* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1", f = "PredictiveBackHandler.kt", l = {231}, m = "invokeSuspend", v = 1)
final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ComposePredictiveBackHandler this$0;

    /* JADX INFO: renamed from: androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/android/ui4;", "Lcom/google/android/tc0;", "", "it", "", "<anonymous>", "(Lcom/google/android/ui4;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    static final class ui4 extends SuspendLambda implements ps4<com.google.android.ui4<? super BackEventCompat>, Throwable, q22<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ui4(Ref.BooleanRef booleanRef, q22<? super ui4> q22Var) {
            super(3, q22Var);
            this.$completed = booleanRef;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.google.android.ui4<? super BackEventCompat> ui4Var, Throwable th, q22<? super Unit> q22Var) {
            return new ui4(this.$completed, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.$completed.element = true;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta2(ComposePredictiveBackHandler composePredictiveBackHandler, q22<? super ta2> q22Var) {
        super(2, q22Var);
        this.this$0 = composePredictiveBackHandler;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ta2(this.this$0, q22Var);
    }

    public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (this.this$0.c()) {
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Function2<ai4<BackEventCompat>, q22<? super Unit>, Object> function2J = this.this$0.j();
                h81 h81Var = this.this$0.activeChannel;
                Intrinsics.g(h81Var);
                ai4 ai4VarX = d.X(d.r(h81Var), new ui4(booleanRef2, null));
                this.L$0 = booleanRef2;
                this.label = 1;
                if (function2J.invoke(ai4VarX, this) == objG) {
                    return objG;
                }
                booleanRef = booleanRef2;
            }
            return Unit.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        booleanRef = (Ref.BooleanRef) this.L$0;
        f.b(obj);
        if (!booleanRef.element) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return Unit.a;
    }
}
