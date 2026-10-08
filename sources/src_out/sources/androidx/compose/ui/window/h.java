package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/window/h;", "Landroidx/compose/ui/window/g;", "<init>", "()V", "Landroid/view/View;", "composeView", "Landroid/graphics/Rect;", "outRect", "", "c", "(Landroid/view/View;Landroid/graphics/Rect;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends g {
    @Override // androidx.compose.ui.window.i, com.google.inputmethod.og9
    public void c(View composeView, Rect outRect) {
        Object systemService = composeView.getContext().getSystemService("window");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        outRect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
