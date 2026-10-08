package com.google.inputmethod;

import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001d\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010$\u001a\u0004\b5\u0010&R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b9\u0010&¨\u0006:"}, d2 = {"Lcom/google/android/ga1;", "", "Lcom/google/android/ei1;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lcom/google/android/kr;", "d", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/d;I)Lcom/google/android/kr;", "Lcom/google/android/q6c;", "c", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "", "enabled", "b", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "a", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getCheckedCheckmarkColor-0d7_KjU", "()J", "getUncheckedCheckmarkColor-0d7_KjU", "getCheckedBoxColor-0d7_KjU", "getUncheckedBoxColor-0d7_KjU", "e", "getDisabledCheckedBoxColor-0d7_KjU", "f", "getDisabledUncheckedBoxColor-0d7_KjU", "g", "getDisabledIndeterminateBoxColor-0d7_KjU", "h", "getCheckedBorderColor-0d7_KjU", "i", "getUncheckedBorderColor-0d7_KjU", "j", "getDisabledBorderColor-0d7_KjU", "k", "getDisabledUncheckedBorderColor-0d7_KjU", "l", "getDisabledIndeterminateBorderColor-0d7_KjU", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ga1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long checkedCheckmarkColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long uncheckedCheckmarkColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long checkedBoxColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long uncheckedBoxColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long disabledCheckedBoxColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long disabledUncheckedBoxColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long disabledIndeterminateBoxColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long checkedBorderColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long uncheckedBorderColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long disabledBorderColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final long disabledUncheckedBorderColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long disabledIndeterminateBorderColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ga1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }

    private final kr<ei1> d(ToggleableState toggleableState, d dVar, int i) {
        xa4 xa4VarB;
        if (e.k()) {
            e.o(-1075456245, i, -1, "androidx.compose.material3.CheckboxColors.colorAnimationSpecForState (Checkbox.kt:684)");
        }
        if (toggleableState == ToggleableState.Off) {
            dVar.y(1539262271);
            xa4VarB = d08.b(MotionSchemeKeyTokens.FastEffects, dVar, 6);
            dVar.u();
        } else {
            dVar.y(1539355581);
            xa4VarB = d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return xa4VarB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final q6c<ei1> a(boolean z, ToggleableState toggleableState, d dVar, int i) throws NoWhenBranchMatchedException {
        long j;
        q6c<ei1> q6cVarR;
        if (e.k()) {
            e.o(1009643462, i, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:657)");
        }
        if (z) {
            int i2 = a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBorderColor;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.uncheckedBorderColor;
            }
        } else {
            int i3 = a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.disabledBorderColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBorderColor;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.disabledUncheckedBorderColor;
            }
        }
        long j2 = j;
        if (z) {
            dVar.y(633231558);
            q6cVarR = osb.b(j2, d(toggleableState, dVar, (i >> 3) & 126), null, null, dVar, 0, 12);
            dVar.u();
        } else {
            dVar.y(633321768);
            q6cVarR = p0.r(ei1.l(j2), dVar, 0);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return q6cVarR;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final q6c<ei1> b(boolean z, ToggleableState toggleableState, d dVar, int i) throws NoWhenBranchMatchedException {
        long j;
        q6c<ei1> q6cVarR;
        if (e.k()) {
            e.o(360729865, i, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:625)");
        }
        if (z) {
            int i2 = a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBoxColor;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.uncheckedBoxColor;
            }
        } else {
            int i3 = a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                j = this.disabledCheckedBoxColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBoxColor;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j = this.disabledUncheckedBoxColor;
            }
        }
        long j2 = j;
        if (z) {
            dVar.y(496051715);
            q6cVarR = osb.b(j2, d(toggleableState, dVar, (i >> 3) & 126), null, null, dVar, 0, 12);
            dVar.u();
        } else {
            dVar.y(496141925);
            q6cVarR = p0.r(ei1.l(j2), dVar, 0);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return q6cVarR;
    }

    public final q6c<ei1> c(ToggleableState toggleableState, d dVar, int i) {
        if (e.k()) {
            e.o(-507585681, i, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:606)");
        }
        q6c<ei1> q6cVarB = osb.b(toggleableState == ToggleableState.Off ? this.uncheckedCheckmarkColor : this.checkedCheckmarkColor, d(toggleableState, dVar, i & 126), null, null, dVar, 0, 12);
        if (e.k()) {
            e.n();
        }
        return q6cVarB;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ga1)) {
            return false;
        }
        ga1 ga1Var = (ga1) other;
        return ei1.r(this.checkedCheckmarkColor, ga1Var.checkedCheckmarkColor) && ei1.r(this.uncheckedCheckmarkColor, ga1Var.uncheckedCheckmarkColor) && ei1.r(this.checkedBoxColor, ga1Var.checkedBoxColor) && ei1.r(this.uncheckedBoxColor, ga1Var.uncheckedBoxColor) && ei1.r(this.disabledCheckedBoxColor, ga1Var.disabledCheckedBoxColor) && ei1.r(this.disabledUncheckedBoxColor, ga1Var.disabledUncheckedBoxColor) && ei1.r(this.disabledIndeterminateBoxColor, ga1Var.disabledIndeterminateBoxColor) && ei1.r(this.checkedBorderColor, ga1Var.checkedBorderColor) && ei1.r(this.uncheckedBorderColor, ga1Var.uncheckedBorderColor) && ei1.r(this.disabledBorderColor, ga1Var.disabledBorderColor) && ei1.r(this.disabledUncheckedBorderColor, ga1Var.disabledUncheckedBorderColor) && ei1.r(this.disabledIndeterminateBorderColor, ga1Var.disabledIndeterminateBorderColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((ei1.x(this.checkedCheckmarkColor) * 31) + ei1.x(this.uncheckedCheckmarkColor)) * 31) + ei1.x(this.checkedBoxColor)) * 31) + ei1.x(this.uncheckedBoxColor)) * 31) + ei1.x(this.disabledCheckedBoxColor)) * 31) + ei1.x(this.disabledUncheckedBoxColor)) * 31) + ei1.x(this.disabledIndeterminateBoxColor)) * 31) + ei1.x(this.checkedBorderColor)) * 31) + ei1.x(this.uncheckedBorderColor)) * 31) + ei1.x(this.disabledBorderColor)) * 31) + ei1.x(this.disabledUncheckedBorderColor)) * 31) + ei1.x(this.disabledIndeterminateBorderColor);
    }

    private ga1(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.checkedCheckmarkColor = j;
        this.uncheckedCheckmarkColor = j2;
        this.checkedBoxColor = j3;
        this.uncheckedBoxColor = j4;
        this.disabledCheckedBoxColor = j5;
        this.disabledUncheckedBoxColor = j6;
        this.disabledIndeterminateBoxColor = j7;
        this.checkedBorderColor = j8;
        this.uncheckedBorderColor = j9;
        this.disabledBorderColor = j10;
        this.disabledUncheckedBorderColor = j11;
        this.disabledIndeterminateBorderColor = j12;
    }
}
