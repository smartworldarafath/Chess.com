package androidx.compose.p002material3;

import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.g16;
import com.google.inputmethod.k16;
import com.google.inputmethod.rg9;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0015J-\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/material3/u2;", "Lcom/google/android/rg9;", "Landroidx/compose/material3/q2;", "type", "", "tooltipAnchorSpacing", "<init>", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/k16;", "anchorBounds", "Lcom/google/android/q16;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Lcom/google/android/g16;", "a", "(Lcom/google/android/k16;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "f", "(Lcom/google/android/k16;J)J", "g", "(Lcom/google/android/k16;JJ)J", "b", "c", "h", "(Landroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/k16;JJ)J", "d", "I", "e", "()I", "getTooltipAnchorSpacing", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class u2 implements rg9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int tooltipAnchorSpacing;

    public /* synthetic */ u2(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @Override // com.google.inputmethod.rg9
    public long a(k16 anchorBounds, long windowSize, LayoutDirection layoutDirection, long popupContentSize) {
        int i = this.type;
        q2.Companion companion = q2.INSTANCE;
        if (q2.h(i, companion.d())) {
            return f(anchorBounds, popupContentSize);
        }
        if (q2.h(i, companion.e())) {
            return g(anchorBounds, popupContentSize, windowSize);
        }
        if (q2.h(i, companion.a())) {
            return b(anchorBounds, popupContentSize, windowSize);
        }
        if (q2.h(i, companion.b())) {
            return c(anchorBounds, popupContentSize, windowSize);
        }
        if (q2.h(i, companion.f())) {
            return h(layoutDirection, anchorBounds, popupContentSize, windowSize);
        }
        return q2.h(i, companion.c()) ? d(layoutDirection, anchorBounds, popupContentSize, windowSize) : b(anchorBounds, popupContentSize, windowSize);
    }

    public final long b(k16 anchorBounds, long popupContentSize, long windowSize) {
        int i = (int) (popupContentSize >> 32);
        int left = anchorBounds.getLeft() + ((anchorBounds.r() - i) / 2);
        if (left < 0) {
            left = anchorBounds.getLeft();
        } else if (left + i > ((int) (windowSize >> 32))) {
            left = anchorBounds.getRight() - i;
        }
        int top = (anchorBounds.getTop() - ((int) (popupContentSize & 4294967295L))) - this.tooltipAnchorSpacing;
        if (top < 0) {
            top = anchorBounds.getBottom() + this.tooltipAnchorSpacing;
        }
        return g16.f((((long) left) << 32) | (((long) top) & 4294967295L));
    }

    public final long c(k16 anchorBounds, long popupContentSize, long windowSize) {
        int i = (int) (popupContentSize >> 32);
        int left = anchorBounds.getLeft() + ((anchorBounds.r() - i) / 2);
        if (left < 0) {
            left = anchorBounds.getLeft();
        } else if (left + i > ((int) (windowSize >> 32))) {
            left = anchorBounds.getRight() - i;
        }
        int bottom = anchorBounds.getBottom() + this.tooltipAnchorSpacing;
        int i2 = (int) (popupContentSize & 4294967295L);
        if (bottom + i2 > ((int) (windowSize & 4294967295L))) {
            bottom = (anchorBounds.getTop() - i2) - this.tooltipAnchorSpacing;
        }
        return g16.f((((long) left) << 32) | (((long) bottom) & 4294967295L));
    }

    public final long d(LayoutDirection layoutDirection, k16 anchorBounds, long popupContentSize, long windowSize) {
        return layoutDirection == LayoutDirection.Ltr ? g(anchorBounds, popupContentSize, windowSize) : f(anchorBounds, popupContentSize);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final long f(k16 anchorBounds, long popupContentSize) {
        int left = anchorBounds.getLeft() - (((int) (popupContentSize >> 32)) + this.tooltipAnchorSpacing);
        if (left < 0) {
            left = anchorBounds.getRight() + this.tooltipAnchorSpacing;
        }
        return g16.f((((long) left) << 32) | (((long) (((anchorBounds.getTop() + anchorBounds.getBottom()) - ((int) (popupContentSize & 4294967295L))) / 2)) & 4294967295L));
    }

    public final long g(k16 anchorBounds, long popupContentSize, long windowSize) {
        int right = anchorBounds.getRight() + this.tooltipAnchorSpacing;
        int i = (int) (popupContentSize >> 32);
        if (right + i > ((int) (windowSize >> 32))) {
            right = anchorBounds.getLeft() - (i + this.tooltipAnchorSpacing);
        }
        return g16.f((((long) right) << 32) | (((long) (((anchorBounds.getTop() + anchorBounds.getBottom()) - ((int) (popupContentSize & 4294967295L))) / 2)) & 4294967295L));
    }

    public final long h(LayoutDirection layoutDirection, k16 anchorBounds, long popupContentSize, long windowSize) {
        return layoutDirection == LayoutDirection.Ltr ? f(anchorBounds, popupContentSize) : g(anchorBounds, popupContentSize, windowSize);
    }

    private u2(int i, int i2) {
        this.type = i;
        this.tooltipAnchorSpacing = i2;
    }
}
