package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0016\u001a\u00060\u0013j\u0002`\u00142\f\b\u0002\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\n\u001a\u00020\u00042\n\u0010\u0018\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\n\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\bR$\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u001a\u0010!\u001a\u00060\u001ej\u0002`\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010\u0005\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001b¨\u0006&"}, d2 = {"Lcom/google/android/gwb;", "", "<init>", "()V", "", "index", "", "h", "(I)V", "g", "a", "b", "i", "(II)V", "atLeast", "c", "()I", "handle", "d", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "default", "e", "(J)J", "value", "(J)I", "f", "I", "getSize", "size", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "[J", "values", "", "[I", "handles", "firstFreeHandle", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class gwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long[] values = kwb.b(16);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int[] index = new int[16];

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int[] handles;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int firstFreeHandle;

    public gwb() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.handles = iArr;
    }

    private final int b() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            f.q(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i4 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i4];
        return i4;
    }

    private final void c(int atLeast) {
        int length = this.values.length;
        if (atLeast <= length) {
            return;
        }
        int i = length * 2;
        long[] jArrB = kwb.b(i);
        int[] iArr = new int[i];
        f.r(this.values, jArrB, 0, 0, 0, 12, (Object) null);
        f.q(this.index, iArr, 0, 0, 0, 14, (Object) null);
        this.values = jArrB;
        this.index = iArr;
    }

    private final void d(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    private final void g(int index) {
        long[] jArr = this.values;
        int i = this.size >> 1;
        while (index < i) {
            int i2 = (index + 1) << 1;
            int i3 = i2 - 1;
            if (i2 >= this.size || Intrinsics.j(jArr[i2], jArr[i3]) >= 0) {
                if (Intrinsics.j(jArr[i3], jArr[index]) >= 0) {
                    return;
                }
                i(i3, index);
                index = i3;
            } else {
                if (Intrinsics.j(jArr[i2], jArr[index]) >= 0) {
                    return;
                }
                i(i2, index);
                index = i2;
            }
        }
    }

    private final void h(int index) {
        long[] jArr = this.values;
        long j = jArr[index];
        while (index > 0) {
            int i = ((index + 1) >> 1) - 1;
            if (Intrinsics.j(jArr[i], j) <= 0) {
                return;
            }
            i(i, index);
            index = i;
        }
    }

    private final void i(int a, int b) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j = jArr[a];
        jArr[a] = jArr[b];
        jArr[b] = j;
        int i = iArr[a];
        int i2 = iArr[b];
        iArr[a] = i2;
        iArr[b] = i;
        iArr2[i2] = a;
        iArr2[i] = b;
    }

    public final int a(long value) {
        c(this.size + 1);
        int i = this.size;
        this.size = i + 1;
        int iB = b();
        this.values[i] = value;
        this.index[i] = iB;
        this.handles[iB] = i;
        h(i);
        return iB;
    }

    public final long e(long j) {
        return this.size > 0 ? this.values[0] : j;
    }

    public final void f(int handle) {
        int i = this.handles[handle];
        i(i, this.size - 1);
        this.size--;
        h(i);
        g(i);
        d(handle);
    }
}
