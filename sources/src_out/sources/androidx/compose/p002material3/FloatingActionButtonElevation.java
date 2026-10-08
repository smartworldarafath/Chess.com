package androidx.compose.p002material3;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.ff3;
import com.google.inputmethod.j26;
import com.google.inputmethod.q6c;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/FloatingActionButtonElevation;", "", "Lcom/google/android/ff3;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/q6c;", "e", "(Lcom/google/android/j26;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "f", "g", "()F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "d", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FloatingActionButtonElevation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float hoveredElevation;

    public /* synthetic */ FloatingActionButtonElevation(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    private final q6c<ff3> e(j26 j26Var, d dVar, int i) {
        if (e.k()) {
            e.o(-1845106002, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:628)");
        }
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && dVar.x(j26Var)) || (i & 6) == 4;
        Object objR = dVar.R();
        if (z || objR == d.INSTANCE.a()) {
            Object floatingActionButtonElevationAnimatable = new FloatingActionButtonElevationAnimatable(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            dVar.L(floatingActionButtonElevationAnimatable);
            objR = floatingActionButtonElevationAnimatable;
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable2 = (FloatingActionButtonElevationAnimatable) objR;
        boolean zT = dVar.T(floatingActionButtonElevationAnimatable2) | ((((i & 112) ^ 48) > 32 && dVar.x(this)) || (i & 48) == 32);
        Object objR2 = dVar.R();
        if (zT || objR2 == d.INSTANCE.a()) {
            objR2 = new C0180FloatingActionButtonElevation$animateElevation$1$1(floatingActionButtonElevationAnimatable2, this, null);
            dVar.L(objR2);
        }
        vn3.g(this, (Function2) objR2, dVar, (i >> 3) & 14);
        boolean zT2 = dVar.T(floatingActionButtonElevationAnimatable2) | ((i3 > 4 && dVar.x(j26Var)) || (i & 6) == 4);
        Object objR3 = dVar.R();
        if (zT2 || objR3 == d.INSTANCE.a()) {
            objR3 = new C0181FloatingActionButtonElevation$animateElevation$2$1(j26Var, floatingActionButtonElevationAnimatable2, null);
            dVar.L(objR3);
        }
        vn3.g(j26Var, (Function2) objR3, dVar, i2);
        q6c<ff3> q6cVarC = floatingActionButtonElevationAnimatable2.c();
        if (e.k()) {
            e.n();
        }
        return q6cVarC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) other;
        if (ff3.k(this.defaultElevation, floatingActionButtonElevation.defaultElevation) && ff3.k(this.pressedElevation, floatingActionButtonElevation.pressedElevation) && ff3.k(this.focusedElevation, floatingActionButtonElevation.focusedElevation)) {
            return ff3.k(this.hoveredElevation, floatingActionButtonElevation.hoveredElevation);
        }
        return false;
    }

    public final q6c<ff3> f(j26 j26Var, d dVar, int i) {
        if (e.k()) {
            e.o(-424810125, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:619)");
        }
        q6c<ff3> q6cVarE = e(j26Var, dVar, i & 126);
        if (e.k()) {
            e.n();
        }
        return q6cVarE;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getDefaultElevation() {
        return this.defaultElevation;
    }

    public int hashCode() {
        return (((((ff3.l(this.defaultElevation) * 31) + ff3.l(this.pressedElevation)) * 31) + ff3.l(this.focusedElevation)) * 31) + ff3.l(this.hoveredElevation);
    }

    private FloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
    }
}
