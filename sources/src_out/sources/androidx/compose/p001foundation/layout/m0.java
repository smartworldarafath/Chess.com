package androidx.compose.p001foundation.layout;

import androidx.compose.ui.layout.j;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.h66;
import com.google.inputmethod.kx1;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/m0;", "Landroidx/compose/foundation/layout/o0;", "Landroidx/compose/foundation/layout/IntrinsicSize;", "height", "", "enforceIncoming", "<init>", "(Landroidx/compose/foundation/layout/IntrinsicSize;Z)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "n3", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)J", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "width", "m", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "i", "p", "Landroidx/compose/foundation/layout/IntrinsicSize;", "getHeight", "()Landroidx/compose/foundation/layout/IntrinsicSize;", "r3", "(Landroidx/compose/foundation/layout/IntrinsicSize;)V", "q", "Z", "o3", "()Z", "q3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m0 extends o0 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private IntrinsicSize height;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean enforceIncoming;

    public m0(IntrinsicSize intrinsicSize, boolean z) {
        this.height = intrinsicSize;
        this.enforceIncoming = z;
    }

    @Override // androidx.compose.p001foundation.layout.o0, androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        return this.height == IntrinsicSize.Min ? f66Var.d0(i) : f66Var.W(i);
    }

    @Override // androidx.compose.p001foundation.layout.o0, androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        return this.height == IntrinsicSize.Min ? f66Var.d0(i) : f66Var.W(i);
    }

    @Override // androidx.compose.p001foundation.layout.o0
    public long n3(j jVar, dj7 dj7Var, long j) {
        int iD0 = this.height == IntrinsicSize.Min ? dj7Var.d0(kx1.l(j)) : dj7Var.W(kx1.l(j));
        if (iD0 < 0) {
            iD0 = 0;
        }
        return kx1.INSTANCE.d(iD0);
    }

    @Override // androidx.compose.p001foundation.layout.o0
    /* JADX INFO: renamed from: o3, reason: from getter */
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public void q3(boolean z) {
        this.enforceIncoming = z;
    }

    public final void r3(IntrinsicSize intrinsicSize) {
        this.height = intrinsicSize;
    }
}
