package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0019J-\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u000fJ\r\u0010$\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u0006."}, d2 = {"Lcom/google/android/s16;", "", "", "initialCapacity", "<init>", "(I)V", "", "stack", "j", "([I)[I", "start", "end", "elSize", "", "i", "(III)V", "e", "(III)I", "l", "(II)V", "a", "b", "", "(II)Z", "index", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "h", "(IIII)V", "x", "y", "size", "g", "f", "()I", "d", "()Z", "k", "()V", "[I", "I", "lastIndex", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s16 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int[] stack;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int lastIndex;

    public s16(int i) {
        this.stack = new int[i];
    }

    private final boolean a(int a, int b) {
        int[] iArr = this.stack;
        int i = iArr[a];
        int i2 = iArr[b];
        return i < i2 || (i == i2 && iArr[a + 1] <= iArr[b + 1]);
    }

    private final int e(int start, int end, int elSize) {
        int i = start - elSize;
        while (start < end) {
            if (a(start, end)) {
                i += elSize;
                l(i, start);
            }
            start += elSize;
        }
        int i2 = i + elSize;
        l(i2, end);
        return i2;
    }

    private final void i(int start, int end, int elSize) {
        if (start < end) {
            int iE = e(start, end, elSize);
            i(start, iE - elSize, elSize);
            i(iE + elSize, end, elSize);
        }
    }

    private final int[] j(int[] stack) {
        int[] iArrCopyOf = Arrays.copyOf(stack, stack.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.stack = iArrCopyOf;
        return iArrCopyOf;
    }

    private final void l(int i, int j) {
        int[] iArr = this.stack;
        b68.i(iArr, i, j);
        b68.i(iArr, i + 1, j + 1);
        b68.i(iArr, i + 2, j + 2);
    }

    public final int b(int index) {
        return this.stack[index];
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final boolean d() {
        return this.lastIndex != 0;
    }

    public final int f() {
        int[] iArr = this.stack;
        int i = this.lastIndex - 1;
        this.lastIndex = i;
        return iArr[i];
    }

    public final void g(int x, int y, int size) {
        int i = this.lastIndex;
        int[] iArrJ = this.stack;
        int i2 = i + 3;
        if (i2 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i] = x + size;
        iArrJ[i + 1] = y + size;
        iArrJ[i + 2] = size;
        this.lastIndex = i2;
    }

    public final void h(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i = this.lastIndex;
        int[] iArrJ = this.stack;
        int i2 = i + 4;
        if (i2 >= iArrJ.length) {
            iArrJ = j(iArrJ);
        }
        iArrJ[i] = oldStart;
        iArrJ[i + 1] = oldEnd;
        iArrJ[i + 2] = newStart;
        iArrJ[i + 3] = newEnd;
        this.lastIndex = i2;
    }

    public final void k() {
        int i = this.lastIndex;
        if (!(i % 3 == 0)) {
            zw5.c("Array size not a multiple of 3");
        }
        if (i > 3) {
            i(0, i - 3, 3);
        }
    }
}
