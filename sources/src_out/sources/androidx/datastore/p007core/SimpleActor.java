package androidx.datastore.p007core;

import androidx.datastore.p007core.SimpleActor;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.s30;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.a;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/datastore/core/SimpleActor;", "T", "", "Lcom/google/android/ta2;", "scope", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lcom/google/android/q22;", "consumeMessage", "<init>", "(Lcom/google/android/ta2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "msg", "g", "(Ljava/lang/Object;)V", "a", "Lcom/google/android/ta2;", "b", "Lkotlin/jvm/functions/Function2;", "Lcom/google/android/h81;", "c", "Lcom/google/android/h81;", "messageQueue", "Lcom/google/android/s30;", "d", "Lcom/google/android/s30;", "remainingMessages", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleActor<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ta2 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function2<T, q22<? super Unit>, Object> consumeMessage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final h81<T> messageQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final s30 remainingMessages;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(ta2 ta2Var, final Function1<? super Throwable, Unit> function1, final Function2<? super T, ? super Throwable, Unit> function2, Function2<? super T, ? super q22<? super Unit>, ? extends Object> function3) {
        Intrinsics.checkNotNullParameter(ta2Var, "scope");
        Intrinsics.checkNotNullParameter(function1, "onComplete");
        Intrinsics.checkNotNullParameter(function2, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(function3, "consumeMessage");
        this.scope = ta2Var;
        this.consumeMessage = function3;
        this.messageQueue = p81.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        this.remainingMessages = new s30(0);
        s sVar = ta2Var.getCoroutineContext().get(s.u2);
        if (sVar != null) {
            sVar.A(new Function1() { // from class: com.google.android.ppb
                public final Object invoke(Object obj) {
                    return SimpleActor.b(function1, this, function2, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Function1 function1, SimpleActor simpleActor, Function2 function2, Throwable th) {
        function1.invoke(th);
        simpleActor.messageQueue.close(th);
        while (true) {
            Object objF = a.f(simpleActor.messageQueue.s());
            if (objF == null) {
                return Unit.a;
            }
            function2.invoke(objF, th);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.channels.ClosedSendChannelException */
    public final void g(T msg) throws Throwable {
        Object objE = this.messageQueue.e(msg);
        if (objE instanceof a.a) {
            Throwable thE = a.e(objE);
            if (thE != null) {
                throw thE;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!a.j(objE)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.c() == 0) {
            rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, new C0224SimpleActor$offer$2(this, null), 3, (Object) null);
        }
    }
}
