package androidx.compose.p001foundation.relocation;

import androidx.compose.ui.b;
import com.google.inputmethod.cu0;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/cu0;", "a", "()Lcom/google/android/cu0;", "Landroidx/compose/ui/b;", "bringIntoViewRequester", "b", "(Landroidx/compose/ui/b;Lcom/google/android/cu0;)Landroidx/compose/ui/b;", "foundation"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
final /* synthetic */ class d {
    public static final cu0 a() {
        return new BringIntoViewRequesterImpl();
    }

    public static final b b(b bVar, cu0 cu0Var) {
        return bVar.then(new a(cu0Var));
    }
}
