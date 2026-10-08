package com.google.inputmethod;

import androidx.compose.p001foundation.text.selection.Selection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/neb;", "", "selectableId", "", "d", "(Lcom/google/android/neb;J)Z", "Lcom/google/android/ks9;", "a", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "LocalSelectionRegistrar", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class peb {
    private static final ks9<neb> a = fs1.h(null, new Function0() { // from class: com.google.android.oeb
        public final Object invoke() {
            return peb.b();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final neb b() {
        return null;
    }

    public static final ks9<neb> c() {
        return a;
    }

    public static final boolean d(neb nebVar, long j) {
        x97<Selection> x97VarF;
        if (nebVar == null || (x97VarF = nebVar.f()) == null) {
            return false;
        }
        return x97VarF.a(j);
    }
}
