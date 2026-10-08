package androidx.compose.ui.node;

import com.google.inputmethod.ew8;
import com.google.inputmethod.fj7;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/n;", "Lcom/google/android/ew8;", "Lcom/google/android/fj7;", "result", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "placeable", "<init>", "(Lcom/google/android/fj7;Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V", "a", "Lcom/google/android/fj7;", "b", "()Lcom/google/android/fj7;", "c", "(Lcom/google/android/fj7;)V", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "", "z0", "()Z", "isValidOwnerScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n implements ew8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private fj7 result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LookaheadCapablePlaceable placeable;

    public n(fj7 fj7Var, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.result = fj7Var;
        this.placeable = lookaheadCapablePlaceable;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LookaheadCapablePlaceable getPlaceable() {
        return this.placeable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fj7 getResult() {
        return this.result;
    }

    public final void c(fj7 fj7Var) {
        this.result = fj7Var;
    }

    @Override // com.google.inputmethod.ew8
    public boolean z0() {
        return this.placeable.v().b();
    }
}
