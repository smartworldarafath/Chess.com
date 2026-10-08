package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.gba;
import com.google.inputmethod.ii6;
import com.google.inputmethod.si6;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0002*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u0016*\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, d2 = {"", "androidDirection", "Landroidx/compose/ui/focus/b;", "d", "(I)Landroidx/compose/ui/focus/b;", "c", "(I)Ljava/lang/Integer;", "Lcom/google/android/oi6;", "e", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/b;", "androidLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "f", "(I)Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/view/View;", "view", "Lcom/google/android/gba;", "a", "(Landroid/view/View;Landroid/view/View;)Lcom/google/android/gba;", "direction", "Landroid/graphics/Rect;", "rect", "", "b", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "", "[I", "tempCoordinates", "Landroid/graphics/Rect;", "tempRect", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final int[] a = new int[2];
    private static final Rect b = new Rect();

    public static final gba a(View view, View view2) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f2 = i2 - iArr[1];
        Rect rect = b;
        view.getFocusedRect(rect);
        int i3 = rect.left;
        return new gba(i3 + f, rect.top + f2, f + i3 + rect.width(), f2 + rect.top + rect.height());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i) {
        b.Companion companion = b.INSTANCE;
        if (b.l(i, companion.h())) {
            return 33;
        }
        if (b.l(i, companion.a())) {
            return 130;
        }
        if (b.l(i, companion.d())) {
            return 17;
        }
        if (b.l(i, companion.g())) {
            return 66;
        }
        if (b.l(i, companion.e())) {
            return 2;
        }
        return b.l(i, companion.f()) ? 1 : null;
    }

    public static final b d(int i) {
        if (i == 1) {
            return b.i(b.INSTANCE.f());
        }
        if (i == 2) {
            return b.i(b.INSTANCE.e());
        }
        if (i == 17) {
            return b.i(b.INSTANCE.d());
        }
        if (i == 33) {
            return b.i(b.INSTANCE.h());
        }
        if (i == 66) {
            return b.i(b.INSTANCE.g());
        }
        if (i != 130) {
            return null;
        }
        return b.i(b.INSTANCE.a());
    }

    public static final b e(KeyEvent keyEvent) {
        long jA = si6.a(keyEvent);
        ii6.Companion companion = ii6.INSTANCE;
        if (ii6.T(jA, companion.w())) {
            return b.i(b.INSTANCE.f());
        }
        if (ii6.T(jA, companion.v())) {
            return b.i(b.INSTANCE.e());
        }
        if (ii6.T(jA, companion.L())) {
            return b.i(si6.g(keyEvent) ? b.INSTANCE.f() : b.INSTANCE.e());
        }
        if (ii6.T(jA, companion.l())) {
            return b.i(b.INSTANCE.g());
        }
        if (ii6.T(jA, companion.k())) {
            return b.i(b.INSTANCE.d());
        }
        if (ii6.T(jA, companion.m()) || ii6.T(jA, companion.I())) {
            return b.i(b.INSTANCE.h());
        }
        if (ii6.T(jA, companion.j()) || ii6.T(jA, companion.H())) {
            return b.i(b.INSTANCE.a());
        }
        if (ii6.T(jA, companion.i()) || ii6.T(jA, companion.n()) || ii6.T(jA, companion.B())) {
            return b.i(b.INSTANCE.b());
        }
        if (ii6.T(jA, companion.b()) || ii6.T(jA, companion.p())) {
            return b.i(b.INSTANCE.c());
        }
        return null;
    }

    public static final LayoutDirection f(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return null;
        }
        return LayoutDirection.Rtl;
    }
}
