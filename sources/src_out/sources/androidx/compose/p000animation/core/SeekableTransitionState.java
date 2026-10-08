package androidx.compose.p000animation.core;

import androidx.compose.p000animation.core.SeekableTransitionState;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.j;
import androidx.compose.p004runtime.w;
import com.google.android.a68;
import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.sh7;
import com.google.android.x58;
import com.google.inputmethod.e58;
import com.google.inputmethod.f3e;
import com.google.inputmethod.gi9;
import com.google.inputmethod.l48;
import com.google.inputmethod.o58;
import com.google.inputmethod.qr;
import com.google.inputmethod.t04;
import com.google.inputmethod.tm9;
import com.google.inputmethod.xa4;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import kotlinx.coroutines.e;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 s*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002*/B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0017\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00028\u00002\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001eH\u0086@¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0010¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010\bJ\u000f\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010\bR+\u0010\u0017\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010\u0005R+\u00101\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\b/\u0010,\"\u0004\b0\u0010\u0005R\"\u00105\u001a\u00028\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00102\u001a\u0004\b3\u0010,\"\u0004\b4\u0010\u0005R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010=\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010?R.\u0010I\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a8G@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\b8\u0010L\"\u0004\bM\u0010NR*\u0010V\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001a\u0010\\\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u00108R\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\r0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR \u0010m\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR \u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010l¨\u0006t"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/g;", "initialState", "<init>", "(Ljava/lang/Object;)V", "", "E", "()V", "Q", "(Lcom/google/android/q22;)Ljava/lang/Object;", "D", "z", "Landroidx/compose/animation/core/SeekableTransitionState$b;", "animation", "", "deltaPlayTimeNanos", "O", "(Landroidx/compose/animation/core/SeekableTransitionState$b;J)V", "b0", "a0", "L", "T", "targetState", "Z", "(Ljava/lang/Object;Lcom/google/android/q22;)Ljava/lang/Object;", "", "fraction", "R", "(FLjava/lang/Object;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/xa4;", "animationSpec", "B", "(Ljava/lang/Object;Lcom/google/android/xa4;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Transition;", "transition", "f", "(Landroidx/compose/animation/core/Transition;)V", "g", "M", "N", "<set-?>", "b", "Lcom/google/android/o58;", "()Ljava/lang/Object;", "Y", "c", "a", "d", "currentState", "Ljava/lang/Object;", "G", "U", "composedTargetState", "e", "Landroidx/compose/animation/core/Transition;", "J", "K", "()J", "setTotalDurationNanos$animation_core", "(J)V", "totalDurationNanos", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "recalculateTotalDurationNanos", "Landroidx/compose/runtime/snapshots/j;", "value", "h", "Landroidx/compose/runtime/snapshots/j;", "getSnapshotStateObserver$animation_core", "()Landroidx/compose/runtime/snapshots/j;", "X", "(Landroidx/compose/runtime/snapshots/j;)V", "snapshotStateObserver", "i", "Lcom/google/android/l48;", "()F", "W", "(F)V", "Lcom/google/android/g41;", "j", "Lcom/google/android/g41;", "H", "()Lcom/google/android/g41;", "V", "(Lcom/google/android/g41;)V", "compositionContinuation", "Lcom/google/android/x58;", "k", "Lcom/google/android/x58;", "I", "()Lcom/google/android/x58;", "compositionContinuationMutex", "Landroidx/compose/animation/core/MutatorMutex;", "l", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "m", "lastFrameTimeNanos", "Lcom/google/android/e58;", "n", "Lcom/google/android/e58;", "initialValueAnimations", "o", "Landroidx/compose/animation/core/SeekableTransitionState$b;", "currentAnimation", "Lkotlin/Function1;", "p", "Lkotlin/jvm/functions/Function1;", "firstFrameLambda", "q", "F", "durationScale", "r", "animateOneFrameLambda", "s", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SeekableTransitionState<S> extends g<S> {
    private static final a s = new a(null);
    public static final int t = 8;
    private static final qr u = new qr(0.0f);
    private static final qr v = new qr(1.0f);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 targetState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 currentState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private S composedTargetState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Transition<S> transition;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long totalDurationNanos;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Function0<Unit> recalculateTotalDurationNanos;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private j snapshotStateObserver;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final l48 fraction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private g41<? super S> compositionContinuation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final x58 compositionContinuationMutex;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long lastFrameTimeNanos;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final e58<b> initialValueAnimations;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private b currentAnimation;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Function1<Long, Unit> firstFrameLambda;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float durationScale;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Function1<Long, Unit> animateOneFrameLambda;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$a;", "", "<init>", "()V", "Lcom/google/android/qr;", "ZeroVelocity", "Lcom/google/android/qr;", "b", "()Lcom/google/android/qr;", "Target1", "a", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qr a() {
            return SeekableTransitionState.v;
        }

        public final qr b() {
            return SeekableTransitionState.u;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010.\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b \u0010)\"\u0004\b-\u0010+R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b/\u0010\rR\"\u00102\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b1\u0010\r¨\u00063"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "a", "J", "e", "()J", "n", "(J)V", "progressNanos", "Lcom/google/android/f3e;", "Lcom/google/android/qr;", "b", "Lcom/google/android/f3e;", "()Lcom/google/android/f3e;", "i", "(Lcom/google/android/f3e;)V", "animationSpec", "", "c", "Z", "h", "()Z", "k", "(Z)V", "isComplete", "", "d", "F", "g", "()F", "o", "(F)V", "value", "Lcom/google/android/qr;", "f", "()Lcom/google/android/qr;", "setStart", "(Lcom/google/android/qr;)V", "start", "m", "initialVelocity", "l", "durationNanos", "j", "animationSpecDuration", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private long progressNanos;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private f3e<qr> animationSpec;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isComplete;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private float value;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private qr start = new qr(0.0f);

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private qr initialVelocity;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private long durationNanos;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private long animationSpecDuration;

        public final f3e<qr> a() {
            return this.animationSpec;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getDurationNanos() {
            return this.durationNanos;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final qr getInitialVelocity() {
            return this.initialVelocity;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final long getProgressNanos() {
            return this.progressNanos;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final qr getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final void i(f3e<qr> f3eVar) {
            this.animationSpec = f3eVar;
        }

        public final void j(long j) {
            this.animationSpecDuration = j;
        }

        public final void k(boolean z) {
            this.isComplete = z;
        }

        public final void l(long j) {
            this.durationNanos = j;
        }

        public final void m(qr qrVar) {
            this.initialVelocity = qrVar;
        }

        public final void n(long j) {
            this.progressNanos = j;
        }

        public final void o(float f) {
            this.value = f;
        }

        public String toString() {
            return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
        }
    }

    public SeekableTransitionState(S s2) {
        super(null);
        this.targetState = s0.e(s2, null, 2, null);
        this.currentState = s0.e(s2, null, 2, null);
        this.composedTargetState = s2;
        this.recalculateTotalDurationNanos = new Function0() { // from class: com.google.android.ecb
            public final Object invoke() {
                return SeekableTransitionState.P(this.a);
            }
        };
        this.fraction = tm9.a(0.0f);
        this.compositionContinuationMutex = a68.b(false, 1, (Object) null);
        this.mutatorMutex = new MutatorMutex();
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        this.initialValueAnimations = new e58<>(0, 1, null);
        this.firstFrameLambda = new Function1() { // from class: com.google.android.fcb
            public final Object invoke(Object obj) {
                return SeekableTransitionState.F(this.a, ((Long) obj).longValue());
            }
        };
        this.animateOneFrameLambda = new Function1() { // from class: com.google.android.gcb
            public final Object invoke(Object obj) {
                return SeekableTransitionState.A(this.a, ((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(SeekableTransitionState seekableTransitionState, long j) {
        long j2 = j - seekableTransitionState.lastFrameTimeNanos;
        seekableTransitionState.lastFrameTimeNanos = j;
        long jE = sh7.e(j2 / ((double) seekableTransitionState.durationScale));
        if (seekableTransitionState.initialValueAnimations.h()) {
            e58<b> e58Var = seekableTransitionState.initialValueAnimations;
            Object[] objArr = e58Var.content;
            int i = e58Var._size;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                b bVar = (b) objArr[i3];
                seekableTransitionState.O(bVar, jE);
                bVar.k(true);
            }
            Transition<S> transition = seekableTransitionState.transition;
            if (transition != null) {
                transition.X();
            }
            e58<b> e58Var2 = seekableTransitionState.initialValueAnimations;
            int i4 = e58Var2._size;
            Object[] objArr2 = e58Var2.content;
            IntRange intRangeA = g.A(0, i4);
            int iF = intRangeA.f();
            int i5 = intRangeA.i();
            if (iF <= i5) {
                while (true) {
                    objArr2[iF - i2] = objArr2[iF];
                    if (((b) objArr2[iF]).getIsComplete()) {
                        i2++;
                    }
                    if (iF == i5) {
                        break;
                    }
                    iF++;
                }
            }
            f.A(objArr2, (Object) null, i4 - i2, i4);
            e58Var2._size -= i2;
        }
        b bVar2 = seekableTransitionState.currentAnimation;
        if (bVar2 != null) {
            bVar2.l(seekableTransitionState.totalDurationNanos);
            seekableTransitionState.O(bVar2, jE);
            seekableTransitionState.W(bVar2.getValue());
            if (bVar2.getValue() == 1.0f) {
                seekableTransitionState.currentAnimation = null;
            }
            seekableTransitionState.T();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object C(SeekableTransitionState seekableTransitionState, Object obj, xa4 xa4Var, q22 q22Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = seekableTransitionState.b();
        }
        if ((i & 2) != 0) {
            xa4Var = null;
        }
        return seekableTransitionState.B(obj, xa4Var, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D(q22<? super Unit> q22Var) {
        if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
            Object objC = w.c(this.firstFrameLambda, q22Var);
            return objC == kotlin.coroutines.intrinsics.a.g() ? objC : Unit.a;
        }
        Object objZ = z(q22Var);
        return objZ == kotlin.coroutines.intrinsics.a.g() ? objZ : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        Transition<S> transition = this.transition;
        if (transition != null) {
            transition.n();
        }
        this.initialValueAnimations.u();
        if (this.currentAnimation != null) {
            this.currentAnimation = null;
            W(1.0f);
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(SeekableTransitionState seekableTransitionState, long j) {
        seekableTransitionState.lastFrameTimeNanos = j;
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        b bVar = this.currentAnimation;
        if (bVar == null) {
            if (this.totalDurationNanos <= 0 || J() == 1.0f || Intrinsics.e(a(), b())) {
                bVar = null;
            } else {
                bVar = new b();
                bVar.o(J());
                long j = this.totalDurationNanos;
                bVar.l(j);
                bVar.j(sh7.e(j * (1.0d - ((double) J()))));
                bVar.getStart().e(0, J());
            }
        }
        if (bVar != null) {
            bVar.l(this.totalDurationNanos);
            this.initialValueAnimations.n(bVar);
            transition.O(bVar);
        }
        this.currentAnimation = null;
    }

    private final void O(b animation, long deltaPlayTimeNanos) {
        long progressNanos = animation.getProgressNanos() + deltaPlayTimeNanos;
        animation.n(progressNanos);
        long animationSpecDuration = animation.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            animation.o(1.0f);
            return;
        }
        f3e<qr> f3eVarA = animation.a();
        if (f3eVarA == null) {
            float f = progressNanos / animationSpecDuration;
            animation.o((animation.getStart().a(0) * (1 - f)) + (f * 1.0f));
        } else {
            qr start = animation.getStart();
            qr qrVar = v;
            qr initialVelocity = animation.getInitialVelocity();
            if (initialVelocity == null) {
                initialVelocity = u;
            }
            animation.o(g.n(((qr) f3eVarA.g(progressNanos, start, qrVar, initialVelocity)).a(0), 0.0f, 1.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(SeekableTransitionState seekableTransitionState) {
        Transition<S> transition = seekableTransitionState.transition;
        seekableTransitionState.totalDurationNanos = transition != null ? transition.x() : 0L;
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(q22<? super Unit> q22Var) {
        SeekableTransitionState$runAnimations$1 seekableTransitionState$runAnimations$1;
        if (q22Var instanceof SeekableTransitionState$runAnimations$1) {
            seekableTransitionState$runAnimations$1 = (SeekableTransitionState$runAnimations$1) q22Var;
            int i = seekableTransitionState$runAnimations$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                seekableTransitionState$runAnimations$1.label = i - t04.INVALID_ID;
            } else {
                seekableTransitionState$runAnimations$1 = new SeekableTransitionState$runAnimations$1(this, q22Var);
            }
        } else {
            seekableTransitionState$runAnimations$1 = new SeekableTransitionState$runAnimations$1(this, q22Var);
        }
        Object obj = seekableTransitionState$runAnimations$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = seekableTransitionState$runAnimations$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            if (this.initialValueAnimations.g() && this.currentAnimation == null) {
                return Unit.a;
            }
            if (SuspendAnimationKt.E(seekableTransitionState$runAnimations$1.getContext()) == 0.0f) {
                E();
                this.lastFrameTimeNanos = Long.MIN_VALUE;
                return Unit.a;
            }
            if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
                Function1<Long, Unit> function1 = this.firstFrameLambda;
                seekableTransitionState$runAnimations$1.label = 1;
                if (w.c(function1, seekableTransitionState$runAnimations$1) != objG) {
                }
            }
            return objG;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        do {
            if (!this.initialValueAnimations.h() && this.currentAnimation == null) {
                this.lastFrameTimeNanos = Long.MIN_VALUE;
                return Unit.a;
            }
            seekableTransitionState$runAnimations$1.label = 2;
        } while (z(seekableTransitionState$runAnimations$1) != objG);
        return objG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object S(SeekableTransitionState seekableTransitionState, float f, Object obj, q22 q22Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = seekableTransitionState.b();
        }
        return seekableTransitionState.R(f, obj, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        Transition<S> transition = this.transition;
        if (transition == null) {
            return;
        }
        transition.N(sh7.e(((double) J()) * transition.x()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(float f) {
        this.fraction.p(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a0(q22<? super Unit> q22Var) {
        SeekableTransitionState$waitForComposition$1 seekableTransitionState$waitForComposition$1;
        Object objB;
        Object obj;
        if (q22Var instanceof SeekableTransitionState$waitForComposition$1) {
            seekableTransitionState$waitForComposition$1 = (SeekableTransitionState$waitForComposition$1) q22Var;
            int i = seekableTransitionState$waitForComposition$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                seekableTransitionState$waitForComposition$1.label = i - t04.INVALID_ID;
            } else {
                seekableTransitionState$waitForComposition$1 = new SeekableTransitionState$waitForComposition$1(this, q22Var);
            }
        } else {
            seekableTransitionState$waitForComposition$1 = new SeekableTransitionState$waitForComposition$1(this, q22Var);
        }
        Object obj2 = seekableTransitionState$waitForComposition$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = seekableTransitionState$waitForComposition$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj2);
            objB = b();
            x58 x58Var = this.compositionContinuationMutex;
            seekableTransitionState$waitForComposition$1.L$0 = objB;
            seekableTransitionState$waitForComposition$1.label = 1;
            if (x58.a.a(x58Var, (Object) null, seekableTransitionState$waitForComposition$1, 1, (Object) null) != objG) {
            }
            return objG;
        }
        if (i2 == 1) {
            Object obj3 = seekableTransitionState$waitForComposition$1.L$0;
            kotlin.f.b(obj2);
            objB = obj3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = seekableTransitionState$waitForComposition$1.L$0;
            kotlin.f.b(obj2);
        }
        if (Intrinsics.e(obj2, obj)) {
            return Unit.a;
        }
        this.lastFrameTimeNanos = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        seekableTransitionState$waitForComposition$1.L$0 = objB;
        seekableTransitionState$waitForComposition$1.label = 2;
        e eVar = new e(kotlin.coroutines.intrinsics.a.d(seekableTransitionState$waitForComposition$1), 1);
        eVar.G();
        V(eVar);
        x58.a.c(getCompositionContinuationMutex(), (Object) null, 1, (Object) null);
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(seekableTransitionState$waitForComposition$1);
        }
        if (objY != objG) {
            obj = objB;
            obj2 = objY;
            if (Intrinsics.e(obj2, obj)) {
                return Unit.a;
            }
            this.lastFrameTimeNanos = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return objG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0095, please report this as an issue */
    public final Object b0(q22<? super Unit> q22Var) {
        SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 seekableTransitionState$waitForCompositionAfterTargetStateChange$1;
        Object objB;
        Object obj;
        if (q22Var instanceof SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = (SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) q22Var;
            int i = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = i - t04.INVALID_ID;
            } else {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = new SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(this, q22Var);
            }
        } else {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = new SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(this, q22Var);
        }
        Object obj2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj2);
            objB = b();
            x58 x58Var = this.compositionContinuationMutex;
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0 = objB;
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = 1;
            if (x58.a.a(x58Var, (Object) null, seekableTransitionState$waitForCompositionAfterTargetStateChange$1, 1, (Object) null) != objG) {
            }
            return objG;
        }
        if (i2 == 1) {
            Object obj3 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0;
            kotlin.f.b(obj2);
            objB = obj3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0;
            kotlin.f.b(obj2);
        }
        if (!Intrinsics.e(obj2, obj)) {
            this.lastFrameTimeNanos = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return Unit.a;
        if (!Intrinsics.e(objB, this.composedTargetState)) {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.L$0 = objB;
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1.label = 2;
            e eVar = new e(kotlin.coroutines.intrinsics.a.d(seekableTransitionState$waitForCompositionAfterTargetStateChange$1), 1);
            eVar.G();
            V(eVar);
            x58.a.c(getCompositionContinuationMutex(), (Object) null, 1, (Object) null);
            Object objY = eVar.y();
            if (objY == kotlin.coroutines.intrinsics.a.g()) {
                oq2.c(seekableTransitionState$waitForCompositionAfterTargetStateChange$1);
            }
            if (objY != objG) {
                obj = objB;
                obj2 = objY;
                if (!Intrinsics.e(obj2, obj)) {
                    this.lastFrameTimeNanos = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return objG;
        }
        x58.a.c(this.compositionContinuationMutex, (Object) null, 1, (Object) null);
        return Unit.a;
    }

    private final Object z(q22<? super Unit> q22Var) {
        float fE = SuspendAnimationKt.E(q22Var.getContext());
        if (fE <= 0.0f) {
            E();
            return Unit.a;
        }
        this.durationScale = fE;
        Object objC = w.c(this.animateOneFrameLambda, q22Var);
        return objC == kotlin.coroutines.intrinsics.a.g() ? objC : Unit.a;
    }

    public final Object B(S s2, xa4<Float> xa4Var, q22<? super Unit> q22Var) {
        Object objE;
        Transition<S> transition = this.transition;
        return (transition != null && (objE = MutatorMutex.e(this.mutatorMutex, null, new SeekableTransitionState$animateTo$2(transition, this, s2, xa4Var, null), q22Var, 1, null)) == kotlin.coroutines.intrinsics.a.g()) ? objE : Unit.a;
    }

    public final S G() {
        return this.composedTargetState;
    }

    public final g41<S> H() {
        return this.compositionContinuation;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final x58 getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    public final float J() {
        return this.fraction.b();
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    public final void M() {
        j jVar = this.snapshotStateObserver;
        if (jVar != null) {
            jVar.k(this, TransitionKt.a, this.recalculateTotalDurationNanos);
        }
    }

    public final void N() {
        long j = this.totalDurationNanos;
        M();
        long j2 = this.totalDurationNanos;
        if (j != j2) {
            b bVar = this.currentAnimation;
            if (bVar == null) {
                if (j2 != 0) {
                    T();
                    return;
                }
                return;
            }
            long progressNanos = bVar.getProgressNanos();
            long j3 = this.totalDurationNanos;
            if (progressNanos > j3) {
                E();
                return;
            }
            bVar.l(j3);
            if (bVar.a() == null) {
                bVar.j(sh7.e((1.0d - ((double) bVar.getStart().a(0))) * this.totalDurationNanos));
            }
        }
    }

    public final Object R(float f, S s2, q22<? super Unit> q22Var) {
        boolean z = false;
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        }
        if (!z) {
            gi9.a("Expecting fraction between 0 and 1. Got " + f);
        }
        Transition<S> transition = this.transition;
        if (transition == null) {
            return Unit.a;
        }
        Object objE = MutatorMutex.e(this.mutatorMutex, null, new SeekableTransitionState$seekTo$3(s2, b(), this, transition, f, null), q22Var, 1, null);
        return objE == kotlin.coroutines.intrinsics.a.g() ? objE : Unit.a;
    }

    public final void U(S s2) {
        this.composedTargetState = s2;
    }

    public final void V(g41<? super S> g41Var) {
        this.compositionContinuation = g41Var;
    }

    public final void X(j jVar) {
        if (Intrinsics.e(this.snapshotStateObserver, jVar)) {
            return;
        }
        j jVar2 = this.snapshotStateObserver;
        if (jVar2 != null) {
            jVar2.g(this);
        }
        j jVar3 = this.snapshotStateObserver;
        if (jVar3 != null) {
            jVar3.r();
        }
        this.snapshotStateObserver = jVar;
        if (jVar != null) {
            jVar.q();
        }
        M();
    }

    public void Y(S s2) {
        this.targetState.setValue(s2);
    }

    public final Object Z(S s2, q22<? super Unit> q22Var) {
        Object objE;
        Transition<S> transition = this.transition;
        if (transition == null) {
            return Unit.a;
        }
        return (!(Intrinsics.e(a(), s2) && Intrinsics.e(b(), s2)) && (objE = MutatorMutex.e(this.mutatorMutex, null, new SeekableTransitionState$snapTo$2(this, s2, transition, null), q22Var, 1, null)) == kotlin.coroutines.intrinsics.a.g()) ? objE : Unit.a;
    }

    @Override // androidx.compose.p000animation.core.g
    public S a() {
        return (S) this.currentState.getValue();
    }

    @Override // androidx.compose.p000animation.core.g
    public S b() {
        return (S) this.targetState.getValue();
    }

    @Override // androidx.compose.p000animation.core.g
    public void d(S s2) {
        this.currentState.setValue(s2);
    }

    @Override // androidx.compose.p000animation.core.g
    public void f(Transition<S> transition) {
        Transition<S> transition2 = this.transition;
        if (!(transition2 == null || Intrinsics.e(transition, transition2))) {
            gi9.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.transition + ", new instance: " + transition);
        }
        this.transition = transition;
    }

    @Override // androidx.compose.p000animation.core.g
    public void g() {
        this.transition = null;
        j jVar = this.snapshotStateObserver;
        if (jVar != null) {
            jVar.g(this);
        }
    }
}
