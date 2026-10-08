package com.google.inputmethod;

import com.google.android.fh6;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/google/android/y15;", "", "Lcom/google/android/xr1;", "Lcom/google/android/fub;", "table", "", "start", "end", "<init>", "(Lcom/google/android/fub;II)V", "", "b", "()V", "", "hasNext", "()Z", "a", "()Lcom/google/android/xr1;", "Lcom/google/android/fub;", "getTable", "()Lcom/google/android/fub;", "I", "getEnd", "()I", "c", "index", "d", "version", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y15 implements Iterator<xr1>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final fub table;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int version;

    public y15(fub fubVar, int i, int i2) {
        this.table = fubVar;
        this.end = i2;
        this.index = i;
        this.version = fubVar.getVersion();
        if (fubVar.getWriter()) {
            tub.y();
        }
    }

    private final void b() {
        if (this.table.getVersion() != this.version) {
            tub.y();
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xr1 next() {
        b();
        int i = this.index;
        this.index = tub.s(this.table.getGroups(), i) + i;
        return new pub(this.table, i, this.version);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.end;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
