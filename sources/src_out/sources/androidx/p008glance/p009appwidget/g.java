package androidx.p008glance.p009appwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroid/widget/RemoteViews;", "Landroid/content/Context;", "context", "", "appWidgetId", "viewId", "", "sizeInfo", "Landroidx/glance/appwidget/i;", "items", "", "a", "(Landroid/widget/RemoteViews;Landroid/content/Context;IILjava/lang/String;Landroidx/glance/appwidget/i;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    public static final void a(RemoteViews remoteViews, Context context, int i, int i2, String str, i iVar) {
        if (Build.VERSION.SDK_INT > 31) {
            c.a.a(remoteViews, i2, iVar);
            return;
        }
        Intent intentPutExtra = new Intent(context, (Class<?>) GlanceRemoteViewsService.class).putExtra("appWidgetId", i).putExtra("androidx.glance.widget.extra.view_id", i2).putExtra("androidx.glance.widget.extra.size_info", str);
        intentPutExtra.setData(Uri.parse(intentPutExtra.toUri(1)));
        if (context.getPackageManager().resolveService(intentPutExtra, 0) == null) {
            throw new IllegalStateException("GlanceRemoteViewsService could not be resolved, check the app manifest.");
        }
        remoteViews.setRemoteAdapter(i2, intentPutExtra);
        GlanceRemoteViewsService.INSTANCE.e(i, i2, str, iVar);
        AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(i, i2);
    }
}
