package androidx.p008glance.p009appwidget;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.inputmethod.dud;
import com.google.inputmethod.dz;
import com.google.inputmethod.jq3;
import com.google.inputmethod.pp1;
import com.google.inputmethod.rp3;
import com.google.inputmethod.s6b;
import com.google.inputmethod.wp3;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "a", "(Landroidx/compose/runtime/d;I)V", "Lcom/google/android/rp3;", "", "b", "(Lcom/google/android/rp3;)Z", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IgnoreResultKt {
    public static final void a(d dVar, final int i) {
        d dVarF = dVar.F(1257244356);
        if (i == 0 && dVarF.c()) {
            dVarF.q();
        } else {
            if (e.k()) {
                e.o(1257244356, i, -1, "androidx.glance.appwidget.IgnoreResult (IgnoreResult.kt:34)");
            }
            final IgnoreResultKt$IgnoreResult$1 ignoreResultKt$IgnoreResult$1 = IgnoreResultKt$IgnoreResult$1.a;
            dVarF.Q(-1115894518);
            dVarF.Q(1886828752);
            if (!(dVarF.G() instanceof dz)) {
                pp1.d();
            }
            dVarF.J();
            if (dVarF.E()) {
                dVarF.W(new Function0<wp3>() { // from class: androidx.glance.appwidget.IgnoreResultKt$IgnoreResult$$inlined$GlanceNode$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.wp3, java.lang.Object] */
                    public final wp3 invoke() {
                        return ignoreResultKt$IgnoreResult$1.invoke();
                    }
                });
            } else {
                dVarF.k();
            }
            dud.c(dVarF);
            dVarF.m();
            dVarF.a0();
            dVarF.a0();
            if (e.k()) {
                e.n();
            }
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2<d, Integer, Unit>() { // from class: androidx.glance.appwidget.IgnoreResultKt$IgnoreResult$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }

                public final void invoke(d dVar2, int i2) {
                    IgnoreResultKt.a(dVar2, i | 1);
                }
            });
        }
    }

    public static final boolean b(rp3 rp3Var) {
        if (rp3Var instanceof wp3) {
            return true;
        }
        if (!(rp3Var instanceof jq3)) {
            return false;
        }
        List<rp3> listD = ((jq3) rp3Var).d();
        if (listD != null && listD.isEmpty()) {
            return false;
        }
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            if (b((rp3) it.next())) {
                return true;
            }
        }
        return false;
    }
}
