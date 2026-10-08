package androidx.compose.p001foundation.text;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.TransformedText;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.wxc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.foundation.text.l, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/l;", "Landroidx/compose/ui/layout/g;", "Landroidx/compose/foundation/text/u;", "scrollerPosition", "", "cursorOffset", "Lcom/google/android/jed;", "transformedText", "Lkotlin/Function0;", "Lcom/google/android/wxc;", "textLayoutResultProvider", "<init>", "(Landroidx/compose/foundation/text/u;ILcom/google/android/jed;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/foundation/text/u;", "getScrollerPosition", "()Landroidx/compose/foundation/text/u;", "e", "I", "getCursorOffset", "f", "Lcom/google/android/jed;", "getTransformedText", "()Lcom/google/android/jed;", "g", "Lkotlin/jvm/functions/Function0;", "getTextLayoutResultProvider", "()Lkotlin/jvm/functions/Function0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class HorizontalScrollLayoutModifier implements g {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final u scrollerPosition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int cursorOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final TransformedText transformedText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final Function0<wxc> textLayoutResultProvider;

    public HorizontalScrollLayoutModifier(u uVar, int i, TransformedText transformedText, Function0<wxc> function0) {
        this.scrollerPosition = uVar;
        this.cursorOffset = i;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, j jVar, o oVar, int i, o.a aVar) {
        int i2 = horizontalScrollLayoutModifier.cursorOffset;
        TransformedText transformedText = horizontalScrollLayoutModifier.transformedText;
        wxc wxcVar = (wxc) horizontalScrollLayoutModifier.textLayoutResultProvider.invoke();
        horizontalScrollLayoutModifier.scrollerPosition.o(Orientation.Horizontal, TextFieldScrollKt.e(aVar, i2, transformedText, wxcVar != null ? wxcVar.getValue() : null, jVar.getLayoutDirection() == LayoutDirection.Rtl, oVar.getWidth()), i, oVar.getWidth());
        o.a.L(aVar, oVar, Math.round(-horizontalScrollLayoutModifier.scrollerPosition.h()), 0, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.layout.g
    public fj7 b(final j jVar, dj7 dj7Var, long j) {
        long j2;
        if (dj7Var.q0(kx1.k(j)) < kx1.l(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = kx1.d(j2, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        final o oVarR0 = dj7Var.r0(j);
        final int iMin = Math.min(oVarR0.getWidth(), kx1.l(j2));
        return j.Q1(jVar, iMin, oVarR0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.text.k
            public final Object invoke(Object obj) {
                return HorizontalScrollLayoutModifier.c(this.a, jVar, oVarR0, iMin, (o.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) other;
        return Intrinsics.e(this.scrollerPosition, horizontalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == horizontalScrollLayoutModifier.cursorOffset && Intrinsics.e(this.transformedText, horizontalScrollLayoutModifier.transformedText) && Intrinsics.e(this.textLayoutResultProvider, horizontalScrollLayoutModifier.textLayoutResultProvider);
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
