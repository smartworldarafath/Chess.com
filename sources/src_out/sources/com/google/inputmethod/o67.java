package com.google.inputmethod;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/android/o67;", "", "<init>", "()V", "Lcom/google/android/ks9;", "Lcom/google/android/lq8;", "b", "Lcom/google/android/ks9;", "LocalOnBackPressedDispatcherOwner", "c", "(Landroidx/compose/runtime/d;I)Lcom/google/android/lq8;", "current", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o67 {
    public static final o67 a = new o67();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final ks9<lq8> LocalOnBackPressedDispatcherOwner = fs1.h(null, new Function0() { // from class: com.google.android.n67
        public final Object invoke() {
            return o67.b();
        }
    }, 1, null);

    private o67() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lq8 b() {
        return null;
    }

    public final lq8 c(d dVar, int i) {
        if (e.k()) {
            e.o(-2068013981, i, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:59)");
        }
        lq8 lq8VarA = (lq8) dVar.v(LocalOnBackPressedDispatcherOwner);
        if (lq8VarA == null) {
            dVar.y(1208426157);
            lq8VarA = hbe.a((View) dVar.v(AndroidCompositionLocals_androidKt.g()));
        } else {
            dVar.y(1208423708);
        }
        dVar.u();
        if (lq8VarA == null) {
            dVar.y(1208428160);
            Object baseContext = (Context) dVar.v(AndroidCompositionLocals_androidKt.c());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof lq8) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            lq8VarA = (lq8) baseContext;
        } else {
            dVar.y(1208423789);
        }
        dVar.u();
        if (e.k()) {
            e.n();
        }
        return lq8VarA;
    }
}
