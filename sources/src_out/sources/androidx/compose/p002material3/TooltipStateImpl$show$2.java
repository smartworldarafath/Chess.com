package androidx.compose.p002material3;

import androidx.compose.p001foundation.MutatePriority;
import com.google.android.lq2;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1184, 1186}, m = "invokeSuspend")
final class TooltipStateImpl$show$2 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    final /* synthetic */ Function1<q22<? super Unit>, Object> $cancellableShow;
    final /* synthetic */ MutatePriority $mutatePriority;
    int label;
    final /* synthetic */ TooltipStateImpl this$0;

    /* JADX INFO: renamed from: androidx.compose.material3.TooltipStateImpl$show$2$1, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1186}, m = "invokeSuspend")
    static final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
        final /* synthetic */ Function1<q22<? super Unit>, Object> $cancellableShow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ta2(Function1<? super q22<? super Unit>, ? extends Object> function1, q22<? super ta2> q22Var) {
            super(2, q22Var);
            this.$cancellableShow = function1;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new ta2(this.$cancellableShow, q22Var);
        }

        public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Function1<q22<? super Unit>, Object> function1 = this.$cancellableShow;
                this.label = 1;
                if (function1.invoke(this) == objG) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TooltipStateImpl$show$2(TooltipStateImpl tooltipStateImpl, Function1<? super q22<? super Unit>, ? extends Object> function1, MutatePriority mutatePriority, q22<? super TooltipStateImpl$show$2> q22Var) {
        super(1, q22Var);
        this.this$0 = tooltipStateImpl;
        this.$cancellableShow = function1;
        this.$mutatePriority = mutatePriority;
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new TooltipStateImpl$show$2(this.this$0, this.$cancellableShow, this.$mutatePriority, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.c(1500, r5, r4) == r0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto Le
            if (r1 != r2) goto L14
        Le:
            kotlin.f.b(r5)     // Catch: java.lang.Throwable -> L12
            goto L45
        L12:
            r5 = move-exception
            goto L53
        L14:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1c:
            kotlin.f.b(r5)
            androidx.compose.material3.TooltipStateImpl r5 = r4.this$0     // Catch: java.lang.Throwable -> L12
            boolean r5 = r5.getIsPersistent()     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L32
            kotlin.jvm.functions.Function1<com.google.android.q22<? super kotlin.Unit>, java.lang.Object> r5 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L12
            r4.label = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r5 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L12
            if (r5 != r0) goto L45
            goto L44
        L32:
            androidx.compose.material3.TooltipStateImpl$show$2$1 r5 = new androidx.compose.material3.TooltipStateImpl$show$2$1     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.functions.Function1<com.google.android.q22<? super kotlin.Unit>, java.lang.Object> r1 = r4.$cancellableShow     // Catch: java.lang.Throwable -> L12
            r3 = 0
            r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L12
            r4.label = r2     // Catch: java.lang.Throwable -> L12
            r1 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r5 = kotlinx.coroutines.TimeoutKt.c(r1, r5, r4)     // Catch: java.lang.Throwable -> L12
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            androidx.compose.foundation.MutatePriority r5 = r4.$mutatePriority
            androidx.compose.foundation.MutatePriority r0 = androidx.compose.p001foundation.MutatePriority.PreventUserInput
            if (r5 == r0) goto L50
            androidx.compose.material3.TooltipStateImpl r5 = r4.this$0
            r5.dismiss()
        L50:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L53:
            androidx.compose.foundation.MutatePriority r0 = r4.$mutatePriority
            androidx.compose.foundation.MutatePriority r1 = androidx.compose.p001foundation.MutatePriority.PreventUserInput
            if (r0 == r1) goto L5e
            androidx.compose.material3.TooltipStateImpl r0 = r4.this$0
            r0.dismiss()
        L5e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002material3.TooltipStateImpl$show$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
