package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.gestures.TrackpadScrollingLogic;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.input.pointer.g;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.HistoricalChange;
import com.google.inputmethod.f43;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t3e;
import com.google.inputmethod.up1;
import com.google.inputmethod.ve8;
import com.google.inputmethod.we8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u00015B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\"\u001a\u00020 *\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Landroidx/compose/foundation/gestures/TrackpadScrollingLogic;", "Landroidx/compose/foundation/gestures/NonTouchScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Lkotlin/Function2;", "Lcom/google/android/t3e;", "Lcom/google/android/q22;", "", "", "onScrollStopped", "Lcom/google/android/f43;", "density", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Lkotlin/jvm/functions/Function2;Lcom/google/android/f43;)V", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "", "s", "(Landroidx/compose/ui/input/pointer/e;)Z", "Lcom/google/android/h81;", "Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$a;", "v", "(Lcom/google/android/h81;)Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$a;", "Lcom/google/android/rn8;", "scrollDelta", "p", "(Landroidx/compose/foundation/gestures/ScrollingLogic;J)Z", "x", "(Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$a;)V", "r", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$a;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/ve8;", "", "delta", "q", "(Lcom/google/android/ve8;F)F", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lcom/google/android/q16;", "bounds", "t", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Lcom/google/android/ta2;", "coroutineScope", "u", "(Lcom/google/android/ta2;)V", "f", "Lcom/google/android/h81;", "channel", "Lkotlinx/coroutines/s;", "g", "Lkotlinx/coroutines/s;", "receivingPanEventsJob", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrackpadScrollingLogic extends NonTouchScrollingLogic {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final h81<a> channel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private s receivingPanEventsJob;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$a;", "", "Lcom/google/android/rn8;", "value", "", "timeMillis", "", "isEnd", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "d", "(Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$a;)Landroidx/compose/foundation/gestures/TrackpadScrollingLogic$a;", "a", "J", "b", "()J", "c", "Z", "()Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long timeMillis;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isEnd;

        public /* synthetic */ a(long j, long j2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsEnd() {
            return this.isEnd;
        }

        public final a d(a other) {
            return new a(rn8.q(this.value, other.value), Math.max(this.timeMillis, other.timeMillis), this.isEnd || other.isEnd, null);
        }

        private a(long j, long j2, boolean z) {
            this.value = j;
            this.timeMillis = j2;
            this.isEnd = z;
        }
    }

    public TrackpadScrollingLogic(ScrollingLogic scrollingLogic, Function2<? super t3e, ? super q22<? super Unit>, ? extends Object> function2, f43 f43Var) {
        super(scrollingLogic, function2, f43Var);
        this.channel = p81.b(Integer.MAX_VALUE, (BufferOverflow) null, (Function1) null, 6, (Object) null);
    }

    private final boolean p(ScrollingLogic scrollingLogic, long j) {
        return !(scrollingLogic.I(scrollingLogic.A(j)) == 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float q(ve8 ve8Var, float f) {
        ScrollingLogic scrollingLogic = getScrollingLogic();
        return scrollingLogic.G(scrollingLogic.A(ve8Var.a(scrollingLogic.H(scrollingLogic.z(f)), we8.INSTANCE.b())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r6.invoke(r7, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(androidx.compose.p001foundation.gestures.ScrollingLogic r6, androidx.compose.foundation.gestures.TrackpadScrollingLogic.a r7, com.google.android.q22<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.p001foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1 r0 = (androidx.compose.p001foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1 r0 = new androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L82
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.f.b(r8)
            goto L69
        L38:
            kotlin.f.b(r8)
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            r8.element = r7
            r5.x(r7)
            com.google.android.h81<androidx.compose.foundation.gestures.TrackpadScrollingLogic$a> r7 = r5.channel
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r7 = r5.v(r7)
            if (r7 == 0) goto L5a
            r5.x(r7)
            java.lang.Object r2 = r8.element
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r2 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.a) r2
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$a r7 = r2.d(r7)
            r8.element = r7
        L5a:
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3 r7 = new androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3
            r2 = 0
            r7.<init>(r5, r6, r8, r2)
            r0.label = r4
            java.lang.Object r6 = r5.h(r7, r0)
            if (r6 != r1) goto L69
            goto L81
        L69:
            kotlin.jvm.functions.Function2 r6 = r5.c()
            com.google.android.fa3 r7 = r5.getVelocityTracker()
            long r7 = r7.b()
            com.google.android.t3e r7 = com.google.inputmethod.t3e.b(r7)
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L82
        L81:
            return r1
        L82:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.TrackpadScrollingLogic.r(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.TrackpadScrollingLogic$a, com.google.android.q22):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    private final boolean s(e pointerEvent) {
        boolean z;
        if (!up1.isTrackpadGestureHandlingEnabled) {
            return false;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) m.B0(pointerEvent.c());
        if (pointerInputChange != null) {
            List<HistoricalChange> listE = pointerInputChange.e();
            int size = listE.size();
            z = false;
            for (int i = 0; i < size; i++) {
                HistoricalChange historicalChange = listE.get(i);
                long jE = rn8.e((-9223372034707292160L) ^ historicalChange.getPanOffset());
                if (p(getScrollingLogic(), jE)) {
                    z = kotlinx.coroutines.channels.a.j(this.channel.e(new a(jE, historicalChange.getUptimeMillis(), false, null))) || z;
                }
            }
            long jE2 = rn8.e(pointerInputChange.getPanOffset() ^ (-9223372034707292160L));
            boolean zO = g.o(pointerEvent.getType(), g.INSTANCE.d());
            if (p(getScrollingLogic(), jE2) || zO) {
                if (kotlinx.coroutines.channels.a.j(this.channel.e(new a(jE2, pointerInputChange.getUptimeMillis(), zO, null))) || z) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        return z || getIsScrolling();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a v(final h81<a> h81Var) {
        a aVarD = null;
        for (a aVar : NonTouchScrollingLogicKt.b(new Function0() { // from class: com.google.android.gdd
            public final Object invoke() {
                return TrackpadScrollingLogic.w(h81Var);
            }
        })) {
            aVarD = aVarD == null ? aVar : aVarD.d(aVar);
        }
        return aVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a w(h81 h81Var) {
        return (a) kotlinx.coroutines.channels.a.f(h81Var.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(a scrollDelta) {
        getVelocityTracker().a(scrollDelta.getTimeMillis(), scrollDelta.getValue());
    }

    public void t(e pointerEvent, PointerEventPass pass, long bounds) {
        if (up1.isTrackpadGestureHandlingEnabled) {
            int type = pointerEvent.getType();
            g.Companion companion = g.INSTANCE;
            if (g.o(type, companion.f()) || g.o(pointerEvent.getType(), companion.e()) || g.o(pointerEvent.getType(), companion.d())) {
                List<PointerInputChange> listC = pointerEvent.c();
                int size = listC.size();
                for (int i = 0; i < size; i++) {
                    if (listC.get(i).q()) {
                        return;
                    }
                }
                if (pass == PointerEventPass.Initial && getIsScrolling()) {
                    s(pointerEvent);
                    a(pointerEvent);
                }
                if (pass == PointerEventPass.Main && !getIsScrolling() && s(pointerEvent)) {
                    a(pointerEvent);
                }
            }
        }
    }

    public void u(ta2 coroutineScope) {
        if (this.receivingPanEventsJob == null) {
            this.receivingPanEventsJob = rw0.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TrackpadScrollingLogic$startReceivingEvents$1(this, null), 3, (Object) null);
        }
    }
}
