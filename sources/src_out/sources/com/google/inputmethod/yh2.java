package com.google.inputmethod;

import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/yh2;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Lcom/google/android/gba;", "decorationBoxBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lcom/google/android/gba;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class yh2 {
    public static final yh2 a = new yh2();

    private yh2() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, gba decorationBoxBounds) {
        return builder.setEditorBoundsInfo(sh2.a().setEditorBounds(jba.c(decorationBoxBounds)).setHandwritingBounds(jba.c(decorationBoxBounds)).build());
    }
}
