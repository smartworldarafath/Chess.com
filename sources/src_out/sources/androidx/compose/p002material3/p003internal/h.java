package androidx.compose.p002material3.p003internal;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.android.sh7;
import com.google.inputmethod.cg3;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.q16;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRF\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/material3/internal/h;", "T", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "state", "Lkotlin/Function2;", "Lcom/google/android/q16;", "Lcom/google/android/kx1;", "Lkotlin/Pair;", "Lcom/google/android/cg3;", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/gestures/Orientation;)V", "", "W2", "()V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getState", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "s3", "(Landroidx/compose/material3/internal/AnchoredDraggableState;)V", "q", "Lkotlin/jvm/functions/Function2;", "getAnchors", "()Lkotlin/jvm/functions/Function2;", "q3", "(Lkotlin/jvm/functions/Function2;)V", "r", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "r3", "(Landroidx/compose/foundation/gestures/Orientation;)V", "", "s", "Z", "didLookahead", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class h<T> extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private AnchoredDraggableState<T> state;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Function2<? super q16, ? super kx1, ? extends Pair<? extends cg3<T>, ? extends T>> anchors;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean didLookahead;

    public h(AnchoredDraggableState<T> anchoredDraggableState, Function2<? super q16, ? super kx1, ? extends Pair<? extends cg3<T>, ? extends T>> function2, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = function2;
        this.orientation = orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o3(j jVar, h hVar, final o oVar, o.a aVar) {
        final float fC = jVar.G1() ? hVar.state.p().c(hVar.state.y()) : hVar.state.C();
        Orientation orientation = hVar.orientation;
        final float f = orientation == Orientation.Horizontal ? fC : 0.0f;
        if (orientation != Orientation.Vertical) {
            fC = 0.0f;
        }
        aVar.k0(new Function1() { // from class: androidx.compose.material3.internal.g
            public final Object invoke(Object obj) {
                return h.p3(oVar, f, fC, (o.a) obj);
            }
        });
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p3(o oVar, float f, float f2, o.a aVar) {
        o.a.z(aVar, oVar, sh7.d(f), sh7.d(f2), 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        this.didLookahead = false;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(final j jVar, dj7 dj7Var, long j) {
        final o oVarR0 = dj7Var.r0(j);
        if (!jVar.G1() || !this.didLookahead) {
            Pair pair = (Pair) this.anchors.invoke(q16.b(q16.c((((long) oVarR0.getHeight()) & 4294967295L) | (((long) oVarR0.getWidth()) << 32))), kx1.a(j));
            this.state.M((cg3) pair.c(), (T) pair.d());
        }
        this.didLookahead = jVar.G1() || this.didLookahead;
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: androidx.compose.material3.internal.f
            public final Object invoke(Object obj) {
                return h.o3(jVar, this, oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public final void q3(Function2<? super q16, ? super kx1, ? extends Pair<? extends cg3<T>, ? extends T>> function2) {
        this.anchors = function2;
    }

    public final void r3(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void s3(AnchoredDraggableState<T> anchoredDraggableState) {
        this.state = anchoredDraggableState;
    }
}
