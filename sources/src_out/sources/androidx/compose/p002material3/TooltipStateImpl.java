package androidx.compose.p002material3;

import androidx.compose.p000animation.core.e;
import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.MutatorMutex;
import com.google.android.g41;
import com.google.android.q22;
import com.google.inputmethod.cad;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/TooltipStateImpl;", "Lcom/google/android/cad;", "", "initialIsVisible", "isPersistent", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "<init>", "(ZZLandroidx/compose/foundation/MutatorMutex;)V", "Landroidx/compose/foundation/MutatePriority;", "mutatePriority", "", "c", "(Landroidx/compose/foundation/MutatePriority;Lcom/google/android/q22;)Ljava/lang/Object;", "dismiss", "()V", "b", "a", "Z", "f", "()Z", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/animation/core/e;", "Landroidx/compose/animation/core/e;", "()Landroidx/compose/animation/core/e;", "transition", "Lcom/google/android/g41;", "d", "Lcom/google/android/g41;", "job", "isVisible", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class TooltipStateImpl implements cad {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isPersistent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final e<Boolean> transition;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private g41<? super Unit> job;

    public TooltipStateImpl(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        this.isPersistent = z2;
        this.mutatorMutex = mutatorMutex;
        this.transition = new e<>(Boolean.valueOf(z));
    }

    @Override // com.google.inputmethod.cad
    public e<Boolean> a() {
        return this.transition;
    }

    @Override // com.google.inputmethod.cad
    public void b() {
        g41<? super Unit> g41Var = this.job;
        if (g41Var != null) {
            g41.a.a(g41Var, (Throwable) null, 1, (Object) null);
        }
    }

    @Override // com.google.inputmethod.cad
    public Object c(MutatePriority mutatePriority, q22<? super Unit> q22Var) {
        Object objD = this.mutatorMutex.d(mutatePriority, new TooltipStateImpl$show$2(this, new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null), q22Var);
        return objD == a.g() ? objD : Unit.a;
    }

    @Override // com.google.inputmethod.cad
    public void dismiss() {
        g41<? super Unit> g41Var;
        a().i(Boolean.FALSE);
        if (!getIsPersistent() || (g41Var = this.job) == null) {
            return;
        }
        g41.a.a(g41Var, (Throwable) null, 1, (Object) null);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getIsPersistent() {
        return this.isPersistent;
    }

    @Override // com.google.inputmethod.cad
    public boolean isVisible() {
        return a().a().booleanValue() || a().b().booleanValue();
    }
}
