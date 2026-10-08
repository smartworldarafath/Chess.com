package com.google.inputmethod;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface dj5 extends IInterface {
    public static final String e2 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    public static abstract class a extends Binder implements dj5 {

        /* JADX INFO: renamed from: com.google.android.dj5$a$a, reason: collision with other inner class name */
        private static class C0107a implements dj5 {
            private IBinder a;

            C0107a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static dj5 V1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(dj5.e2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dj5)) ? new C0107a(iBinder) : (dj5) iInterfaceQueryLocalInterface;
        }
    }
}
