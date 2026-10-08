package androidx.compose.p001foundation.text.contextmenu.internal;

import android.view.ActionMode;
import android.view.View;
import com.google.inputmethod.bpc;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/o;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lcom/google/android/bpc;", "textActionModeCallback", "Landroid/view/ActionMode;", "b", "(Landroid/view/View;Lcom/google/android/bpc;)Landroid/view/ActionMode;", "actionMode", "", "a", "(Landroid/view/ActionMode;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o {
    public static final o a = new o();

    private o() {
    }

    public final void a(ActionMode actionMode) {
        p.a.a(actionMode);
    }

    public final ActionMode b(View view, bpc textActionModeCallback) {
        return p.a.b(view, new d(textActionModeCallback), 1);
    }
}
