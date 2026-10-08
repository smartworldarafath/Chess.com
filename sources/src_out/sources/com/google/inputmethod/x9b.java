package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.ui.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001ac\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/hab;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseScrolling", "Lcom/google/android/qg4;", "flingBehavior", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/fu0;", "bringIntoViewSpec", "b", "(Landroidx/compose/ui/b;Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;ZZLcom/google/android/qg4;Lcom/google/android/r48;Lcom/google/android/fu0;)Landroidx/compose/ui/b;", "Lcom/google/android/zv8;", "overscrollEffect", "a", "(Landroidx/compose/ui/b;Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;Lcom/google/android/zv8;ZZLcom/google/android/qg4;Lcom/google/android/r48;Lcom/google/android/fu0;)Landroidx/compose/ui/b;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x9b {
    public static final b a(b bVar, hab habVar, Orientation orientation, zv8 zv8Var, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var) {
        return hf1.a(bVar, orientation).then(new w9b(habVar, orientation, z, z2, qg4Var, r48Var, fu0Var, false, zv8Var));
    }

    public static final b b(b bVar, hab habVar, Orientation orientation, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var) {
        return hf1.a(bVar, orientation).then(new w9b(habVar, orientation, z, z2, qg4Var, r48Var, fu0Var, true, null));
    }

    public static /* synthetic */ b c(b bVar, hab habVar, Orientation orientation, zv8 zv8Var, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return a(bVar, habVar, orientation, zv8Var, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : qg4Var, (i & 64) != 0 ? null : r48Var, (i & 128) != 0 ? null : fu0Var);
    }

    public static /* synthetic */ b d(b bVar, hab habVar, Orientation orientation, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return b(bVar, habVar, orientation, z3, z2, (i & 16) != 0 ? null : qg4Var, (i & 32) != 0 ? null : r48Var, (i & 64) != 0 ? null : fu0Var);
    }
}
