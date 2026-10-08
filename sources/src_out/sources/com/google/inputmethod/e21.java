package com.google.inputmethod;

import com.google.android.qjd;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 :2\u00020\u0001:\u0001'B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u0007*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J+\u0010'\u001a\u00020%2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u00100\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%02018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/google/android/e21;", "Lcom/google/android/d21;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "Ljava/time/LocalDate;", "firstDayLocalDate", "Lcom/google/android/h21;", "o", "(Ljava/time/LocalDate;)Lcom/google/android/h21;", "p", "(Lcom/google/android/h21;)Ljava/time/LocalDate;", "Lcom/google/android/on2;", "c", "(Ljava/util/Locale;)Lcom/google/android/on2;", "", "timeInMillis", "Lcom/google/android/z11;", "b", "(J)Lcom/google/android/z11;", "h", "(J)Lcom/google/android/h21;", "date", "i", "(Lcom/google/android/z11;)Lcom/google/android/h21;", "", "year", "month", "g", "(II)Lcom/google/android/h21;", "from", "addedMonthsCount", "m", "(Lcom/google/android/h21;I)Lcom/google/android/h21;", "utcTimeMillis", "", "pattern", "a", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "l", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Lcom/google/android/z11;", "toString", "()Ljava/lang/String;", "I", "d", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "Ljava/util/List;", "k", "()Ljava/util/List;", "weekdayNames", "j", "()Lcom/google/android/z11;", "today", "e", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e21 extends d21 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int f = 8;
    private static final ZoneId g = ZoneId.of("UTC");

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int firstDayOfWeek;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<Pair<String, String>> weekdayNames;

    /* JADX INFO: renamed from: com.google.android.e21$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/android/e21$a;", "", "<init>", "()V", "", "pattern", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "", "cache", "Ljava/time/format/DateTimeFormatter;", "c", "(Ljava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/time/format/DateTimeFormatter;", "", "utcTimeMillis", "b", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "Ljava/time/ZoneId;", "utcTimeZoneId", "Ljava/time/ZoneId;", "d", "()Ljava/time/ZoneId;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DateTimeFormatter c(String pattern, Locale locale, Map<String, Object> cache) {
            String str = "P:" + pattern + locale.toLanguageTag();
            Object objWithDecimalStyle = cache.get(str);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(pattern, locale).withDecimalStyle(DecimalStyle.of(locale));
                cache.put(str, objWithDecimalStyle);
            }
            Intrinsics.h(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
            return (DateTimeFormatter) objWithDecimalStyle;
        }

        public final String b(long utcTimeMillis, String pattern, Locale locale, Map<String, Object> cache) {
            return Instant.ofEpochMilli(utcTimeMillis).atZone(d()).toLocalDate().format(c(pattern, locale, cache));
        }

        public final ZoneId d() {
            return e21.g;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ EnumEntries<DayOfWeek> a = a.a(DayOfWeek.values());
    }

    public e21(Locale locale) {
        super(locale);
        this.firstDayOfWeek = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        EnumEntries<DayOfWeek> enumEntries = b.a;
        ArrayList arrayList = new ArrayList(enumEntries.size());
        int size = enumEntries.size();
        for (int i = 0; i < size; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) enumEntries.get(i);
            arrayList.add(qjd.a(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.weekdayNames = arrayList;
    }

    private final CalendarMonth o(LocalDate firstDayLocalDate) {
        int value = firstDayLocalDate.getDayOfWeek().getValue() - getFirstDayOfWeek();
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(firstDayLocalDate.getYear(), firstDayLocalDate.getMonthValue(), firstDayLocalDate.lengthOfMonth(), value, firstDayLocalDate.atTime(LocalTime.MIDNIGHT).atZone(g).toInstant().toEpochMilli());
    }

    private final LocalDate p(CalendarMonth calendarMonth) {
        return Instant.ofEpochMilli(calendarMonth.getStartUtcTimeMillis()).atZone(g).toLocalDate();
    }

    @Override // com.google.inputmethod.d21
    public String a(long utcTimeMillis, String pattern, Locale locale) {
        return INSTANCE.b(utcTimeMillis, pattern, locale, e());
    }

    @Override // com.google.inputmethod.d21
    public CalendarDate b(long timeInMillis) {
        LocalDate localDate = Instant.ofEpochMilli(timeInMillis).atZone(g).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), ((long) 1000) * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // com.google.inputmethod.d21
    public DateInputFormat c(Locale locale) {
        return f21.a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // com.google.inputmethod.d21
    /* JADX INFO: renamed from: d, reason: from getter */
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // com.google.inputmethod.d21
    public CalendarMonth g(int year, int month) {
        return o(LocalDate.of(year, month, 1));
    }

    @Override // com.google.inputmethod.d21
    public CalendarMonth h(long timeInMillis) {
        return o(Instant.ofEpochMilli(timeInMillis).atZone(g).withDayOfMonth(1).toLocalDate());
    }

    @Override // com.google.inputmethod.d21
    public CalendarMonth i(CalendarDate date) {
        return o(LocalDate.of(date.getYear(), date.getMonth(), 1));
    }

    @Override // com.google.inputmethod.d21
    public CalendarDate j() {
        LocalDate localDateNow = LocalDate.now();
        return new CalendarDate(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(g).toInstant().toEpochMilli());
    }

    @Override // com.google.inputmethod.d21
    public List<Pair<String, String>> k() {
        return this.weekdayNames;
    }

    @Override // com.google.inputmethod.d21
    public CalendarDate l(String date, String pattern, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(date, INSTANCE.c(pattern, locale, e()));
            return new CalendarDate(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(g).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // com.google.inputmethod.d21
    public CalendarMonth m(CalendarMonth from, int addedMonthsCount) {
        return addedMonthsCount <= 0 ? from : o(p(from).plusMonths(addedMonthsCount));
    }

    public String toString() {
        return "CalendarModel";
    }
}
