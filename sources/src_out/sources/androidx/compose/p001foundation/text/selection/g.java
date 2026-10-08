package androidx.compose.p001foundation.text.selection;

import androidx.compose.p001foundation.text.selection.g;
import androidx.compose.ui.text.x;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.heb;
import com.google.inputmethod.wac;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a#\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\t*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0011\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a#\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\"\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/heb;", "Landroidx/compose/foundation/text/selection/d;", "info", "Landroidx/compose/foundation/text/selection/e$a;", "previousSelectionAnchor", "l", "(Lcom/google/android/heb;Landroidx/compose/foundation/text/selection/d;Landroidx/compose/foundation/text/selection/e$a;)Landroidx/compose/foundation/text/selection/e$a;", "", "currentRawOffset", "", "isStart", "j", "(Landroidx/compose/foundation/text/selection/d;IZ)Z", "currentLine", "currentOffset", "otherOffset", "crossed", "k", "(Landroidx/compose/foundation/text/selection/d;IIIZZ)Landroidx/compose/foundation/text/selection/e$a;", "layout", "Landroidx/compose/foundation/text/selection/a;", "boundaryFunction", "Landroidx/compose/foundation/text/selection/e;", "e", "(Lcom/google/android/heb;Landroidx/compose/foundation/text/selection/a;)Landroidx/compose/foundation/text/selection/e;", "slot", "f", "(Landroidx/compose/foundation/text/selection/d;ZZILandroidx/compose/foundation/text/selection/a;)Landroidx/compose/foundation/text/selection/e$a;", "h", "(Landroidx/compose/foundation/text/selection/e;Lcom/google/android/heb;)Landroidx/compose/foundation/text/selection/e;", "i", "newOffset", "g", "(Landroidx/compose/foundation/text/selection/e$a;Landroidx/compose/foundation/text/selection/d;I)Landroidx/compose/foundation/text/selection/e$a;", "currentRawLine", "anchorSnappedToWordBoundary", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection e(heb hebVar, a aVar) {
        boolean z = hebVar.c() == CrossStatus.CROSSED;
        return new Selection(f(hebVar.f(), z, true, hebVar.getStartSlot(), aVar), f(hebVar.e(), z, false, hebVar.getEndSlot(), aVar), z);
    }

    private static final Selection.AnchorInfo f(d dVar, boolean z, boolean z2, int i, a aVar) {
        int rawStartHandleOffset = z2 ? dVar.getRawStartHandleOffset() : dVar.getRawEndHandleOffset();
        if (i != dVar.getSlot()) {
            return dVar.a(rawStartHandleOffset);
        }
        long jA = aVar.a(dVar, rawStartHandleOffset);
        return dVar.a(z ^ z2 ? x.n(jA) : x.i(jA));
    }

    private static final Selection.AnchorInfo g(Selection.AnchorInfo anchorInfo, d dVar, int i) {
        return Selection.AnchorInfo.b(anchorInfo, dVar.getTextLayoutResult().c(i), i, 0L, 4, null);
    }

    public static final Selection h(Selection selection, heb hebVar) {
        if (k.c(selection, hebVar)) {
            return (hebVar.getSize() > 1 || hebVar.getPreviousSelection() == null || hebVar.getInfo().c().length() == 0) ? selection : i(selection, hebVar);
        }
        return selection;
    }

    private static final Selection i(Selection selection, heb hebVar) {
        d info = hebVar.getInfo();
        String strC = info.c();
        int rawStartHandleOffset = info.getRawStartHandleOffset();
        int length = strC.length();
        if (rawStartHandleOffset == 0) {
            int iC = wac.c(strC, 0);
            return hebVar.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), info, iC), null, true, 2, null) : Selection.b(selection, null, g(selection.getEnd(), info, iC), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iD = wac.d(strC, length);
            return hebVar.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), info, iD), null, false, 2, null) : Selection.b(selection, null, g(selection.getEnd(), info, iD), true, 1, null);
        }
        Selection previousSelection = hebVar.getPreviousSelection();
        boolean z = previousSelection != null && previousSelection.getHandlesCrossed();
        int iD2 = hebVar.getIsStartHandle() ^ z ? wac.d(strC, rawStartHandleOffset) : wac.c(strC, rawStartHandleOffset);
        return hebVar.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), info, iD2), null, z, 2, null) : Selection.b(selection, null, g(selection.getEnd(), info, iD2), z, 1, null);
    }

    private static final boolean j(d dVar, int i, boolean z) {
        if (dVar.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i == dVar.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z ^ (dVar.d() == CrossStatus.CROSSED)) {
            return i < dVar.getRawPreviousHandleOffset();
        }
        return i > dVar.getRawPreviousHandleOffset();
    }

    private static final Selection.AnchorInfo k(d dVar, int i, int i2, int i3, boolean z, boolean z2) {
        int iU;
        int iP;
        long jC = dVar.getTextLayoutResult().C(i2);
        if (dVar.getTextLayoutResult().q(x.n(jC)) == i) {
            iU = x.n(jC);
        } else {
            iU = i >= dVar.getTextLayoutResult().n() ? dVar.getTextLayoutResult().u(dVar.getTextLayoutResult().n() - 1) : dVar.getTextLayoutResult().u(i);
        }
        if (dVar.getTextLayoutResult().q(x.i(jC)) == i) {
            iP = x.i(jC);
        } else {
            iP = i >= dVar.getTextLayoutResult().n() ? TextLayoutResult.p(dVar.getTextLayoutResult(), dVar.getTextLayoutResult().n() - 1, false, 2, null) : TextLayoutResult.p(dVar.getTextLayoutResult(), i, false, 2, null);
        }
        if (iU == i3) {
            return dVar.a(iP);
        }
        if (iP == i3) {
            return dVar.a(iU);
        }
        if (!(z ^ z2) ? i2 >= iU : i2 > iP) {
            iU = iP;
        }
        return dVar.a(iU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo l(final heb hebVar, final d dVar, Selection.AnchorInfo anchorInfo) {
        final int rawStartHandleOffset = hebVar.getIsStartHandle() ? dVar.getRawStartHandleOffset() : dVar.getRawEndHandleOffset();
        if ((hebVar.getIsStartHandle() ? hebVar.getStartSlot() : hebVar.getEndSlot()) != dVar.getSlot()) {
            return dVar.a(rawStartHandleOffset);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final Lazy lazyA = c.a(lazyThreadSafetyMode, new Function0() { // from class: com.google.android.rdb
            public final Object invoke() {
                return Integer.valueOf(g.m(dVar, rawStartHandleOffset));
            }
        });
        final int rawEndHandleOffset = hebVar.getIsStartHandle() ? dVar.getRawEndHandleOffset() : dVar.getRawStartHandleOffset();
        Lazy lazyA2 = c.a(lazyThreadSafetyMode, new Function0() { // from class: com.google.android.sdb
            public final Object invoke() {
                return g.o(dVar, rawStartHandleOffset, rawEndHandleOffset, hebVar, lazyA);
            }
        });
        if (dVar.getSelectableId() != anchorInfo.getSelectableId()) {
            return p(lazyA2);
        }
        int rawPreviousHandleOffset = dVar.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (n(lazyA) != dVar.getTextLayoutResult().q(rawPreviousHandleOffset)) {
            return p(lazyA2);
        }
        int offset = anchorInfo.getOffset();
        long jC = dVar.getTextLayoutResult().C(offset);
        if (j(dVar, rawStartHandleOffset, hebVar.getIsStartHandle())) {
            return (offset == x.n(jC) || offset == x.i(jC)) ? p(lazyA2) : dVar.a(rawStartHandleOffset);
        }
        return dVar.a(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(d dVar, int i) {
        return dVar.getTextLayoutResult().q(i);
    }

    private static final int n(Lazy<Integer> lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo o(d dVar, int i, int i2, heb hebVar, Lazy lazy) {
        return k(dVar, n(lazy), i, i2, hebVar.getIsStartHandle(), hebVar.c() == CrossStatus.CROSSED);
    }

    private static final Selection.AnchorInfo p(Lazy<Selection.AnchorInfo> lazy) {
        return (Selection.AnchorInfo) lazy.getValue();
    }
}
