package androidx.p008glance.p010session;

import android.content.Context;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lcom/google/android/ta2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2", f = "IdleEventBroadcastReceiver.kt", l = {88}, m = "invokeSuspend")
final class IdleEventBroadcastReceiverKt$observeIdleEvents$2<T> extends SuspendLambda implements Function2<ta2, q22<? super T>, Object> {
    final /* synthetic */ Function1<q22<? super T>, Object> $block;
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<q22<? super Unit>, Object> $onIdle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdleEventBroadcastReceiverKt$observeIdleEvents$2(Context context, Function1<? super q22<? super T>, ? extends Object> function1, Function1<? super q22<? super Unit>, ? extends Object> function2, q22<? super IdleEventBroadcastReceiverKt$observeIdleEvents$2> q22Var) {
        super(2, q22Var);
        this.$context = context;
        this.$block = function1;
        this.$onIdle = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        IdleEventBroadcastReceiverKt$observeIdleEvents$2 idleEventBroadcastReceiverKt$observeIdleEvents$2 = new IdleEventBroadcastReceiverKt$observeIdleEvents$2(this.$context, this.$block, this.$onIdle, q22Var);
        idleEventBroadcastReceiverKt$observeIdleEvents$2.L$0 = obj;
        return idleEventBroadcastReceiverKt$observeIdleEvents$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super T> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        IdleEventBroadcastReceiver idleEventBroadcastReceiver;
        Object objG = a.g();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            idleEventBroadcastReceiver = (IdleEventBroadcastReceiver) this.L$0;
            try {
                f.b(obj);
                this.$context.unregisterReceiver(idleEventBroadcastReceiver);
                return obj;
            } catch (Throwable th) {
                th = th;
                this.$context.unregisterReceiver(idleEventBroadcastReceiver);
                throw th;
            }
        }
        f.b(obj);
        final ta2 ta2Var = (ta2) this.L$0;
        final Function1<q22<? super Unit>, Object> function1 = this.$onIdle;
        IdleEventBroadcastReceiver idleEventBroadcastReceiver2 = new IdleEventBroadcastReceiver(new Function0<Unit>() { // from class: androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1

            /* JADX INFO: renamed from: androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
            @lq2(c = "androidx.glance.session.IdleEventBroadcastReceiverKt$observeIdleEvents$2$idleReceiver$1$1", f = "IdleEventBroadcastReceiver.kt", l = {84}, m = "invokeSuspend")
            static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                final /* synthetic */ Function1<q22<? super Unit>, Object> $onIdle;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function1<? super q22<? super Unit>, ? extends Object> function1, q22<? super AnonymousClass1> q22Var) {
                    super(2, q22Var);
                    this.$onIdle = function1;
                }

                public final q22<Unit> create(Object obj, q22<?> q22Var) {
                    return new AnonymousClass1(this.$onIdle, q22Var);
                }

                public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                    return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object objG = a.g();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        Function1<q22<? super Unit>, Object> function1 = this.$onIdle;
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
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m157invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m157invoke() {
                rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(function1, null), 3, (Object) null);
            }
        });
        this.$context.registerReceiver(idleEventBroadcastReceiver2, IdleEventBroadcastReceiver.INSTANCE.a());
        try {
            idleEventBroadcastReceiver2.b(this.$context);
            Function1<q22<? super T>, Object> function2 = this.$block;
            this.L$0 = idleEventBroadcastReceiver2;
            this.label = 1;
            obj = function2.invoke(this);
            if (obj == objG) {
                return objG;
            }
            idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
            this.$context.unregisterReceiver(idleEventBroadcastReceiver);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            idleEventBroadcastReceiver = idleEventBroadcastReceiver2;
            this.$context.unregisterReceiver(idleEventBroadcastReceiver);
            throw th;
        }
    }
}
