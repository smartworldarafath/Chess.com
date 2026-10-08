package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/z;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "fraction", "<init>", "(Landroidx/compose/foundation/layout/Direction;F)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "Landroidx/compose/foundation/layout/Direction;", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "o3", "(Landroidx/compose/foundation/layout/Direction;)V", "q", "F", "getFraction", "()F", "p3", "(F)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Direction direction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float fraction;

    public z(Direction direction, float f) {
        this.direction = direction;
        this.fraction = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(o oVar, o.a aVar) {
        o.a.L(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        int iN;
        int iL;
        int iK;
        int iK2;
        if (!kx1.h(j) || this.direction == Direction.Vertical) {
            iN = kx1.n(j);
            iL = kx1.l(j);
        } else {
            int iRound = Math.round(kx1.l(j) * this.fraction);
            int iN2 = kx1.n(j);
            iN = kx1.l(j);
            if (iRound < iN2) {
                iRound = iN2;
            }
            if (iRound <= iN) {
                iN = iRound;
            }
            iL = iN;
        }
        if (!kx1.g(j) || this.direction == Direction.Horizontal) {
            int iM = kx1.m(j);
            iK = kx1.k(j);
            iK2 = iM;
        } else {
            int iRound2 = Math.round(kx1.k(j) * this.fraction);
            int iM2 = kx1.m(j);
            iK2 = kx1.k(j);
            if (iRound2 < iM2) {
                iRound2 = iM2;
            }
            if (iRound2 <= iK2) {
                iK2 = iRound2;
            }
            iK = iK2;
        }
        final o oVarR0 = dj7Var.r0(nx1.a(iN, iL, iK2, iK));
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.y
            public final Object invoke(Object obj) {
                return z.n3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void o3(Direction direction) {
        this.direction = direction;
    }

    public final void p3(float f) {
        this.fraction = f;
    }
}
