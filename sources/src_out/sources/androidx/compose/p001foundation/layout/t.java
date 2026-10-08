package androidx.compose.p001foundation.layout;

import com.google.inputmethod.jz5;
import com.google.inputmethod.pje;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/t;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/layout/w;", "Landroidx/compose/foundation/layout/g1;", "insets", "Lkotlin/Function1;", "Lcom/google/android/jz5;", "", "inspectorInfo", "Lcom/google/android/pje;", "heightCalc", "<init>", "(Landroidx/compose/foundation/layout/g1;Lkotlin/jvm/functions/Function1;Lcom/google/android/pje;)V", "d", "()Landroidx/compose/foundation/layout/w;", "node", "e", "(Landroidx/compose/foundation/layout/w;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/g1;", "Lkotlin/jvm/functions/Function1;", "f", "Lcom/google/android/pje;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t extends uy7<w> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final g1 insets;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<jz5, Unit> inspectorInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final pje heightCalc;

    /* JADX WARN: Multi-variable type inference failed */
    public t(g1 g1Var, Function1<? super jz5, Unit> function1, pje pjeVar) {
        this.insets = g1Var;
        this.inspectorInfo = function1;
        this.heightCalc = pjeVar;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public w a() {
        return new w(this.insets, this.heightCalc);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(w node) {
        node.A3(this.insets, this.heightCalc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return Intrinsics.e(this.insets, tVar.insets) && this.heightCalc == tVar.heightCalc;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }
}
