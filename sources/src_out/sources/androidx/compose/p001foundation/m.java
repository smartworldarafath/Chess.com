package androidx.compose.p001foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.sh7;
import com.google.inputmethod.fz1;
import com.google.inputmethod.k33;
import com.google.inputmethod.rn8;
import com.google.inputmethod.rx8;
import com.google.inputmethod.tsb;
import com.google.inputmethod.x23;
import com.google.inputmethod.xi;
import com.google.inputmethod.yg3;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0018\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J#\u0010\u001a\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J/\u0010 \u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010$\u001a\u00020#*\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/compose/foundation/m;", "Lcom/google/android/k33;", "Lcom/google/android/yg3;", "Lcom/google/android/x23;", "pointerInputNode", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/k;", "edgeEffectWrapper", "Lcom/google/android/rx8;", "glowDrawPadding", "<init>", "(Lcom/google/android/x23;Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Landroidx/compose/foundation/k;Lcom/google/android/rx8;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "canvas", "", "t3", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "v3", "right", "u3", "bottom", "s3", "", "rotationDegrees", "Lcom/google/android/rn8;", "offset", "edgeEffect", "w3", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "Lcom/google/android/fz1;", "", "j", "(Lcom/google/android/fz1;)V", "r", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "s", "Landroidx/compose/foundation/k;", "t", "Lcom/google/android/rx8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m extends k33 implements yg3 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final k edgeEffectWrapper;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final rx8 glowDrawPadding;

    public m(x23 x23Var, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, k kVar, rx8 rx8Var) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = kVar;
        this.glowDrawPadding = rx8Var;
        m3(x23Var);
    }

    private final boolean s3(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fX2 = drawScope.x2(this.glowDrawPadding.getBottom());
        float f = -Float.intBitsToFloat((int) (drawScope.d() >> 32));
        float f2 = (-Float.intBitsToFloat((int) (drawScope.d() & 4294967295L))) + fX2;
        return w3(180.0f, rn8.e((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean t3(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float f = -Float.intBitsToFloat((int) (drawScope.d() & 4294967295L));
        float fX2 = drawScope.x2(this.glowDrawPadding.b(drawScope.getLayoutDirection()));
        return w3(270.0f, rn8.e((((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fX2)))), edgeEffect, canvas);
    }

    private final boolean u3(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        return w3(90.0f, rn8.e((((long) Float.floatToRawIntBits((-sh7.d(Float.intBitsToFloat((int) (drawScope.d() >> 32)))) + drawScope.x2(this.glowDrawPadding.c(drawScope.getLayoutDirection())))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean v3(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float fX2 = drawScope.x2(this.glowDrawPadding.getTop());
        return w3(0.0f, rn8.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fX2)) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean w3(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        canvas.translate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        this.overscrollEffect.p(fz1Var.d());
        if (tsb.n(fz1Var.d())) {
            fz1Var.j1();
            return;
        }
        fz1Var.j1();
        this.overscrollEffect.i().getValue();
        Canvas canvasD = xi.d(fz1Var.getDrawContext().b());
        k kVar = this.edgeEffectWrapper;
        boolean zT3 = kVar.s() ? t3(fz1Var, kVar.i(), canvasD) : false;
        if (kVar.z()) {
            zT3 = v3(fz1Var, kVar.m(), canvasD) || zT3;
        }
        if (kVar.v()) {
            zT3 = u3(fz1Var, kVar.k(), canvasD) || zT3;
        }
        if (kVar.p()) {
            zT3 = s3(fz1Var, kVar.g(), canvasD) || zT3;
        }
        if (zT3) {
            this.overscrollEffect.j();
        }
    }
}
