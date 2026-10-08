package com.google.inputmethod;

import android.content.res.Resources;
import androidx.compose.p001foundation.text.CommonContextMenuAreaKt;
import androidx.compose.p001foundation.text.TextContextMenuItems;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0011\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "", "content", "b", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "Lcom/google/android/brc;", "Landroid/content/res/Resources;", "resources", "Landroidx/compose/foundation/text/TextContextMenuItems;", "item", "", "enabled", "Lkotlin/Function1;", "Lcom/google/android/rrc;", "onClick", "d", "(Lcom/google/android/brc;Landroid/content/res/Resources;Landroidx/compose/foundation/text/TextContextMenuItems;ZLkotlin/jvm/functions/Function1;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d22 {
    public static final void b(final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(2080741862);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function2) ? 32 : 16;
        }
        if (dVarF.g((i2 & 19) != 18, i2 & 1)) {
            if (e.k()) {
                e.o(2080741862, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:33)");
            }
            CommonContextMenuAreaKt.d(textFieldSelectionManager, function2, dVarF, i2 & 126);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.c22
                public final Object invoke(Object obj, Object obj2) {
                    return d22.c(textFieldSelectionManager, function2, i, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(TextFieldSelectionManager textFieldSelectionManager, Function2 function2, int i, d dVar, int i2) {
        b(textFieldSelectionManager, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    public static final void d(brc brcVar, Resources resources, TextContextMenuItems textContextMenuItems, boolean z, Function1<? super rrc, Unit> function1) {
        if (z) {
            drc.a(brcVar, textContextMenuItems.getKey(), resources.getString(textContextMenuItems.getStringId()), textContextMenuItems.getDrawableId(), function1);
        }
    }
}
