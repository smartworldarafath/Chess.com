package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.e6;
import com.google.inputmethod.jvb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: renamed from: androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {231}, m = "invokeSuspend")
final class C0200SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ e6 $accessibilityManager;
    final /* synthetic */ jvb $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0200SnackbarHostKt$SnackbarHost$1$1(jvb jvbVar, e6 e6Var, q22<? super C0200SnackbarHostKt$SnackbarHost$1$1> q22Var) {
        super(2, q22Var);
        this.$currentSnackbarData = jvbVar;
        this.$accessibilityManager = e6Var;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0200SnackbarHostKt$SnackbarHost$1$1(this.$currentSnackbarData, this.$accessibilityManager, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            jvb jvbVar = this.$currentSnackbarData;
            if (jvbVar != null) {
                long jM = SnackbarHostKt.m(jvbVar.getVisuals().getDuration(), this.$currentSnackbarData.getVisuals().getActionLabel() != null, this.$accessibilityManager);
                this.label = 1;
                if (DelayKt.b(jM, this) == objG) {
                    return objG;
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$currentSnackbarData.dismiss();
        return Unit.a;
    }
}
