package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.inputmethod.rbd;
import com.google.inputmethod.se9;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState;", "", "<init>", "()V", "AwaitDown", "b", "a", "c", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "Landroidx/compose/foundation/gestures/DragDetectionState$a;", "Landroidx/compose/foundation/gestures/DragDetectionState$b;", "Landroidx/compose/foundation/gestures/DragDetectionState$c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
abstract class DragDetectionState {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "Landroidx/compose/foundation/gestures/DragDetectionState;", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;", "awaitTouchSlop", "", "consumedOnInitial", "<init>", "(Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;Z)V", "a", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;", "()Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;", "c", "(Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;)V", "b", "Z", "()Z", "d", "(Z)V", "AwaitTouchSlop", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AwaitDown extends DragDetectionState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private AwaitTouchSlop awaitTouchSlop;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean consumedOnInitial;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown$AwaitTouchSlop;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum AwaitTouchSlop {
            Yes,
            No,
            NotInitialized;

            private static final /* synthetic */ EnumEntries e = kotlin.enums.a.a(a());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AwaitDown() {
            AwaitTouchSlop awaitTouchSlop = null;
            this(awaitTouchSlop, false, 3, awaitTouchSlop);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AwaitTouchSlop getAwaitTouchSlop() {
            return this.awaitTouchSlop;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getConsumedOnInitial() {
            return this.consumedOnInitial;
        }

        public final void c(AwaitTouchSlop awaitTouchSlop) {
            this.awaitTouchSlop = awaitTouchSlop;
        }

        public final void d(boolean z) {
            this.consumedOnInitial = z;
        }

        public AwaitDown(AwaitTouchSlop awaitTouchSlop, boolean z) {
            super(null);
            this.awaitTouchSlop = awaitTouchSlop;
            this.consumedOnInitial = z;
        }

        public /* synthetic */ AwaitDown(AwaitTouchSlop awaitTouchSlop, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AwaitTouchSlop.NotInitialized : awaitTouchSlop, (i & 2) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$a;", "Landroidx/compose/foundation/gestures/DragDetectionState;", "Landroidx/compose/ui/input/pointer/i;", "initialDown", "Lcom/google/android/se9;", "pointerId", "Lcom/google/android/rbd;", "touchSlopDetector", "<init>", "(Landroidx/compose/ui/input/pointer/i;JLcom/google/android/rbd;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Landroidx/compose/ui/input/pointer/i;", "()Landroidx/compose/ui/input/pointer/i;", "c", "(Landroidx/compose/ui/input/pointer/i;)V", "b", "J", "()J", "d", "(J)V", "Lcom/google/android/rbd;", "getTouchSlopDetector", "()Lcom/google/android/rbd;", "e", "(Lcom/google/android/rbd;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends DragDetectionState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private PointerInputChange initialDown;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long pointerId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private rbd touchSlopDetector;

        public /* synthetic */ a(PointerInputChange pointerInputChange, long j, rbd rbdVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(pointerInputChange, j, rbdVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPointerId() {
            return this.pointerId;
        }

        public final void c(PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        public final void d(long j) {
            this.pointerId = j;
        }

        public final void e(rbd rbdVar) {
            this.touchSlopDetector = rbdVar;
        }

        private a(PointerInputChange pointerInputChange, long j, rbd rbdVar) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j;
            this.touchSlopDetector = rbdVar;
        }

        public /* synthetic */ a(PointerInputChange pointerInputChange, long j, rbd rbdVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pointerInputChange, (i & 2) != 0 ? se9.a(Long.MAX_VALUE) : j, (i & 4) != 0 ? null : rbdVar, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$b;", "Landroidx/compose/foundation/gestures/DragDetectionState;", "Landroidx/compose/ui/input/pointer/i;", "initialDown", "Lcom/google/android/se9;", "pointerId", "", "verifyConsumptionInFinalPass", "<init>", "(Landroidx/compose/ui/input/pointer/i;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Landroidx/compose/ui/input/pointer/i;", "()Landroidx/compose/ui/input/pointer/i;", "d", "(Landroidx/compose/ui/input/pointer/i;)V", "b", "J", "()J", "e", "(J)V", "c", "Z", "()Z", "f", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends DragDetectionState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private PointerInputChange initialDown;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private long pointerId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean verifyConsumptionInFinalPass;

        public /* synthetic */ b(PointerInputChange pointerInputChange, long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(pointerInputChange, j, z);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPointerId() {
            return this.pointerId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getVerifyConsumptionInFinalPass() {
            return this.verifyConsumptionInFinalPass;
        }

        public final void d(PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        public final void e(long j) {
            this.pointerId = j;
        }

        public final void f(boolean z) {
            this.verifyConsumptionInFinalPass = z;
        }

        private b(PointerInputChange pointerInputChange, long j, boolean z) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j;
            this.verifyConsumptionInFinalPass = z;
        }

        public /* synthetic */ b(PointerInputChange pointerInputChange, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : pointerInputChange, (i & 2) != 0 ? se9.a(Long.MAX_VALUE) : j, (i & 4) != 0 ? false : z, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/DragDetectionState$c;", "Landroidx/compose/foundation/gestures/DragDetectionState;", "Lcom/google/android/se9;", "pointerId", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "b", "(J)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends DragDetectionState {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long pointerId;

        public /* synthetic */ c(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getPointerId() {
            return this.pointerId;
        }

        public final void b(long j) {
            this.pointerId = j;
        }

        private c(long j) {
            super(null);
            this.pointerId = j;
        }

        public /* synthetic */ c(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? se9.a(Long.MAX_VALUE) : j, null);
        }
    }

    public /* synthetic */ DragDetectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DragDetectionState() {
    }
}
