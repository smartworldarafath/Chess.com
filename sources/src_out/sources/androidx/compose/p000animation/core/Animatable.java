package androidx.compose.p000animation.core;

import androidx.compose.p004runtime.s0;
import com.google.android.q22;
import com.google.inputmethod.AnimationResult;
import com.google.inputmethod.AnimationState;
import com.google.inputmethod.aq;
import com.google.inputmethod.hr;
import com.google.inputmethod.kr;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qr;
import com.google.inputmethod.rr;
import com.google.inputmethod.sr;
import com.google.inputmethod.tjd;
import com.google.inputmethod.ur;
import com.google.inputmethod.w2c;
import com.google.inputmethod.zq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B;\b\u0007\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJZ\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJb\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u001b\u001a\u00028\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u000f\u001a\u00028\u00002\"\b\u0002\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R+\u0010>\u001a\u0002072\u0006\u00108\u001a\u0002078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010\u001b\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010ER \u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u0012\u0004\bM\u0010\u001aR\u001a\u0010P\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b4\u0010L\u0012\u0004\bO\u0010\u001aR\u0016\u0010Q\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010LR\u0016\u0010R\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010LR\u0011\u0010\u0016\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bS\u0010AR\u0011\u0010V\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010A¨\u0006Y"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Lcom/google/android/ur;", "V", "", "initialValue", "Lcom/google/android/tjd;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Lcom/google/android/tjd;Ljava/lang/Object;Ljava/lang/String;)V", "Lcom/google/android/zq;", "animation", "initialVelocity", "Lkotlin/Function1;", "", "block", "Lcom/google/android/ir;", "q", "(Lcom/google/android/zq;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "value", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "()V", "targetValue", "Lcom/google/android/kr;", "animationSpec", "e", "(Ljava/lang/Object;Lcom/google/android/kr;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;Lcom/google/android/q22;)Ljava/lang/Object;", "u", "(Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/q6c;", "g", "()Lcom/google/android/q6c;", "a", "Lcom/google/android/tjd;", "l", "()Lcom/google/android/tjd;", "b", "Ljava/lang/Object;", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lcom/google/android/nr;", "d", "Lcom/google/android/nr;", "j", "()Lcom/google/android/nr;", "internalState", "", "<set-?>", "Lcom/google/android/o58;", "p", "()Z", "r", "(Z)V", "isRunning", "f", "k", "()Ljava/lang/Object;", "s", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/MutatorMutex;", "Landroidx/compose/animation/core/MutatorMutex;", "mutatorMutex", "Lcom/google/android/w2c;", "Lcom/google/android/w2c;", "getDefaultSpringSpec$animation_core", "()Lcom/google/android/w2c;", "defaultSpringSpec", "Lcom/google/android/ur;", "getNegativeInfinityBounds$annotations", "negativeInfinityBounds", "getPositiveInfinityBounds$annotations", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "m", "o", "()Lcom/google/android/ur;", "velocityVector", "n", "velocity", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Animatable<T, V extends ur> {
    public static final int m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final tjd<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final T visibilityThreshold;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AnimationState<T, V> internalState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final o58 isRunning;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58 targetValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final MutatorMutex mutatorMutex;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final w2c<T> defaultSpringSpec;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final V negativeInfinityBounds;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final V positiveInfinityBounds;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private V lowerBoundVector;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private V upperBoundVector;

    public Animatable(T t, tjd<T, V> tjdVar, T t2, String str) {
        this.typeConverter = tjdVar;
        this.visibilityThreshold = t2;
        this.label = str;
        this.internalState = new AnimationState<>(tjdVar, t, null, 0L, 0L, false, 60, null);
        this.isRunning = s0.e(Boolean.FALSE, null, 2, null);
        this.targetValue = s0.e(t, null, 2, null);
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new w2c<>(0.0f, 0.0f, t2, 3, null);
        ur urVarO = o();
        V v = urVarO instanceof qr ? aq.e : urVarO instanceof rr ? aq.f : urVarO instanceof sr ? aq.g : aq.h;
        Intrinsics.h(v, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = v;
        ur urVarO2 = o();
        V v2 = urVarO2 instanceof qr ? aq.a : urVarO2 instanceof rr ? aq.b : urVarO2 instanceof sr ? aq.c : aq.d;
        Intrinsics.h(v2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = v2;
        this.lowerBoundVector = v;
        this.upperBoundVector = v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(Animatable animatable, Object obj, kr krVar, Object obj2, Function1 function1, q22 q22Var, int i, Object obj3) {
        if ((i & 2) != 0) {
            krVar = animatable.defaultSpringSpec;
        }
        kr krVar2 = krVar;
        if ((i & 4) != 0) {
            obj2 = animatable.n();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            function1 = null;
        }
        return animatable.e(obj, krVar2, obj4, function1, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T h(T value) {
        if (Intrinsics.e(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.e(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        ur urVar = (ur) this.typeConverter.a().invoke(value);
        int size = urVar.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (urVar.a(i) < this.lowerBoundVector.a(i) || urVar.a(i) > this.upperBoundVector.a(i)) {
                urVar.e(i, g.n(urVar.a(i), this.lowerBoundVector.a(i), this.upperBoundVector.a(i)));
                z = true;
            }
        }
        return z ? (T) this.typeConverter.b().invoke(urVar) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.t().d();
        animationState.x(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(zq<T, V> zqVar, T t, Function1<? super Animatable<T, V>, Unit> function1, q22<? super AnimationResult<T, V>> q22Var) {
        return MutatorMutex.e(this.mutatorMutex, null, new Animatable$runAnimation$2(this, t, zqVar, this.internalState.getLastFrameTimeNanos(), function1, null), q22Var, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(T t) {
        this.targetValue.setValue(t);
    }

    public final Object e(T t, kr<T> krVar, T t2, Function1<? super Animatable<T, V>, Unit> function1, q22<? super AnimationResult<T, V>> q22Var) {
        return q(hr.a(krVar, this.typeConverter, m(), t, t2), t2, function1, q22Var);
    }

    public final q6c<T> g() {
        return this.internalState;
    }

    public final AnimationState<T, V> j() {
        return this.internalState;
    }

    public final T k() {
        return this.targetValue.getValue();
    }

    public final tjd<T, V> l() {
        return this.typeConverter;
    }

    public final T m() {
        return this.internalState.getValue();
    }

    public final T n() {
        return (T) this.typeConverter.b().invoke(o());
    }

    public final V o() {
        return (V) this.internalState.t();
    }

    public final boolean p() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object t(T t, q22<? super Unit> q22Var) {
        Object objE = MutatorMutex.e(this.mutatorMutex, null, new Animatable$snapTo$2(this, t, null), q22Var, 1, null);
        return objE == a.g() ? objE : Unit.a;
    }

    public final Object u(q22<? super Unit> q22Var) {
        Object objE = MutatorMutex.e(this.mutatorMutex, null, new Animatable$stop$2(this, null), q22Var, 1, null);
        return objE == a.g() ? objE : Unit.a;
    }

    public /* synthetic */ Animatable(Object obj, tjd tjdVar, Object obj2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, tjdVar, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }
}
