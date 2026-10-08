package androidx.compose.p002material3;

import com.google.inputmethod.CalendarDate;
import com.google.inputmethod.DateInputFormat;
import com.google.inputmethod.bo2;
import com.google.inputmethod.c21;
import com.google.inputmethod.ddb;
import com.google.inputmethod.vbc;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0018\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R$\u0010,\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b\u001a\u0010+R$\u00100\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010+¨\u00061"}, d2 = {"Landroidx/compose/material3/g;", "", "Lkotlin/ranges/IntRange;", "yearRange", "Lcom/google/android/ddb;", "selectableDates", "Lcom/google/android/on2;", "dateInputFormat", "Lcom/google/android/bo2;", "dateFormatter", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "<init>", "(Lkotlin/ranges/IntRange;Lcom/google/android/ddb;Lcom/google/android/on2;Lcom/google/android/bo2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/google/android/z11;", "dateToValidate", "Landroidx/compose/material3/m0;", "inputIdentifier", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "b", "(Lcom/google/android/z11;ILjava/util/Locale;)Ljava/lang/String;", "a", "Lkotlin/ranges/IntRange;", "Lcom/google/android/ddb;", "c", "Lcom/google/android/on2;", "d", "Lcom/google/android/bo2;", "e", "Ljava/lang/String;", "f", "g", "h", "", "i", "Ljava/lang/Long;", "getCurrentStartDateMillis", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "currentStartDateMillis", "j", "getCurrentEndDateMillis", "setCurrentEndDateMillis", "currentEndDateMillis", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final IntRange yearRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ddb selectableDates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final DateInputFormat dateInputFormat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final bo2 dateFormatter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String errorDatePattern;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String errorDateOutOfYearRange;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String errorInvalidNotAllowed;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String errorInvalidRangeInput;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Long currentStartDateMillis;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Long currentEndDateMillis;

    public g(IntRange intRange, ddb ddbVar, DateInputFormat dateInputFormat, bo2 bo2Var, String str, String str2, String str3, String str4) {
        this.yearRange = intRange;
        this.selectableDates = ddbVar;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = bo2Var;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
    }

    public final void a(Long l) {
        this.currentStartDateMillis = l;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public final String b(CalendarDate dateToValidate, int inputIdentifier, Locale locale) {
        long utcTimeMillis;
        Long l;
        long jLongValue;
        if (dateToValidate == null) {
            String str = this.errorDatePattern;
            String upperCase = this.dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return vbc.a(str, upperCase);
        }
        if (!this.yearRange.contains(dateToValidate.getYear())) {
            return vbc.a(this.errorDateOutOfYearRange, c21.c(this.yearRange.f(), 0, 0, false, locale, 7, null), c21.c(this.yearRange.i(), 0, 0, false, locale, 7, null));
        }
        ddb ddbVar = this.selectableDates;
        if (!ddbVar.b(dateToValidate.getYear()) || !ddbVar.a(dateToValidate.getUtcTimeMillis())) {
            return vbc.a(this.errorInvalidNotAllowed, bo2.b(this.dateFormatter, Long.valueOf(dateToValidate.getUtcTimeMillis()), locale, false, 4, null));
        }
        m0.Companion companion = m0.INSTANCE;
        if (m0.e(inputIdentifier, companion.c())) {
            long utcTimeMillis2 = dateToValidate.getUtcTimeMillis();
            Long l2 = this.currentEndDateMillis;
            if (utcTimeMillis2 <= (l2 != null ? l2.longValue() : Long.MAX_VALUE)) {
                if (m0.e(inputIdentifier, companion.a())) {
                    return "";
                }
                utcTimeMillis = dateToValidate.getUtcTimeMillis();
                l = this.currentStartDateMillis;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = Long.MIN_VALUE;
                }
                if (utcTimeMillis >= jLongValue) {
                    return "";
                }
            }
        } else {
            if (m0.e(inputIdentifier, companion.a())) {
                return "";
            }
            utcTimeMillis = dateToValidate.getUtcTimeMillis();
            l = this.currentStartDateMillis;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = Long.MIN_VALUE;
            }
            if (utcTimeMillis >= jLongValue) {
                return "";
            }
        }
        return this.errorInvalidRangeInput;
    }
}
