package com.google.inputmethod;

import com.google.android.bqd;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/google/android/pg;", "", "Lcom/google/android/t27;", "groupAnchor", "contextAnchor", "<init>", "(Lcom/google/android/t27;Lcom/google/android/t27;)V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "a", "()J", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/t27;", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final t27 groupAnchor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final t27 contextAnchor;

    public pg(t27 t27Var, t27 t27Var2) {
        this.groupAnchor = t27Var;
        this.contextAnchor = t27Var2;
    }

    public final long a() {
        return (((long) bqd.c(this.groupAnchor.getAddress())) & 4294967295L) | (((long) this.contextAnchor.getAddress()) << 32);
    }

    public String toString() {
        return super.toString() + ": " + this.groupAnchor.getAddress() + ':' + this.contextAnchor.getAddress();
    }
}
