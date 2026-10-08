package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.layout.o;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.h16;
import com.google.inputmethod.it0;
import com.google.inputmethod.kba;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ln6;
import com.google.inputmethod.o58;
import com.google.inputmethod.q16;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.sa7;
import com.google.inputmethod.tr;
import com.google.inputmethod.tsb;
import com.google.inputmethod.w2e;
import com.google.inputmethod.wa7;
import com.google.inputmethod.xa4;
import com.google.inputmethod.z66;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\bJ\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R$\u0010(\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010+\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u0016\u0010.\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R$\u00105\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b0\u00102\"\u0004\b3\u00104R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\"\u00108\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010%\u001a\u0004\b,\u0010'\"\u0004\b7\u0010\bR/\u0010?\u001a\u0004\u0018\u00010\r2\b\u00109\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b$\u0010<\"\u0004\b=\u0010>R\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010%R\u0013\u0010F\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b)\u0010<R\u0011\u0010H\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bB\u0010GR\u0013\u0010#\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b:\u0010<¨\u0006I"}, d2 = {"Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "", "<init>", "()V", "Lcom/google/android/rn8;", "offset", "", "m", "(J)V", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/it0;", "boundsTransform", "Lcom/google/android/gba;", "a", "(Lcom/google/android/ta2;Lcom/google/android/it0;)Lcom/google/android/gba;", "Lcom/google/android/tsb;", "size", "o", "position", "l", "(JJ)V", "Lcom/google/android/wa7;", "lookaheadScope", "Landroidx/compose/ui/layout/o$a;", "placementScope", "", "directManipulationParentsDirty", "includeMotionFrameOfReference", "n", "(Lcom/google/android/wa7;Landroidx/compose/ui/layout/o$a;Lcom/google/android/ta2;ZZLcom/google/android/it0;)V", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/tr;", "Landroidx/compose/animation/core/Animatable;", "animatable", "value", "b", "J", "g", "()J", "targetSize", "c", "f", "targetOffset", "d", "Z", "isPending", "Lcom/google/android/sa7;", "e", "Lcom/google/android/sa7;", "()Lcom/google/android/sa7;", "k", "(Lcom/google/android/sa7;)V", "lookaheadAnimationVisualDebugHelper", "currentPosition", "setCurrentSize-uvyYCjk", "currentSize", "<set-?>", "h", "Lcom/google/android/o58;", "()Lcom/google/android/gba;", "j", "(Lcom/google/android/gba;)V", "animatedValue", "", "Lcom/google/android/kn6;", "i", "Ljava/util/List;", "directManipulationParents", "additionalOffset", "currentBounds", "()Z", "isIdle", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BoundsTransformDeferredAnimation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Animatable<gba, tr> animatable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long targetSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long targetOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isPending;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private sa7 lookaheadAnimationVisualDebugHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long currentPosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long currentSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final o58 animatedValue;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private List<kn6> directManipulationParents;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long additionalOffset;

    public BoundsTransformDeferredAnimation() {
        tsb.Companion companion = tsb.INSTANCE;
        this.targetSize = companion.a();
        rn8.Companion companion2 = rn8.INSTANCE;
        this.targetOffset = companion2.b();
        this.currentPosition = companion2.b();
        this.currentSize = companion.a();
        this.animatedValue = s0.e(null, null, 2, null);
        this.additionalOffset = companion2.c();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    private final gba a(ta2 coroutineScope, it0 boundsTransform) {
        BoundsTransformDeferredAnimation boundsTransformDeferredAnimation;
        gba gbaVarM;
        sa7 sa7Var;
        long j = this.targetOffset;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            long j2 = this.targetSize;
            if (j2 != 9205357640488583168L) {
                gba gbaVarC = kba.c(j, j2);
                Animatable<gba, tr> animatable = this.animatable;
                if (animatable == null) {
                    animatable = new Animatable<>(gbaVarC, w2e.S(gba.INSTANCE), null, null, 12, null);
                }
                this.animatable = animatable;
                if (this.isPending) {
                    this.isPending = false;
                    if (z66.a() && (sa7Var = this.lookaheadAnimationVisualDebugHelper) != null) {
                        Intrinsics.g(sa7Var);
                        gba gbaVarC2 = c();
                        Intrinsics.g(gbaVarC2);
                        xa4<gba> xa4VarA = boundsTransform.a(gbaVarC2, gbaVarC);
                        gba gbaVarC3 = c();
                        Intrinsics.g(gbaVarC3);
                        sa7Var.a(xa4VarA, gbaVarC3, gbaVarC, animatable.n());
                    }
                    CoroutineStart coroutineStart = CoroutineStart.d;
                    ta2 ta2Var = new ta2(animatable, gbaVarC, boundsTransform, this, null);
                    boundsTransformDeferredAnimation = this;
                    rw0.d(coroutineScope, (CoroutineContext) null, coroutineStart, ta2Var, 1, (Object) null);
                } else {
                    boundsTransformDeferredAnimation = this;
                }
            } else {
                boundsTransformDeferredAnimation = this;
            }
        } else {
            boundsTransformDeferredAnimation = this;
        }
        Animatable<gba, tr> animatable2 = boundsTransformDeferredAnimation.animatable;
        return (animatable2 == null || (gbaVarM = animatable2.m()) == null) ? gba.INSTANCE.a() : gbaVarM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final gba b() {
        return (gba) this.animatedValue.getValue();
    }

    private final void j(gba gbaVar) {
        this.animatedValue.setValue(gbaVar);
    }

    private final void m(long offset) {
        if ((this.targetOffset & 9223372034707292159L) != 9205357640488583168L && !g16.j(h16.d(offset), h16.d(this.targetOffset))) {
            this.isPending = true;
        }
        this.targetOffset = offset;
        if ((this.currentPosition & 9223372034707292159L) == 9205357640488583168L) {
            this.currentPosition = offset;
        }
    }

    public final gba c() {
        long j = this.currentSize;
        long j2 = this.currentPosition;
        if ((9223372034707292159L & j2) == 9205357640488583168L || j == 9205357640488583168L) {
            return null;
        }
        return kba.c(j2, j);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCurrentSize() {
        return this.currentSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final sa7 getLookaheadAnimationVisualDebugHelper() {
        return this.lookaheadAnimationVisualDebugHelper;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getTargetOffset() {
        return this.targetOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getTargetSize() {
        return this.targetSize;
    }

    public final gba h() {
        if (i()) {
            return null;
        }
        return b();
    }

    public final boolean i() {
        if (this.isPending) {
            return false;
        }
        Animatable<gba, tr> animatable = this.animatable;
        return animatable == null || !animatable.p();
    }

    public final void k(sa7 sa7Var) {
        this.lookaheadAnimationVisualDebugHelper = sa7Var;
    }

    public final void l(long position, long size) {
        this.currentPosition = position;
        this.currentSize = size;
    }

    public final void n(wa7 lookaheadScope, o.a placementScope, ta2 coroutineScope, boolean directManipulationParentsDirty, boolean includeMotionFrameOfReference, it0 boundsTransform) {
        kn6 kn6VarV = placementScope.v();
        if (kn6VarV != null) {
            kn6 kn6VarB = lookaheadScope.b(placementScope);
            long jC = rn8.INSTANCE.c();
            if (!includeMotionFrameOfReference && directManipulationParentsDirty) {
                List<kn6> arrayList = this.directManipulationParents;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                int i = 0;
                kn6 kn6VarZ = kn6VarV;
                while (!Intrinsics.e(lookaheadScope.f(kn6VarZ), kn6VarB)) {
                    if (kn6VarZ.t()) {
                        if (arrayList.size() == i) {
                            arrayList.add(kn6VarZ);
                            jC = rn8.q(jC, ln6.g(kn6VarZ));
                        } else if (!Intrinsics.e(arrayList.get(i), kn6VarZ)) {
                            long jP = rn8.p(jC, ln6.g(arrayList.get(i)));
                            arrayList.set(i, kn6VarZ);
                            jC = rn8.q(jP, ln6.g(kn6VarZ));
                        }
                        i++;
                    }
                    kn6VarZ = kn6VarZ.Z();
                    if (kn6VarZ == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i <= size) {
                    while (true) {
                        jC = rn8.p(jC, ln6.g(arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                this.directManipulationParents = arrayList;
            }
            this.additionalOffset = rn8.q(this.additionalOffset, jC);
            m(rn8.q(wa7.j(lookaheadScope, kn6VarB, kn6VarV, 0L, includeMotionFrameOfReference, 2, null), this.additionalOffset));
            j(a(coroutineScope, boundsTransform).u(rn8.e(this.additionalOffset ^ (-9223372034707292160L))));
        }
    }

    public final void o(long size) {
        if (this.targetSize != 9205357640488583168L && !q16.f(r16.c(size), r16.c(this.targetSize))) {
            this.isPending = true;
        }
        this.targetSize = size;
        if (this.currentSize == 9205357640488583168L) {
            this.currentSize = size;
        }
    }
}
