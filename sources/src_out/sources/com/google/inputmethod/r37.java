package com.google.inputmethod;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0010\u001a\u00020\r*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/r37;", "Lcom/google/android/ej7;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "a", "Lkotlin/jvm/functions/Function0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r37 implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<Boolean> shouldMeasureLinks;

    public r37(Function0<Boolean> function0) {
        this.shouldMeasureLinks = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(List list, r37 r37Var, o.a aVar) {
        List listI = mi0.I(list, r37Var.shouldMeasureLinks);
        if (listI != null) {
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) listI.get(i);
                o oVar = (o) pair.a();
                Function0 function0 = (Function0) pair.b();
                o.a.F(aVar, oVar, function0 != null ? ((g16) function0.invoke()).getPackedValue() : g16.INSTANCE.b(), 0.0f, 2, null);
            }
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(j jVar, final List<? extends dj7> list, long j) {
        return j.Q1(jVar, kx1.l(j), kx1.k(j), null, new Function1() { // from class: com.google.android.q37
            public final Object invoke(Object obj) {
                return r37.b(list, this, (o.a) obj);
            }
        }, 4, null);
    }
}
