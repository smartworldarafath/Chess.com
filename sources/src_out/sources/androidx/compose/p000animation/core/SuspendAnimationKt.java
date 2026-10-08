package androidx.compose.p000animation.core;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import androidx.compose.p004runtime.w;
import com.google.android.q22;
import com.google.android.ut0;
import com.google.android.yg4;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.gi9;
import com.google.inputmethod.jr;
import com.google.inputmethod.kr;
import com.google.inputmethod.lmc;
import com.google.inputmethod.lr;
import com.google.inputmethod.rz7;
import com.google.inputmethod.t04;
import com.google.inputmethod.tjd;
import com.google.inputmethod.uq2;
import com.google.inputmethod.ur;
import com.google.inputmethod.vq2;
import com.google.inputmethod.vr;
import com.google.inputmethod.w2e;
import com.google.inputmethod.zq;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001az\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001at\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018\u001aj\u0010\u001a\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\b\b\u0002\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0086@¢\u0006\u0004\b\u001a\u0010\u001b\u001ap\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0080@¢\u0006\u0004\b \u0010!\u001aJ\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010\u000b\"\b\b\u0002\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001c2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u0015H\u0082@¢\u0006\u0004\b$\u0010%\u001aC\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0087\u0001\u0010,\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00002\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0087\u0001\u0010/\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u001e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00020\u00070\u0015H\u0002¢\u0006\u0004\b/\u00100\"\u0018\u0010*\u001a\u00020\u0000*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Lcom/google/android/kr;", "animationSpec", "Lkotlin/Function2;", "", "block", "j", "(FFFLcom/google/android/kr;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "T", "Lcom/google/android/ur;", "V", "Lcom/google/android/tjd;", "typeConverter", "l", "(Lcom/google/android/tjd;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/android/kr;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/nr;", "", "sequentialAnimation", "Lkotlin/Function1;", "Lcom/google/android/jr;", "x", "(Lcom/google/android/nr;Ljava/lang/Object;Lcom/google/android/kr;ZLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/vq2;", "u", "(Lcom/google/android/nr;Lcom/google/android/vq2;ZLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/zq;", "animation", "", "startTimeNanos", "k", "(Lcom/google/android/nr;Lcom/google/android/zq;JLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "R", "onFrame", "A", "(Lcom/google/android/zq;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "state", "F", "(Lcom/google/android/jr;Lcom/google/android/nr;)V", "frameTimeNanos", "durationScale", "anim", "D", "(Lcom/google/android/jr;JFLcom/google/android/zq;Lcom/google/android/nr;Lkotlin/jvm/functions/Function1;)V", "playTimeNanos", "C", "(Lcom/google/android/jr;JJLcom/google/android/zq;Lcom/google/android/nr;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "E", "(Lkotlin/coroutines/CoroutineContext;)F", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SuspendAnimationKt {
    private static final <R, T, V extends ur> Object A(zq<T, V> zqVar, final Function1<? super Long, ? extends R> function1, q22<? super R> q22Var) {
        return zqVar.getIsInfinite() ? InfiniteAnimationPolicyKt.a(function1, q22Var) : w.c(new Function1() { // from class: com.google.android.pgc
            public final Object invoke(Object obj) {
                return SuspendAnimationKt.B(function1, ((Long) obj).longValue());
            }
        }, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object B(Function1 function1, long j) {
        return function1.invoke(Long.valueOf(j));
    }

    private static final <T, V extends ur> void C(jr<T, V> jrVar, long j, long j2, zq<T, V> zqVar, AnimationState<T, V> animationState, Function1<? super jr<T, V>, Unit> function1) {
        jrVar.j(j);
        jrVar.l(zqVar.e(j2));
        jrVar.m(zqVar.g(j2));
        if (zqVar.b(j2)) {
            jrVar.i(jrVar.getLastFrameTimeNanos());
            jrVar.k(false);
        }
        F(jrVar, animationState);
        function1.invoke(jrVar);
    }

    private static final <T, V extends ur> void D(jr<T, V> jrVar, long j, float f, zq<T, V> zqVar, AnimationState<T, V> animationState, Function1<? super jr<T, V>, Unit> function1) {
        C(jrVar, j, f == 0.0f ? zqVar.getDurationNanos() : (long) ((j - jrVar.getStartTimeNanos()) / f), zqVar, animationState, function1);
    }

    public static final float E(CoroutineContext coroutineContext) {
        rz7 rz7Var = (rz7) coroutineContext.get(rz7.INSTANCE);
        float fB0 = rz7Var != null ? rz7Var.B0() : 1.0f;
        if (!(fB0 >= 0.0f)) {
            gi9.b("negative scale factor");
        }
        return fB0;
    }

    public static final <T, V extends ur> void F(jr<T, V> jrVar, AnimationState<T, V> animationState) {
        animationState.B(jrVar.e());
        vr.f(animationState.t(), jrVar.g());
        animationState.w(jrVar.getFinishedTimeNanos());
        animationState.x(jrVar.getLastFrameTimeNanos());
        animationState.A(jrVar.h());
    }

    public static final Object j(float f, float f2, float f3, kr<Float> krVar, Function2<? super Float, ? super Float, Unit> function2, q22<? super Unit> q22Var) {
        Object objL = l(w2e.N(yg4.a), ut0.d(f), ut0.d(f2), ut0.d(f3), krVar, function2, q22Var);
        return objL == a.g() ? objL : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final <T, V extends ur> Object k(final AnimationState<T, V> animationState, zq<T, V> zqVar, long j, final Function1<? super jr<T, V>, Unit> function1, q22<? super Unit> q22Var) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        final Ref.ObjectRef objectRef;
        final AnimationState<T, V> animationState2;
        AnimationState<T, V> animationState3;
        Ref.ObjectRef objectRef2;
        Function1<? super jr<T, V>, Unit> function2;
        jr jrVar;
        jr jrVar2;
        Function1 function3;
        final zq<T, V> zqVar2 = zqVar;
        if (q22Var instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) q22Var;
            int i = suspendAnimationKt$animate$4.label;
            if ((i & t04.INVALID_ID) != 0) {
                suspendAnimationKt$animate$4.label = i - t04.INVALID_ID;
            } else {
                suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(q22Var);
            }
        } else {
            suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(q22Var);
        }
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$5 = suspendAnimationKt$animate$4;
        Object obj = suspendAnimationKt$animate$5.result;
        Object objG = a.g();
        int i2 = suspendAnimationKt$animate$5.label;
        if (i2 == 0) {
            f.b(obj);
            final T tE = zqVar2.e(0L);
            final ur urVarG = zqVar2.g(0L);
            objectRef = new Ref.ObjectRef();
            if (j == Long.MIN_VALUE) {
                try {
                    final float fE = E(suspendAnimationKt$animate$5.getContext());
                    animationState2 = animationState;
                    try {
                        Function1 function4 = new Function1() { // from class: com.google.android.igc
                            public final Object invoke(Object obj2) {
                                return SuspendAnimationKt.q(objectRef, tE, zqVar2, urVarG, animationState2, fE, function1, ((Long) obj2).longValue());
                            }
                        };
                        objectRef2 = objectRef;
                        try {
                            suspendAnimationKt$animate$5.L$0 = animationState2;
                            suspendAnimationKt$animate$5.L$1 = zqVar2;
                            suspendAnimationKt$animate$5.L$2 = function1;
                            suspendAnimationKt$animate$5.L$3 = objectRef2;
                            suspendAnimationKt$animate$5.label = 1;
                            if (A(zqVar2, function4, suspendAnimationKt$animate$5) != objG) {
                                animationState3 = animationState2;
                                function2 = function1;
                                objectRef = objectRef2;
                            }
                            return objG;
                        } catch (CancellationException e) {
                            e = e;
                            animationState3 = animationState2;
                            objectRef = objectRef2;
                            jrVar = (jr) objectRef.element;
                            if (jrVar != null) {
                                jrVar.k(false);
                            }
                            jrVar2 = (jr) objectRef.element;
                            if (jrVar2 != null && jrVar2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                                animationState3.A(false);
                            }
                            throw e;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        animationState3 = animationState2;
                        jrVar = (jr) objectRef.element;
                        if (jrVar != null) {
                            jrVar.k(false);
                        }
                        jrVar2 = (jr) objectRef.element;
                        if (jrVar2 != null) {
                            animationState3.A(false);
                        }
                        throw e;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    animationState2 = animationState;
                }
            } else {
                objectRef2 = objectRef;
                try {
                    jr jrVar3 = new jr(tE, zqVar2.d(), urVarG, j, zqVar2.f(), j, true, new Function0() { // from class: com.google.android.jgc
                        public final Object invoke() {
                            return SuspendAnimationKt.s(animationState);
                        }
                    });
                    D(jrVar3, j, E(suspendAnimationKt$animate$5.getContext()), zqVar2, animationState, function1);
                    objectRef2.element = jrVar3;
                    animationState3 = animationState;
                    zqVar2 = zqVar;
                    function2 = function1;
                    objectRef = objectRef2;
                } catch (CancellationException e4) {
                    e = e4;
                    animationState3 = animationState;
                    objectRef = objectRef2;
                    jrVar = (jr) objectRef.element;
                    if (jrVar != null) {
                        jrVar.k(false);
                    }
                    jrVar2 = (jr) objectRef.element;
                    if (jrVar2 != null) {
                        animationState3.A(false);
                    }
                    throw e;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) suspendAnimationKt$animate$5.L$3;
            function2 = (Function1) suspendAnimationKt$animate$5.L$2;
            zqVar2 = (zq) suspendAnimationKt$animate$5.L$1;
            animationState3 = (AnimationState) suspendAnimationKt$animate$5.L$0;
            try {
                f.b(obj);
            } catch (CancellationException e5) {
                e = e5;
                jrVar = (jr) objectRef.element;
                if (jrVar != null) {
                    jrVar.k(false);
                }
                jrVar2 = (jr) objectRef.element;
                if (jrVar2 != null) {
                    animationState3.A(false);
                }
                throw e;
            }
        }
        do {
            Object obj2 = objectRef.element;
            Intrinsics.g(obj2);
            if (!((jr) obj2).h()) {
                return Unit.a;
            }
            final float fE2 = E(suspendAnimationKt$animate$5.getContext());
            final Ref.ObjectRef objectRef3 = objectRef;
            final Function1<? super jr<T, V>, Unit> function5 = function2;
            final zq<T, V> zqVar3 = zqVar2;
            final AnimationState<T, V> animationState4 = animationState3;
            try {
                function3 = new Function1() { // from class: com.google.android.kgc
                    public final Object invoke(Object obj3) {
                        return SuspendAnimationKt.t(objectRef3, fE2, zqVar3, animationState4, function5, ((Long) obj3).longValue());
                    }
                };
                objectRef = objectRef3;
                zqVar2 = zqVar3;
                animationState3 = animationState4;
                function2 = function5;
                suspendAnimationKt$animate$5.L$0 = animationState3;
                suspendAnimationKt$animate$5.L$1 = zqVar2;
                suspendAnimationKt$animate$5.L$2 = function2;
                suspendAnimationKt$animate$5.L$3 = objectRef;
                suspendAnimationKt$animate$5.label = 2;
            } catch (CancellationException e6) {
                e = e6;
                objectRef = objectRef3;
                animationState3 = animationState4;
                jrVar = (jr) objectRef.element;
                if (jrVar != null) {
                    jrVar.k(false);
                }
                jrVar2 = (jr) objectRef.element;
                if (jrVar2 != null) {
                    animationState3.A(false);
                }
                throw e;
            }
        } while (A(zqVar2, function3, suspendAnimationKt$animate$5) != objG);
        return objG;
    }

    public static final <T, V extends ur> Object l(final tjd<T, V> tjdVar, T t, T t2, T t3, kr<T> krVar, final Function2<? super T, ? super T, Unit> function2, q22<? super Unit> q22Var) {
        ur urVarG;
        if (t3 == null || (urVarG = (ur) tjdVar.a().invoke(t3)) == null) {
            urVarG = vr.g((ur) tjdVar.a().invoke(t));
        }
        ur urVar = urVarG;
        Object objN = n(new AnimationState(tjdVar, t, urVar, 0L, 0L, false, 56, null), new lmc(krVar, tjdVar, t, t2, urVar), 0L, new Function1() { // from class: com.google.android.hgc
            public final Object invoke(Object obj) {
                return SuspendAnimationKt.o(function2, tjdVar, (jr) obj);
            }
        }, q22Var, 2, null);
        return objN == a.g() ? objN : Unit.a;
    }

    public static /* synthetic */ Object m(float f, float f2, float f3, kr krVar, Function2 function2, q22 q22Var, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            krVar = lr.j(0.0f, 0.0f, null, 7, null);
        }
        return j(f, f2, f3, krVar, function2, q22Var);
    }

    public static /* synthetic */ Object n(AnimationState animationState, zq zqVar, long j, Function1 function1, q22 q22Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.google.android.mgc
                public final Object invoke(Object obj2) {
                    return SuspendAnimationKt.p((jr) obj2);
                }
            };
        }
        return k(animationState, zqVar, j2, function1, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function2 function2, tjd tjdVar, jr jrVar) {
        function2.invoke(jrVar.e(), tjdVar.b().invoke(jrVar.g()));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(jr jrVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Ref.ObjectRef objectRef, Object obj, zq zqVar, ur urVar, final AnimationState animationState, float f, Function1 function1, long j) {
        jr jrVar = new jr(obj, zqVar.d(), urVar, j, zqVar.f(), j, true, new Function0() { // from class: com.google.android.ogc
            public final Object invoke() {
                return SuspendAnimationKt.r(animationState);
            }
        });
        D(jrVar, j, f, zqVar, animationState, function1);
        objectRef.element = jrVar;
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(AnimationState animationState) {
        animationState.A(false);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(AnimationState animationState) {
        animationState.A(false);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Ref.ObjectRef objectRef, float f, zq zqVar, AnimationState animationState, Function1 function1, long j) {
        Object obj = objectRef.element;
        Intrinsics.g(obj);
        D((jr) obj, j, f, zqVar, animationState, function1);
        return Unit.a;
    }

    public static final <T, V extends ur> Object u(AnimationState<T, V> animationState, vq2<T> vq2Var, boolean z, Function1<? super jr<T, V>, Unit> function1, q22<? super Unit> q22Var) {
        Object objK = k(animationState, new uq2(vq2Var, animationState.m(), animationState.getValue(), animationState.t()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, q22Var);
        return objK == a.g() ? objK : Unit.a;
    }

    public static /* synthetic */ Object v(AnimationState animationState, vq2 vq2Var, boolean z, Function1 function1, q22 q22Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.google.android.lgc
                public final Object invoke(Object obj2) {
                    return SuspendAnimationKt.w((jr) obj2);
                }
            };
        }
        return u(animationState, vq2Var, z, function1, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(jr jrVar) {
        return Unit.a;
    }

    public static final <T, V extends ur> Object x(AnimationState<T, V> animationState, T t, kr<T> krVar, boolean z, Function1<? super jr<T, V>, Unit> function1, q22<? super Unit> q22Var) {
        Object objK = k(animationState, new lmc(krVar, animationState.m(), animationState.getValue(), t, animationState.t()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, q22Var);
        return objK == a.g() ? objK : Unit.a;
    }

    public static /* synthetic */ Object y(AnimationState animationState, Object obj, kr krVar, boolean z, Function1 function1, q22 q22Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            krVar = lr.j(0.0f, 0.0f, null, 7, null);
        }
        kr krVar2 = krVar;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.google.android.ngc
                public final Object invoke(Object obj3) {
                    return SuspendAnimationKt.z((jr) obj3);
                }
            };
        }
        return x(animationState, obj, krVar2, z2, function1, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(jr jrVar) {
        return Unit.a;
    }
}
