package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.google.inputmethod.n17;
import com.google.inputmethod.yb3;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/g;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle$State;", "minState", "Lcom/google/android/yb3;", "dispatchQueue", "Lkotlinx/coroutines/s;", "parentJob", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lcom/google/android/yb3;Lkotlinx/coroutines/s;)V", "", "b", "()V", "a", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle$State;", "c", "Lcom/google/android/yb3;", "Landroidx/lifecycle/i;", "d", "Landroidx/lifecycle/i;", "observer", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lifecycle.State minState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final yb3 dispatchQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final i observer;

    public g(Lifecycle lifecycle, Lifecycle.State state, yb3 yb3Var, final kotlinx.coroutines.s sVar) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(state, "minState");
        Intrinsics.checkNotNullParameter(yb3Var, "dispatchQueue");
        Intrinsics.checkNotNullParameter(sVar, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = yb3Var;
        i iVar = new i() { // from class: com.google.android.x07
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var, Lifecycle.Event event) {
                g.c(this.a, sVar, n17Var, event);
            }
        };
        this.observer = iVar;
        if (lifecycle.getState() != Lifecycle.State.DESTROYED) {
            lifecycle.c(iVar);
        } else {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(g gVar, kotlinx.coroutines.s sVar, n17 n17Var, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(n17Var, "source");
        Intrinsics.checkNotNullParameter(event, "<unused var>");
        if (n17Var.getLifecycleRegistry().getState() == Lifecycle.State.DESTROYED) {
            kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
            gVar.b();
        } else if (n17Var.getLifecycleRegistry().getState().compareTo(gVar.minState) < 0) {
            gVar.dispatchQueue.h();
        } else {
            gVar.dispatchQueue.i();
        }
    }

    public final void b() {
        this.lifecycle.g(this.observer);
        this.dispatchQueue.g();
    }
}
