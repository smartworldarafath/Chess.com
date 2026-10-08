package androidx.compose.p001foundation.lazy.grid;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.lazy.grid.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.dfa;
import com.google.inputmethod.fj7;
import com.google.inputmethod.jq6;
import com.google.inputmethod.k0b;
import com.google.inputmethod.k43;
import com.google.inputmethod.uc;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "g", "(IILandroidx/compose/runtime/d;II)Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Lcom/google/android/jq6;", "a", "Lcom/google/android/jq6;", "EmptyLazyGridLayoutInfo", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    private static final jq6 a;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"androidx/compose/foundation/lazy/grid/d$a", "Lcom/google/android/fj7;", "", "l", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Lcom/google/android/uc;", "c", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements fj7 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int width;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int height;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Map<uc, Integer> alignmentLines = b0.j();

        a() {
        }

        @Override // com.google.inputmethod.fj7
        public int getHeight() {
            return this.height;
        }

        @Override // com.google.inputmethod.fj7
        public int getWidth() {
            return this.width;
        }

        @Override // com.google.inputmethod.fj7
        public Map<uc, Integer> j() {
            return this.alignmentLines;
        }

        @Override // com.google.inputmethod.fj7
        public void l() {
        }
    }

    static {
        a aVar = new a();
        List listP = m.p();
        Orientation orientation = Orientation.Vertical;
        a = new jq6(null, 0, false, 0.0f, aVar, 0.0f, false, j.a(EmptyCoroutineContext.a), k43.b(1.0f, 0.0f, 2, null), 0, new Function1() { // from class: com.google.android.gr6
            public final Object invoke(Object obj) {
                return d.d(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: com.google.android.hr6
            public final Object invoke(Object obj) {
                return Integer.valueOf(d.e(((Integer) obj).intValue()));
            }
        }, listP, 0, 0, 0, false, orientation, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(int i) {
        return m.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i) {
        return -1;
    }

    public static final LazyGridState g(final int i, final int i2, androidx.compose.p004runtime.d dVar, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (e.k()) {
            e.o(29186956, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:79)");
        }
        Object[] objArr = new Object[0];
        k0b<LazyGridState, ?> k0bVarA = LazyGridState.INSTANCE.a();
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && dVar.C(i)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !dVar.C(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objR = dVar.R();
        if (z3 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR = new Function0() { // from class: com.google.android.fr6
                public final Object invoke() {
                    return d.h(i, i2);
                }
            };
            dVar.L(objR);
        }
        LazyGridState lazyGridState = (LazyGridState) dfa.k(objArr, k0bVarA, (Function0) objR, dVar, 0);
        if (e.k()) {
            e.n();
        }
        return lazyGridState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridState h(int i, int i2) {
        return new LazyGridState(i, i2);
    }
}
