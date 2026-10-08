package androidx.compose.p002material3;

import androidx.compose.p001foundation.lazy.LazyListState;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.CalendarMonth;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1653}, m = "invokeSuspend")
final class C0178DatePickerKt$DatePickerContent$2$4$2$2$1$1$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ CalendarMonth $displayedMonth;
    final /* synthetic */ LazyListState $monthsListState;
    final /* synthetic */ int $year;
    final /* synthetic */ IntRange $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0178DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(LazyListState lazyListState, int i, IntRange intRange, CalendarMonth calendarMonth, q22<? super C0178DatePickerKt$DatePickerContent$2$4$2$2$1$1$1> q22Var) {
        super(2, q22Var);
        this.$monthsListState = lazyListState;
        this.$year = i;
        this.$yearRange = intRange;
        this.$displayedMonth = calendarMonth;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0178DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            LazyListState lazyListState = this.$monthsListState;
            int iF = (((this.$year - this.$yearRange.f()) * 12) + this.$displayedMonth.getMonth()) - 1;
            this.label = 1;
            if (LazyListState.S(lazyListState, iF, 0, this, 2, null) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }
}
