package androidx.compose.ui.focus;

import com.google.inputmethod.dl4;
import com.google.inputmethod.x23;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/g;", "Lcom/google/android/x23;", "Landroidx/compose/ui/focus/b;", "focusDirection", "", "n1", "(I)Z", "Lcom/google/android/dl4;", "v1", "()Lcom/google/android/dl4;", "focusState", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface g extends x23 {
    static /* synthetic */ boolean e0(g gVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i2 & 1) != 0) {
            i = b.INSTANCE.b();
        }
        return gVar.n1(i);
    }

    boolean n1(int focusDirection);

    dl4 v1();
}
