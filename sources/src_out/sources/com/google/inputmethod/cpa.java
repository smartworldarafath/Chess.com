package com.google.inputmethod;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material.ripple.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/android/j26;", "interactionSource", "", "bounded", "Lcom/google/android/ff3;", "radius", "Lcom/google/android/ri1;", "color", "Lkotlin/Function0;", "Lcom/google/android/joa;", "rippleAlpha", "Lcom/google/android/x23;", "d", "(Lcom/google/android/j26;ZFLcom/google/android/ri1;Lkotlin/jvm/functions/Function0;)Lcom/google/android/x23;", "Landroid/view/ViewGroup;", "view", "Lcom/google/android/noa;", "c", "(Landroid/view/ViewGroup;)Lcom/google/android/noa;", "Landroid/view/View;", "initialView", "e", "(Landroid/view/View;)Landroid/view/ViewGroup;", "material-ripple"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cpa {
    /* JADX INFO: Access modifiers changed from: private */
    public static final noa c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof noa) {
                return (noa) childAt;
            }
        }
        noa noaVar = new noa(viewGroup.getContext());
        viewGroup.addView(noaVar);
        return noaVar;
    }

    public static final x23 d(j26 j26Var, boolean z, float f, ri1 ri1Var, Function0<RippleAlpha> function0) {
        return new a(j26Var, z, f, ri1Var, function0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup e(View view) {
        Object obj = view;
        while (!(obj instanceof ViewGroup)) {
            ViewParent parent = ((View) obj).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            obj = parent;
        }
        return (ViewGroup) obj;
    }
}
