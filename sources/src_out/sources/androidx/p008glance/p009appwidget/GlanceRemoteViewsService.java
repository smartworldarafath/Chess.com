package androidx.p008glance.p009appwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.google.android.rw0;
import com.google.inputmethod.jz9;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "onGetViewFactory", "(Landroid/content/Intent;)Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "a", "GlanceRemoteViewsFactory", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlanceRemoteViewsService extends RemoteViewsService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final j b = new j();

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00100¨\u00061"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService$GlanceRemoteViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "Landroid/content/Context;", "context", "", "appWidgetId", "viewId", "", "size", "<init>", "(Landroid/content/Context;IILjava/lang/String;)V", "", "g", "()V", "Lcom/google/android/my;", "glanceId", "h", "(Lcom/google/android/my;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/glance/appwidget/GlanceAppWidget;", "d", "()Landroidx/glance/appwidget/GlanceAppWidget;", "Landroidx/glance/appwidget/i;", "f", "()Landroidx/glance/appwidget/i;", "onCreate", "onDataSetChanged", "onDestroy", "getCount", "()I", "position", "Landroid/widget/RemoteViews;", "getViewAt", "(I)Landroid/widget/RemoteViews;", "", "e", "()Ljava/lang/Void;", "getViewTypeCount", "", "getItemId", "(I)J", "", "hasStableIds", "()Z", "a", "Landroid/content/Context;", "b", "I", "c", "Ljava/lang/String;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GlanceRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int appWidgetId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int viewId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String size;

        public GlanceRemoteViewsFactory(Context context, int i, int i2, String str) {
            this.context = context;
            this.appWidgetId = i;
            this.viewId = i2;
            this.size = str;
        }

        private final GlanceAppWidget d() throws IllegalAccessException, InstantiationException, InvocationTargetException {
            ComponentName componentName;
            String className;
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this.context).getAppWidgetInfo(this.appWidgetId);
            if (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) {
                return null;
            }
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.h(objNewInstance, "null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver");
            return ((GlanceAppWidgetReceiver) objNewInstance).c();
        }

        private final i f() {
            return GlanceRemoteViewsService.INSTANCE.c(this.appWidgetId, this.viewId, this.size);
        }

        private final void g() {
            rw0.f((CoroutineContext) null, new C0230GlanceRemoteViewsService$GlanceRemoteViewsFactory$loadData$1(this, null), 1, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:30:0x0072  */
        /* JADX WARN: Code duplicated, block: B:34:0x0080  */
        /* JADX WARN: Code duplicated, block: B:36:0x0083  */
        /* JADX WARN: Code duplicated, block: B:41:0x0091  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        
            if (r10 == r1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        
            if (r10.f1(r0) == r1) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object h(com.google.inputmethod.AppWidgetId r9, com.google.android.q22<? super kotlin.Unit> r10) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
            /*
                r8 = this;
                boolean r0 = r10 instanceof androidx.p008glance.p009appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1
                if (r0 == 0) goto L13
                r0 = r10
                androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1 r0 = (androidx.p008glance.p009appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1 r0 = new androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$1
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L44
                if (r2 == r5) goto L3c
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                kotlin.f.b(r10)
                goto L8e
            L30:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L38:
                kotlin.f.b(r10)
                goto L7d
            L3c:
                java.lang.Object r9 = r0.L$0
                androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory r9 = (androidx.glance.appwidget.GlanceRemoteViewsService.GlanceRemoteViewsFactory) r9
                kotlin.f.b(r10)
                goto L62
            L44:
                kotlin.f.b(r10)
                androidx.glance.appwidget.GlanceAppWidget r10 = r8.d()
                if (r10 == 0) goto L67
                com.google.android.ejb r2 = com.google.inputmethod.fjb.a()
                androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1 r7 = new androidx.glance.appwidget.GlanceRemoteViewsService$GlanceRemoteViewsFactory$startSessionIfNeededAndWaitUntilReady$job$1$1
                r7.<init>(r8, r9, r10, r6)
                r0.L$0 = r8
                r0.label = r5
                java.lang.Object r10 = r2.b(r7, r0)
                if (r10 != r1) goto L61
                goto L8d
            L61:
                r9 = r8
            L62:
                kotlinx.coroutines.s r10 = (kotlinx.coroutines.s) r10
                if (r10 != 0) goto L81
                goto L68
            L67:
                r9 = r8
            L68:
                androidx.glance.appwidget.UnmanagedSessionReceiver$a r10 = androidx.p008glance.p009appwidget.UnmanagedSessionReceiver.INSTANCE
                int r9 = r9.appWidgetId
                androidx.glance.appwidget.AppWidgetSession r9 = r10.a(r9)
                if (r9 == 0) goto L80
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r10 = r9.D(r0)
                if (r10 != r1) goto L7d
                goto L8d
            L7d:
                kotlinx.coroutines.s r10 = (kotlinx.coroutines.s) r10
                goto L81
            L80:
                r10 = r6
            L81:
                if (r10 == 0) goto L91
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r9 = r10.f1(r0)
                if (r9 != r1) goto L8e
            L8d:
                return r1
            L8e:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            L91:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.glance.appwidget.GlanceRemoteViewsService.GlanceRemoteViewsFactory.h(com.google.android.my, com.google.android.q22):java.lang.Object");
        }

        public Void e() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getCount() {
            return f().b();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public long getItemId(int position) {
            try {
                return f().c(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
            return (RemoteViews) e();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public RemoteViews getViewAt(int position) {
            try {
                return f().d(position);
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.context.getPackageName(), jz9.S4);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public int getViewTypeCount() {
            return f().get_viewTypeCount();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public boolean hasStableIds() {
            return f().getHasStableIds();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onCreate() {
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDataSetChanged() {
            g();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public void onDestroy() {
            GlanceRemoteViewsService.INSTANCE.d(this.appWidgetId, this.viewId, this.size);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.GlanceRemoteViewsService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService$a;", "", "<init>", "()V", "", "appWidgetId", "viewId", "", "sizeInfo", "Landroidx/glance/appwidget/i;", "c", "(IILjava/lang/String;)Landroidx/glance/appwidget/i;", "", "d", "(IILjava/lang/String;)V", "remoteCollectionItems", "e", "(IILjava/lang/String;Landroidx/glance/appwidget/i;)V", "EXTRA_SIZE_INFO", "Ljava/lang/String;", "EXTRA_VIEW_ID", "Landroidx/glance/appwidget/j;", "InMemoryStore", "Landroidx/glance/appwidget/j;", "TAG", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final i c(int appWidgetId, int viewId, String sizeInfo) {
            i iVarA;
            synchronized (GlanceRemoteViewsService.b) {
                iVarA = GlanceRemoteViewsService.b.a(appWidgetId, viewId, sizeInfo);
            }
            return iVarA;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(int appWidgetId, int viewId, String sizeInfo) {
            synchronized (GlanceRemoteViewsService.b) {
                GlanceRemoteViewsService.b.c(appWidgetId, viewId, sizeInfo);
                Unit unit = Unit.a;
            }
        }

        public final void e(int appWidgetId, int viewId, String sizeInfo, i remoteCollectionItems) {
            synchronized (GlanceRemoteViewsService.b) {
                GlanceRemoteViewsService.b.d(appWidgetId, viewId, sizeInfo, remoteCollectionItems);
                Unit unit = Unit.a;
            }
        }

        private Companion() {
        }
    }

    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            throw new IllegalStateException("No view id was present in the intent");
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra == null || stringExtra.length() == 0) {
            throw new IllegalStateException("No size info was present in the intent");
        }
        return new GlanceRemoteViewsFactory(this, intExtra, intExtra2, stringExtra);
    }
}
