package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "radiusX", "radiusY", "Lcom/google/android/i5d;", "edgeTreatment", "Lcom/google/android/sp0;", "a", "(FFI)Lcom/google/android/sp0;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nga {
    public static final BlurEffect a(float f, float f2, int i) {
        return new BlurEffect(null, f, f2, i, null);
    }

    public static /* synthetic */ BlurEffect b(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = i5d.INSTANCE.a();
        }
        return a(f, f2, i);
    }
}
