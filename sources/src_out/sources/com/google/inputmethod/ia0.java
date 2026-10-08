package com.google.inputmethod;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/ia0;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/view/autofill/AutofillManager;", "autofillManager", "", "semanticsId", "", "isVisible", "", "a", "(Landroid/view/View;Landroid/view/autofill/AutofillManager;IZ)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ia0 {
    public static final ia0 a = new ia0();

    private ia0() {
    }

    public final void a(View view, AutofillManager autofillManager, int semanticsId, boolean isVisible) {
        autofillManager.notifyViewVisibilityChanged(view, semanticsId, isVisible);
    }
}
