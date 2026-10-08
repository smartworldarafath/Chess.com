package com.google.inputmethod;

import androidx.compose.ui.text.TextLayoutInput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/sxc;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/u;", "key", "Lcom/google/android/vxc;", "a", "(Landroidx/compose/ui/text/u;)Lcom/google/android/vxc;", "value", "", "b", "(Landroidx/compose/ui/text/u;Lcom/google/android/vxc;)V", "Lcom/google/android/dd7;", "Lcom/google/android/d11;", "Lcom/google/android/dd7;", "cache", "Lcom/google/android/d11;", "singleSizeCacheInput", "c", "Lcom/google/android/vxc;", "singleSizeCacheResult", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class sxc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final dd7<d11, TextLayoutResult> cache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private d11 singleSizeCacheInput;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TextLayoutResult singleSizeCacheResult;

    public sxc(int i) {
        this.cache = i != 1 ? new dd7<>(i) : null;
    }

    public final TextLayoutResult a(TextLayoutInput key) {
        TextLayoutResult textLayoutResultD;
        d11 d11Var = new d11(key);
        dd7<d11, TextLayoutResult> dd7Var = this.cache;
        if (dd7Var != null) {
            textLayoutResultD = dd7Var.d(d11Var);
        } else {
            if (!Intrinsics.e(this.singleSizeCacheInput, d11Var)) {
                return null;
            }
            textLayoutResultD = this.singleSizeCacheResult;
        }
        if (textLayoutResultD == null || textLayoutResultD.getMultiParagraph().getIntrinsics().c()) {
            return null;
        }
        return textLayoutResultD;
    }

    public final void b(TextLayoutInput key, TextLayoutResult value) {
        dd7<d11, TextLayoutResult> dd7Var = this.cache;
        if (dd7Var != null) {
            dd7Var.f(new d11(key), value);
        } else {
            this.singleSizeCacheInput = new d11(key);
            this.singleSizeCacheResult = value;
        }
    }
}
