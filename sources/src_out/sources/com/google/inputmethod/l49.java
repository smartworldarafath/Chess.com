package com.google.inputmethod;

import com.google.android.fc3;
import com.google.android.pa2;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/l49;", "Lcom/google/android/pa2;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "c0", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "U", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "Lcom/google/android/yb3;", "c", "Lcom/google/android/yb3;", "dispatchQueue", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l49 extends pa2 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final yb3 dispatchQueue = new yb3();

    public void U(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.dispatchQueue.c(context, block);
    }

    public boolean c0(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (fc3.c().t0().c0(context)) {
            return true;
        }
        return !this.dispatchQueue.b();
    }
}
