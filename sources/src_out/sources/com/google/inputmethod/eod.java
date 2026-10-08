package com.google.inputmethod;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class eod extends dod {
    private static Typeface n(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // com.google.inputmethod.dod
    protected Font l(nm4.b bVar) {
        Typeface typefaceN;
        Font fontJ;
        String strB = bVar.b();
        if (strB == null || (typefaceN = n(strB)) == null || (fontJ = znd.j(typefaceN)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.e())) {
            return fontJ;
        }
        try {
            return new Font.Builder(fontJ).setFontVariationSettings(bVar.e()).build();
        } catch (IOException unused) {
            return null;
        }
    }
}
