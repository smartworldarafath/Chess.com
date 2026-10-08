package androidx.compose.p001foundation.layout;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.c;
import com.google.inputmethod.bo6;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.kx1;
import com.google.inputmethod.pje;
import com.google.inputmethod.rje;
import com.google.inputmethod.yy5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\bJ#\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/w;", "Lcom/google/android/yy5;", "Landroidx/compose/ui/node/c;", "Landroidx/compose/foundation/layout/g1;", "insets", "Lcom/google/android/pje;", "heightCalc", "<init>", "(Landroidx/compose/foundation/layout/g1;Lcom/google/android/pje;)V", "ancestorConsumedInsets", "o3", "(Landroidx/compose/foundation/layout/g1;)Landroidx/compose/foundation/layout/g1;", "", "r3", "()V", "A3", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "r", "Landroidx/compose/foundation/layout/g1;", "s", "Lcom/google/android/pje;", "t", "heightInsets", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w extends yy5 implements c {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private g1 insets;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private pje heightCalc;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private g1 heightInsets = rje.a();

    public w(g1 g1Var, pje pjeVar) {
        this.insets = g1Var;
        this.heightCalc = pjeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y3(o.a aVar) {
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z3(o oVar, o.a aVar) {
        o.a.L(aVar, oVar, 0, 0, 0.0f, 4, null);
        return Unit.a;
    }

    public final void A3(g1 insets, pje heightCalc) {
        if (Intrinsics.e(this.insets, insets) && heightCalc == this.heightCalc) {
            return;
        }
        this.insets = insets;
        this.heightCalc = heightCalc;
        this.heightInsets = rje.j(insets, getAncestorConsumedInsets());
        bo6.b(this);
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        int iA = this.heightCalc.a(this.heightInsets, jVar);
        if (iA == 0) {
            return j.Q1(jVar, 0, 0, null, new Function1() { // from class: androidx.compose.foundation.layout.u
                public final Object invoke(Object obj) {
                    return w.y3((o.a) obj);
                }
            }, 4, null);
        }
        final o oVarR0 = dj7Var.r0(kx1.d(j, 0, 0, iA, iA, 3, null));
        return j.Q1(jVar, oVarR0.getWidth(), iA, null, new Function1() { // from class: androidx.compose.foundation.layout.v
            public final Object invoke(Object obj) {
                return w.z3(oVarR0, (o.a) obj);
            }
        }, 4, null);
    }

    @Override // com.google.inputmethod.yy5
    public g1 o3(g1 ancestorConsumedInsets) {
        return ancestorConsumedInsets;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.yy5
    public void r3() throws KotlinNothingValueException {
        this.heightInsets = rje.j(this.insets, getAncestorConsumedInsets());
        super.r3();
        bo6.b(this);
    }
}
