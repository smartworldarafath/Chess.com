package androidx.compose.ui.platform;

import android.view.View;
import com.google.inputmethod.pf3;
import com.google.inputmethod.tp1;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/i;", "", "<init>", "()V", "Landroid/view/View;", "view", "Lcom/google/android/pf3;", "transferData", "Lcom/google/android/tp1;", "dragShadowBuilder", "", "a", "(Landroid/view/View;Lcom/google/android/pf3;Lcom/google/android/tp1;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i {
    public static final i a = new i();

    private i() {
    }

    public final boolean a(View view, pf3 transferData, tp1 dragShadowBuilder) {
        return view.startDragAndDrop(transferData.getClipData(), dragShadowBuilder, transferData.getLocalState(), transferData.getFlags());
    }
}
