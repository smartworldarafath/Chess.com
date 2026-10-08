package androidx.compose.p001foundation.gestures.snapping;

import androidx.compose.p001foundation.gestures.Orientation;
import com.google.inputmethod.cq6;
import com.google.inputmethod.g16;
import com.google.inputmethod.pp6;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\"\u0018\u0010\n\u001a\u00020\u0003*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/android/pp6;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "c", "(Lcom/google/android/pp6;Landroidx/compose/foundation/gestures/Orientation;)I", "b", "Lcom/google/android/cq6;", "a", "(Lcom/google/android/cq6;)I", "singleAxisViewportSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final int a(cq6 cq6Var) {
        return (int) (cq6Var.a() == Orientation.Vertical ? cq6Var.b() & 4294967295L : cq6Var.b() >> 32);
    }

    public static final int b(pp6 pp6Var, Orientation orientation) {
        return orientation == Orientation.Vertical ? g16.l(pp6Var.c()) : g16.k(pp6Var.c());
    }

    public static final int c(pp6 pp6Var, Orientation orientation) {
        return (int) (orientation == Orientation.Vertical ? pp6Var.a() & 4294967295L : pp6Var.a() >> 32);
    }
}
