package androidx.compose.p001foundation.gestures;

import com.google.android.h81;
import com.google.android.q22;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;
import kotlin.sequences.d;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lcom/google/android/h81;", "a", "(Lcom/google/android/h81;Lcom/google/android/q22;)Ljava/lang/Object;", "E", "Lkotlin/Function0;", "builderAction", "Lkotlin/sequences/Sequence;", "b", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class NonTouchScrollingLogicKt {
    public static final <T> Object a(h81<T> h81Var, q22<? super T> q22Var) {
        return j.g(new NonTouchScrollingLogicKt$busyReceive$2(h81Var, null), q22Var);
    }

    public static final <E> Sequence<E> b(Function0<? extends E> function0) {
        return d.b(new NonTouchScrollingLogicKt$untilNull$1(function0, null));
    }
}
