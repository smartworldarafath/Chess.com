package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/window/g;", "Landroidx/compose/ui/window/i;", "<init>", "()V", "Landroid/view/View;", "composeView", "", "width", "height", "", "b", "(Landroid/view/View;II)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
class g extends i {
    @Override // androidx.compose.ui.window.i, com.google.inputmethod.og9
    public void b(View composeView, int width, int height) {
        composeView.setSystemGestureExclusionRects(m.v(new Rect[]{new Rect(0, 0, width, height)}));
    }
}
