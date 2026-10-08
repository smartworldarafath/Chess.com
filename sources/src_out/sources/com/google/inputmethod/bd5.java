package com.google.inputmethod;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.b0;
import com.google.android.ad5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/lifecycle/b0$c;", "delegateFactory", "a", "(Landroid/content/Context;Landroidx/lifecycle/b0$c;)Landroidx/lifecycle/b0$c;", "hilt-navigation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class bd5 {
    public static final b0.c a(Context context, b0.c cVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cVar, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                b0.c cVarA = ad5.a((ComponentActivity) context, cVar);
                Intrinsics.checkNotNullExpressionValue(cVarA, "createInternal(\n        … */ delegateFactory\n    )");
                return cVarA;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}
