package com.google.inputmethod;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p002material3.p003internal.InputPhase;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.ps4;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class otc implements ps4<Transition.b<InputPhase>, d, Integer, xa4<ei1>> {
    final /* synthetic */ xa4<ei1> a;

    public otc(xa4<ei1> xa4Var) {
        this.a = xa4Var;
    }

    public final xa4<ei1> a(Transition.b<InputPhase> bVar, d dVar, int i) {
        dVar.y(1954111929);
        if (e.k()) {
            e.o(1954111929, i, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:438)");
        }
        xa4<ei1> xa4Var = this.a;
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
