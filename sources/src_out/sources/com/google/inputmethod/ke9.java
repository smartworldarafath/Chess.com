package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\"\u0015\u0010\r\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006*\f\b\u0000\u0010\u000f\"\u00020\u000e2\u00020\u000e*\f\b\u0000\u0010\u0010\"\u00020\u000e2\u00020\u000e¨\u0006\u0011"}, d2 = {"Lcom/google/android/ff9;", "a", "()I", "Lcom/google/android/he9;", "", "c", "(I)Z", "isPrimaryPressed", "d", "isSecondaryPressed", "b", "isAltPressed", "e", "isShiftPressed", "", "NativePointerButtons", "NativePointerKeyboardModifiers", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ke9 {
    public static final int a() {
        return ff9.b(0);
    }

    public static final boolean b(int i) {
        return (i & 2) != 0;
    }

    public static final boolean c(int i) {
        return (i & 33) != 0;
    }

    public static final boolean d(int i) {
        return (i & 66) != 0;
    }

    public static final boolean e(int i) {
        return (i & 1) != 0;
    }
}
