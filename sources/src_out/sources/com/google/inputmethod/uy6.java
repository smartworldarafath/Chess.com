package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/google/android/ky6;", "", "itemIndex", "Lcom/google/android/by6;", "b", "(Lcom/google/android/ky6;I)Lcom/google/android/by6;", "f", "(Lcom/google/android/ky6;)I", "", "a", "[I", "EmptyArray", "Lcom/google/android/sy6;", "Lcom/google/android/sy6;", "d", "()Lcom/google/android/sy6;", "EmptyLazyStaggeredGridLayoutInfo", "e", "singleAxisViewportSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class uy6 {
    private static final int[] a;
    private static final sy6 b;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"com/google/android/uy6$a", "Lcom/google/android/fj7;", "", "l", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Lcom/google/android/uc;", "c", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        int[] iArr = new int[0];
        a = iArr;
        b = new sy6(iArr, iArr, 0.0f, new a(), 0.0f, false, false, false, new az6(iArr, iArr), new bz6(new t48()), k43.b(1.0f, 0.0f, 2, null), 0, m.p(), q16.INSTANCE.a(), 0, 0, 0, 0, 0, j.a(EmptyCoroutineContext.a), null);
    }

    public static final by6 b(ky6 ky6Var, final int i) {
        if (ky6Var.h().isEmpty()) {
            return null;
        }
        int index = ((by6) m.z0(ky6Var.h())).getIndex();
        if (i > ((by6) m.L0(ky6Var.h())).getIndex() || index > i) {
            return null;
        }
        return (by6) m.C0(ky6Var.h(), m.n(ky6Var.h(), 0, 0, new Function1() { // from class: com.google.android.ty6
            public final Object invoke(Object obj) {
                return Integer.valueOf(uy6.c(i, (by6) obj));
            }
        }, 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, by6 by6Var) {
        return by6Var.getIndex() - i;
    }

    public static final sy6 d() {
        return b;
    }

    public static final int e(ky6 ky6Var) {
        return (int) (ky6Var.getOrientation() == Orientation.Vertical ? ky6Var.getViewportSize() & 4294967295L : ky6Var.getViewportSize() >> 32);
    }

    public static final int f(ky6 ky6Var) {
        List<by6> listH = ky6Var.h();
        if (listH.isEmpty()) {
            return 0;
        }
        int size = listH.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            by6 by6Var = listH.get(i);
            size2 += (int) (ky6Var.getOrientation() == Orientation.Vertical ? by6Var.getSize() & 4294967295L : by6Var.getSize() >> 32);
        }
        return (size2 / listH.size()) + ky6Var.getMainAxisItemSpacing();
    }
}
