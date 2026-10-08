package com.google.inputmethod;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/android/n17;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "a", "(Lcom/google/android/n17;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleScope", "lifecycle-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o17 {
    public static final LifecycleCoroutineScope a(n17 n17Var) {
        Intrinsics.checkNotNullParameter(n17Var, "<this>");
        return j.a(n17Var.getLifecycleRegistry());
    }
}
