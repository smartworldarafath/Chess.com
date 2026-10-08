package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import com.google.inputmethod.RowColumnParentData;
import com.google.inputmethod.f43;
import com.google.inputmethod.tc;
import com.google.inputmethod.x19;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/i0;", "Lcom/google/android/x19;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/tc$b;", "horizontal", "<init>", "(Lcom/google/android/tc$b;)V", "Lcom/google/android/f43;", "", "parentData", "Lcom/google/android/fra;", "m3", "(Lcom/google/android/f43;Ljava/lang/Object;)Lcom/google/android/fra;", "p", "Lcom/google/android/tc$b;", "getHorizontal", "()Lcom/google/android/tc$b;", "n3", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 extends b.c implements x19 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private tc.b horizontal;

    public i0(tc.b bVar) {
        this.horizontal = bVar;
    }

    @Override // com.google.inputmethod.x19
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData r(f43 f43Var, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.e(s.INSTANCE.a(this.horizontal));
        return rowColumnParentData;
    }

    public final void n3(tc.b bVar) {
        this.horizontal = bVar;
    }
}
