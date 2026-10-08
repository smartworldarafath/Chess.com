package androidx.compose.ui.platform;

import com.google.android.q22;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "a", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InfiniteAnimationPolicyKt {
    public static final <R> Object a(Function1<? super Long, ? extends R> function1, q22<? super R> q22Var) {
        u uVar = (u) q22Var.getContext().get(u.INSTANCE);
        return uVar == null ? androidx.compose.p004runtime.w.c(function1, q22Var) : uVar.b0(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(function1, null), q22Var);
    }
}
