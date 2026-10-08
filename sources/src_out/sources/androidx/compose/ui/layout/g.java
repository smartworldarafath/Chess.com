package androidx.compose.ui.layout;

import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.h66;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ#\u0010\u0012\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ#\u0010\u0013\u001a\u00020\f*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/g;", "Landroidx/compose/ui/b$b;", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "width", "m", "t", "i", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface g extends androidx.compose.ui.b.InterfaceC0050b {
    fj7 b(j jVar, dj7 dj7Var, long j);

    default int i(h66 h66Var, f66 f66Var, int i) {
        return MeasuringIntrinsics.a.a(this, h66Var, f66Var, i);
    }

    default int m(h66 h66Var, f66 f66Var, int i) {
        return MeasuringIntrinsics.a.c(this, h66Var, f66Var, i);
    }

    default int t(h66 h66Var, f66 f66Var, int i) {
        return MeasuringIntrinsics.a.b(this, h66Var, f66Var, i);
    }

    default int z(h66 h66Var, f66 f66Var, int i) {
        return MeasuringIntrinsics.a.d(this, h66Var, f66Var, i);
    }
}
