package androidx.compose.p001foundation.layout;

import androidx.compose.p001foundation.layout.AlignmentLineKt;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.jz5;
import com.google.inputmethod.kx1;
import com.google.inputmethod.mf5;
import com.google.inputmethod.uc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/uc;", "alignmentLine", "Lcom/google/android/ff3;", "before", "after", "f", "(Landroidx/compose/ui/b;Lcom/google/android/uc;FF)Landroidx/compose/ui/b;", "top", "bottom", "h", "(Landroidx/compose/ui/b;FF)Landroidx/compose/ui/b;", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "c", "(Landroidx/compose/ui/layout/j;Lcom/google/android/uc;FFLcom/google/android/dj7;J)Lcom/google/android/fj7;", "", "e", "(Lcom/google/android/uc;)Z", "horizontal", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final fj7 c(j jVar, final uc ucVar, final float f, float f2, dj7 dj7Var, long j) {
        final o oVarR0 = dj7Var.r0(e(ucVar) ? kx1.d(j, 0, 0, 0, 0, 11, null) : kx1.d(j, 0, 0, 0, 0, 14, null));
        int iJ = oVarR0.J(ucVar);
        if (iJ == Integer.MIN_VALUE) {
            iJ = 0;
        }
        int height = e(ucVar) ? oVarR0.getHeight() : oVarR0.getWidth();
        int iK = (e(ucVar) ? kx1.k(j) : kx1.l(j)) - height;
        final int iO = g.o((!Float.isNaN(f) ? jVar.O1(f) : 0) - iJ, 0, iK);
        final int iO2 = g.o(((!Float.isNaN(f2) ? jVar.O1(f2) : 0) - height) + iJ, 0, iK - iO);
        final int width = e(ucVar) ? oVarR0.getWidth() : Math.max(oVarR0.getWidth() + iO + iO2, kx1.n(j));
        final int iMax = e(ucVar) ? Math.max(oVarR0.getHeight() + iO + iO2, kx1.m(j)) : oVarR0.getHeight();
        return j.Q1(jVar, width, iMax, null, new Function1() { // from class: com.google.android.vc
            public final Object invoke(Object obj) {
                return AlignmentLineKt.d(ucVar, f, iO, width, iO2, oVarR0, iMax, (o.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(uc ucVar, float f, int i, int i2, int i3, o oVar, int i4, o.a aVar) {
        int width;
        int i5;
        if (e(ucVar)) {
            width = 0;
        } else {
            width = !ff3.k(f, ff3.INSTANCE.c()) ? i : (i2 - i3) - oVar.getWidth();
        }
        if (e(ucVar)) {
            if (ff3.k(f, ff3.INSTANCE.c())) {
                i = (i4 - i3) - oVar.getHeight();
            }
            i5 = i;
        } else {
            i5 = 0;
        }
        o.a.L(aVar, oVar, width, i5, 0.0f, 4, null);
        return Unit.a;
    }

    private static final boolean e(uc ucVar) {
        return ucVar instanceof mf5;
    }

    public static final b f(b bVar, final uc ucVar, final float f, final float f2) {
        return bVar.then(new a(ucVar, f, f2, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("paddingFrom");
                jz5Var.getProperties().c("alignmentLine", ucVar);
                jz5Var.getProperties().c("before", ff3.e(f));
                jz5Var.getProperties().c("after", ff3.e(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), null));
    }

    public static /* synthetic */ b g(b bVar, uc ucVar, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = ff3.INSTANCE.c();
        }
        if ((i & 4) != 0) {
            f2 = ff3.INSTANCE.c();
        }
        return f(bVar, ucVar, f, f2);
    }

    public static final b h(b bVar, float f, float f2) {
        return bVar.then(!Float.isNaN(f) ? g(b.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.a(), f, 0.0f, 4, null) : b.INSTANCE).then(!Float.isNaN(f2) ? g(b.INSTANCE, androidx.compose.ui.layout.AlignmentLineKt.b(), 0.0f, f2, 2, null) : b.INSTANCE);
    }
}
