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

/* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$3$2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$3$2", f = "Clickable.kt", l = {2126}, m = "invokeSuspend", v = 1)
final class C0147AbstractClickableNode$handlePressInteractionStart$3$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ r48 $interactionSource;
    final /* synthetic */ a.b $press;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0147AbstractClickableNode$handlePressInteractionStart$3$2(r48 r48Var, a.b bVar, q22<? super C0147AbstractClickableNode$handlePressInteractionStart$3$2> q22Var) {
        super(2, q22Var);
        this.$interactionSource = r48Var;
        this.$press = bVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0147AbstractClickableNode$handlePressInteractionStart$3$2(this.$interactionSource, this.$press, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            r48 r48Var = this.$interactionSource;
            a.b bVar = this.$press;
            this.label = 1;
            if (r48Var.a(bVar, this) == objG) {
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
