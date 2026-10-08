package androidx.compose.p001foundation.gestures.snapping;

import androidx.compose.p001foundation.gestures.ScrollableKt;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ut0;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.bwb;
import com.google.inputmethod.kr;
import com.google.inputmethod.omc;
import com.google.inputmethod.or;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qr;
import com.google.inputmethod.rz7;
import com.google.inputmethod.t04;
import com.google.inputmethod.vq2;
import com.google.inputmethod.xq2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0017*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019JD\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010!\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0004\b!\u0010\u0013J\u001a\u0010$\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010+R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Lcom/google/android/omc;", "Lcom/google/android/bwb;", "snapLayoutInfoProvider", "Lcom/google/android/vq2;", "", "decayAnimationSpec", "Lcom/google/android/kr;", "snapAnimationSpec", "<init>", "(Lcom/google/android/bwb;Lcom/google/android/vq2;Lcom/google/android/kr;)V", "Lcom/google/android/p9b;", "initialVelocity", "Lkotlin/Function1;", "", "onRemainingScrollOffsetUpdate", "Landroidx/compose/foundation/gestures/snapping/a;", "Lcom/google/android/qr;", "j", "(Lcom/google/android/p9b;FLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "offset", "velocity", "updateRemainingScrollOffset", "Lcom/google/android/nr;", "m", "(Lcom/google/android/p9b;FFLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "initialTargetOffset", "onAnimationStep", "l", "", "k", "(FF)Z", "onRemainingDistanceUpdated", "b", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lcom/google/android/bwb;", "Lcom/google/android/vq2;", "c", "Lcom/google/android/kr;", "Lcom/google/android/rz7;", "d", "Lcom/google/android/rz7;", "getMotionScaleDuration$foundation", "()Lcom/google/android/rz7;", "setMotionScaleDuration$foundation", "(Lcom/google/android/rz7;)V", "motionScaleDuration", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapFlingBehavior implements omc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final bwb snapLayoutInfoProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final vq2<Float> decayAnimationSpec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final kr<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private rz7 motionScaleDuration = ScrollableKt.g();

    public SnapFlingBehavior(bwb bwbVar, vq2<Float> vq2Var, kr<Float> krVar) {
        this.snapLayoutInfoProvider = bwbVar;
        this.decayAnimationSpec = vq2Var;
        this.snapAnimationSpec = krVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(p9b p9bVar, float f, Function1<? super Float, Unit> function1, q22<? super a<Float, qr>> q22Var) {
        SnapFlingBehavior$fling$1 snapFlingBehavior$fling$1;
        Function1<? super Float, Unit> function2;
        if (q22Var instanceof SnapFlingBehavior$fling$1) {
            snapFlingBehavior$fling$1 = (SnapFlingBehavior$fling$1) q22Var;
            int i = snapFlingBehavior$fling$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                snapFlingBehavior$fling$1.label = i - t04.INVALID_ID;
            } else {
                snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, q22Var);
            }
        } else {
            snapFlingBehavior$fling$1 = new SnapFlingBehavior$fling$1(this, q22Var);
        }
        Object objG = snapFlingBehavior$fling$1.result;
        Object objG2 = a.g();
        int i2 = snapFlingBehavior$fling$1.label;
        if (i2 == 0) {
            f.b(objG);
            rz7 rz7Var = this.motionScaleDuration;
            SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1 = new SnapFlingBehavior$fling$result$1(this, f, function1, p9bVar, null);
            snapFlingBehavior$fling$1.L$0 = function1;
            snapFlingBehavior$fling$1.label = 1;
            objG = rw0.g(rz7Var, snapFlingBehavior$fling$result$1, snapFlingBehavior$fling$1);
            if (objG == objG2) {
                return objG2;
            }
            function2 = function1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = (Function1) snapFlingBehavior$fling$1.L$0;
            f.b(objG);
        }
        a aVar = (a) objG;
        function2.invoke(ut0.d(0.0f));
        return aVar;
    }

    private final boolean k(float offset, float velocity) {
        return Math.abs(xq2.a(this.decayAnimationSpec, 0.0f, velocity)) >= Math.abs(offset);
    }

    private final Object l(p9b p9bVar, float f, float f2, Function1<? super Float, Unit> function1, q22<? super a<Float, qr>> q22Var) {
        return SnapFlingBehaviorKt.k(p9bVar, f, f2, k(f, f2) ? new c(this.decayAnimationSpec) : new k(this.snapAnimationSpec), function1, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object m(p9b p9bVar, float f, float f2, Function1<? super Float, Unit> function1, q22<? super AnimationState<Float, qr>> q22Var) {
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1;
        SnapFlingBehavior snapFlingBehavior;
        if (q22Var instanceof SnapFlingBehavior$tryApproach$1) {
            snapFlingBehavior$tryApproach$1 = (SnapFlingBehavior$tryApproach$1) q22Var;
            int i = snapFlingBehavior$tryApproach$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                snapFlingBehavior$tryApproach$1.label = i - t04.INVALID_ID;
                snapFlingBehavior = this;
            } else {
                snapFlingBehavior = this;
                snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(snapFlingBehavior, q22Var);
            }
        } else {
            snapFlingBehavior = this;
            snapFlingBehavior$tryApproach$1 = new SnapFlingBehavior$tryApproach$1(snapFlingBehavior, q22Var);
        }
        SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$2 = snapFlingBehavior$tryApproach$1;
        Object objL = snapFlingBehavior$tryApproach$2.result;
        Object objG = a.g();
        int i2 = snapFlingBehavior$tryApproach$2.label;
        if (i2 == 0) {
            f.b(objL);
            if (Math.abs(f) == 0.0f || Math.abs(f2) == 0.0f) {
                return or.c(f, f2, 0L, 0L, false, 28, null);
            }
            snapFlingBehavior$tryApproach$2.label = 1;
            objL = snapFlingBehavior.l(p9bVar, f, f2, function1, snapFlingBehavior$tryApproach$2);
            if (objL == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(objL);
        }
        return ((a) objL).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.omc
    public Object b(p9b p9bVar, float f, Function1<? super Float, Unit> function1, q22<? super Float> q22Var) {
        SnapFlingBehavior$performFling$1 snapFlingBehavior$performFling$1;
        if (q22Var instanceof SnapFlingBehavior$performFling$1) {
            snapFlingBehavior$performFling$1 = (SnapFlingBehavior$performFling$1) q22Var;
            int i = snapFlingBehavior$performFling$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                snapFlingBehavior$performFling$1.label = i - t04.INVALID_ID;
            } else {
                snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, q22Var);
            }
        } else {
            snapFlingBehavior$performFling$1 = new SnapFlingBehavior$performFling$1(this, q22Var);
        }
        Object objJ = snapFlingBehavior$performFling$1.result;
        Object objG = a.g();
        int i2 = snapFlingBehavior$performFling$1.label;
        if (i2 == 0) {
            f.b(objJ);
            snapFlingBehavior$performFling$1.label = 1;
            objJ = j(p9bVar, f, function1, snapFlingBehavior$performFling$1);
            if (objJ == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(objJ);
        }
        a aVar = (a) objJ;
        return ut0.d(((Number) aVar.a()).floatValue() != 0.0f ? ((Number) aVar.b().q()).floatValue() : 0.0f);
    }

    public boolean equals(Object other) {
        if (other instanceof SnapFlingBehavior) {
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) other;
            if (Intrinsics.e(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && Intrinsics.e(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) && Intrinsics.e(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.snapAnimationSpec.hashCode() * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }
}
