package com.google.inputmethod;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u0011\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0015\u0010\u0013\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e\"\u0015\u0010\u0015\u001a\u00020\f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e*\n\u0010\u0017\"\u00020\u00162\u00020\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/oi6;", "Lcom/google/android/ii6;", "a", "(Landroid/view/KeyEvent;)J", "key", "", "c", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "Lcom/google/android/ri6;", "b", "type", "", "d", "(Landroid/view/KeyEvent;)Z", "isAltPressed", "e", "isCtrlPressed", "f", "isMetaPressed", "g", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class si6 {
    public static final long a(KeyEvent keyEvent) {
        return lj6.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? ri6.INSTANCE.c() : ri6.INSTANCE.b();
        }
        return ri6.INSTANCE.a();
    }

    public static final int c(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    public static final boolean e(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    public static final boolean g(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
