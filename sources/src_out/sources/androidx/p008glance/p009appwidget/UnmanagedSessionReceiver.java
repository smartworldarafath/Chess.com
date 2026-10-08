package androidx.p008glance.p009appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.fc3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/glance/appwidget/UnmanagedSessionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnmanagedSessionReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Integer, Companion.C0085a> b = new LinkedHashMap();

    /* JADX INFO: renamed from: androidx.glance.appwidget.UnmanagedSessionReceiver$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/glance/appwidget/UnmanagedSessionReceiver$a;", "", "<init>", "()V", "", "appWidgetId", "Landroidx/glance/appwidget/AppWidgetSession;", "a", "(I)Landroidx/glance/appwidget/AppWidgetSession;", "", "Landroidx/glance/appwidget/UnmanagedSessionReceiver$a$a;", "activeSessions", "Ljava/util/Map;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.glance.appwidget.UnmanagedSessionReceiver$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/UnmanagedSessionReceiver$a$a;", "", "Landroidx/glance/appwidget/AppWidgetSession;", "a", "Landroidx/glance/appwidget/AppWidgetSession;", "()Landroidx/glance/appwidget/AppWidgetSession;", "session", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class C0085a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AppWidgetSession session;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AppWidgetSession getSession() {
                return this.session;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppWidgetSession a(int appWidgetId) {
            AppWidgetSession session;
            synchronized (UnmanagedSessionReceiver.INSTANCE) {
                C0085a c0085a = (C0085a) UnmanagedSessionReceiver.b.get(Integer.valueOf(appWidgetId));
                session = c0085a != null ? c0085a.getSession() : null;
            }
            return session;
        }

        private Companion() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (Intrinsics.e(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
            if (stringExtra == null) {
                throw new IllegalStateException("Intent is missing ActionKey extra");
            }
            int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
            if (intExtra == -1) {
                throw new IllegalStateException("Intent is missing AppWidgetId extra");
            }
            AppWidgetSession appWidgetSessionA = INSTANCE.a(intExtra);
            if (appWidgetSessionA != null) {
                CoroutineBroadcastReceiverKt.a(this, fc3.c(), new C0231UnmanagedSessionReceiver$onReceive$1$1(appWidgetSessionA, stringExtra, null));
            }
        }
    }
}
