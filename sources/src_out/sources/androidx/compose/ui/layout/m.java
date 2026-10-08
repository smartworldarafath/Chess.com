package androidx.compose.ui.layout;

import com.google.android.r43;
import com.google.inputmethod.gn6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/b;", "", "minDurationMs", "", "minFractionVisible", "Lcom/google/android/gn6;", "viewportBounds", "Lkotlin/Function0;", "", "callback", "a", "(Landroidx/compose/ui/b;JFLcom/google/android/gn6;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/b;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    @r43
    public static final androidx.compose.ui.b a(androidx.compose.ui.b bVar, long j, float f, gn6 gn6Var, Function0<Unit> function0) {
        return bVar.then(new l(j, f, gn6Var, function0));
    }

    public static /* synthetic */ androidx.compose.ui.b b(androidx.compose.ui.b bVar, long j, float f, gn6 gn6Var, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            gn6Var = null;
        }
        return a(bVar, j2, f2, gn6Var, function0);
    }
}
