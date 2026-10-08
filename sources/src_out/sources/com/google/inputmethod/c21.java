package com.google.inputmethod;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\" \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f*\n\u0010\u0011\"\u00020\u00052\u00020\u0005¨\u0006\u0012"}, d2 = {"", "minDigits", "maxDigits", "", "isGroupingUsed", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "b", "(IIIZLjava/util/Locale;)Ljava/lang/String;", "Ljava/text/NumberFormat;", "a", "(IIZLjava/util/Locale;)Ljava/text/NumberFormat;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "cachedFormatters", "CalendarLocale", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c21 {
    private static final WeakHashMap<String, NumberFormat> a = new WeakHashMap<>();

    private static final NumberFormat a(int i, int i2, boolean z, Locale locale) {
        String str = i + '.' + i2 + '.' + z + '.' + locale.toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = a;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(z);
            integerInstance.setMinimumIntegerDigits(i);
            integerInstance.setMaximumIntegerDigits(i2);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance;
    }

    public static final String b(int i, int i2, int i3, boolean z, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return a(i2, i3, z, locale).format(Integer.valueOf(i));
    }

    public static /* synthetic */ String c(int i, int i2, int i3, boolean z, Locale locale, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 1;
        }
        if ((i4 & 2) != 0) {
            i3 = 40;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            locale = null;
        }
        return b(i, i2, i3, z, locale);
    }
}
