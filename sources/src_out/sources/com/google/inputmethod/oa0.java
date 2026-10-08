package com.google.inputmethod;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class oa0 {
    private final Object a;

    private oa0(AutofillId autofillId) {
        this.a = autofillId;
    }

    public static oa0 b(AutofillId autofillId) {
        return new oa0(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.a;
    }
}
