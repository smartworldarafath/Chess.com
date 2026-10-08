package androidx.compose.p001foundation;

import androidx.compose.p001foundation.interaction.a;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.r48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1", f = "Clickable.kt", l = {1903}, m = "invokeSuspend", v = 1)
final class C0149AbstractClickableNode$onFocusChange$2$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ a.b $it;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0149AbstractClickableNode$onFocusChange$2$1(AbstractClickableNode abstractClickableNode, a.b bVar, q22<? super C0149AbstractClickableNode$onFocusChange$2$1> q22Var) {
        super(2, q22Var);
        this.this$0 = abstractClickableNode;
        this.$it = bVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0149AbstractClickableNode$onFocusChange$2$1(this.this$0, this.$it, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            r48 r48Var = this.this$0.interactionSource;
            if (r48Var != null) {
                a.C0016a c0016a = new a.C0016a(this.$it);
                this.label = 1;
                if (r48Var.a(c0016a, this) == objG) {
                    return objG;
                }
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
