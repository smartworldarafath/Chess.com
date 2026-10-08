package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/jwb;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "array", "<init>", "([J)V", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "id", "", "a", "(J)V", "b", "()[J", "Lcom/google/android/v48;", "Lcom/google/android/v48;", "list", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final v48 list;

    public jwb(long[] jArr) {
        v48 v48Var;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            v48Var = new v48(jArrCopyOf.length);
            v48Var.e(v48Var._size, jArrCopyOf);
        } else {
            v48Var = new v48(0, 1, null);
        }
        this.list = v48Var;
    }

    public final void a(long id) {
        this.list.d(id);
    }

    public final long[] b() {
        v48 v48Var = this.list;
        int i = v48Var._size;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = v48Var.content;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }
}
