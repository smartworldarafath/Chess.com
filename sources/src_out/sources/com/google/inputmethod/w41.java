package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH&¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u000bJ7\u00100\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b0\u00101JG\u00104\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b4\u00105J7\u00106\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b6\u00101J'\u00109\u001a\u00020\u00022\u0006\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b9\u0010:JO\u0010?\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\bA\u0010BJ'\u0010F\u001a\u00020\u00022\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\bF\u0010GJG\u0010N\u001a\u00020\u00022\u0006\u0010D\u001a\u00020C2\b\b\u0002\u0010I\u001a\u00020H2\b\b\u0002\u0010K\u001a\u00020J2\b\b\u0002\u0010L\u001a\u00020H2\b\b\u0002\u0010M\u001a\u00020J2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0002H&¢\u0006\u0004\bP\u0010\u0004J\u000f\u0010Q\u001a\u00020\u0002H&¢\u0006\u0004\bQ\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006RÀ\u0006\u0003"}, d2 = {"Lcom/google/android/w41;", "", "", "v", "()V", "o", "Lcom/google/android/gba;", "bounds", "Lcom/google/android/q09;", "paint", "u", "(Lcom/google/android/gba;Lcom/google/android/q09;)V", "", "dx", "dy", "c", "(FF)V", "sx", "sy", "l", "degrees", "t", "(F)V", "Lcom/google/android/zh7;", "matrix", "x", "([F)V", "rect", "Lcom/google/android/gf1;", "clipOp", "w", "(Lcom/google/android/gba;I)V", "left", "top", "right", "bottom", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", "path", "e", "(Landroidx/compose/ui/graphics/Path;I)V", "Lcom/google/android/rn8;", "p1", "p2", "s", "(JJLcom/google/android/q09;)V", "p", "g", "(FFFFLcom/google/android/q09;)V", "radiusX", "radiusY", "A", "(FFFFFFLcom/google/android/q09;)V", "h", "center", "radius", "z", "(JFLcom/google/android/q09;)V", "startAngle", "sweepAngle", "", "useCenter", "q", "(FFFFFFZLcom/google/android/q09;)V", "y", "(Landroidx/compose/ui/graphics/Path;Lcom/google/android/q09;)V", "Lcom/google/android/ml5;", "image", "topLeftOffset", "f", "(Lcom/google/android/ml5;JLcom/google/android/q09;)V", "Lcom/google/android/g16;", "srcOffset", "Lcom/google/android/q16;", "srcSize", "dstOffset", "dstSize", "m", "(Lcom/google/android/ml5;JJJJLcom/google/android/q09;)V", "r", "j", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface w41 {
    static /* synthetic */ void i(w41 w41Var, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 16) != 0) {
            i = gf1.INSTANCE.b();
        }
        w41Var.b(f, f2, f3, f4, i);
    }

    static /* synthetic */ void k(w41 w41Var, Path path, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = gf1.INSTANCE.b();
        }
        w41Var.e(path, i);
    }

    static /* synthetic */ void n(w41 w41Var, gba gbaVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = gf1.INSTANCE.b();
        }
        w41Var.w(gbaVar, i);
    }

    void A(float left, float top, float right, float bottom, float radiusX, float radiusY, q09 paint);

    void b(float left, float top, float right, float bottom, int clipOp);

    void c(float dx, float dy);

    void e(Path path, int clipOp);

    void f(ml5 image, long topLeftOffset, q09 paint);

    void g(float left, float top, float right, float bottom, q09 paint);

    void h(float left, float top, float right, float bottom, q09 paint);

    void j();

    void l(float sx, float sy);

    void m(ml5 image, long srcOffset, long srcSize, long dstOffset, long dstSize, q09 paint);

    void o();

    default void p(gba rect, q09 paint) {
        g(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
    }

    void q(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, q09 paint);

    void r();

    void s(long p1, long p2, q09 paint);

    void t(float degrees);

    void u(gba bounds, q09 paint);

    void v();

    default void w(gba rect, int clipOp) {
        b(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), clipOp);
    }

    void x(float[] matrix);

    void y(Path path, q09 paint);

    void z(long center, float radius, q09 paint);
}
