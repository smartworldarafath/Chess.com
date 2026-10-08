package com.google.inputmethod;

import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/t94$a;", "", "textValue", "Lcom/google/android/t94;", "b", "(Lcom/google/android/t94$a;Ljava/lang/CharSequence;)Lcom/google/android/t94;", "", "booleanValue", "a", "(Lcom/google/android/t94$a;Z)Lcom/google/android/t94;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u94 {
    public static final t94 a(t94.Companion companion, boolean z) {
        return new sk(AutofillValue.forToggle(z));
    }

    public static final t94 b(t94.Companion companion, CharSequence charSequence) {
        return new sk(AutofillValue.forText(charSequence));
    }
}
