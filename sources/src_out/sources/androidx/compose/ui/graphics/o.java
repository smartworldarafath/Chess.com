package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.inputmethod.aa2;
import com.google.inputmethod.dqa;
import com.google.inputmethod.gba;
import com.google.inputmethod.qu0;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tsb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aK\u0010\u0011\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001aK\u0010\u0015\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u0013\u0010\u001e\u001a\u00020\u0018*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u001b*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/n;", "outline", "", "a", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/n;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lcom/google/android/ei1;", "color", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/b;", "style", "Landroidx/compose/ui/graphics/h;", "colorFilter", "Landroidx/compose/ui/graphics/e;", "blendMode", "d", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/n;JFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/qu0;", "brush", "b", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/n;Lcom/google/android/qu0;FLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/gba;", "Lcom/google/android/rn8;", "h", "(Lcom/google/android/gba;)J", "Lcom/google/android/tsb;", "f", "Lcom/google/android/dqa;", "i", "(Lcom/google/android/dqa;)J", "g", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(Path path, n nVar) throws NoWhenBranchMatchedException {
        if (nVar instanceof n.b) {
            Path.x(path, ((n.b) nVar).b(), null, 2, null);
        } else if (nVar instanceof n.c) {
            Path.p(path, ((n.c) nVar).getRoundRect(), null, 2, null);
        } else {
            if (!(nVar instanceof n.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Path.n(path, ((n.a) nVar).getPath(), 0L, 2, null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(DrawScope drawScope, n nVar, qu0 qu0Var, float f, androidx.compose.ui.graphics.drawscope.b bVar, h hVar, int i) throws NoWhenBranchMatchedException {
        if (nVar instanceof n.b) {
            gba gbaVarB = ((n.b) nVar).b();
            drawScope.l1(qu0Var, h(gbaVarB), f(gbaVarB), f, bVar, hVar, i);
            return;
        }
        if (!(nVar instanceof n.c)) {
            if (!(nVar instanceof n.a)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.D1(((n.a) nVar).getPath(), qu0Var, f, bVar, hVar, i);
            return;
        }
        n.c cVar = (n.c) nVar;
        Path roundRectPath = cVar.getRoundRectPath();
        if (roundRectPath != null) {
            drawScope.D1(roundRectPath, qu0Var, f, bVar, hVar, i);
            return;
        }
        dqa roundRect = cVar.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        drawScope.j2(qu0Var, i(roundRect), g(roundRect), aa2.b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), f, bVar, hVar, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static /* synthetic */ void c(DrawScope drawScope, n nVar, qu0 qu0Var, float f, androidx.compose.ui.graphics.drawscope.b bVar, h hVar, int i, int i2, Object obj) throws NoWhenBranchMatchedException {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            bVar = androidx.compose.ui.graphics.drawscope.c.b;
        }
        androidx.compose.ui.graphics.drawscope.b bVar2 = bVar;
        if ((i2 & 16) != 0) {
            hVar = null;
        }
        h hVar2 = hVar;
        if ((i2 & 32) != 0) {
            i = DrawScope.INSTANCE.a();
        }
        b(drawScope, nVar, qu0Var, f2, bVar2, hVar2, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(DrawScope drawScope, n nVar, long j, float f, androidx.compose.ui.graphics.drawscope.b bVar, h hVar, int i) throws NoWhenBranchMatchedException {
        if (nVar instanceof n.b) {
            gba gbaVarB = ((n.b) nVar).b();
            drawScope.k2(j, h(gbaVarB), f(gbaVarB), f, bVar, hVar, i);
            return;
        }
        if (!(nVar instanceof n.c)) {
            if (!(nVar instanceof n.a)) {
                throw new NoWhenBranchMatchedException();
            }
            drawScope.C0(((n.a) nVar).getPath(), j, f, bVar, hVar, i);
            return;
        }
        n.c cVar = (n.c) nVar;
        Path roundRectPath = cVar.getRoundRectPath();
        if (roundRectPath != null) {
            drawScope.C0(roundRectPath, j, f, bVar, hVar, i);
            return;
        }
        dqa roundRect = cVar.getRoundRect();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        drawScope.S1(j, i(roundRect), g(roundRect), aa2.b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), bVar, f, hVar, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static /* synthetic */ void e(DrawScope drawScope, n nVar, long j, float f, androidx.compose.ui.graphics.drawscope.b bVar, h hVar, int i, int i2, Object obj) throws NoWhenBranchMatchedException {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            bVar = androidx.compose.ui.graphics.drawscope.c.b;
        }
        androidx.compose.ui.graphics.drawscope.b bVar2 = bVar;
        if ((i2 & 16) != 0) {
            hVar = null;
        }
        d(drawScope, nVar, j, f2, bVar2, hVar, (i2 & 32) != 0 ? DrawScope.INSTANCE.a() : i);
    }

    private static final long f(gba gbaVar) {
        float right = gbaVar.getRight() - gbaVar.getLeft();
        return tsb.d((((long) Float.floatToRawIntBits(gbaVar.getBottom() - gbaVar.getTop())) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    private static final long g(dqa dqaVar) {
        float fJ = dqaVar.j();
        float fD = dqaVar.d();
        return tsb.d((((long) Float.floatToRawIntBits(fJ)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
    }

    private static final long h(gba gbaVar) {
        float left = gbaVar.getLeft();
        float top = gbaVar.getTop();
        return rn8.e((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
    }

    private static final long i(dqa dqaVar) {
        float left = dqaVar.getLeft();
        float top = dqaVar.getTop();
        return rn8.e((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
    }
}
