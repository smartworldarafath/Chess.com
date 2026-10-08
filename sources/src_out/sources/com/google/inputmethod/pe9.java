package com.google.inputmethod;

import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/ne9;", "icon", "", "overrideDescendants", "a", "(Landroidx/compose/ui/b;Lcom/google/android/ne9;Z)Landroidx/compose/ui/b;", "Lcom/google/android/kf3;", "touchBoundsExpansion", "c", "(Landroidx/compose/ui/b;Lcom/google/android/ne9;ZLcom/google/android/kf3;)Landroidx/compose/ui/b;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class pe9 {
    public static final b a(b bVar, ne9 ne9Var, boolean z) {
        return bVar.then(new PointerHoverIconModifierElement(ne9Var, z));
    }

    public static /* synthetic */ b b(b bVar, ne9 ne9Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(bVar, ne9Var, z);
    }

    public static final b c(b bVar, ne9 ne9Var, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return bVar.then(new StylusHoverIconModifierElement(ne9Var, z, dpTouchBoundsExpansion));
    }
}
