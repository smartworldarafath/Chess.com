package androidx.compose.p001foundation.layout;

import androidx.compose.ui.layout.o;
import com.google.inputmethod.dj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.t06;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001:\u0002 \u0016B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/a0;", "", "", "maxItemsInMainAxis", "Landroidx/compose/foundation/layout/c0;", "overflow", "Lcom/google/android/bu8;", "constraints", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "<init>", "(ILandroidx/compose/foundation/layout/c0;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/layout/a0$b;", "wrapInfo", "", "hasNext", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "Landroidx/compose/foundation/layout/a0$a;", "a", "(Landroidx/compose/foundation/layout/a0$b;ZIIII)Landroidx/compose/foundation/layout/a0$a;", "nextItemHasNext", "Lcom/google/android/t06;", "leftOver", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "b", "(ZIJLcom/google/android/t06;IIIZZ)Landroidx/compose/foundation/layout/a0$b;", "I", "Landroidx/compose/foundation/layout/c0;", "c", "J", "d", "e", "f", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int maxItemsInMainAxis;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FlowLayoutOverflowState overflow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long constraints;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int maxLines;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int mainAxisSpacing;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int crossAxisSpacing;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/a0$a;", "", "Lcom/google/android/dj7;", "ellipsis", "Landroidx/compose/ui/layout/o;", "placeable", "Lcom/google/android/t06;", "ellipsisSize", "", "placeEllipsisOnLastContentLine", "<init>", "(Lcom/google/android/dj7;Landroidx/compose/ui/layout/o;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "Lcom/google/android/dj7;", "()Lcom/google/android/dj7;", "b", "Landroidx/compose/ui/layout/o;", "d", "()Landroidx/compose/ui/layout/o;", "c", "J", "()J", "Z", "()Z", "e", "(Z)V", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final dj7 ellipsis;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final o placeable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long ellipsisSize;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private boolean placeEllipsisOnLastContentLine;

        public /* synthetic */ a(dj7 dj7Var, o oVar, long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(dj7Var, oVar, j, z);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dj7 getEllipsis() {
            return this.ellipsis;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getEllipsisSize() {
            return this.ellipsisSize;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final o getPlaceable() {
            return this.placeable;
        }

        public final void e(boolean z) {
            this.placeEllipsisOnLastContentLine = z;
        }

        private a(dj7 dj7Var, o oVar, long j, boolean z) {
            this.ellipsis = dj7Var;
            this.placeable = oVar;
            this.ellipsisSize = j;
            this.placeEllipsisOnLastContentLine = z;
        }

        public /* synthetic */ a(dj7 dj7Var, o oVar, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(dj7Var, oVar, j, (i & 8) != 0 ? true : z, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/a0$b;", "", "", "isLastItemInLine", "isLastItemInContainer", "<init>", "(ZZ)V", "a", "Z", "b", "()Z", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isLastItemInLine;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isLastItemInContainer;

        public b(boolean z, boolean z2) {
            this.isLastItemInLine = z;
            this.isLastItemInContainer = z2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsLastItemInContainer() {
            return this.isLastItemInContainer;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsLastItemInLine() {
            return this.isLastItemInLine;
        }
    }

    public /* synthetic */ a0(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, flowLayoutOverflowState, j, i2, i3, i4);
    }

    public final a a(b wrapInfo, boolean hasNext, int lastContentLineIndex, int totalCrossAxisSize, int leftOverMainAxis, int nextIndexInLine) {
        a aVarC;
        if (!wrapInfo.getIsLastItemInContainer() || (aVarC = this.overflow.c(hasNext, lastContentLineIndex, totalCrossAxisSize)) == null) {
            return null;
        }
        aVarC.e(lastContentLineIndex >= 0 && (nextIndexInLine == 0 || (leftOverMainAxis - t06.e(aVarC.getEllipsisSize()) >= 0 && nextIndexInLine < this.maxItemsInMainAxis)));
        return aVarC;
    }

    public final b b(boolean nextItemHasNext, int nextIndexInLine, long leftOver, t06 nextSize, int lineIndex, int totalCrossAxisSize, int currentLineCrossAxisSize, boolean isWrappingRound, boolean isEllipsisWrap) {
        int i = totalCrossAxisSize + currentLineCrossAxisSize;
        if (nextSize == null) {
            return new b(true, true);
        }
        if (this.overflow.getType() != FlowLayoutOverflow.OverflowType.Visible && (lineIndex >= this.maxLines || t06.f(leftOver) - t06.f(nextSize.getPackedValue()) < 0)) {
            return new b(true, true);
        }
        if (nextIndexInLine != 0 && (nextIndexInLine >= this.maxItemsInMainAxis || t06.e(leftOver) - t06.e(nextSize.getPackedValue()) < 0)) {
            return isWrappingRound ? new b(true, true) : new b(true, b(nextItemHasNext, 0, t06.b(kx1.l(this.constraints), (t06.f(leftOver) - this.crossAxisSpacing) - currentLineCrossAxisSize), t06.a(t06.b(t06.e(nextSize.getPackedValue()) - this.mainAxisSpacing, t06.f(nextSize.getPackedValue()))), lineIndex + 1, i, 0, true, false).getIsLastItemInContainer());
        }
        int iMax = totalCrossAxisSize + Math.max(currentLineCrossAxisSize, t06.f(nextSize.getPackedValue()));
        t06 t06VarD = isEllipsisWrap ? null : this.overflow.d(nextItemHasNext, lineIndex, iMax);
        if (t06VarD != null) {
            t06VarD.getPackedValue();
            if (nextIndexInLine + 1 >= this.maxItemsInMainAxis || ((t06.e(leftOver) - t06.e(nextSize.getPackedValue())) - this.mainAxisSpacing) - t06.e(t06VarD.getPackedValue()) < 0) {
                if (isEllipsisWrap) {
                    return new b(true, true);
                }
                b bVarB = b(false, 0, t06.b(kx1.l(this.constraints), (t06.f(leftOver) - this.crossAxisSpacing) - Math.max(currentLineCrossAxisSize, t06.f(nextSize.getPackedValue()))), t06VarD, lineIndex + 1, iMax, 0, true, true);
                return new b(bVarB.getIsLastItemInContainer(), bVarB.getIsLastItemInContainer());
            }
        }
        return new b(false, false);
    }

    private a0(int i, FlowLayoutOverflowState flowLayoutOverflowState, long j, int i2, int i3, int i4) {
        this.maxItemsInMainAxis = i;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j;
        this.maxLines = i2;
        this.mainAxisSpacing = i3;
        this.crossAxisSpacing = i4;
    }
}
