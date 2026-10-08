package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010.JG\u00101\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u00102J7\u00103\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u0010.J'\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u00020(2\u0006\u00105\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u00107JO\u0010<\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010;\u001a\u00020:2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020(2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010DJ?\u0010K\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020E2\u0006\u0010J\u001a\u00020G2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0004H\u0016¢\u0006\u0004\bM\u0010\u0003J\u000f\u0010N\u001a\u00020\u0004H\u0016¢\u0006\u0004\bN\u0010\u0003¨\u0006O"}, d2 = {"Lcom/google/android/gr3;", "Lcom/google/android/w41;", "<init>", "()V", "", "v", "o", "Lcom/google/android/gba;", "bounds", "Lcom/google/android/q09;", "paint", "u", "(Lcom/google/android/gba;Lcom/google/android/q09;)V", "", "dx", "dy", "c", "(FF)V", "sx", "sy", "l", "degrees", "t", "(F)V", "Lcom/google/android/zh7;", "matrix", "x", "([F)V", "left", "top", "right", "bottom", "Lcom/google/android/gf1;", "clipOp", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", "path", "e", "(Landroidx/compose/ui/graphics/Path;I)V", "Lcom/google/android/rn8;", "p1", "p2", "s", "(JJLcom/google/android/q09;)V", "g", "(FFFFLcom/google/android/q09;)V", "radiusX", "radiusY", "A", "(FFFFFFLcom/google/android/q09;)V", "h", "center", "radius", "z", "(JFLcom/google/android/q09;)V", "startAngle", "sweepAngle", "", "useCenter", "q", "(FFFFFFZLcom/google/android/q09;)V", "y", "(Landroidx/compose/ui/graphics/Path;Lcom/google/android/q09;)V", "Lcom/google/android/ml5;", "image", "topLeftOffset", "f", "(Lcom/google/android/ml5;JLcom/google/android/q09;)V", "Lcom/google/android/g16;", "srcOffset", "Lcom/google/android/q16;", "srcSize", "dstOffset", "dstSize", "m", "(Lcom/google/android/ml5;JJJJLcom/google/android/q09;)V", "r", "j", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gr3 implements w41 {
    public static final gr3 a = new gr3();

    private gr3() {
    }

    @Override // com.google.inputmethod.w41
    public void A(float left, float top, float right, float bottom, float radiusX, float radiusY, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void b(float left, float top, float right, float bottom, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void c(float dx, float dy) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void e(Path path, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void f(ml5 image, long topLeftOffset, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void g(float left, float top, float right, float bottom, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void h(float left, float top, float right, float bottom, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void j() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void l(float sx, float sy) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void m(ml5 image, long srcOffset, long srcSize, long dstOffset, long dstSize, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void q(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void r() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void s(long p1, long p2, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void t(float degrees) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void u(gba bounds, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void v() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void x(float[] matrix) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void y(Path path, q09 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.inputmethod.w41
    public void z(long center, float radius, q09 paint) {
        throw new UnsupportedOperationException();
    }
}
