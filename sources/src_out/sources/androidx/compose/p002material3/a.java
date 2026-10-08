package androidx.compose.p002material3;

import androidx.compose.p004runtime.s0;
import com.google.inputmethod.CalendarMonth;
import com.google.inputmethod.d21;
import com.google.inputmethod.ddb;
import com.google.inputmethod.g21;
import com.google.inputmethod.o58;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\n\u001a\u00060\bj\u0002`\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR$\u0010(\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b\u0011\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/material3/a;", "", "", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Lcom/google/android/ddb;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Lkotlin/ranges/IntRange;Lcom/google/android/ddb;Ljava/util/Locale;)V", "a", "Lkotlin/ranges/IntRange;", "e", "()Lkotlin/ranges/IntRange;", "b", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "Lcom/google/android/d21;", "c", "Lcom/google/android/d21;", "i", "()Lcom/google/android/d21;", "calendarModel", "<set-?>", "d", "Lcom/google/android/o58;", "()Lcom/google/android/ddb;", "j", "(Lcom/google/android/ddb;)V", "Lcom/google/android/o58;", "Lcom/google/android/h21;", "_displayedMonth", "monthMillis", "h", "()J", "(J)V", "displayedMonthMillis", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final IntRange yearRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d21 calendarModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o58 selectableDates;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final o58<CalendarMonth> _displayedMonth;

    public a(Long l, IntRange intRange, ddb ddbVar, Locale locale) {
        CalendarMonth calendarMonthI;
        this.yearRange = intRange;
        this.locale = locale;
        d21 d21VarA = g21.a(locale);
        this.calendarModel = d21VarA;
        this.selectableDates = s0.e(ddbVar, null, 2, null);
        if (l != null) {
            calendarMonthI = d21VarA.h(l.longValue());
            if (!intRange.contains(calendarMonthI.getYear())) {
                calendarMonthI = d21VarA.i(d21VarA.j());
            }
        } else {
            calendarMonthI = d21VarA.i(d21VarA.j());
        }
        this._displayedMonth = s0.e(calendarMonthI, null, 2, null);
    }

    public final void b(long j) {
        CalendarMonth calendarMonthH = this.calendarModel.h(j);
        if (this.yearRange.contains(calendarMonthH.getYear())) {
            this._displayedMonth.setValue(calendarMonthH);
        }
    }

    public final ddb c() {
        return (ddb) this.selectableDates.getValue();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final IntRange getYearRange() {
        return this.yearRange;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final long h() {
        return this._displayedMonth.getValue().getStartUtcTimeMillis();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d21 getCalendarModel() {
        return this.calendarModel;
    }

    public final void j(ddb ddbVar) {
        this.selectableDates.setValue(ddbVar);
    }
}
