package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.graphics.q;
import androidx.compose.ui.graphics.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a;\u0010\u001d\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a/\u0010$\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b'\u0010(\u001a\u001b\u0010+\u001a\u00020)*\u00020)2\u0006\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/or0;", "border", "Lcom/google/android/xkb;", "shape", "g", "(Landroidx/compose/ui/b;Lcom/google/android/or0;Lcom/google/android/xkb;)Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "width", "Lcom/google/android/ei1;", "color", "h", "(Landroidx/compose/ui/b;FJLcom/google/android/xkb;)Landroidx/compose/ui/b;", "Lcom/google/android/qu0;", "brush", "j", "(Landroidx/compose/ui/b;FLcom/google/android/qu0;Lcom/google/android/xkb;)Landroidx/compose/ui/b;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Lcom/google/android/ah3;", "m", "(Landroidx/compose/ui/draw/CacheDrawScope;)Lcom/google/android/ah3;", "Lcom/google/android/rn8;", "topLeft", "Lcom/google/android/tsb;", "borderSize", "", "fillArea", "", "strokeWidthPx", "o", "(Landroidx/compose/ui/draw/CacheDrawScope;Lcom/google/android/qu0;JJZF)Lcom/google/android/ah3;", "Landroidx/compose/ui/graphics/Path;", "targetPath", "Lcom/google/android/dqa;", "roundedRect", "strokeWidth", "l", "(Landroidx/compose/ui/graphics/Path;Lcom/google/android/dqa;FZ)Landroidx/compose/ui/graphics/Path;", "widthPx", "k", "(FLcom/google/android/dqa;)Lcom/google/android/dqa;", "Lcom/google/android/aa2;", "value", "q", "(JF)J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class gr0 {
    public static final b g(b bVar, BorderStroke borderStroke, xkb xkbVar) {
        return j(bVar, borderStroke.getWidth(), borderStroke.getBrush(), xkbVar);
    }

    public static final b h(b bVar, float f, long j, xkb xkbVar) {
        return j(bVar, f, new SolidColor(j, null), xkbVar);
    }

    public static /* synthetic */ b i(b bVar, float f, long j, xkb xkbVar, int i, Object obj) {
        if ((i & 4) != 0) {
            xkbVar = r.a();
        }
        return h(bVar, f, j, xkbVar);
    }

    public static final b j(b bVar, float f, qu0 qu0Var, xkb xkbVar) {
        return bVar.then(new BorderModifierNodeElement(f, qu0Var, xkbVar, null));
    }

    private static final dqa k(float f, dqa dqaVar) {
        return new dqa(f, f, dqaVar.j() - f, dqaVar.d() - f, q(dqaVar.getTopLeftCornerRadius(), f), q(dqaVar.getTopRightCornerRadius(), f), q(dqaVar.getBottomRightCornerRadius(), f), q(dqaVar.getBottomLeftCornerRadius(), f), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path l(Path path, dqa dqaVar, float f, boolean z) {
        path.reset();
        Path.p(path, dqaVar, null, 2, null);
        if (!z) {
            Path pathA = d.a();
            Path.p(pathA, k(f, dqaVar), null, 2, null);
            path.y(path, pathA, q.INSTANCE.a());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ah3 m(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.j(new Function1() { // from class: com.google.android.fr0
            public final Object invoke(Object obj) {
                return gr0.n((fz1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(fz1 fz1Var) {
        fz1Var.j1();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ah3 o(CacheDrawScope cacheDrawScope, final qu0 qu0Var, long j, long j2, boolean z, float f) {
        final long jC = z ? rn8.INSTANCE.c() : j;
        final long jD = z ? cacheDrawScope.d() : j2;
        final androidx.compose.ui.graphics.drawscope.b stroke = z ? c.b : new Stroke(f, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.j(new Function1() { // from class: com.google.android.er0
            public final Object invoke(Object obj) {
                return gr0.p(qu0Var, jC, jD, stroke, (fz1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(qu0 qu0Var, long j, long j2, androidx.compose.ui.graphics.drawscope.b bVar, fz1 fz1Var) {
        fz1Var.j1();
        DrawScope.U0(fz1Var, qu0Var, j, j2, 0.0f, bVar, null, 0, 104, null);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long q(long j, float f) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return aa2.b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L));
    }
}
