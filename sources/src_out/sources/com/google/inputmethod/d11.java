package com.google.inputmethod;

import androidx.compose.ui.text.TextLayoutInput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/d11;", "", "Landroidx/compose/ui/text/u;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/u;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/text/u;", "getTextLayoutInput", "()Landroidx/compose/ui/text/u;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d11 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextLayoutInput textLayoutInput;

    public d11(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d11)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        d11 d11Var = (d11) other;
        return Intrinsics.e(textLayoutInput.getText(), d11Var.textLayoutInput.getText()) && textLayoutInput.getStyle().G(d11Var.textLayoutInput.getStyle()) && Intrinsics.e(textLayoutInput.g(), d11Var.textLayoutInput.g()) && textLayoutInput.getMaxLines() == d11Var.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == d11Var.textLayoutInput.getSoftWrap() && uyc.g(textLayoutInput.getOverflow(), d11Var.textLayoutInput.getOverflow()) && Intrinsics.e(textLayoutInput.getDensity(), d11Var.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == d11Var.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == d11Var.textLayoutInput.getFontFamilyResolver() && kx1.f(textLayoutInput.getConstraints(), d11Var.textLayoutInput.getConstraints());
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().H()) * 31) + textLayoutInput.g().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + Boolean.hashCode(textLayoutInput.getSoftWrap())) * 31) + uyc.h(textLayoutInput.getOverflow())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + kx1.o(textLayoutInput.getConstraints());
    }
}
