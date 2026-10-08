package androidx.lifecycle.p011compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import com.google.inputmethod.n17;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR*\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/compose/a;", "Lcom/google/android/n17;", "<init>", "()V", "", "c", "Landroidx/lifecycle/Lifecycle$Event;", "event", "a", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/k;", "Landroidx/lifecycle/k;", "lifecycleRegistry", "Landroidx/lifecycle/Lifecycle$State;", "b", "Landroidx/lifecycle/Lifecycle$State;", "parentLifecycleState", "value", "getMaxLifecycleState", "()Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/Lifecycle$State;)V", "maxLifecycleState", "getLifecycle", "()Landroidx/lifecycle/k;", "lifecycle", "lifecycle-runtime-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a implements n17 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k lifecycleRegistry = new k(this);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Lifecycle.State parentLifecycleState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Lifecycle.State maxLifecycleState;

    public a() {
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.parentLifecycleState = state;
        this.maxLifecycleState = state;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void c() throws NoWhenBranchMatchedException {
        Lifecycle.State state = this.parentLifecycleState.ordinal() < this.maxLifecycleState.ordinal() ? this.parentLifecycleState : this.maxLifecycleState;
        if (this.lifecycleRegistry.getState() == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            return;
        }
        this.lifecycleRegistry.q(state);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(Lifecycle.Event event) throws NoWhenBranchMatchedException {
        this.parentLifecycleState = event.d();
        c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b(Lifecycle.State state) throws NoWhenBranchMatchedException {
        this.maxLifecycleState = state;
        c();
    }

    @Override // com.google.inputmethod.n17
    /* JADX INFO: renamed from: getLifecycle, reason: from getter */
    public k getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }
}
