package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p001foundation.interaction.a;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import com.google.inputmethod.ff3;
import com.google.inputmethod.i26;
import com.google.inputmethod.j26;
import com.google.inputmethod.lk4;
import com.google.inputmethod.q6c;
import com.google.inputmethod.vn3;
import com.google.inputmethod.w2e;
import com.google.inputmethod.yf5;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/ButtonElevation;", "", "Lcom/google/android/ff3;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/q6c;", "d", "(ZLcom/google/android/j26;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "e", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonElevation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float disabledElevation;

    public /* synthetic */ ButtonElevation(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    private final q6c<ff3> d(boolean z, j26 j26Var, d dVar, int i) {
        float f;
        Animatable animatable;
        if (e.k()) {
            e.o(-1312510462, i, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:947)");
        }
        Object objR = dVar.R();
        d.Companion companion = d.INSTANCE;
        if (objR == companion.a()) {
            objR = p0.f();
            dVar.L(objR);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objR;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && dVar.x(j26Var)) || (i & 48) == 32;
        Object objR2 = dVar.R();
        if (z3 || objR2 == companion.a()) {
            objR2 = new ta2(j26Var, snapshotStateList, null);
            dVar.L(objR2);
        }
        vn3.g(j26Var, (Function2) objR2, dVar, (i >> 3) & 14);
        i26 i26Var = (i26) m.N0(snapshotStateList);
        if (!z) {
            f = this.disabledElevation;
        } else if (i26Var instanceof a.b) {
            f = this.pressedElevation;
        } else if (i26Var instanceof yf5) {
            f = this.hoveredElevation;
        } else {
            f = i26Var instanceof lk4 ? this.focusedElevation : this.defaultElevation;
        }
        Object objR3 = dVar.R();
        if (objR3 == companion.a()) {
            Object animatable2 = new Animatable(ff3.e(f), w2e.L(ff3.INSTANCE), null, null, 12, null);
            dVar.L(animatable2);
            objR3 = animatable2;
        }
        Animatable animatable3 = (Animatable) objR3;
        ff3 ff3VarE = ff3.e(f);
        boolean zT = dVar.T(animatable3) | dVar.B(f) | ((((i & 14) ^ 6) > 4 && dVar.A(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !dVar.x(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zT2 = zT | z2 | dVar.T(i26Var);
        Object objR4 = dVar.R();
        if (zT2 || objR4 == companion.a()) {
            animatable = animatable3;
            Object c0166ButtonElevation$animateElevation$2$1 = new C0166ButtonElevation$animateElevation$2$1(animatable, f, z, this, i26Var, null);
            dVar.L(c0166ButtonElevation$animateElevation$2$1);
            objR4 = c0166ButtonElevation$animateElevation$2$1;
        } else {
            animatable = animatable3;
        }
        vn3.g(ff3VarE, (Function2) objR4, dVar, 0);
        q6c<ff3> q6cVarG = animatable.g();
        if (e.k()) {
            e.n();
        }
        return q6cVarG;
    }

    public final q6c<ff3> e(boolean z, j26 j26Var, d dVar, int i) {
        if (e.k()) {
            e.o(-2045116089, i, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:939)");
        }
        q6c<ff3> q6cVarD = d(z, j26Var, dVar, i & 1022);
        if (e.k()) {
            e.n();
        }
        return q6cVarD;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) other;
        return ff3.k(this.defaultElevation, buttonElevation.defaultElevation) && ff3.k(this.pressedElevation, buttonElevation.pressedElevation) && ff3.k(this.focusedElevation, buttonElevation.focusedElevation) && ff3.k(this.hoveredElevation, buttonElevation.hoveredElevation) && ff3.k(this.disabledElevation, buttonElevation.disabledElevation);
    }

    public int hashCode() {
        return (((((((ff3.l(this.defaultElevation) * 31) + ff3.l(this.pressedElevation)) * 31) + ff3.l(this.focusedElevation)) * 31) + ff3.l(this.hoveredElevation)) * 31) + ff3.l(this.disabledElevation);
    }

    private ButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
        this.disabledElevation = f5;
    }
}
