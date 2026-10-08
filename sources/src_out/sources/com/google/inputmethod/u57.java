package com.google.inputmethod;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/u57;", "", "<init>", "()V", "Lcom/google/android/ks9;", "Lcom/google/android/u9;", "b", "Lcom/google/android/ks9;", "LocalComposition", "c", "(Landroidx/compose/runtime/d;I)Lcom/google/android/u9;", "current", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u57 {
    public static final u57 a = new u57();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ks9<u9> LocalComposition = fs1.h(null, new Function0() { // from class: com.google.android.t57
        public final Object invoke() {
            return u57.b();
        }
    }, 1, null);

    private u57() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u9 b() {
        return null;
    }

    public final u9 c(d dVar, int i) {
        if (e.k()) {
            e.o(1418020823, i, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
        }
        u9 u9Var = (u9) dVar.v(LocalComposition);
        if (u9Var == null) {
            dVar.y(1213380307);
            Object baseContext = (Context) dVar.v(AndroidCompositionLocals_androidKt.c());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof u9) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            u9Var = (u9) baseContext;
        } else {
            dVar.y(1213379439);
        }
        dVar.u();
        if (e.k()) {
            e.n();
        }
        return u9Var;
    }
}
