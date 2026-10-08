package com.google.inputmethod;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Lcom/google/android/d21;", "a", "(Ljava/util/Locale;)Lcom/google/android/d21;", "", "utcTimeMillis", "", "skeleton", "", "", "cache", "b", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g21 {
    public static final d21 a(Locale locale) {
        return new e21(locale);
    }

    public static final String b(long j, String str, Locale locale, Map<String, Object> map) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = map.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            map.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        Intrinsics.h(obj2, "null cannot be cast to non-null type android.icu.text.DateFormat");
        return ((DateFormat) obj2).format(new Date(j));
    }
}
