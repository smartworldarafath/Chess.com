package com.google.inputmethod;

import android.view.autofill.AutofillValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/google/android/sk;", "Lcom/google/android/t94;", "Landroid/view/autofill/AutofillValue;", "autofillValue", "<init>", "(Landroid/view/autofill/AutofillValue;)V", "b", "Landroid/view/autofill/AutofillValue;", "()Landroid/view/autofill/AutofillValue;", "", "a", "()Ljava/lang/CharSequence;", "textValue", "", "getBooleanValue", "()Ljava/lang/Boolean;", "booleanValue", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sk implements t94 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AutofillValue autofillValue;

    public sk(AutofillValue autofillValue) {
        this.autofillValue = autofillValue;
    }

    @Override // com.google.inputmethod.t94
    public CharSequence a() {
        if (this.autofillValue.isText()) {
            return this.autofillValue.getTextValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AutofillValue getAutofillValue() {
        return this.autofillValue;
    }

    @Override // com.google.inputmethod.t94
    public Boolean getBooleanValue() {
        if (this.autofillValue.isToggle()) {
            return Boolean.valueOf(this.autofillValue.getToggleValue());
        }
        return null;
    }
}
