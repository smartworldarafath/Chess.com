package com.google.inputmethod;

import androidx.compose.ui.text.TextStyle;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/x23;", "Lcom/google/android/fcc;", "phase", "Landroidx/compose/ui/text/y;", "fallback", "b", "(Lcom/google/android/x23;ILandroidx/compose/ui/text/y;)Landroidx/compose/ui/text/y;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class xzc {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final TextStyle b(x23 x23Var, final int i, final TextStyle textStyle) throws KotlinNothingValueException {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = textStyle;
        ghd.c(x23Var, "StyleOuterNode", new Function1() { // from class: com.google.android.wzc
            public final Object invoke(Object obj) {
                return Boolean.valueOf(xzc.c(objectRef, i, textStyle, (fhd) obj));
            }
        });
        return (TextStyle) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Ref.ObjectRef objectRef, int i, TextStyle textStyle, fhd fhdVar) {
        if (!(fhdVar instanceof ecc)) {
            return true;
        }
        objectRef.element = ((ecc) fhdVar).s3(i, textStyle);
        return false;
    }
}
