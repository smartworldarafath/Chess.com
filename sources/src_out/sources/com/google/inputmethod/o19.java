package com.google.inputmethod;

import android.os.Build;
import android.os.Parcel;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class o19 {

    static class a {
        static void a(Parcel parcel, boolean z) {
            parcel.writeBoolean(z);
        }
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(Parcel parcel, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(parcel, z);
        } else {
            parcel.writeInt(z ? 1 : 0);
        }
    }
}
