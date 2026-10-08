package androidx.p008glance.p009appwidget;

import android.widget.RemoteViews;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/glance/appwidget/l;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "rv", "", "viewId", "childView", "stableId", "", "a", "(Landroid/widget/RemoteViews;ILandroid/widget/RemoteViews;I)V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class l {
    public static final l a = new l();

    private l() {
    }

    public final void a(RemoteViews rv, int viewId, RemoteViews childView, int stableId) {
        rv.addStableView(viewId, childView, stableId);
    }
}
