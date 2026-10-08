package com.google.inputmethod;

import androidx.collection.ScatterSet;
import androidx.compose.p004runtime.PausedCompositionState;
import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.e0;
import androidx.compose.p004runtime.f;
import androidx.compose.p004runtime.g;
import androidx.compose.p004runtime.o;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010\u0012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\fH\u0000¢\u0006\u0004\b \u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010\u0014\u001a\u00060\u0012j\u0002`\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\b8\u00109R&\u0010>\u001a\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b/\u0010KR\"\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b+\u0010PR\u0014\u0010R\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00102R\u0014\u0010S\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u00102¨\u0006T"}, d2 = {"Lcom/google/android/g49;", "Lcom/google/android/f49;", "Landroidx/compose/runtime/g;", "composition", "Landroidx/compose/runtime/f;", "context", "Landroidx/compose/runtime/o;", "composer", "", "Lcom/google/android/yea;", "abandonSet", "Lkotlin/Function0;", "", "content", "", "reusable", "Lcom/google/android/ez;", "applier", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "<init>", "(Landroidx/compose/runtime/g;Landroidx/compose/runtime/f;Landroidx/compose/runtime/o;Ljava/util/Set;Lkotlin/jvm/functions/Function2;ZLcom/google/android/ez;Ljava/lang/Object;)V", "g", "()V", "c", "Lcom/google/android/fob;", "shouldPause", "b", "(Lcom/google/android/fob;)Z", "apply", "cancel", "h", "a", "Landroidx/compose/runtime/g;", "getComposition", "()Landroidx/compose/runtime/g;", "Landroidx/compose/runtime/f;", "getContext", "()Landroidx/compose/runtime/f;", "Landroidx/compose/runtime/o;", "getComposer", "()Landroidx/compose/runtime/o;", "d", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "e", "Z", "getReusable", "()Z", "f", "Lcom/google/android/ez;", "getApplier", "()Lcom/google/android/ez;", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/PausedCompositionState;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "state", "", "i", "J", "owningThread", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/b0;", "j", "Landroidx/collection/ScatterSet;", "invalidScopes", "Lcom/google/android/rea;", "k", "Lcom/google/android/rea;", "()Lcom/google/android/rea;", "rememberManager", "Landroidx/compose/runtime/e0;", "l", "Landroidx/compose/runtime/e0;", "()Landroidx/compose/runtime/e0;", "pausableApplier", "isRecomposing", "isComplete", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g49 implements f49 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final g composition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final f context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o composer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function2<d, Integer, Unit> content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean reusable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ez<?> applier;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private AtomicReference<PausedCompositionState> state = new AtomicReference<>(PausedCompositionState.InitialPending);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private long owningThread = q1d.a();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ScatterSet<b0> invalidScopes = l4b.a();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final rea rememberManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final e0<Object> pausableApplier;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PausedCompositionState.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PausedCompositionState.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PausedCompositionState.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PausedCompositionState.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PausedCompositionState.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g49(g gVar, f fVar, o oVar, Set<yea> set, Function2<? super d, ? super Integer, Unit> function2, boolean z, ez<?> ezVar, Object obj) {
        this.composition = gVar;
        this.context = fVar;
        this.composer = oVar;
        this.content = function2;
        this.reusable = z;
        this.applier = ezVar;
        this.lock = obj;
        rea reaVar = new rea();
        reaVar.r(set, oVar.j0());
        this.rememberManager = reaVar;
        this.pausableApplier = new e0<>(ezVar.a());
    }

    private final void c() {
        vbd vbdVar = vbd.a;
        Object objA = vbdVar.a("PausedComposition:applyChanges");
        try {
            synchronized (this.lock) {
                try {
                    e0<Object> e0Var = this.pausableApplier;
                    ez<?> ezVar = this.applier;
                    Intrinsics.h(ezVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                    e0Var.m(ezVar, this.rememberManager);
                    this.rememberManager.m();
                    this.rememberManager.n();
                    this.rememberManager.j();
                    this.composition.X(null);
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    this.rememberManager.j();
                    this.composition.X(null);
                    throw th;
                }
            }
            vbdVar.b(objA);
        } catch (Throwable th2) {
            vbd.a.b(objA);
            throw th2;
        }
    }

    private final void g() {
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        if (w58.a(this.state, pausedCompositionState, pausedCompositionState2)) {
            return;
        }
        ei9.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    @Override // com.google.inputmethod.f49
    public boolean a() {
        return this.state.get().compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.f49
    public void apply() throws Exception {
        try {
            switch (a.$EnumSwitchMapping$0[this.state.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    c();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    if (w58.a(this.state, pausedCompositionState, pausedCompositionState2)) {
                        return;
                    }
                    ei9.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            this.state.set(PausedCompositionState.Invalid);
            throw e;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.f49
    public boolean b(fob shouldPause) throws Exception {
        try {
            switch (a.$EnumSwitchMapping$0[this.state.get().ordinal()]) {
                case 1:
                    if (this.reusable) {
                        this.composer.q0();
                    }
                    try {
                        this.invalidScopes = this.context.b(this.composition, shouldPause, this.content);
                        if (this.reusable) {
                            this.composer.f0();
                        }
                        PausedCompositionState pausedCompositionState = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        if (!w58.a(this.state, pausedCompositionState, pausedCompositionState2)) {
                            ei9.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                        }
                        if (this.invalidScopes.d()) {
                            g();
                        }
                        return a();
                    } catch (Throwable th) {
                        if (this.reusable) {
                            this.composer.f0();
                        }
                        throw th;
                    }
                case 2:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Recomposing;
                    if (!w58.a(this.state, pausedCompositionState3, pausedCompositionState4)) {
                        ei9.b("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + '.');
                    }
                    long j = this.owningThread;
                    try {
                        this.owningThread = q1d.a();
                        this.invalidScopes = this.context.r(this.composition, shouldPause, this.invalidScopes);
                        this.owningThread = j;
                        if (!w58.a(this.state, pausedCompositionState4, pausedCompositionState3)) {
                            ei9.b("Unexpected state change from: " + pausedCompositionState4 + " to: " + pausedCompositionState3 + '.');
                        }
                        if (this.invalidScopes.d()) {
                            g();
                        }
                        return a();
                    } catch (Throwable th2) {
                        this.owningThread = j;
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.RecomposePending;
                        if (!w58.a(this.state, pausedCompositionState5, pausedCompositionState6)) {
                            ei9.b("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + '.');
                        }
                        throw th2;
                    }
                case 3:
                    e.c("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            this.state.set(PausedCompositionState.Invalid);
            throw e;
        }
    }

    @Override // com.google.inputmethod.f49
    public void cancel() {
        this.state.set(PausedCompositionState.Cancelled);
        ScatterSet<zea> scatterSetO = this.rememberManager.o();
        this.rememberManager.j();
        this.composition.X(scatterSetO);
    }

    public final e0<Object> d() {
        return this.pausableApplier;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final rea getRememberManager() {
        return this.rememberManager;
    }

    public final boolean f() {
        return this.state.get() == PausedCompositionState.Recomposing && this.owningThread == q1d.a();
    }

    public final void h() {
        w58.a(this.state, PausedCompositionState.ApplyPending, PausedCompositionState.RecomposePending);
    }
}
