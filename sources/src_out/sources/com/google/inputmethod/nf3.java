package com.google.inputmethod;

import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\f*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/android/of3;", "Lcom/google/android/lf3;", "event", "", "e", "(Lcom/google/android/of3;Lcom/google/android/lf3;)V", "Landroidx/compose/ui/draganddrop/DragAndDropNode;", "Lcom/google/android/rn8;", "positionInRoot", "", "d", "(Landroidx/compose/ui/draganddrop/DragAndDropNode;J)Z", "Lcom/google/android/fhd;", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "block", "f", "(Lcom/google/android/fhd;Lkotlin/jvm/functions/Function1;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class nf3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.getNode().getIsAttached()) {
            return false;
        }
        kn6 kn6VarV = y23.q(dragAndDropNode).v();
        if (!kn6VarV.b()) {
            return false;
        }
        long jH = ln6.h(kn6VarV);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fT3 = ((int) (dragAndDropNode.getSize() >> 32)) + fIntBitsToFloat;
        float fT4 = ((int) (dragAndDropNode.getSize() & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fT3) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fT4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(of3 of3Var, lf3 lf3Var) {
        of3Var.f1(lf3Var);
        of3Var.F1(lf3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final <T extends fhd> void f(T t, Function1<? super T, ? extends TraversableNode$Companion$TraverseDescendantsAction> function1) throws KotlinNothingValueException {
        if (function1.invoke(t) != TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        ghd.f(t, function1);
    }
}
