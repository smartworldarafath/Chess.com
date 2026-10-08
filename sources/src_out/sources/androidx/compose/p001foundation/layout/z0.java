package androidx.compose.p001foundation.layout;

import android.view.View;
import androidx.compose.ui.node.c;
import com.google.inputmethod.cz5;
import com.google.inputmethod.rje;
import com.google.inputmethod.z23;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\r\u0010\bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/z0;", "Lcom/google/android/cz5;", "Landroidx/compose/ui/node/c;", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/h1;", "Landroidx/compose/foundation/layout/g1;", "insetsGetter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "V2", "()V", "W2", "z3", "s", "Lkotlin/jvm/functions/Function1;", "t", "Landroidx/compose/foundation/layout/h1;", "getWindowInsetsHolder", "()Landroidx/compose/foundation/layout/h1;", "setWindowInsetsHolder", "(Landroidx/compose/foundation/layout/h1;)V", "windowInsetsHolder", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z0 extends cz5 implements c {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Function1<? super h1, ? extends g1> insetsGetter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private h1 windowInsetsHolder;

    public z0(Function1<? super h1, ? extends g1> function1) {
        super(rje.a());
        this.insetsGetter = function1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.yy5, androidx.compose.ui.b.c
    public void V2() throws KotlinNothingValueException {
        View viewA = z23.a(this);
        h1 h1VarF = h1.INSTANCE.f(viewA);
        h1VarF.t(viewA);
        y3((g1) this.insetsGetter.invoke(h1VarF));
        this.windowInsetsHolder = h1VarF;
        super.V2();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.yy5, androidx.compose.ui.b.c
    public void W2() throws KotlinNothingValueException {
        View viewA = z23.a(this);
        h1 h1Var = this.windowInsetsHolder;
        if (h1Var != null) {
            h1Var.b(viewA);
        }
        super.W2();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void z3(Function1<? super h1, ? extends g1> insetsGetter) throws KotlinNothingValueException {
        if (this.insetsGetter != insetsGetter) {
            this.insetsGetter = insetsGetter;
            h1 h1Var = this.windowInsetsHolder;
            if (h1Var != null) {
                y3((g1) insetsGetter.invoke(h1Var));
            }
        }
    }
}
