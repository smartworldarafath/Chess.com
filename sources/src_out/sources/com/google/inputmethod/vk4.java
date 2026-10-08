package com.google.inputmethod;

import androidx.compose.ui.b;
import androidx.compose.ui.focus.FocusProperties;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/google/android/vk4;", "Lcom/google/android/tk4;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/wk4;", "focusPropertiesScope", "<init>", "(Lcom/google/android/wk4;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "", "m2", "(Landroidx/compose/ui/focus/FocusProperties;)V", "p", "Lcom/google/android/wk4;", "getFocusPropertiesScope", "()Lcom/google/android/wk4;", "m3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class vk4 extends b.c implements tk4 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private wk4 focusPropertiesScope;

    public vk4(wk4 wk4Var) {
        this.focusPropertiesScope = wk4Var;
    }

    @Override // com.google.inputmethod.tk4
    public void m2(FocusProperties focusProperties) {
        this.focusPropertiesScope.a(focusProperties);
    }

    public final void m3(wk4 wk4Var) {
        this.focusPropertiesScope = wk4Var;
    }
}
