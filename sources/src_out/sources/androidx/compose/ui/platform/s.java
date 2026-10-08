package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.ly9;
import com.google.inputmethod.cbe;
import com.google.inputmethod.fj;
import com.google.inputmethod.gy9;
import com.google.inputmethod.xy9;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\"\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"2\u0010\u0018\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u000e¢\u0006\u0012\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroid/view/View;", "d", "(Landroid/view/View;)Landroid/view/View;", "", "tag", "b", "(Landroid/view/View;I)I", "Landroidx/compose/ui/platform/ComposeViewContext;", "c", "(Landroid/view/View;)Landroidx/compose/ui/platform/ComposeViewContext;", "", "a", "Z", "e", "()Z", "setAreWindowInsetsRulersEnabled", "(Z)V", "areWindowInsetsRulersEnabled", "value", "f", "g", "(Landroid/view/View;Landroidx/compose/ui/platform/ComposeViewContext;)V", "getComposeViewContext$annotations", "(Landroid/view/View;)V", "composeViewContext", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    private static boolean a = true;

    private static final int b(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!Intrinsics.e(tag, obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objA = cbe.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return i3;
    }

    public static final ComposeViewContext c(View view) {
        return f(d(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View d(View view) {
        if (!view.isAttachedToWindow() || !fj.isSharedComposeViewContextEnabled) {
            return view;
        }
        int iMin = Math.min(b(view, gy9.a), b(view, ly9.a));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (f(view) == null) {
                i++;
                Object objA = cbe.a(view);
                View view4 = view2;
                view2 = view;
                view = objA instanceof View ? (View) objA : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final boolean e() {
        return a;
    }

    public static final ComposeViewContext f(View view) {
        Object tag = view.getTag(xy9.G);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (ComposeViewContext) weakReference.get();
        }
        return null;
    }

    public static final void g(View view, ComposeViewContext composeViewContext) {
        view.setTag(xy9.G, new WeakReference(composeViewContext));
    }
}
