package com.google.inputmethod;

import android.view.View;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/x23;", "Landroid/view/View;", "a", "(Lcom/google/android/x23;)Landroid/view/View;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z23 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final View a(x23 x23Var) throws KotlinNothingValueException {
        if (!x23Var.getNode().getIsAttached()) {
            zw5.c("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objB = fo6.b(y23.q(x23Var));
        Intrinsics.h(objB, "null cannot be cast to non-null type android.view.View");
        return (View) objB;
    }
}
