package androidx.compose.p000animation.core;

import androidx.compose.animation.core.Transition.a;
import androidx.compose.animation.core.Transition.d;
import androidx.compose.p000animation.core.SeekableTransitionState;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.j;
import com.google.android.r43;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.ia;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.or;
import com.google.inputmethod.q6c;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.tjd;
import com.google.inputmethod.ur;
import com.google.inputmethod.vn3;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ao\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 \u001ak\u0010$\u001a\u00020#\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!R\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0003¢\u0006\u0004\b$\u0010%\"$\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0004\u0012\u00020#0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"T", "targetState", "", "label", "Landroidx/compose/animation/core/Transition;", "y", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/d;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/g;", "transitionState", "t", "(Landroidx/compose/animation/core/g;Ljava/lang/String;Landroidx/compose/runtime/d;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/e;", "x", "(Landroidx/compose/animation/core/e;Ljava/lang/String;Landroidx/compose/runtime/d;II)Landroidx/compose/animation/core/Transition;", "S", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "typeConverter", "Landroidx/compose/animation/core/Transition$a;", "p", "(Landroidx/compose/animation/core/Transition;Lcom/google/android/tjd;Ljava/lang/String;Landroidx/compose/runtime/d;II)Landroidx/compose/animation/core/Transition$a;", "initialState", "childLabel", "n", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/d;I)Landroidx/compose/animation/core/Transition;", "initialValue", "targetValue", "Lcom/google/android/xa4;", "animationSpec", "Lcom/google/android/q6c;", "r", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/xa4;Lcom/google/android/tjd;Ljava/lang/String;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "Landroidx/compose/animation/core/Transition$d;", "transitionAnimation", "", "k", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$d;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/xa4;Landroidx/compose/runtime/d;I)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/SeekableTransitionState;", "a", "Lkotlin/jvm/functions/Function1;", "SeekableTransitionStateTotalDurationChanged", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TransitionKt {
    private static final Function1<SeekableTransitionState<?>, Unit> a = new Function1() { // from class: com.google.android.ifd
        public final Object invoke(Object obj) {
            return TransitionKt.j((SeekableTransitionState) obj);
        }
    };

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/core/TransitionKt$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ Transition a;
        final /* synthetic */ Transition b;

        public a(Transition transition, Transition transition2) {
            this.a = transition;
            this.b = transition2;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.K(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/core/TransitionKt$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ Transition a;
        final /* synthetic */ Transition.a b;

        public b(Transition transition, Transition.a aVar) {
            this.a = transition;
            this.b = aVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.I(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/core/TransitionKt$c", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements jd3 {
        final /* synthetic */ Transition a;
        final /* synthetic */ Transition.d b;

        public c(Transition transition, Transition.d dVar) {
            this.a = transition;
            this.b = dVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.J(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/core/TransitionKt$d", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements jd3 {
        final /* synthetic */ g a;

        public d(g gVar) {
            this.a = gVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            ((SeekableTransitionState) this.a).X(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/core/TransitionKt$e", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements jd3 {
        final /* synthetic */ Transition a;

        public e(Transition transition) {
            this.a = transition;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.D();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/core/TransitionKt$f", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements jd3 {
        final /* synthetic */ Transition a;

        public f(Transition transition) {
            this.a = transition;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            this.a.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(SeekableTransitionState seekableTransitionState) {
        seekableTransitionState.N();
        return Unit.a;
    }

    private static final <S, T, V extends ur> void k(final Transition<S> transition, final Transition<S>.d<T, V> dVar, final T t, final T t2, final xa4<T> xa4Var, androidx.compose.p004runtime.d dVar2, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar2.F(867041821);
        if ((i & 6) == 0) {
            i2 = (dVarF.x(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.x(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? dVarF.x(t) : dVarF.T(t) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? dVarF.x(t2) : dVarF.T(t2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? dVarF.x(xa4Var) : dVarF.T(xa4Var) ? 16384 : 8192;
        }
        if (dVarF.g((i2 & 9363) != 9362, i2 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(867041821, i2, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1927)");
            }
            if (transition.B()) {
                dVar.R(t, t2, xa4Var);
            } else {
                dVar.T(t2, xa4Var);
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.mfd
                public final Object invoke(Object obj, Object obj2) {
                    return TransitionKt.l(transition, dVar, t, t2, xa4Var, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Transition transition, Transition.d dVar, Object obj, Object obj2, xa4 xa4Var, int i, androidx.compose.p004runtime.d dVar2, int i2) {
        k(transition, dVar, obj, obj2, xa4Var, dVar2, saa.a(i | 1));
        return Unit.a;
    }

    public static final <S, T> Transition<T> n(final Transition<S> transition, T t, T t2, String str, androidx.compose.p004runtime.d dVar, int i) {
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(-198307638, i, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1800)");
        }
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && dVar.x(transition)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z2 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR = new Transition(new androidx.compose.p000animation.core.e(t), transition, transition.getLabel() + " > " + str);
            dVar.L(objR);
        }
        final Transition<T> transition2 = (Transition) objR;
        if ((i2 <= 4 || !dVar.x(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean zX = dVar.x(transition2) | z;
        Object objR2 = dVar.R();
        if (zX || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR2 = new Function1() { // from class: com.google.android.gfd
                public final Object invoke(Object obj) {
                    return TransitionKt.o(transition, transition2, (kd3) obj);
                }
            };
            dVar.L(objR2);
        }
        vn3.c(transition2, (Function1) objR2, dVar, 0);
        if (transition.B()) {
            transition2.M(t, t2, transition.getLastSeekedTimeNanos());
        } else {
            transition2.Y(t2);
            transition2.Q(false);
        }
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return transition2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 o(Transition transition, Transition transition2, kd3 kd3Var) {
        transition.g(transition2);
        return new a(transition, transition2);
    }

    public static final <S, T, V extends ur> Transition<S>.a<T, V> p(final Transition<S> transition, tjd<T, V> tjdVar, String str, androidx.compose.p004runtime.d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(-1714122528, i, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1758)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && dVar.x(transition)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z2 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR = transition.new a(tjdVar, str);
            dVar.L(objR);
        }
        final Transition<S>.a<T, V> aVar = (Transition.a) objR;
        if ((i3 <= 4 || !dVar.x(transition)) && (i & 6) != 4) {
            z = false;
        }
        boolean zT = dVar.T(aVar) | z;
        Object objR2 = dVar.R();
        if (zT || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR2 = new Function1() { // from class: com.google.android.hfd
                public final Object invoke(Object obj) {
                    return TransitionKt.q(transition, aVar, (kd3) obj);
                }
            };
            dVar.L(objR2);
        }
        vn3.c(aVar, (Function1) objR2, dVar, 0);
        if (transition.B()) {
            aVar.d();
        }
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 q(Transition transition, Transition.a aVar, kd3 kd3Var) {
        return new b(transition, aVar);
    }

    public static final <S, T, V extends ur> q6c<T> r(final Transition<S> transition, T t, T t2, xa4<T> xa4Var, tjd<T, V> tjdVar, String str, androidx.compose.p004runtime.d dVar, int i) throws Throwable {
        g gVar;
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(-304821198, i, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1889)");
        }
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && dVar.x(transition)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            g.Companion companion = g.INSTANCE;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                gVar = gVarE;
                try {
                    Object dVar2 = transition.new d(t, or.i(tjdVar, t2), tjdVar, str);
                    companion.l(gVarD, gVar, function1G);
                    dVar.L(dVar2);
                    objR = dVar2;
                } catch (Throwable th) {
                    th = th;
                    companion.l(gVarD, gVar, function1G);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gVar = gVarE;
            }
        }
        final Transition.d dVar3 = (Transition.d) objR;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        k(transition, dVar3, t, t2, xa4Var, dVar, (i4 << 9) | (i4 << 6) | i2 | (i5 & 896) | (i5 & 7168) | (57344 & i5));
        boolean zX = dVar.x(dVar3) | ((i3 > 4 && dVar.x(transition)) || (i & 6) == 4);
        Object objR2 = dVar.R();
        if (zX || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR2 = new Function1() { // from class: com.google.android.kfd
                public final Object invoke(Object obj) {
                    return TransitionKt.s(transition, dVar3, (kd3) obj);
                }
            };
            dVar.L(objR2);
        }
        vn3.c(dVar3, (Function1) objR2, dVar, 0);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return dVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 s(Transition transition, Transition.d dVar, kd3 kd3Var) {
        transition.f(dVar);
        return new c(transition, dVar);
    }

    public static final <T> Transition<T> t(final g<T> gVar, String str, androidx.compose.p004runtime.d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(1643203617, i, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:811)");
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && dVar.x(gVar)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z2 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            g.Companion companion = g.INSTANCE;
            g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            g gVarE = companion.e(gVarD);
            try {
                Object transition = new Transition((g) gVar, str);
                companion.l(gVarD, gVarE, function1G);
                dVar.L(transition);
                objR = transition;
            } catch (Throwable th) {
                companion.l(gVarD, gVarE, function1G);
                throw th;
            }
        }
        final Transition<T> transition2 = (Transition) objR;
        if (gVar instanceof SeekableTransitionState) {
            dVar.y(-1357590553);
            Object objR2 = dVar.R();
            androidx.compose.p004runtime.d.Companion companion2 = androidx.compose.p004runtime.d.INSTANCE;
            if (objR2 == companion2.a()) {
                objR2 = vn3.k(EmptyCoroutineContext.a, dVar);
                dVar.L(objR2);
            }
            final ta2 ta2Var = (ta2) objR2;
            boolean zT = dVar.T(ta2Var) | ((i3 > 4 && dVar.x(gVar)) || (i & 6) == 4);
            Object objR3 = dVar.R();
            if (zT || objR3 == companion2.a()) {
                objR3 = new Function1() { // from class: com.google.android.efd
                    public final Object invoke(Object obj) {
                        return TransitionKt.u(gVar, ta2Var, (kd3) obj);
                    }
                };
                dVar.L(objR3);
            }
            vn3.c(ta2Var, (Function1) objR3, dVar, 0);
            SeekableTransitionState seekableTransitionState = (SeekableTransitionState) gVar;
            Object objA = seekableTransitionState.a();
            Object objB = seekableTransitionState.b();
            if ((i3 <= 4 || !dVar.x(gVar)) && (i & 6) != 4) {
                z = false;
            }
            Object objR4 = dVar.R();
            if (z || objR4 == companion2.a()) {
                objR4 = new TransitionKt$rememberTransition$2$1(gVar, null);
                dVar.L(objR4);
            }
            vn3.f(objA, objB, (Function2) objR4, dVar, 0);
            dVar.u();
        } else {
            dVar.y(-1356604288);
            transition2.h(gVar.b(), dVar, 0);
            dVar.u();
        }
        boolean zX = dVar.x(transition2);
        Object objR5 = dVar.R();
        if (zX || objR5 == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR5 = new Function1() { // from class: com.google.android.ffd
                public final Object invoke(Object obj) {
                    return TransitionKt.w(transition2, (kd3) obj);
                }
            };
            dVar.L(objR5);
        }
        vn3.c(transition2, (Function1) objR5, dVar, 0);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return transition2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 u(g gVar, final ta2 ta2Var, kd3 kd3Var) {
        final Object objA = ia.a();
        ((SeekableTransitionState) gVar).X(new j(new Function1() { // from class: com.google.android.jfd
            public final Object invoke(Object obj) {
                return TransitionKt.v(objA, ta2Var, (Function0) obj);
            }
        }));
        return new d(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Object obj, ta2 ta2Var, Function0 function0) {
        if (obj == ia.a()) {
            function0.invoke();
        } else {
            rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new TransitionKt$rememberTransition$1$1$snapshotStateObserver$1$1(function0, null), 3, (Object) null);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 w(Transition transition, kd3 kd3Var) {
        return new e(transition);
    }

    @r43
    public static final <T> Transition<T> x(androidx.compose.p000animation.core.e<T> eVar, String str, androidx.compose.p004runtime.d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(882913843, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:883)");
        }
        Transition<T> transitionT = t(eVar, str, dVar, i & 126, 0);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return transitionT;
    }

    public static final <T> Transition<T> y(T t, String str, androidx.compose.p004runtime.d dVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(2029166765, i, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:87)");
        }
        Object objR = dVar.R();
        androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
        if (objR == companion.a()) {
            objR = new Transition(t, str);
            dVar.L(objR);
        }
        final Transition<T> transition = (Transition) objR;
        transition.h(t, dVar, (i & 8) | 48 | (i & 14));
        Object objR2 = dVar.R();
        if (objR2 == companion.a()) {
            objR2 = new Function1() { // from class: com.google.android.lfd
                public final Object invoke(Object obj) {
                    return TransitionKt.z(transition, (kd3) obj);
                }
            };
            dVar.L(objR2);
        }
        vn3.c(transition, (Function1) objR2, dVar, 54);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return transition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 z(Transition transition, kd3 kd3Var) {
        return new f(transition);
    }
}
