package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/bfb;", "", "d", "(Lcom/google/android/bfb;)V", "Landroidx/compose/ui/b$c;", "", "useMinimumTouchTarget", "clipBounds", "Lcom/google/android/gba;", "b", "(Landroidx/compose/ui/b$c;ZZ)Lcom/google/android/gba;", "Lcom/google/android/kn6;", "a", "(Lcom/google/android/kn6;Z)Lcom/google/android/gba;", "Lcom/google/android/seb;", "c", "(Lcom/google/android/seb;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class cfb {
    public static final gba a(kn6 kn6Var, boolean z) {
        return ln6.f(kn6Var).R(kn6Var, z);
    }

    public static final gba b(b.c cVar, boolean z, boolean z2) {
        if (cVar.getNode().getIsAttached()) {
            return !z ? a(y23.l(cVar, ni8.a(8)), z2) : y23.l(cVar, ni8.a(8)).d4();
        }
        return gba.INSTANCE.a();
    }

    public static final boolean c(seb sebVar) {
        return SemanticsConfigurationKt.a(sebVar, SemanticsActions.a.l()) != null;
    }

    public static final void d(bfb bfbVar) {
        y23.q(bfbVar).W0();
    }
}
