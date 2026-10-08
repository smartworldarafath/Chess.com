package com.google.inputmethod;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0012\u001a\u00020\u000f*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/oyc;", "Lcom/google/android/ej7;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "", "Lcom/google/android/gba;", "placements", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Lcom/google/android/fj7;", "measure", "a", "Lkotlin/jvm/functions/Function0;", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class oyc implements ej7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function0<Boolean> shouldMeasureLinks;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<List<gba>> placements;

    /* JADX WARN: Multi-variable type inference failed */
    public oyc(Function0<Boolean> function0, Function0<? extends List<gba>> function1) {
        this.shouldMeasureLinks = function0;
        this.placements = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(List list, List list2, o.a aVar) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) list.get(i);
                o.a.F(aVar, (o) pair.a(), ((g16) pair.b()).getPackedValue(), 0.0f, 2, null);
            }
        }
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Pair pair2 = (Pair) list2.get(i2);
                o oVar = (o) pair2.a();
                Function0 function0 = (Function0) pair2.b();
                o.a.F(aVar, oVar, function0 != null ? ((g16) function0.invoke()).getPackedValue() : g16.INSTANCE.b(), 0.0f, 2, null);
            }
        }
        return Unit.a;
    }

    @Override // com.google.inputmethod.ej7
    /* JADX INFO: renamed from: measure-3p2s80s */
    public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dj7 dj7Var = list.get(i);
            if (!(dj7Var.getParentData() instanceof czc)) {
                arrayList.add(dj7Var);
            }
        }
        List list2 = (List) this.placements.invoke();
        final ArrayList arrayList2 = null;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                gba gbaVar = (gba) list2.get(i2);
                Pair pair = gbaVar != null ? new Pair(((dj7) arrayList.get(i2)).r0(nx1.b(0, (int) Math.floor(gbaVar.getRight() - gbaVar.getLeft()), 0, (int) Math.floor(gbaVar.getBottom() - gbaVar.getTop()), 5, null)), g16.c(g16.f((((long) Math.round(gbaVar.getLeft())) << 32) | (((long) Math.round(gbaVar.getTop())) & 4294967295L)))) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            dj7 dj7Var2 = list.get(i3);
            if (dj7Var2.getParentData() instanceof czc) {
                arrayList4.add(dj7Var2);
            }
        }
        final List listI = mi0.I(arrayList4, this.shouldMeasureLinks);
        return j.Q1(jVar, kx1.l(j), kx1.k(j), null, new Function1() { // from class: com.google.android.nyc
            public final Object invoke(Object obj) {
                return oyc.b(arrayList2, listI, (o.a) obj);
            }
        }, 4, null);
    }
}
