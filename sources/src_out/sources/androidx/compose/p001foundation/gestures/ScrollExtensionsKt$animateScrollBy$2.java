package androidx.compose.p001foundation.gestures;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.kr;
import com.google.inputmethod.p9b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/p9b;", "", "<anonymous>", "(Lcom/google/android/p9b;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend", v = 1)
final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements Function2<p9b, q22<? super Unit>, Object> {
    final /* synthetic */ kr<Float> $animationSpec;
    final /* synthetic */ Ref.FloatRef $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$animateScrollBy$2(float f, kr<Float> krVar, Ref.FloatRef floatRef, q22<? super ScrollExtensionsKt$animateScrollBy$2> q22Var) {
        super(2, q22Var);
        this.$value = f;
        this.$animationSpec = krVar;
        this.$previousValue = floatRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Ref.FloatRef floatRef, p9b p9bVar, float f, float f2) {
        float f3 = floatRef.element;
        floatRef.element = f3 + p9bVar.e(f - f3);
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, q22Var);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final p9b p9bVar = (p9b) this.L$0;
            float f = this.$value;
            kr<Float> krVar = this.$animationSpec;
            final Ref.FloatRef floatRef = this.$previousValue;
            Function2 function2 = new Function2() { // from class: androidx.compose.foundation.gestures.q
                public final Object invoke(Object obj2, Object obj3) {
                    return ScrollExtensionsKt$animateScrollBy$2.m(floatRef, p9bVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.m(0.0f, f, 0.0f, krVar, function2, this, 4, null) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object invoke(p9b p9bVar, q22<? super Unit> q22Var) {
        return create(p9bVar, q22Var).invokeSuspend(Unit.a);
    }
}
