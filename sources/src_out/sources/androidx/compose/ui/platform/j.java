package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.google.inputmethod.AndroidPointerIcon;
import com.google.inputmethod.ne9;
import com.google.inputmethod.rm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/android/ne9;", "icon", "Landroid/view/PointerIcon;", "b", "(Landroid/content/Context;Lcom/google/android/ne9;)Landroid/view/PointerIcon;", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;Lcom/google/android/ne9;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j {
    public static final j a = new j();

    private j() {
    }

    public final void a(View view, ne9 icon) {
        PointerIcon pointerIconB = b(view.getContext(), icon);
        if (Intrinsics.e(view.getPointerIcon(), pointerIconB)) {
            return;
        }
        view.setPointerIcon(pointerIconB);
    }

    public final PointerIcon b(Context context, ne9 icon) {
        if (icon instanceof rm) {
            return ((rm) icon).a();
        }
        return icon instanceof AndroidPointerIcon ? PointerIcon.getSystemIcon(context, ((AndroidPointerIcon) icon).getType()) : PointerIcon.getSystemIcon(context, 1000);
    }
}
