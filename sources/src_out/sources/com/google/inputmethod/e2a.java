package com.google.inputmethod;

import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/google/android/e2a;", "", "Lcom/google/android/ei1;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "selected", "Lcom/google/android/q6c;", "a", "(ZZLandroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getSelectedColor-0d7_KjU", "()J", "b", "getUnselectedColor-0d7_KjU", "c", "getDisabledSelectedColor-0d7_KjU", "d", "getDisabledUnselectedColor-0d7_KjU", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e2a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long selectedColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long unselectedColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long disabledSelectedColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long disabledUnselectedColor;

    public /* synthetic */ e2a(long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4);
    }

    public final q6c<ei1> a(boolean z, boolean z2, d dVar, int i) {
        long j;
        q6c<ei1> q6cVarR;
        if (e.k()) {
            e.o(-1840145292, i, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:223)");
        }
        if (z && z2) {
            j = this.selectedColor;
        } else if (!z || z2) {
            j = (z || !z2) ? this.disabledUnselectedColor : this.disabledSelectedColor;
        } else {
            j = this.unselectedColor;
        }
        long j2 = j;
        if (z) {
            dVar.y(1194696477);
            q6cVarR = osb.b(j2, d08.b(MotionSchemeKeyTokens.DefaultEffects, dVar, 6), null, null, dVar, 0, 12);
            dVar.u();
        } else {
            dVar.y(1194874138);
            q6cVarR = p0.r(ei1.l(j2), dVar, 0);
            dVar.u();
        }
        if (e.k()) {
            e.n();
        }
        return q6cVarR;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof e2a)) {
            return false;
        }
        e2a e2aVar = (e2a) other;
        return ei1.r(this.selectedColor, e2aVar.selectedColor) && ei1.r(this.unselectedColor, e2aVar.unselectedColor) && ei1.r(this.disabledSelectedColor, e2aVar.disabledSelectedColor) && ei1.r(this.disabledUnselectedColor, e2aVar.disabledUnselectedColor);
    }

    public int hashCode() {
        return (((((ei1.x(this.selectedColor) * 31) + ei1.x(this.unselectedColor)) * 31) + ei1.x(this.disabledSelectedColor)) * 31) + ei1.x(this.disabledUnselectedColor);
    }

    private e2a(long j, long j2, long j3, long j4) {
        this.selectedColor = j;
        this.unselectedColor = j2;
        this.disabledSelectedColor = j3;
        this.disabledUnselectedColor = j4;
    }
}
