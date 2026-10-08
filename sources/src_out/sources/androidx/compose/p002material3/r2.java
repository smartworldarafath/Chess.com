package androidx.compose.p002material3;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.graphics.q;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.f43;
import com.google.inputmethod.o58;
import com.google.inputmethod.xkb;
import com.google.inputmethod.zh7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010 \u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010#\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006$"}, d2 = {"Landroidx/compose/material3/r2;", "Lcom/google/android/xkb;", "Lcom/google/android/o58;", "Lcom/google/android/zh7;", "transformationMatrix", "tooltipShape", "caretShape", "<init>", "(Lcom/google/android/o58;Lcom/google/android/xkb;Lcom/google/android/xkb;)V", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/graphics/n;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/f43;)Landroidx/compose/ui/graphics/n;", "createOutline", "a", "Lcom/google/android/o58;", "b", "Lcom/google/android/xkb;", "c", "Landroidx/compose/ui/graphics/Path;", "d", "Landroidx/compose/ui/graphics/Path;", "getTooltipPath", "()Landroidx/compose/ui/graphics/Path;", "tooltipPath", "e", "getCombinedPath", "combinedPath", "f", "getCaretPath", "caretPath", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class r2 implements xkb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o58<zh7> transformationMatrix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final xkb tooltipShape;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final xkb caretShape;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Path tooltipPath = d.a();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Path combinedPath = d.a();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Path caretPath = d.a();

    public r2(o58<zh7> o58Var, xkb xkbVar, xkb xkbVar2) {
        this.transformationMatrix = o58Var;
        this.tooltipShape = xkbVar;
        this.caretShape = xkbVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.xkb
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public n mo5createOutlinePq9zytI(long size, LayoutDirection layoutDirection, f43 density) throws NoWhenBranchMatchedException {
        this.tooltipPath.reset();
        this.combinedPath.reset();
        this.caretPath.reset();
        n nVarMo5createOutlinePq9zytI = this.tooltipShape.mo5createOutlinePq9zytI(size, layoutDirection, density);
        n nVarMo5createOutlinePq9zytI2 = this.caretShape.mo5createOutlinePq9zytI(size, layoutDirection, density);
        if (nVarMo5createOutlinePq9zytI instanceof n.a) {
            Path.n(this.tooltipPath, ((n.a) nVarMo5createOutlinePq9zytI).getPath(), 0L, 2, null);
        } else if (nVarMo5createOutlinePq9zytI instanceof n.c) {
            Path.p(this.tooltipPath, ((n.c) nVarMo5createOutlinePq9zytI).getRoundRect(), null, 2, null);
        } else {
            if (!(nVarMo5createOutlinePq9zytI instanceof n.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Path.x(this.tooltipPath, ((n.b) nVarMo5createOutlinePq9zytI).b(), null, 2, null);
        }
        if (nVarMo5createOutlinePq9zytI2 instanceof n.a) {
            Path.n(this.caretPath, ((n.a) nVarMo5createOutlinePq9zytI2).getPath(), 0L, 2, null);
        } else if (nVarMo5createOutlinePq9zytI2 instanceof n.c) {
            Path.p(this.caretPath, ((n.c) nVarMo5createOutlinePq9zytI2).getRoundRect(), null, 2, null);
        } else {
            if (!(nVarMo5createOutlinePq9zytI2 instanceof n.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Path.x(this.caretPath, ((n.b) nVarMo5createOutlinePq9zytI2).b(), null, 2, null);
        }
        this.caretPath.a(this.transformationMatrix.getValue().getValues());
        this.combinedPath.y(this.tooltipPath, this.caretPath, q.INSTANCE.d());
        return new n.a(this.combinedPath);
    }
}
