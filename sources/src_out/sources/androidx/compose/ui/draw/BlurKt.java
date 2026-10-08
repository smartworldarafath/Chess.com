package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.l;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.r;
import com.google.inputmethod.ff3;
import com.google.inputmethod.i5d;
import com.google.inputmethod.nga;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/ff3;", "radiusX", "radiusY", "Landroidx/compose/ui/draw/a;", "edgeTreatment", "a", "(Landroidx/compose/ui/b;FFLcom/google/android/xkb;)Landroidx/compose/ui/b;", "radius", "b", "(Landroidx/compose/ui/b;FLcom/google/android/xkb;)Landroidx/compose/ui/b;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BlurKt {
    public static final androidx.compose.ui.b a(androidx.compose.ui.b bVar, final float f, final float f2, final xkb xkbVar) {
        int iB;
        final boolean z;
        if (xkbVar != null) {
            iB = i5d.INSTANCE.a();
            z = true;
        } else {
            iB = i5d.INSTANCE.b();
            z = false;
        }
        final int i = iB;
        float f3 = 0;
        return ((ff3.h(f, ff3.i(f3)) <= 0 || ff3.h(f2, ff3.i(f3)) <= 0) && !z) ? bVar : l.c(bVar, new Function1<m, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(m mVar) {
                float fX2 = mVar.x2(f);
                float fX3 = mVar.x2(f2);
                mVar.B((fX2 <= 0.0f || fX3 <= 0.0f) ? null : nga.a(fX2, fX3, i));
                xkb xkbVarA = xkbVar;
                if (xkbVarA == null) {
                    xkbVarA = r.a();
                }
                mVar.R0(xkbVarA);
                mVar.l(z);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((m) obj);
                return Unit.a;
            }
        });
    }

    public static final androidx.compose.ui.b b(androidx.compose.ui.b bVar, float f, xkb xkbVar) {
        return a(bVar, f, f, xkbVar);
    }
}
