package com.google.inputmethod;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.x;
import kotlin.Metadata;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/cwc;", "Landroid/view/inputmethod/ExtractedText;", "b", "(Lcom/google/android/cwc;)Landroid/view/inputmethod/ExtractedText;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class eba {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText b(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.m();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.m().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = x.l(textFieldValue.getSelection());
        extractedText.selectionEnd = x.k(textFieldValue.getSelection());
        extractedText.flags = !h.f0(textFieldValue.m(), '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }
}
