package androidx.compose.p001foundation.layout;

import com.google.inputmethod.rje;
import com.google.inputmethod.rx8;
import com.google.inputmethod.yy5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/layout/s0;", "Lcom/google/android/yy5;", "Lcom/google/android/rx8;", "paddingValues", "<init>", "(Lcom/google/android/rx8;)V", "", "w3", "Landroidx/compose/foundation/layout/g1;", "ancestorConsumedInsets", "o3", "(Landroidx/compose/foundation/layout/g1;)Landroidx/compose/foundation/layout/g1;", "r", "Lcom/google/android/rx8;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s0 extends yy5 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private rx8 paddingValues;

    public s0(rx8 rx8Var) {
        this.paddingValues = rx8Var;
    }

    @Override // com.google.inputmethod.yy5
    public g1 o3(g1 ancestorConsumedInsets) {
        return rje.f(ancestorConsumedInsets, rje.g(this.paddingValues));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void w3(rx8 paddingValues) throws KotlinNothingValueException {
        if (Intrinsics.e(paddingValues, this.paddingValues)) {
            return;
        }
        this.paddingValues = paddingValues;
        r3();
    }
}
