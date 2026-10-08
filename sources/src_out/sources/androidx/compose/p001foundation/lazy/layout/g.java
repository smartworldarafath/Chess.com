package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.p001foundation.gestures.Orientation;
import com.google.inputmethod.lt6;
import com.google.inputmethod.tu6;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)¨\u0006,"}, d2 = {"Landroidx/compose/foundation/lazy/layout/g;", "Lcom/google/android/uy7;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "Lkotlin/Function0;", "Lcom/google/android/lt6;", "itemProviderLambda", "Lcom/google/android/tu6;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/google/android/tu6;Landroidx/compose/foundation/gestures/Orientation;ZZ)V", "d", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;", "node", "", "e", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/jvm/functions/Function0;", "getItemProviderLambda", "()Lkotlin/jvm/functions/Function0;", "Lcom/google/android/tu6;", "getState", "()Lcom/google/android/tu6;", "f", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "g", "Z", "getUserScrollEnabled", "()Z", "h", "getReverseScrolling", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g extends uy7<LazyLayoutSemanticsModifierNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function0<lt6> itemProviderLambda;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final tu6 state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Orientation orientation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean userScrollEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean reverseScrolling;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Function0<? extends lt6> function0, tu6 tu6Var, Orientation orientation, boolean z, boolean z2) {
        this.itemProviderLambda = function0;
        this.state = tu6Var;
        this.orientation = orientation;
        this.userScrollEnabled = z;
        this.reverseScrolling = z2;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public LazyLayoutSemanticsModifierNode a() {
        return new LazyLayoutSemanticsModifierNode(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(LazyLayoutSemanticsModifierNode node) {
        node.w3(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return this.itemProviderLambda == gVar.itemProviderLambda && Intrinsics.e(this.state, gVar.state) && this.orientation == gVar.orientation && this.userScrollEnabled == gVar.userScrollEnabled && this.reverseScrolling == gVar.reverseScrolling;
    }

    public int hashCode() {
        return (((((((this.itemProviderLambda.hashCode() * 31) + this.state.hashCode()) * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.userScrollEnabled)) * 31) + Boolean.hashCode(this.reverseScrolling);
    }
}
