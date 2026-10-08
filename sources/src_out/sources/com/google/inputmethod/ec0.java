package com.google.inputmethod;

import androidx.compose.p004runtime.p005internal.AtomicInt;
import com.google.android.ec0.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u00060\u0003j\u0002`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/google/android/ec0;", "Lcom/google/android/ec0$a;", "A", "", "<init>", "()V", "awaiter", "Lkotlin/Function0;", "", "onFirstAwaiter", "Lcom/google/android/o41;", "b", "(Lcom/google/android/ec0$a;Lkotlin/jvm/functions/Function0;)Lcom/google/android/o41;", "Lkotlin/Function1;", "resume", "e", "(Lkotlin/jvm/functions/Function1;)V", "", "cause", "d", "(Ljava/lang/Throwable;)V", "Landroidx/compose/runtime/platform/SynchronizedObject;", "a", "Ljava/lang/Object;", "lock", "Ljava/lang/Throwable;", "failureCause", "Lcom/google/android/l30;", "c", "Landroidx/compose/runtime/internal/AtomicInt;", "pendingAwaitersCountUnlocked", "Lcom/google/android/e58;", "Lcom/google/android/e58;", "awaiters", "spareList", "", "f", "()Z", "hasAwaiters", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ec0<A extends a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Throwable failureCause;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AtomicInt pendingAwaitersCountUnlocked = l30.b();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private e58<A> awaiters = new e58<>(0, 1, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private e58<A> spareList = new e58<>(0, 1, null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/ec0$a;", "", "<init>", "()V", "", "a", "", "exception", "b", "(Ljava/lang/Throwable;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {
        public abstract void a();

        public abstract void b(Throwable exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(a aVar, ec0 ec0Var, Ref.IntRef intRef) {
        int i;
        aVar.a();
        AtomicInt atomicInt = ec0Var.pendingAwaitersCountUnlocked;
        int i2 = intRef.element;
        do {
            i = atomicInt.get();
        } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return Unit.a;
    }

    public final o41 b(final A awaiter, Function0<Unit> onFirstAwaiter) {
        int i;
        int i2;
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                awaiter.b(th);
                return o41.INSTANCE.c();
            }
            AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            boolean z = true;
            if ((134217727 & i2) != 1) {
                z = false;
            }
            intRef.element = (i2 >>> 27) & 15;
            this.awaiters.n(awaiter);
            if (z && onFirstAwaiter != null) {
                try {
                    onFirstAwaiter.invoke();
                } catch (Throwable th2) {
                    d(th2);
                }
            }
            return new es8(new Function0() { // from class: com.google.android.dc0
                public final Object invoke() {
                    return ec0.c(awaiter, this, intRef);
                }
            });
        }
    }

    public final void d(Throwable cause) {
        int i;
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                e58<A> e58Var = this.awaiters;
                Object[] objArr = e58Var.content;
                int i2 = e58Var._size;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((a) objArr[i3]).b(cause);
                }
                this.awaiters.u();
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, l30.d(atomicInt, ((i >>> 27) & 15) + 1, 0)));
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(Function1<? super A, Unit> resume) {
        int i;
        int i2;
        synchronized (this.lock) {
            try {
                e58<A> e58Var = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = e58Var;
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, l30.d(atomicInt, ((i >>> 27) & 15) + 1, 0)));
                int i3 = e58Var.get_size();
                for (i2 = 0; i2 < i3; i2++) {
                    resume.invoke(e58Var.d(i2));
                }
                e58Var.u();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        return (this.pendingAwaitersCountUnlocked.get() & 134217727) > 0;
    }
}
