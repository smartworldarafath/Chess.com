package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.inputmethod.dj5;
import com.google.inputmethod.ej5;
import com.google.inputmethod.wtd;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    private ej5.a a = new a();

    class a extends ej5.a {
        a() {
        }

        @Override // com.google.inputmethod.ej5
        public void C1(dj5 dj5Var) throws RemoteException {
            if (dj5Var == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.a(new wtd(dj5Var));
        }
    }

    protected abstract void a(wtd wtdVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
