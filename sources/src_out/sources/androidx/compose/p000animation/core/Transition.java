package androidx.compose.p000animation.core;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import com.google.android.rw0;
import com.google.android.sh7;
import com.google.android.ta2;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kce;
import com.google.inputmethod.kd3;
import com.google.inputmethod.kr;
import com.google.inputmethod.l48;
import com.google.inputmethod.lmc;
import com.google.inputmethod.lr;
import com.google.inputmethod.o58;
import com.google.inputmethod.or;
import com.google.inputmethod.q6c;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.swb;
import com.google.inputmethod.tjd;
import com.google.inputmethod.tm9;
import com.google.inputmethod.ur;
import com.google.inputmethod.vn3;
import com.google.inputmethod.vr;
import com.google.inputmethod.w2c;
import com.google.inputmethod.xa4;
import com.google.inputmethod.y48;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004MIECB1\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010\u0012J'\u0010#\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\rH\u0007¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u00192\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00192\n\u0010%\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b(\u0010'J)\u0010+\u001a\u00020\u00192\u0018\u0010*\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u00102\u0018\u0010*\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0000H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00102\u0006\u0010!\u001a\u00028\u0000H\u0001¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\rH\u0000¢\u0006\u0004\b3\u0010\u001eJ\u0017\u00106\u001a\u00020\u00102\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0014H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0010H\u0000¢\u0006\u0004\b;\u0010\u0012J\u000f\u0010<\u001a\u00020\u0010H\u0000¢\u0006\u0004\b<\u0010\u0012J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020\u00102\u0018\u0010@\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030?R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010>R+\u0010!\u001a\u00028\u00002\u0006\u0010L\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u00100R7\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000R2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000R8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010N\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010\\\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010Y\u001a\u0004\bZ\u0010\u000f\"\u0004\b[\u0010\u001eR+\u0010^\u001a\u00020\r2\u0006\u0010L\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010Y\u001a\u0004\b]\u0010\u000f\"\u0004\b\u0001\u0010\u001eR+\u0010c\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00198B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010N\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR,\u0010g\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001e\u0010i\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR+\u0010m\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u00198G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010N\u001a\u0004\bk\u0010`\"\u0004\bl\u0010bR\"\u0010q\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010-\u001a\u0004\bo\u0010\u000f\"\u0004\bp\u0010\u001eR\u001b\u0010t\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010r\u001a\u0004\bs\u0010\u000fR\u0011\u0010v\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bu\u0010PR\u0011\u0010x\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bw\u0010`R$\u0010\"\u001a\u00020\r2\u0006\u0010y\u001a\u00020\r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010\u000f\"\u0004\b{\u0010\u001eR)\u0010\u007f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030)R\b\u0012\u0004\u0012\u00028\u00000\u00000|8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u001d\u0010\u0082\u0001\u001a\u00020\u00198FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0081\u0001\u0010\u0012\u001a\u0005\b\u0080\u0001\u0010`¨\u0006\u0084\u0001²\u0006\r\u0010\u0083\u0001\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "Landroidx/compose/animation/core/g;", "transitionState", "parentTransition", "", "label", "<init>", "(Landroidx/compose/animation/core/g;Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "(Landroidx/compose/animation/core/g;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "m", "()J", "", "C", "()V", "frameTimeNanos", "", "durationScale", "E", "(JF)V", "scaledPlayTimeNanos", "", "scaleToEnd", "F", "(JZ)V", "H", "(J)V", "D", "G", "targetState", "playTimeNanos", "M", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "transition", "g", "(Landroidx/compose/animation/core/Transition;)Z", "K", "Landroidx/compose/animation/core/Transition$d;", "animation", "f", "(Landroidx/compose/animation/core/Transition$d;)Z", "J", "(Landroidx/compose/animation/core/Transition$d;)V", "Y", "(Ljava/lang/Object;)V", "h", "(Ljava/lang/Object;Landroidx/compose/runtime/d;I)V", "N", "Landroidx/compose/animation/core/SeekableTransitionState$b;", "animationState", "O", "(Landroidx/compose/animation/core/SeekableTransitionState$b;)V", "fraction", "L", "(F)V", "n", "X", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$a;", "deferredAnimation", "I", "(Landroidx/compose/animation/core/Transition$a;)V", "a", "Landroidx/compose/animation/core/g;", "b", "Landroidx/compose/animation/core/Transition;", "getParentTransition", "()Landroidx/compose/animation/core/Transition;", "c", "Ljava/lang/String;", "r", "<set-?>", "d", "Lcom/google/android/o58;", "w", "()Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/Transition$b;", "e", "u", "()Landroidx/compose/animation/core/Transition$b;", "R", "(Landroidx/compose/animation/core/Transition$b;)V", "segment", "Lcom/google/android/y48;", "z", "V", "_playTimeNanos", "v", "startTimeNanos", "y", "()Z", "U", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "i", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_animations", "j", "_transitions", "k", "B", "Q", "isSeeking", "l", "s", "setLastSeekedTimeNanos$animation_core", "lastSeekedTimeNanos", "Lcom/google/android/q6c;", "x", "totalDurationNanos", "p", "currentState", "A", "isRunning", "value", "t", "P", "", "o", "()Ljava/util/List;", "animations", "q", "getHasInitialValueAnimations$annotations", "hasInitialValueAnimations", "runFrameLoop", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Transition<S> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final g<S> transitionState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Transition<?> parentTransition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o58 targetState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final o58 segment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final y48 _playTimeNanos;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final y48 startTimeNanos;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final o58 updateChildrenNeeded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final SnapshotStateList<Transition<S>.d<?, ?>> _animations;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final SnapshotStateList<Transition<?>> _transitions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final o58 isSeeking;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long lastSeekedTimeNanos;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final q6c totalDurationNanos;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0011B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJG\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR{\u0010$\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e2.\u0010\u001f\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b \u0010#¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/Transition$a;", "T", "Lcom/google/android/ur;", "V", "", "Lcom/google/android/tjd;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Lcom/google/android/tjd;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$b;", "Lcom/google/android/xa4;", "transitionSpec", "targetValueByState", "Lcom/google/android/q6c;", "a", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/google/android/q6c;", "", "d", "()V", "Lcom/google/android/tjd;", "getTypeConverter", "()Lcom/google/android/tjd;", "b", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$a$a;", "Landroidx/compose/animation/core/Transition;", "<set-?>", "c", "Lcom/google/android/o58;", "()Landroidx/compose/animation/core/Transition$a$a;", "(Landroidx/compose/animation/core/Transition$a$a;)V", "data", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a<T, V extends ur> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final tjd<T, V> typeConverter;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final o58 data = s0.e(null, null, 2, null);

        /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R:\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/animation/core/Transition$a$a;", "T", "Lcom/google/android/ur;", "V", "Lcom/google/android/q6c;", "Landroidx/compose/animation/core/Transition$d;", "Landroidx/compose/animation/core/Transition;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$b;", "Lcom/google/android/xa4;", "transitionSpec", "targetValueByState", "<init>", "(Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/core/Transition$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "segment", "", "u", "(Landroidx/compose/animation/core/Transition$b;)V", "a", "Landroidx/compose/animation/core/Transition$d;", "c", "()Landroidx/compose/animation/core/Transition$d;", "b", "Lkotlin/jvm/functions/Function1;", "m", "()Lkotlin/jvm/functions/Function1;", "t", "(Lkotlin/jvm/functions/Function1;)V", "g", "q", "getValue", "()Ljava/lang/Object;", "value", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class C0014a<T, V extends ur> implements q6c<T> {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Transition<S>.d<T, V> animation;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private Function1<? super b<S>, ? extends xa4<T>> transitionSpec;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private Function1<? super S, ? extends T> targetValueByState;

            public C0014a(Transition<S>.d<T, V> dVar, Function1<? super b<S>, ? extends xa4<T>> function1, Function1<? super S, ? extends T> function2) {
                this.animation = dVar;
                this.transitionSpec = function1;
                this.targetValueByState = function2;
            }

            public final Transition<S>.d<T, V> c() {
                return this.animation;
            }

            public final Function1<S, T> g() {
                return this.targetValueByState;
            }

            @Override // com.google.inputmethod.q6c
            public T getValue() {
                u(Transition.this.u());
                return this.animation.getValue();
            }

            public final Function1<b<S>, xa4<T>> m() {
                return this.transitionSpec;
            }

            public final void q(Function1<? super S, ? extends T> function1) {
                this.targetValueByState = function1;
            }

            public final void t(Function1<? super b<S>, ? extends xa4<T>> function1) {
                this.transitionSpec = function1;
            }

            public final void u(b<S> segment) {
                Object objInvoke = this.targetValueByState.invoke(segment.d());
                if (!Transition.this.B()) {
                    this.animation.T((T) objInvoke, (xa4) this.transitionSpec.invoke(segment));
                } else {
                    this.animation.R((T) this.targetValueByState.invoke(segment.g()), (T) objInvoke, (xa4) this.transitionSpec.invoke(segment));
                }
            }
        }

        public a(tjd<T, V> tjdVar, String str) {
            this.typeConverter = tjdVar;
            this.label = str;
        }

        public final q6c<T> a(Function1<? super b<S>, ? extends xa4<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
            Transition<S>.C0014a<T, V>.a<T, V> c0014aB = b();
            if (c0014aB == null) {
                Transition<S> transition = Transition.this;
                c0014aB = new C0014a<>(transition.new d(targetValueByState.invoke(transition.p()), or.i(this.typeConverter, targetValueByState.invoke(Transition.this.p())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                Transition<S> transition2 = Transition.this;
                c(c0014aB);
                transition2.f(c0014aB.c());
            }
            Transition<S> transition3 = Transition.this;
            c0014aB.q(targetValueByState);
            c0014aB.t(transitionSpec);
            c0014aB.u(transition3.u());
            return c0014aB;
        }

        public final Transition<S>.C0014a<T, V>.a<T, V> b() {
            return (C0014a) this.data.getValue();
        }

        public final void c(Transition<S>.C0014a<T, V>.a<T, V> c0014a) {
            this.data.setValue(c0014a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d() {
            Transition<S>.C0014a<T, V>.a<T, V> c0014aB = b();
            if (c0014aB != null) {
                Transition<S> transition = Transition.this;
                c0014aB.c().R(c0014aB.g().invoke(transition.u().g()), c0014aB.g().invoke(transition.u().d()), (xa4) c0014aB.m().invoke(transition.u()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$b;", "S", "", "targetState", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "initialState", "d", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b<S> {
        default boolean c(S s, S s2) {
            return Intrinsics.e(s, g()) && Intrinsics.e(s2, d());
        }

        S d();

        S g();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/Transition$c;", "S", "Landroidx/compose/animation/core/Transition$b;", "initialState", "targetState", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "b", "d", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c<S> implements b<S> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final S initialState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final S targetState;

        public c(S s, S s2) {
            this.initialState = s;
            this.targetState = s2;
        }

        @Override // androidx.compose.animation.core.Transition.b
        public S d() {
            return this.targetState;
        }

        public boolean equals(Object other) {
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.e(g(), bVar.g()) && Intrinsics.e(d(), bVar.d());
        }

        @Override // androidx.compose.animation.core.Transition.b
        public S g() {
            return this.initialState;
        }

        public int hashCode() {
            S sG = g();
            int iHashCode = (sG != null ? sG.hashCode() : 0) * 31;
            S sD = d();
            return iHashCode + (sD != null ? sD.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0000¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010&J%\u0010\u0001\u001a\u00020\u000f2\u0006\u0010'\u001a\u00028\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0000¢\u0006\u0004\b\u0001\u0010*J-\u0010+\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010'\u001a\u00028\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0000¢\u0006\u0004\b+\u0010,R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010&R+\u0010'\u001a\u00028\u00012\u0006\u00104\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R7\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010(2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010(8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BRC\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020C2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020C8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u00105\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010N\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010#R$\u0010Q\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR+\u0010W\u001a\u00020\r2\u0006\u00104\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bR\u00105\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010]\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001c8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010\u001fR\u0016\u0010`\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R+\u0010d\u001a\u00028\u00012\u0006\u00104\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\ba\u00105\u001a\u0004\bb\u00107\"\u0004\bc\u00109R\u0016\u0010f\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010eR+\u0010l\u001a\u00020\u00122\u0006\u00104\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010\u0018R\u0016\u0010n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010_R\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006r"}, d2 = {"Landroidx/compose/animation/core/Transition$d;", "T", "Lcom/google/android/ur;", "V", "Lcom/google/android/q6c;", "initialValue", "initialVelocityVector", "Lcom/google/android/tjd;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Lcom/google/android/ur;Lcom/google/android/tjd;Ljava/lang/String;)V", "", "isInterrupted", "", "P", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "scaleToEnd", "A", "(JZ)V", "G", "(J)V", "S", "()V", "B", "", "fraction", "F", "(F)V", "Landroidx/compose/animation/core/SeekableTransitionState$b;", "animationState", "L", "(Landroidx/compose/animation/core/SeekableTransitionState$b;)V", "c", "toString", "()Ljava/lang/String;", "targetValue", "Lcom/google/android/xa4;", "animationSpec", "(Ljava/lang/Object;Lcom/google/android/xa4;)V", "R", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/xa4;)V", "a", "Lcom/google/android/tjd;", "getTypeConverter", "()Lcom/google/android/tjd;", "b", "Ljava/lang/String;", "getLabel", "<set-?>", "Lcom/google/android/o58;", "w", "()Ljava/lang/Object;", "N", "(Ljava/lang/Object;)V", "Lcom/google/android/w2c;", "d", "Lcom/google/android/w2c;", "defaultSpring", "e", "m", "()Lcom/google/android/xa4;", "I", "(Lcom/google/android/xa4;)V", "Lcom/google/android/lmc;", "f", "g", "()Lcom/google/android/lmc;", "H", "(Lcom/google/android/lmc;)V", "animation", "Landroidx/compose/animation/core/SeekableTransitionState$b;", "t", "()Landroidx/compose/animation/core/SeekableTransitionState$b;", "setInitialValueState$animation_core", "initialValueState", "h", "Lcom/google/android/lmc;", "initialValueAnimation", "i", "x", "()Z", "K", "(Z)V", "isFinished", "j", "Lcom/google/android/l48;", "u", "()F", "M", "resetSnapValue", "k", "Z", "useOnlyInitialValue", "l", "getValue", "O", "value", "Lcom/google/android/ur;", "velocityVector", "n", "Lcom/google/android/y48;", "q", "()J", "J", "durationNanos", "o", "isSeeking", "p", "Lcom/google/android/xa4;", "interruptionSpec", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class d<T, V extends ur> implements q6c<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final tjd<T, V> typeConverter;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final o58 targetValue;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final w2c<T> defaultSpring;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final o58 animationSpec;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final o58 animation;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private SeekableTransitionState.b initialValueState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private lmc<T, V> initialValueAnimation;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final o58 isFinished;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final l48 resetSnapValue;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private boolean useOnlyInitialValue;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final o58 value;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private V velocityVector;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final y48 durationNanos;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private boolean isSeeking;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final xa4<T> interruptionSpec;

        public d(T t, V v, tjd<T, V> tjdVar, String str) {
            Object objInvoke;
            this.typeConverter = tjdVar;
            this.label = str;
            this.targetValue = s0.e(t, null, 2, null);
            w2c<T> w2cVarJ = lr.j(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = w2cVarJ;
            this.animationSpec = s0.e(w2cVarJ, null, 2, null);
            this.animation = s0.e(new lmc(m(), tjdVar, t, w(), v), null, 2, null);
            this.isFinished = s0.e(Boolean.TRUE, null, 2, null);
            this.resetSnapValue = tm9.a(-1.0f);
            this.value = s0.e(t, null, 2, null);
            this.velocityVector = v;
            this.durationNanos = swb.a(g().getDurationNanos());
            Float f = kce.h().get(tjdVar);
            if (f != null) {
                float fFloatValue = f.floatValue();
                ur urVar = (ur) tjdVar.a().invoke(t);
                int size = urVar.getSize();
                for (int i = 0; i < size; i++) {
                    urVar.e(i, fFloatValue);
                }
                objInvoke = this.typeConverter.b().invoke(urVar);
            } else {
                objInvoke = null;
            }
            this.interruptionSpec = lr.j(0.0f, 0.0f, objInvoke, 3, null);
        }

        private final void H(lmc<T, V> lmcVar) {
            this.animation.setValue(lmcVar);
        }

        private final void I(xa4<T> xa4Var) {
            this.animationSpec.setValue(xa4Var);
        }

        private final void N(T t) {
            this.targetValue.setValue(t);
        }

        private final void P(T initialValue, boolean isInterrupted) {
            lmc<T, V> lmcVar = this.initialValueAnimation;
            if (Intrinsics.e(lmcVar != null ? lmcVar.f() : null, w())) {
                H(new lmc<>(this.interruptionSpec, this.typeConverter, initialValue, initialValue, vr.g(this.velocityVector)));
                this.useOnlyInitialValue = true;
                J(g().getDurationNanos());
                return;
            }
            kr krVarM = (!isInterrupted || this.isSeeking || (m() instanceof w2c)) ? m() : this.interruptionSpec;
            if (Transition.this.t() > 0) {
                krVarM = lr.c(krVarM, Transition.this.t());
            }
            H(new lmc<>(krVarM, this.typeConverter, initialValue, w(), this.velocityVector));
            J(g().getDurationNanos());
            this.useOnlyInitialValue = false;
            Transition.this.C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void Q(d dVar, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            dVar.P(obj, z);
        }

        private final T w() {
            return this.targetValue.getValue();
        }

        public final void A(long playTimeNanos, boolean scaleToEnd) {
            if (scaleToEnd) {
                playTimeNanos = g().getDurationNanos();
            }
            O(g().e(playTimeNanos));
            this.velocityVector = (V) g().g(playTimeNanos);
            if (g().b(playTimeNanos)) {
                K(true);
            }
        }

        public final void B() {
            M(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void F(float fraction) {
            if (fraction != -4.0f && fraction != -5.0f) {
                M(fraction);
                return;
            }
            lmc<T, V> lmcVar = this.initialValueAnimation;
            if (lmcVar != null) {
                g().j(lmcVar.f());
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
            Object objI = fraction == -4.0f ? g().i() : g().f();
            g().j(objI);
            g().k(objI);
            O(objI);
            J(g().getDurationNanos());
        }

        public final void G(long playTimeNanos) {
            if (u() == -1.0f) {
                this.isSeeking = true;
                if (Intrinsics.e(g().f(), g().i())) {
                    O(g().f());
                } else {
                    O(g().e(playTimeNanos));
                    this.velocityVector = (V) g().g(playTimeNanos);
                }
            }
        }

        public final void J(long j) {
            this.durationNanos.C(j);
        }

        public final void K(boolean z) {
            this.isFinished.setValue(Boolean.valueOf(z));
        }

        public final void L(SeekableTransitionState.b animationState) {
            if (!Intrinsics.e(g().f(), g().i())) {
                this.initialValueAnimation = g();
                this.initialValueState = animationState;
            }
            H(new lmc<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), vr.g(this.velocityVector)));
            J(g().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void M(float f) {
            this.resetSnapValue.p(f);
        }

        public void O(T t) {
            this.value.setValue(t);
        }

        public final void R(T initialValue, T targetValue, xa4<T> animationSpec) {
            N(targetValue);
            I(animationSpec);
            if (Intrinsics.e(g().i(), initialValue) && Intrinsics.e(g().f(), targetValue)) {
                return;
            }
            Q(this, initialValue, false, 2, null);
        }

        public final void S() {
            lmc<T, V> lmcVar;
            SeekableTransitionState.b bVar = this.initialValueState;
            if (bVar == null || (lmcVar = this.initialValueAnimation) == null) {
                return;
            }
            long jE = sh7.e(bVar.getDurationNanos() * ((double) bVar.getValue()));
            T tE = lmcVar.e(jE);
            if (this.useOnlyInitialValue) {
                g().k(tE);
            }
            g().j(tE);
            J(g().getDurationNanos());
            if (u() == -2.0f || this.useOnlyInitialValue) {
                O(tE);
            } else {
                G(Transition.this.t());
            }
            if (jE < bVar.getDurationNanos()) {
                bVar.k(false);
            } else {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            }
        }

        public final void T(T targetValue, xa4<T> animationSpec) {
            if (this.useOnlyInitialValue) {
                lmc<T, V> lmcVar = this.initialValueAnimation;
                if (Intrinsics.e(targetValue, lmcVar != null ? lmcVar.f() : null)) {
                    return;
                }
            }
            if (Intrinsics.e(w(), targetValue) && u() == -1.0f) {
                return;
            }
            N(targetValue);
            I(animationSpec);
            P(u() == -3.0f ? targetValue : getValue(), !x());
            K(u() == -3.0f);
            if (u() >= 0.0f) {
                O(g().e((long) (g().getDurationNanos() * u())));
            } else if (u() == -3.0f) {
                O(targetValue);
            }
            this.useOnlyInitialValue = false;
            M(-1.0f);
        }

        public final void c() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public final lmc<T, V> g() {
            return (lmc) this.animation.getValue();
        }

        @Override // com.google.inputmethod.q6c
        public T getValue() {
            return this.value.getValue();
        }

        public final xa4<T> m() {
            return (xa4) this.animationSpec.getValue();
        }

        public final long q() {
            return this.durationNanos.getLongValue();
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final SeekableTransitionState.b getInitialValueState() {
            return this.initialValueState;
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + w() + ", spec: " + m();
        }

        public final float u() {
            return this.resetSnapValue.b();
        }

        public final boolean x() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/core/Transition$e", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements jd3 {
        @Override // com.google.inputmethod.jd3
        public void dispose() {
        }
    }

    public Transition(g<S> gVar, Transition<?> transition, String str) {
        this.transitionState = gVar;
        this.parentTransition = transition;
        this.label = str;
        this.targetState = s0.e(p(), null, 2, null);
        this.segment = s0.e(new c(p(), p()), null, 2, null);
        this._playTimeNanos = swb.a(0L);
        this.startTimeNanos = swb.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.updateChildrenNeeded = s0.e(bool, null, 2, null);
        this._animations = p0.f();
        this._transitions = p0.f();
        this.isSeeking = s0.e(bool, null, 2, null);
        this.totalDurationNanos = p0.e(new Function0() { // from class: com.google.android.red
            public final Object invoke() {
                return Long.valueOf(Transition.W(this.a));
            }
        });
        gVar.f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        U(true);
        if (B()) {
            SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                Transition<S>.d<?, ?> dVar = snapshotStateList.get(i);
                jMax = Math.max(jMax, dVar.q());
                dVar.G(this.lastSeekedTimeNanos);
            }
            U(false);
        }
    }

    private final void R(b<S> bVar) {
        this.segment.setValue(bVar);
    }

    private final void U(boolean z) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z));
    }

    private final void V(long j) {
        this._playTimeNanos.C(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long W(Transition transition) {
        return transition.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(Transition transition) {
        return !Intrinsics.e(transition.w(), transition.p()) || transition.A() || transition.y();
    }

    private static final boolean j(q6c<Boolean> q6cVar) {
        return q6cVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 k(ta2 ta2Var, Transition transition, kd3 kd3Var) {
        rw0.d(ta2Var, (CoroutineContext) null, CoroutineStart.d, new Transition$animateTo$1$1$1(transition, null), 1, (Object) null);
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Transition transition, Object obj, int i, androidx.compose.p004runtime.d dVar, int i2) {
        transition.h(obj, dVar, saa.a(i | 1));
        return Unit.a;
    }

    private final long m() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, snapshotStateList.get(i).q());
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i2).m());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean y() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    private final long z() {
        return this._playTimeNanos.getLongValue();
    }

    public final boolean A() {
        return v() != Long.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void D() {
        G();
        this.transitionState.g();
    }

    public final void E(long frameTimeNanos, float durationScale) {
        if (v() == Long.MIN_VALUE) {
            H(frameTimeNanos);
        }
        long jV = frameTimeNanos - v();
        if (durationScale != 0.0f) {
            jV = sh7.e(jV / ((double) durationScale));
        }
        P(jV);
        F(jV, durationScale == 0.0f);
    }

    public final void F(long scaledPlayTimeNanos, boolean scaleToEnd) {
        boolean z = true;
        if (v() == Long.MIN_VALUE) {
            H(scaledPlayTimeNanos);
        } else if (!this.transitionState.c()) {
            this.transitionState.e(true);
        }
        U(false);
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            Transition<S>.d<?, ?> dVar = snapshotStateList.get(i);
            if (!dVar.x()) {
                dVar.A(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!dVar.x()) {
                z = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition<?> transition = snapshotStateList2.get(i2);
            if (!Intrinsics.e(transition.w(), transition.p())) {
                transition.F(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!Intrinsics.e(transition.w(), transition.p())) {
                z = false;
            }
        }
        if (z) {
            G();
        }
    }

    public final void G() {
        S(Long.MIN_VALUE);
        g<S> gVar = this.transitionState;
        if (gVar instanceof androidx.compose.p000animation.core.e) {
            ((androidx.compose.p000animation.core.e) gVar).d(w());
        }
        P(0L);
        this.transitionState.e(false);
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).G();
        }
    }

    public final void H(long frameTimeNanos) {
        S(frameTimeNanos);
        this.transitionState.e(true);
    }

    public final void I(Transition<S>.a<?, ?> deferredAnimation) {
        Transition<S>.d<?, ?> dVarC;
        Transition<S>.C0014a<?, ?>.a<?, V> c0014aB = deferredAnimation.b();
        if (c0014aB == 0 || (dVarC = c0014aB.c()) == null) {
            return;
        }
        J(dVarC);
    }

    public final void J(Transition<S>.d<?, ?> animation) {
        this._animations.remove(animation);
    }

    public final boolean K(Transition<?> transition) {
        return this._transitions.remove(transition);
    }

    public final void L(float fraction) {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).F(fraction);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).L(fraction);
        }
    }

    public final void M(S initialState, S targetState, long playTimeNanos) {
        S(Long.MIN_VALUE);
        this.transitionState.e(false);
        if (!B() || !Intrinsics.e(p(), initialState) || !Intrinsics.e(w(), targetState)) {
            if (!Intrinsics.e(p(), initialState)) {
                g<S> gVar = this.transitionState;
                if (gVar instanceof androidx.compose.p000animation.core.e) {
                    ((androidx.compose.p000animation.core.e) gVar).d(initialState);
                }
            }
            T(targetState);
            Q(true);
            R(new c(initialState, targetState));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            Transition<?> transition = snapshotStateList.get(i);
            Intrinsics.h(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.B()) {
                transition.M(transition.p(), transition.w(), playTimeNanos);
            }
        }
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).G(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final void N(long playTimeNanos) {
        if (v() == Long.MIN_VALUE) {
            S(playTimeNanos);
        }
        P(playTimeNanos);
        U(false);
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).G(playTimeNanos);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition<?> transition = snapshotStateList2.get(i2);
            if (!Intrinsics.e(transition.w(), transition.p())) {
                transition.N(playTimeNanos);
            }
        }
    }

    public final void O(SeekableTransitionState.b animationState) {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).L(animationState);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).O(animationState);
        }
    }

    public final void P(long j) {
        if (this.parentTransition == null) {
            V(j);
        }
    }

    public final void Q(boolean z) {
        this.isSeeking.setValue(Boolean.valueOf(z));
    }

    public final void S(long j) {
        this.startTimeNanos.C(j);
    }

    public final void T(S s) {
        this.targetState.setValue(s);
    }

    public final void X() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).S();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).X();
        }
    }

    public final void Y(S targetState) {
        if (Intrinsics.e(w(), targetState)) {
            return;
        }
        R(new c(w(), targetState));
        if (!Intrinsics.e(p(), w())) {
            this.transitionState.d(w());
        }
        T(targetState);
        if (!A()) {
            U(true);
        }
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).B();
        }
    }

    public final boolean f(Transition<S>.d<?, ?> animation) {
        return this._animations.add(animation);
    }

    public final boolean g(Transition<?> transition) {
        return this._transitions.add(transition);
    }

    public final void h(final S s, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? dVarF.x(s) : dVarF.T(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(this) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1200)");
            }
            if (B()) {
                dVarF.y(467722849);
                dVarF.u();
            } else {
                dVarF.y(466062241);
                Y(s);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objR = dVarF.R();
                if (z || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = p0.e(new Function0() { // from class: com.google.android.oed
                        public final Object invoke() {
                            return Boolean.valueOf(Transition.i(this.a));
                        }
                    });
                    dVarF.L(objR);
                }
                if (j((q6c) objR)) {
                    dVarF.y(466470356);
                    Object objR2 = dVarF.R();
                    androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR2 == companion.a()) {
                        objR2 = vn3.k(EmptyCoroutineContext.a, dVarF);
                        dVarF.L(objR2);
                    }
                    final ta2 ta2Var = (ta2) objR2;
                    boolean zT = dVarF.T(ta2Var) | (i3 == 32);
                    Object objR3 = dVarF.R();
                    if (zT || objR3 == companion.a()) {
                        objR3 = new Function1() { // from class: com.google.android.ped
                            public final Object invoke(Object obj) {
                                return Transition.k(ta2Var, this, (kd3) obj);
                            }
                        };
                        dVarF.L(objR3);
                    }
                    vn3.b(ta2Var, this, (Function1) objR3, dVarF, i3);
                    dVarF.u();
                } else {
                    dVarF.y(467712929);
                    dVarF.u();
                }
                dVarF.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.qed
                public final Object invoke(Object obj, Object obj2) {
                    return Transition.l(this.a, s, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void n() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).c();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).n();
        }
    }

    public final List<Transition<S>.d<?, ?>> o() {
        return this._animations;
    }

    public final S p() {
        return this.transitionState.a();
    }

    public final boolean q() {
        SnapshotStateList<Transition<S>.d<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).getInitialValueState() != null) {
                return true;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (snapshotStateList2.get(i2).q()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    public final long t() {
        Transition<?> transition = this.parentTransition;
        return transition != null ? transition.t() : z();
    }

    public String toString() {
        List<Transition<S>.d<?, ?>> listO = o();
        int size = listO.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + listO.get(i) + ", ";
        }
        return str;
    }

    public final b<S> u() {
        return (b) this.segment.getValue();
    }

    public final long v() {
        return this.startTimeNanos.getLongValue();
    }

    public final S w() {
        return (S) this.targetState.getValue();
    }

    public final long x() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    public Transition(g<S> gVar, String str) {
        this(gVar, null, str);
    }

    public Transition(S s, String str) {
        this(new androidx.compose.p000animation.core.e(s), null, str);
    }
}
