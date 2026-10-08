package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.p004runtime.snapshots.g;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.yg4;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.f43;
import com.google.inputmethod.or;
import com.google.inputmethod.pu6;
import com.google.inputmethod.qr;
import com.google.inputmethod.tjd;
import com.google.inputmethod.w2e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u0003R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses;", "", "<init>", "()V", "", "delta", "Lcom/google/android/f43;", "density", "Lcom/google/android/ta2;", "coroutineScope", "", "e", "(FLcom/google/android/f43;Lcom/google/android/ta2;)V", "d", "Lkotlinx/coroutines/s;", "a", "Lkotlinx/coroutines/s;", "getJob$foundation", "()Lkotlinx/coroutines/s;", "setJob$foundation", "(Lkotlinx/coroutines/s;)V", "job", "Lcom/google/android/nr;", "Lcom/google/android/qr;", "b", "Lcom/google/android/nr;", "_scrollDeltaBetweenPasses", "()F", "scrollDeltaBetweenPasses", "", "c", "()Z", "isActive", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LazyLayoutScrollDeltaBetweenPasses {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private s job;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AnimationState<Float, qr> _scrollDeltaBetweenPasses;

    public LazyLayoutScrollDeltaBetweenPasses() {
        tjd<Float, qr> tjdVarN = w2e.N(yg4.a);
        Float fValueOf = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = or.d(tjdVarN, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    public final float b() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final boolean c() {
        return !(this._scrollDeltaBetweenPasses.getValue().floatValue() == 0.0f);
    }

    public final void d() {
        s sVar = this.job;
        if (sVar != null) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this._scrollDeltaBetweenPasses = new AnimationState<>(w2e.N(yg4.a), Float.valueOf(0.0f), null, 0L, 0L, false, 60, null);
    }

    public final void e(float delta, f43 density, ta2 coroutineScope) {
        if (delta <= density.x2(pu6.a)) {
            return;
        }
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        g gVarE = companion.e(gVarD);
        try {
            float fFloatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            s sVar = this.job;
            if (sVar != null) {
                s.a.a(sVar, (CancellationException) null, 1, (Object) null);
            }
            if (this._scrollDeltaBetweenPasses.getIsRunning()) {
                this._scrollDeltaBetweenPasses = or.g(this._scrollDeltaBetweenPasses, fFloatValue - delta, 0.0f, 0L, 0L, false, 30, null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(w2e.N(yg4.a), Float.valueOf(-delta), null, 0L, 0L, false, 60, null);
            }
            this.job = rw0.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3, (Object) null);
            Unit unit = Unit.a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }
}
