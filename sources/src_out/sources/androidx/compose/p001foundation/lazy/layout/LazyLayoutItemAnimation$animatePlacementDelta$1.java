package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.g16;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend", v = 1)
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ xa4<g16> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, xa4<g16> xa4Var, long j, q22<? super LazyLayoutItemAnimation$animatePlacementDelta$1> q22Var) {
        super(2, q22Var);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = xa4Var;
        this.$totalDelta = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LazyLayoutItemAnimation lazyLayoutItemAnimation, long j, Animatable animatable) {
        lazyLayoutItemAnimation.H(g16.n(((g16) animatable.m()).getPackedValue(), j));
        lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (androidx.compose.p000animation.core.Animatable.f(r12, r4, r5, null, r7, r8, 4, null) == r0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.f.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r8 = r11
            goto Lb0
        L14:
            r8 = r11
            goto Lbb
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            java.lang.Object r1 = r11.L$0
            com.google.android.xa4 r1 = (com.google.inputmethod.xa4) r1
            kotlin.f.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            goto L6c
        L27:
            kotlin.f.b(r12)
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 == 0) goto L45
            com.google.android.xa4<com.google.android.g16> r12 = r11.$spec     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r1 = r12 instanceof com.google.inputmethod.w2c     // Catch: java.util.concurrent.CancellationException -> L14
            if (r1 == 0) goto L3f
            com.google.android.w2c r12 = (com.google.inputmethod.w2c) r12     // Catch: java.util.concurrent.CancellationException -> L14
            goto L43
        L3f:
            com.google.android.w2c r12 = com.google.inputmethod.dt6.a()     // Catch: java.util.concurrent.CancellationException -> L14
        L43:
            r1 = r12
            goto L48
        L45:
            com.google.android.xa4<com.google.android.g16> r12 = r11.$spec     // Catch: java.util.concurrent.CancellationException -> L14
            goto L43
        L48:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            boolean r12 = r12.p()     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 != 0) goto L75
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            long r4 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L14
            com.google.android.g16 r4 = com.google.inputmethod.g16.c(r4)     // Catch: java.util.concurrent.CancellationException -> L14
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L14
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L14
            java.lang.Object r12 = r12.t(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L14
            if (r12 != r0) goto L6c
            r8 = r11
            goto Laf
        L6c:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            kotlin.jvm.functions.Function0 r12 = androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L14
        L75:
            r5 = r1
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            java.lang.Object r12 = r12.m()     // Catch: java.util.concurrent.CancellationException -> L14
            com.google.android.g16 r12 = (com.google.inputmethod.g16) r12     // Catch: java.util.concurrent.CancellationException -> L14
            long r3 = r12.getPackedValue()     // Catch: java.util.concurrent.CancellationException -> L14
            long r6 = r11.$totalDelta     // Catch: java.util.concurrent.CancellationException -> L14
            long r3 = com.google.inputmethod.g16.n(r3, r6)     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.animation.core.Animatable r12 = androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.c(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            r6 = r3
            com.google.android.g16 r4 = com.google.inputmethod.g16.c(r6)     // Catch: java.util.concurrent.CancellationException -> L14
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r1 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L14
            r8 = r6
            androidx.compose.foundation.lazy.layout.c r7 = new androidx.compose.foundation.lazy.layout.c     // Catch: java.util.concurrent.CancellationException -> L14
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L14
            r1 = 0
            r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L14
            r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L14
            r6 = 0
            r9 = 4
            r10 = 0
            r8 = r11
            r3 = r12
            java.lang.Object r12 = androidx.compose.p000animation.core.Animatable.f(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lbb
            if (r12 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> Lbb
            r0 = 0
            androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.h(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r12 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> Lbb
            androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.j(r12, r0)     // Catch: java.util.concurrent.CancellationException -> Lbb
        Lbb:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
