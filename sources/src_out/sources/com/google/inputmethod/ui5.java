package com.google.inputmethod;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface ui5 extends IInterface {
    public static final String Y1 = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends Binder implements ui5 {

        /* JADX INFO: renamed from: com.google.android.ui5$a$a, reason: collision with other inner class name */
        private static class C0125a implements ui5 {
            private IBinder a;

            C0125a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.google.inputmethod.ui5
            public boolean E(ti5 ti5Var, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeStrongInterface(ti5Var);
                    b.f(parcelObtain, uri, 0);
                    this.a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ui5
            public boolean O1(ti5 ti5Var, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeStrongInterface(ti5Var);
                    b.f(parcelObtain, bundle, 0);
                    this.a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ui5
            public int U0(ti5 ti5Var, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeStrongInterface(ti5Var);
                    parcelObtain.writeString(str);
                    b.f(parcelObtain, bundle, 0);
                    this.a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ui5
            public boolean Y0(ti5 ti5Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeStrongInterface(ti5Var);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ui5
            public boolean a1(ti5 ti5Var, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeStrongInterface(ti5Var);
                    parcelObtain.writeStrongBinder(iBinder);
                    b.f(parcelObtain, bundle, 0);
                    this.a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.google.inputmethod.ui5
            public boolean n(ti5 ti5Var, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeStrongInterface(ti5Var);
                    b.f(parcelObtain, uri, 0);
                    b.f(parcelObtain, bundle, 0);
                    this.a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ui5
            public boolean o0(ti5 ti5Var, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeStrongInterface(ti5Var);
                    b.f(parcelObtain, uri, 0);
                    b.f(parcelObtain, bundle, 0);
                    b.e(parcelObtain, list, 0);
                    this.a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ui5
            public boolean r0(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeLong(j);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.google.inputmethod.ui5
            public boolean v1(ti5 ti5Var, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ui5.Y1);
                    parcelObtain.writeStrongInterface(ti5Var);
                    b.f(parcelObtain, bundle, 0);
                    this.a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, ui5.Y1);
        }

        public static ui5 V1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ui5.Y1);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ui5)) ? new C0125a(iBinder) : (ui5) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = ui5.Y1;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    boolean zR0 = r0(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zR0 ? 1 : 0);
                    return true;
                case 3:
                    boolean zY0 = Y0(ti5.a.V1(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zY0 ? 1 : 0);
                    return true;
                case 4:
                    ti5 ti5VarV1 = ti5.a.V1(parcel.readStrongBinder());
                    Uri uri = (Uri) b.d(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zO0 = o0(ti5VarV1, uri, (Bundle) b.d(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zO0 ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleI1 = i1(parcel.readString(), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.f(parcel2, bundleI1, 1);
                    return true;
                case 6:
                    boolean zB2 = b2(ti5.a.V1(parcel.readStrongBinder()), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zB2 ? 1 : 0);
                    return true;
                case 7:
                    boolean zE = E(ti5.a.V1(parcel.readStrongBinder()), (Uri) b.d(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zE ? 1 : 0);
                    return true;
                case 8:
                    int iU0 = U0(ti5.a.V1(parcel.readStrongBinder()), parcel.readString(), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iU0);
                    return true;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    boolean zC1 = c1(ti5.a.V1(parcel.readStrongBinder()), parcel.readInt(), (Uri) b.d(parcel, Uri.CREATOR), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zC1 ? 1 : 0);
                    return true;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    boolean zV1 = v1(ti5.a.V1(parcel.readStrongBinder()), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zV1 ? 1 : 0);
                    return true;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    boolean zN = n(ti5.a.V1(parcel.readStrongBinder()), (Uri) b.d(parcel, Uri.CREATOR), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zN ? 1 : 0);
                    return true;
                case 12:
                    boolean zG1 = g1(ti5.a.V1(parcel.readStrongBinder()), (Uri) b.d(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zG1 ? 1 : 0);
                    return true;
                case 13:
                    boolean zO1 = O1(ti5.a.V1(parcel.readStrongBinder()), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zO1 ? 1 : 0);
                    return true;
                case 14:
                    boolean zA1 = a1(ti5.a.V1(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) b.d(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zA1 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    boolean E(ti5 ti5Var, Uri uri) throws RemoteException;

    boolean O1(ti5 ti5Var, Bundle bundle) throws RemoteException;

    int U0(ti5 ti5Var, String str, Bundle bundle) throws RemoteException;

    boolean Y0(ti5 ti5Var) throws RemoteException;

    boolean a1(ti5 ti5Var, IBinder iBinder, Bundle bundle) throws RemoteException;

    boolean b2(ti5 ti5Var, Bundle bundle) throws RemoteException;

    boolean c1(ti5 ti5Var, int i, Uri uri, Bundle bundle) throws RemoteException;

    boolean g1(ti5 ti5Var, Uri uri, int i, Bundle bundle) throws RemoteException;

    Bundle i1(String str, Bundle bundle) throws RemoteException;

    boolean n(ti5 ti5Var, Uri uri, Bundle bundle) throws RemoteException;

    boolean o0(ti5 ti5Var, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean r0(long j) throws RemoteException;

    boolean v1(ti5 ti5Var, Bundle bundle) throws RemoteException;
}
