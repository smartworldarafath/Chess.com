package androidx.compose.p002material3.p003internal;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import com.google.inputmethod.xa4;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class m implements ps4<Transition.b<InputPhase>, d, Integer, xa4<Float>> {
    final /* synthetic */ xa4<Float> a;
    final /* synthetic */ xa4<Float> b;

    public m(xa4<Float> xa4Var, xa4<Float> xa4Var2) {
        this.a = xa4Var;
        this.b = xa4Var2;
    }

    public final xa4<Float> a(Transition.b<InputPhase> bVar, d dVar, int i) {
        xa4<Float> xa4Var;
        dVar.y(-984009111);
        if (e.k()) {
            e.o(-984009111, i, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:404)");
        }
        InputPhase inputPhase = InputPhase.Focused;
        InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
        if (bVar.c(inputPhase, inputPhase2)) {
            xa4Var = this.a;
        } else {
            xa4Var = (bVar.c(inputPhase2, inputPhase) || bVar.c(InputPhase.UnfocusedNotEmpty, inputPhase2)) ? this.b : this.a;
        }
        if (e.k()) {
            e.n();
        }
        dVar.u();
        return xa4Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((Transition.b) obj, (d) obj2, ((Number) obj3).intValue());
    }
}
