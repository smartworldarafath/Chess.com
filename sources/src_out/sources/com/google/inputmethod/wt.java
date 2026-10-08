package com.google.inputmethod;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/wt;", "", "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", "imm", "Landroid/view/View;", "view", "", "a", "(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class wt {
    public static final wt a = new wt();

    private wt() {
    }

    public final void a(InputMethodManager imm, View view) {
        imm.startStylusHandwriting(view);
    }
}
