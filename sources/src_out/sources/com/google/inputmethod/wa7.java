package com.google.inputmethod;

import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.layout.o;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\u0002*\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/google/android/wa7;", "", "Lcom/google/android/kn6;", "f", "(Lcom/google/android/kn6;)Lcom/google/android/kn6;", "sourceCoordinates", "Lcom/google/android/rn8;", "relativeToSource", "", "includeMotionFrameOfReference", "i", "(Lcom/google/android/kn6;Lcom/google/android/kn6;JZ)J", "Landroidx/compose/ui/layout/o$a;", "b", "(Landroidx/compose/ui/layout/o$a;)Lcom/google/android/kn6;", "lookaheadScopeCoordinates", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface wa7 {
    static /* synthetic */ long j(wa7 wa7Var, kn6 kn6Var, kn6 kn6Var2, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if ((i & 2) != 0) {
            j = rn8.INSTANCE.c();
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = true;
        }
        return wa7Var.i(kn6Var, kn6Var2, j2, z);
    }

    kn6 b(o.a aVar);

    kn6 f(kn6 kn6Var);

    default long i(kn6 kn6Var, kn6 kn6Var2, long j, boolean z) {
        return LookaheadScopeKt.b(this, kn6Var, kn6Var2, j, z);
    }
}
