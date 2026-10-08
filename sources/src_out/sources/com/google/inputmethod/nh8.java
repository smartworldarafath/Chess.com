package com.google.inputmethod;

import androidx.compose.p004runtime.p005internal.AtomicInt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/android/nh8;", "", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "action", "Lcom/google/android/o41;", "g", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/o41;", "d", "()V", "Lcom/google/android/p30;", "a", "Landroidx/compose/runtime/internal/AtomicInt;", "isFrameOngoing", "Lcom/google/android/ec0;", "Lcom/google/android/nh8$a;", "b", "Lcom/google/android/ec0;", "frameEndQueue", "c", "Lkotlin/jvm/functions/Function0;", "", "()Z", "hasAwaiters", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class nh8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AtomicInt isFrameOngoing = p30.b(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ec0<a> frameEndQueue = new ec0<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function0<Unit> onNewAwaiters;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/nh8$a;", "Lcom/google/android/ec0$a;", "Lkotlin/Function0;", "", "onNextFrameEnd", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "a", "()V", "c", "", "exception", "b", "(Ljava/lang/Throwable;)V", "Lkotlin/jvm/functions/Function0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a extends ec0.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Function0<Unit> onNextFrameEnd;

        public a(Function0<Unit> function0) {
            this.onNextFrameEnd = function0;
        }

        @Override // com.google.android.ec0.a
        public void a() {
            this.onNextFrameEnd = null;
        }

        @Override // com.google.android.ec0.a
        public void b(Throwable exception) throws Throwable {
            throw exception;
        }

        public final void c() {
            Function0<Unit> function0 = this.onNextFrameEnd;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public nh8(final Function0<Unit> function0) {
        this.onNewAwaiters = new Function0() { // from class: com.google.android.mh8
            public final Object invoke() {
                return nh8.f(this.a, function0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(a aVar) {
        aVar.c();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(nh8 nh8Var, Function0 function0) {
        if (!p30.c(nh8Var.isFrameOngoing)) {
            function0.invoke();
        }
        return Unit.a;
    }

    public final boolean c() {
        return this.frameEndQueue.f();
    }

    public final void d() {
        p30.e(this.isFrameOngoing, false);
        this.frameEndQueue.e(new Function1() { // from class: com.google.android.lh8
            public final Object invoke(Object obj) {
                return nh8.e((nh8.a) obj);
            }
        });
    }

    public final o41 g(Function0<Unit> action) {
        return this.frameEndQueue.b(new a(action), this.onNewAwaiters);
    }
}
