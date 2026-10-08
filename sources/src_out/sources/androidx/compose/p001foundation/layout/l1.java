package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g16;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.q16;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/l1;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lcom/google/android/q16;", "Landroidx/compose/ui/unit/LayoutDirection;", "Lcom/google/android/g16;", "alignmentCallback", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "Landroidx/compose/foundation/layout/Direction;", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "p3", "(Landroidx/compose/foundation/layout/Direction;)V", "q", "Z", "getUnbounded", "()Z", "q3", "(Z)V", "r", "Lkotlin/jvm/functions/Function2;", "getAlignmentCallback", "()Lkotlin/jvm/functions/Function2;", "o3", "(Lkotlin/jvm/functions/Function2;)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l1 extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Direction direction;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean unbounded;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function2<? super q16, ? super LayoutDirection, g16> alignmentCallback;

    public l1(Direction direction, boolean z, Function2<? super q16, ? super LayoutDirection, g16> function2) {
        this.direction = direction;
        this.unbounded = z;
        this.alignmentCallback = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(l1 l1Var, int i, o oVar, int i2, j jVar, o.a aVar) {
        o.a.F(aVar, oVar, ((g16) l1Var.alignmentCallback.invoke(q16.b(q16.c((((long) (i - oVar.getWidth())) << 32) | (((long) (i2 - oVar.getHeight())) & 4294967295L))), jVar.getLayoutDirection())).getPackedValue(), 0.0f, 2, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(final j jVar, dj7 dj7Var, long j) {
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int iN = direction != direction2 ? 0 : kx1.n(j);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final o oVarR0 = dj7Var.r0(nx1.a(iN, (this.direction == direction2 || !this.unbounded) ? kx1.l(j) : Integer.MAX_VALUE, direction3 == direction4 ? kx1.m(j) : 0, (this.direction == direction4 || !this.unbounded) ? kx1.k(j) : Integer.MAX_VALUE));
        final int iO = g.o(oVarR0.getWidth(), kx1.n(j), kx1.l(j));
        final int iO2 = g.o(oVarR0.getHeight(), kx1.m(j), kx1.k(j));
        return j.Q1(jVar, iO, iO2, null, new Function1() { // from class: androidx.compose.foundation.layout.k1
            public final Object invoke(Object obj) {
                return l1.n3(this.a, iO, oVarR0, iO2, jVar, (o.a) obj);
            }
        }, 4, null);
    }

    public final void o3(Function2<? super q16, ? super LayoutDirection, g16> function2) {
        this.alignmentCallback = function2;
    }

    public final void p3(Direction direction) {
        this.direction = direction;
    }

    public final void q3(boolean z) {
        this.unbounded = z;
    }
}
