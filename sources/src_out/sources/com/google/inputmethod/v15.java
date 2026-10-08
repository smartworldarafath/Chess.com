package com.google.inputmethod;

import com.google.android.bqd;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0003\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001c\u0010\u000b\u001a\u00020\u0000*\u00060\u0005j\u0002`\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001c\u0010\u0004\u001a\u00020\u0000*\u00060\u0005j\u0002`\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n*\f\b\u0000\u0010\r\"\u00020\u00052\u00020\u0005¨\u0006\u000e"}, d2 = {"", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "parent", "predecessor", "group", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "c", "(III)J", "a", "(J)I", "context", "b", "GroupHandle", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v15 {
    public static final int a(long j) {
        return (int) (j >>> 32);
    }

    public static final int b(long j) {
        return (int) j;
    }

    public static final long c(int i, int i2, int i3) {
        long j;
        int iC;
        if (i3 >= 0) {
            j = ((long) i2) << 32;
            iC = bqd.c(i3);
        } else {
            j = ((long) i) << 32;
            iC = bqd.c(-1);
        }
        return j | (4294967295L & ((long) iC));
    }
}
