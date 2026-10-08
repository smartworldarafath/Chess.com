package androidx.compose.p002material3;

import androidx.compose.p002material3.a0;
import androidx.compose.p004runtime.s0;
import com.google.inputmethod.CalendarDate;
import com.google.inputmethod.ddb;
import com.google.inputmethod.k0b;
import com.google.inputmethod.k47;
import com.google.inputmethod.o0b;
import com.google.inputmethod.o58;
import com.google.inputmethod.wp2;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0003\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001\u001bB?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R(\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u001f\"\u0004\b\u0013\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/material3/a0;", "Landroidx/compose/material3/a;", "Lcom/google/android/wp2;", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/c0;", "initialDisplayMode", "Lcom/google/android/ddb;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILcom/google/android/ddb;Ljava/util/Locale;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/o58;", "Lcom/google/android/z11;", "f", "Lcom/google/android/o58;", "_selectedDate", "g", "_displayMode", "dateMillis", "d", "()Ljava/lang/Long;", "a", "(Ljava/lang/Long;)V", "selectedDateMillis", "displayMode", "()I", "(I)V", "h", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 extends a implements wp2 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private o58<CalendarDate> _selectedDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private o58<c0> _displayMode;

    /* JADX INFO: renamed from: androidx.compose.material3.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/material3/a0$a;", "", "<init>", "()V", "Lcom/google/android/ddb;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Lcom/google/android/k0b;", "Landroidx/compose/material3/a0;", "c", "(Lcom/google/android/ddb;Ljava/util/Locale;)Lcom/google/android/k0b;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(o0b o0bVar, a0 a0Var) {
            return m.s(new Object[]{a0Var.d(), Long.valueOf(a0Var.h()), Integer.valueOf(a0Var.getYearRange().f()), Integer.valueOf(a0Var.getYearRange().i()), Integer.valueOf(a0Var.g())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a0 e(ddb ddbVar, Locale locale, List list) {
            Long l = (Long) list.get(0);
            Long l2 = (Long) list.get(1);
            Object obj = list.get(2);
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(3);
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Int");
            IntRange intRange = new IntRange(iIntValue, ((Integer) obj2).intValue());
            Object obj3 = list.get(4);
            Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new a0(l, l2, intRange, c0.d(((Integer) obj3).intValue()), ddbVar, locale, null);
        }

        public final k0b<a0, Object> c(final ddb selectableDates, final Locale locale) {
            return k47.b(new Function2() { // from class: androidx.compose.material3.z
                public final Object invoke(Object obj, Object obj2) {
                    return a0.Companion.d((o0b) obj, (a0) obj2);
                }
            }, new Function1() { // from class: com.google.android.xp2
                public final Object invoke(Object obj) {
                    return a0.Companion.e(selectableDates, locale, (List) obj);
                }
            });
        }

        private Companion() {
        }
    }

    public /* synthetic */ a0(Long l, Long l2, IntRange intRange, int i, ddb ddbVar, Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, l2, intRange, i, ddbVar, locale);
    }

    @Override // com.google.inputmethod.wp2
    public void a(Long l) {
        if (l == null) {
            this._selectedDate.setValue(null);
        } else {
            CalendarDate calendarDateB = getCalendarModel().b(l.longValue());
            this._selectedDate.setValue(getYearRange().contains(calendarDateB.getYear()) ? calendarDateB : null);
        }
    }

    @Override // com.google.inputmethod.wp2
    public Long d() {
        CalendarDate value = this._selectedDate.getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Override // com.google.inputmethod.wp2
    public void f(int i) {
        Long lD = d();
        if (lD != null) {
            b(getCalendarModel().h(lD.longValue()).getStartUtcTimeMillis());
        }
        this._displayMode.setValue(c0.c(i));
    }

    @Override // com.google.inputmethod.wp2
    public int g() {
        return this._displayMode.getValue().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    private a0(Long l, Long l2, IntRange intRange, int i, ddb ddbVar, Locale locale) {
        CalendarDate calendarDateB;
        super(l2, intRange, ddbVar, locale);
        if (l != null) {
            calendarDateB = getCalendarModel().b(l.longValue());
            calendarDateB = intRange.contains(calendarDateB.getYear()) ? calendarDateB : null;
        }
        this._selectedDate = s0.e(calendarDateB, null, 2, null);
        this._displayMode = s0.e(c0.c(i), null, 2, null);
    }
}
