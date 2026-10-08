package com.google.inputmethod;

import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/b;", "Landroidx/compose/foundation/text/input/internal/b;", "serviceAdapter", "Lcom/google/android/k07;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "a", "(Landroidx/compose/ui/b;Landroidx/compose/foundation/text/input/internal/b;Lcom/google/android/k07;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class yz6 {
    public static final b a(b bVar, androidx.compose.p001foundation.text.input.internal.b bVar2, k07 k07Var, TextFieldSelectionManager textFieldSelectionManager) {
        return bVar.then(new LegacyAdaptingPlatformTextInputModifier(bVar2, k07Var, textFieldSelectionManager));
    }
}
