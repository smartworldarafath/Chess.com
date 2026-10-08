package com.google.inputmethod;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\b*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\r\u001a\u0004\u0018\u00010\u0000*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/google/android/zv4;", "gestureConnection", "Lcom/google/android/x23;", "b", "(Lcom/google/android/zv4;)Lcom/google/android/x23;", "Lkotlin/Function1;", "", "block", "", "d", "(Lcom/google/android/x23;Lkotlin/jvm/functions/Function1;)V", "c", "(Lcom/google/android/x23;)Lcom/google/android/zv4;", "parentGestureConnection", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cw4 {
    public static final x23 b(zv4 zv4Var) {
        return new aw4(zv4Var);
    }

    public static final zv4 c(x23 x23Var) {
        fhd fhdVarA = ghd.a(x23Var, aw4.INSTANCE);
        aw4 aw4Var = fhdVarA instanceof aw4 ? (aw4) fhdVarA : null;
        if (aw4Var != null) {
            return aw4Var.getGestureConnection();
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final void d(x23 x23Var, final Function1<? super zv4, Boolean> function1) throws KotlinNothingValueException {
        ghd.c(x23Var, aw4.INSTANCE, new Function1() { // from class: com.google.android.bw4
            public final Object invoke(Object obj) {
                return Boolean.valueOf(cw4.e(function1, (fhd) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Function1 function1, fhd fhdVar) {
        if (fhdVar instanceof aw4) {
            return ((Boolean) function1.invoke(((aw4) fhdVar).getGestureConnection())).booleanValue();
        }
        throw new IllegalStateException("Node is not a GestureNode instance");
    }
}
