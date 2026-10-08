package com.google.inputmethod;

import androidx.compose.p004runtime.snapshots.i;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0006R$\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/google/android/c7c;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "()V", "value", "", "c", "(Lcom/google/android/c7c;)V", "d", "()Lcom/google/android/c7c;", "e", "(J)Lcom/google/android/c7c;", "a", "J", "g", "()J", "i", "b", "Lcom/google/android/c7c;", "f", "h", "next", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c7c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long snapshotId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private c7c next;

    public c7c(long j) {
        this.snapshotId = j;
    }

    public abstract void c(c7c value);

    public abstract c7c d();

    public c7c e(long snapshotId) {
        c7c c7cVarD = d();
        c7cVarD.snapshotId = snapshotId;
        return c7cVarD;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c7c getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSnapshotId() {
        return this.snapshotId;
    }

    public final void h(c7c c7cVar) {
        this.next = c7cVar;
    }

    public final void i(long j) {
        this.snapshotId = j;
    }

    public c7c() {
        this(i.K().getSnapshotId());
    }
}
