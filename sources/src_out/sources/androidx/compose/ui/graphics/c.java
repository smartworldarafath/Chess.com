package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.inputmethod.dqa;
import com.google.inputmethod.gba;
import com.google.inputmethod.wl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ/\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001aJ/\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u001aJ?\u0010$\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%J?\u0010(\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010%J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010,J\u001f\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\b2\u0006\u00103\u001a\u00020\u00012\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u00109J\u0017\u0010<\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ'\u0010\r\u001a\u00020H2\u0006\u0010D\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u00012\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\b\r\u0010IR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010]\u001a\u00020W2\u0006\u0010X\u001a\u00020W8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010a\u001a\u00020H8VX\u0096\u0004¢\u0006\f\u0012\u0004\b`\u00109\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010_¨\u0006c"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Lcom/google/android/gba;", "rect", "", "B", "(Lcom/google/android/gba;)V", "", "x", "y", "b", "(FF)V", "dx", "dy", "f", "c", "z", "x1", "y1", "x2", "y2", "r", "(FFFF)V", "v", "dx1", "dy1", "dx2", "dy2", "h", "j", "x3", "y3", "d", "(FFFFFF)V", "dx3", "dy3", "g", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "t", "(Lcom/google/android/gba;Landroidx/compose/ui/graphics/Path$Direction;)V", "oval", "s", "Lcom/google/android/dqa;", "roundRect", "l", "(Lcom/google/android/dqa;Landroidx/compose/ui/graphics/Path$Direction;)V", "path", "Lcom/google/android/rn8;", "offset", "o", "(Landroidx/compose/ui/graphics/Path;J)V", "close", "()V", "reset", "rewind", "i", "(J)V", "Lcom/google/android/zh7;", "matrix", "a", "([F)V", "getBounds", "()Lcom/google/android/gba;", "path1", "path2", "Landroidx/compose/ui/graphics/q;", "operation", "", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "Landroid/graphics/Path;", "A", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "e", "Landroid/graphics/Matrix;", "mMatrix", "Landroidx/compose/ui/graphics/p;", "value", "m", "()I", "u", "(I)V", "fillType", "q", "()Z", "isConvex$annotations", "isConvex", "isEmpty", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements Path {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final android.graphics.Path internalPath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private RectF rectF;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float[] radii;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Matrix mMatrix;

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        android.graphics.Path path = null;
        this(path, 1, path);
    }

    private final void B(gba rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            d.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    public void a(float[] matrix) {
        if (this.mMatrix == null) {
            this.mMatrix = new Matrix();
        }
        Matrix matrix2 = this.mMatrix;
        Intrinsics.g(matrix2);
        wl.a(matrix2, matrix);
        android.graphics.Path path = this.internalPath;
        Matrix matrix3 = this.mMatrix;
        Intrinsics.g(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void b(float x, float y) {
        this.internalPath.moveTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void c(float x, float y) {
        this.internalPath.lineTo(x, y);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void d(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.internalPath.cubicTo(x1, y1, x2, y2, x3, y3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void f(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void g(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public gba getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.g(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new gba(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void h(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void i(long offset) {
        Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new Matrix();
        } else {
            Intrinsics.g(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.mMatrix;
        Intrinsics.g(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
        android.graphics.Path path = this.internalPath;
        Matrix matrix3 = this.mMatrix;
        Intrinsics.g(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void j(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void l(dqa roundRect, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.g(rectF);
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        Intrinsics.g(fArr);
        fArr[0] = Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() & 4294967295L));
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.g(rectF2);
        float[] fArr2 = this.radii;
        Intrinsics.g(fArr2);
        path.addRoundRect(rectF2, fArr2, d.e(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public int m() {
        return this.internalPath.getFillType() == android.graphics.Path.FillType.EVEN_ODD ? p.INSTANCE.a() : p.INSTANCE.b();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void o(Path path, long offset) {
        android.graphics.Path path2 = this.internalPath;
        if (!(path instanceof c)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((c) path).getInternalPath(), Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean q() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void r(float x1, float y1, float x2, float y2) {
        this.internalPath.quadTo(x1, y1, x2, y2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void s(gba oval, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.g(rectF);
        rectF.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.g(rectF2);
        path.addOval(rectF2, d.e(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void t(gba rect, Path.Direction direction) {
        B(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.g(rectF);
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.g(rectF2);
        path.addRect(rectF2, d.e(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void u(int i) {
        this.internalPath.setFillType(p.d(i, p.INSTANCE.a()) ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void v(float x1, float y1, float x2, float y2) {
        this.internalPath.quadTo(x1, y1, x2, y2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean y(Path path1, Path path2, int operation) {
        android.graphics.Path.Op op;
        q.Companion companion = q.INSTANCE;
        if (q.f(operation, companion.a())) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (q.f(operation, companion.b())) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (q.f(operation, companion.c())) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = q.f(operation, companion.d()) ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        android.graphics.Path path = this.internalPath;
        if (!(path1 instanceof c)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((c) path1).getInternalPath();
        if (path2 instanceof c) {
            return path.op(internalPath, ((c) path2).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void z(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    public c(android.graphics.Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ c(android.graphics.Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.graphics.Path() : path);
    }
}
