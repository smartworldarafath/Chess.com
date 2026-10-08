package androidx.compose.p001foundation.text.selection;

import androidx.compose.p001foundation.text.selection.d;
import androidx.compose.p001foundation.text.selection.k;
import androidx.compose.ui.text.x;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.geb;
import com.google.inputmethod.heb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\b*\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/vxc;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/x;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Lcom/google/android/heb;", "b", "(Lcom/google/android/vxc;IIIJZZ)Lcom/google/android/heb;", "Landroidx/compose/foundation/text/selection/e;", "layout", "c", "(Landroidx/compose/foundation/text/selection/e;Lcom/google/android/heb;)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    public static final heb b(TextLayoutResult textLayoutResult, int i, int i2, int i3, long j, boolean z, boolean z2) {
        return new SingleSelectionLayout(z2, 1, 1, z ? null : new Selection(new Selection.AnchorInfo(geb.a(textLayoutResult, x.n(j)), x.n(j), 1L), new Selection.AnchorInfo(geb.a(textLayoutResult, x.i(j)), x.i(j), 1L), x.m(j)), new d(1L, 1, i, i2, i3, textLayoutResult));
    }

    public static final boolean c(Selection selection, heb hebVar) {
        if (selection == null || hebVar == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (hebVar.i().l() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        hebVar.k(new Function1() { // from class: com.google.android.ieb
            public final Object invoke(Object obj) {
                return k.d(booleanRef, (d) obj);
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Ref.BooleanRef booleanRef, d dVar) {
        if (dVar.c().length() > 0) {
            booleanRef.element = false;
        }
        return Unit.a;
    }
}
