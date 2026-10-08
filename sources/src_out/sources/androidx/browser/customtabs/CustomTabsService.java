package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.inputmethod.ct3;
import com.google.inputmethod.qpb;
import com.google.inputmethod.ti5;
import com.google.inputmethod.ui5;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class CustomTabsService extends Service {
    final qpb<IBinder, IBinder.DeathRecipient> a = new qpb<>();
    private ui5.a b = new a();

    class a extends ui5.a {
        a() {
        }

        private PendingIntent u2(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        private Uri v2(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) androidx.browser.customtabs.a.a(bundle, "target_origin", Uri.class) : (Uri) bundle.getParcelable("target_origin");
        }

        private boolean w2(ti5 ti5Var, PendingIntent pendingIntent) {
            final c cVar = new c(ti5Var, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.b
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.this.a(cVar);
                    }
                };
                synchronized (CustomTabsService.this.a) {
                    ti5Var.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.a.put(ti5Var.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.e(cVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // com.google.inputmethod.ui5
        public boolean E(ti5 ti5Var, Uri uri) {
            return CustomTabsService.this.i(new c(ti5Var, null), uri, null, new Bundle());
        }

        @Override // com.google.inputmethod.ui5
        public boolean O1(ti5 ti5Var, Bundle bundle) {
            return CustomTabsService.this.c(new c(ti5Var, u2(bundle)), bundle);
        }

        @Override // com.google.inputmethod.ui5
        public int U0(ti5 ti5Var, String str, Bundle bundle) {
            return CustomTabsService.this.f(new c(ti5Var, u2(bundle)), str, bundle);
        }

        @Override // com.google.inputmethod.ui5
        public boolean Y0(ti5 ti5Var) {
            return w2(ti5Var, null);
        }

        @Override // com.google.inputmethod.ui5
        public boolean a1(ti5 ti5Var, IBinder iBinder, Bundle bundle) {
            return CustomTabsService.this.j(new c(ti5Var, u2(bundle)), d.a(iBinder), bundle);
        }

        @Override // com.google.inputmethod.ui5
        public boolean b2(ti5 ti5Var, Bundle bundle) {
            return CustomTabsService.this.k(new c(ti5Var, u2(bundle)), bundle);
        }

        @Override // com.google.inputmethod.ui5
        public boolean c1(ti5 ti5Var, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.l(new c(ti5Var, u2(bundle)), i, uri, bundle);
        }

        @Override // com.google.inputmethod.ui5
        public boolean g1(ti5 ti5Var, Uri uri, int i, Bundle bundle) {
            return CustomTabsService.this.g(new c(ti5Var, u2(bundle)), uri, i, bundle);
        }

        @Override // com.google.inputmethod.ui5
        public Bundle i1(String str, Bundle bundle) {
            return CustomTabsService.this.b(str, bundle);
        }

        @Override // com.google.inputmethod.ui5
        public boolean n(ti5 ti5Var, Uri uri, Bundle bundle) {
            return CustomTabsService.this.i(new c(ti5Var, u2(bundle)), uri, v2(bundle), bundle);
        }

        @Override // com.google.inputmethod.ui5
        public boolean o0(ti5 ti5Var, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.d(new c(ti5Var, u2(bundle)), uri, bundle, list);
        }

        @Override // com.google.inputmethod.ui5
        public boolean r0(long j) {
            return CustomTabsService.this.m(j);
        }

        @Override // com.google.inputmethod.ui5
        public boolean v1(ti5 ti5Var, Bundle bundle) {
            return w2(ti5Var, u2(bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(c cVar) {
        try {
            synchronized (this.a) {
                try {
                    IBinder iBinderA = cVar.a();
                    if (iBinderA == null) {
                        return false;
                    }
                    iBinderA.unlinkToDeath(this.a.get(iBinderA), 0);
                    this.a.remove(iBinderA);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    protected abstract Bundle b(String str, Bundle bundle);

    protected boolean c(c cVar, Bundle bundle) {
        return false;
    }

    protected abstract boolean d(c cVar, Uri uri, Bundle bundle, List<Bundle> list);

    protected abstract boolean e(c cVar);

    protected abstract int f(c cVar, String str, Bundle bundle);

    protected abstract boolean g(c cVar, Uri uri, int i, Bundle bundle);

    protected abstract boolean h(c cVar, Uri uri);

    protected boolean i(c cVar, Uri uri, Uri uri2, Bundle bundle) {
        return h(cVar, uri);
    }

    protected boolean j(c cVar, ct3 ct3Var, Bundle bundle) {
        return false;
    }

    protected abstract boolean k(c cVar, Bundle bundle);

    protected abstract boolean l(c cVar, int i, Uri uri, Bundle bundle);

    protected abstract boolean m(long j);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.b;
    }
}
