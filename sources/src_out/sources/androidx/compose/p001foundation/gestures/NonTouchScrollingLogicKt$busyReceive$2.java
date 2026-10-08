package androidx.compose.p001foundation.gestures;

import com.google.android.h81;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2", f = "NonTouchScrollingLogic.kt", l = {80}, m = "invokeSuspend", v = 1)
final class NonTouchScrollingLogicKt$busyReceive$2<T> extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
    final /* synthetic */ h81<T> $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonTouchScrollingLogicKt$busyReceive$2(h81<T> h81Var, q22<? super NonTouchScrollingLogicKt$busyReceive$2> q22Var) {
        super(2, q22Var);
        this.$this_busyReceive = h81Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        NonTouchScrollingLogicKt$busyReceive$2 nonTouchScrollingLogicKt$busyReceive$2 = new NonTouchScrollingLogicKt$busyReceive$2(this.$this_busyReceive, q22Var);
        nonTouchScrollingLogicKt$busyReceive$2.L$0 = obj;
        return nonTouchScrollingLogicKt$busyReceive$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.s] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        s sVar = this.label;
        try {
            if (sVar == 0) {
                f.b(obj);
                s sVarD = rw0.d((ta2) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new NonTouchScrollingLogicKt$busyReceive$2$job$1(null), 3, (Object) null);
                h81<T> h81Var = this.$this_busyReceive;
                this.L$0 = sVarD;
                this.label = 1;
                obj = h81Var.c(this);
                sVar = sVarD;
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (sVar != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s sVar2 = (s) this.L$0;
                f.b(obj);
                sVar = sVar2;
            }
            s.a.a((s) sVar, (CancellationException) null, 1, (Object) null);
            return obj;
        } catch (Throwable th) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
            throw th;
        }
    }
}
