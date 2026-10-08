package androidx.browser.trusted;

import android.os.IBinder;
import com.google.inputmethod.bj5;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class c {
    private final bj5 a;

    private c(bj5 bj5Var) {
        this.a = bj5Var;
    }

    static c a(IBinder iBinder) {
        bj5 bj5VarV1 = iBinder == null ? null : bj5.a.V1(iBinder);
        if (bj5VarV1 == null) {
            return null;
        }
        return new c(bj5VarV1);
    }
}
