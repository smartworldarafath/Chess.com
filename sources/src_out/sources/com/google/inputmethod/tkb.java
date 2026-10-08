package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0005JE\u0010\u0017\u001a\u00020\u000b*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001d\u001a\u00020\u000b*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH$¢\u0006\u0004\b\u001d\u0010\u001eJQ\u0010\u001f\u001a\u00020\u000b*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0015H$¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/google/android/tkb;", "", "Landroidx/compose/ui/graphics/n;", "outline", "<init>", "(Landroidx/compose/ui/graphics/n;)V", "Lcom/google/android/ei1;", "color", "Landroidx/compose/ui/graphics/h;", "c", "(J)Landroidx/compose/ui/graphics/h;", "", "e", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "colorFilter", "Lcom/google/android/tsb;", "size", "Lcom/google/android/qu0;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/e;", "blendMode", "b", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/h;JJLcom/google/android/qu0;FI)V", "Lcom/google/android/aa2;", "cornerRadius", "Landroidx/compose/ui/graphics/Path;", "path", "a", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;)V", "d", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJLandroidx/compose/ui/graphics/Path;FLandroidx/compose/ui/graphics/h;Lcom/google/android/qu0;I)V", "Landroidx/compose/ui/graphics/n;", "getOutline", "()Landroidx/compose/ui/graphics/n;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/h;", "shadowTint", "J", "shadowTintColor", "f", "generatedSize", "Landroidx/compose/ui/unit/LayoutDirection;", "g", "Landroidx/compose/ui/unit/LayoutDirection;", "generatedLayoutDirection", "h", "F", "generatedDensity", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class tkb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final n outline;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Path path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private h shadowTint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long shadowTintColor = ei1.INSTANCE.i();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long cornerRadius = aa2.INSTANCE.a();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long generatedSize = tsb.INSTANCE.a();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private LayoutDirection generatedLayoutDirection = LayoutDirection.Ltr;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float generatedDensity = 1.0f;

    public tkb(n nVar) {
        this.outline = nVar;
    }

    private final h c(long color) {
        h hVar = this.shadowTint;
        if (hVar != null && ei1.r(this.shadowTintColor, color)) {
            return hVar;
        }
        h hVarC = h.Companion.c(h.INSTANCE, color, 0, 2, null);
        this.shadowTintColor = color;
        this.shadowTint = hVarC;
        return hVarC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void e(n outline) throws NoWhenBranchMatchedException {
        if (outline instanceof n.a) {
            this.path = ((n.a) outline).getPath();
            this.cornerRadius = aa2.INSTANCE.a();
            return;
        }
        if (!(outline instanceof n.c)) {
            if (!(outline instanceof n.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.path = null;
            this.cornerRadius = aa2.INSTANCE.a();
            return;
        }
        n.c cVar = (n.c) outline;
        if (eqa.g(cVar.getRoundRect())) {
            this.path = null;
            this.cornerRadius = cVar.getRoundRect().getTopLeftCornerRadius();
        } else {
            this.path = cVar.getRoundRectPath();
            this.cornerRadius = aa2.INSTANCE.a();
        }
    }

    protected abstract void a(DrawScope drawScope, long j, long j2, Path path);

    public final void b(DrawScope drawScope, h hVar, long j, long j2, qu0 qu0Var, float f, int i) {
        e(this.outline);
        if (hVar == null) {
            hVar = (qu0Var != null || j2 == 16) ? null : c(j2);
        }
        h hVar2 = hVar;
        long j3 = this.generatedSize;
        if (j3 == 9205357640488583168L || !tsb.h(j3, j) || this.generatedLayoutDirection != drawScope.getLayoutDirection() || this.generatedDensity != drawScope.getDensity()) {
            a(drawScope, j, this.cornerRadius, this.path);
            this.generatedSize = j;
            this.generatedLayoutDirection = drawScope.getLayoutDirection();
            this.generatedDensity = drawScope.getDensity();
        }
        d(drawScope, j, this.cornerRadius, this.path, f, hVar2, qu0Var, i);
    }

    protected abstract void d(DrawScope drawScope, long j, long j2, Path path, float f, h hVar, qu0 qu0Var, int i);
}
