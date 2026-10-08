package com.google.inputmethod;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.k;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class sv extends k {
    @Override // androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        return new rv(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.k
    public void setupDialog(Dialog dialog, int i) {
        if (!(dialog instanceof rv)) {
            super.setupDialog(dialog, i);
            return;
        }
        rv rvVar = (rv) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        rvVar.m(1);
    }
}
