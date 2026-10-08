package androidx.p008glance.p010session;

import android.content.Context;
import androidx.compose.p004runtime.Recomposer;
import com.google.android.lq2;
import com.google.android.p58;
import com.google.android.q22;
import com.google.android.r6c;
import com.google.android.ta2;
import com.google.inputmethod.jq3;
import com.google.inputmethod.l8d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.d;

/* JADX INFO: renamed from: androidx.glance.session.SessionWorkerKt$runSession$4, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.SessionWorkerKt$runSession$4", f = "SessionWorker.kt", l = {198}, m = "invokeSuspend")
final class C0234SessionWorkerKt$runSession$4 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ jq3 $root;
    final /* synthetic */ Session $session;
    final /* synthetic */ l8d $this_runSession;
    final /* synthetic */ TimeoutOptions $timeouts;
    final /* synthetic */ p58<Boolean> $uiReady;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorkerKt$runSession$4$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "state", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @lq2(c = "androidx.glance.session.SessionWorkerKt$runSession$4$1", f = "SessionWorker.kt", l = {210, 217}, m = "invokeSuspend")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Recomposer.State, q22<? super Unit>, Object> {
        final /* synthetic */ ta2 $$this$launch;
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref.LongRef $lastRecomposeCount;
        final /* synthetic */ Recomposer $recomposer;
        final /* synthetic */ jq3 $root;
        final /* synthetic */ Session $session;
        final /* synthetic */ l8d $this_runSession;
        final /* synthetic */ TimeoutOptions $timeouts;
        final /* synthetic */ p58<Boolean> $uiReady;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.glance.session.SessionWorkerKt$runSession$4$1$a */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Recomposer.State.values().length];
                try {
                    iArr[Recomposer.State.Idle.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Recomposer.State.ShutDown.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Session session, Recomposer recomposer, Ref.LongRef longRef, p58<Boolean> p58Var, Context context, jq3 jq3Var, l8d l8dVar, TimeoutOptions timeoutOptions, ta2 ta2Var, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$session = session;
            this.$recomposer = recomposer;
            this.$lastRecomposeCount = longRef;
            this.$uiReady = p58Var;
            this.$context = context;
            this.$root = jq3Var;
            this.$this_runSession = l8dVar;
            this.$timeouts = timeoutOptions;
            this.$$this$launch = ta2Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Recomposer.State state, q22<? super Unit> q22Var) {
            return create(state, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$session, this.$recomposer, this.$lastRecomposeCount, this.$uiReady, this.$context, this.$root, this.$this_runSession, this.$timeouts, this.$$this$launch, q22Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L27;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.f.b(r9)
                goto L96
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                kotlin.f.b(r9)
                goto L71
            L1f:
                kotlin.f.b(r9)
                java.lang.Object r9 = r8.L$0
                androidx.compose.runtime.Recomposer$State r9 = (androidx.compose.runtime.Recomposer.State) r9
                int[] r1 = androidx.p008glance.p010session.C0234SessionWorkerKt$runSession$4.AnonymousClass1.a.$EnumSwitchMapping$0
                int r9 = r9.ordinal()
                r9 = r1[r9]
                if (r9 == r3) goto L3b
                if (r9 == r2) goto L34
                goto Lab
            L34:
                com.google.android.ta2 r9 = r8.$$this$launch
                r0 = 0
                kotlinx.coroutines.j.f(r9, r0, r3, r0)
                goto Lab
            L3b:
                androidx.compose.runtime.Recomposer r9 = r8.$recomposer
                long r4 = r9.getChangeCount()
                kotlin.jvm.internal.Ref$LongRef r9 = r8.$lastRecomposeCount
                long r6 = r9.element
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 > 0) goto L57
                com.google.android.p58<java.lang.Boolean> r9 = r8.$uiReady
                java.lang.Object r9 = r9.getValue()
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto La1
            L57:
                androidx.glance.session.Session r9 = r8.$session
                android.content.Context r1 = r8.$context
                com.google.android.jq3 r4 = r8.$root
                com.google.android.rp3 r4 = r4.copy()
                java.lang.String r5 = "null cannot be cast to non-null type androidx.glance.EmittableWithChildren"
                kotlin.jvm.internal.Intrinsics.h(r4, r5)
                com.google.android.jq3 r4 = (com.google.inputmethod.jq3) r4
                r8.label = r3
                java.lang.Object r9 = r9.h(r1, r4, r8)
                if (r9 != r0) goto L71
                goto L95
            L71:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                com.google.android.p58<java.lang.Boolean> r1 = r8.$uiReady
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto La1
                if (r9 == 0) goto La1
                com.google.android.p58<java.lang.Boolean> r9 = r8.$uiReady
                java.lang.Boolean r1 = com.google.android.ut0.a(r3)
                r8.label = r2
                java.lang.Object r9 = r9.emit(r1, r8)
                if (r9 != r0) goto L96
            L95:
                return r0
            L96:
                com.google.android.l8d r9 = r8.$this_runSession
                androidx.glance.session.d r0 = r8.$timeouts
                long r0 = r0.getInitialTimeout()
                r9.G0(r0)
            La1:
                kotlin.jvm.internal.Ref$LongRef r9 = r8.$lastRecomposeCount
                androidx.compose.runtime.Recomposer r0 = r8.$recomposer
                long r0 = r0.getChangeCount()
                r9.element = r0
            Lab:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p010session.C0234SessionWorkerKt$runSession$4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0234SessionWorkerKt$runSession$4(Recomposer recomposer, Session session, p58<Boolean> p58Var, Context context, jq3 jq3Var, l8d l8dVar, TimeoutOptions timeoutOptions, q22<? super C0234SessionWorkerKt$runSession$4> q22Var) {
        super(2, q22Var);
        this.$recomposer = recomposer;
        this.$session = session;
        this.$uiReady = p58Var;
        this.$context = context;
        this.$root = jq3Var;
        this.$this_runSession = l8dVar;
        this.$timeouts = timeoutOptions;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        C0234SessionWorkerKt$runSession$4 c0234SessionWorkerKt$runSession$4 = new C0234SessionWorkerKt$runSession$4(this.$recomposer, this.$session, this.$uiReady, this.$context, this.$root, this.$this_runSession, this.$timeouts, q22Var);
        c0234SessionWorkerKt$runSession$4.L$0 = obj;
        return c0234SessionWorkerKt$runSession$4;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ta2 ta2Var = (ta2) this.L$0;
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = this.$recomposer.getChangeCount();
            r6c<Recomposer.State> r6cVarU0 = this.$recomposer.u0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$session, this.$recomposer, longRef, this.$uiReady, this.$context, this.$root, this.$this_runSession, this.$timeouts, ta2Var, null);
            this.label = 1;
            if (d.l(r6cVarU0, anonymousClass1, this) == objG) {
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
