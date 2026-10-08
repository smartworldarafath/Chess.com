package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f43;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J#\u0010\u001c\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J#\u0010\u001d\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00105\u001a\u00020\u000f*\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Landroidx/compose/foundation/layout/x0;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/ff3;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "width", "m", "t", "i", "p", "F", "getMinWidth-D9Ej5fM", "()F", "t3", "(F)V", "q", "getMinHeight-D9Ej5fM", "s3", "r", "getMaxWidth-D9Ej5fM", "r3", "s", "getMaxHeight-D9Ej5fM", "q3", "Z", "getEnforceIncoming", "()Z", "p3", "(Z)V", "Lcom/google/android/f43;", "n3", "(Lcom/google/android/f43;)J", "targetConstraints", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x0 extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float minWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float minHeight;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float maxWidth;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private float maxHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean enforceIncoming;

    public /* synthetic */ x0(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    private final long n3(f43 f43Var) {
        int iO1;
        int iO2;
        int iO3;
        int i = 0;
        if (Float.isNaN(this.maxWidth)) {
            iO1 = Integer.MAX_VALUE;
        } else {
            iO1 = f43Var.O1(this.maxWidth);
            if (iO1 < 0) {
                iO1 = 0;
            }
        }
        if (Float.isNaN(this.maxHeight)) {
            iO2 = Integer.MAX_VALUE;
        } else {
            iO2 = f43Var.O1(this.maxHeight);
            if (iO2 < 0) {
                iO2 = 0;
            }
        }
        if (Float.isNaN(this.minWidth)) {
            iO3 = 0;
        } else {
            iO3 = f43Var.O1(this.minWidth);
            if (iO3 < 0) {
                iO3 = 0;
            }
            if (iO3 > iO1) {
                iO3 = iO1;
            }
            if (iO3 == Integer.MAX_VALUE) {
                iO3 = 0;
            }
        }
        if (!Float.isNaN(this.minHeight)) {
            int iO4 = f43Var.O1(this.minHeight);
            if (iO4 < 0) {
                iO4 = 0;
            }
            if (iO4 > iO2) {
                iO4 = iO2;
            }
            if (iO4 != Integer.MAX_VALUE) {
                i = iO4;
            }
        }
        return nx1.a(iO3, iO1, i, iO2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o3(o oVar, o.a aVar) {
        o.a.L(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        int iN;
        int iL;
        int iM;
        int iK;
        long jA;
        long jN3 = n3(jVar);
        if (this.enforceIncoming) {
            jA = nx1.e(j, jN3);
        } else {
            if (Float.isNaN(this.minWidth)) {
                iN = kx1.n(j);
                int iL2 = kx1.l(jN3);
                if (iN > iL2) {
                    iN = iL2;
                }
            } else {
                iN = kx1.n(jN3);
            }
            if (Float.isNaN(this.maxWidth)) {
                iL = kx1.l(j);
                int iN2 = kx1.n(jN3);
                if (iL < iN2) {
                    iL = iN2;
                }
            } else {
                iL = kx1.l(jN3);
            }
            if (Float.isNaN(this.minHeight)) {
                iM = kx1.m(j);
                int iK2 = kx1.k(jN3);
                if (iM > iK2) {
                    iM = iK2;
                }
            } else {
                iM = kx1.m(jN3);
            }
            if (Float.isNaN(this.maxHeight)) {
                iK = kx1.k(j);
                int iM2 = kx1.m(jN3);
                if (iK < iM2) {
                    iK = iM2;
                }
            } else {
                iK = kx1.k(jN3);
            }
            jA = nx1.a(iN, iL, iM, iK);
        }
        final o oVarR0 = dj7Var.r0(jA);
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.w0
            public final Object invoke(Object obj) {
                return x0.o3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        long jN3 = n3(h66Var);
        if (kx1.i(jN3)) {
            return kx1.k(jN3);
        }
        if (!this.enforceIncoming) {
            i = nx1.g(jN3, i);
        }
        return nx1.f(jN3, f66Var.W(i));
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        long jN3 = n3(h66Var);
        if (kx1.i(jN3)) {
            return kx1.k(jN3);
        }
        if (!this.enforceIncoming) {
            i = nx1.g(jN3, i);
        }
        return nx1.f(jN3, f66Var.d0(i));
    }

    public final void p3(boolean z) {
        this.enforceIncoming = z;
    }

    public final void q3(float f) {
        this.maxHeight = f;
    }

    public final void r3(float f) {
        this.maxWidth = f;
    }

    public final void s3(float f) {
        this.minHeight = f;
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        long jN3 = n3(h66Var);
        if (kx1.j(jN3)) {
            return kx1.l(jN3);
        }
        if (!this.enforceIncoming) {
            i = nx1.f(jN3, i);
        }
        return nx1.g(jN3, f66Var.q0(i));
    }

    public final void t3(float f) {
        this.minWidth = f;
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        long jN3 = n3(h66Var);
        if (kx1.j(jN3)) {
            return kx1.l(jN3);
        }
        if (!this.enforceIncoming) {
            i = nx1.f(jN3, i);
        }
        return nx1.g(jN3, f66Var.o0(i));
    }

    private x0(float f, float f2, float f3, float f4, boolean z) {
        this.minWidth = f;
        this.minHeight = f2;
        this.maxWidth = f3;
        this.maxHeight = f4;
        this.enforceIncoming = z;
    }
}
