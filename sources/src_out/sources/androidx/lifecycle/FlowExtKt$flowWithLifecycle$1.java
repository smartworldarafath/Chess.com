package androidx.lifecycle;

import com.google.android.ai4;
import com.google.android.jo9;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ui4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/google/android/jo9;", "", "<anonymous>", "(Lcom/google/android/jo9;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend", v = 1)
final class FlowExtKt$flowWithLifecycle$1<T> extends SuspendLambda implements Function2<jo9<? super T>, q22<? super Unit>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ ai4<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ jo9<T> $$this$callbackFlow;
        final /* synthetic */ ai4<T> $this_flowWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements ui4 {
            final /* synthetic */ jo9<T> a;

            /* JADX WARN: Multi-variable type inference failed */
            a(jo9<? super T> jo9Var) {
                this.a = jo9Var;
            }

            public final Object emit(T t, q22<? super Unit> q22Var) {
                Object objX = this.a.x(t, q22Var);
                return objX == kotlin.coroutines.intrinsics.a.g() ? objX : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ai4<? extends T> ai4Var, jo9<? super T> jo9Var, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$this_flowWithLifecycle = ai4Var;
            this.$$this$callbackFlow = jo9Var;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                ai4<T> ai4Var = this.$this_flowWithLifecycle;
                a aVar = new a(this.$$this$callbackFlow);
                this.label = 1;
                if (ai4Var.collect(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, ai4<? extends T> ai4Var, q22<? super FlowExtKt$flowWithLifecycle$1> q22Var) {
        super(2, q22Var);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = ai4Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, q22Var);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object invoke(jo9<? super T> jo9Var, q22<? super Unit> q22Var) {
        return create(jo9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        jo9 jo9Var;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            jo9 jo9Var2 = (jo9) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, jo9Var2, null);
            this.L$0 = jo9Var2;
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, anonymousClass1, this) == objG) {
                return objG;
            }
            jo9Var = jo9Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jo9Var = (jo9) this.L$0;
            kotlin.f.b(obj);
        }
        kotlinx.coroutines.channels.h.a.a(jo9Var, (Throwable) null, 1, (Object) null);
        return Unit.a;
    }
}
