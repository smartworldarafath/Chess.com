package com.google.inputmethod;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class dod extends fod {
    private Font h(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM = m(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM2 = m(fontStyle, font2.getStyle());
            if (iM2 < iM) {
                font = font2;
                iM = iM2;
            }
        }
        return font;
    }

    private Font i(CancellationSignal cancellationSignal, nm4.b bVar, ContentResolver contentResolver) {
        return bVar.h() ? l(bVar) : k(cancellationSignal, bVar, contentResolver);
    }

    private Font k(CancellationSignal cancellationSignal, nm4.b bVar, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.f()).setSlant(bVar.g() ? 1 : 0).setTtcIndex(bVar.c());
                if (!TextUtils.isEmpty(bVar.e())) {
                    ttcIndex.setFontVariationSettings(bVar.e());
                }
                Font fontBuild = ttcIndex.build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return fontBuild;
            } catch (Throwable th) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private static int m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // com.google.inputmethod.fod
    public Typeface a(Context context, dm4.b bVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (dm4.c cVar : bVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, cVar.b()).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).setFontVariationSettings(cVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.google.inputmethod.fod
    public Typeface b(Context context, CancellationSignal cancellationSignal, nm4.b[] bVarArr, int i) {
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyJ == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyJ).setStyle(h(fontFamilyJ, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.inputmethod.fod
    public Typeface c(Context context, CancellationSignal cancellationSignal, List<nm4.b[]> list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyJ = j(cancellationSignal, list.get(0), contentResolver);
            if (fontFamilyJ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyJ);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyJ2 = j(cancellationSignal, list.get(i2), contentResolver);
                if (fontFamilyJ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyJ2);
                }
            }
            return customFallbackBuilder.setStyle(h(fontFamilyJ, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.inputmethod.fod
    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    protected FontFamily j(CancellationSignal cancellationSignal, nm4.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (nm4.b bVar : bVarArr) {
            Font fontI = i(cancellationSignal, bVar, contentResolver);
            if (fontI != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontI);
                } else {
                    builder.addFont(fontI);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    protected Font l(nm4.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
