package androidx.p008glance.p009appwidget.action;

import android.app.PendingIntent;
import android.content.Intent;
import android.widget.RemoteViews;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/glance/appwidget/action/b;", "", "<init>", "()V", "Landroid/widget/RemoteViews;", "rv", "", "viewId", "Landroid/app/PendingIntent;", "intent", "", "a", "(Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;)V", "Landroid/content/Intent;", "b", "(Landroid/widget/RemoteViews;ILandroid/content/Intent;)V", "c", "(Landroid/widget/RemoteViews;I)V", "d", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b {
    public static final b a = new b();

    private b() {
    }

    public final void a(RemoteViews rv, int viewId, PendingIntent intent) {
        rv.setOnCheckedChangeResponse(viewId, RemoteViews.RemoteResponse.fromPendingIntent(intent));
    }

    public final void b(RemoteViews rv, int viewId, Intent intent) {
        rv.setOnCheckedChangeResponse(viewId, RemoteViews.RemoteResponse.fromFillInIntent(intent));
    }

    public final void c(RemoteViews rv, int viewId) {
        rv.setOnCheckedChangeResponse(viewId, new RemoteViews.RemoteResponse());
    }

    public final void d(RemoteViews rv, int viewId) {
        rv.setOnClickResponse(viewId, new RemoteViews.RemoteResponse());
    }
}
