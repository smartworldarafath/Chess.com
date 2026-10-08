package com.google.inputmethod;

import android.os.Build;
import android.view.View;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/android/fl9;", "a", "(Landroidx/compose/runtime/d;I)Lcom/google/android/fl9;", "com/google/android/gl9$a", "Lcom/google/android/gl9$a;", "getRobolectricImpl$annotations", "()V", "RobolectricImpl", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class gl9 {
    private static final a a;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/google/android/gl9$a", "Lcom/google/android/fl9;", "Lcom/google/android/dl9;", "prefetchRequest", "", "a", "(Lcom/google/android/dl9;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements fl9 {
        a() {
        }

        @Override // com.google.inputmethod.fl9
        public void a(dl9 prefetchRequest) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    static {
        a aVar;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.e(lowerCase, "robolectric")) {
                aVar = new a();
            } else {
                aVar = null;
            }
        } else {
            aVar = null;
        }
        a = aVar;
    }

    public static final fl9 a(d dVar, int i) {
        if (e.k()) {
            e.o(1141871251, i, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
        }
        fl9 fl9Var = a;
        if (fl9Var != null) {
            dVar.y(1345554384);
        } else {
            dVar.y(1345603457);
            View view = (View) dVar.v(AndroidCompositionLocals_androidKt.g());
            boolean zX = dVar.x(view);
            Object objR = dVar.R();
            if (zX || objR == d.INSTANCE.a()) {
                Object tag = view.getTag(wy9.a);
                Object umVar = tag instanceof fl9 ? (fl9) tag : null;
                if (umVar == null) {
                    umVar = new um(view);
                    view.setTag(wy9.a, umVar);
                }
                objR = umVar;
                dVar.L(objR);
            }
            fl9Var = (fl9) objR;
        }
        dVar.u();
        if (e.k()) {
            e.n();
        }
        return fl9Var;
    }
}
