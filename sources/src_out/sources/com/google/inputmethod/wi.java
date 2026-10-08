package com.google.inputmethod;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u00020(*\u00020 ¢\u0006\u0004\b)\u0010*J'\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J7\u00100\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101JG\u00104\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105J7\u00106\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00101J'\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b9\u0010:JO\u0010?\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\r2\u0006\u0010>\u001a\u00020=2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bA\u0010BJ'\u0010F\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010GJ?\u0010N\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020H2\u0006\u0010M\u001a\u00020J2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010\u0003J\u000f\u0010Q\u001a\u00020\u0004H\u0016¢\u0006\u0004\bQ\u0010\u0003R(\u0010Y\u001a\u00020R8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bX\u0010\u0003\u001a\u0004\bS\u0010U\"\u0004\bV\u0010WR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010[¨\u0006^"}, d2 = {"Lcom/google/android/wi;", "Lcom/google/android/w41;", "<init>", "()V", "", "v", "o", "Lcom/google/android/gba;", "bounds", "Lcom/google/android/q09;", "paint", "u", "(Lcom/google/android/gba;Lcom/google/android/q09;)V", "", "dx", "dy", "c", "(FF)V", "sx", "sy", "l", "degrees", "t", "(F)V", "Lcom/google/android/zh7;", "matrix", "x", "([F)V", "left", "top", "right", "bottom", "Lcom/google/android/gf1;", "clipOp", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", "path", "e", "(Landroidx/compose/ui/graphics/Path;I)V", "Landroid/graphics/Region$Op;", "B", "(I)Landroid/graphics/Region$Op;", "Lcom/google/android/rn8;", "p1", "p2", "s", "(JJLcom/google/android/q09;)V", "g", "(FFFFLcom/google/android/q09;)V", "radiusX", "radiusY", "A", "(FFFFFFLcom/google/android/q09;)V", "h", "center", "radius", "z", "(JFLcom/google/android/q09;)V", "startAngle", "sweepAngle", "", "useCenter", "q", "(FFFFFFZLcom/google/android/q09;)V", "y", "(Landroidx/compose/ui/graphics/Path;Lcom/google/android/q09;)V", "Lcom/google/android/ml5;", "image", "topLeftOffset", "f", "(Lcom/google/android/ml5;JLcom/google/android/q09;)V", "Lcom/google/android/g16;", "srcOffset", "Lcom/google/android/q16;", "srcSize", "dstOffset", "dstSize", "m", "(Lcom/google/android/ml5;JJJJLcom/google/android/q09;)V", "r", "j", "Landroid/graphics/Canvas;", "a", "Landroid/graphics/Canvas;", "()Landroid/graphics/Canvas;", "d", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wi implements w41 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Canvas internalCanvas = xi.a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Rect srcRect;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Rect dstRect;

    @Override // com.google.inputmethod.w41
    public void A(float left, float top, float right, float bottom, float radiusX, float radiusY, q09 paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, dm.f(paint));
    }

    public final Region.Op B(int i) {
        return gf1.d(i, gf1.INSTANCE.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // com.google.inputmethod.w41
    public void b(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, B(clipOp));
    }

    @Override // com.google.inputmethod.w41
    public void c(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    public final void d(Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // com.google.inputmethod.w41
    public void e(Path path, int clipOp) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof c)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((c) path).getInternalPath(), B(clipOp));
    }

    @Override // com.google.inputmethod.w41
    public void f(ml5 image, long topLeftOffset, q09 paint) {
        this.internalCanvas.drawBitmap(cl.b(image), Float.intBitsToFloat((int) (topLeftOffset >> 32)), Float.intBitsToFloat((int) (topLeftOffset & 4294967295L)), dm.f(paint));
    }

    @Override // com.google.inputmethod.w41
    public void g(float left, float top, float right, float bottom, q09 paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, dm.f(paint));
    }

    @Override // com.google.inputmethod.w41
    public void h(float left, float top, float right, float bottom, q09 paint) {
        this.internalCanvas.drawOval(left, top, right, bottom, dm.f(paint));
    }

    @Override // com.google.inputmethod.w41
    public void j() {
        w51.a.a(this.internalCanvas, false);
    }

    @Override // com.google.inputmethod.w41
    public void l(float sx, float sy) {
        this.internalCanvas.scale(sx, sy);
    }

    @Override // com.google.inputmethod.w41
    public void m(ml5 image, long srcOffset, long srcSize, long dstOffset, long dstSize, q09 paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        Canvas canvas = this.internalCanvas;
        Bitmap bitmapB = cl.b(image);
        Rect rect = this.srcRect;
        Intrinsics.g(rect);
        rect.left = g16.k(srcOffset);
        rect.top = g16.l(srcOffset);
        rect.right = g16.k(srcOffset) + ((int) (srcSize >> 32));
        rect.bottom = g16.l(srcOffset) + ((int) (srcSize & 4294967295L));
        Unit unit = Unit.a;
        Rect rect2 = this.dstRect;
        Intrinsics.g(rect2);
        rect2.left = g16.k(dstOffset);
        rect2.top = g16.l(dstOffset);
        rect2.right = g16.k(dstOffset) + ((int) (dstSize >> 32));
        rect2.bottom = g16.l(dstOffset) + ((int) (dstSize & 4294967295L));
        canvas.drawBitmap(bitmapB, rect, rect2, dm.f(paint));
    }

    @Override // com.google.inputmethod.w41
    public void o() {
        this.internalCanvas.restore();
    }

    @Override // com.google.inputmethod.w41
    public void q(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, q09 paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, dm.f(paint));
    }

    @Override // com.google.inputmethod.w41
    public void r() {
        w51.a.a(this.internalCanvas, true);
    }

    @Override // com.google.inputmethod.w41
    public void s(long p1, long p2, q09 paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (p1 >> 32)), Float.intBitsToFloat((int) (p1 & 4294967295L)), Float.intBitsToFloat((int) (p2 >> 32)), Float.intBitsToFloat((int) (p2 & 4294967295L)), dm.f(paint));
    }

    @Override // com.google.inputmethod.w41
    public void t(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // com.google.inputmethod.w41
    public void u(gba bounds, q09 paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), dm.f(paint), 31);
    }

    @Override // com.google.inputmethod.w41
    public void v() {
        this.internalCanvas.save();
    }

    @Override // com.google.inputmethod.w41
    public void x(float[] matrix) {
        if (bi7.a(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        wl.a(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // com.google.inputmethod.w41
    public void y(Path path, q09 paint) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof c)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((c) path).getInternalPath(), dm.f(paint));
    }

    @Override // com.google.inputmethod.w41
    public void z(long center, float radius, q09 paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (center >> 32)), Float.intBitsToFloat((int) (center & 4294967295L)), radius, dm.f(paint));
    }
}
