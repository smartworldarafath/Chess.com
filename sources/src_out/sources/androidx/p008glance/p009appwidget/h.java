package androidx.p008glance.p009appwidget;

import android.widget.RemoteViews;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/glance/appwidget/h;", "", "<init>", "()V", "", "packageName", "", "layoutId", "viewId", "Landroid/widget/RemoteViews;", "a", "(Ljava/lang/String;II)Landroid/widget/RemoteViews;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h {
    public static final h a = new h();

    private h() {
    }

    public final RemoteViews a(String packageName, int layoutId, int viewId) {
        return new RemoteViews(packageName, layoutId, viewId);
    }
}
