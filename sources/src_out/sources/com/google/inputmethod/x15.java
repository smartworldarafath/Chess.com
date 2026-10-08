package com.google.inputmethod;

import com.google.android.fh6;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00060\u0005j\u0002`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/google/android/x15;", "", "Lcom/google/android/xr1;", "Lcom/google/android/eub;", "table", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "address", "<init>", "(Lcom/google/android/eub;I)V", "", "b", "()V", "", "hasNext", "()Z", "a", "()Lcom/google/android/xr1;", "Lcom/google/android/eub;", "getTable", "()Lcom/google/android/eub;", "I", "nextGroup", "c", "version", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class x15 implements Iterator<xr1>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final eub table;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int nextGroup;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int version;

    public x15(eub eubVar, int i) {
        this.table = eubVar;
        this.nextGroup = i;
        this.version = eubVar.getVersion();
        if (eubVar.B()) {
            sub.o();
        }
    }

    private final void b() {
        if (this.table.getVersion() != this.version) {
            sub.o();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xr1 next() {
        b();
        int i = this.nextGroup;
        this.nextGroup = this.table.N(i);
        return new oub(this.table, i, this.version);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.nextGroup != -1;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
