package com.google.inputmethod;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0016H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\rH&¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J'\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020\t2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b3\u0010\u000bJ)\u00109\u001a\u0002082\u0006\u00104\u001a\u0002002\u0006\u00106\u001a\u0002052\b\b\u0001\u00107\u001a\u00020\u0002H&¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0002002\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b;\u0010<JO\u0010I\u001a\u0002082\u0006\u0010>\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020?2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010H\u001a\u00020GH&¢\u0006\u0004\bI\u0010JJW\u0010N\u001a\u0002082\u0006\u0010>\u001a\u00020=2\u0006\u0010L\u001a\u00020K2\b\b\u0002\u0010M\u001a\u00020\r2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010H\u001a\u00020GH&¢\u0006\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010V\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR\u0014\u0010X\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010QR\u0014\u0010Z\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010QR\u0014\u0010\\\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010QR\u0014\u0010_\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001c\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0c8&X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0001\u0001gø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006hÀ\u0006\u0003"}, d2 = {"Lcom/google/android/b19;", "", "", "start", "end", "Landroidx/compose/ui/graphics/Path;", "w", "(II)Landroidx/compose/ui/graphics/Path;", "offset", "Lcom/google/android/gba;", "r", "(I)Lcom/google/android/gba;", "lineIndex", "", "m", "(I)F", "u", "d", "o", "k", "h", "(I)I", "", "visibleEnd", "i", "(IZ)I", "s", "(I)Z", "A", "usePrimaryDirection", "x", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "c", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "B", "vertical", "l", "(F)I", "Lcom/google/android/rn8;", "position", "g", "(J)I", "rect", "Lcom/google/android/jwc;", "granularity", "Lcom/google/android/nwc;", "inclusionStrategy", "Landroidx/compose/ui/text/x;", "p", "(Lcom/google/android/gba;ILcom/google/android/nwc;)J", "C", "range", "", "array", "arrayStart", "", "n", "(J[FI)V", "e", "(I)J", "Lcom/google/android/w41;", "canvas", "Lcom/google/android/ei1;", "color", "Lcom/google/android/nkb;", "shadow", "Lcom/google/android/wrc;", "textDecoration", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "Landroidx/compose/ui/graphics/e;", "blendMode", "q", "(Lcom/google/android/w41;JLcom/google/android/nkb;Lcom/google/android/wrc;Landroidx/compose/ui/graphics/drawscope/b;I)V", "Lcom/google/android/qu0;", "brush", "alpha", "j", "(Lcom/google/android/w41;Lcom/google/android/qu0;FLcom/google/android/nkb;Lcom/google/android/wrc;Landroidx/compose/ui/graphics/drawscope/b;I)V", "getWidth", "()F", "width", "getHeight", "height", "a", "minIntrinsicWidth", "b", "maxIntrinsicWidth", "f", "firstBaseline", "z", "lastBaseline", "v", "()Z", "didExceedMaxLines", "t", "()I", "lineCount", "", "D", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/a;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b19 {
    static /* synthetic */ void E(b19 b19Var, w41 w41Var, long j, Shadow nkbVar, wrc wrcVar, b bVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        b19Var.q(w41Var, (i2 & 2) != 0 ? ei1.INSTANCE.i() : j, (i2 & 4) != 0 ? null : nkbVar, (i2 & 8) != 0 ? null : wrcVar, (i2 & 16) == 0 ? bVar : null, (i2 & 32) != 0 ? DrawScope.INSTANCE.a() : i);
    }

    static /* synthetic */ void y(b19 b19Var, w41 w41Var, qu0 qu0Var, float f, Shadow nkbVar, wrc wrcVar, b bVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i2 & 4) != 0) {
            f = Float.NaN;
        }
        b19Var.j(w41Var, qu0Var, f, (i2 & 8) != 0 ? null : nkbVar, (i2 & 16) != 0 ? null : wrcVar, (i2 & 32) != 0 ? null : bVar, (i2 & 64) != 0 ? DrawScope.INSTANCE.a() : i);
    }

    int A(int offset);

    ResolvedTextDirection B(int offset);

    gba C(int offset);

    List<gba> D();

    float a();

    float b();

    ResolvedTextDirection c(int offset);

    float d(int lineIndex);

    long e(int offset);

    float f();

    int g(long position);

    float getHeight();

    float getWidth();

    int h(int lineIndex);

    int i(int lineIndex, boolean visibleEnd);

    void j(w41 canvas, qu0 brush, float alpha, Shadow shadow, wrc textDecoration, b drawStyle, int blendMode);

    float k(int lineIndex);

    int l(float vertical);

    float m(int lineIndex);

    void n(long range, float[] array, int arrayStart);

    float o(int lineIndex);

    long p(gba rect, int granularity, nwc inclusionStrategy);

    void q(w41 canvas, long color, Shadow shadow, wrc textDecoration, b drawStyle, int blendMode);

    gba r(int offset);

    boolean s(int lineIndex);

    int t();

    float u(int lineIndex);

    boolean v();

    Path w(int start, int end);

    float x(int offset, boolean usePrimaryDirection);

    float z();
}
