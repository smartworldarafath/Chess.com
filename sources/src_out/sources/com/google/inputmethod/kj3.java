package com.google.inputmethod;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010)¨\u0006+"}, d2 = {"Lcom/google/android/kj3;", "Landroidx/compose/ui/graphics/painter/Painter;", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/okb;", "shadow", "Lcom/google/android/mj3;", "renderCreator", "<init>", "(Lcom/google/android/xkb;Lcom/google/android/okb;Lcom/google/android/mj3;)V", "(Lcom/google/android/xkb;Lcom/google/android/okb;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "n", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "a", "(F)Z", "Landroidx/compose/ui/graphics/h;", "colorFilter", "b", "(Landroidx/compose/ui/graphics/h;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "c", "(Landroidx/compose/ui/unit/LayoutDirection;)Z", "h", "Lcom/google/android/xkb;", "i", "Lcom/google/android/okb;", "j", "Lcom/google/android/mj3;", "k", "F", "l", "Landroidx/compose/ui/unit/LayoutDirection;", "m", "Landroidx/compose/ui/graphics/h;", "Lcom/google/android/tsb;", "()J", "intrinsicSize", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kj3 extends Painter {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final xkb shape;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Shadow shadow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final mj3 renderCreator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private h colorFilter;

    public kj3(xkb xkbVar, Shadow okbVar, mj3 mj3Var) {
        this.shape = xkbVar;
        this.shadow = okbVar;
        this.renderCreator = mj3Var;
        this.alpha = 1.0f;
        this.layoutDirection = LayoutDirection.Ltr;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(h colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean c(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: l */
    public long getIntrinsicSize() {
        return tsb.INSTANCE.a();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void n(DrawScope drawScope) {
        lj3 lj3VarE = this.renderCreator.e(this.shape, drawScope.d(), drawScope.getLayoutDirection(), drawScope, this.shadow);
        float fX2 = drawScope.x2(if3.f(this.shadow.getOffset()));
        float fX3 = drawScope.x2(if3.g(this.shadow.getOffset()));
        drawScope.getDrawContext().getTransform().c(fX2, fX3);
        try {
            lj3VarE.b(drawScope, this.colorFilter, drawScope.d(), lj3VarE.getShadow().getColor(), lj3VarE.getShadow().getBrush(), g.n(this.alpha * lj3VarE.getShadow().getAlpha(), 0.0f, 1.0f), lj3VarE.getShadow().getBlendMode());
        } finally {
            drawScope.getDrawContext().getTransform().c(-fX2, -fX3);
        }
    }

    public kj3(xkb xkbVar, Shadow okbVar) {
        this(xkbVar, okbVar, mj3.INSTANCE.a());
    }
}
