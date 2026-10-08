package com.google.inputmethod;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface bj5 extends IInterface {
    public static final String c2 = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    public static abstract class a extends Binder implements bj5 {

        /* JADX INFO: renamed from: com.google.android.bj5$a$a, reason: collision with other inner class name */
        private static class C0099a implements bj5 {
            private IBinder a;

            C0099a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static bj5 V1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(bj5.c2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bj5)) ? new C0099a(iBinder) : (bj5) iInterfaceQueryLocalInterface;
        }
    }
}
