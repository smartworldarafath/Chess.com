package com.google.inputmethod;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b!\u0010\"J-\u0010#\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b#\u0010$R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R&\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f04038&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/google/android/d21;", "", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Lcom/google/android/on2;", "c", "(Ljava/util/Locale;)Lcom/google/android/on2;", "", "timeInMillis", "Lcom/google/android/z11;", "b", "(J)Lcom/google/android/z11;", "Lcom/google/android/h21;", "h", "(J)Lcom/google/android/h21;", "date", "i", "(Lcom/google/android/z11;)Lcom/google/android/h21;", "", "year", "month", "g", "(II)Lcom/google/android/h21;", "from", "addedMonthsCount", "m", "(Lcom/google/android/h21;I)Lcom/google/android/h21;", "utcTimeMillis", "", "pattern", "a", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Lcom/google/android/z11;", "Ljava/util/Locale;", "f", "()Ljava/util/Locale;", "", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "formatterCache", "j", "()Lcom/google/android/z11;", "today", "d", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "k", "()Ljava/util/List;", "weekdayNames", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d21 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Map<String, Object> formatterCache = new LinkedHashMap();

    public d21(Locale locale) {
        this.locale = locale;
    }

    public abstract String a(long utcTimeMillis, String pattern, Locale locale);

    public abstract CalendarDate b(long timeInMillis);

    public abstract DateInputFormat c(Locale locale);

    public abstract int d();

    public final Map<String, Object> e() {
        return this.formatterCache;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    public abstract CalendarMonth g(int year, int month);

    public abstract CalendarMonth h(long timeInMillis);

    public abstract CalendarMonth i(CalendarDate date);

    public abstract CalendarDate j();

    public abstract List<Pair<String, String>> k();

    public abstract CalendarDate l(String date, String pattern, Locale locale);

    public abstract CalendarMonth m(CalendarMonth from, int addedMonthsCount);
}
