package androidx.compose.p002material3;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.android.ut0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/ta2;", "", "it", "", "<anonymous>", "(Lcom/google/android/ta2;F)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
final class C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends SuspendLambda implements ps4<ta2, Float, q22<? super Unit>, Object> {
    final /* synthetic */ Function1<Float, Unit> $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(Function1<? super Float, Unit> function1, q22<? super C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1> q22Var) {
        super(3, q22Var);
        this.$settleToDismiss = function1;
    }

    public final Object a(ta2 ta2Var, float f, q22<? super Unit> q22Var) {
        C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1 c0195ModalBottomSheetKt$ModalBottomSheetContent$4$1 = new C0195ModalBottomSheetKt$ModalBottomSheetContent$4$1(this.$settleToDismiss, q22Var);
        c0195ModalBottomSheetKt$ModalBottomSheetContent$4$1.F$0 = f;
        return c0195ModalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(Unit.a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((ta2) obj, ((Number) obj2).floatValue(), (q22) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        this.$settleToDismiss.invoke(ut0.d(this.F$0));
        return Unit.a;
    }
}
