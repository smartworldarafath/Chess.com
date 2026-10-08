package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.inputmethod.b10;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    static final b10<String, Integer> c;
    private static final String[] d;
    private static final String[] e;
    private static final String[] f;
    final Bundle a;
    private MediaMetadata b;

    class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        b10<String, Integer> b10Var = new b10<>();
        c = b10Var;
        b10Var.put("android.media.metadata.TITLE", 1);
        b10Var.put("android.media.metadata.ARTIST", 1);
        b10Var.put("android.media.metadata.DURATION", 0);
        b10Var.put("android.media.metadata.ALBUM", 1);
        b10Var.put("android.media.metadata.AUTHOR", 1);
        b10Var.put("android.media.metadata.WRITER", 1);
        b10Var.put("android.media.metadata.COMPOSER", 1);
        b10Var.put("android.media.metadata.COMPILATION", 1);
        b10Var.put("android.media.metadata.DATE", 1);
        b10Var.put("android.media.metadata.YEAR", 0);
        b10Var.put("android.media.metadata.GENRE", 1);
        b10Var.put("android.media.metadata.TRACK_NUMBER", 0);
        b10Var.put("android.media.metadata.NUM_TRACKS", 0);
        b10Var.put("android.media.metadata.DISC_NUMBER", 0);
        b10Var.put("android.media.metadata.ALBUM_ARTIST", 1);
        b10Var.put("android.media.metadata.ART", 2);
        b10Var.put("android.media.metadata.ART_URI", 1);
        b10Var.put("android.media.metadata.ALBUM_ART", 2);
        b10Var.put("android.media.metadata.ALBUM_ART_URI", 1);
        b10Var.put("android.media.metadata.USER_RATING", 3);
        b10Var.put("android.media.metadata.RATING", 3);
        b10Var.put("android.media.metadata.DISPLAY_TITLE", 1);
        b10Var.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        b10Var.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        b10Var.put("android.media.metadata.DISPLAY_ICON", 2);
        b10Var.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        b10Var.put("android.media.metadata.MEDIA_ID", 1);
        b10Var.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        b10Var.put("android.media.metadata.MEDIA_URI", 1);
        b10Var.put("android.media.metadata.ADVERTISEMENT", 0);
        b10Var.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        e = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.b = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
