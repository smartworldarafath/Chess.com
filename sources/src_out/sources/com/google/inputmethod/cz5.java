package com.google.inputmethod;

import androidx.compose.p001foundation.layout.g1;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J#\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/cz5;", "Lcom/google/android/yy5;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/foundation/layout/g1;", "insets", "<init>", "(Landroidx/compose/foundation/layout/g1;)V", "ancestorConsumedInsets", "o3", "(Landroidx/compose/foundation/layout/g1;)Landroidx/compose/foundation/layout/g1;", "", "r3", "()V", "y3", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "r", "Landroidx/compose/foundation/layout/g1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class cz5 extends yy5 implements c {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private g1 insets;

    public cz5(g1 g1Var) {
        this.insets = g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x3(o oVar, int i, int i2, o.a aVar) {
        o.a.z(aVar, oVar, i, i2, 0.0f, 4, null);
        return Unit.a;
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        final int iD = getConsumedInsets().d(jVar, jVar.getLayoutDirection()) - getAncestorConsumedInsets().d(jVar, jVar.getLayoutDirection());
        final int iA = getConsumedInsets().a(jVar) - getAncestorConsumedInsets().a(jVar);
        int iB = (getConsumedInsets().b(jVar, jVar.getLayoutDirection()) - getAncestorConsumedInsets().b(jVar, jVar.getLayoutDirection())) + iD;
        int iC = (getConsumedInsets().c(jVar) - getAncestorConsumedInsets().c(jVar)) + iA;
        final o oVarR0 = dj7Var.r0(nx1.i(j, -iB, -iC));
        return j.Q1(jVar, nx1.g(j, oVarR0.getWidth() + iB), nx1.f(j, oVarR0.getHeight() + iC), null, new Function1() { // from class: com.google.android.bz5
            public final Object invoke(Object obj) {
                return cz5.x3(oVarR0, iD, iA, (o.a) obj);
            }
        }, 4, null);
    }

    @Override // com.google.inputmethod.yy5
    public g1 o3(g1 ancestorConsumedInsets) {
        return rje.l(ancestorConsumedInsets, this.insets);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.yy5
    public void r3() throws KotlinNothingValueException {
        super.r3();
        bo6.b(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void y3(g1 insets) throws KotlinNothingValueException {
        if (Intrinsics.e(insets, this.insets)) {
            return;
        }
        this.insets = insets;
        r3();
    }
}
