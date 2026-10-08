package androidx.p008glance.p010session;

import com.google.android.q22;
import com.google.inputmethod.l8d;
import com.google.inputmethod.t04;
import com.google.inputmethod.w58;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aD\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@¢\u0006\u0004\b\n\u0010\t\u001a3\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "Landroidx/glance/session/c;", "timeSource", "Lkotlin/Function2;", "Lcom/google/android/l8d;", "Lcom/google/android/q22;", "", "block", "c", "(Landroidx/glance/session/c;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlin/Function1;", "updater", "", "b", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TimerScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void b(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> function1) {
        T t;
        do {
            t = atomicReference.get();
        } while (!w58.a(atomicReference, t, function1.invoke(t)));
    }

    public static final <T> Object c(c cVar, Function2<? super l8d, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return j.g(new TimerScopeKt$withTimer$2(function2, cVar, null), q22Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object d(c cVar, Function2<? super l8d, ? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        TimerScopeKt$withTimerOrNull$1 timerScopeKt$withTimerOrNull$1;
        if (q22Var instanceof TimerScopeKt$withTimerOrNull$1) {
            timerScopeKt$withTimerOrNull$1 = (TimerScopeKt$withTimerOrNull$1) q22Var;
            int i = timerScopeKt$withTimerOrNull$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                timerScopeKt$withTimerOrNull$1.label = i - t04.INVALID_ID;
            } else {
                timerScopeKt$withTimerOrNull$1 = new TimerScopeKt$withTimerOrNull$1(q22Var);
            }
        } else {
            timerScopeKt$withTimerOrNull$1 = new TimerScopeKt$withTimerOrNull$1(q22Var);
        }
        Object obj = timerScopeKt$withTimerOrNull$1.result;
        Object objG = a.g();
        int i2 = timerScopeKt$withTimerOrNull$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return obj;
            }
            f.b(obj);
            timerScopeKt$withTimerOrNull$1.L$0 = function2;
            timerScopeKt$withTimerOrNull$1.label = 1;
            Object objC = c(cVar, function2, timerScopeKt$withTimerOrNull$1);
            return objC == objG ? objG : objC;
        } catch (TimeoutCancellationException e) {
            if (e.getBlock() == function2.hashCode()) {
                return null;
            }
            throw e;
        }
    }
}
