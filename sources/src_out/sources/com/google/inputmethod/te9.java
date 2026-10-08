package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u0003J\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0011R$\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!¨\u0006#"}, d2 = {"Lcom/google/android/te9;", "", "<init>", "()V", "", "minSize", "", "i", "(I)[J", "index", "Lcom/google/android/se9;", "d", "(I)J", "", "pointerIdValue", "", "g", "(J)Z", "h", "(I)Z", "f", "()Z", "value", "a", "", "j", "(IJ)V", "b", "c", "I", "e", "()I", "size", "[J", "internalArray", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class te9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long[] internalArray = new long[2];

    private final long[] i(int minSize) {
        long[] jArr = this.internalArray;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(minSize, jArr.length * 2));
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.internalArray = jArrCopyOf;
        return jArrCopyOf;
    }

    public final boolean a(long value) {
        if (c(value)) {
            return false;
        }
        j(this.size, value);
        return true;
    }

    public final void b() {
        this.size = 0;
    }

    public final boolean c(long pointerIdValue) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.internalArray[i2] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    public final long d(int index) {
        return se9.a(this.internalArray[index]);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean f() {
        return this.size == 0;
    }

    public final boolean g(long pointerIdValue) {
        int i = this.size;
        int i2 = 0;
        while (i2 < i) {
            if (pointerIdValue == this.internalArray[i2]) {
                int i3 = this.size - 1;
                while (i2 < i3) {
                    long[] jArr = this.internalArray;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.size--;
                return true;
            }
            i2++;
        }
        return false;
    }

    public final boolean h(int index) {
        int i = this.size;
        if (index >= i) {
            return false;
        }
        int i2 = i - 1;
        while (index < i2) {
            long[] jArr = this.internalArray;
            int i3 = index + 1;
            jArr[index] = jArr[i3];
            index = i3;
        }
        this.size--;
        return true;
    }

    public final void j(int index, long value) {
        long[] jArrI = this.internalArray;
        if (index >= jArrI.length) {
            jArrI = i(index + 1);
        }
        jArrI[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }
}
