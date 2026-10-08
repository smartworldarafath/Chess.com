package com.google.inputmethod;

import android.content.ClipboardManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/nt;", "", "<init>", "()V", "Landroid/content/ClipboardManager;", "clipboardManager", "", "a", "(Landroid/content/ClipboardManager;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class nt {
    public static final nt a = new nt();

    private nt() {
    }

    public static final void a(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
