package androidx.compose.p000animation.core;

import androidx.compose.p004runtime.s0;
import com.google.inputmethod.o58;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H ¢\u0006\u0004\b\n\u0010\u0004R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00008&@`X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00008&@`X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017\u0082\u0001\u0002\u001c\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/animation/core/g;", "S", "", "<init>", "()V", "Landroidx/compose/animation/core/Transition;", "transition", "", "f", "(Landroidx/compose/animation/core/Transition;)V", "g", "", "<set-?>", "a", "Lcom/google/android/o58;", "c", "()Z", "e", "(Z)V", "isRunning", "value", "()Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", "currentState", "b", "setTargetState$animation_core", "targetState", "Landroidx/compose/animation/core/e;", "Landroidx/compose/animation/core/SeekableTransitionState;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class g<S> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o58 isRunning;

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract S a();

    public abstract S b();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public abstract void d(S s);

    public final void e(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }

    public abstract void f(Transition<S> transition);

    public abstract void g();

    private g() {
        this.isRunning = s0.e(Boolean.FALSE, null, 2, null);
    }
}
