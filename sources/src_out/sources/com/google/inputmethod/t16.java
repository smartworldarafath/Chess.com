package com.google.inputmethod;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0003J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/google/android/t16;", "", "<init>", "()V", "", "j", "()[I", "", "value", "", "i", "(I)V", "g", "()I", "default", "h", "(I)I", "f", "c", "e", "index", "d", "a", "b", "[I", "slots", "I", "tos", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t16 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int[] slots = new int[10];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int tos;

    private final int[] j() {
        int[] iArr = this.slots;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.slots = iArrCopyOf;
        return iArrCopyOf;
    }

    public final void a() {
        this.tos = 0;
    }

    public final int b(int value) {
        int[] iArr = this.slots;
        int iMin = Math.min(iArr.length, this.tos);
        for (int i = 0; i < iMin; i++) {
            if (iArr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public final int c() {
        return this.slots[this.tos - 1];
    }

    public final int d(int index) {
        return this.slots[index];
    }

    public final int e() {
        return this.slots[this.tos - 2];
    }

    public final int f(int i) {
        int i2 = this.tos - 1;
        return i2 >= 0 ? this.slots[i2] : i;
    }

    public final int g() {
        int[] iArr = this.slots;
        int i = this.tos - 1;
        this.tos = i;
        return iArr[i];
    }

    public final int h(int i) {
        int i2 = this.tos;
        if (i2 <= 0) {
            return i;
        }
        int[] iArr = this.slots;
        int i3 = i2 - 1;
        this.tos = i3;
        return iArr[i3];
    }

    public final void i(int value) {
        int[] iArrJ = this.slots;
        if (this.tos >= iArrJ.length) {
            iArrJ = j();
        }
        int i = this.tos;
        this.tos = i + 1;
        iArrJ[i] = value;
    }
}
