package androidx.compose.ui.window;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.inputmethod.og9;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/window/i;", "Lcom/google/android/og9;", "<init>", "()V", "Landroid/view/View;", "composeView", "Landroid/graphics/Rect;", "outRect", "", "d", "(Landroid/view/View;Landroid/graphics/Rect;)V", "c", "", "width", "height", "b", "(Landroid/view/View;II)V", "Landroid/view/WindowManager;", "windowManager", "popupView", "Landroid/view/ViewGroup$LayoutParams;", "params", "a", "(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
class i implements og9 {
    @Override // com.google.inputmethod.og9
    public void a(WindowManager windowManager, View popupView, ViewGroup.LayoutParams params) {
        windowManager.updateViewLayout(popupView, params);
    }

    @Override // com.google.inputmethod.og9
    public void b(View composeView, int width, int height) {
    }

    @Override // com.google.inputmethod.og9
    public void c(View composeView, Rect outRect) {
        DisplayMetrics displayMetrics = composeView.getResources().getDisplayMetrics();
        outRect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // com.google.inputmethod.og9
    public void d(View composeView, Rect outRect) {
        composeView.getWindowVisibleDisplayFrame(outRect);
    }
}
