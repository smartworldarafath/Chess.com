package androidx.compose.ui.layout;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fz;
import com.google.inputmethod.gz;
import com.google.inputmethod.kn6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ#\u0010\u001f\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ#\u0010 \u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/q16;", "lookaheadSize", "", "Y1", "(J)Z", "Landroidx/compose/ui/layout/o$a;", "Lcom/google/android/kn6;", "lookaheadCoordinates", "Q", "(Landroidx/compose/ui/layout/o$a;Lcom/google/android/kn6;)Z", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/gz;", "d2", "(Lcom/google/android/gz;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/fz;", "Lcom/google/android/f66;", "", "height", "D0", "(Lcom/google/android/fz;Lcom/google/android/f66;I)I", "width", "S0", "I1", "B0", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ApproachLayoutModifierNode extends androidx.compose.ui.node.c {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/android/gz;", "Lcom/google/android/dj7;", "intrinsicMeasurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "a", "(Lcom/google/android/gz;Lcom/google/android/dj7;J)Lcom/google/android/fj7;"}, k = 3, mv = {2, 1, 0})
    static final class a implements NodeMeasuringIntrinsics.a {
        a() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.a
        public final fj7 a(gz gzVar, dj7 dj7Var, long j) {
            return ApproachLayoutModifierNode.this.d2(gzVar, dj7Var, j);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/android/gz;", "Lcom/google/android/dj7;", "intrinsicMeasurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "a", "(Lcom/google/android/gz;Lcom/google/android/dj7;J)Lcom/google/android/fj7;"}, k = 3, mv = {2, 1, 0})
    static final class b implements NodeMeasuringIntrinsics.a {
        b() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.a
        public final fj7 a(gz gzVar, dj7 dj7Var, long j) {
            return ApproachLayoutModifierNode.this.d2(gzVar, dj7Var, j);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/android/gz;", "Lcom/google/android/dj7;", "intrinsicMeasurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "a", "(Lcom/google/android/gz;Lcom/google/android/dj7;J)Lcom/google/android/fj7;"}, k = 3, mv = {2, 1, 0})
    static final class c implements NodeMeasuringIntrinsics.a {
        c() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.a
        public final fj7 a(gz gzVar, dj7 dj7Var, long j) {
            return ApproachLayoutModifierNode.this.d2(gzVar, dj7Var, j);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/android/gz;", "Lcom/google/android/dj7;", "intrinsicMeasurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "a", "(Lcom/google/android/gz;Lcom/google/android/dj7;J)Lcom/google/android/fj7;"}, k = 3, mv = {2, 1, 0})
    static final class d implements NodeMeasuringIntrinsics.a {
        d() {
        }

        @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.a
        public final fj7 a(gz gzVar, dj7 dj7Var, long j) {
            return ApproachLayoutModifierNode.this.d2(gzVar, dj7Var, j);
        }
    }

    default int B0(fz fzVar, f66 f66Var, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.g(coordinator);
        androidx.compose.ui.node.i iVarF3 = coordinator.getLookaheadDelegate();
        Intrinsics.g(iVarF3);
        return iVarF3.y1() ? NodeMeasuringIntrinsics.a.a(new a(), fzVar, f66Var, i) : f66Var.W(i);
    }

    default int D0(fz fzVar, f66 f66Var, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.g(coordinator);
        androidx.compose.ui.node.i iVarF3 = coordinator.getLookaheadDelegate();
        Intrinsics.g(iVarF3);
        return iVarF3.y1() ? NodeMeasuringIntrinsics.a.g(new d(), fzVar, f66Var, i) : f66Var.o0(i);
    }

    default int I1(fz fzVar, f66 f66Var, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.g(coordinator);
        androidx.compose.ui.node.i iVarF3 = coordinator.getLookaheadDelegate();
        Intrinsics.g(iVarF3);
        return iVarF3.y1() ? NodeMeasuringIntrinsics.a.c(new b(), fzVar, f66Var, i) : f66Var.q0(i);
    }

    default boolean Q(o.a aVar, kn6 kn6Var) {
        return false;
    }

    default int S0(fz fzVar, f66 f66Var, int i) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.g(coordinator);
        androidx.compose.ui.node.i iVarF3 = coordinator.getLookaheadDelegate();
        Intrinsics.g(iVarF3);
        return iVarF3.y1() ? NodeMeasuringIntrinsics.a.e(new c(), fzVar, f66Var, i) : f66Var.d0(i);
    }

    boolean Y1(long lookaheadSize);

    @Override // androidx.compose.ui.node.c
    default fj7 b(j jVar, dj7 dj7Var, long j) {
        final o oVarR0 = dj7Var.r0(j);
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o.a) obj);
                return Unit.a;
            }

            public final void invoke(o.a aVar) {
                o.a.z(aVar, oVarR0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    fj7 d2(gz gzVar, dj7 dj7Var, long j);
}
