package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import com.google.inputmethod.lo6;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: android.support.v4.media.session.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0001a extends Binder implements a {
        public AbstractBinderC0001a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i) {
                case 1:
                    h(parcel.readString(), (Bundle) b.b(parcel, Bundle.CREATOR));
                    return true;
                case 2:
                    M();
                    return true;
                case 3:
                    r2((PlaybackStateCompat) b.b(parcel, PlaybackStateCompat.CREATOR));
                    return true;
                case 4:
                    u1((MediaMetadataCompat) b.b(parcel, MediaMetadataCompat.CREATOR));
                    return true;
                case 5:
                    x(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    Y1((CharSequence) b.b(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    return true;
                case 7:
                    N1((Bundle) b.b(parcel, Bundle.CREATOR));
                    return true;
                case 8:
                    I1((ParcelableVolumeInfo) b.b(parcel, ParcelableVolumeInfo.CREATOR));
                    return true;
                case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                    onRepeatModeChanged(parcel.readInt());
                    return true;
                case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                    X1(parcel.readInt() != 0);
                    return true;
                case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                    R1(parcel.readInt() != 0);
                    return true;
                case 12:
                    z1(parcel.readInt());
                    return true;
                case 13:
                    v();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void I1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void M() throws RemoteException;

    void N1(Bundle bundle) throws RemoteException;

    void R1(boolean z) throws RemoteException;

    void X1(boolean z) throws RemoteException;

    void Y1(CharSequence charSequence) throws RemoteException;

    void h(String str, Bundle bundle) throws RemoteException;

    void onRepeatModeChanged(int i) throws RemoteException;

    void r2(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void u1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void v() throws RemoteException;

    void x(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void z1(int i) throws RemoteException;
}
