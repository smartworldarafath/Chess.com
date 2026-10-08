package androidx.compose.p001foundation.layout;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g16;
import com.google.inputmethod.h66;
import com.google.inputmethod.nx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/o0;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "<init>", "()V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "n3", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)J", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "width", "m", "t", "i", "", "o3", "()Z", "enforceIncoming", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
abstract class o0 extends b.c implements c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p3(o oVar, o.a aVar) {
        o.a.Q(aVar, oVar, g16.INSTANCE.b(), 0.0f, 2, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public final fj7 b(j jVar, dj7 dj7Var, long j) {
        long jN3 = n3(jVar, dj7Var, j);
        if (getEnforceIncoming()) {
            jN3 = nx1.e(j, jN3);
        }
        final o oVarR0 = dj7Var.r0(jN3);
        return j.Q1(jVar, oVarR0.getWidth(), oVarR0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.n0
            public final Object invoke(Object obj) {
                return o0.p3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    public int i(h66 h66Var, f66 f66Var, int i) {
        return f66Var.W(i);
    }

    public int m(h66 h66Var, f66 f66Var, int i) {
        return f66Var.d0(i);
    }

    public abstract long n3(j jVar, dj7 dj7Var, long j);

    /* JADX INFO: renamed from: o3 */
    public abstract boolean getEnforceIncoming();

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        return f66Var.q0(i);
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        return f66Var.o0(i);
    }
}
