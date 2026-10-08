package com.google.inputmethod;

import androidx.core.app.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/core/app/ComponentActivity;", "", "b", "(Landroidx/core/app/ComponentActivity;)Z", "c", "a", "misc_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class bn1 {
    public static final boolean a(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return !c(componentActivity);
    }

    public static final boolean b(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return componentActivity.getLifecycleRegistry().getState().c(Lifecycle.State.RESUMED);
    }

    public static final boolean c(ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        return b(componentActivity) && !componentActivity.isFinishing();
    }
}
