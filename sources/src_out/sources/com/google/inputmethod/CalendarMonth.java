package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: com.google.android.h21, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010!\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b \u0010\u001f¨\u0006\""}, d2 = {"Lcom/google/android/h21;", "", "", "year", "month", "numberOfDays", "daysFromStartOfWeekToFirstOfMonth", "", "startUtcTimeMillis", "<init>", "(IIIIJ)V", "Lkotlin/ranges/IntRange;", "years", "f", "(Lkotlin/ranges/IntRange;)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "d", "J", "()J", "getEndUtcTimeMillis", "endUtcTimeMillis", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalendarMonth {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int month;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int numberOfDays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int daysFromStartOfWeekToFirstOfMonth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final long startUtcTimeMillis;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long endUtcTimeMillis;

    public CalendarMonth(int i, int i2, int i3, int i4, long j) {
        this.year = i;
        this.month = i2;
        this.numberOfDays = i3;
        this.daysFromStartOfWeekToFirstOfMonth = i4;
        this.startUtcTimeMillis = j;
        this.endUtcTimeMillis = (j + (((long) i3) * 86400000)) - 1;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) other;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    public final int f(IntRange years) {
        return (((this.year - years.f()) * 12) + this.month) - 1;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.numberOfDays)) * 31) + Integer.hashCode(this.daysFromStartOfWeekToFirstOfMonth)) * 31) + Long.hashCode(this.startUtcTimeMillis);
    }

    public String toString() {
        return "CalendarMonth(year=" + this.year + ", month=" + this.month + ", numberOfDays=" + this.numberOfDays + ", daysFromStartOfWeekToFirstOfMonth=" + this.daysFromStartOfWeekToFirstOfMonth + ", startUtcTimeMillis=" + this.startUtcTimeMillis + ')';
    }
}
