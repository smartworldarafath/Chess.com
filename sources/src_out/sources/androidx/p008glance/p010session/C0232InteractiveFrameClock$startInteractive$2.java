package androidx.p008glance.p010session;

import com.google.android.lq2;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.e;

/* JADX INFO: renamed from: androidx.glance.session.InteractiveFrameClock$startInteractive$2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {1, 8, 0})
@lq2(c = "androidx.glance.session.InteractiveFrameClock$startInteractive$2", f = "InteractiveFrameClock.kt", l = {137}, m = "invokeSuspend")
final class C0232InteractiveFrameClock$startInteractive$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InteractiveFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0232InteractiveFrameClock$startInteractive$2(InteractiveFrameClock interactiveFrameClock, q22<? super C0232InteractiveFrameClock$startInteractive$2> q22Var) {
        super(2, q22Var);
        this.this$0 = interactiveFrameClock;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0232InteractiveFrameClock$startInteractive$2(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.r();
            final InteractiveFrameClock interactiveFrameClock = this.this$0;
            this.L$0 = interactiveFrameClock;
            this.label = 1;
            e eVar = new e(a.d(this), 1);
            eVar.G();
            synchronized (interactiveFrameClock.lock) {
                interactiveFrameClock.currentHz = interactiveFrameClock.interactiveHz;
                interactiveFrameClock.interactiveCoroutine = eVar;
                Unit unit = Unit.a;
            }
            eVar.D(new Function1<Throwable, Unit>() { // from class: androidx.glance.session.InteractiveFrameClock$startInteractive$2$1$2
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return Unit.a;
                }

                public final void invoke(Throwable th) {
                    Object obj2 = interactiveFrameClock.lock;
                    InteractiveFrameClock interactiveFrameClock2 = interactiveFrameClock;
                    synchronized (obj2) {
                        interactiveFrameClock2.currentHz = interactiveFrameClock2.baselineHz;
                        interactiveFrameClock2.interactiveCoroutine = null;
                        Unit unit2 = Unit.a;
                    }
                }
            });
            Object objY = eVar.y();
            if (objY == a.g()) {
                oq2.c(this);
            }
            if (objY == objG) {
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
