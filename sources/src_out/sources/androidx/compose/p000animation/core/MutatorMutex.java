package androidx.compose.p000animation.core;

import com.google.android.a68;
import com.google.android.q22;
import com.google.android.x58;
import com.google.inputmethod.w58;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0015\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex;", "", "<init>", "()V", "Landroidx/compose/animation/core/MutatorMutex$a;", "mutator", "", "f", "(Landroidx/compose/animation/core/MutatorMutex$a;)V", "R", "Landroidx/compose/animation/core/MutatePriority;", "priority", "Lkotlin/Function1;", "Lcom/google/android/q22;", "block", "d", "(Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "currentMutator", "Lcom/google/android/x58;", "b", "Lcom/google/android/x58;", "mutex", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MutatorMutex {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicReference<a> currentMutator = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final x58 mutex = a68.b(false, 1, (Object) null);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex$a;", "", "Landroidx/compose/animation/core/MutatePriority;", "priority", "Lkotlinx/coroutines/s;", "job", "<init>", "(Landroidx/compose/animation/core/MutatePriority;Lkotlinx/coroutines/s;)V", "other", "", "a", "(Landroidx/compose/animation/core/MutatorMutex$a;)Z", "", "b", "()V", "Landroidx/compose/animation/core/MutatePriority;", "getPriority", "()Landroidx/compose/animation/core/MutatePriority;", "Lkotlinx/coroutines/s;", "getJob", "()Lkotlinx/coroutines/s;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final MutatePriority priority;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final s job;

        public a(MutatePriority mutatePriority, s sVar) {
            this.priority = mutatePriority;
            this.job = sVar;
        }

        public final boolean a(a other) {
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void b() {
            this.job.k(new MutationInterruptedException());
        }
    }

    public static /* synthetic */ Object e(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, q22 q22Var, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.d(mutatePriority, function1, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a mutator) {
        a aVar;
        do {
            aVar = this.currentMutator.get();
            if (aVar != null && !mutator.a(aVar)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!w58.a(this.currentMutator, aVar, mutator));
        if (aVar != null) {
            aVar.b();
        }
    }

    public final <R> Object d(MutatePriority mutatePriority, Function1<? super q22<? super R>, ? extends Object> function1, q22<? super R> q22Var) {
        return j.g(new MutatorMutex$mutate$2(mutatePriority, this, function1, null), q22Var);
    }
}
