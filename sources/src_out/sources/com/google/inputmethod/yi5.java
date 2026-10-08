package com.google.inputmethod;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface yi5 extends IInterface {
    public static final String a2 = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public static abstract class a extends Binder implements yi5 {

        /* JADX INFO: renamed from: com.google.android.yi5$a$a, reason: collision with other inner class name */
        private static class C0132a implements yi5 {
            private IBinder a;

            C0132a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.google.inputmethod.yi5
            public void P0(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(yi5.a2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeTypedObject(notification, 0);
                    this.a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }
        }

        public static yi5 V1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(yi5.a2);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yi5)) ? new C0132a(iBinder) : (yi5) iInterfaceQueryLocalInterface;
        }
    }

    void P0(String str, int i, String str2, Notification notification) throws RemoteException;
}
