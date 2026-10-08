package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend", v = 1)
final class LazyLayoutItemAnimation$animateDisappearance$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ GraphicsLayer $layer;
    final /* synthetic */ xa4<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animateDisappearance$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, xa4<Float> xa4Var, GraphicsLayer graphicsLayer, q22<? super LazyLayoutItemAnimation$animateDisappearance$1> q22Var) {
        super(2, q22Var);
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
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.this$0, this.$spec, this.$layer, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        LazyLayoutItemAnimation$animateDisappearance$1 lazyLayoutItemAnimation$animateDisappearance$1;
        Throwable th;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            try {
                Animatable animatable = this.this$0.visibilityAnimation;
                Float fD = ut0.d(0.0f);
                xa4<Float> xa4Var = this.$spec;
                final GraphicsLayer graphicsLayer = this.$layer;
                final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.this$0;
                Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.b
                    public final Object invoke(Object obj2) {
                        return LazyLayoutItemAnimation$animateDisappearance$1.l(graphicsLayer, lazyLayoutItemAnimation, (Animatable) obj2);
                    }
                };
                this.label = 1;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                try {
                    if (Animatable.f(animatable, fD, xa4Var, null, function1, lazyLayoutItemAnimation$animateDisappearance$1, 4, null) == objG) {
                        return objG;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    lazyLayoutItemAnimation$animateDisappearance$1.this$0.B(false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                th = th;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.B(false);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                f.b(obj);
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
            } catch (Throwable th4) {
                th = th4;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.B(false);
                throw th;
            }
        }
        lazyLayoutItemAnimation$animateDisappearance$1.this$0.A(true);
        lazyLayoutItemAnimation$animateDisappearance$1.this$0.B(false);
        return Unit.a;
    }
}
