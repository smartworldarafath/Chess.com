package androidx.p008glance.p009appwidget;

import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0015\u0017B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/glance/appwidget/i;", "", "", "ids", "", "Landroid/widget/RemoteViews;", "views", "", "hasStableIds", "", "_viewTypeCount", "<init>", "([J[Landroid/widget/RemoteViews;ZI)V", "position", "", "c", "(I)J", "d", "(I)Landroid/widget/RemoteViews;", "f", "()Z", "a", "[J", "b", "[Landroid/widget/RemoteViews;", "Z", "I", "()I", "itemCount", "e", "viewTypeCount", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 8;
    private static final i g = new i(new long[0], new RemoteViews[0], false, 1);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long[] ids;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final RemoteViews[] views;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hasStableIds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int _viewTypeCount;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0015j\b\u0012\u0004\u0012\u00020\u0006`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/glance/appwidget/i$a;", "", "<init>", "()V", "", "id", "Landroid/widget/RemoteViews;", "view", "a", "(JLandroid/widget/RemoteViews;)Landroidx/glance/appwidget/i$a;", "", "hasStableIds", "c", "(Z)Landroidx/glance/appwidget/i$a;", "", "viewTypeCount", "d", "(I)Landroidx/glance/appwidget/i$a;", "Landroidx/glance/appwidget/i;", "b", "()Landroidx/glance/appwidget/i;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "ids", "views", "Z", "I", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ArrayList<Long> ids = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ArrayList<RemoteViews> views = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean hasStableIds;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int viewTypeCount;

        public final a a(long id, RemoteViews view) {
            this.ids.add(Long.valueOf(id));
            this.views.add(view);
            return this;
        }

        public final i b() {
            if (this.viewTypeCount < 1) {
                ArrayList<RemoteViews> arrayList = this.views;
                ArrayList arrayList2 = new ArrayList(m.A(arrayList, 10));
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((RemoteViews) it.next()).getLayoutId()));
                }
                this.viewTypeCount = m.p0(arrayList2).size();
            }
            return new i(m.z1(this.ids), (RemoteViews[]) this.views.toArray(new RemoteViews[0]), this.hasStableIds, Math.max(this.viewTypeCount, 1), null);
        }

        public final a c(boolean hasStableIds) {
            this.hasStableIds = hasStableIds;
            return this;
        }

        public final a d(int viewTypeCount) {
            this.viewTypeCount = viewTypeCount;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/i$b;", "", "<init>", "()V", "Landroidx/glance/appwidget/i;", "Empty", "Landroidx/glance/appwidget/i;", "a", "()Landroidx/glance/appwidget/i;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.g;
        }

        private Companion() {
        }
    }

    public /* synthetic */ i(long[] jArr, RemoteViews[] remoteViewsArr, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr, remoteViewsArr, z, i);
    }

    public final int b() {
        return this.ids.length;
    }

    public final long c(int position) {
        return this.ids[position];
    }

    public final RemoteViews d(int position) {
        return this.views[position];
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int get_viewTypeCount() {
        return this._viewTypeCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHasStableIds() {
        return this.hasStableIds;
    }

    private i(long[] jArr, RemoteViews[] remoteViewsArr, boolean z, int i) {
        this.ids = jArr;
        this.views = remoteViewsArr;
        this.hasStableIds = z;
        this._viewTypeCount = i;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = m.p0(arrayList).size();
        if (size <= this._viewTypeCount) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this._viewTypeCount + ", but the collection contains " + size + " different layout ids").toString());
    }
}
