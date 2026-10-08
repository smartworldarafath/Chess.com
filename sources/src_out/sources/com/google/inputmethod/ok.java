package com.google.inputmethod;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Lcom/google/android/f43;", "a", "(Landroid/content/Context;)Lcom/google/android/f43;", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ok {
    public static final f43 a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        em4 em4VarB = fm4.a.b(f);
        if (em4VarB == null) {
            em4VarB = new LinearFontScaleConverter(f);
        }
        return new DensityWithConverter(f2, f, em4VarB);
    }
}
