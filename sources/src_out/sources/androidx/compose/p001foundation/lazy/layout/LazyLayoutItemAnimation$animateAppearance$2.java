package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend", v = 1)
final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ GraphicsLayer $layer;
    final /* synthetic */ boolean $shouldResetValue;
    final /* synthetic */ xa4<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animateAppearance$2(boolean z, LazyLayoutItemAnimation lazyLayoutItemAnimation, xa4<Float> xa4Var, GraphicsLayer graphicsLayer, q22<? super LazyLayoutItemAnimation$animateAppearance$2> q22Var) {
        super(2, q22Var);
        this.$shouldResetValue = z;
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = xa4Var;
        this.$layer = graphicsLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(GraphicsLayer graphicsLayer, LazyLayoutItemAnimation lazyLayoutItemAnimation, Animatable animatable) {
        graphicsLayer.K(((Number) animatable.m()).floatValue());
        lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r13 == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlin.f.b(r13)     // Catch: java.lang.Throwable -> L14
            r9 = r12
            goto L64
        L14:
            r0 = move-exception
            r13 = r0
            r9 = r12
            goto L74
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            kotlin.f.b(r13)     // Catch: java.lang.Throwable -> L14
            goto L40
        L24:
            kotlin.f.b(r13)
            boolean r13 = r12.$shouldResetValue     // Catch: java.lang.Throwable -> L71
            if (r13 == 0) goto L40
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r12.this$0     // Catch: java.lang.Throwable -> L14
            androidx.compose.animation.core.Animatable r13 = androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.d(r13)     // Catch: java.lang.Throwable -> L14
            r1 = 0
            java.lang.Float r1 = com.google.android.ut0.d(r1)     // Catch: java.lang.Throwable -> L14
            r12.label = r4     // Catch: java.lang.Throwable -> L14
            java.lang.Object r13 = r13.t(r1, r12)     // Catch: java.lang.Throwable -> L14
            if (r13 != r0) goto L40
            r9 = r12
            goto L63
        L40:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r12.this$0     // Catch: java.lang.Throwable -> L71
            androidx.compose.animation.core.Animatable r4 = androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.d(r13)     // Catch: java.lang.Throwable -> L71
            r13 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r5 = com.google.android.ut0.d(r13)     // Catch: java.lang.Throwable -> L71
            com.google.android.xa4<java.lang.Float> r6 = r12.$spec     // Catch: java.lang.Throwable -> L71
            androidx.compose.ui.graphics.layer.GraphicsLayer r13 = r12.$layer     // Catch: java.lang.Throwable -> L71
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r1 = r12.this$0     // Catch: java.lang.Throwable -> L71
            androidx.compose.foundation.lazy.layout.a r8 = new androidx.compose.foundation.lazy.layout.a     // Catch: java.lang.Throwable -> L71
            r8.<init>()     // Catch: java.lang.Throwable -> L71
            r12.label = r3     // Catch: java.lang.Throwable -> L71
            r7 = 0
            r10 = 4
            r11 = 0
            r9 = r12
            java.lang.Object r13 = androidx.compose.p000animation.core.Animatable.f(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6e
            if (r13 != r0) goto L64
        L63:
            return r0
        L64:
            com.google.android.ir r13 = (com.google.inputmethod.AnimationResult) r13     // Catch: java.lang.Throwable -> L6e
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r9.this$0
            androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.e(r13, r2)
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        L6e:
            r0 = move-exception
        L6f:
            r13 = r0
            goto L74
        L71:
            r0 = move-exception
            r9 = r12
            goto L6f
        L74:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r9.this$0
            androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation.e(r0, r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
