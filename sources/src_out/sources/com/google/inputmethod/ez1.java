package com.google.inputmethod;

import androidx.compose.ui.autofill.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0001\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "dataType", "Landroidx/compose/ui/autofill/c;", "a", "(I)Landroidx/compose/ui/autofill/c;", "b", "(Landroidx/compose/ui/autofill/c;)I", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ez1 {
    public static final c a(int i) {
        return ek.a(ek.b(i));
    }

    public static final int b(c cVar) {
        Intrinsics.h(cVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((ek) cVar).getAndroidAutofillType();
    }
}
