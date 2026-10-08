package com.google.inputmethod;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/v17;", "Lcom/google/android/n17;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "a", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle-runtime-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v17 implements n17 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lifecycle lifecycle;

    public v17(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // com.google.inputmethod.n17
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
