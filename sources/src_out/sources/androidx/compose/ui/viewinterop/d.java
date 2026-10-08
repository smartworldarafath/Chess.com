package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.focus.FocusOwner;
import com.google.inputmethod.gba;
import com.google.inputmethod.y23;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/b;", "e", "(Landroidx/compose/ui/b;)Landroidx/compose/ui/b;", "Landroidx/compose/ui/b$c;", "Landroid/view/View;", "g", "(Landroidx/compose/ui/b$c;)Landroid/view/View;", "other", "", "d", "(Landroid/view/View;Landroid/view/View;)Z", "Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "hostView", "embeddedView", "Landroid/graphics/Rect;", "f", "(Landroidx/compose/ui/focus/FocusOwner;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final androidx.compose.ui.b e(androidx.compose.ui.b bVar) {
        return androidx.compose.ui.focus.d.a(bVar.then(e.d)).then(g.d).then(f.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect f(FocusOwner focusOwner, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        gba gbaVarE = focusOwner.e();
        if (gbaVarE == null) {
            return null;
        }
        return new Rect((((int) gbaVarE.getLeft()) + iArr[0]) - iArr2[0], (((int) gbaVarE.getTop()) + iArr[1]) - iArr2[1], (((int) gbaVarE.getRight()) + iArr[0]) - iArr2[0], (((int) gbaVarE.getBottom()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View g(androidx.compose.ui.b.c cVar) {
        View viewD0 = y23.q(cVar.getNode()).d0();
        if (viewD0 != null) {
            return viewD0;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
