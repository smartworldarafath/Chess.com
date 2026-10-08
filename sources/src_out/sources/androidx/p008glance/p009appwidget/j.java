package androidx.p008glance.p009appwidget;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/glance/appwidget/j;", "", "<init>", "()V", "", "appWidgetId", "viewId", "", "sizeInfo", "b", "(IILjava/lang/String;)Ljava/lang/String;", "Landroidx/glance/appwidget/i;", "remoteCollectionItems", "", "d", "(IILjava/lang/String;Landroidx/glance/appwidget/i;)V", "a", "(IILjava/lang/String;)Landroidx/glance/appwidget/i;", "c", "(IILjava/lang/String;)V", "", "Ljava/util/Map;", "items", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<String, i> items = new LinkedHashMap();

    private final String b(int appWidgetId, int viewId, String sizeInfo) {
        return appWidgetId + '-' + viewId + '-' + sizeInfo;
    }

    public final i a(int appWidgetId, int viewId, String sizeInfo) {
        i iVar = this.items.get(b(appWidgetId, viewId, sizeInfo));
        return iVar == null ? i.INSTANCE.a() : iVar;
    }

    public final void c(int appWidgetId, int viewId, String sizeInfo) {
        this.items.remove(b(appWidgetId, viewId, sizeInfo));
    }

    public final void d(int appWidgetId, int viewId, String sizeInfo, i remoteCollectionItems) {
        this.items.put(b(appWidgetId, viewId, sizeInfo), remoteCollectionItems);
    }
}
