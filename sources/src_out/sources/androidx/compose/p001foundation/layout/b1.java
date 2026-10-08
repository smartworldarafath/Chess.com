package androidx.compose.p001foundation.layout;

import com.google.inputmethod.rje;
import com.google.inputmethod.yy5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/b1;", "Lcom/google/android/yy5;", "Landroidx/compose/foundation/layout/g1;", "insets", "<init>", "(Landroidx/compose/foundation/layout/g1;)V", "ancestorConsumedInsets", "o3", "(Landroidx/compose/foundation/layout/g1;)Landroidx/compose/foundation/layout/g1;", "", "w3", "r", "Landroidx/compose/foundation/layout/g1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b1 extends yy5 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private g1 insets;

    public b1(g1 g1Var) {
        this.insets = g1Var;
    }

    @Override // com.google.inputmethod.yy5
    public g1 o3(g1 ancestorConsumedInsets) {
        return rje.l(ancestorConsumedInsets, this.insets);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void w3(g1 insets) throws KotlinNothingValueException {
        if (Intrinsics.e(insets, this.insets)) {
            return;
        }
        this.insets = insets;
        r3();
    }
}
