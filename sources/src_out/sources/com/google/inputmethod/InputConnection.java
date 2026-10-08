package com.google.inputmethod;

import android.os.Build;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.google.android.xk8, reason: from Kotlin metadata */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Lcom/google/android/qk8;", "", "onConnectionClosed", "a", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)Lcom/google/android/qk8;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class InputConnection {
    public static final qk8 a(android.view.inputmethod.InputConnection inputConnection, Function1<? super qk8, Unit> function1) {
        return Build.VERSION.SDK_INT >= 34 ? new wk8(inputConnection, function1) : new tk8(inputConnection, function1);
    }
}
