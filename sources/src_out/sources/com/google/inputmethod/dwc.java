package com.google.inputmethod;

import androidx.compose.ui.text.b;
import androidx.compose.ui.text.x;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/cwc;", "", "maxChars", "Landroidx/compose/ui/text/b;", "c", "(Lcom/google/android/cwc;I)Landroidx/compose/ui/text/b;", "b", "a", "(Lcom/google/android/cwc;)Landroidx/compose/ui/text/b;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class dwc {
    public static final b a(TextFieldValue textFieldValue) {
        return textFieldValue.getText().s(textFieldValue.getSelection());
    }

    public static final b b(TextFieldValue textFieldValue, int i) {
        b text = textFieldValue.getText();
        int iK = x.k(textFieldValue.getSelection());
        int iK2 = x.k(textFieldValue.getSelection());
        int length = iK2 + i;
        if (((i ^ length) & (iK2 ^ length)) < 0) {
            length = textFieldValue.m().length();
        }
        return text.subSequence(iK, Math.min(length, textFieldValue.m().length()));
    }

    public static final b c(TextFieldValue textFieldValue, int i) {
        b text = textFieldValue.getText();
        int iL = x.l(textFieldValue.getSelection());
        int i2 = iL - i;
        if (((i ^ iL) & (iL ^ i2)) < 0) {
            i2 = 0;
        }
        return text.subSequence(Math.max(0, i2), x.l(textFieldValue.getSelection()));
    }
}
