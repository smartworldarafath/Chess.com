package androidx.compose.ui.layout;

import android.graphics.Rect;
import com.google.inputmethod.d1e;
import com.google.inputmethod.e16;
import com.google.inputmethod.e58;
import com.google.inputmethod.eke;
import com.google.inputmethod.f1e;
import com.google.inputmethod.kie;
import com.google.inputmethod.mra;
import com.google.inputmethod.o48;
import com.google.inputmethod.o58;
import com.google.inputmethod.zke;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/mra;", "Lcom/google/android/eke;", "rulerProvider", "", "c", "(Lcom/google/android/mra;Lcom/google/android/eke;)V", "Landroidx/compose/ui/layout/p;", "rulers", "Lcom/google/android/d1e;", "insets", "", "width", "height", "b", "(Lcom/google/android/mra;Landroidx/compose/ui/layout/p;JII)V", "Lcom/google/android/e16;", "Landroidx/compose/ui/layout/x;", "a", "Lcom/google/android/e16;", "WindowInsetsTypeMap", "", "[Landroidx/compose/ui/layout/x;", "AnimatableInsetsRulers", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    private static final e16<x> a;
    private static final x[] b;

    static {
        o48 o48Var = new o48(8);
        int iH = kie.s.h();
        x.Companion companion = x.INSTANCE;
        o48Var.r(iH, companion.f());
        o48Var.r(kie.s.g(), companion.e());
        o48Var.r(kie.s.b(), companion.a());
        o48Var.r(kie.s.d(), companion.c());
        o48Var.r(kie.s.j(), companion.g());
        o48Var.r(kie.s.f(), companion.d());
        o48Var.r(kie.s.k(), companion.h());
        o48Var.r(kie.s.c(), companion.b());
        a = o48Var;
        b = new x[]{companion.f(), companion.e(), companion.a(), companion.h(), companion.g(), companion.d(), companion.c(), companion.i(), companion.b()};
    }

    private static final void b(mra mraVar, p pVar, long j, int i, int i2) {
        if (d1e.b(j, f1e.a())) {
            return;
        }
        mraVar.p0(pVar.getLeft(), (int) ((j >>> 48) & 65535));
        mraVar.p0(pVar.getTop(), (int) ((j >>> 32) & 65535));
        mraVar.p0(pVar.getRight(), i - ((int) ((j >>> 16) & 65535)));
        mraVar.p0(pVar.getBottom(), i2 - ((int) (j & 65535)));
    }

    public static final void c(mra mraVar, eke ekeVar) {
        long jA = mraVar.v().a();
        androidx.collection.e<Object, zke> eVarJ = ekeVar.U1().j();
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        x[] xVarArr = b;
        int length = xVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            x xVar = xVarArr[i3];
            zke zkeVarE = eVarJ.e(xVar);
            Intrinsics.g(zkeVarE);
            zke zkeVar = zkeVarE;
            mra mraVar2 = mraVar;
            b(mraVar2, xVar.getCurrent(), zkeVar.getCurrent(), i, i2);
            if (zkeVar.g()) {
                b(mraVar2, zkeVar.getSource(), zkeVar.getSourceValueInsets(), i, i2);
                b(mraVar2, zkeVar.getTarget(), zkeVar.getTargetValueInsets(), i, i2);
            }
            b(mraVar2, xVar.getMaximum(), zkeVar.getMaximum(), i, i2);
            i3++;
            mraVar = mraVar2;
        }
        mra mraVar3 = mraVar;
        e58<o58<Rect>> e58VarG2 = ekeVar.g2();
        if (e58VarG2.h()) {
            List<p> listX0 = ekeVar.x0();
            Object[] objArr = e58VarG2.content;
            int i4 = e58VarG2._size;
            for (int i5 = 0; i5 < i4; i5++) {
                o58 o58Var = (o58) objArr[i5];
                p pVar = listX0.get(i5);
                Rect rect = (Rect) o58Var.getValue();
                mraVar3.p0(pVar.getLeft(), rect.left);
                mraVar3.p0(pVar.getTop(), rect.top);
                mraVar3.p0(pVar.getRight(), rect.right);
                mraVar3.p0(pVar.getBottom(), rect.bottom);
            }
        }
    }
}
