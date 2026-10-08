package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.inputmethod.t59;
import java.util.Calendar;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class k {
    private static k d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    private static class a {
        boolean a;
        long b;

        a() {
        }
    }

    k(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    static k a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    private Location b() {
        Location locationC = t59.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = t59.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        return this.c.b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        j jVarB = j.b();
        jVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        jVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = jVarB.c == 1;
        long j2 = jVarB.b;
        long j3 = jVarB.a;
        jVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = jVarB.b;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j3) {
                j2 = j4;
            } else if (jCurrentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + 60000;
        }
        aVar.a = z;
        aVar.b = j;
    }

    boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
