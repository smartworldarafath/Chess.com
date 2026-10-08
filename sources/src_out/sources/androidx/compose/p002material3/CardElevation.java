package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p001foundation.interaction.a;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import com.google.inputmethod.ff3;
import com.google.inputmethod.i26;
import com.google.inputmethod.j26;
import com.google.inputmethod.lk4;
import com.google.inputmethod.o58;
import com.google.inputmethod.q6c;
import com.google.inputmethod.vn3;
import com.google.inputmethod.w2e;
import com.google.inputmethod.yf5;
import com.google.inputmethod.zf3;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/CardElevation;", "", "Lcom/google/android/ff3;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Lcom/google/android/j26;", "interactionSource", "Lcom/google/android/q6c;", "e", "(ZLcom/google/android/j26;Landroidx/compose/runtime/d;I)Lcom/google/android/q6c;", "f", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "d", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardElevation {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float defaultElevation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float pressedElevation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float focusedElevation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float hoveredElevation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float draggedElevation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float disabledElevation;

    public /* synthetic */ CardElevation(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    private final q6c<ff3> e(boolean z, j26 j26Var, d dVar, int i) {
        float f;
        Animatable animatable;
        if (e.k()) {
            e.o(-1421890746, i, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:666)");
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
            objR2 = new C0167CardElevation$animateElevation$1$1(j26Var, snapshotStateList, null);
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
        } else if (i26Var instanceof lk4) {
            f = this.focusedElevation;
        } else {
            f = i26Var instanceof zf3 ? this.draggedElevation : this.defaultElevation;
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
            Object c0168CardElevation$animateElevation$2$1 = new C0168CardElevation$animateElevation$2$1(animatable, f, z, this, i26Var, null);
            dVar.L(c0168CardElevation$animateElevation$2$1);
            objR4 = c0168CardElevation$animateElevation$2$1;
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) other;
        return ff3.k(this.defaultElevation, cardElevation.defaultElevation) && ff3.k(this.pressedElevation, cardElevation.pressedElevation) && ff3.k(this.focusedElevation, cardElevation.focusedElevation) && ff3.k(this.hoveredElevation, cardElevation.hoveredElevation) && ff3.k(this.disabledElevation, cardElevation.disabledElevation);
    }

    public final q6c<ff3> f(boolean z, j26 j26Var, d dVar, int i) {
        dVar.y(-1763481333);
        if (e.k()) {
            e.o(-1763481333, i, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:655)");
        }
        if (j26Var != null) {
            dVar.y(167824247);
            dVar.u();
            q6c<ff3> q6cVarE = e(z, j26Var, dVar, i & 1022);
            if (e.k()) {
                e.n();
            }
            dVar.u();
            return q6cVarE;
        }
        dVar.y(167751211);
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            objR = s0.e(ff3.e(this.defaultElevation), null, 2, null);
            dVar.L(objR);
        }
        o58 o58Var = (o58) objR;
        dVar.u();
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return o58Var;
    }

    public int hashCode() {
        return (((((((ff3.l(this.defaultElevation) * 31) + ff3.l(this.pressedElevation)) * 31) + ff3.l(this.focusedElevation)) * 31) + ff3.l(this.hoveredElevation)) * 31) + ff3.l(this.disabledElevation);
    }

    private CardElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.focusedElevation = f3;
        this.hoveredElevation = f4;
        this.draggedElevation = f5;
        this.disabledElevation = f6;
    }
}
