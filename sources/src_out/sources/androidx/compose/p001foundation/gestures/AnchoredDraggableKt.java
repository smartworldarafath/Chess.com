package androidx.compose.p001foundation.gestures;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import androidx.compose.p001foundation.gestures.AnchoredDraggableKt;
import androidx.compose.p001foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.ui.input.pointer.j;
import com.google.android.q22;
import com.google.android.r43;
import com.google.android.ut0;
import com.google.inputmethod.bwb;
import com.google.inputmethod.dg3;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fg3;
import com.google.inputmethod.kr;
import com.google.inputmethod.omc;
import com.google.inputmethod.qg4;
import com.google.inputmethod.r48;
import com.google.inputmethod.rg;
import com.google.inputmethod.t04;
import com.google.inputmethod.tg;
import com.google.inputmethod.vq2;
import com.google.inputmethod.xq2;
import com.google.inputmethod.zg4;
import com.google.inputmethod.zv8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a[\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u0000*\u00020\u00102\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0016\u0010\u0017\u001aw\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0018\u001a\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001f2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\"\u0010#\u001aT\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010$\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010(\u001a\u00028\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dH\u0082@¢\u0006\u0004\b)\u0010*\u001aP\u0010,\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010+\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00192\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0086@¢\u0006\u0004\b,\u0010-\u001aQ\u0010/\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010.\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0002¢\u0006\u0004\b/\u00100\u001a\u001b\u00102\u001a\u00020\u0019*\u00020\u00192\u0006\u00101\u001a\u00020\u0019H\u0002¢\u0006\u0004\b2\u00103\u001aH\u00109\u001a\u00020\u0013\"\u0004\b\u0000\u001042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\"\u00108\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001307\u0012\u0006\u0012\u0004\u0018\u00010\u001006H\u0082@¢\u0006\u0004\b9\u0010:\u001a\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;\"\u0004\b\u0000\u0010\u0000H\u0002¢\u0006\u0004\b<\u0010=\u001aM\u0010A\u001a\u00020@\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010?\u001a\u00020>2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dH\u0000¢\u0006\u0004\bA\u0010B\u001aE\u0010D\u001a\u00020C\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0002¢\u0006\u0004\bD\u0010E\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00190\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010H\"\u001a\u0010R\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, d2 = {"T", "Landroidx/compose/ui/b;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/zv8;", "overscrollEffect", "Lcom/google/android/qg4;", "flingBehavior", "q", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLcom/google/android/r48;Lcom/google/android/zv8;Lcom/google/android/qg4;)Landroidx/compose/ui/b;", "", "Lkotlin/Function1;", "Lcom/google/android/fg3;", "", "builder", "Lcom/google/android/dg3;", "h", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/dg3;", "initialValue", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lcom/google/android/kr;", "snapAnimationSpec", "Lcom/google/android/vq2;", "decayAnimationSpec", "confirmValueChange", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/google/android/kr;Lcom/google/android/vq2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "velocity", "Lcom/google/android/rg;", "anchoredDragScope", "anchors", "latestTarget", "u", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;FLcom/google/android/rg;Lcom/google/android/dg3;Ljava/lang/Object;Lcom/google/android/kr;Lcom/google/android/q22;)Ljava/lang/Object;", "targetValue", "w", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Ljava/lang/Object;FLcom/google/android/kr;Lcom/google/android/vq2;Lcom/google/android/q22;)Ljava/lang/Object;", "currentOffset", "z", "(Lcom/google/android/dg3;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "target", "y", "(FF)F", "I", "inputs", "Lkotlin/Function2;", "Lcom/google/android/q22;", "block", "B", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/j;", "A", "()Landroidx/compose/foundation/gestures/j;", "Lcom/google/android/f43;", "density", "Lcom/google/android/omc;", "s", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lcom/google/android/f43;Lkotlin/jvm/functions/Function1;Lcom/google/android/kr;)Lcom/google/android/omc;", "Lcom/google/android/bwb;", "f", "(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/google/android/bwb;", "Landroidx/compose/ui/input/pointer/j;", "a", "Lkotlin/jvm/functions/Function1;", "AlwaysDrag", "", "b", "GetOrNan", "Lcom/google/android/ff3;", "c", "F", "getAnchoredDraggableMinFlingVelocity", "()F", "AnchoredDraggableMinFlingVelocity", "d", "Lcom/google/android/vq2;", "NoOpDecayAnimationSpec", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnchoredDraggableKt {
    private static final Function1<j, Boolean> a = new Function1() { // from class: com.google.android.vg
        public final Object invoke(Object obj) {
            return Boolean.valueOf(AnchoredDraggableKt.e((j) obj));
        }
    };
    private static final Function1<Integer, Float> b = new Function1() { // from class: com.google.android.wg
        public final Object invoke(Object obj) {
            return Float.valueOf(AnchoredDraggableKt.i(((Integer) obj).intValue()));
        }
    };
    private static final float c = ff3.i(125);
    private static final vq2<Float> d = xq2.d(new b());

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/foundation/gestures/AnchoredDraggableKt$a", "Lcom/google/android/bwb;", "", "velocity", "decayOffset", "b", "(FF)F", "a", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements bwb {
        final /* synthetic */ AnchoredDraggableState<T> a;
        final /* synthetic */ Function1<Float, Float> b;
        final /* synthetic */ Function0<Float> c;

        /* JADX WARN: Multi-variable type inference failed */
        a(AnchoredDraggableState<T> anchoredDraggableState, Function1<? super Float, Float> function1, Function0<Float> function0) {
            this.a = anchoredDraggableState;
            this.b = function1;
            this.c = function0;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.google.inputmethod.bwb
        public float a(float velocity) throws NoWhenBranchMatchedException {
            float fG = this.a.G();
            Object objZ = AnchoredDraggableKt.z(this.a.q(), fG, velocity, this.b, this.c);
            if (!((Boolean) this.a.r().invoke(objZ)).booleanValue()) {
                objZ = this.a.y();
            }
            return this.a.q().c(objZ) - fG;
        }

        @Override // com.google.inputmethod.bwb
        public float b(float velocity, float decayOffset) {
            return 0.0f;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/gestures/AnchoredDraggableKt$b", "Lcom/google/android/zg4;", "", "playTimeNanos", "", "initialValue", "initialVelocity", "e", "(JFF)F", "c", "(FF)J", "b", "d", "(FF)F", "a", "F", "()F", "absVelocityThreshold", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements zg4 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float absVelocityThreshold;

        b() {
        }

        @Override // com.google.inputmethod.zg4
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }

        @Override // com.google.inputmethod.zg4
        public float b(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // com.google.inputmethod.zg4
        public long c(float initialValue, float initialVelocity) {
            return 0L;
        }

        @Override // com.google.inputmethod.zg4
        public float d(float initialValue, float initialVelocity) {
            return 0.0f;
        }

        @Override // com.google.inputmethod.zg4
        public float e(long playTimeNanos, float initialValue, float initialVelocity) {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> j<T> A() {
        return new j<>(m.p(), new float[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <I> Object B(Function0<? extends I> function0, Function2<? super I, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        if (q22Var instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) q22Var;
            int i = anchoredDraggableKt$restartable$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                anchoredDraggableKt$restartable$1.label = i - t04.INVALID_ID;
            } else {
                anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(q22Var);
            }
        } else {
            anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(q22Var);
        }
        Object obj = anchoredDraggableKt$restartable$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = anchoredDraggableKt$restartable$1.label;
        try {
            if (i2 == 0) {
                f.b(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(function0, function2, null);
                anchoredDraggableKt$restartable$1.label = 1;
                if (kotlinx.coroutines.j.g(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == objG) {
                    return objG;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(j jVar) {
        return true;
    }

    private static final <T> bwb f(AnchoredDraggableState<T> anchoredDraggableState, Function1<? super Float, Float> function1, Function0<Float> function0) {
        return new a(anchoredDraggableState, function1, function0);
    }

    @r43
    public static final <T> AnchoredDraggableState<T> g(T t, Function1<? super Float, Float> function1, Function0<Float> function0, kr<Float> krVar, vq2<Float> vq2Var, Function1<? super T, Boolean> function2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t, function2);
        anchoredDraggableState.N(function1);
        anchoredDraggableState.Q(function0);
        anchoredDraggableState.P(krVar);
        anchoredDraggableState.J(vq2Var);
        return anchoredDraggableState;
    }

    public static final <T> dg3<T> h(Function1<? super fg3<T>, Unit> function1) {
        fg3 fg3Var = new fg3();
        function1.invoke(fg3Var);
        return new j(fg3Var.b(), fg3Var.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(int i) {
        return Float.NaN;
    }

    public static final <T> androidx.compose.ui.b q(androidx.compose.ui.b bVar, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z, r48 r48Var, zv8 zv8Var, qg4 qg4Var) {
        return bVar.then(new androidx.compose.p001foundation.gestures.a(anchoredDraggableState, orientation, z, null, r48Var, null, zv8Var, qg4Var, 32, null));
    }

    public static /* synthetic */ androidx.compose.ui.b r(androidx.compose.ui.b bVar, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z, r48 r48Var, zv8 zv8Var, qg4 qg4Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return q(bVar, anchoredDraggableState, orientation, z, (i & 8) != 0 ? null : r48Var, (i & 16) != 0 ? null : zv8Var, (i & 32) != 0 ? null : qg4Var);
    }

    public static final <T> omc s(AnchoredDraggableState<T> anchoredDraggableState, final f43 f43Var, Function1<? super Float, Float> function1, kr<Float> krVar) {
        return SnapFlingBehaviorKt.p(f(anchoredDraggableState, function1, new Function0() { // from class: com.google.android.xg
            public final Object invoke() {
                return Float.valueOf(AnchoredDraggableKt.t(f43Var));
            }
        }), d, krVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(f43 f43Var) {
        return f43Var.x2(ff3.i(125));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object u(AnchoredDraggableState<T> anchoredDraggableState, float f, final rg rgVar, dg3<T> dg3Var, T t, kr<Float> krVar, q22<? super Unit> q22Var) {
        Object objJ;
        float fC = dg3Var.c(t);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.isNaN(anchoredDraggableState.w()) ? 0.0f : anchoredDraggableState.w();
        if (!Float.isNaN(fC)) {
            float f2 = floatRef.element;
            if (f2 != fC && (objJ = SuspendAnimationKt.j(f2, fC, f, krVar, new Function2() { // from class: com.google.android.ug
                public final Object invoke(Object obj, Object obj2) {
                    return AnchoredDraggableKt.v(rgVar, floatRef, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                }
            }, q22Var)) == kotlin.coroutines.intrinsics.a.g()) {
                return objJ;
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(rg rgVar, Ref.FloatRef floatRef, float f, float f2) {
        rgVar.a(f, f2);
        floatRef.element = f;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final <T> Object w(AnchoredDraggableState<T> anchoredDraggableState, T t, float f, kr<Float> krVar, vq2<Float> vq2Var, q22<? super Float> q22Var) {
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$1;
        float f2;
        Ref.FloatRef floatRef;
        if (q22Var instanceof AnchoredDraggableKt$animateToWithDecay$1) {
            anchoredDraggableKt$animateToWithDecay$1 = (AnchoredDraggableKt$animateToWithDecay$1) q22Var;
            int i = anchoredDraggableKt$animateToWithDecay$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                anchoredDraggableKt$animateToWithDecay$1.label = i - t04.INVALID_ID;
            } else {
                anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(q22Var);
            }
        } else {
            anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(q22Var);
        }
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$2 = anchoredDraggableKt$animateToWithDecay$1;
        Object obj = anchoredDraggableKt$animateToWithDecay$2.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = anchoredDraggableKt$animateToWithDecay$2.label;
        if (i2 == 0) {
            f.b(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            floatRef2.element = f;
            AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$3 = new AnchoredDraggableKt$animateToWithDecay$2(anchoredDraggableState, f, krVar, floatRef2, vq2Var, null);
            anchoredDraggableKt$animateToWithDecay$2.L$0 = floatRef2;
            anchoredDraggableKt$animateToWithDecay$2.F$0 = f;
            anchoredDraggableKt$animateToWithDecay$2.label = 1;
            if (AnchoredDraggableState.m(anchoredDraggableState, t, null, anchoredDraggableKt$animateToWithDecay$3, anchoredDraggableKt$animateToWithDecay$2, 2, null) == objG) {
                return objG;
            }
            f2 = f;
            floatRef = floatRef2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = anchoredDraggableKt$animateToWithDecay$2.F$0;
            floatRef = (Ref.FloatRef) anchoredDraggableKt$animateToWithDecay$2.L$0;
            f.b(obj);
        }
        return ut0.d(f2 - floatRef.element);
    }

    public static /* synthetic */ Object x(AnchoredDraggableState anchoredDraggableState, Object obj, float f, kr krVar, vq2 vq2Var, q22 q22Var, int i, Object obj2) {
        if ((i & 4) != 0) {
            krVar = anchoredDraggableState.B() ? anchoredDraggableState.z() : tg.a.f();
        }
        kr krVar2 = krVar;
        if ((i & 8) != 0) {
            vq2Var = anchoredDraggableState.B() ? anchoredDraggableState.t() : tg.a.d();
        }
        return w(anchoredDraggableState, obj, f, krVar2, vq2Var, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float y(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? g.i(f, f2) : g.d(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[RETURN] */
    public static final <T> T z(dg3<T> dg3Var, float f, float f2, Function1<? super Float, Float> function1, Function0<Float> function0) throws NoWhenBranchMatchedException {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            T tB = dg3Var.b(f);
            Intrinsics.g(tB);
            return tB;
        }
        if (Math.abs(f2) >= Math.abs(((Number) function0.invoke()).floatValue())) {
            T tA = dg3Var.a(f, z2);
            Intrinsics.g(tA);
            return tA;
        }
        T tA2 = dg3Var.a(f, false);
        Intrinsics.g(tA2);
        float fC = dg3Var.c(tA2);
        T tA3 = dg3Var.a(f, true);
        Intrinsics.g(tA3);
        float fC2 = dg3Var.c(tA3);
        float fAbs = Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(fC - fC2)))).floatValue());
        if (!z2) {
            fC = fC2;
        }
        boolean z3 = Math.abs(fC - f) >= fAbs;
        if (z3) {
            if (z2) {
                return tA3;
            }
            return tA2;
        }
        if (z3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z2) {
            return tA2;
        }
        return tA3;
    }
}
