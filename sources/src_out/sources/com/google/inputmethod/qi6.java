package com.google.inputmethod;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/android/oi6;", "", "a", "(Landroid/view/KeyEvent;)Z", "", "b", "()V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class qi6 {
    public static final boolean a(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && ri6.e(si6.b(keyEvent), ri6.INSTANCE.b());
    }

    public static final void b() {
    }
}
