package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.n;
import androidx.compose.ui.graphics.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/n;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "tmpOpPath", "", "b", "(Landroidx/compose/ui/graphics/n;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Lcom/google/android/gba;", "rect", "e", "(Lcom/google/android/gba;FF)Z", "Landroidx/compose/ui/graphics/n$c;", "touchPointPath", "opPath", "f", "(Landroidx/compose/ui/graphics/n$c;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Lcom/google/android/dqa;", "a", "(Lcom/google/android/dqa;)Z", "Lcom/google/android/aa2;", "cornerRadius", "centerX", "centerY", "g", "(FFJFF)Z", "path", "d", "(Landroidx/compose/ui/graphics/Path;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class alb {
    private static final boolean a(dqa dqaVar) {
        return Float.intBitsToFloat((int) (dqaVar.getTopLeftCornerRadius() >> 32)) + Float.intBitsToFloat((int) (dqaVar.getTopRightCornerRadius() >> 32)) <= dqaVar.j() && Float.intBitsToFloat((int) (dqaVar.getBottomLeftCornerRadius() >> 32)) + Float.intBitsToFloat((int) (dqaVar.getBottomRightCornerRadius() >> 32)) <= dqaVar.j() && Float.intBitsToFloat((int) (dqaVar.getTopLeftCornerRadius() & 4294967295L)) + Float.intBitsToFloat((int) (dqaVar.getBottomLeftCornerRadius() & 4294967295L)) <= dqaVar.d() && Float.intBitsToFloat((int) (dqaVar.getTopRightCornerRadius() & 4294967295L)) + Float.intBitsToFloat((int) (dqaVar.getBottomRightCornerRadius() & 4294967295L)) <= dqaVar.d();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final boolean b(n nVar, float f, float f2, Path path, Path path2) throws NoWhenBranchMatchedException {
        if (nVar instanceof n.b) {
            return e(((n.b) nVar).b(), f, f2);
        }
        if (nVar instanceof n.c) {
            return f((n.c) nVar, f, f2, path, path2);
        }
        if (nVar instanceof n.a) {
            return d(((n.a) nVar).getPath(), f, f2, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean c(n nVar, float f, float f2, Path path, Path path2, int i, Object obj) {
        if ((i & 8) != 0) {
            path = null;
        }
        if ((i & 16) != 0) {
            path2 = null;
        }
        return b(nVar, f, f2, path, path2);
    }

    private static final boolean d(Path path, float f, float f2, Path path2, Path path3) {
        gba gbaVar = new gba(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = d.a();
        }
        Path.x(path2, gbaVar, null, 2, null);
        if (path3 == null) {
            path3 = d.a();
        }
        path3.y(path, path2, q.INSTANCE.b());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }

    private static final boolean e(gba gbaVar, float f, float f2) {
        return gbaVar.getLeft() <= f && f < gbaVar.getRight() && gbaVar.getTop() <= f2 && f2 < gbaVar.getBottom();
    }

    private static final boolean f(n.c cVar, float f, float f2, Path path, Path path2) {
        dqa roundRect = cVar.getRoundRect();
        if (f < roundRect.getLeft() || f >= roundRect.getRight() || f2 < roundRect.getTop() || f2 >= roundRect.getBottom()) {
            return false;
        }
        if (!a(roundRect)) {
            Path pathA = path2 == null ? d.a() : path2;
            Path.p(pathA, roundRect, null, 2, null);
            return d(pathA, f, f2, path, path2);
        }
        float left = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        float top = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() & 4294967295L));
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() >> 32));
        float top2 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() & 4294967295L));
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() & 4294967295L));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (4294967295L & roundRect.getBottomLeftCornerRadius()));
        float left2 = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        if (f < left && f2 < top) {
            return g(f, f2, roundRect.getTopLeftCornerRadius(), left, top);
        }
        if (f < left2 && f2 > bottom2) {
            return g(f, f2, roundRect.getBottomLeftCornerRadius(), left2, bottom2);
        }
        if (f > right && f2 < top2) {
            return g(f, f2, roundRect.getTopRightCornerRadius(), right, top2);
        }
        if (f <= right2 || f2 <= bottom) {
            return true;
        }
        return g(f, f2, roundRect.getBottomRightCornerRadius(), right2, bottom);
    }

    private static final boolean g(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
