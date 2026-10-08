package androidx.compose.p001foundation;

import com.google.android.lq2;
import com.google.android.md3;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.i26;
import com.google.inputmethod.r48;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.foundation.FocusableNode$emitWithFallback$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {322}, m = "invokeSuspend", v = 1)
final class C0161FocusableNode$emitWithFallback$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ md3 $handler;
    final /* synthetic */ i26 $interaction;
    final /* synthetic */ r48 $this_emitWithFallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0161FocusableNode$emitWithFallback$1(r48 r48Var, i26 i26Var, md3 md3Var, q22<? super C0161FocusableNode$emitWithFallback$1> q22Var) {
        super(2, q22Var);
        this.$this_emitWithFallback = r48Var;
        this.$interaction = i26Var;
        this.$handler = md3Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0161FocusableNode$emitWithFallback$1(this.$this_emitWithFallback, this.$interaction, this.$handler, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            r48 r48Var = this.$this_emitWithFallback;
            i26 i26Var = this.$interaction;
            this.label = 1;
            if (r48Var.a(i26Var, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        md3 md3Var = this.$handler;
        if (md3Var != null) {
            md3Var.dispose();
        }
        return Unit.a;
    }
}
