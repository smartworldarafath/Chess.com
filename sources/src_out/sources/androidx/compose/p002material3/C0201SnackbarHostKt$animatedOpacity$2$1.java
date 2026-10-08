package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import com.google.inputmethod.kr;
import com.google.inputmethod.qr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", l = {409}, m = "invokeSuspend")
final class C0201SnackbarHostKt$animatedOpacity$2$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, qr> $alpha;
    final /* synthetic */ kr<Float> $animation;
    final /* synthetic */ Function0<Unit> $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0201SnackbarHostKt$animatedOpacity$2$1(Animatable<Float, qr> animatable, boolean z, kr<Float> krVar, Function0<Unit> function0, q22<? super C0201SnackbarHostKt$animatedOpacity$2$1> q22Var) {
        super(2, q22Var);
        this.$alpha = animatable;
        this.$visible = z;
        this.$animation = krVar;
        this.$onAnimationFinish = function0;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0201SnackbarHostKt$animatedOpacity$2$1(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        C0201SnackbarHostKt$animatedOpacity$2$1 c0201SnackbarHostKt$animatedOpacity$2$1;
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Animatable<Float, qr> animatable = this.$alpha;
            Float fD = ut0.d(this.$visible ? 1.0f : 0.0f);
            kr<Float> krVar = this.$animation;
            this.label = 1;
            c0201SnackbarHostKt$animatedOpacity$2$1 = this;
            if (Animatable.f(animatable, fD, krVar, null, null, c0201SnackbarHostKt$animatedOpacity$2$1, 12, null) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            c0201SnackbarHostKt$animatedOpacity$2$1 = this;
        }
        c0201SnackbarHostKt$animatedOpacity$2$1.$onAnimationFinish.invoke();
        return Unit.a;
    }
}
