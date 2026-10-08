package androidx.compose.ui.graphics;

import com.google.android.r43;
import com.google.inputmethod.dqa;
import com.google.inputmethod.gba;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000 :2\u00020\u0001:\u0002Q:J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J/\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0012J/\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0012J?\u0010\u001c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010 \u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u001dJ!\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b(\u0010&J!\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010$\u001a\u00020#H&¢\u0006\u0004\b+\u0010,J!\u00100\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0005H&¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0005H&¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u00103J\u0017\u00106\u001a\u00020\u00052\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\u00052\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020!H&¢\u0006\u0004\b<\u0010=J'\u0010\u0004\u001a\u00020B2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@H&¢\u0006\u0004\b\u0004\u0010CJ\u0018\u0010D\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\bF\u0010ER\u001c\u0010L\u001a\u00020G8&@&X¦\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006RÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "", "x", "y", "", "b", "(FF)V", "dx", "dy", "f", "c", "z", "x1", "y1", "x2", "y2", "r", "(FFFF)V", "v", "dx1", "dy1", "dx2", "dy2", "h", "j", "x3", "y3", "d", "(FFFFFF)V", "dx3", "dy3", "g", "Lcom/google/android/gba;", "rect", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "t", "(Lcom/google/android/gba;Landroidx/compose/ui/graphics/Path$Direction;)V", "oval", "s", "Lcom/google/android/dqa;", "roundRect", "l", "(Lcom/google/android/dqa;Landroidx/compose/ui/graphics/Path$Direction;)V", "path", "Lcom/google/android/rn8;", "offset", "o", "(Landroidx/compose/ui/graphics/Path;J)V", "close", "()V", "reset", "rewind", "i", "(J)V", "Lcom/google/android/zh7;", "matrix", "a", "([F)V", "getBounds", "()Lcom/google/android/gba;", "path1", "path2", "Landroidx/compose/ui/graphics/q;", "operation", "", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "e", "(Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "k", "Landroidx/compose/ui/graphics/p;", "m", "()I", "u", "(I)V", "fillType", "q", "()Z", "isConvex", "isEmpty", "Direction", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Path {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Direction {
        CounterClockwise,
        Clockwise;

        private static final /* synthetic */ EnumEntries d = kotlin.enums.a.a(a());
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.Path$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Path$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ void n(Path path, Path path2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = rn8.INSTANCE.c();
        }
        path.o(path2, j);
    }

    static /* synthetic */ void p(Path path, dqa dqaVar, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.l(dqaVar, direction);
    }

    static /* synthetic */ void w(Path path, gba gbaVar, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.s(gbaVar, direction);
    }

    static /* synthetic */ void x(Path path, gba gbaVar, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.t(gbaVar, direction);
    }

    default void a(float[] matrix) {
    }

    void b(float x, float y);

    void c(float x, float y);

    void close();

    void d(float x1, float y1, float x2, float y2, float x3, float y3);

    default Path e(Path path) {
        Path pathA = d.a();
        pathA.y(this, path, q.INSTANCE.d());
        return pathA;
    }

    void f(float dx, float dy);

    void g(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    gba getBounds();

    @r43
    void h(float dx1, float dy1, float dx2, float dy2);

    void i(long offset);

    boolean isEmpty();

    default void j(float dx1, float dy1, float dx2, float dy2) {
        h(dx1, dy1, dx2, dy2);
    }

    default Path k(Path path) {
        Path pathA = d.a();
        pathA.y(this, path, q.INSTANCE.b());
        return pathA;
    }

    void l(dqa roundRect, Direction direction);

    int m();

    void o(Path path, long offset);

    boolean q();

    @r43
    void r(float x1, float y1, float x2, float y2);

    void reset();

    default void rewind() {
        reset();
    }

    void s(gba oval, Direction direction);

    void t(gba rect, Direction direction);

    void u(int i);

    default void v(float x1, float y1, float x2, float y2) {
        r(x1, y1, x2, y2);
    }

    boolean y(Path path1, Path path2, int operation);

    void z(float dx, float dy);
}
