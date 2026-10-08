package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.h66;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u0018\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J#\u0010\u0019\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/compose/foundation/layout/e1;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/ff3;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "t", "width", "m", "i", "p", "F", "getMinWidth-D9Ej5fM", "()F", "p3", "(F)V", "q", "getMinHeight-D9Ej5fM", "o3", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e1 extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float minWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float minHeight;

    public /* synthetic */ e1(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(o oVar, o.a aVar) {
        o.a.L(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        int iN;
        int iM;
        if (Float.isNaN(this.minWidth) || kx1.n(j) != 0) {
            iN = kx1.n(j);
        } else {
            int iO1 = jVar.O1(this.minWidth);
            iN = kx1.l(j);
            if (iO1 < 0) {
                iO1 = 0;
            }
            if (iO1 <= iN) {
                iN = iO1;
            }
        }
        int iL = kx1.l(j);
        if (Float.isNaN(this.minHeight) || kx1.m(j) != 0) {
            iM = kx1.m(j);
        } else {
            int iO2 = jVar.O1(this.minHeight);
            iM = kx1.k(j);
            int i = iO2 >= 0 ? iO2 : 0;
            if (i <= iM) {
                iM = i;
            }
        }
        final o oVarR0 = dj7Var.r0(nx1.a(iN, iL, iM, kx1.k(j)));
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.d1
            public final Object invoke(Object obj) {
                return e1.n3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        int iW = f66Var.W(i);
        int iO1 = !Float.isNaN(this.minHeight) ? h66Var.O1(this.minHeight) : 0;
        return iW < iO1 ? iO1 : iW;
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        int iD0 = f66Var.d0(i);
        int iO1 = !Float.isNaN(this.minHeight) ? h66Var.O1(this.minHeight) : 0;
        return iD0 < iO1 ? iO1 : iD0;
    }

    public final void o3(float f) {
        this.minHeight = f;
    }

    public final void p3(float f) {
        this.minWidth = f;
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        int iQ0 = f66Var.q0(i);
        int iO1 = !Float.isNaN(this.minWidth) ? h66Var.O1(this.minWidth) : 0;
        return iQ0 < iO1 ? iO1 : iQ0;
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        int iO0 = f66Var.o0(i);
        int iO1 = !Float.isNaN(this.minWidth) ? h66Var.O1(this.minWidth) : 0;
        return iO0 < iO1 ? iO1 : iO0;
    }

    private e1(float f, float f2) {
        this.minWidth = f;
        this.minHeight = f2;
    }
}
