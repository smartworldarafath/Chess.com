package androidx.p008glance.p010session;

import android.os.PowerManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/glance/session/a;", "", "<init>", "()V", "Landroid/os/PowerManager;", "pm", "", "a", "(Landroid/os/PowerManager;)Z", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a {
    public static final a a = new a();

    private a() {
    }

    public final boolean a(PowerManager pm) {
        return pm.isDeviceIdleMode();
    }
}
