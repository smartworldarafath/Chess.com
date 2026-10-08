package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a5\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"P", "Lkotlin/Function1;", "", "content", "b", "(Lcom/google/android/ps4;)Lcom/google/android/ps4;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p08 {
    public static final <P> ps4<P, d, Integer, Unit> b(ps4<? super P, ? super d, ? super Integer, Unit> ps4Var) {
        final n08 n08Var = new n08(ps4Var);
        return ko1.c(1032736913, true, new ps4() { // from class: com.google.android.o08
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return p08.c(n08Var, obj, (d) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(n08 n08Var, Object obj, d dVar, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? dVar.x(obj) : dVar.T(obj) ? 4 : 2;
        }
        if (dVar.g((i & 19) != 18, i & 1)) {
            if (e.k()) {
                e.o(1032736913, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:63)");
            }
            dVar.s(n08Var, obj);
            if (e.k()) {
                e.n();
            }
        } else {
            dVar.q();
        }
        return Unit.a;
    }
}
