package com.google.inputmethod;

import androidx.compose.p002material3.InteractiveComponentSizeKt;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.android.sh7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/google/android/rw7;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bs1;", "Landroidx/compose/ui/node/c;", "<init>", "()V", "", "sizePx", "Landroidx/compose/ui/layout/o;", "placeable", "", "p3", "(ILandroidx/compose/ui/layout/o;)V", "", "Lcom/google/android/uc;", "n3", "()Ljava/util/Map;", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "Ljava/util/Map;", "alignmentLinesCache", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class rw7 extends b.c implements bs1, c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private Map<uc, Integer> alignmentLinesCache;

    private final Map<uc, Integer> n3() {
        Map<uc, Integer> map = this.alignmentLinesCache;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        this.alignmentLinesCache = linkedHashMap;
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o3(int i, o oVar, int i2, o.a aVar) {
        o.a.z(aVar, oVar, sh7.d((i - oVar.getWidth()) / 2.0f), sh7.d((i2 - oVar.getHeight()) / 2.0f), 0.0f, 4, null);
        return Unit.a;
    }

    private final void p3(int sizePx, o placeable) {
        Map<uc, Integer> mapN3 = n3();
        mapN3.put(InteractiveComponentSizeKt.f(), Integer.valueOf(g.e(Math.round((sizePx - placeable.getWidth()) / 2.0f), 0)));
        mapN3.put(InteractiveComponentSizeKt.g(), Integer.valueOf(g.e(Math.round((sizePx - placeable.getHeight()) / 2.0f), 0)));
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        float f = 0;
        float fI = ff3.i(g.d(((ff3) cs1.a(this, InteractiveComponentSizeKt.e())).getValue(), ff3.i(f)));
        final o oVarR0 = dj7Var.r0(j);
        boolean z = getIsAttached() && !Float.isNaN(fI) && ff3.h(fI, ff3.i(f)) > 0;
        int iO1 = Float.isNaN(fI) ? 0 : jVar.O1(fI);
        final int iMax = z ? Math.max(oVarR0.getWidth(), iO1) : oVarR0.getWidth();
        final int iMax2 = z ? Math.max(oVarR0.getHeight(), iO1) : oVarR0.getHeight();
        if (z) {
            p3(iO1, oVarR0);
        }
        Map<uc, Integer> mapJ = this.alignmentLinesCache;
        if (mapJ == null) {
            mapJ = b0.j();
        }
        return jVar.h2(iMax, iMax2, mapJ, new Function1() { // from class: com.google.android.qw7
            public final Object invoke(Object obj) {
                return rw7.o3(iMax, oVarR0, iMax2, (o.a) obj);
            }
        });
    }
}
