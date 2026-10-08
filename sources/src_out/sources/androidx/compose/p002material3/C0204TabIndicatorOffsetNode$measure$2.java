package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ff3;
import com.google.inputmethod.qr;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.TabIndicatorOffsetNode$measure$2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", l = {715}, m = "invokeSuspend")
final class C0204TabIndicatorOffsetNode$measure$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ float $currentTabWidth;
    final /* synthetic */ Animatable<ff3, qr> $widthAnim;
    int label;
    final /* synthetic */ TabIndicatorOffsetNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0204TabIndicatorOffsetNode$measure$2(Animatable<ff3, qr> animatable, float f, TabIndicatorOffsetNode tabIndicatorOffsetNode, q22<? super C0204TabIndicatorOffsetNode$measure$2> q22Var) {
        super(2, q22Var);
        this.$widthAnim = animatable;
        this.$currentTabWidth = f;
        this.this$0 = tabIndicatorOffsetNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0204TabIndicatorOffsetNode$measure$2(this.$widthAnim, this.$currentTabWidth, this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Animatable<ff3, qr> animatable = this.$widthAnim;
            ff3 ff3VarE = ff3.e(this.$currentTabWidth);
            xa4<ff3> xa4VarO3 = this.this$0.o3();
            this.label = 1;
            if (Animatable.f(animatable, ff3VarE, xa4VarO3, null, null, this, 12, null) == objG) {
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
}
