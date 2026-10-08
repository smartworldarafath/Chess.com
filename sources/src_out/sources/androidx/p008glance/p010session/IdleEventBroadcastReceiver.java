package androidx.p008glance.p010session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/glance/session/IdleEventBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lkotlin/Function0;", "", "onIdle", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "b", "(Landroid/content/Context;)V", "a", "Lkotlin/jvm/functions/Function0;", "getOnIdle", "()Lkotlin/jvm/functions/Function0;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IdleEventBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> c;
    private static final IntentFilter d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<Unit> onIdle;

    /* JADX INFO: renamed from: androidx.glance.session.IdleEventBroadcastReceiver$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/session/IdleEventBroadcastReceiver$a;", "", "<init>", "()V", "Landroid/content/IntentFilter;", "filter", "Landroid/content/IntentFilter;", "a", "()Landroid/content/IntentFilter;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntentFilter a() {
            return IdleEventBroadcastReceiver.d;
        }

        private Companion() {
        }
    }

    static {
        List<String> listS = m.s(new String[]{"android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED"});
        c = listS;
        IntentFilter intentFilter = new IntentFilter();
        Iterator<T> it = listS.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        d = intentFilter;
    }

    public IdleEventBroadcastReceiver(Function0<Unit> function0) {
        this.onIdle = function0;
    }

    public final void b(Context context) {
        int i = Build.VERSION.SDK_INT;
        Object systemService = context.getSystemService("power");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        boolean zA = a.a.a(powerManager);
        if (i >= 33) {
            zA = zA || b.a.a(powerManager);
        }
        if (zA) {
            this.onIdle.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (m.n0(c, intent.getAction())) {
            b(context);
        }
    }
}
