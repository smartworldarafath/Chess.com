package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/android/qo6;", "Lcom/google/android/x19;", "Landroidx/compose/ui/b$c;", "", "weight", "", "fill", "<init>", "(FZ)V", "Lcom/google/android/f43;", "", "parentData", "Lcom/google/android/fra;", "m3", "(Lcom/google/android/f43;Ljava/lang/Object;)Lcom/google/android/fra;", "p", "F", "getWeight", "()F", "o3", "(F)V", "q", "Z", "getFill", "()Z", "n3", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qo6 extends b.c implements x19 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float weight;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean fill;

    public qo6(float f, boolean z) {
        this.weight = f;
        this.fill = z;
    }

    @Override // com.google.inputmethod.x19
    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData r(f43 f43Var, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.g(this.weight);
        rowColumnParentData.f(this.fill);
        return rowColumnParentData;
    }

    public final void n3(boolean z) {
        this.fill = z;
    }

    public final void o3(float f) {
        this.weight = f;
    }
}
