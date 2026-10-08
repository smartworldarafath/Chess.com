package androidx.p008glance.p010session;

import android.content.Context;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aZ\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lcom/google/android/q22;", "", "", "onIdle", "block", "a", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IdleEventBroadcastReceiverKt {
    public static final <T> Object a(Context context, Function1<? super q22<? super Unit>, ? extends Object> function1, Function1<? super q22<? super T>, ? extends Object> function2, q22<? super T> q22Var) {
        return j.g(new IdleEventBroadcastReceiverKt$observeIdleEvents$2(context, function2, function1, null), q22Var);
    }
}
