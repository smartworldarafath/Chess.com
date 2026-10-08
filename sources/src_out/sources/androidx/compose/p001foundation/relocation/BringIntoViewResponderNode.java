package androidx.compose.p001foundation.relocation;

import androidx.compose.p001foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.b;
import com.google.android.q22;
import com.google.inputmethod.au0;
import com.google.inputmethod.du0;
import com.google.inputmethod.fn6;
import com.google.inputmethod.gba;
import com.google.inputmethod.kn6;
import com.google.inputmethod.y23;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/au0;", "Lcom/google/android/fn6;", "Lcom/google/android/du0;", "responder", "<init>", "(Lcom/google/android/du0;)V", "Lcom/google/android/kn6;", "coordinates", "", "w", "(Lcom/google/android/kn6;)V", "childCoordinates", "Lkotlin/Function0;", "Lcom/google/android/gba;", "boundsProvider", "G0", "(Lcom/google/android/kn6;Lkotlin/jvm/functions/Function0;Lcom/google/android/q22;)Ljava/lang/Object;", "p", "Lcom/google/android/du0;", "q3", "()Lcom/google/android/du0;", "setResponder", "", "q", "Z", "Q2", "()Z", "shouldAutoInvalidate", "r", "hasBeenPlaced", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BringIntoViewResponderNode extends b.c implements au0, fn6 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private du0 responder;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean hasBeenPlaced;

    public BringIntoViewResponderNode(du0 du0Var) {
        this.responder = du0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gba o3(BringIntoViewResponderNode bringIntoViewResponderNode, kn6 kn6Var, Function0 function0) {
        gba gbaVarP3 = p3(bringIntoViewResponderNode, kn6Var, function0);
        if (gbaVarP3 != null) {
            return bringIntoViewResponderNode.responder.r0(gbaVarP3);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gba p3(BringIntoViewResponderNode bringIntoViewResponderNode, kn6 kn6Var, Function0<gba> function0) {
        gba gbaVar;
        if (!bringIntoViewResponderNode.getIsAttached() || !bringIntoViewResponderNode.hasBeenPlaced) {
            return null;
        }
        kn6 kn6VarO = y23.o(bringIntoViewResponderNode);
        if (!kn6Var.b()) {
            kn6Var = null;
        }
        if (kn6Var == null || (gbaVar = (gba) function0.invoke()) == null) {
            return null;
        }
        return e.b(kn6VarO, kn6Var, gbaVar);
    }

    @Override // com.google.inputmethod.au0
    public Object G0(final kn6 kn6Var, final Function0<gba> function0, q22<? super Unit> q22Var) {
        Object objG = j.g(new BringIntoViewResponderNode$bringIntoView$2(this, kn6Var, function0, new Function0() { // from class: com.google.android.eu0
            public final Object invoke() {
                return BringIntoViewResponderNode.o3(this.a, kn6Var, function0);
            }
        }, null), q22Var);
        return objG == a.g() ? objG : Unit.a;
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final du0 getResponder() {
        return this.responder;
    }

    @Override // com.google.inputmethod.fn6
    public void w(kn6 coordinates) {
        this.hasBeenPlaced = true;
    }
}
