package com.google.inputmethod;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/content/Context;", "a", "(Landroid/content/Context;)Landroid/content/Context;", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class wa3 {
    public static final Context a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        Intrinsics.g(contextCreateDeviceProtectedStorageContext);
        return contextCreateDeviceProtectedStorageContext;
    }
}
