package com.google.inputmethod;

import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H&¢\u0006\u0004\b\b\u0010\tJ1\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcom/google/android/bo2;", "", "", "monthMillis", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "a", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "dateMillis", "", "forContentDescription", "c", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface bo2 {
    static /* synthetic */ String b(bo2 bo2Var, Long l, Locale locale, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatDate");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return bo2Var.c(l, locale, z);
    }

    String a(Long monthMillis, Locale locale);

    String c(Long dateMillis, Locale locale, boolean forContentDescription);
}
