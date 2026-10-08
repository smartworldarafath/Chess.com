package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/cya;", "b", "(Landroidx/compose/runtime/d;I)Lcom/google/android/cya;", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class kya {
    public static final cya b(d dVar, int i) {
        if (e.k()) {
            e.o(15454635, i, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        dVar.y(1967007413);
        Object[] objArr = new Object[0];
        k0b<iya, ?> k0bVarA = iya.INSTANCE.a();
        Object objR = dVar.R();
        if (objR == d.INSTANCE.a()) {
            objR = new Function0() { // from class: com.google.android.jya
                public final Object invoke() {
                    return kya.c();
                }
            };
            dVar.L(objR);
        }
        iya iyaVar = (iya) dfa.k(objArr, k0bVarA, (Function0) objR, dVar, 384);
        iyaVar.s((qya) dVar.v(tya.g()));
        dVar.u();
        if (e.k()) {
            e.n();
        }
        return iyaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iya c() {
        return new iya(null, 1, null);
    }
}
