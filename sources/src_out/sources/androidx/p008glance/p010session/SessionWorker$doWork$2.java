package androidx.p008glance.p010session;

import android.content.Context;
import androidx.work.c;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.ejb;
import com.google.inputmethod.gjb;
import com.google.inputmethod.l8d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/l8d;", "Landroidx/work/c$a;", "<anonymous>", "(Lcom/google/android/l8d;)Landroidx/work/c$a;"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.SessionWorker$doWork$2", f = "SessionWorker.kt", l = {99}, m = "invokeSuspend")
final class SessionWorker$doWork$2 extends SuspendLambda implements Function2<l8d, q22<? super c.a>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SessionWorker this$0;

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @lq2(c = "androidx.glance.session.SessionWorker$doWork$2$1", f = "SessionWorker.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
        final /* synthetic */ l8d $$this$withTimerOrNull;
        int label;
        final /* synthetic */ SessionWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(l8d l8dVar, SessionWorker sessionWorker, q22<? super AnonymousClass1> q22Var) {
            super(1, q22Var);
            this.$$this$withTimerOrNull = l8dVar;
            this.this$0 = sessionWorker;
        }

        public final q22<Unit> create(q22<?> q22Var) {
            return new AnonymousClass1(this.$$this$withTimerOrNull, this.this$0, q22Var);
        }

        public final Object invoke(q22<? super Unit> q22Var) {
            return create(q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.$$this$withTimerOrNull.G0(this.this$0.timeouts.getIdleTimeout());
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/work/c$a;", "<anonymous>", "()Landroidx/work/c$a;"}, k = 3, mv = {1, 8, 0})
    @lq2(c = "androidx.glance.session.SessionWorker$doWork$2$2", f = "SessionWorker.kt", l = {106, 122, 143, 143}, m = "invokeSuspend")
    static final class AnonymousClass2 extends SuspendLambda implements Function1<q22<? super c.a>, Object> {
        final /* synthetic */ l8d $$this$withTimerOrNull;
        Object L$0;
        int label;
        final /* synthetic */ SessionWorker this$0;

        /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$2$2$2, reason: from Kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
        @lq2(c = "androidx.glance.session.SessionWorker$doWork$2$2$2", f = "SessionWorker.kt", l = {144}, m = "invokeSuspend")
        static final class ta2 extends SuspendLambda implements Function2<com.google.android.ta2, q22<? super Unit>, Object> {
            final /* synthetic */ Session $session;
            int label;
            final /* synthetic */ SessionWorker this$0;

            /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$2$2$2$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gjb;", "", "<anonymous>", "(Lcom/google/android/gjb;)V"}, k = 3, mv = {1, 8, 0})
            @lq2(c = "androidx.glance.session.SessionWorker$doWork$2$2$2$1", f = "SessionWorker.kt", l = {145}, m = "invokeSuspend")
            static final class AnonymousClass1 extends SuspendLambda implements Function2<gjb, q22<? super Unit>, Object> {
                final /* synthetic */ Session $session;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Session session, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.$session = session;
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(gjb gjbVar, q22<? super Unit> q22Var) {
                    return create(gjbVar, q22Var).invokeSuspend(Unit.a);
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$session, q22Var);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invokeSuspend(Object obj) {
                    Object objG = a.g();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        gjb gjbVar = (gjb) this.L$0;
                        String key = this.$session.getKey();
                        this.label = 1;
                        if (gjbVar.a(key, this) == objG) {
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
            ta2(SessionWorker sessionWorker, Session session, q22<? super ta2> q22Var) {
                super(2, q22Var);
                this.this$0 = sessionWorker;
                this.$session = session;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new ta2(this.this$0, this.$session, q22Var);
            }

            public final Object invoke(com.google.android.ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object objG = a.g();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    ejb ejbVar = this.this$0.sessionManager;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$session, null);
                    this.label = 1;
                    if (ejbVar.b(anonymousClass1, this) == objG) {
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
        AnonymousClass2(SessionWorker sessionWorker, l8d l8dVar, q22<? super AnonymousClass2> q22Var) {
            super(1, q22Var);
            this.this$0 = sessionWorker;
            this.$$this$withTimerOrNull = l8dVar;
        }

        public final q22<Unit> create(q22<?> q22Var) {
            return new AnonymousClass2(this.this$0, this.$$this$withTimerOrNull, q22Var);
        }

        public final Object invoke(q22<? super c.a> q22Var) {
            return create(q22Var).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
        
            if (com.google.android.rw0.g(r14, r0, r13) == r1) goto L46;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.p008glance.p010session.SessionWorker$doWork$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionWorker$doWork$2(SessionWorker sessionWorker, q22<? super SessionWorker$doWork$2> q22Var) {
        super(2, q22Var);
        this.this$0 = sessionWorker;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(l8d l8dVar, q22<? super c.a> q22Var) {
        return create(l8dVar, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        SessionWorker$doWork$2 sessionWorker$doWork$2 = new SessionWorker$doWork$2(this.this$0, q22Var);
        sessionWorker$doWork$2.L$0 = obj;
        return sessionWorker$doWork$2;
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
        l8d l8dVar = (l8d) this.L$0;
        Context applicationContext = this.this$0.getApplicationContext();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(l8dVar, this.this$0, null);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, l8dVar, null);
        this.label = 1;
        Object objA = IdleEventBroadcastReceiverKt.a(applicationContext, anonymousClass1, anonymousClass2, this);
        return objA == objG ? objG : objA;
    }
}
