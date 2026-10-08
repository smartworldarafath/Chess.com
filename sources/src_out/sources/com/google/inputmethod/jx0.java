package com.google.inputmethod;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\u000f\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/drawscope/b;", "value", "", "f", "(Landroid/graphics/Paint;Landroidx/compose/ui/graphics/drawscope/b;)V", "Landroidx/compose/ui/graphics/n;", "Landroid/graphics/Canvas;", "canvas", "paint", "", "xStart", "yCenter", "", "dir", "d", "(Landroidx/compose/ui/graphics/n;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V", "Lcom/google/android/qu0;", "brush", "alpha", "Lcom/google/android/tsb;", "size", "Lkotlin/Function0;", "draw", "e", "(Landroid/graphics/Paint;Lcom/google/android/qu0;FJLkotlin/jvm/functions/Function0;)V", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class jx0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(n nVar, Canvas canvas, Paint paint, float f, float f2, int i) throws NoWhenBranchMatchedException {
        if (nVar instanceof n.a) {
            canvas.save();
            n.a aVar = (n.a) nVar;
            gba rect = aVar.getRect();
            canvas.translate(f, f2 - ((rect.getBottom() - rect.getTop()) / 2.0f));
            Path path = aVar.getPath();
            if (!(path instanceof c)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((c) path).getInternalPath(), paint);
            canvas.restore();
            return;
        }
        if (!(nVar instanceof n.c)) {
            if (!(nVar instanceof n.b)) {
                throw new NoWhenBranchMatchedException();
            }
            n.b bVar = (n.b) nVar;
            gba gbaVarB = bVar.b();
            float bottom = f2 - ((gbaVarB.getBottom() - gbaVarB.getTop()) / 2.0f);
            gba gbaVarB2 = bVar.b();
            float right = f + (i * (gbaVarB2.getRight() - gbaVarB2.getLeft()));
            gba gbaVarB3 = bVar.b();
            canvas.drawRect(f, bottom, right, f2 + ((gbaVarB3.getBottom() - gbaVarB3.getTop()) / 2.0f), paint);
            return;
        }
        n.c cVar = (n.c) nVar;
        if (eqa.g(cVar.getRoundRect())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.getRoundRect().getTopLeftCornerRadius() >> 32));
            canvas.drawRoundRect(f, f2 - (cVar.getRoundRect().d() / 2.0f), (i * cVar.getRoundRect().j()) + f, (cVar.getRoundRect().d() / 2.0f) + f2, fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        Path pathA = d.a();
        Path.p(pathA, cVar.getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(f, f2 - (cVar.getRoundRect().d() / 2.0f));
        if (!(pathA instanceof c)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((c) pathA).getInternalPath(), paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(Paint paint, qu0 qu0Var, float f, long j, Function0<Unit> function0) throws NoWhenBranchMatchedException {
        Integer numValueOf = null;
        if (qu0Var == null) {
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            function0.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (qu0Var instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f * 255.0f));
            }
            paint.setColor(ki1.j(((SolidColor) qu0Var).getValue()));
            function0.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (!(qu0Var instanceof jkb)) {
            throw new NoWhenBranchMatchedException();
        }
        Shader shader = paint.getShader();
        if (!Float.isNaN(f)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(f * 255.0f));
        }
        paint.setShader(((jkb) qu0Var).b(j));
        function0.invoke();
        paint.setShader(shader);
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(Paint paint, b bVar) throws NoWhenBranchMatchedException {
        if (Intrinsics.e(bVar, androidx.compose.ui.graphics.drawscope.c.b)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (!(bVar instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        paint.setStyle(Paint.Style.STROKE);
        Stroke stroke = (Stroke) bVar;
        paint.setStrokeWidth(stroke.getWidth());
        paint.setStrokeMiter(stroke.getMiter());
        paint.setStrokeCap(dh3.a(stroke.getCap()));
        paint.setStrokeJoin(dh3.b(stroke.getJoin()));
        f39 pathEffect = stroke.getPathEffect();
        paint.setPathEffect(pathEffect != null ? mm.c(pathEffect) : null);
    }
}
