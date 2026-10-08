package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/google/android/o33;", "Lcom/google/android/hyb;", "Lcom/google/android/dxc;", "textInputService", "<init>", "(Lcom/google/android/dxc;)V", "", "show", "()V", "hide", "a", "Lcom/google/android/dxc;", "getTextInputService", "()Lcom/google/android/dxc;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o33 implements hyb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final dxc textInputService;

    public o33(dxc dxcVar) {
        this.textInputService = dxcVar;
    }

    @Override // com.google.inputmethod.hyb
    public void hide() {
        this.textInputService.b();
    }

    @Override // com.google.inputmethod.hyb
    public void show() {
        this.textInputService.c();
    }
}
