package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
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
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.ThumbNode$measure$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", l = {272}, m = "invokeSuspend")
final class C0206ThumbNode$measure$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ float $size;
    int label;
    final /* synthetic */ ThumbNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0206ThumbNode$measure$1(ThumbNode thumbNode, float f, q22<? super C0206ThumbNode$measure$1> q22Var) {
        super(2, q22Var);
        this.this$0 = thumbNode;
        this.$size = f;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0206ThumbNode$measure$1(this.this$0, this.$size, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Animatable animatable = this.this$0.sizeAnim;
            if (animatable != null) {
                Float fD = ut0.d(this.$size);
                xa4<Float> xa4VarR3 = this.this$0.isPressed ? t1.f : this.this$0.r3();
                this.label = 1;
                obj = Animatable.f(animatable, fD, xa4VarR3, null, null, this, 12, null);
                if (obj == objG) {
                    return objG;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return Unit.a;
    }
}
