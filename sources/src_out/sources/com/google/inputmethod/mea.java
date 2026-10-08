package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/google/android/mea;", "Lcom/google/android/kzb;", "parent", "", "index", "<init>", "(Lcom/google/android/kzb;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lcom/google/android/kzb;", "getParent", "()Lcom/google/android/kzb;", "b", "I", "getIndex", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class mea extends kzb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final kzb parent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int index;

    public mea(kzb kzbVar, int i) {
        super(null);
        this.parent = kzbVar;
        this.index = i;
    }

    public boolean equals(Object other) {
        if (!(other instanceof mea)) {
            return false;
        }
        mea meaVar = (mea) other;
        return Intrinsics.e(meaVar.parent, this.parent) && meaVar.index == this.index;
    }

    public int hashCode() {
        return (this.index * 31) + this.parent.hashCode();
    }
}
