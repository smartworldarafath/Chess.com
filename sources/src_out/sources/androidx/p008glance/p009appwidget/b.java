package androidx.p008glance.p009appwidget;

import android.widget.RemoteViews;
import androidx.core.widget.a;
import com.google.inputmethod.ia3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/glance/appwidget/b;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "rv", "", "viewId", "Lcom/google/android/ia3;", "width", "", "c", "(Landroid/widget/RemoteViews;ILcom/google/android/ia3;)V", "height", "b", "radius", "a", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b {
    public static final b a = new b();

    private b() {
    }

    public final void a(RemoteViews rv, int viewId, ia3 radius) {
        a.A(rv, viewId, true);
        if (radius instanceof ia3.a) {
            rv.setViewOutlinePreferredRadius(viewId, ((ia3.a) radius).getDp(), 1);
        } else {
            if (radius instanceof ia3.d) {
                rv.setViewOutlinePreferredRadiusDimen(viewId, ((ia3.d) radius).a());
                return;
            }
            throw new IllegalStateException(("Rounded corners should not be " + radius.getClass().getCanonicalName()).toString());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b(RemoteViews rv, int viewId, ia3 height) throws NoWhenBranchMatchedException {
        if (height instanceof ia3.e) {
            rv.setViewLayoutHeight(viewId, -2.0f, 0);
        } else if (height instanceof ia3.b) {
            rv.setViewLayoutHeight(viewId, 0.0f, 0);
        } else if (height instanceof ia3.a) {
            rv.setViewLayoutHeight(viewId, ((ia3.a) height).getDp(), 1);
        } else if (height instanceof ia3.d) {
            rv.setViewLayoutHeightDimen(viewId, ((ia3.d) height).a());
        } else {
            if (!Intrinsics.e(height, ia3.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            rv.setViewLayoutHeight(viewId, -1.0f, 0);
        }
        Unit unit = Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void c(RemoteViews rv, int viewId, ia3 width) throws NoWhenBranchMatchedException {
        if (width instanceof ia3.e) {
            rv.setViewLayoutWidth(viewId, -2.0f, 0);
        } else if (width instanceof ia3.b) {
            rv.setViewLayoutWidth(viewId, 0.0f, 0);
        } else if (width instanceof ia3.a) {
            rv.setViewLayoutWidth(viewId, ((ia3.a) width).getDp(), 1);
        } else if (width instanceof ia3.d) {
            rv.setViewLayoutWidthDimen(viewId, ((ia3.d) width).a());
        } else {
            if (!Intrinsics.e(width, ia3.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            rv.setViewLayoutWidth(viewId, -1.0f, 0);
        }
        Unit unit = Unit.a;
    }
}
