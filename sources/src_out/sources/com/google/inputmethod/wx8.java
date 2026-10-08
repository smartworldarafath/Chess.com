package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/google/android/wx8;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/rx8;", "paddingValues", "<init>", "(Lcom/google/android/rx8;)V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "p", "Lcom/google/android/rx8;", "getPaddingValues", "()Lcom/google/android/rx8;", "o3", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class wx8 extends b.c implements c {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private rx8 paddingValues;

    public wx8(rx8 rx8Var) {
        this.paddingValues = rx8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(o oVar, int i, int i2, o.a aVar) {
        o.a.z(aVar, oVar, i, i2, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        float fB = this.paddingValues.b(jVar.getLayoutDirection());
        float top = this.paddingValues.getTop();
        float fC = this.paddingValues.c(jVar.getLayoutDirection());
        float bottom = this.paddingValues.getBottom();
        float f = 0;
        if (!((ff3.h(bottom, ff3.i(f)) >= 0) & (ff3.h(fB, ff3.i(f)) >= 0) & (ff3.h(top, ff3.i(f)) >= 0) & (ff3.h(fC, ff3.i(f)) >= 0))) {
            xw5.a("Padding must be non-negative");
        }
        final int iO1 = jVar.O1(fB);
        int iO2 = jVar.O1(fC) + iO1;
        final int iO3 = jVar.O1(top);
        int iO4 = jVar.O1(bottom) + iO3;
        final o oVarR0 = dj7Var.r0(nx1.i(j, -iO2, -iO4));
        return j.Q1(jVar, nx1.g(j, oVarR0.getWidth() + iO2), nx1.f(j, oVarR0.getHeight() + iO4), null, new Function1() { // from class: com.google.android.vx8
            public final Object invoke(Object obj) {
                return wx8.n3(oVarR0, iO1, iO3, (o.a) obj);
            }
        }, 4, null);
    }

    public final void o3(rx8 rx8Var) {
        this.paddingValues = rx8Var;
    }
}
