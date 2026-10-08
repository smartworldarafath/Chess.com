package androidx.compose.ui.draw;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.f43;
import com.google.inputmethod.k43;
import com.google.inputmethod.lw0;
import com.google.inputmethod.tsb;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/draw/g;", "Lcom/google/android/lw0;", "<init>", "()V", "Lcom/google/android/tsb;", "b", "J", "d", "()J", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "c", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "density", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g implements lw0 {
    public static final g a = new g();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final long size = tsb.INSTANCE.a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final LayoutDirection layoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final f43 density = k43.a(1.0f, 1.0f);

    private g() {
    }

    @Override // com.google.inputmethod.lw0
    public long d() {
        return size;
    }

    @Override // com.google.inputmethod.lw0
    public f43 getDensity() {
        return density;
    }

    @Override // com.google.inputmethod.lw0
    public LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }
}
