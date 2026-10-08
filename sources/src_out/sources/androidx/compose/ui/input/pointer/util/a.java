package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.f;
import com.google.inputmethod.HistoricalChange;
import com.google.inputmethod.hc9;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t3e;
import com.google.inputmethod.u3e;
import com.google.inputmethod.z3e;
import com.google.inputmethod.zw5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\"\u0010#\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006'"}, d2 = {"Landroidx/compose/ui/input/pointer/util/a;", "Lcom/google/android/hc9;", "<init>", "()V", "Landroidx/compose/ui/input/pointer/i;", "event", "Lcom/google/android/rn8;", "offset", "", "e", "(Landroidx/compose/ui/input/pointer/i;J)V", "f", "", "timeMillis", "position", "b", "(JJ)V", "Lcom/google/android/t3e;", "maximumVelocity", "a", "(J)J", "c", "d", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "strategy", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "xVelocityTracker", "yVelocityTracker", "J", "getCurrentPointerPositionAccumulator-F1C5BW0$ui", "()J", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui", "(J)V", "currentPointerPositionAccumulator", "getLastMoveEventTimeStamp$ui", "setLastMoveEventTimeStamp$ui", "lastMoveEventTimeStamp", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements hc9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final VelocityTracker1D.Strategy strategy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final VelocityTracker1D xVelocityTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final VelocityTracker1D yVelocityTracker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long currentPointerPositionAccumulator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long lastMoveEventTimeStamp;

    public a() {
        VelocityTracker1D.Strategy strategy = VelocityTracker1D.Strategy.Lsq2;
        this.strategy = strategy;
        boolean z = false;
        int i = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.xVelocityTracker = new VelocityTracker1D(z, strategy, i, defaultConstructorMarker);
        this.yVelocityTracker = new VelocityTracker1D(z, strategy, i, defaultConstructorMarker);
        this.currentPointerPositionAccumulator = rn8.INSTANCE.c();
    }

    private final void e(PointerInputChange event, long offset) {
        if (f.b(event)) {
            this.currentPointerPositionAccumulator = event.getPosition();
            d();
        }
        long previousPosition = event.getPreviousPosition();
        List<HistoricalChange> listE = event.e();
        int size = listE.size();
        int i = 0;
        while (i < size) {
            HistoricalChange historicalChange = listE.get(i);
            long jP = rn8.p(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            this.currentPointerPositionAccumulator = rn8.q(this.currentPointerPositionAccumulator, jP);
            b(historicalChange.getUptimeMillis(), rn8.q(this.currentPointerPositionAccumulator, offset));
            i++;
            previousPosition = position;
        }
        this.currentPointerPositionAccumulator = rn8.q(this.currentPointerPositionAccumulator, rn8.p(event.getPosition(), previousPosition));
        b(event.getUptimeMillis(), rn8.q(this.currentPointerPositionAccumulator, offset));
    }

    private final void f(PointerInputChange event, long offset) {
        if (f.b(event)) {
            d();
        }
        if (!f.d(event)) {
            List<HistoricalChange> listE = event.e();
            int size = listE.size();
            for (int i = 0; i < size; i++) {
                HistoricalChange historicalChange = listE.get(i);
                b(historicalChange.getUptimeMillis(), rn8.q(historicalChange.getOriginalEventPosition(), offset));
            }
            b(event.getUptimeMillis(), rn8.q(event.getOriginalEventPosition(), offset));
        }
        if (f.d(event) && event.getUptimeMillis() - this.lastMoveEventTimeStamp > 40) {
            d();
        }
        this.lastMoveEventTimeStamp = event.getUptimeMillis();
    }

    @Override // com.google.inputmethod.hc9
    public long a(long maximumVelocity) {
        if (!(t3e.h(maximumVelocity) > 0.0f && t3e.i(maximumVelocity) > 0.0f)) {
            zw5.c("maximumVelocity should be a positive value. You specified=" + ((Object) t3e.n(maximumVelocity)));
        }
        return u3e.a(this.xVelocityTracker.d(t3e.h(maximumVelocity)), this.yVelocityTracker.d(t3e.i(maximumVelocity)));
    }

    @Override // com.google.inputmethod.hc9
    public void b(long timeMillis, long position) {
        this.xVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (position >> 32)));
        this.yVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (position & 4294967295L)));
    }

    @Override // com.google.inputmethod.hc9
    public void c(PointerInputChange event, long offset) {
        if (z3e.g()) {
            f(event, offset);
        } else {
            e(event, offset);
        }
    }

    @Override // com.google.inputmethod.hc9
    public void d() {
        this.xVelocityTracker.e();
        this.yVelocityTracker.e();
        this.lastMoveEventTimeStamp = 0L;
    }
}
