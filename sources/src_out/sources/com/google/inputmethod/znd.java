package com.google.inputmethod;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.ubd;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class znd {
    private static final fod a;
    private static final dd7<String, Typeface> b;
    private static Paint c;

    public static class a extends nm4.c {
        private mla.c a;

        public a(mla.c cVar) {
            this.a = cVar;
        }

        @Override // com.google.android.nm4.c
        public void a(int i) {
            mla.c cVar = this.a;
            if (cVar != null) {
                cVar.f(i);
            }
        }

        @Override // com.google.android.nm4.c
        public void b(Typeface typeface) {
            mla.c cVar = this.a;
            if (cVar != null) {
                cVar.g(typeface);
            }
        }
    }

    static {
        ubd.c("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new eod();
        } else if (i >= 29) {
            a = new dod();
        } else {
            a = new cod();
        }
        b = new dd7<>(16);
        c = null;
        ubd.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, nm4.b[] bVarArr, int i) {
        ubd.c("TypefaceCompat.createFromFontInfo");
        try {
            return a.b(context, cancellationSignal, bVarArr, i);
        } finally {
            ubd.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<nm4.b[]> list, int i) {
        ubd.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return a.c(context, cancellationSignal, list, i);
        } finally {
            ubd.f();
        }
    }

    public static Typeface d(Context context, dm4.a aVar, Resources resources, int i, String str, int i2, int i3, mla.c cVar, Handler handler, boolean z) {
        Typeface typefaceA;
        if (aVar instanceof dm4.d) {
            dm4.d dVar = (dm4.d) aVar;
            Typeface typefaceI = i(dVar);
            if (typefaceI != null) {
                if (cVar != null) {
                    cVar.d(typefaceI, handler);
                }
                b.f(f(resources, i, str, i2, i3), typefaceI);
                return typefaceI;
            }
            typefaceA = nm4.c(context, dVar.b(), i3, !z ? cVar != null : dVar.a() != 0, z ? dVar.d() : -1, mla.c.e(handler), new a(cVar));
        } else {
            typefaceA = a.a(context, (dm4.b) aVar, resources, i3);
            if (cVar != null) {
                if (typefaceA != null) {
                    cVar.d(typefaceA, handler);
                } else {
                    cVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            b.f(f(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceD = a.d(context, resources, i, str, i3);
        if (typefaceD != null) {
            b.f(f(resources, i, str, i2, i3), typefaceD);
        }
        return typefaceD;
    }

    private static String f(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface g(Resources resources, int i, String str, int i2, int i3) {
        return b.d(f(resources, i, str, i2, i3));
    }

    public static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    private static Typeface i(dm4.d dVar) {
        FontFamily fontFamilyBuild;
        Typeface typefaceH;
        String strC = dVar.c();
        if (!TextUtils.isEmpty(strC) && (typefaceH = h(strC)) != null) {
            return typefaceH;
        }
        List<zl4> listB = dVar.b();
        if (listB.size() == 1) {
            return h(listB.get(0).h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i = 0; i < listB.size(); i++) {
            if (h(listB.get(i).h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilderA = null;
        for (int i2 = 0; i2 < listB.size(); i2++) {
            zl4 zl4Var = listB.get(i2);
            if (i2 == listB.size() - 1 && TextUtils.isEmpty(zl4Var.i())) {
                customFallbackBuilderA.setSystemFallback(zl4Var.h());
                break;
            }
            Font fontJ = j(h(zl4Var.h()));
            if (fontJ == null) {
                zl4Var.h();
                return null;
            }
            if (TextUtils.isEmpty(zl4Var.i())) {
                fontFamilyBuild = mnd.a(fontJ).build();
            } else {
                try {
                    ond.a();
                    pnd.a();
                    fontFamilyBuild = mnd.a(ynd.a(fontJ).setFontVariationSettings(zl4Var.i()).build()).build();
                } catch (IOException unused) {
                    return null;
                }
            }
            if (customFallbackBuilderA == null) {
                customFallbackBuilderA = nnd.a(fontFamilyBuild);
            } else {
                customFallbackBuilderA.addCustomFallback(fontFamilyBuild);
            }
        }
        return customFallbackBuilderA.build();
    }

    public static Font j(Typeface typeface) {
        if (c == null) {
            c = new Paint();
        }
        c.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
