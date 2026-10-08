package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.inputmethod.ti5;
import com.google.inputmethod.zi5;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class PostMessageService extends Service {
    private zi5.a a = new a();

    class a extends zi5.a {
        a() {
        }

        @Override // com.google.inputmethod.zi5
        public void R0(ti5 ti5Var, String str, Bundle bundle) throws RemoteException {
            ti5Var.m2(str, bundle);
        }

        @Override // com.google.inputmethod.zi5
        public void f2(ti5 ti5Var, Bundle bundle) throws RemoteException {
            ti5Var.o2(bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
