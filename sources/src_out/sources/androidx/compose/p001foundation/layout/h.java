package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import com.google.inputmethod.f43;
import com.google.inputmethod.tc;
import com.google.inputmethod.x19;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0000*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/h;", "Lcom/google/android/x19;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/tc;", "alignment", "", "matchParentSize", "<init>", "(Lcom/google/android/tc;Z)V", "Lcom/google/android/f43;", "", "parentData", "o3", "(Lcom/google/android/f43;Ljava/lang/Object;)Landroidx/compose/foundation/layout/h;", "p", "Lcom/google/android/tc;", "m3", "()Lcom/google/android/tc;", "p3", "(Lcom/google/android/tc;)V", "q", "Z", "n3", "()Z", "q3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends b.c implements x19 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private tc alignment;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean matchParentSize;

    public h(tc tcVar, boolean z) {
        this.alignment = tcVar;
        this.matchParentSize = z;
    }

    /* JADX INFO: renamed from: m3, reason: from getter */
    public final tc getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // com.google.inputmethod.x19
    /* JADX INFO: renamed from: o3, reason: merged with bridge method [inline-methods] */
    public h r(f43 f43Var, Object obj) {
        return this;
    }

    public final void p3(tc tcVar) {
        this.alignment = tcVar;
    }

    public final void q3(boolean z) {
        this.matchParentSize = z;
    }
}
