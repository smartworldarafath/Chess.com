package androidx.compose.p001foundation.text.input.internal;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.inputmethod.ac9;
import com.google.inputmethod.ey5;
import com.google.inputmethod.icc;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ac9;", "", "<anonymous>", "(Lcom/google/android/ac9;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend", v = 1)
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 extends SuspendLambda implements Function2<ac9, q22<?>, Object> {
    final /* synthetic */ Function1<c, Unit> $initializeRequest;
    final /* synthetic */ b.a $node;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<?>, Object> {
        final /* synthetic */ ac9 $$this$launchTextInputSession;
        final /* synthetic */ Function1<c, Unit> $initializeRequest;
        final /* synthetic */ b.a $node;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {140, 141}, m = "invokeSuspend", v = 1)
        static final class C00281 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
            final /* synthetic */ ey5 $inputMethodManager;
            int label;
            final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter this$0;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a<T> implements ui4 {
                final /* synthetic */ ey5 a;

                a(ey5 ey5Var) {
                    this.a = ey5Var;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, q22<? super Unit> q22Var) {
                    this.a.d();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00281(AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, ey5 ey5Var, q22<? super C00281> q22Var) {
                super(2, q22Var);
                this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
                this.$inputMethodManager = ey5Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(long j) {
                return Unit.a;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new C00281(this.this$0, this.$inputMethodManager, q22Var);
            }

            public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
            
                if (r5.collect(r1, r4) == r0) goto L17;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) throws kotlin.KotlinNothingValueException {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                    int r1 = r4.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 == r2) goto L16
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L16:
                    kotlin.f.b(r5)
                    goto L47
                L1a:
                    kotlin.f.b(r5)
                    goto L2f
                L1e:
                    kotlin.f.b(r5)
                    androidx.compose.foundation.text.input.internal.a r5 = new androidx.compose.foundation.text.input.internal.a
                    r5.<init>()
                    r4.label = r3
                    java.lang.Object r5 = androidx.compose.p004runtime.w.b(r5, r4)
                    if (r5 != r0) goto L2f
                    goto L46
                L2f:
                    androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter r5 = r4.this$0
                    com.google.android.l58 r5 = androidx.compose.p001foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter.n(r5)
                    if (r5 == 0) goto L4d
                    androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$a r1 = new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1$a
                    com.google.android.ey5 r3 = r4.$inputMethodManager
                    r1.<init>(r3)
                    r4.label = r2
                    java.lang.Object r5 = r5.collect(r1, r4)
                    if (r5 != r0) goto L47
                L46:
                    return r0
                L47:
                    kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
                    r5.<init>()
                    throw r5
                L4d:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00281.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ac9 ac9Var, Function1<? super c, Unit> function1, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, b.a aVar, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$$this$launchTextInputSession = ac9Var;
            this.$initializeRequest = function1;
            this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
            this.$node = aVar;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launchTextInputSession, this.$initializeRequest, this.this$0, this.$node, q22Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ta2 ta2Var, q22<?> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            try {
                if (i == 0) {
                    f.b(obj);
                    ta2 ta2Var = (ta2) this.L$0;
                    ey5 ey5Var = (ey5) LegacyPlatformTextInputServiceAdapter_androidKt.c().invoke(this.$$this$launchTextInputSession.getView());
                    c cVar = new c(this.$$this$launchTextInputSession.getView(), new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(this.$node), ey5Var);
                    if (icc.a()) {
                        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C00281(this.this$0, ey5Var, null), 3, (Object) null);
                    }
                    Function1<c, Unit> function1 = this.$initializeRequest;
                    if (function1 != null) {
                        function1.invoke(cVar);
                    }
                    this.this$0.currentRequest = cVar;
                    ac9 ac9Var = this.$$this$launchTextInputSession;
                    this.label = 1;
                    if (ac9Var.a(cVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.currentRequest = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(Function1<? super c, Unit> function1, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, b.a aVar, q22<? super AndroidLegacyPlatformTextInputServiceAdapter$startInput$2> q22Var) {
        super(2, q22Var);
        this.$initializeRequest = function1;
        this.this$0 = androidLegacyPlatformTextInputServiceAdapter;
        this.$node = aVar;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ac9 ac9Var, q22<?> q22Var) {
        return create(ac9Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(this.$initializeRequest, this.this$0, this.$node, q22Var);
        androidLegacyPlatformTextInputServiceAdapter$startInput$2.L$0 = obj;
        return androidLegacyPlatformTextInputServiceAdapter$startInput$2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((ac9) this.L$0, this.$initializeRequest, this.this$0, this.$node, null);
            this.label = 1;
            if (j.g(anonymousClass1, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
