package androidx.p008glance.p010session;

import androidx.compose.p004runtime.b;
import androidx.compose.p004runtime.v;
import com.google.android.g41;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 42\u00020\u0001:\u0001\u001bB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ*\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u0016\u0010/\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010!R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Landroidx/glance/session/InteractiveFrameClock;", "Landroidx/compose/runtime/v;", "Lcom/google/android/ta2;", "scope", "", "baselineHz", "interactiveHz", "", "interactiveTimeoutMs", "Lkotlin/Function0;", "nanoTime", "<init>", "(Lcom/google/android/ta2;IIJLkotlin/jvm/functions/Function0;)V", "", "n", "()V", "now", "o", "(J)V", "q", "(Lcom/google/android/q22;)Ljava/lang/Object;", "r", "R", "Lkotlin/Function1;", "onFrame", "d0", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Lcom/google/android/ta2;", "b", "I", "c", "d", "J", "e", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/b;", "f", "Landroidx/compose/runtime/b;", "frameClock", "", "g", "Ljava/lang/Object;", "lock", "h", "currentHz", "i", "lastFrame", "Lcom/google/android/g41;", "j", "Lcom/google/android/g41;", "interactiveCoroutine", "k", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InteractiveFrameClock implements v {
    public static final int l = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ta2 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int baselineHz;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int interactiveHz;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long interactiveTimeoutMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function0<Long> nanoTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final b frameClock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int currentHz;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long lastFrame;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private g41<? super Unit> interactiveCoroutine;

    public InteractiveFrameClock(ta2 ta2Var, int i, int i2, long j, Function0<Long> function0) {
        this.scope = ta2Var;
        this.baselineHz = i;
        this.interactiveHz = i2;
        this.interactiveTimeoutMs = j;
        this.nanoTime = function0;
        this.frameClock = new b(new Function0<Unit>() { // from class: androidx.glance.session.InteractiveFrameClock$frameClock$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m159invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m159invoke() {
                this.this$0.n();
            }
        });
        this.lock = new Object();
        this.currentHz = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        long jLongValue = ((Number) this.nanoTime.invoke()).longValue();
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.LongRef longRef2 = new Ref.LongRef();
        synchronized (this.lock) {
            longRef.element = jLongValue - this.lastFrame;
            longRef2.element = 1000000000 / ((long) this.currentHz);
            Unit unit = Unit.a;
        }
        rw0.d(this.scope, (CoroutineContext) null, (CoroutineStart) null, new ta2(longRef, longRef2, this, jLongValue, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(long now) {
        this.frameClock.g(now);
        synchronized (this.lock) {
            this.lastFrame = now;
            Unit unit = Unit.a;
        }
    }

    @Override // androidx.compose.p004runtime.v
    public <R> Object d0(Function1<? super Long, ? extends R> function1, q22<? super R> q22Var) {
        return this.frameClock.d0(function1, q22Var);
    }

    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) v.a.a(this, r, function2);
    }

    public <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) v.a.b(this, bVar);
    }

    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return v.a.c(this, bVar);
    }

    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return v.a.d(this, coroutineContext);
    }

    public final Object q(q22<? super Unit> q22Var) {
        return TimeoutKt.e(this.interactiveTimeoutMs, new C0232InteractiveFrameClock$startInteractive$2(this, null), q22Var);
    }

    public final void r() {
        synchronized (this.lock) {
            g41<? super Unit> g41Var = this.interactiveCoroutine;
            if (g41Var != null) {
                g41.a.a(g41Var, (Throwable) null, 1, (Object) null);
            }
        }
    }

    public /* synthetic */ InteractiveFrameClock(ta2 ta2Var, int i, int i2, long j, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(ta2Var, (i3 & 2) != 0 ? 5 : i, (i3 & 4) != 0 ? 20 : i2, (i3 & 8) != 0 ? 5000L : j, (i3 & 16) != 0 ? new Function0<Long>() { // from class: androidx.glance.session.InteractiveFrameClock.1
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Long m158invoke() {
                return Long.valueOf(System.nanoTime());
            }
        } : function0);
    }
}
