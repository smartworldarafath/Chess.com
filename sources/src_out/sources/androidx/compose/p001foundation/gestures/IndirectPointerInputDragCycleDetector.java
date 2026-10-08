package androidx.compose.p001foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.j;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.inputmethod.IndirectPointerInputChange;
import com.google.inputmethod.cs1;
import com.google.inputmethod.ev5;
import com.google.inputmethod.fv5;
import com.google.inputmethod.io8;
import com.google.inputmethod.iv5;
import com.google.inputmethod.ln6;
import com.google.inputmethod.lv5;
import com.google.inputmethod.p7e;
import com.google.inputmethod.rbd;
import com.google.inputmethod.rn8;
import com.google.inputmethod.se9;
import com.google.inputmethod.u3e;
import com.google.inputmethod.w3e;
import com.google.inputmethod.y23;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.m;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0001gB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010$\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J1\u00104\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J)\u00108\u001a\u00020\u00142\u0006\u00106\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00107\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u00109J!\u0010:\u001a\u00020\u00142\u0006\u00106\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0014H\u0002¢\u0006\u0004\b<\u0010\u001aJ\u001d\u0010=\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0014¢\u0006\u0004\b?\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u0016\u0010V\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\\R\u0016\u0010^\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010UR\u0014\u0010`\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010_R\u0014\u0010b\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010aR\u0014\u0010d\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010cR\u0014\u0010f\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010e¨\u0006h"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector;", "", "Landroidx/compose/foundation/gestures/DragGestureNode;", "node", "<init>", "(Landroidx/compose/foundation/gestures/DragGestureNode;)V", "Lcom/google/android/rbd;", "o", "()Lcom/google/android/rbd;", "Lcom/google/android/w3e;", "p", "()Lcom/google/android/w3e;", "Lcom/google/android/hv5;", "initialDown", "Lcom/google/android/se9;", "pointerId", "Lcom/google/android/rn8;", "initialTouchSlopPositionChange", "", "verifyConsumptionInFinalPass", "", "g", "(Lcom/google/android/hv5;JJZ)V", "i", "(J)V", "e", "()V", "touchSlopDetector", "f", "(Lcom/google/android/hv5;JLcom/google/android/rbd;)V", "Lcom/google/android/ev5;", "indirectPointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "state", "n", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;)V", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$b;", "k", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$b;)V", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$a;", "j", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$a;)V", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$c;", "l", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$c;)V", "down", "slopTriggerChange", "Lcom/google/android/fv5;", "primaryDirectionalMotionAxis", "overSlopOffset", "t", "(Lcom/google/android/hv5;Lcom/google/android/hv5;Lcom/google/android/fv5;J)V", "change", "dragAmount", "s", "(Lcom/google/android/hv5;Lcom/google/android/fv5;J)V", "u", "(Lcom/google/android/hv5;Lcom/google/android/fv5;)V", "r", "m", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "q", "a", "Landroidx/compose/foundation/gestures/DragGestureNode;", "getNode", "()Landroidx/compose/foundation/gestures/DragGestureNode;", "b", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "_awaitDownState", "c", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$c;", "_draggingState", "d", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$b;", "_awaitTouchSlopState", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$a;", "_awaitGesturePickupState", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "currentDragState", "Lcom/google/android/w3e;", "velocityTracker", "h", "J", "previousPositionOnScreen", "Lcom/google/android/rbd;", "Lcom/google/android/lv5;", "Lcom/google/android/lv5;", "touchSmooth", "Lcom/google/android/io8;", "Lcom/google/android/io8;", "offsetSmoother", "nodeOffset", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "awaitDownState", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$c;", "draggingState", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$b;", "awaitTouchSlopState", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$a;", "awaitGesturePickupState", "DragDetectionState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IndirectPointerInputDragCycleDetector {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DragGestureNode node;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private DragDetectionState.AwaitDown _awaitDownState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private DragDetectionState.c _draggingState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private DragDetectionState.b _awaitTouchSlopState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private DragDetectionState.a _awaitGesturePickupState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private DragDetectionState currentDragState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private w3e velocityTracker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long previousPositionOnScreen;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private rbd touchSlopDetector;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final lv5 touchSmooth;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final io8 offsetSmoother;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long nodeOffset;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "", "<init>", "()V", "AwaitDown", "b", "a", "c", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$a;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$b;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class DragDetectionState {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "awaitTouchSlop", "", "consumedOnInitial", "<init>", "(Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;Z)V", "a", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "()Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "c", "(Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;)V", "b", "Z", "()Z", "d", "(Z)V", "AwaitTouchSlop", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AwaitDown extends DragDetectionState {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private AwaitTouchSlop awaitTouchSlop;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private boolean consumedOnInitial;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$AwaitDown$AwaitTouchSlop;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$a;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Lcom/google/android/hv5;", "initialDown", "Lcom/google/android/se9;", "pointerId", "Lcom/google/android/rbd;", "touchSlopDetector", "<init>", "(Lcom/google/android/hv5;JLcom/google/android/rbd;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Lcom/google/android/hv5;", "()Lcom/google/android/hv5;", "c", "(Lcom/google/android/hv5;)V", "b", "J", "()J", "d", "(J)V", "Lcom/google/android/rbd;", "getTouchSlopDetector", "()Lcom/google/android/rbd;", "e", "(Lcom/google/android/rbd;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends DragDetectionState {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private IndirectPointerInputChange initialDown;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private long pointerId;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private rbd touchSlopDetector;

            public /* synthetic */ a(IndirectPointerInputChange indirectPointerInputChange, long j, rbd rbdVar, DefaultConstructorMarker defaultConstructorMarker) {
                this(indirectPointerInputChange, j, rbdVar);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getPointerId() {
                return this.pointerId;
            }

            public final void c(IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            public final void d(long j) {
                this.pointerId = j;
            }

            public final void e(rbd rbdVar) {
                this.touchSlopDetector = rbdVar;
            }

            private a(IndirectPointerInputChange indirectPointerInputChange, long j, rbd rbdVar) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j;
                this.touchSlopDetector = rbdVar;
            }

            public /* synthetic */ a(IndirectPointerInputChange indirectPointerInputChange, long j, rbd rbdVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : indirectPointerInputChange, (i & 2) != 0 ? se9.a(Long.MAX_VALUE) : j, (i & 4) != 0 ? null : rbdVar, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$b;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Lcom/google/android/hv5;", "initialDown", "Lcom/google/android/se9;", "pointerId", "", "verifyConsumptionInFinalPass", "<init>", "(Lcom/google/android/hv5;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Lcom/google/android/hv5;", "()Lcom/google/android/hv5;", "d", "(Lcom/google/android/hv5;)V", "b", "J", "()J", "e", "(J)V", "c", "Z", "()Z", "f", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends DragDetectionState {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private IndirectPointerInputChange initialDown;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private long pointerId;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private boolean verifyConsumptionInFinalPass;

            public /* synthetic */ b(IndirectPointerInputChange indirectPointerInputChange, long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
                this(indirectPointerInputChange, j, z);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final IndirectPointerInputChange getInitialDown() {
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

            public final void d(IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            public final void e(long j) {
                this.pointerId = j;
            }

            public final void f(boolean z) {
                this.verifyConsumptionInFinalPass = z;
            }

            private b(IndirectPointerInputChange indirectPointerInputChange, long j, boolean z) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j;
                this.verifyConsumptionInFinalPass = z;
            }

            public /* synthetic */ b(IndirectPointerInputChange indirectPointerInputChange, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : indirectPointerInputChange, (i & 2) != 0 ? se9.a(Long.MAX_VALUE) : j, (i & 4) != 0 ? false : z, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState$c;", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector$DragDetectionState;", "Lcom/google/android/se9;", "pointerId", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "b", "(J)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DragDetectionState.AwaitDown.AwaitTouchSlop.values().length];
            try {
                iArr[DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IndirectPointerInputDragCycleDetector(DragGestureNode dragGestureNode) {
        this.node = dragGestureNode;
        rn8.Companion companion = rn8.INSTANCE;
        this.previousPositionOnScreen = companion.b();
        this.touchSmooth = new lv5();
        this.offsetSmoother = new io8();
        this.nodeOffset = companion.c();
    }

    private final DragDetectionState.AwaitDown a() {
        DragDetectionState.AwaitDown awaitDown = this._awaitDownState;
        if (awaitDown != null) {
            return awaitDown;
        }
        DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop = null;
        DragDetectionState.AwaitDown awaitDown2 = new DragDetectionState.AwaitDown(awaitTouchSlop, false, 3, awaitTouchSlop);
        this._awaitDownState = awaitDown2;
        return awaitDown2;
    }

    private final DragDetectionState.a b() {
        DragDetectionState.a aVar = this._awaitGesturePickupState;
        if (aVar != null) {
            return aVar;
        }
        DragDetectionState.a aVar2 = new DragDetectionState.a(null, 0L, null, 7, null);
        this._awaitGesturePickupState = aVar2;
        return aVar2;
    }

    private final DragDetectionState.b c() {
        DragDetectionState.b bVar = this._awaitTouchSlopState;
        if (bVar != null) {
            return bVar;
        }
        DragDetectionState.b bVar2 = new DragDetectionState.b(null, 0L, false, 7, null);
        this._awaitTouchSlopState = bVar2;
        return bVar2;
    }

    private final DragDetectionState.c d() {
        DragDetectionState.c cVar = this._draggingState;
        if (cVar != null) {
            return cVar;
        }
        DragDetectionState.c cVar2 = new DragDetectionState.c(0L, 1, null);
        this._draggingState = cVar2;
        return cVar2;
    }

    private final void e() {
        DragDetectionState.AwaitDown awaitDownA = a();
        awaitDownA.c(DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized);
        awaitDownA.d(false);
        this.currentDragState = awaitDownA;
    }

    private final void f(IndirectPointerInputChange initialDown, long pointerId, rbd touchSlopDetector) {
        DragDetectionState.a aVarB = b();
        aVarB.c(initialDown);
        aVarB.d(pointerId);
        rbd.h(touchSlopDetector, 0L, 1, null);
        aVarB.e(touchSlopDetector);
        this.currentDragState = aVarB;
    }

    private final void g(IndirectPointerInputChange initialDown, long pointerId, long initialTouchSlopPositionChange, boolean verifyConsumptionInFinalPass) {
        DragDetectionState.b bVarC = c();
        bVarC.d(initialDown);
        bVarC.e(pointerId);
        rbd rbdVar = this.touchSlopDetector;
        if (rbdVar == null) {
            this.touchSlopDetector = new rbd(this.node.getOrientationLock(), 0L, 2, null);
        } else {
            if (rbdVar != null) {
                rbdVar.i(this.node.getOrientationLock());
            }
            rbd rbdVar2 = this.touchSlopDetector;
            if (rbdVar2 != null) {
                rbdVar2.g(initialTouchSlopPositionChange);
            }
        }
        bVarC.f(verifyConsumptionInFinalPass);
        this.currentDragState = bVarC;
    }

    static /* synthetic */ void h(IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector, IndirectPointerInputChange indirectPointerInputChange, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = rn8.INSTANCE.c();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            z = false;
        }
        indirectPointerInputDragCycleDetector.g(indirectPointerInputChange, j, j3, z);
    }

    private final void i(long pointerId) {
        DragDetectionState.c cVarD = d();
        cVarD.b(pointerId);
        this.currentDragState = cVarD;
    }

    private final void j(ev5 indirectPointerInputEvent, PointerEventPass pass, DragDetectionState.a state) {
        boolean z;
        if (pass != PointerEventPass.Final) {
            return;
        }
        List<IndirectPointerInputChange> listB = indirectPointerInputEvent.b();
        int size = listB.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else {
                if (listB.get(i).getIsConsumed()) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        List<IndirectPointerInputChange> listB2 = indirectPointerInputEvent.b();
        int size2 = listB2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (listB2.get(i2).getPressed()) {
                if (indirectPointerInputEvent.b().isEmpty()) {
                    break;
                }
                if (z) {
                    long jL = iv5.l((IndirectPointerInputChange) m.z0(indirectPointerInputEvent.b()), this.node.getOrientationLock(), fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()));
                    IndirectPointerInputChange initialDown = state.getInitialDown();
                    Intrinsics.g(initialDown);
                    long jP = rn8.p(jL, iv5.l(initialDown, this.node.getOrientationLock(), fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis())));
                    IndirectPointerInputChange initialDown2 = state.getInitialDown();
                    if (initialDown2 == null) {
                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                    }
                    h(this, initialDown2, state.getPointerId(), jP, false, 8, null);
                    return;
                }
                return;
            }
        }
        e();
    }

    private final void k(ev5 indirectPointerInputEvent, PointerEventPass pass, DragDetectionState.b state) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        IndirectPointerInputChange indirectPointerInputChange3;
        if (pass == PointerEventPass.Initial) {
            return;
        }
        List<IndirectPointerInputChange> listB = indirectPointerInputEvent.b();
        int size = listB.size();
        int i = 0;
        while (true) {
            indirectPointerInputChange = null;
            if (i >= size) {
                indirectPointerInputChange2 = null;
                break;
            }
            indirectPointerInputChange2 = listB.get(i);
            if (se9.b(indirectPointerInputChange2.getId(), state.getPointerId())) {
                break;
            } else {
                i++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange4 = indirectPointerInputChange2;
        if (indirectPointerInputChange4 == null) {
            List<IndirectPointerInputChange> listB2 = indirectPointerInputEvent.b();
            int size2 = listB2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    indirectPointerInputChange3 = null;
                    break;
                }
                indirectPointerInputChange3 = listB2.get(i2);
                if (indirectPointerInputChange3.getPressed()) {
                    break;
                } else {
                    i2++;
                }
            }
            indirectPointerInputChange4 = indirectPointerInputChange3;
            if (indirectPointerInputChange4 == null) {
                e();
                return;
            }
            state.e(indirectPointerInputChange4.getId());
        }
        IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange4;
        if (pass == PointerEventPass.Main) {
            if (indirectPointerInputChange5.getIsConsumed()) {
                IndirectPointerInputChange initialDown = state.getInitialDown();
                if (initialDown == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long pointerId = state.getPointerId();
                rbd rbdVar = this.touchSlopDetector;
                if (rbdVar == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                f(initialDown, pointerId, rbdVar);
            } else if (iv5.h(indirectPointerInputChange5)) {
                List<IndirectPointerInputChange> listB3 = indirectPointerInputEvent.b();
                int size3 = listB3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    IndirectPointerInputChange indirectPointerInputChange6 = listB3.get(i3);
                    if (indirectPointerInputChange6.getPressed()) {
                        indirectPointerInputChange = indirectPointerInputChange6;
                        break;
                    }
                }
                IndirectPointerInputChange indirectPointerInputChange7 = indirectPointerInputChange;
                if (indirectPointerInputChange7 == null) {
                    e();
                } else {
                    state.e(indirectPointerInputChange7.getId());
                }
            } else {
                long jD = rbd.d(o(), iv5.j(indirectPointerInputChange5, this.node.getOrientationLock(), fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis())), DragGestureDetectorKt.w((p7e) cs1.a(this.node, CompositionLocalsKt.u()), j.INSTANCE.d()), false, 4, null);
                if ((9223372034707292159L & jD) != 9205357640488583168L) {
                    indirectPointerInputChange5.a();
                    IndirectPointerInputChange initialDown2 = state.getInitialDown();
                    Intrinsics.g(initialDown2);
                    t(initialDown2, indirectPointerInputChange5, fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()), jD);
                    s(indirectPointerInputChange5, fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()), jD);
                    i(indirectPointerInputChange5.getId());
                } else {
                    state.f(true);
                }
            }
        }
        if (pass == PointerEventPass.Final && state.getVerifyConsumptionInFinalPass()) {
            if (!indirectPointerInputChange5.getIsConsumed()) {
                state.f(false);
                return;
            }
            IndirectPointerInputChange initialDown3 = state.getInitialDown();
            if (initialDown3 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
            }
            long pointerId2 = state.getPointerId();
            rbd rbdVar2 = this.touchSlopDetector;
            if (rbdVar2 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
            f(initialDown3, pointerId2, rbdVar2);
        }
    }

    private final void l(ev5 indirectPointerInputEvent, PointerEventPass pass, DragDetectionState.c state) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        if (pass != PointerEventPass.Main) {
            return;
        }
        long pointerId = state.getPointerId();
        List<IndirectPointerInputChange> listB = indirectPointerInputEvent.b();
        int size = listB.size();
        int i = 0;
        while (true) {
            indirectPointerInputChange = null;
            if (i >= size) {
                indirectPointerInputChange2 = null;
                break;
            }
            indirectPointerInputChange2 = listB.get(i);
            if (se9.b(indirectPointerInputChange2.getId(), pointerId)) {
                break;
            } else {
                i++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange3 = indirectPointerInputChange2;
        if (indirectPointerInputChange3 == null) {
            return;
        }
        if (!iv5.h(indirectPointerInputChange3)) {
            if (indirectPointerInputChange3.getIsConsumed()) {
                r();
                return;
            } else {
                if (rn8.k(iv5.j(indirectPointerInputChange3, this.node.getOrientationLock(), fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()))) == 0.0f) {
                    return;
                }
                s(indirectPointerInputChange3, fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()), iv5.i(indirectPointerInputChange3, this.node.getOrientationLock(), fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis())));
                indirectPointerInputChange3.a();
                return;
            }
        }
        List<IndirectPointerInputChange> listB2 = indirectPointerInputEvent.b();
        int size2 = listB2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            IndirectPointerInputChange indirectPointerInputChange4 = listB2.get(i2);
            if (indirectPointerInputChange4.getPressed()) {
                indirectPointerInputChange = indirectPointerInputChange4;
                break;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange;
        if (indirectPointerInputChange5 != null) {
            state.b(indirectPointerInputChange5.getId());
            return;
        }
        if (indirectPointerInputChange3.getIsConsumed() || !iv5.h(indirectPointerInputChange3)) {
            r();
        } else {
            u(indirectPointerInputChange3, fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()));
        }
        e();
    }

    private final void n(ev5 indirectPointerInputEvent, PointerEventPass pass, DragDetectionState.AwaitDown state) {
        if (!indirectPointerInputEvent.b().isEmpty()) {
            List<IndirectPointerInputChange> listB = indirectPointerInputEvent.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                if (!iv5.g(listB.get(i))) {
                    return;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange = (IndirectPointerInputChange) m.z0(indirectPointerInputEvent.b());
            DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop = a.$EnumSwitchMapping$0[state.getAwaitTouchSlop().ordinal()] == 1 ? !this.node.getStartDragImmediately() ? DragDetectionState.AwaitDown.AwaitTouchSlop.Yes : DragDetectionState.AwaitDown.AwaitTouchSlop.No : state.getAwaitTouchSlop();
            state.c(awaitTouchSlop);
            if (pass == PointerEventPass.Initial && awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
                indirectPointerInputChange.a();
                state.d(true);
            }
            if (pass == PointerEventPass.Main) {
                if (awaitTouchSlop == DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                    h(this, indirectPointerInputChange, indirectPointerInputChange.getId(), 0L, false, 12, null);
                } else if (state.getConsumedOnInitial()) {
                    fv5 fv5VarD = fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis());
                    rn8.Companion companion = rn8.INSTANCE;
                    t(indirectPointerInputChange, indirectPointerInputChange, fv5VarD, companion.c());
                    s(indirectPointerInputChange, fv5.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()), companion.c());
                    i(indirectPointerInputChange.getId());
                }
            }
        }
    }

    private final rbd o() {
        rbd rbdVar = this.touchSlopDetector;
        if (rbdVar != null) {
            return rbdVar;
        }
        throw new IllegalArgumentException("Touch slop detector not initialized.");
    }

    private final w3e p() {
        w3e w3eVar = this.velocityTracker;
        if (w3eVar != null) {
            return w3eVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    private final void r() {
        this.node.O3(l.a.a);
    }

    private final void s(IndirectPointerInputChange change, fv5 primaryDirectionalMotionAxis, long dragAmount) {
        long j = ln6.j(y23.o(this.node));
        if (!rn8.j(this.previousPositionOnScreen, rn8.INSTANCE.b()) && !rn8.j(j, this.previousPositionOnScreen)) {
            this.nodeOffset = rn8.q(this.nodeOffset, rn8.p(j, this.previousPositionOnScreen));
        }
        this.previousPositionOnScreen = j;
        Orientation orientationLock = this.node.getOrientationLock();
        Intrinsics.g(orientationLock);
        if (Math.abs(DraggableKt.j(dragAmount, orientationLock)) > 2.0f) {
            iv5.f(p(), change, this.node.getOrientationLock(), primaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
            this.node.O3(new l.b(this.offsetSmoother.d(dragAmount), true, null));
        }
    }

    private final void t(IndirectPointerInputChange down, IndirectPointerInputChange slopTriggerChange, fv5 primaryDirectionalMotionAxis, long overSlopOffset) {
        if (this.velocityTracker == null) {
            this.velocityTracker = new w3e();
        }
        this.nodeOffset = rn8.INSTANCE.c();
        iv5.f(p(), down, this.node.getOrientationLock(), primaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
        long jP = rn8.p(iv5.l(slopTriggerChange, this.node.getOrientationLock(), primaryDirectionalMotionAxis), overSlopOffset);
        if (((Boolean) this.node.D3().invoke(j.f(j.INSTANCE.d()))).booleanValue()) {
            this.previousPositionOnScreen = ln6.j(y23.o(this.node));
            this.node.O3(new l.c(jP, null));
        }
        this.offsetSmoother.c();
    }

    private final void u(IndirectPointerInputChange change, fv5 primaryDirectionalMotionAxis) {
        iv5.f(p(), change, this.node.getOrientationLock(), primaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
        float fH = ((p7e) cs1.a(this.node, CompositionLocalsKt.u())).h();
        long jB = p().b(u3e.a(fH, fH));
        p().d();
        this.node.O3(new l.d(DraggableKt.l(jB), true, null));
    }

    public final void m(ev5 indirectPointerInputEvent, PointerEventPass pass) {
        if (this.currentDragState == null) {
            this.currentDragState = a();
        }
        DragDetectionState dragDetectionState = this.currentDragState;
        if (dragDetectionState == null) {
            throw new IllegalArgumentException("currentDragState should not be null");
        }
        if (dragDetectionState instanceof DragDetectionState.AwaitDown) {
            n(indirectPointerInputEvent, pass, (DragDetectionState.AwaitDown) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof DragDetectionState.b) {
            k(indirectPointerInputEvent, pass, (DragDetectionState.b) dragDetectionState);
        } else if (dragDetectionState instanceof DragDetectionState.a) {
            j(indirectPointerInputEvent, pass, (DragDetectionState.a) dragDetectionState);
        } else {
            if (!(dragDetectionState instanceof DragDetectionState.c)) {
                throw new NoWhenBranchMatchedException();
            }
            l(indirectPointerInputEvent, pass, (DragDetectionState.c) dragDetectionState);
        }
    }

    public final void q() {
        e();
        if (this.node.getIsListeningForEvents()) {
            r();
        }
        this.velocityTracker = null;
        this.offsetSmoother.c();
    }
}
