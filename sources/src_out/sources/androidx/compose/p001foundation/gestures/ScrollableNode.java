package androidx.compose.p001foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.gestures.ScrollableNode;
import androidx.compose.p001foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.focus.g;
import androidx.compose.ui.focus.h;
import androidx.compose.ui.focus.j;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.aab;
import com.google.inputmethod.bab;
import com.google.inputmethod.bfb;
import com.google.inputmethod.cfb;
import com.google.inputmethod.dn;
import com.google.inputmethod.fu0;
import com.google.inputmethod.gba;
import com.google.inputmethod.hab;
import com.google.inputmethod.ii6;
import com.google.inputmethod.jab;
import com.google.inputmethod.nfb;
import com.google.inputmethod.qg4;
import com.google.inputmethod.r48;
import com.google.inputmethod.ri6;
import com.google.inputmethod.rn8;
import com.google.inputmethod.si6;
import com.google.inputmethod.tr8;
import com.google.inputmethod.up1;
import com.google.inputmethod.xi6;
import com.google.inputmethod.y23;
import com.google.inputmethod.zv8;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001dJ\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010\u001aJ@\u0010+\u001a\u00020\u00182.\u0010*\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00180&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180(\u0012\u0006\u0012\u0004\u0018\u00010)0%H\u0096@¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\"H\u0016¢\u0006\u0004\b.\u0010\u001aJ\u0017\u00101\u001a\u00020\u00182\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b3\u00104JU\u00105\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0018H\u0016¢\u0006\u0004\b7\u0010\u001dJ\u000f\u00108\u001a\u00020\u0018H\u0016¢\u0006\u0004\b8\u0010\u001dJ\u0017\u0010:\u001a\u00020\r2\u0006\u00100\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\r2\u0006\u00100\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010;J'\u0010C\u001a\u00020\u00182\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0013\u0010F\u001a\u00020\u0018*\u00020EH\u0016¢\u0006\u0004\bF\u0010GR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010N\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b8\u0010L\u001a\u0004\bM\u00104R\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR*\u0010j\u001a\u0016\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\r\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR4\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0(\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010x\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006y"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Lcom/google/android/xi6;", "Lcom/google/android/bfb;", "Lcom/google/android/tr8;", "Lcom/google/android/hab;", "state", "Lcom/google/android/zv8;", "overscrollEffect", "Lcom/google/android/qg4;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/fu0;", "bringIntoViewSpec", "<init>", "(Lcom/google/android/hab;Lcom/google/android/zv8;Lcom/google/android/qg4;Landroidx/compose/foundation/gestures/Orientation;ZZLcom/google/android/r48;Lcom/google/android/fu0;)V", "Lcom/google/android/t3e;", "velocity", "", "y4", "(J)V", "x4", "t4", "()V", "v4", "D4", "A4", "r4", "Lcom/google/android/rn8;", "delta", "b0", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/l$b;", "Lcom/google/android/q22;", "", "forEachDelta", "z3", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "startedPosition", "P3", "Landroidx/compose/foundation/gestures/l$d;", "event", "Q3", "(Landroidx/compose/foundation/gestures/l$d;)V", "h4", "()Z", "C4", "(Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/zv8;ZZLcom/google/android/qg4;Lcom/google/android/r48;Lcom/google/android/fu0;)V", "V2", "N", "Lcom/google/android/oi6;", "n2", "(Landroid/view/KeyEvent;)Z", "t0", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lcom/google/android/q16;", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "L", "Lcom/google/android/zv8;", "M", "Lcom/google/android/qg4;", "Z", "Q2", "shouldAutoInvalidate", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "O", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Lcom/google/android/bab;", "P", "Lcom/google/android/bab;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Q", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "R", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/ui/focus/g;", "S", "Landroidx/compose/ui/focus/g;", "focusTargetModifierNode", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "T", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "contentInViewNode", "", "U", "Lkotlin/jvm/functions/Function2;", "scrollByAction", "V", "scrollByOffsetAction", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "W", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "mouseWheelScrollingLogic", "Landroidx/compose/foundation/gestures/TrackpadScrollingLogic;", "X", "Landroidx/compose/foundation/gestures/TrackpadScrollingLogic;", "trackpadScrollingLogic", "Lcom/google/android/aab;", "Y", "Lcom/google/android/aab;", "scrollableContainerNode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScrollableNode extends DragGestureNode implements xi6, bfb, tr8 {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private zv8 overscrollEffect;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private qg4 flingBehavior;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final NestedScrollDispatcher nestedScrollDispatcher;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final bab defaultFlingBehavior;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final ScrollingLogic scrollingLogic;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final ScrollableNestedScrollConnection nestedScrollConnection;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final g focusTargetModifierNode;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final ContentInViewNode contentInViewNode;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private Function2<? super Float, ? super Float, Boolean> scrollByAction;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private Function2<? super rn8, ? super q22<? super rn8>, ? extends Object> scrollByOffsetAction;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private MouseWheelScrollingLogic mouseWheelScrollingLogic;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private TrackpadScrollingLogic trackpadScrollingLogic;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private aab scrollableContainerNode;

    public ScrollableNode(hab habVar, zv8 zv8Var, qg4 qg4Var, Orientation orientation, boolean z, boolean z2, r48 r48Var, fu0 fu0Var) {
        super(ScrollableKt.f(), z, r48Var, orientation);
        this.overscrollEffect = zv8Var;
        this.flingBehavior = qg4Var;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        bab babVarA = jab.a();
        this.defaultFlingBehavior = babVarA;
        zv8 zv8Var2 = this.overscrollEffect;
        qg4 qg4Var2 = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(habVar, zv8Var2, qg4Var2 == null ? babVarA : qg4Var2, orientation, z2, nestedScrollDispatcher, this, new Function0() { // from class: com.google.android.eab
            public final Object invoke() {
                return Boolean.valueOf(ScrollableNode.z4(this.a));
            }
        });
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        this.focusTargetModifierNode = (g) m3(h.b(j.INSTANCE.b(), null, 2, null));
        ContentInViewNode contentInViewNode = (ContentInViewNode) m3(new ContentInViewNode(orientation, scrollingLogic, z2, fu0Var, new Function0() { // from class: com.google.android.fab
            public final Object invoke() {
                return ScrollableNode.s4(this.a);
            }
        }));
        this.contentInViewNode = contentInViewNode;
        m3(NestedScrollNodeKt.c(scrollableNestedScrollConnection, nestedScrollDispatcher));
        m3(new BringIntoViewResponderNode(contentInViewNode));
        if (up1.isDelayPressesUsingGestureConsumptionEnabled) {
            return;
        }
        this.scrollableContainerNode = (aab) m3(new aab(z));
    }

    private final void A4() {
        this.scrollByAction = new Function2() { // from class: com.google.android.gab
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(ScrollableNode.B4(this.a, ((Float) obj).floatValue(), ((Float) obj2).floatValue()));
            }
        };
        this.scrollByOffsetAction = new ScrollableNode$setScrollSemanticsActions$2(this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B4(ScrollableNode scrollableNode, float f, float f2) {
        rw0.d(scrollableNode.L2(), (CoroutineContext) null, (CoroutineStart) null, new ScrollableNode$setScrollSemanticsActions$1$1(scrollableNode, f, f2, null), 3, (Object) null);
        return true;
    }

    private final void D4() {
        if (getIsAttached()) {
            this.defaultFlingBehavior.d(y23.m(this));
        }
    }

    private final void r4() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gba s4(ScrollableNode scrollableNode) {
        return h.c(scrollableNode.focusTargetModifierNode);
    }

    private final void t4() {
        if (this.mouseWheelScrollingLogic == null) {
            this.mouseWheelScrollingLogic = new MouseWheelScrollingLogic(this.scrollingLogic, dn.a(this), new ScrollableNode$ensureMouseWheelScrollingLogicInitialized$1(this), y23.m(this));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.A(L2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object u4(ScrollableNode scrollableNode, long j, q22 q22Var) {
        scrollableNode.y4(j);
        return Unit.a;
    }

    private final void v4() {
        if (this.trackpadScrollingLogic == null) {
            this.trackpadScrollingLogic = new TrackpadScrollingLogic(this.scrollingLogic, new ScrollableNode$ensureTrackpadScrollingLogicInitialized$1(this), y23.m(this));
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.u(L2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object w4(ScrollableNode scrollableNode, long j, q22 q22Var) {
        scrollableNode.x4(j);
        return Unit.a;
    }

    private final void x4(long velocity) {
        rw0.d(this.nestedScrollDispatcher.e(), (CoroutineContext) null, (CoroutineStart) null, new ScrollableNode$onTrackpadScrollStopped$1(this, velocity, null), 3, (Object) null);
    }

    private final void y4(long velocity) {
        rw0.d(this.nestedScrollDispatcher.e(), (CoroutineContext) null, (CoroutineStart) null, new ScrollableNode$onWheelScrollStopped$1(this, velocity, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z4(ScrollableNode scrollableNode) {
        return scrollableNode.getIsAttached();
    }

    public final void C4(hab state, Orientation orientation, zv8 overscrollEffect, boolean enabled, boolean reverseDirection, qg4 flingBehavior, r48 interactionSource, fu0 bringIntoViewSpec) {
        boolean z;
        if (getEnabled() != enabled) {
            this.nestedScrollConnection.a(enabled);
            aab aabVar = this.scrollableContainerNode;
            if (aabVar != null) {
                aabVar.n3(enabled);
            }
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean zK = this.scrollingLogic.K(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.H3(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        j4(ScrollableKt.f(), enabled, interactionSource, this.scrollingLogic.v() ? Orientation.Vertical : Orientation.Horizontal, zK);
        if (z2) {
            r4();
            cfb.d(this);
        }
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            A4();
        }
        Function2<? super Float, ? super Float, Boolean> function2 = this.scrollByAction;
        if (function2 != null) {
            SemanticsPropertiesKt.T(nfbVar, null, function2, 1, null);
        }
        Function2<? super rn8, ? super q22<? super rn8>, ? extends Object> function3 = this.scrollByOffsetAction;
        if (function3 != null) {
            SemanticsPropertiesKt.U(nfbVar, function3);
        }
    }

    @Override // com.google.inputmethod.x23, com.google.inputmethod.bf9
    public void N() {
        K0();
        D4();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.g(y23.m(this));
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.g(y23.m(this));
        }
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public void P3(long startedPosition) {
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public void Q3(l.d event) {
        rw0.d(this.nestedScrollDispatcher.e(), (CoroutineContext) null, (CoroutineStart) null, new ScrollableNode$onDragStopped$1(event, this, null), 3, (Object) null);
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        D4();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.g(y23.m(this));
        }
        TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
        if (trackpadScrollingLogic != null) {
            trackpadScrollingLogic.g(y23.m(this));
        }
    }

    @Override // com.google.inputmethod.tr8
    public void b0(long delta) {
        if (getIsAttached()) {
            y23.e(this, delta);
        }
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: h4 */
    public boolean getStartDragImmediately() {
        return this.scrollingLogic.C();
    }

    @Override // com.google.inputmethod.xi6
    public boolean n2(KeyEvent event) {
        long jE;
        if (!getEnabled()) {
            return false;
        }
        long jA = si6.a(event);
        ii6.Companion companion = ii6.INSTANCE;
        if ((!ii6.T(jA, companion.H()) && !ii6.T(si6.a(event), companion.I())) || !ri6.e(si6.b(event), ri6.INSTANCE.a()) || si6.e(event)) {
            return false;
        }
        if (this.scrollingLogic.v()) {
            int iA3 = (int) (this.contentInViewNode.A3() & 4294967295L);
            jE = rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ii6.T(si6.a(event), companion.I()) ? iA3 : -iA3)) & 4294967295L));
        } else {
            int iA4 = (int) (this.contentInViewNode.A3() >> 32);
            jE = rn8.e((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(ii6.T(si6.a(event), companion.I()) ? iA4 : -iA4)) << 32));
        }
        rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new ScrollableNode$onKeyEvent$1(this, jE, null), 3, (Object) null);
        return true;
    }

    @Override // com.google.inputmethod.xi6
    public boolean t0(KeyEvent event) {
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.p001foundation.gestures.DragGestureNode, com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) throws NoWhenBranchMatchedException {
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) D3().invoke(androidx.compose.ui.input.pointer.j.f(listC.get(i).getType()))).booleanValue()) {
                super.x1(pointerEvent, pass, bounds);
                break;
            }
        }
        H3();
        if (getEnabled()) {
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            if (pass == pointerEventPass && androidx.compose.ui.input.pointer.g.o(pointerEvent.getType(), androidx.compose.ui.input.pointer.g.INSTANCE.l())) {
                t4();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.z(pointerEvent, pass, bounds);
            }
            if (pass == pointerEventPass) {
                int type = pointerEvent.getType();
                androidx.compose.ui.input.pointer.g.Companion companion = androidx.compose.ui.input.pointer.g.INSTANCE;
                if (androidx.compose.ui.input.pointer.g.o(type, companion.f()) || androidx.compose.ui.input.pointer.g.o(pointerEvent.getType(), companion.e()) || androidx.compose.ui.input.pointer.g.o(pointerEvent.getType(), companion.d())) {
                    v4();
                }
            }
            TrackpadScrollingLogic trackpadScrollingLogic = this.trackpadScrollingLogic;
            if (trackpadScrollingLogic != null) {
                trackpadScrollingLogic.t(pointerEvent, pass, bounds);
            }
        }
    }

    @Override // androidx.compose.p001foundation.gestures.DragGestureNode
    public Object z3(Function2<? super Function1<? super l.b, Unit>, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object objB = scrollingLogic.B(MutatePriority.UserInput, new ScrollableNode$drag$2$1(function2, scrollingLogic, null), q22Var);
        return objB == a.g() ? objB : Unit.a;
    }
}
