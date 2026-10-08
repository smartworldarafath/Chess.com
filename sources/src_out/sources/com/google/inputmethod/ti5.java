package com.google.inputmethod;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface ti5 extends IInterface {
    public static final String X1 = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    public static abstract class a extends Binder implements ti5 {

        /* JADX INFO: renamed from: com.google.android.ti5$a$a, reason: collision with other inner class name */
        private static class C0124a implements ti5 {
            private IBinder a;

            C0124a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.google.inputmethod.ti5
            public void D0(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    parcelObtain.writeInt(i);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public void T1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public void W1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.google.inputmethod.ti5
            public void m2(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public void o2(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public void p2(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    parcelObtain.writeInt(i);
                    b.d(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public void r(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public void v0(int i, int i2, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public void x1(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public void y1(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ti5
            public Bundle z(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ti5.X1);
                    parcelObtain.writeString(str);
                    b.d(parcelObtain, bundle, 0);
                    this.a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) b.c(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, ti5.X1);
        }

        public static ti5 V1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ti5.X1);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ti5)) ? new C0124a(iBinder) : (ti5) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = ti5.X1;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    D0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    x1(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    o2((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    m2(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    p2(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleZ = z(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleZ, 1);
                    return true;
                case 8:
                    v0(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    y1((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    r(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    T1((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    W1((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
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

    void D0(int i, Bundle bundle) throws RemoteException;

    void T1(Bundle bundle) throws RemoteException;

    void W1(Bundle bundle) throws RemoteException;

    void m2(String str, Bundle bundle) throws RemoteException;

    void o2(Bundle bundle) throws RemoteException;

    void p2(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    void r(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException;

    void v0(int i, int i2, Bundle bundle) throws RemoteException;

    void x1(String str, Bundle bundle) throws RemoteException;

    void y1(Bundle bundle) throws RemoteException;

    Bundle z(String str, Bundle bundle) throws RemoteException;
}
