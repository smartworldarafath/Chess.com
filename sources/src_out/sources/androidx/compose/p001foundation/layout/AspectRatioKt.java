package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.jz5;
import com.google.inputmethod.kx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/b;", "", "ratio", "", "matchHeightConstraintsFirst", "a", "(Landroidx/compose/ui/b;FZ)Landroidx/compose/ui/b;", "Lcom/google/android/kx1;", "", "width", "height", "c", "(JII)Z", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AspectRatioKt {
    public static final b a(b bVar, final float f, final boolean z) {
        return bVar.then(new d(f, z, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("aspectRatio");
                jz5Var.getProperties().c("ratio", Float.valueOf(f));
                jz5Var.getProperties().c("matchHeightConstraintsFirst", Boolean.valueOf(z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a()));
    }

    public static /* synthetic */ b b(b bVar, float f, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(bVar, f, z);
    }

    public static final boolean c(long j, int i, int i2) {
        int iN = kx1.n(j);
        if (i > kx1.l(j) || iN > i) {
            return false;
        }
        return i2 <= kx1.k(j) && kx1.m(j) <= i2;
    }
}
