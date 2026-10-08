package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/google/android/c37;", "Lcom/google/android/rr1;", "", "Lcom/google/android/pr1;", "composition", "<init>", "(Lcom/google/android/pr1;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/pr1;", "getComposition", "()Lcom/google/android/pr1;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c37 implements rr1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final pr1 composition;

    public c37(pr1 pr1Var) {
        this.composition = pr1Var;
    }

    public boolean equals(Object other) {
        return (other instanceof c37) && Intrinsics.e(this.composition, ((c37) other).composition);
    }

    public int hashCode() {
        return this.composition.hashCode() * 31;
    }
}
