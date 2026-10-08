package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.inputmethod.ti5;
import com.google.inputmethod.vi2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class c {
    final ti5 a;
    private final PendingIntent b;
    private final vi2 c;

    class a extends vi2 {
        a() {
        }

        @Override // com.google.inputmethod.vi2
        public void extraCallback(String str, Bundle bundle) {
            try {
                c.this.a.x1(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            try {
                return c.this.a.z(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
            try {
                c.this.a.r(i, i2, i3, i4, i5, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onActivityResized(int i, int i2, Bundle bundle) {
            try {
                c.this.a.v0(i, i2, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onMessageChannelReady(Bundle bundle) {
            try {
                c.this.a.o2(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onMinimized(Bundle bundle) {
            try {
                c.this.a.T1(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onNavigationEvent(int i, Bundle bundle) {
            try {
                c.this.a.D0(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onPostMessage(String str, Bundle bundle) {
            try {
                c.this.a.m2(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                c.this.a.p2(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onUnminimized(Bundle bundle) {
            try {
                c.this.a.W1(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // com.google.inputmethod.vi2
        public void onWarmupCompleted(Bundle bundle) {
            try {
                c.this.a.y1(bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    c(ti5 ti5Var, PendingIntent pendingIntent) {
        if (ti5Var == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.a = ti5Var;
        this.b = pendingIntent;
        this.c = ti5Var == null ? null : new a();
    }

    private IBinder b() {
        ti5 ti5Var = this.a;
        if (ti5Var != null) {
            return ti5Var.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    IBinder a() {
        ti5 ti5Var = this.a;
        if (ti5Var == null) {
            return null;
        }
        return ti5Var.asBinder();
    }

    PendingIntent c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        PendingIntent pendingIntentC = cVar.c();
        PendingIntent pendingIntent = this.b;
        if ((pendingIntent == null) != (pendingIntentC == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentC) : b().equals(cVar.b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.b;
        return pendingIntent != null ? pendingIntent.hashCode() : b().hashCode();
    }
}
