package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/b;", "Lcom/google/android/re8;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "a", "(Landroidx/compose/ui/b;Lcom/google/android/re8;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)Landroidx/compose/ui/b;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ue8 {
    public static final b a(b bVar, re8 re8Var, NestedScrollDispatcher nestedScrollDispatcher) {
        return bVar.then(new se8(re8Var, nestedScrollDispatcher));
    }

    public static /* synthetic */ b b(b bVar, re8 re8Var, NestedScrollDispatcher nestedScrollDispatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return a(bVar, re8Var, nestedScrollDispatcher);
    }
}
