package androidx.compose.p001foundation.text.contextmenu.internal;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.g16;
import com.google.inputmethod.k16;
import com.google.inputmethod.q16;
import com.google.inputmethod.rg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R$\u0010*\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/internal/e;", "Lcom/google/android/rg9;", "popupPositionProvider", "<init>", "(Lcom/google/android/rg9;)V", "Lcom/google/android/k16;", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Lcom/google/android/g16;", "a", "(Lcom/google/android/k16;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "Lcom/google/android/rg9;", "getPopupPositionProvider", "()Lcom/google/android/rg9;", "b", "Lcom/google/android/q16;", "getPreviousWindowSize-bOM6tXw", "()Lcom/google/android/q16;", "setPreviousWindowSize-fhxjrPA", "(Lcom/google/android/q16;)V", "previousWindowSize", "c", "Landroidx/compose/ui/unit/LayoutDirection;", "getPreviousLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setPreviousLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "previousLayoutDirection", "d", "getPreviousPopupContentSize-bOM6tXw", "setPreviousPopupContentSize-fhxjrPA", "previousPopupContentSize", "e", "Lcom/google/android/g16;", "getPreviousPosition-JyOPPKE", "()Lcom/google/android/g16;", "setPreviousPosition-fg0MpWk", "(Lcom/google/android/g16;)V", "previousPosition", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e implements rg9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final rg9 popupPositionProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private q16 previousWindowSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LayoutDirection previousLayoutDirection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private q16 previousPopupContentSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private g16 previousPosition;

    public e(rg9 rg9Var) {
        this.popupPositionProvider = rg9Var;
    }

    @Override // com.google.inputmethod.rg9
    public long a(k16 anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        g16 g16Var = this.previousPosition;
        if (g16Var != null) {
            q16 q16Var = this.previousWindowSize;
            if ((q16Var == null ? false : q16.f(q16Var.getPackedValue(), windowSize)) && this.previousLayoutDirection == layoutDirection) {
                q16 q16Var2 = this.previousPopupContentSize;
                if (q16Var2 != null ? q16.f(q16Var2.getPackedValue(), popupContentSize) : false) {
                    return g16Var.getPackedValue();
                }
            }
        }
        long jA = this.popupPositionProvider.a(anchorBounds, windowSize, layoutDirection, popupContentSize);
        this.previousWindowSize = q16.b(windowSize);
        this.previousLayoutDirection = layoutDirection;
        this.previousPopupContentSize = q16.b(popupContentSize);
        this.previousPosition = g16.c(jA);
        return jA;
    }
}
