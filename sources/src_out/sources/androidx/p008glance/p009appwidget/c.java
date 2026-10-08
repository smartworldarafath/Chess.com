package androidx.p008glance.p009appwidget;

import android.widget.RemoteViews;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/glance/appwidget/c;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "remoteViews", "", "viewId", "Landroidx/glance/appwidget/i;", "items", "", "a", "(Landroid/widget/RemoteViews;ILandroidx/glance/appwidget/i;)V", "Landroid/widget/RemoteViews$RemoteCollectionItems;", "b", "(Landroidx/glance/appwidget/i;)Landroid/widget/RemoteViews$RemoteCollectionItems;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c {
    public static final c a = new c();

    private c() {
    }

    public final void a(RemoteViews remoteViews, int viewId, i items) {
        remoteViews.setRemoteAdapter(viewId, b(items));
    }

    public final RemoteViews.RemoteCollectionItems b(i items) {
        RemoteViews.RemoteCollectionItems.Builder viewTypeCount = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(items.getHasStableIds()).setViewTypeCount(items.get_viewTypeCount());
        int iB = items.b();
        for (int i = 0; i < iB; i++) {
            viewTypeCount.addItem(items.c(i), items.d(i));
        }
        return viewTypeCount.build();
    }
}
