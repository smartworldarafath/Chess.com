package androidx.p008glance.p009appwidget;

import android.content.BroadcastReceiver;
import com.google.android.lq2;
import com.google.android.q22;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;

/* JADX INFO: renamed from: androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$1, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.appwidget.CoroutineBroadcastReceiverKt$goAsync$1", f = "CoroutineBroadcastReceiver.kt", l = {45}, m = "invokeSuspend")
final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<com.google.android.ta2, q22<? super Unit>, Object> $block;
    final /* synthetic */ com.google.android.ta2 $coroutineScope;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ta2(Function2<? super com.google.android.ta2, ? super q22<? super Unit>, ? extends Object> function2, com.google.android.ta2 ta2Var, BroadcastReceiver.PendingResult pendingResult, q22<? super ta2> q22Var) {
        super(2, q22Var);
        this.$block = function2;
        this.$coroutineScope = ta2Var;
        this.$pendingResult = pendingResult;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ta2 ta2Var = new ta2(this.$block, this.$coroutineScope, this.$pendingResult, q22Var);
        ta2Var.L$0 = obj;
        return ta2Var;
    }

    public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    f.b(obj);
                    com.google.android.ta2 ta2Var = (com.google.android.ta2) this.L$0;
                    Function2<com.google.android.ta2, q22<? super Unit>, Object> function2 = this.$block;
                    this.label = 1;
                    if (function2.invoke(ta2Var, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
            } catch (Throwable th) {
                try {
                    this.$pendingResult.finish();
                } catch (IllegalStateException unused) {
                }
                throw th;
            }
        } catch (CancellationException e) {
            try {
                throw e;
            } catch (Throwable th2) {
                j.f(this.$coroutineScope, (CancellationException) null, 1, (Object) null);
                throw th2;
            }
        } catch (Throwable unused2) {
        }
        j.f(this.$coroutineScope, (CancellationException) null, 1, (Object) null);
        try {
            this.$pendingResult.finish();
        } catch (IllegalStateException unused3) {
        }
        return Unit.a;
    }
}
