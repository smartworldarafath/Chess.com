package androidx.compose.p001foundation.gestures.snapping;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.lazy.LazyListState;
import com.google.inputmethod.bwb;
import com.google.inputmethod.cwb;
import com.google.inputmethod.f43;
import com.google.inputmethod.gv6;
import com.google.inputmethod.nv6;
import com.google.inputmethod.yt6;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/foundation/gestures/snapping/j;", "snapPosition", "Lcom/google/android/bwb;", "a", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/snapping/j;)Lcom/google/android/bwb;", "Lcom/google/android/f43;", "", "velocity", "Landroidx/compose/foundation/gestures/snapping/d;", "c", "(Lcom/google/android/f43;F)I", "Lcom/google/android/nv6;", "", "d", "(Lcom/google/android/nv6;)I", "singleAxisViewportSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/gestures/snapping/f$a", "Lcom/google/android/bwb;", "", "velocity", "decayOffset", "b", "(FF)F", "a", "(F)F", "Lcom/google/android/nv6;", "d", "()Lcom/google/android/nv6;", "layoutInfo", "", "c", "()I", "averageItemSize", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements bwb {
        final /* synthetic */ LazyListState a;
        final /* synthetic */ j b;

        a(LazyListState lazyListState, j jVar) {
            this.a = lazyListState;
            this.b = jVar;
        }

        private final int c() {
            nv6 nv6VarD = d();
            if (nv6VarD.h().isEmpty()) {
                return 0;
            }
            int size = nv6VarD.h().size();
            List<gv6> listH = nv6VarD.h();
            int size2 = listH.size();
            int size3 = 0;
            for (int i = 0; i < size2; i++) {
                size3 += listH.get(i).getSize();
            }
            return size3 / size;
        }

        private final nv6 d() {
            return this.a.C();
        }

        @Override // com.google.inputmethod.bwb
        public float a(float velocity) {
            List<gv6> listH = d().h();
            j jVar = this.b;
            int size = listH.size();
            float f = Float.NEGATIVE_INFINITY;
            float f2 = Float.POSITIVE_INFINITY;
            for (int i = 0; i < size; i++) {
                gv6 gv6Var = listH.get(i);
                yt6 yt6Var = gv6Var instanceof yt6 ? (yt6) gv6Var : null;
                if (yt6Var == null || !yt6Var.getNonScrollableItem()) {
                    float fA = cwb.a(f.d(d()), d().e(), d().getAfterContentPadding(), gv6Var.getSize(), gv6Var.getOffset(), gv6Var.getIndex(), jVar, d().getTotalItemsCount());
                    if (fA <= 0.0f && fA > f) {
                        f = fA;
                    }
                    if (fA >= 0.0f && fA < f2) {
                        f2 = fA;
                    }
                }
            }
            return SnapFlingBehaviorKt.l(f.c(this.a.w(), velocity), f, f2);
        }

        @Override // com.google.inputmethod.bwb
        public float b(float velocity, float decayOffset) {
            return g.d(Math.abs(decayOffset) - c(), 0.0f) * Math.signum(decayOffset);
        }
    }

    public static final bwb a(LazyListState lazyListState, j jVar) {
        return new a(lazyListState, jVar);
    }

    public static /* synthetic */ bwb b(LazyListState lazyListState, j jVar, int i, Object obj) {
        if ((i & 2) != 0) {
            jVar = j.a.a;
        }
        return a(lazyListState, jVar);
    }

    public static final int c(f43 f43Var, float f) {
        if (Math.abs(f) < f43Var.x2(SnapFlingBehaviorKt.o())) {
            return d.INSTANCE.a();
        }
        return f > 0.0f ? d.INSTANCE.b() : d.INSTANCE.c();
    }

    public static final int d(nv6 nv6Var) {
        return (int) (nv6Var.getOrientation() == Orientation.Vertical ? nv6Var.b() & 4294967295L : nv6Var.b() >> 32);
    }
}
