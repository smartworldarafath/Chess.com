package com.google.inputmethod;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/vxc;", "", "offset", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "a", "(Lcom/google/android/vxc;I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "", "b", "(Lcom/google/android/vxc;I)Z", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class geb {
    public static final ResolvedTextDirection a(TextLayoutResult vxcVar, int i) {
        return b(vxcVar, i) ? vxcVar.y(i) : vxcVar.c(i);
    }

    private static final boolean b(TextLayoutResult vxcVar, int i) {
        if (vxcVar.getLayoutInput().getText().length() != 0) {
            int iQ = vxcVar.q(i);
            if (i != 0 && iQ == vxcVar.q(i - 1)) {
                return false;
            }
            if (i != vxcVar.getLayoutInput().getText().length() && iQ == vxcVar.q(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
