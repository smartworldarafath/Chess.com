package androidx.lifecycle.p011compose;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import com.google.inputmethod.h67;
import com.google.inputmethod.jd3;
import com.google.inputmethod.kd3;
import com.google.inputmethod.n17;
import com.google.inputmethod.vn3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/Lifecycle$State;", "maxLifecycle", "Lcom/google/android/n17;", "parent", "c", "(Landroidx/lifecycle/Lifecycle$State;Lcom/google/android/n17;Landroidx/compose/runtime/d;II)Lcom/google/android/n17;", "lifecycle-runtime-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RememberLifecycleOwnerKt {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/lifecycle/compose/RememberLifecycleOwnerKt$a", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements jd3 {
        final /* synthetic */ n17 a;
        final /* synthetic */ i b;
        final /* synthetic */ androidx.lifecycle.p011compose.a c;

        public a(n17 n17Var, i iVar, androidx.lifecycle.p011compose.a aVar) {
            this.a = n17Var;
            this.b = iVar;
            this.c = aVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.google.inputmethod.jd3
        public void dispose() throws NoWhenBranchMatchedException {
            Lifecycle lifecycle;
            n17 n17Var = this.a;
            if (n17Var != null && (lifecycle = n17Var.getLifecycle()) != null) {
                lifecycle.g(this.b);
            }
            this.c.a(Lifecycle.Event.ON_DESTROY);
        }
    }

    public static final n17 c(Lifecycle.State state, final n17 n17Var, d dVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            state = Lifecycle.State.RESUMED;
        }
        if ((i2 & 2) != 0) {
            n17Var = (n17) dVar.v(h67.c());
        }
        if (e.k()) {
            e.o(-1501509168, i, -1, "androidx.lifecycle.compose.rememberLifecycleOwner (RememberLifecycleOwner.kt:78)");
        }
        boolean zX = dVar.x(n17Var);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new androidx.lifecycle.p011compose.a();
            dVar.L(objR);
        }
        final androidx.lifecycle.p011compose.a aVar = (androidx.lifecycle.p011compose.a) objR;
        boolean zT = dVar.T(aVar) | dVar.T(n17Var);
        Object objR2 = dVar.R();
        if (zT || objR2 == d.INSTANCE.a()) {
            objR2 = new Function1() { // from class: androidx.lifecycle.compose.b
                public final Object invoke(Object obj) {
                    return RememberLifecycleOwnerKt.d(n17Var, aVar, (kd3) obj);
                }
            };
            dVar.L(objR2);
        }
        vn3.b(aVar, n17Var, (Function1) objR2, dVar, i & 112);
        boolean zT2 = dVar.T(aVar) | ((((i & 14) ^ 6) > 4 && dVar.C(state.ordinal())) || (i & 6) == 4);
        Object objR3 = dVar.R();
        if (zT2 || objR3 == d.INSTANCE.a()) {
            objR3 = new ta2(aVar, state, null);
            dVar.L(objR3);
        }
        vn3.f(aVar, state, (Function2) objR3, dVar, (i << 3) & 112);
        if (e.k()) {
            e.n();
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final jd3 d(n17 n17Var, final androidx.lifecycle.p011compose.a aVar, kd3 kd3Var) throws NoWhenBranchMatchedException {
        Lifecycle lifecycle;
        i iVar = new i() { // from class: androidx.lifecycle.compose.c
            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var2, Lifecycle.Event event) throws NoWhenBranchMatchedException {
                RememberLifecycleOwnerKt.e(aVar, n17Var2, event);
            }
        };
        if (n17Var != null && (lifecycle = n17Var.getLifecycle()) != null) {
            lifecycle.c(iVar);
        }
        if (n17Var == null) {
            aVar.a(Lifecycle.Event.ON_RESUME);
        }
        return new a(n17Var, iVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(androidx.lifecycle.p011compose.a aVar, n17 n17Var, Lifecycle.Event event) throws NoWhenBranchMatchedException {
        aVar.a(event);
    }
}
