package androidx.compose.p001foundation;

import androidx.compose.ui.b;
import androidx.compose.ui.graphics.r;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.inputmethod.ei1;
import com.google.inputmethod.jz5;
import com.google.inputmethod.qu0;
import com.google.inputmethod.xkb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/ei1;", "color", "Lcom/google/android/xkb;", "shape", "c", "(Landroidx/compose/ui/b;JLcom/google/android/xkb;)Landroidx/compose/ui/b;", "Lcom/google/android/qu0;", "brush", "", "alpha", "a", "(Landroidx/compose/ui/b;Lcom/google/android/qu0;Lcom/google/android/xkb;F)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BackgroundKt {
    public static final b a(b bVar, final qu0 qu0Var, final xkb xkbVar, final float f) {
        return bVar.then(new a(0L, qu0Var, f, xkbVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.BackgroundKt$background$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("background");
                jz5Var.getProperties().c("alpha", Float.valueOf(f));
                jz5Var.getProperties().c("brush", qu0Var);
                jz5Var.getProperties().c("shape", xkbVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 1, null));
    }

    public static /* synthetic */ b b(b bVar, qu0 qu0Var, xkb xkbVar, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            xkbVar = r.a();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return a(bVar, qu0Var, xkbVar, f);
    }

    public static final b c(b bVar, final long j, final xkb xkbVar) {
        return bVar.then(new a(j, null, 1.0f, xkbVar, InspectableValueKt.b() ? new Function1<jz5, Unit>() { // from class: androidx.compose.foundation.BackgroundKt$background-bw27NRU$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(jz5 jz5Var) {
                jz5Var.b("background");
                jz5Var.c(ei1.l(j));
                jz5Var.getProperties().c("color", ei1.l(j));
                jz5Var.getProperties().c("shape", xkbVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((jz5) obj);
                return Unit.a;
            }
        } : InspectableValueKt.a(), 2, null));
    }

    public static /* synthetic */ b d(b bVar, long j, xkb xkbVar, int i, Object obj) {
        if ((i & 2) != 0) {
            xkbVar = r.a();
        }
        return c(bVar, j, xkbVar);
    }
}
