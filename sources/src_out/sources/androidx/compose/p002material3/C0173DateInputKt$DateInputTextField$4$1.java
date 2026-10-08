package androidx.compose.p002material3;

import androidx.compose.ui.focus.f;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: renamed from: androidx.compose.material3.DateInputKt$DateInputTextField$4$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.DateInputKt$DateInputTextField$4$1", f = "DateInput.kt", l = {233}, m = "invokeSuspend")
final class C0173DateInputKt$DateInputTextField$4$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ f $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0173DateInputKt$DateInputTextField$4$1(f fVar, q22<? super C0173DateInputKt$DateInputTextField$4$1> q22Var) {
        super(2, q22Var);
        this.$focusRequester = fVar;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0173DateInputKt$DateInputTextField$4$1(this.$focusRequester, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            if (this.$focusRequester != null) {
                this.label = 1;
                if (DelayKt.b(300L, this) == objG) {
                    return objG;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        f.h(this.$focusRequester, 0, 1, null);
        return Unit.a;
    }
}
