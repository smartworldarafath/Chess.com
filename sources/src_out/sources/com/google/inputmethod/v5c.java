package com.google.inputmethod;

import android.content.Intent;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Intent;", "intent", "Lcom/google/android/v7;", "parameters", "Lcom/google/android/l7;", "a", "(Landroid/content/Intent;Lcom/google/android/v7;)Lcom/google/android/l7;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v5c {
    public static final l7 a(Intent intent, v7 v7Var) {
        return new u5c(intent, v7Var, null);
    }

    public static /* synthetic */ l7 b(Intent intent, v7 v7Var, int i, Object obj) {
        if ((i & 2) != 0) {
            v7Var = w7.a(new v7.b[0]);
        }
        return a(intent, v7Var);
    }
}
