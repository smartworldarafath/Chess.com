package androidx.p008glance.p010session;

import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.l8d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.DurationUnit;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"androidx/glance/session/TimerScopeKt$withTimer$2$1$blockScope$1", "Lcom/google/android/l8d;", "Lcom/google/android/ta2;", "Lkotlin/time/b;", "time", "", "q0", "(J)V", "initialTimeout", "G0", "Ljava/util/concurrent/atomic/AtomicReference;", "", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "deadline", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c0", "()J", "timeLeft", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimerScopeKt$withTimer$2$1$blockScope$1 implements l8d, ta2 {
    private final /* synthetic */ ta2 a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AtomicReference<Long> deadline = new AtomicReference<>(null);
    final /* synthetic */ c c;
    final /* synthetic */ ta2 d;
    final /* synthetic */ Function2<l8d, q22<? super T>, Object> e;
    final /* synthetic */ AtomicReference<s> f;

    /* JADX WARN: Multi-variable type inference failed */
    TimerScopeKt$withTimer$2$1$blockScope$1(ta2 ta2Var, c cVar, ta2 ta2Var2, Function2<? super l8d, ? super q22<? super T>, ? extends Object> function2, AtomicReference<s> atomicReference) {
        this.c = cVar;
        this.d = ta2Var2;
        this.e = function2;
        this.f = atomicReference;
        this.a = ta2Var;
    }

    @Override // com.google.inputmethod.l8d
    public void G0(long initialTimeout) {
        if (b.u(initialTimeout) <= 0) {
            j.d(this.d, new TimeoutCancellationException("Timed out immediately", this.e.hashCode()));
            return;
        }
        if (b.j(c0(), initialTimeout) < 0) {
            return;
        }
        this.deadline.set(Long.valueOf(this.c.a() + b.u(initialTimeout)));
        AtomicReference<s> atomicReference = this.f;
        ta2 ta2Var = this.d;
        s andSet = atomicReference.getAndSet(rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(this, this.c, ta2Var, this.e, null), 3, (Object) null));
        if (andSet != null) {
            s.a.a(andSet, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // com.google.inputmethod.l8d
    public long c0() {
        Long l = this.deadline.get();
        if (l == null) {
            return b.b.a();
        }
        long jLongValue = l.longValue() - this.c.a();
        b.a aVar = b.b;
        return c.t(jLongValue, DurationUnit.c);
    }

    public CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    @Override // com.google.inputmethod.l8d
    public void q0(final long time) {
        TimerScopeKt.b(this.deadline, new Function1<Long, Long>() { // from class: androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1$addTime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(Long l) {
                if (l == null) {
                    throw new IllegalStateException("Start the timer with startTimer before calling addTime");
                }
                if (b.K(time)) {
                    return Long.valueOf(l.longValue() + b.u(time));
                }
                throw new IllegalArgumentException("Cannot call addTime with a negative duration");
            }
        });
    }
}
