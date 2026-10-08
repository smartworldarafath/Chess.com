package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import com.google.inputmethod.wl;
import com.google.inputmethod.zh7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/q;", "Landroidx/compose/ui/platform/p;", "Lcom/google/android/zh7;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/View;", "view", "matrix", "", "d", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "other", "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "c", "([FFF)V", "a", "[F", "", "[I", "tmpLocation", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q implements p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float[] tmpMatrix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int[] tmpLocation;

    public /* synthetic */ q(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private final void b(float[] fArr, Matrix matrix) {
        wl.b(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.k(fArr, this.tmpMatrix);
    }

    private final void c(float[] fArr, float f, float f2) {
        AndroidComposeView_androidKt.l(fArr, f, f2, this.tmpMatrix);
    }

    private final void d(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, matrix);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, iArr[0], iArr[1]);
        }
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        b(matrix, matrix2);
    }

    @Override // androidx.compose.ui.platform.p
    public void a(View view, float[] matrix) {
        zh7.i(matrix);
        d(view, matrix);
    }

    private q(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }
}
