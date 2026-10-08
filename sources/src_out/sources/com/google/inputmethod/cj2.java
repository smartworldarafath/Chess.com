package com.google.inputmethod;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class cj2 {
    private final Object a = new Object();
    private final ui5 b;
    private final ti5 c;
    private final ComponentName d;
    private final PendingIntent e;

    class a extends vi5.a {
        private final Handler a = new Handler(Looper.getMainLooper());
        final /* synthetic */ ct3 b;

        a(ct3 ct3Var) {
            this.b = ct3Var;
        }

        @Override // com.google.inputmethod.vi5
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            Handler handler = this.a;
            final ct3 ct3Var = this.b;
            handler.post(new Runnable() { // from class: com.google.android.aj2
                @Override // java.lang.Runnable
                public final void run() {
                    ct3Var.onGreatestScrollPercentageIncreased(i, bundle);
                }
            });
        }

        @Override // com.google.inputmethod.vi5
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            Handler handler = this.a;
            final ct3 ct3Var = this.b;
            handler.post(new Runnable() { // from class: com.google.android.zi2
                @Override // java.lang.Runnable
                public final void run() {
                    ct3Var.onSessionEnded(z, bundle);
                }
            });
        }

        @Override // com.google.inputmethod.vi5
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            Handler handler = this.a;
            final ct3 ct3Var = this.b;
            handler.post(new Runnable() { // from class: com.google.android.bj2
                @Override // java.lang.Runnable
                public final void run() {
                    ct3Var.onVerticalScrollEvent(z, bundle);
                }
            });
        }
    }

    cj2(ui5 ui5Var, ti5 ti5Var, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = ui5Var;
        this.c = ti5Var;
        this.d = componentName;
        this.e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private vi5.a c(ct3 ct3Var) {
        return new a(ct3Var);
    }

    private Bundle d(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder e() {
        return this.c.asBinder();
    }

    ComponentName f() {
        return this.d;
    }

    PendingIntent g() {
        return this.e;
    }

    public boolean h(Bundle bundle) throws RemoteException {
        try {
            return this.b.O1(this.c, b(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean i(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.b.o0(this.c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int j(String str, Bundle bundle) {
        int iU0;
        Bundle bundleB = b(bundle);
        synchronized (this.a) {
            try {
                try {
                    iU0 = this.b.U0(this.c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iU0;
    }

    public boolean k(Uri uri) {
        return l(uri, null, new Bundle());
    }

    public boolean l(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleD = d(uri2);
            if (bundleD == null) {
                return this.b.E(this.c, uri);
            }
            bundle.putAll(bundleD);
            return this.b.n(this.c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean m(ct3 ct3Var, Bundle bundle) throws RemoteException {
        try {
            return this.b.a1(this.c, c(ct3Var).asBinder(), b(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }
}
