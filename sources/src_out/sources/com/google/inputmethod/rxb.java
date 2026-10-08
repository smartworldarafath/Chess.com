package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.collections.f;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001f0\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/google/android/rxb;", "", "T", "<init>", "()V", "value", "", "hash", "b", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "c", "(ILjava/lang/Object;I)I", "", "a", "(Ljava/lang/Object;)Z", "I", "e", "()I", "g", "(I)V", "size", "", "[I", "d", "()[I", "setHashes$runtime", "([I)V", "hashes", "", "Lcom/google/android/fee;", "[Lcom/google/android/fee;", "f", "()[Lcom/google/android/fee;", "setValues$runtime", "([Lcom/google/android/fee;)V", "values", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class rxb<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int[] hashes = new int[16];

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private fee<T>[] values = new fee[16];

    private final int b(T value, int hash) {
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int i4 = this.hashes[i3];
            if (i4 < hash) {
                i2 = i3 + 1;
            } else {
                if (i4 <= hash) {
                    fee<T> feeVar = this.values[i3];
                    return value == (feeVar != null ? feeVar.get() : null) ? i3 : c(i3, value, hash);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private final int c(int midIndex, T value, int valueHash) {
        int i = midIndex - 1;
        while (true) {
            if (-1 >= i || this.hashes[i] != valueHash) {
                break;
            }
            fee<T> feeVar = this.values[i];
            if ((feeVar != null ? feeVar.get() : null) == value) {
                return i;
            }
            i--;
        }
        int i2 = midIndex + 1;
        int i3 = this.size;
        while (i2 < i3) {
            if (this.hashes[i2] != valueHash) {
                return -(i2 + 1);
            }
            fee<T> feeVar2 = this.values[i2];
            if ((feeVar2 != null ? feeVar2.get() : null) == value) {
                return i2;
            }
            i2++;
        }
        i2 = this.size;
        return -(i2 + 1);
    }

    public final boolean a(T value) {
        int iB;
        int i = this.size;
        int iA = wjc.a(value);
        if (i > 0) {
            iB = b(value, iA);
            if (iB >= 0) {
                return false;
            }
        } else {
            iB = -1;
        }
        int i2 = -(iB + 1);
        fee<T>[] feeVarArr = this.values;
        int length = feeVarArr.length;
        if (i == length) {
            int i3 = length * 2;
            fee<T>[] feeVarArr2 = new fee[i3];
            int[] iArr = new int[i3];
            int i4 = i2 + 1;
            System.arraycopy(feeVarArr, i2, feeVarArr2, i4, i - i2);
            System.arraycopy(this.values, 0, feeVarArr2, 0, i2);
            f.l(this.hashes, iArr, i4, i2, i);
            f.q(this.hashes, iArr, 0, 0, i2, 6, (Object) null);
            this.values = feeVarArr2;
            this.hashes = iArr;
        } else {
            int i5 = i2 + 1;
            System.arraycopy(feeVarArr, i2, feeVarArr, i5, i - i2);
            int[] iArr2 = this.hashes;
            f.l(iArr2, iArr2, i5, i2, i);
        }
        this.values[i2] = new fee<>(value);
        this.hashes[i2] = iA;
        this.size++;
        return true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final fee<T>[] f() {
        return this.values;
    }

    public final void g(int i) {
        this.size = i;
    }
}
