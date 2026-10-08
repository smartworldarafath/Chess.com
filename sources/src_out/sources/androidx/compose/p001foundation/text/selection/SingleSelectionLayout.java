package androidx.compose.p001foundation.text.selection;

import com.google.inputmethod.heb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.n, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001\u0018B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u0014\u0010*\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010)R\u0014\u0010-\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010,R\u0014\u0010/\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010,R\u0014\u00101\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,¨\u00062"}, d2 = {"Landroidx/compose/foundation/text/selection/n;", "Lcom/google/android/heb;", "", "isStartHandle", "", "startSlot", "endSlot", "Landroidx/compose/foundation/text/selection/e;", "previousSelection", "Landroidx/compose/foundation/text/selection/d;", "info", "<init>", "(ZIILandroidx/compose/foundation/text/selection/e;Landroidx/compose/foundation/text/selection/d;)V", "Lkotlin/Function1;", "", "block", "k", "(Lkotlin/jvm/functions/Function1;)V", "other", "h", "(Lcom/google/android/heb;)Z", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "I", "g", "()I", "c", "j", "d", "Landroidx/compose/foundation/text/selection/e;", "()Landroidx/compose/foundation/text/selection/e;", "e", "Landroidx/compose/foundation/text/selection/d;", "getSize", "size", "Landroidx/compose/foundation/text/selection/CrossStatus;", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "f", "()Landroidx/compose/foundation/text/selection/d;", "startInfo", "endInfo", "currentInfo", "i", "firstInfo", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class SingleSelectionLayout implements heb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isStartHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int startSlot;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int endSlot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Selection previousSelection;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final d info;

    public SingleSelectionLayout(boolean z, int i, int i2, Selection selection, d dVar) {
        this.isStartHandle = z;
        this.startSlot = i;
        this.endSlot = i2;
        this.previousSelection = selection;
        this.info = dVar;
    }

    @Override // com.google.inputmethod.heb
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    @Override // com.google.inputmethod.heb
    /* JADX INFO: renamed from: b, reason: from getter */
    public d getInfo() {
        return this.info;
    }

    @Override // com.google.inputmethod.heb
    public CrossStatus c() {
        if (getStartSlot() < getEndSlot()) {
            return CrossStatus.NOT_CROSSED;
        }
        return getStartSlot() > getEndSlot() ? CrossStatus.CROSSED : this.info.d();
    }

    @Override // com.google.inputmethod.heb
    /* JADX INFO: renamed from: d, reason: from getter */
    public Selection getPreviousSelection() {
        return this.previousSelection;
    }

    @Override // com.google.inputmethod.heb
    public d e() {
        return this.info;
    }

    @Override // com.google.inputmethod.heb
    public d f() {
        return this.info;
    }

    @Override // com.google.inputmethod.heb
    /* JADX INFO: renamed from: g, reason: from getter */
    public int getStartSlot() {
        return this.startSlot;
    }

    @Override // com.google.inputmethod.heb
    public int getSize() {
        return 1;
    }

    @Override // com.google.inputmethod.heb
    public boolean h(heb other) {
        if (getPreviousSelection() == null || other == null || !(other instanceof SingleSelectionLayout)) {
            return true;
        }
        SingleSelectionLayout singleSelectionLayout = (SingleSelectionLayout) other;
        return (getStartSlot() == singleSelectionLayout.getStartSlot() && getEndSlot() == singleSelectionLayout.getEndSlot() && getIsStartHandle() == singleSelectionLayout.getIsStartHandle() && !this.info.m(singleSelectionLayout.info)) ? false : true;
    }

    @Override // com.google.inputmethod.heb
    public d i() {
        return this.info;
    }

    @Override // com.google.inputmethod.heb
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getEndSlot() {
        return this.endSlot;
    }

    @Override // com.google.inputmethod.heb
    public void k(Function1<? super d, Unit> block) {
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + getIsStartHandle() + ", crossed=" + c() + ", info=\n\t" + this.info + ')';
    }
}
