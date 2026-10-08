package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.inputmethod.ct3;
import com.google.inputmethod.vi5;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
final class d implements ct3 {
    private final vi5 a;

    private d(vi5 vi5Var) {
        this.a = vi5Var;
    }

    static d a(IBinder iBinder) {
        return new d(vi5.a.V1(iBinder));
    }

    @Override // com.google.inputmethod.ct3
    public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.a.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.inputmethod.ct3
    public void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.a.onSessionEnded(z, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.inputmethod.ct3
    public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            this.a.onVerticalScrollEvent(z, bundle);
        } catch (RemoteException unused) {
        }
    }
}
