package androidx.compose.p001foundation.text.input.internal;

import com.google.android.q22;
import com.google.inputmethod.l48;
import com.google.inputmethod.tm9;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR*\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "", "animate", "<init>", "(Z)V", "", "f", "(Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Z", "c", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/s;", "Landroidx/compose/foundation/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "animationJob", "", "<set-?>", "Lcom/google/android/l48;", "d", "()F", "e", "(F)V", "cursorAlpha", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CursorAnimationState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean animate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AtomicReference<s> animationJob = new AtomicReference<>(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final l48 cursorAlpha = tm9.a(0.0f);

    public CursorAnimationState(boolean z) {
        this.animate = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(float f) {
        this.cursorAlpha.p(f);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAnimate() {
        return this.animate;
    }

    public final float d() {
        return this.cursorAlpha.b();
    }

    public final Object f(q22<? super Unit> q22Var) {
        Object objG = j.g(new CursorAnimationState$snapToVisibleAndAnimate$2(this, null), q22Var);
        return objG == a.g() ? objG : Unit.a;
    }
}
