package androidx.compose.p001foundation.layout;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.node.c;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.uc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/b;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/uc;", "alignmentLine", "Lcom/google/android/ff3;", "before", "after", "<init>", "(Lcom/google/android/uc;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "Lcom/google/android/uc;", "getAlignmentLine", "()Lcom/google/android/uc;", "n3", "(Lcom/google/android/uc;)V", "q", "F", "getBefore-D9Ej5fM", "()F", "o3", "(F)V", "r", "getAfter-D9Ej5fM", "m3", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b extends androidx.compose.ui.b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private uc alignmentLine;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private float before;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private float after;

    public /* synthetic */ b(uc ucVar, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ucVar, f, f2);
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        return AlignmentLineKt.c(jVar, this.alignmentLine, this.before, this.after, dj7Var, j);
    }

    public final void m3(float f) {
        this.after = f;
    }

    public final void n3(uc ucVar) {
        this.alignmentLine = ucVar;
    }

    public final void o3(float f) {
        this.before = f;
    }

    private b(uc ucVar, float f, float f2) {
        this.alignmentLine = ucVar;
        this.before = f;
        this.after = f2;
    }
}
