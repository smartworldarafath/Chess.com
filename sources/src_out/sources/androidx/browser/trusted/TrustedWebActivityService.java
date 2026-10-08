package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.inputmethod.cj5;
import com.google.inputmethod.l9d;
import com.google.inputmethod.zj8;
import java.util.Locale;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class TrustedWebActivityService extends Service {
    private NotificationManager a;
    int b = -1;
    private final cj5.a c = new a();

    class a extends cj5.a {
        a() {
        }

        private void V1() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i = trustedWebActivityService.b;
            if (i != -1) {
                if (i != Binder.getCallingUid()) {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            } else {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.c();
                throw null;
            }
        }

        @Override // com.google.inputmethod.cj5
        public Bundle M1() {
            V1();
            return new d.a(TrustedWebActivityService.this.g()).a();
        }

        @Override // com.google.inputmethod.cj5
        public Bundle P(Bundle bundle) {
            V1();
            d.C0011d c0011dA = d.C0011d.a(bundle);
            return new d.e(TrustedWebActivityService.this.j(c0011dA.a, c0011dA.b, c0011dA.c, c0011dA.d)).a();
        }

        @Override // com.google.inputmethod.cj5
        public int Z1() {
            V1();
            return TrustedWebActivityService.this.i();
        }

        @Override // com.google.inputmethod.cj5
        public Bundle a2(Bundle bundle) {
            V1();
            return new d.e(TrustedWebActivityService.this.d(d.c.a(bundle).a)).a();
        }

        @Override // com.google.inputmethod.cj5
        public void e2(Bundle bundle) {
            V1();
            d.b bVarA = d.b.a(bundle);
            TrustedWebActivityService.this.e(bVarA.a, bVarA.b);
        }

        @Override // com.google.inputmethod.cj5
        public Bundle j1(String str, Bundle bundle, IBinder iBinder) {
            V1();
            return TrustedWebActivityService.this.f(str, bundle, c.a(iBinder));
        }

        @Override // com.google.inputmethod.cj5
        public Bundle t1() {
            V1();
            return TrustedWebActivityService.this.h();
        }
    }

    private static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    private void b() {
        if (this.a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    public abstract l9d c();

    public boolean d(String str) {
        b();
        if (zj8.d(this).a()) {
            return b.b(this.a, a(str));
        }
        return false;
    }

    public void e(String str, int i) {
        b();
        this.a.cancel(str, i);
    }

    public Bundle f(String str, Bundle bundle, c cVar) {
        return null;
    }

    public Parcelable[] g() {
        b();
        return androidx.browser.trusted.a.a(this.a);
    }

    public Bundle h() {
        int i = i();
        Bundle bundle = new Bundle();
        if (i == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), i));
        return bundle;
    }

    public int i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public boolean j(String str, int i, Notification notification, String str2) {
        b();
        if (!zj8.d(this).a()) {
            return false;
        }
        String strA = a(str2);
        Notification notificationA = b.a(this, this.a, notification, strA, str2);
        if (!b.b(this.a, strA)) {
            return false;
        }
        this.a.notify(str, i, notificationA);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.b = -1;
        return super.onUnbind(intent);
    }
}
