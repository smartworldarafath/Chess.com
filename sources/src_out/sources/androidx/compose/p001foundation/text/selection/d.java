package androidx.compose.p001foundation.text.selection;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.geb;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010)R\u0011\u0010,\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u0011\u00101\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b!\u00100¨\u00062"}, d2 = {"Landroidx/compose/foundation/text/selection/d;", "", "", "selectableId", "", "slot", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Lcom/google/android/vxc;", "textLayoutResult", "<init>", "(JIIIILcom/google/android/vxc;)V", "other", "", "m", "(Landroidx/compose/foundation/text/selection/d;)Z", "offset", "Landroidx/compose/foundation/text/selection/e$a;", "a", "(I)Landroidx/compose/foundation/text/selection/e$a;", "", "toString", "()Ljava/lang/String;", "J", "h", "()J", "b", "I", "i", "()I", "c", "g", "d", "e", "f", "Lcom/google/android/vxc;", "k", "()Lcom/google/android/vxc;", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "j", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "startRunDirection", "endRunDirection", "inputText", "l", "textLength", "Landroidx/compose/foundation/text/selection/CrossStatus;", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "rawCrossStatus", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final int g = TextLayoutResult.g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int slot;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int rawStartHandleOffset;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int rawEndHandleOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int rawPreviousHandleOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    public d(long j, int i, int i2, int i3, int i4, TextLayoutResult textLayoutResult) {
        this.selectableId = j;
        this.slot = i;
        this.rawStartHandleOffset = i2;
        this.rawEndHandleOffset = i3;
        this.rawPreviousHandleOffset = i4;
        this.textLayoutResult = textLayoutResult;
    }

    private final ResolvedTextDirection b() {
        return geb.a(this.textLayoutResult, this.rawEndHandleOffset);
    }

    private final ResolvedTextDirection j() {
        return geb.a(this.textLayoutResult, this.rawStartHandleOffset);
    }

    public final Selection.AnchorInfo a(int offset) {
        return new Selection.AnchorInfo(geb.a(this.textLayoutResult, offset), offset, this.selectableId);
    }

    public final String c() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public final CrossStatus d() {
        int i = this.rawStartHandleOffset;
        int i2 = this.rawEndHandleOffset;
        if (i < i2) {
            return CrossStatus.NOT_CROSSED;
        }
        return i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getSelectableId() {
        return this.selectableId;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSlot() {
        return this.slot;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(d other) {
        return (this.selectableId == other.selectableId && this.rawStartHandleOffset == other.rawStartHandleOffset && this.rawEndHandleOffset == other.rawEndHandleOffset) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + '-' + j() + ',' + this.rawEndHandleOffset + '-' + b() + "), prevOffset=" + this.rawPreviousHandleOffset + ')';
    }
}
