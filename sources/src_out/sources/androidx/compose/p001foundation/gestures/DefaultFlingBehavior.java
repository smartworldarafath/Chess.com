package androidx.compose.p001foundation.gestures;

import com.google.android.q22;
import com.google.android.rw0;
import com.google.inputmethod.bab;
import com.google.inputmethod.e2c;
import com.google.inputmethod.f43;
import com.google.inputmethod.p9b;
import com.google.inputmethod.rz7;
import com.google.inputmethod.vq2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Lcom/google/android/bab;", "Lcom/google/android/vq2;", "", "flingDecay", "Lcom/google/android/rz7;", "motionDurationScale", "<init>", "(Lcom/google/android/vq2;Lcom/google/android/rz7;)V", "Lcom/google/android/p9b;", "initialVelocity", "a", "(Lcom/google/android/p9b;FLcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/f43;", "density", "", "d", "(Lcom/google/android/f43;)V", "Lcom/google/android/vq2;", "b", "Lcom/google/android/rz7;", "", "c", "I", "f", "()I", "g", "(I)V", "lastAnimationCycleCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultFlingBehavior implements bab {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private vq2<Float> flingDecay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final rz7 motionDurationScale;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int lastAnimationCycleCount;

    public DefaultFlingBehavior(vq2<Float> vq2Var, rz7 rz7Var) {
        this.flingDecay = vq2Var;
        this.motionDurationScale = rz7Var;
    }

    @Override // com.google.inputmethod.qg4
    public Object a(p9b p9bVar, float f, q22<? super Float> q22Var) {
        this.lastAnimationCycleCount = 0;
        return rw0.g(this.motionDurationScale, new DefaultFlingBehavior$performFling$2(f, this, p9bVar, null), q22Var);
    }

    @Override // com.google.inputmethod.bab
    public void d(f43 density) {
        this.flingDecay = e2c.c(density);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void g(int i) {
        this.lastAnimationCycleCount = i;
    }

    public /* synthetic */ DefaultFlingBehavior(vq2 vq2Var, rz7 rz7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vq2Var, (i & 2) != 0 ? ScrollableKt.g() : rz7Var);
    }
}
