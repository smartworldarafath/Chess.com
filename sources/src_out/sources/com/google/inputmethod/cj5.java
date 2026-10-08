package com.google.inputmethod;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface cj5 extends IInterface {
    public static final String d2 = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    public static abstract class a extends Binder implements cj5 {
        public a() {
            attachInterface(this, cj5.d2);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = cj5.d2;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    Bundle bundleP = P((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleP, 1);
                    return true;
                case 3:
                    e2((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iZ1 = Z1();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZ1);
                    return true;
                case 5:
                    Bundle bundleM1 = M1();
                    parcel2.writeNoException();
                    b.d(parcel2, bundleM1, 1);
                    return true;
                case 6:
                    Bundle bundleA2 = a2((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleA2, 1);
                    return true;
                case 7:
                    Bundle bundleT1 = t1();
                    parcel2.writeNoException();
                    b.d(parcel2, bundleT1, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    Bundle bundleJ1 = j1(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    b.d(parcel2, bundleJ1, 1);
                    return true;
            }
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    Bundle M1() throws RemoteException;

    Bundle P(Bundle bundle) throws RemoteException;

    int Z1() throws RemoteException;

    Bundle a2(Bundle bundle) throws RemoteException;

    void e2(Bundle bundle) throws RemoteException;

    Bundle j1(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    Bundle t1() throws RemoteException;
}
