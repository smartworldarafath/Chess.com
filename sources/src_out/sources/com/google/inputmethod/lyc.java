package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003*\u0018\b\u0000\u0010\u0006\"\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0007"}, d2 = {"Lcom/google/android/myc;", "", "b", "(Lcom/google/android/myc;)Z", "Landroidx/compose/ui/text/b$d;", "Landroidx/compose/ui/text/f;", "LinkRange", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class lyc {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(myc mycVar) {
        if (mycVar != null) {
            return mycVar.getStyle() == null && mycVar.getFocusedStyle() == null && mycVar.getHoveredStyle() == null && mycVar.getPressedStyle() == null;
        }
        return true;
    }
}
