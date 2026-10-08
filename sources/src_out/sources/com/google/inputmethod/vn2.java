package com.google.inputmethod;

import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b-\b\u0007\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0001¢\u0006\u0004\b%\u0010&J-\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001fH\u0001¢\u0006\u0004\b(\u0010)J-\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010*\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0001¢\u0006\u0004\b+\u0010)J%\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020$2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u001f2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b7\u00106R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b8\u00106R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b=\u00106R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b?\u00106R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u00106R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\bB\u00106R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u00104\u001a\u0004\bC\u00106R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u00104\u001a\u0004\bD\u00106R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u00106R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u00106R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00104\u001a\u0004\bJ\u00106R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u00106R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00104\u001a\u0004\bN\u00106R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u00104\u001a\u0004\bP\u00106R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u00104\u001a\u0004\bR\u00106R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u00104\u001a\u0004\bT\u00106R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u00104\u001a\u0004\b@\u00106R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u00104\u001a\u0004\bW\u00106R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u00104\u001a\u0004\bY\u00106R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u00104\u001a\u0004\b;\u00106R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b9\u0010]¨\u0006^"}, d2 = {"Lcom/google/android/vn2;", "", "Lcom/google/android/ei1;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "Lcom/google/android/psc;", "dateTextFieldColors", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJLcom/google/android/psc;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "isToday", "selected", "inRange", "enabled", "Lcom/google/android/q6c;", "b", "(ZZZZLandroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "animate", "a", "(ZZZLandroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "currentYear", "l", "k", "(ZZLandroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "c", "()J", "h", "f", "d", "j", "e", "getSubheadContentColor-0d7_KjU", "g", "getYearContentColor-0d7_KjU", "getDisabledYearContentColor-0d7_KjU", "i", "getCurrentYearContentColor-0d7_KjU", "getSelectedYearContentColor-0d7_KjU", "getDisabledSelectedYearContentColor-0d7_KjU", "getSelectedYearContainerColor-0d7_KjU", "m", "getDisabledSelectedYearContainerColor-0d7_KjU", "n", "getDayContentColor-0d7_KjU", "o", "getDisabledDayContentColor-0d7_KjU", "p", "getSelectedDayContentColor-0d7_KjU", "q", "getDisabledSelectedDayContentColor-0d7_KjU", "r", "getSelectedDayContainerColor-0d7_KjU", "s", "getDisabledSelectedDayContainerColor-0d7_KjU", "t", "getTodayContentColor-0d7_KjU", "u", "v", "getDayInSelectionRangeContainerColor-0d7_KjU", "w", "getDayInSelectionRangeContentColor-0d7_KjU", "x", "y", "Lcom/google/android/psc;", "()Lcom/google/android/psc;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class vn2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long containerColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long titleContentColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long headlineContentColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long weekdayContentColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long subheadContentColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long navigationContentColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long yearContentColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long disabledYearContentColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long currentYearContentColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long selectedYearContentColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final long disabledSelectedYearContentColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long selectedYearContainerColor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long disabledSelectedYearContainerColor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final long dayContentColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final long disabledDayContentColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final long selectedDayContentColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final long disabledSelectedDayContentColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final long selectedDayContainerColor;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final long disabledSelectedDayContainerColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final long todayContentColor;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final long todayDateBorderColor;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final long dayInSelectionRangeContainerColor;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final long dayInSelectionRangeContentColor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final long dividerColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final psc dateTextFieldColors;

    public /* synthetic */ vn2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, psc pscVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, pscVar);
    }

    public final q6c<ei1> a(boolean z, boolean z2, boolean z3, d dVar, int i) {
        long jH;
        q6c<ei1> q6cVarR;
        if (e.k()) {
            e.o(-1240482658, i, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:976)");
        }
        if (z) {
            jH = z2 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor;
        } else {
            jH = ei1.INSTANCE.h();
        }
        long j = jH;
        if (z3) {
            dVar.y(-1319856736);
            q6cVarR = osb.b(j, d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6), null, null, dVar, 0, 12);
            dVar.u();
        } else {
            dVar.y(-1319630064);
            q6cVarR = p0.r(ei1.l(j), dVar, 0);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return q6cVarR;
    }

    public final q6c<ei1> b(boolean z, boolean z2, boolean z3, boolean z4, d dVar, int i) {
        long j;
        q6c<ei1> q6cVarB;
        if (e.k()) {
            e.o(-1233694918, i, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:940)");
        }
        if (z2 && z4) {
            j = this.selectedDayContentColor;
        } else if (z2 && !z4) {
            j = this.disabledSelectedDayContentColor;
        } else if (z3 && z4) {
            j = this.dayInSelectionRangeContentColor;
        } else if (z3 && !z4) {
            j = this.disabledDayContentColor;
        } else if (z && z4) {
            j = this.todayContentColor;
        } else {
            j = z4 ? this.dayContentColor : this.disabledDayContentColor;
        }
        long j2 = j;
        if (z3) {
            dVar.y(-969483020);
            q6cVarB = p0.r(ei1.l(j2), dVar, 0);
            dVar.u();
        } else {
            dVar.y(-969417610);
            q6cVarB = osb.b(j2, d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6), null, null, dVar, 0, 12);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return q6cVarB;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final psc getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    public boolean equals(Object other) {
        if (!(other instanceof vn2)) {
            return false;
        }
        vn2 vn2Var = (vn2) other;
        return ei1.r(this.containerColor, vn2Var.containerColor) && ei1.r(this.titleContentColor, vn2Var.titleContentColor) && ei1.r(this.headlineContentColor, vn2Var.headlineContentColor) && ei1.r(this.weekdayContentColor, vn2Var.weekdayContentColor) && ei1.r(this.subheadContentColor, vn2Var.subheadContentColor) && ei1.r(this.yearContentColor, vn2Var.yearContentColor) && ei1.r(this.disabledYearContentColor, vn2Var.disabledYearContentColor) && ei1.r(this.currentYearContentColor, vn2Var.currentYearContentColor) && ei1.r(this.selectedYearContentColor, vn2Var.selectedYearContentColor) && ei1.r(this.disabledSelectedYearContentColor, vn2Var.disabledSelectedYearContentColor) && ei1.r(this.selectedYearContainerColor, vn2Var.selectedYearContainerColor) && ei1.r(this.disabledSelectedYearContainerColor, vn2Var.disabledSelectedYearContainerColor) && ei1.r(this.dayContentColor, vn2Var.dayContentColor) && ei1.r(this.disabledDayContentColor, vn2Var.disabledDayContentColor) && ei1.r(this.selectedDayContentColor, vn2Var.selectedDayContentColor) && ei1.r(this.disabledSelectedDayContentColor, vn2Var.disabledSelectedDayContentColor) && ei1.r(this.selectedDayContainerColor, vn2Var.selectedDayContainerColor) && ei1.r(this.disabledSelectedDayContainerColor, vn2Var.disabledSelectedDayContainerColor) && ei1.r(this.todayContentColor, vn2Var.todayContentColor) && ei1.r(this.todayDateBorderColor, vn2Var.todayDateBorderColor) && ei1.r(this.dayInSelectionRangeContainerColor, vn2Var.dayInSelectionRangeContainerColor) && ei1.r(this.dayInSelectionRangeContentColor, vn2Var.dayInSelectionRangeContentColor);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getHeadlineContentColor() {
        return this.headlineContentColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getNavigationContentColor() {
        return this.navigationContentColor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((ei1.x(this.containerColor) * 31) + ei1.x(this.titleContentColor)) * 31) + ei1.x(this.headlineContentColor)) * 31) + ei1.x(this.weekdayContentColor)) * 31) + ei1.x(this.subheadContentColor)) * 31) + ei1.x(this.yearContentColor)) * 31) + ei1.x(this.disabledYearContentColor)) * 31) + ei1.x(this.currentYearContentColor)) * 31) + ei1.x(this.selectedYearContentColor)) * 31) + ei1.x(this.disabledSelectedYearContentColor)) * 31) + ei1.x(this.selectedYearContainerColor)) * 31) + ei1.x(this.disabledSelectedYearContainerColor)) * 31) + ei1.x(this.dayContentColor)) * 31) + ei1.x(this.disabledDayContentColor)) * 31) + ei1.x(this.selectedDayContentColor)) * 31) + ei1.x(this.disabledSelectedDayContentColor)) * 31) + ei1.x(this.selectedDayContainerColor)) * 31) + ei1.x(this.disabledSelectedDayContainerColor)) * 31) + ei1.x(this.todayContentColor)) * 31) + ei1.x(this.todayDateBorderColor)) * 31) + ei1.x(this.dayInSelectionRangeContainerColor)) * 31) + ei1.x(this.dayInSelectionRangeContentColor);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getTodayDateBorderColor() {
        return this.todayDateBorderColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getWeekdayContentColor() {
        return this.weekdayContentColor;
    }

    public final q6c<ei1> k(boolean z, boolean z2, d dVar, int i) {
        long jH;
        if (e.k()) {
            e.o(-1306331107, i, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:1030)");
        }
        if (z) {
            jH = z2 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor;
        } else {
            jH = ei1.INSTANCE.h();
        }
        q6c<ei1> q6cVarB = osb.b(jH, d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6), null, null, dVar, 0, 12);
        if (e.k()) {
            e.n();
        }
        return q6cVarB;
    }

    public final q6c<ei1> l(boolean z, boolean z2, boolean z3, d dVar, int i) {
        long j;
        if (e.k()) {
            e.o(874111097, i, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:1006)");
        }
        if (z2 && z3) {
            j = this.selectedYearContentColor;
        } else if (z2 && !z3) {
            j = this.disabledSelectedYearContentColor;
        } else if (z && z3) {
            j = this.currentYearContentColor;
        } else {
            j = z3 ? this.yearContentColor : this.disabledYearContentColor;
        }
        q6c<ei1> q6cVarB = osb.b(j, d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6), null, null, dVar, 0, 12);
        if (e.k()) {
            e.n();
        }
        return q6cVarB;
    }

    private vn2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, psc pscVar) {
        this.containerColor = j;
        this.titleContentColor = j2;
        this.headlineContentColor = j3;
        this.weekdayContentColor = j4;
        this.subheadContentColor = j5;
        this.navigationContentColor = j6;
        this.yearContentColor = j7;
        this.disabledYearContentColor = j8;
        this.currentYearContentColor = j9;
        this.selectedYearContentColor = j10;
        this.disabledSelectedYearContentColor = j11;
        this.selectedYearContainerColor = j12;
        this.disabledSelectedYearContainerColor = j13;
        this.dayContentColor = j14;
        this.disabledDayContentColor = j15;
        this.selectedDayContentColor = j16;
        this.disabledSelectedDayContentColor = j17;
        this.selectedDayContainerColor = j18;
        this.disabledSelectedDayContainerColor = j19;
        this.todayContentColor = j20;
        this.todayDateBorderColor = j21;
        this.dayInSelectionRangeContainerColor = j22;
        this.dayInSelectionRangeContentColor = j23;
        this.dividerColor = j24;
        this.dateTextFieldColors = pscVar;
    }
}
