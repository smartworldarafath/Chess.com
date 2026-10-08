package androidx.lifecycle;

import com.google.android.a68;
import com.google.android.fc3;
import com.google.android.fe7;
import com.google.android.g41;
import com.google.android.lq2;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.x58;
import com.google.inputmethod.n17;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<ta2, q22<? super Unit>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ ta2 $$this$coroutineScope;
        final /* synthetic */ Function2<ta2, q22<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, ta2 ta2Var, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = ta2Var;
            this.$block = function2;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00af  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:45:? A[SYNTHETIC] */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Throwable th;
            Ref.ObjectRef objectRef2;
            kotlinx.coroutines.s sVar;
            i iVar;
            kotlinx.coroutines.s sVar2;
            i iVar2;
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                try {
                    kotlin.f.b(obj);
                    sVar2 = (kotlinx.coroutines.s) objectRef2.element;
                    if (sVar2 != null) {
                        kotlinx.coroutines.s.a.a(sVar2, (CancellationException) null, 1, (Object) null);
                    }
                    iVar2 = (i) objectRef.element;
                    if (iVar2 != null) {
                        this.$this_repeatOnLifecycle.g(iVar2);
                    }
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    sVar = (kotlinx.coroutines.s) objectRef2.element;
                    if (sVar != null) {
                        kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
                    }
                    iVar = (i) objectRef.element;
                    if (iVar != null) {
                        throw th;
                    }
                    this.$this_repeatOnLifecycle.g(iVar);
                    throw th;
                }
            }
            kotlin.f.b(obj);
            if (this.$this_repeatOnLifecycle.getState() == Lifecycle.State.DESTROYED) {
                return Unit.a;
            }
            final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            objectRef = new Ref.ObjectRef();
            try {
                Lifecycle.State state = this.$state;
                Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                final ta2 ta2Var = this.$$this$coroutineScope;
                final Function2<ta2, q22<? super Unit>, Object> function2 = this.$block;
                this.L$0 = objectRef3;
                this.L$1 = objectRef;
                this.L$2 = state;
                this.L$3 = lifecycle;
                this.L$4 = ta2Var;
                this.L$5 = function2;
                this.label = 1;
                final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(kotlin.coroutines.intrinsics.a.d(this), 1);
                eVar.G();
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                final Lifecycle.Event eventC = companion.c(state);
                final Lifecycle.Event eventA = companion.a(state);
                final x58 x58VarB = a68.b(false, 1, (Object) null);
                i iVar3 = new i() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
                    @lq2(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
                        final /* synthetic */ Function2<ta2, q22<? super Unit>, Object> $block;
                        final /* synthetic */ x58 $mutex;
                        Object L$0;
                        Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(x58 x58Var, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, q22<? super AnonymousClass1> q22Var) {
                            super(2, q22Var);
                            this.$mutex = x58Var;
                            this.$block = function2;
                        }

                        public final q22<Unit> create(Object obj, q22<?> q22Var) {
                            return new AnonymousClass1(this.$mutex, this.$block, q22Var);
                        }

                        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object obj) throws Throwable {
                            x58 x58Var;
                            Function2<ta2, q22<? super Unit>, Object> function2;
                            x58 x58Var2;
                            Throwable th;
                            Object objG = kotlin.coroutines.intrinsics.a.g();
                            int i = this.label;
                            try {
                                if (i == 0) {
                                    kotlin.f.b(obj);
                                    x58Var = this.$mutex;
                                    function2 = this.$block;
                                    this.L$0 = x58Var;
                                    this.L$1 = function2;
                                    this.label = 1;
                                    if (x58Var.g((Object) null, this) != objG) {
                                    }
                                    return objG;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    x58Var2 = (x58) this.L$0;
                                    try {
                                        kotlin.f.b(obj);
                                        Unit unit = Unit.a;
                                        x58Var2.h((Object) null);
                                        return Unit.a;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        x58Var2.h((Object) null);
                                        throw th;
                                    }
                                }
                                function2 = (Function2) this.L$1;
                                x58 x58Var3 = (x58) this.L$0;
                                kotlin.f.b(obj);
                                x58Var = x58Var3;
                                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                                this.L$0 = x58Var;
                                this.L$1 = null;
                                this.label = 2;
                                if (kotlinx.coroutines.j.g(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != objG) {
                                    x58Var2 = x58Var;
                                    Unit unit2 = Unit.a;
                                    x58Var2.h((Object) null);
                                    return Unit.a;
                                }
                                return objG;
                            } catch (Throwable th3) {
                                x58Var2 = x58Var;
                                th = th3;
                                x58Var2.h((Object) null);
                                throw th;
                            }
                        }
                    }

                    @Override // androidx.lifecycle.i
                    public final void d6(n17 n17Var, Lifecycle.Event event) {
                        Intrinsics.checkNotNullParameter(n17Var, "<unused var>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == eventC) {
                            objectRef3.element = rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(x58VarB, function2, null), 3, (Object) null);
                            return;
                        }
                        if (event == eventA) {
                            kotlinx.coroutines.s sVar3 = (kotlinx.coroutines.s) objectRef3.element;
                            if (sVar3 != null) {
                                kotlinx.coroutines.s.a.a(sVar3, (CancellationException) null, 1, (Object) null);
                            }
                            objectRef3.element = null;
                        }
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            g41<Unit> g41Var = eVar;
                            Result.a aVar = Result.a;
                            g41Var.resumeWith(Result.b(Unit.a));
                        }
                    }
                };
                objectRef.element = iVar3;
                Intrinsics.h(iVar3, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
                lifecycle.c(iVar3);
                Object objY = eVar.y();
                if (objY == kotlin.coroutines.intrinsics.a.g()) {
                    oq2.c(this);
                }
                if (objY == objG) {
                    return objG;
                }
                objectRef2 = objectRef3;
                sVar2 = (kotlinx.coroutines.s) objectRef2.element;
                if (sVar2 != null) {
                    kotlinx.coroutines.s.a.a(sVar2, (CancellationException) null, 1, (Object) null);
                }
                iVar2 = (i) objectRef.element;
                if (iVar2 != null) {
                    this.$this_repeatOnLifecycle.g(iVar2);
                }
                return Unit.a;
            } catch (Throwable th3) {
                th = th3;
                objectRef2 = objectRef3;
                sVar = (kotlinx.coroutines.s) objectRef2.element;
                if (sVar != null) {
                    kotlinx.coroutines.s.a.a(sVar, (CancellationException) null, 1, (Object) null);
                }
                iVar = (i) objectRef.element;
                if (iVar != null) {
                    throw th;
                }
                this.$this_repeatOnLifecycle.g(iVar);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2<? super ta2, ? super q22<? super Unit>, ? extends Object> function2, q22<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> q22Var) {
        super(2, q22Var);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, q22Var);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            ta2 ta2Var = (ta2) this.L$0;
            fe7 fe7VarT0 = fc3.c().t0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, ta2Var, this.$block, null);
            this.label = 1;
            if (rw0.g(fe7VarT0, anonymousClass1, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return Unit.a;
    }
}
