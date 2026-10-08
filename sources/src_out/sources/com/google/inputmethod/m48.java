package com.google.inputmethod;

import com.google.android.kqd;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0017\u0010\u0005J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u0005R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/google/android/m48;", "Lcom/google/android/r06;", "", "initialCapacity", "<init>", "(I)V", "", "p", "capacity", "o", "n", "()V", "key", "m", "(I)I", "hash1", "l", "value", "u", "(II)V", "q", "r", "index", "s", "j", "i", "k", "newCapacity", "t", "f", "I", "growthLimit", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class m48 extends r06 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int growthLimit;

    public m48(int i) {
        super(null);
        if (!(i >= 0)) {
            qra.a("Capacity must be a positive value.");
        }
        p(k4b.f(i));
    }

    private final int l(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final int m(int key) {
        int iHashCode = Integer.hashCode(key) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            int i9 = 1;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i10 = i6;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (j4 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                int i11 = i9;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
                j4 &= j4 - 1;
                i9 = i11;
            }
            int i12 = i9;
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iL = l(i2);
                if (this.growthLimit == 0 && ((this.metadata[iL >> 3] >> ((iL & 7) << 3)) & 255) != 254) {
                    i();
                    iL = l(i2);
                }
                this._size++;
                int i13 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i14 = iL >> 3;
                long j5 = jArr2[i14];
                int i15 = (iL & 7) << 3;
                this.growthLimit = i13 - (((j5 >> i15) & 255) == 128 ? i12 : 0);
                int i16 = this._capacity;
                long j6 = ((~(255 << i15)) & j5) | (j2 << i15);
                jArr2[i14] = j6;
                jArr2[(((iL - 7) & i16) + (i16 & 7)) >> 3] = j6;
                return ~iL;
            }
            i6 = i10 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    private final void n() {
        this.growthLimit = k4b.b(get_capacity()) - this._size;
    }

    private final void o(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = k4b.a;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            f.F(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        n();
    }

    private final void p(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, k4b.e(initialCapacity)) : 0;
        this._capacity = iMax;
        o(iMax);
        this.keys = new int[iMax];
        this.values = new int[iMax];
    }

    public final void i() {
        if (this._capacity <= 8 || Long.compareUnsigned(kqd.c(kqd.c(this._size) * 32), kqd.c(kqd.c(this._capacity) * 25)) > 0) {
            t(k4b.d(this._capacity));
        } else {
            k();
        }
    }

    public final void j() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != k4b.a) {
            f.F(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        n();
    }

    public final void k() {
        long[] jArr = this.metadata;
        int i = this._capacity;
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        int i2 = (i + 7) >> 3;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int iW0 = f.w0(jArr);
        int i5 = iW0 - 1;
        long j2 = 72057594037927935L;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[iW0] = jArr[0];
        int i6 = 0;
        while (i6 != i) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j3 = (jArr[i7] >> i8) & 255;
            if (j3 != 128 && j3 == 254) {
                int iHashCode = Integer.hashCode(iArr[i6]) * (-862048943);
                int i9 = iHashCode ^ (iHashCode << 16);
                int i10 = i9 >>> 7;
                int iL = l(i10);
                int i11 = i10 & i;
                int i12 = i3;
                if (((iL - i11) & i) / 8 == ((i6 - i11) & i) / 8) {
                    jArr[i7] = (((long) (i9 & 127)) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[f.w0(jArr)] = (jArr[i12] & j2) | Long.MIN_VALUE;
                    i6++;
                    i3 = i12;
                } else {
                    int i13 = iL >> 3;
                    long j4 = jArr[i13];
                    int i14 = (iL & 7) << 3;
                    if (((j4 >> i14) & 255) == 128) {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        iArr[iL] = iArr[i6];
                        iArr[i6] = i12;
                        iArr2[iL] = iArr2[i6];
                        iArr2[i6] = i12;
                    } else {
                        jArr[i13] = (((long) (i9 & 127)) << i14) | (j4 & (~(255 << i14)));
                        int i15 = iArr[iL];
                        iArr[iL] = iArr[i6];
                        iArr[i6] = i15;
                        int i16 = iArr2[iL];
                        iArr2[iL] = iArr2[i6];
                        iArr2[i6] = i16;
                        i6--;
                    }
                    jArr[f.w0(jArr)] = (jArr[i12] & j2) | Long.MIN_VALUE;
                    i6++;
                    i3 = i12;
                    j2 = j2;
                }
            } else {
                i6++;
            }
        }
        n();
    }

    public final void q(int key, int value) {
        u(key, value);
    }

    public final void r(int key) {
        int iB = b(key);
        if (iB >= 0) {
            s(iB);
        }
    }

    public final void s(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
    }

    public final void t(int newCapacity) {
        m48 m48Var = this;
        long[] jArr = m48Var.metadata;
        int[] iArr = m48Var.keys;
        int[] iArr2 = m48Var.values;
        int i = m48Var._capacity;
        p(newCapacity);
        long[] jArr2 = m48Var.metadata;
        int[] iArr3 = m48Var.keys;
        int[] iArr4 = m48Var.values;
        int i2 = m48Var._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int iHashCode = Integer.hashCode(i4) * (-862048943);
                int i5 = iHashCode ^ (iHashCode << 16);
                int iL = m48Var.l(i5 >>> 7);
                long j = i5 & 127;
                int i6 = iL >> 3;
                int i7 = (iL & 7) << 3;
                long j2 = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                jArr2[i6] = j2;
                jArr2[(((iL - 7) & i2) + (i2 & 7)) >> 3] = j2;
                iArr3[iL] = i4;
                iArr4[iL] = iArr2[i3];
            }
            i3++;
            m48Var = this;
            jArr = jArr;
        }
    }

    public final void u(int key, int value) {
        int iM = m(key);
        if (iM < 0) {
            iM = ~iM;
        }
        this.keys[iM] = key;
        this.values[iM] = value;
    }

    public /* synthetic */ m48(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }
}
