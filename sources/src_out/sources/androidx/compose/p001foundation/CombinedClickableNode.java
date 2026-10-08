package androidx.compose.p001foundation;

import android.view.KeyEvent;
import androidx.compose.p001foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.e;
import androidx.compose.ui.input.pointer.f;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import com.google.android.rw0;
import com.google.inputmethod.IndirectPointerInputChange;
import com.google.inputmethod.av5;
import com.google.inputmethod.bs1;
import com.google.inputmethod.c65;
import com.google.inputmethod.cfb;
import com.google.inputmethod.cs1;
import com.google.inputmethod.e65;
import com.google.inputmethod.ev5;
import com.google.inputmethod.gmc;
import com.google.inputmethod.hpa;
import com.google.inputmethod.iv5;
import com.google.inputmethod.nfb;
import com.google.inputmethod.p7e;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.si6;
import com.google.inputmethod.ugc;
import com.google.inputmethod.up1;
import com.google.inputmethod.w48;
import com.google.inputmethod.wgc;
import com.google.inputmethod.y97;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0083\u0001B\u007f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010'J}\u0010)\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u0004*\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010#\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010#\u001a\u00020.H\u0014¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0004H\u0014¢\u0006\u0004\b2\u0010'J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010'J\u0017\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00042\u0006\u00105\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000204H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000208H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\"H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010'J\u0017\u0010H\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\"H\u0002¢\u0006\u0004\bJ\u0010FJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0004H\u0002¢\u0006\u0004\bN\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010MR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020^0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\\R\u001a\u0010c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\f\n\u0004\ba\u0010U\u0012\u0004\bb\u0010'R\u0018\u0010f\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010hR\u0016\u0010l\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010UR\u0016\u0010n\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010UR\u0016\u0010q\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010UR\u0018\u0010v\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010hR\u0018\u0010z\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010hR\u0016\u0010|\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010UR\u0016\u0010~\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010UR\u0017\u0010\u0080\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010pR\u0018\u0010\u0082\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010U¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode;", "Lcom/google/android/bs1;", "Landroidx/compose/foundation/AbstractClickableNode;", "Lkotlin/Function0;", "", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "", "hapticFeedbackEnabled", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/av5;", "indicationNodeFactory", "useLocalIndication", "enabled", "onClickLabel", "Lcom/google/android/hpa;", "role", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLcom/google/android/r48;Lcom/google/android/av5;ZZLjava/lang/String;Lcom/google/android/hpa;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/wgc;", "G3", "()Lcom/google/android/wgc;", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lcom/google/android/q16;", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Lcom/google/android/ev5;", "event", "p2", "(Lcom/google/android/ev5;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "K0", "()V", "z2", "I4", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/google/android/r48;Lcom/google/android/av5;ZZLjava/lang/String;Lcom/google/android/hpa;)V", "Lcom/google/android/nfb;", "E3", "(Lcom/google/android/nfb;)V", "Lcom/google/android/oi6;", "a4", "(Landroid/view/KeyEvent;)Z", "b4", "Z3", "X2", "Landroidx/compose/ui/input/pointer/i;", "down", "A4", "(Landroidx/compose/ui/input/pointer/i;)V", "Lcom/google/android/hv5;", "B4", "(Lcom/google/android/hv5;)V", "", "uptimeMillis", "downChange", "E4", "(JLandroidx/compose/ui/input/pointer/i;)V", "F4", "(JLcom/google/android/hv5;)V", "D4", "(Landroidx/compose/ui/input/pointer/e;J)V", "indirectPointerEvent", "C4", "(Lcom/google/android/ev5;)V", "z4", "w4", "(Landroidx/compose/ui/input/pointer/e;)V", "x4", "indirectPointer", "v4", "(Z)V", "G4", "Q", "Ljava/lang/String;", "R", "Lkotlin/jvm/functions/Function0;", "S", "T", "Z", "y4", "()Z", "H4", "Lcom/google/android/w48;", "Lkotlinx/coroutines/s;", "U", "Lcom/google/android/w48;", "longKeyPressJobs", "Landroidx/compose/foundation/CombinedClickableNode$a;", "V", "doubleKeyClickStates", "W", "isSuspendingPointerInputEnabled$annotations", "isSuspendingPointerInputEnabled", "X", "Landroidx/compose/ui/input/pointer/i;", "downEvent", "Y", "Lkotlinx/coroutines/s;", "longPressJob", "tapJob", "a0", "isSecondTap", "b0", "longPressTriggered", "c0", "J", "firstTapUpTime", "d0", "ignoreNextUp", "e0", "Lcom/google/android/hv5;", "indirectDownEvent", "f0", "indirectLongPressJob", "g0", "indirectTapJob", "h0", "indirectIsSecondTap", "i0", "indirectLongPressTriggered", "j0", "indirectFirstTapUpTime", "k0", "indirectIgnoreNextUp", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class CombinedClickableNode extends AbstractClickableNode implements bs1 {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private String onLongClickLabel;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private Function0<Unit> onLongClick;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private Function0<Unit> onDoubleClick;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private boolean hapticFeedbackEnabled;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final w48<s> longKeyPressJobs;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final w48<a> doubleKeyClickStates;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final boolean isSuspendingPointerInputEnabled;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private PointerInputChange downEvent;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private s longPressJob;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private s tapJob;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private boolean isSecondTap;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private boolean longPressTriggered;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private long firstTapUpTime;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private boolean ignoreNextUp;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private IndirectPointerInputChange indirectDownEvent;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private s indirectLongPressJob;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private s indirectTapJob;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private boolean indirectIsSecondTap;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private boolean indirectLongPressTriggered;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private long indirectFirstTapUpTime;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private boolean indirectIgnoreNextUp;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/CombinedClickableNode$a;", "", "Lkotlinx/coroutines/s;", "job", "<init>", "(Lkotlinx/coroutines/s;)V", "a", "Lkotlinx/coroutines/s;", "b", "()Lkotlinx/coroutines/s;", "", "Z", "()Z", "c", "(Z)V", "doubleTapMinTimeMillisElapsed", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final s job;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private boolean doubleTapMinTimeMillisElapsed;

        public a(s sVar) {
            this.job = sVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final s getJob() {
            return this.job;
        }

        public final void c(boolean z) {
            this.doubleTapMinTimeMillisElapsed = z;
        }
    }

    public /* synthetic */ CombinedClickableNode(Function0 function0, String str, Function0 function1, Function0 function2, boolean z, r48 r48Var, av5 av5Var, boolean z2, boolean z3, String str2, hpa hpaVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, str, function1, function2, z, r48Var, av5Var, z2, z3, str2, hpaVar);
    }

    private final void A4(PointerInputChange down) {
        down.a();
        this.downEvent = down;
        if (getEnabled()) {
            s sVar = this.tapJob;
            if (sVar != null && sVar.b()) {
                if (down.getUptimeMillis() - this.firstTapUpTime < ((p7e) cs1.a(this, CompositionLocalsKt.u())).a()) {
                    this.ignoreNextUp = true;
                    return;
                }
                this.isSecondTap = true;
                s sVar2 = this.tapJob;
                if (sVar2 != null) {
                    s.a.a(sVar2, (CancellationException) null, 1, (Object) null);
                }
                this.tapJob = null;
            }
            this.longPressTriggered = false;
            if (up1.isDelayPressesUsingGestureConsumptionEnabled) {
                U3(down);
            } else {
                W3(down.getPosition(), false);
            }
            if (this.onLongClick != null) {
                this.longPressJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0154CombinedClickableNode$handleDownEvent$1(this, null), 3, (Object) null);
            }
        }
    }

    private final void B4(IndirectPointerInputChange down) {
        down.a();
        this.indirectDownEvent = down;
        if (getEnabled()) {
            s sVar = this.indirectTapJob;
            if (sVar != null && sVar.b()) {
                if (down.getUptimeMillis() - this.indirectFirstTapUpTime < ((p7e) cs1.a(this, CompositionLocalsKt.u())).a()) {
                    this.indirectIgnoreNextUp = true;
                    return;
                }
                this.indirectIsSecondTap = true;
                s sVar2 = this.indirectTapJob;
                if (sVar2 != null) {
                    s.a.a(sVar2, (CancellationException) null, 1, (Object) null);
                }
                this.indirectTapJob = null;
            }
            this.indirectLongPressTriggered = false;
            if (up1.isDelayPressesUsingGestureConsumptionEnabled) {
                V3(down);
            } else {
                W3(down.getPosition(), true);
            }
            if (this.onLongClick != null) {
                this.indirectLongPressJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0155CombinedClickableNode$handleDownEvent$2(this, null), 3, (Object) null);
            }
        }
    }

    private final void C4(ev5 indirectPointerEvent) {
        float fC = ((p7e) cs1.a(this, CompositionLocalsKt.u())).c();
        List<IndirectPointerInputChange> listB = indirectPointerEvent.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            IndirectPointerInputChange indirectPointerInputChange = listB.get(i);
            long position = indirectPointerInputChange.getPosition();
            IndirectPointerInputChange indirectPointerInputChange2 = this.indirectDownEvent;
            Intrinsics.g(indirectPointerInputChange2);
            boolean z = Math.abs(rn8.k(rn8.p(position, indirectPointerInputChange2.getPosition()))) > fC;
            if (indirectPointerInputChange.getIsConsumed() || z) {
                v4(true);
                return;
            }
        }
    }

    private final void D4(e pointerEvent, long bounds) {
        long jO3 = O3(bounds);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = listC.get(i);
            if (pointerInputChange.q() || f.f(pointerInputChange, bounds, jO3)) {
                v4(false);
                return;
            }
        }
    }

    private final void E4(long uptimeMillis, PointerInputChange downChange) {
        if (getEnabled() && !this.ignoreNextUp) {
            T3(downChange.getPosition(), false);
            this.firstTapUpTime = uptimeMillis;
            if (!this.longPressTriggered) {
                if (this.isSecondTap) {
                    Function0<Unit> function0 = this.onDoubleClick;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if (this.onDoubleClick != null) {
                    this.tapJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0156CombinedClickableNode$handleUpEvent$1(this, null), 3, (Object) null);
                } else {
                    P3().invoke();
                }
            }
        }
        this.downEvent = null;
        this.ignoreNextUp = false;
        this.isSecondTap = false;
        s sVar = this.longPressJob;
        if (sVar != null) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.longPressJob = null;
        this.longPressTriggered = false;
    }

    private final void F4(long uptimeMillis, IndirectPointerInputChange downChange) {
        if (getEnabled() && !this.indirectIgnoreNextUp) {
            T3(downChange.getPosition(), true);
            this.indirectFirstTapUpTime = uptimeMillis;
            if (!this.indirectLongPressTriggered) {
                if (this.indirectIsSecondTap) {
                    Function0<Unit> function0 = this.onDoubleClick;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if (this.onDoubleClick != null) {
                    this.indirectTapJob = rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0157CombinedClickableNode$handleUpEvent$2(this, null), 3, (Object) null);
                } else {
                    P3().invoke();
                }
            }
        }
        this.indirectDownEvent = null;
        this.indirectIgnoreNextUp = false;
        this.indirectIsSecondTap = false;
        s sVar = this.indirectLongPressJob;
        if (sVar != null) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.indirectLongPressJob = null;
        this.indirectLongPressTriggered = false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[LOOP:0: B:5:0x0018->B:15:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:2: B:20:0x0065->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0056 A[EDGE_INSN: B:34:0x0056->B:17:0x0056 BREAK  A[LOOP:0: B:5:0x0018->B:15:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[EDGE_INSN: B:39:0x0099->B:31:0x0099 BREAK  A[LOOP:2: B:20:0x0065->B:30:0x0096], SYNTHETIC] */
    private final void G4() {
        long j;
        long j2;
        long j3;
        w48<s> w48Var = this.longKeyPressJobs;
        Object[] objArr = w48Var.values;
        long[] jArr = w48Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr[i];
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j4 & 255) < 128) {
                            s.a.a((s) objArr[(i << 3) + i3], (CancellationException) null, 1, (Object) null);
                        }
                        j4 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        w48Var.g();
        w48<a> w48Var2 = this.doubleKeyClickStates;
        Object[] objArr2 = w48Var2.values;
        long[] jArr2 = w48Var2.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr2[i4];
                if ((((~j5) << 7) & j5 & j3) == j3) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j5 & j2) < j) {
                            s.a.a(((a) objArr2[(i4 << 3) + i6]).getJob(), (CancellationException) null, 1, (Object) null);
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        w48Var2.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u4(CombinedClickableNode combinedClickableNode) {
        Function0<Unit> function0 = combinedClickableNode.onLongClick;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    private final void v4(boolean indirectPointer) {
        if (indirectPointer) {
            this.indirectDownEvent = null;
            s sVar = this.indirectLongPressJob;
            if (sVar != null) {
                s.a.a(sVar, (CancellationException) null, 1, (Object) null);
            }
            this.indirectLongPressJob = null;
            s sVar2 = this.indirectTapJob;
            if (sVar2 != null) {
                s.a.a(sVar2, (CancellationException) null, 1, (Object) null);
            }
            this.indirectTapJob = null;
            this.indirectIsSecondTap = false;
            this.indirectLongPressTriggered = false;
            this.indirectFirstTapUpTime = -1L;
            this.indirectIgnoreNextUp = false;
        } else {
            this.downEvent = null;
            s sVar3 = this.longPressJob;
            if (sVar3 != null) {
                s.a.a(sVar3, (CancellationException) null, 1, (Object) null);
            }
            this.longPressJob = null;
            s sVar4 = this.tapJob;
            if (sVar4 != null) {
                s.a.a(sVar4, (CancellationException) null, 1, (Object) null);
            }
            this.tapJob = null;
            this.isSecondTap = false;
            this.longPressTriggered = false;
            this.firstTapUpTime = -1L;
            this.ignoreNextUp = false;
        }
        R3(indirectPointer);
    }

    private final void w4(e pointerEvent) {
        if (this.downEvent == null || this.longPressTriggered) {
            return;
        }
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            PointerInputChange pointerInputChange = listC.get(i);
            if (pointerInputChange.q() && !Intrinsics.e(pointerInputChange, this.downEvent)) {
                v4(false);
                return;
            }
        }
    }

    private final void x4(ev5 indirectPointerEvent) {
        if (this.indirectDownEvent == null || this.indirectLongPressTriggered) {
            return;
        }
        List<IndirectPointerInputChange> listB = indirectPointerEvent.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            IndirectPointerInputChange indirectPointerInputChange = listB.get(i);
            if (indirectPointerInputChange.getIsConsumed() && !Intrinsics.e(indirectPointerInputChange, this.indirectDownEvent)) {
                v4(true);
                return;
            }
        }
    }

    private final void z4() {
        if (this.longPressTriggered || !getEnabled() || this.onLongClick == null) {
            return;
        }
        s sVar = this.longPressJob;
        if (sVar != null) {
            s.a.a(sVar, (CancellationException) null, 1, (Object) null);
        }
        this.longPressJob = null;
        Function0<Unit> function0 = this.onLongClick;
        if (function0 != null) {
            function0.invoke();
        }
        if (this.hapticFeedbackEnabled) {
            ((c65) cs1.a(this, CompositionLocalsKt.k())).a(e65.INSTANCE.f());
        }
        this.longPressTriggered = true;
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    public void E3(nfb nfbVar) {
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.C(nfbVar, this.onLongClickLabel, new Function0() { // from class: androidx.compose.foundation.g
                public final Object invoke() {
                    return Boolean.valueOf(CombinedClickableNode.u4(this.a));
                }
            });
        }
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    public wgc G3() {
        if (this.isSuspendingPointerInputEnabled) {
            return ugc.a(new CombinedClickableNode$createPointerInputNodeIfNeeded$1(this));
        }
        return null;
    }

    public final void H4(boolean z) {
        this.hapticFeedbackEnabled = z;
    }

    public final void I4(Function0<Unit> onClick, String onLongClickLabel, Function0<Unit> onLongClick, Function0<Unit> onDoubleClick, r48 interactionSource, av5 indicationNodeFactory, boolean useLocalIndication, boolean enabled, String onClickLabel, hpa role) {
        boolean z;
        if (!Intrinsics.e(this.onLongClickLabel, onLongClickLabel)) {
            this.onLongClickLabel = onLongClickLabel;
            cfb.d(this);
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            K3();
            cfb.d(this);
            z = true;
        } else {
            z = false;
        }
        this.onLongClick = onLongClick;
        if ((this.onDoubleClick == null) != (onDoubleClick == null)) {
            z = true;
        }
        this.onDoubleClick = onDoubleClick;
        if (getEnabled() != enabled) {
            z = true;
        }
        h4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, onClickLabel, role, onClick);
        if (z) {
            f4();
            v4(false);
            v4(true);
        }
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode, com.google.inputmethod.bf9
    public void K0() {
        super.K0();
        v4(false);
    }

    @Override // androidx.compose.ui.b.c
    public void X2() {
        super.X2();
        G4();
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    protected void Z3() {
        G4();
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    protected boolean a4(KeyEvent event) {
        boolean z;
        long jA = si6.a(event);
        if (this.onLongClick == null || this.longKeyPressJobs.b(jA) != null) {
            z = false;
        } else {
            this.longKeyPressJobs.q(jA, rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0158CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3, (Object) null));
            z = true;
        }
        a aVarB = this.doubleKeyClickStates.b(jA);
        if (aVarB != null) {
            if (aVarB.getJob().b()) {
                s.a.a(aVarB.getJob(), (CancellationException) null, 1, (Object) null);
                if (!aVarB.getDoubleTapMinTimeMillisElapsed()) {
                    P3().invoke();
                    this.doubleKeyClickStates.n(jA);
                    return z;
                }
            } else {
                this.doubleKeyClickStates.n(jA);
            }
        }
        return z;
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode
    protected boolean b4(KeyEvent event) {
        Function0<Unit> function0;
        long jA = si6.a(event);
        boolean z = false;
        if (this.longKeyPressJobs.b(jA) != null) {
            s sVarB = this.longKeyPressJobs.b(jA);
            if (sVarB != null) {
                if (sVarB.b()) {
                    s.a.a(sVarB, (CancellationException) null, 1, (Object) null);
                } else {
                    z = true;
                }
            }
            this.longKeyPressJobs.n(jA);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.b(jA) != null) {
                if (!z && (function0 = this.onDoubleClick) != null) {
                    function0.invoke();
                }
                this.doubleKeyClickStates.n(jA);
            } else if (!z) {
                this.doubleKeyClickStates.q(jA, new a(rw0.d(L2(), (CoroutineContext) null, (CoroutineStart) null, new C0159CombinedClickableNode$onClickKeyUpEvent$2(this, jA, null), 3, (Object) null)));
            }
        } else if (!z) {
            P3().invoke();
        }
        return true;
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode, com.google.inputmethod.mv5
    public void p2(ev5 event, PointerEventPass pass) {
        super.p2(event, pass);
        if (pass != PointerEventPass.Main) {
            if (pass == PointerEventPass.Final) {
                x4(event);
                return;
            }
            return;
        }
        if (this.indirectDownEvent == null) {
            List<IndirectPointerInputChange> listB = event.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                if (iv5.g(listB.get(i))) {
                    B4(event.b().get(0));
                    return;
                }
            }
            return;
        }
        if (!this.indirectLongPressTriggered) {
            List<IndirectPointerInputChange> listB2 = event.b();
            int size2 = listB2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!ClickableKt.j(listB2.get(i2))) {
                    C4(event);
                    return;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange = event.b().get(0);
            indirectPointerInputChange.a();
            long uptimeMillis = indirectPointerInputChange.getUptimeMillis();
            IndirectPointerInputChange indirectPointerInputChange2 = this.indirectDownEvent;
            Intrinsics.g(indirectPointerInputChange2);
            F4(uptimeMillis, indirectPointerInputChange2);
            return;
        }
        List<IndirectPointerInputChange> listB3 = event.b();
        int size3 = listB3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            if (!ClickableKt.k(listB3.get(i3))) {
                List<IndirectPointerInputChange> listB4 = event.b();
                int size4 = listB4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    listB4.get(i4).a();
                }
                return;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange3 = event.b().get(0);
        indirectPointerInputChange3.a();
        long uptimeMillis2 = indirectPointerInputChange3.getUptimeMillis();
        IndirectPointerInputChange indirectPointerInputChange4 = this.indirectDownEvent;
        Intrinsics.g(indirectPointerInputChange4);
        F4(uptimeMillis2, indirectPointerInputChange4);
    }

    @Override // androidx.compose.p001foundation.AbstractClickableNode, com.google.inputmethod.bf9
    public void x1(e pointerEvent, PointerEventPass pass, long bounds) {
        super.x1(pointerEvent, pass, bounds);
        if (this.isSuspendingPointerInputEnabled) {
            return;
        }
        if (pass != PointerEventPass.Main) {
            if (pass == PointerEventPass.Final) {
                w4(pointerEvent);
                return;
            }
            return;
        }
        if (this.downEvent == null) {
            if (TapGestureDetectorKt.k(pointerEvent, true, false, 2, null)) {
                A4(pointerEvent.c().get(0));
                return;
            }
            return;
        }
        if (gmc.b(pointerEvent)) {
            z4();
        }
        if (!this.longPressTriggered) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i = 0; i < size; i++) {
                if (!f.c(listC.get(i))) {
                    D4(pointerEvent, bounds);
                    return;
                }
            }
            PointerInputChange pointerInputChange = pointerEvent.c().get(0);
            pointerInputChange.a();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            PointerInputChange pointerInputChange2 = this.downEvent;
            Intrinsics.g(pointerInputChange2);
            E4(uptimeMillis, pointerInputChange2);
            return;
        }
        List<PointerInputChange> listC2 = pointerEvent.c();
        int size2 = listC2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!f.d(listC2.get(i2))) {
                List<PointerInputChange> listC3 = pointerEvent.c();
                int size3 = listC3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    listC3.get(i3).a();
                }
                return;
            }
        }
        PointerInputChange pointerInputChange3 = pointerEvent.c().get(0);
        pointerInputChange3.a();
        long uptimeMillis2 = pointerInputChange3.getUptimeMillis();
        PointerInputChange pointerInputChange4 = this.downEvent;
        Intrinsics.g(pointerInputChange4);
        E4(uptimeMillis2, pointerInputChange4);
    }

    /* JADX INFO: renamed from: y4, reason: from getter */
    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    @Override // com.google.inputmethod.mv5
    public void z2() {
        v4(true);
    }

    private CombinedClickableNode(Function0<Unit> function0, String str, Function0<Unit> function1, Function0<Unit> function2, boolean z, r48 r48Var, av5 av5Var, boolean z2, boolean z3, String str2, hpa hpaVar) {
        super(r48Var, av5Var, z2, z3, str2, hpaVar, function0, null);
        this.onLongClickLabel = str;
        this.onLongClick = function1;
        this.onDoubleClick = function2;
        this.hapticFeedbackEnabled = z;
        this.longKeyPressJobs = y97.a();
        this.doubleKeyClickStates = y97.a();
        this.isSuspendingPointerInputEnabled = !up1.isNonSuspendingPointerInputInCombinedClickableEnabled;
        this.firstTapUpTime = -1L;
        this.indirectFirstTapUpTime = -1L;
    }
}
