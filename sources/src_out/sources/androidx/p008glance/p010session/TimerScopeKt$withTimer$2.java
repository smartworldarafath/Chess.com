package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.l8d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.TimerScopeKt$withTimer$2", f = "TimerScope.kt", l = {86}, m = "invokeSuspend")
final class TimerScopeKt$withTimer$2<T> extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
    final /* synthetic */ Function2<l8d, q22<? super T>, Object> $block;
    final /* synthetic */ c $timeSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.glance.session.TimerScopeKt$withTimer$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @lq2(c = "androidx.glance.session.TimerScopeKt$withTimer$2$1", f = "TimerScope.kt", l = {127}, m = "invokeSuspend")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
        final /* synthetic */ Function2<l8d, q22<? super T>, Object> $block;
        final /* synthetic */ c $timeSource;
        final /* synthetic */ AtomicReference<s> $timerJob;
        final /* synthetic */ ta2 $timerScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super l8d, ? super q22<? super T>, ? extends Object> function2, c cVar, ta2 ta2Var, AtomicReference<s> atomicReference, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$block = function2;
            this.$timeSource = cVar;
            this.$timerScope = ta2Var;
            this.$timerJob = atomicReference;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$timeSource, this.$timerScope, this.$timerJob, q22Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return obj;
            }
            f.b(obj);
            TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = new TimerScopeKt$withTimer$2$1$blockScope$1((ta2) this.L$0, this.$timeSource, this.$timerScope, this.$block, this.$timerJob);
            Function2<l8d, q22<? super T>, Object> function2 = this.$block;
            this.label = 1;
            Object objInvoke = function2.invoke(timerScopeKt$withTimer$2$1$blockScope$1, this);
            return objInvoke == objG ? objG : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimerScopeKt$withTimer$2(Function2<? super l8d, ? super q22<? super T>, ? extends Object> function2, c cVar, q22<? super TimerScopeKt$withTimer$2> q22Var) {
        super(2, q22Var);
        this.$block = function2;
        this.$timeSource = cVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        TimerScopeKt$withTimer$2 timerScopeKt$withTimer$2 = new TimerScopeKt$withTimer$2(this.$block, this.$timeSource, q22Var);
        timerScopeKt$withTimer$2.L$0 = obj;
        return timerScopeKt$withTimer$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ta2 ta2Var = (ta2) this.L$0;
            AtomicReference atomicReference2 = new AtomicReference(null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$timeSource, ta2Var, atomicReference2, null);
            this.L$0 = atomicReference2;
            this.label = 1;
            obj = j.g(anonymousClass1, this);
            if (obj == objG) {
                return objG;
            }
            atomicReference = atomicReference2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atomicReference = (AtomicReference) this.L$0;
            f.b(obj);
        }
        s sVar = (s) atomicReference.get();
        if (sVar != null) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        return obj;
    }
}
