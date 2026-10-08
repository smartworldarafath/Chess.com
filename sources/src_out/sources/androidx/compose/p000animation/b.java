package androidx.compose.p000animation;

import com.google.inputmethod.ff1;
import com.google.inputmethod.kce;
import com.google.inputmethod.lr;
import com.google.inputmethod.q16;
import com.google.inputmethod.t04;
import com.google.inputmethod.tc;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/xa4;", "Lcom/google/android/q16;", "animationSpec", "Lkotlin/Function2;", "", "finishedListener", "a", "(Landroidx/compose/ui/b;Lcom/google/android/xa4;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/b;", "J", "c", "()J", "InvalidSize", "", "d", "(J)Z", "isValid", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    private static final long a;

    static {
        long j = t04.INVALID_ID;
        a = q16.c((j & 4294967295L) | (j << 32));
    }

    public static final androidx.compose.ui.b a(androidx.compose.ui.b bVar, xa4<q16> xa4Var, Function2<? super q16, ? super q16, Unit> function2) {
        return ff1.b(bVar).then(new h(xa4Var, tc.INSTANCE.o(), function2));
    }

    public static /* synthetic */ androidx.compose.ui.b b(androidx.compose.ui.b bVar, xa4 xa4Var, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            xa4Var = lr.j(0.0f, 400.0f, q16.b(kce.d(q16.INSTANCE)), 1, null);
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        return a(bVar, xa4Var, function2);
    }

    public static final long c() {
        return a;
    }

    public static final boolean d(long j) {
        return !q16.f(j, a);
    }
}
