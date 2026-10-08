package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/google/android/hhc;", "", "<init>", "()V", "Lkotlin/Function1;", "", "c", "(Landroidx/compose/runtime/d;I)Lkotlin/jvm/functions/Function1;", "positionalThreshold", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hhc {
    public static final hhc a = new hhc();

    private hhc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(f43 f43Var, float f) {
        return f43Var.x2(ff3.i(56));
    }

    public final Function1<Float, Float> c(d dVar, int i) {
        if (e.k()) {
            e.o(1545861529, i, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:362)");
        }
        dVar.y(-485754360);
        final f43 f43Var = (f43) dVar.v(CompositionLocalsKt.g());
        boolean zX = dVar.x(f43Var);
        Object objR = dVar.R();
        if (zX || objR == d.INSTANCE.a()) {
            objR = new Function1() { // from class: com.google.android.ghc
                public final Object invoke(Object obj) {
                    return Float.valueOf(hhc.b(f43Var, ((Float) obj).floatValue()));
                }
            };
            dVar.L(objR);
        }
        Function1<Float, Float> function1 = (Function1) objR;
        dVar.u();
        if (e.k()) {
            e.n();
        }
        return function1;
    }
}
