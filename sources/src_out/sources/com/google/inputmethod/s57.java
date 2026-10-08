package com.google.inputmethod;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/google/android/ks9;", "Landroid/app/Activity;", "a", "Lcom/google/android/ks9;", "c", "()Lcom/google/android/ks9;", "LocalActivity", "activity-compose"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s57 {
    private static final ks9<Activity> a = fs1.i(new Function1() { // from class: com.google.android.r57
        public final Object invoke(Object obj) {
            return s57.b((as1) obj);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity b(as1 as1Var) {
        Context baseContext = (Context) as1Var.L(AndroidCompositionLocals_androidKt.c());
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        baseContext = null;
        return (Activity) baseContext;
    }

    public static final ks9<Activity> c() {
        return a;
    }
}
