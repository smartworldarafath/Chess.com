package androidx.compose.p000animation.core;

import androidx.compose.p004runtime.s0;
import com.google.inputmethod.o58;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005R+\u0010\u0016\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/core/e;", "S", "Landroidx/compose/animation/core/g;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition;", "transition", "", "f", "(Landroidx/compose/animation/core/Transition;)V", "g", "()V", "<set-?>", "b", "Lcom/google/android/o58;", "a", "()Ljava/lang/Object;", "d", "currentState", "c", "i", "targetState", "", "h", "()Z", "isIdle", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<S> extends g<S> {
    public static final int d = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 currentState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 targetState;

    public e(S s) {
        super(null);
        this.currentState = s0.e(s, null, 2, null);
        this.targetState = s0.e(s, null, 2, null);
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
    public void d(S s) {
        this.currentState.setValue(s);
    }

    @Override // androidx.compose.p000animation.core.g
    public void f(Transition<S> transition) {
    }

    @Override // androidx.compose.p000animation.core.g
    public void g() {
    }

    public final boolean h() {
        return Intrinsics.e(a(), b()) && !c();
    }

    public void i(S s) {
        this.targetState.setValue(s);
    }
}
