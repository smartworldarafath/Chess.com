package com.google.inputmethod;

import android.os.Trace;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/bcd;", "", "<init>", "()V", "", "methodName", "", "cookie", "", "a", "(Ljava/lang/String;I)V", "b", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class bcd {
    public static final bcd a = new bcd();

    private bcd() {
    }

    public final void a(String methodName, int cookie) {
        Trace.beginAsyncSection(methodName, cookie);
    }

    public final void b(String methodName, int cookie) {
        Trace.endAsyncSection(methodName, cookie);
    }
}
