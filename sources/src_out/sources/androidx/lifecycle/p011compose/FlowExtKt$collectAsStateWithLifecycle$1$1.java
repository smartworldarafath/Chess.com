package androidx.lifecycle.p011compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ui4;
import com.google.inputmethod.io9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/google/android/io9;", "", "<anonymous>", "(Lcom/google/android/io9;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend", v = 1)
final class FlowExtKt$collectAsStateWithLifecycle$1$1<T> extends SuspendLambda implements Function2<io9<T>, q22<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ ai4<T> $this_collectAsStateWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend", v = 1)
    static final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
        final /* synthetic */ io9<T> $$this$produceState;
        final /* synthetic */ CoroutineContext $context;
        final /* synthetic */ ai4<T> $this_collectAsStateWithLifecycle;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2, reason: from Kotlin metadata and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
        @lq2(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend", v = 1)
        static final class C00942 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
            final /* synthetic */ io9<T> $$this$produceState;
            final /* synthetic */ ai4<T> $this_collectAsStateWithLifecycle;
            int label;

            /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class a<T> implements ui4 {
                final /* synthetic */ io9<T> a;

                a(io9<T> io9Var) {
                    this.a = io9Var;
                }

                public final Object emit(T t, q22<? super Unit> q22Var) {
                    this.a.setValue(t);
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00942(ai4<? extends T> ai4Var, io9<T> io9Var, q22<? super C00942> q22Var) {
                super(2, q22Var);
                this.$this_collectAsStateWithLifecycle = ai4Var;
                this.$$this$produceState = io9Var;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new C00942(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, q22Var);
            }

            public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object objG = kotlin.coroutines.intrinsics.a.g();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    ai4<T> ai4Var = this.$this_collectAsStateWithLifecycle;
                    a aVar = new a(this.$$this$produceState);
                    this.label = 1;
                    if (ai4Var.collect(aVar, this) == objG) {
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

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements ui4 {
            final /* synthetic */ io9<T> a;

            a(io9<T> io9Var) {
                this.a = io9Var;
            }

            public final Object emit(T t, q22<? super Unit> q22Var) {
                this.a.setValue(t);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        ta2(CoroutineContext coroutineContext, ai4<? extends T> ai4Var, io9<T> io9Var, q22<? super ta2> q22Var) {
            super(2, q22Var);
            this.$context = coroutineContext;
            this.$this_collectAsStateWithLifecycle = ai4Var;
            this.$$this$produceState = io9Var;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new ta2(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, q22Var);
        }

        public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
        
            if (r7.collect(r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (com.google.android.rw0.g(r7, r1, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.f.b(r7)
                goto L4f
            L1b:
                kotlin.f.b(r7)
                kotlin.coroutines.CoroutineContext r7 = r6.$context
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.a
                boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r1)
                if (r7 == 0) goto L3a
                com.google.android.ai4<T> r7 = r6.$this_collectAsStateWithLifecycle
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$a r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$a
                com.google.android.io9<T> r2 = r6.$$this$produceState
                r1.<init>(r2)
                r6.label = r3
                java.lang.Object r7 = r7.collect(r1, r6)
                if (r7 != r0) goto L4f
                goto L4e
            L3a:
                kotlin.coroutines.CoroutineContext r7 = r6.$context
                androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2
                com.google.android.ai4<T> r3 = r6.$this_collectAsStateWithLifecycle
                com.google.android.io9<T> r4 = r6.$$this$produceState
                r5 = 0
                r1.<init>(r3, r4, r5)
                r6.label = r2
                java.lang.Object r7 = com.google.android.rw0.g(r7, r1, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.p011compose.FlowExtKt$collectAsStateWithLifecycle$1$1.ta2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$collectAsStateWithLifecycle$1$1(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, ai4<? extends T> ai4Var, q22<? super FlowExtKt$collectAsStateWithLifecycle$1$1> q22Var) {
        super(2, q22Var);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$context = coroutineContext;
        this.$this_collectAsStateWithLifecycle = ai4Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, q22Var);
        flowExtKt$collectAsStateWithLifecycle$1$1.L$0 = obj;
        return flowExtKt$collectAsStateWithLifecycle$1$1;
    }

    public final Object invoke(io9<T> io9Var, q22<? super Unit> q22Var) {
        return create(io9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            io9 io9Var = (io9) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            ta2 ta2Var = new ta2(this.$context, this.$this_collectAsStateWithLifecycle, io9Var, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.a(lifecycle, state, ta2Var, this) == objG) {
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
