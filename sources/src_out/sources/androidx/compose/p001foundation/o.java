package androidx.compose.p001foundation;

import androidx.compose.ui.b;
import com.google.inputmethod.r48;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/r48;", "interactionSource", "", "enabled", "a", "(Landroidx/compose/ui/b;Lcom/google/android/r48;Z)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    public static final b a(b bVar, r48 r48Var, boolean z) {
        return bVar.then(z ? new n(r48Var) : b.INSTANCE);
    }

    public static /* synthetic */ b b(b bVar, r48 r48Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return a(bVar, r48Var, z);
    }
}
