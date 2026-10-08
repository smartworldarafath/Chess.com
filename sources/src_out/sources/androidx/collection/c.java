package androidx.collection;

import com.google.android.kqd;
import com.google.inputmethod.k4b;
import com.google.inputmethod.lo6;
import com.google.inputmethod.qra;
import com.google.inputmethod.ty1;
import com.google.inputmethod.xob;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u001cJ\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010\u001eJ\u001b\u0010'\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b'\u0010\"J\u001e\u0010(\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002¢\u0006\u0004\b(\u0010$J\u001b\u0010*\u001a\u00020\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000)¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0003H\u0001¢\u0006\u0004\b-\u0010\u0006J\r\u0010.\u001a\u00020\u0007¢\u0006\u0004\b.\u0010\fJ\u000f\u0010/\u001a\u00020\u0007H\u0000¢\u0006\u0004\b/\u0010\fJ\u000f\u00100\u001a\u00020\u0007H\u0000¢\u0006\u0004\b0\u0010\fJ\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0003H\u0000¢\u0006\u0004\b2\u0010\u0006J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003¢\u0006\u0004\b4\u00105R\u0016\u00107\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106¨\u00068"}, d2 = {"Landroidx/collection/c;", "E", "Landroidx/collection/OrderedScatterSet;", "", "initialCapacity", "<init>", "(I)V", "", "s", "capacity", "r", "q", "()V", "element", "m", "(Ljava/lang/Object;)I", "hash1", "n", "(I)I", "", "mapping", "p", "([J)V", "", "o", "([I)V", "", "g", "(Ljava/lang/Object;)Z", "w", "(Ljava/lang/Object;)V", "", "elements", "h", "(Ljava/lang/Iterable;)Z", "v", "(Ljava/lang/Iterable;)V", "x", "u", "y", "t", "", "B", "(Ljava/util/Collection;)Z", "index", "z", "k", "i", "l", "newCapacity", "A", "", "j", "()Ljava/util/Set;", "I", "growthLimit", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class c<E> extends OrderedScatterSet<E> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int growthLimit;

    public /* synthetic */ c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final int m(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
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
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.e(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iN = n(i2);
                if (this.growthLimit == 0 && ((this.metadata[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    i();
                    iN = n(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iN >> 3;
                long j5 = jArr2[i11];
                int i12 = (iN & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((iN - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return iN;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    private final int n(int hash1) {
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

    private final void o(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) ((j >> 31) & 2147483647L);
            int i4 = (int) (j & 2147483647L);
            long j2 = ((j & (-4611686018427387904L)) | ((long) (i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i3]))) << 31;
            if (i4 != Integer.MAX_VALUE) {
                i2 = mapping[i4];
            }
            jArr[i] = j2 | ((long) i2);
            i++;
        }
        int i5 = this.head;
        if (i5 != Integer.MAX_VALUE) {
            this.head = mapping[i5];
        }
        int i6 = this.tail;
        if (i6 != Integer.MAX_VALUE) {
            this.tail = mapping[i6];
        }
    }

    private final void p(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) ((j >> 31) & 2147483647L);
            int i4 = (int) (j & 2147483647L);
            long j2 = ((j & (-4611686018427387904L)) | ((long) (i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i3] & 4294967295L)))) << 31;
            if (i4 != Integer.MAX_VALUE) {
                i2 = (int) (4294967295L & mapping[i4]);
            }
            jArr[i] = ((long) i2) | j2;
            i++;
        }
        int i5 = this.head;
        if (i5 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i5] & 4294967295L);
        }
        int i6 = this.tail;
        if (i6 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i6] & 4294967295L);
        }
    }

    private final void q() {
        this.growthLimit = k4b.b(get_capacity()) - this._size;
    }

    private final void r(int capacity) {
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
        q();
    }

    private final void s(int initialCapacity) {
        long[] jArrA;
        int iMax = initialCapacity > 0 ? Math.max(7, k4b.e(initialCapacity)) : 0;
        this._capacity = iMax;
        r(iMax);
        this.elements = iMax == 0 ? ty1.c : new Object[iMax];
        if (iMax == 0) {
            jArrA = xob.a();
        } else {
            long[] jArr = new long[iMax];
            f.F(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
            jArrA = jArr;
        }
        this.nodes = jArrA;
    }

    public final void A(int newCapacity) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        int i = this._capacity;
        int[] iArr = new int[i];
        s(newCapacity);
        long[] jArr3 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr4 = this.nodes;
        int i2 = this._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i3];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iN = n(i4 >>> 7);
                long j = i4 & 127;
                int i5 = iN >> 3;
                int i6 = (iN & 7) << 3;
                long j2 = (jArr3[i5] & (~(255 << i6))) | (j << i6);
                jArr3[i5] = j2;
                jArr3[(((iN - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr2[iN] = obj;
                jArr4[iN] = jArr2[i3];
                iArr[i3] = iN;
            }
            i3++;
            jArr = jArr;
            objArr = objArr;
        }
        o(iArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    public final boolean B(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!m.n0(elements, objArr[i5])) {
                                z(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this._size;
    }

    public final boolean g(E element) {
        int i = get_size();
        int iM = m(element);
        this.elements[iM] = element;
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[iM] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) iM) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
        }
        this.head = iM;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iM;
        }
        return get_size() != i;
    }

    public final boolean h(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = get_size();
        v(elements);
        return i != get_size();
    }

    public final void i() {
        if (this._capacity <= 8 || Long.compareUnsigned(kqd.c(kqd.c(this._size) * 32), kqd.c(kqd.c(this._capacity) * 25)) > 0) {
            A(k4b.d(this._capacity));
        } else {
            l();
        }
    }

    public final Set<E> j() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void k() {
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
        f.A(this.elements, (Object) null, 0, this._capacity);
        f.F(this.nodes, 4611686018427387903L, 0, 0, 6, (Object) null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        q();
    }

    public final void l() {
        int i;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i2 = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i2];
        long j = 9223372034707292159L;
        int i3 = 0;
        f.z(jArr3, 9223372034707292159L, 0, i2);
        int i4 = (i2 + 7) >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            long j2 = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int iW0 = f.w0(jArr);
        int i6 = iW0 - 1;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[iW0] = jArr[0];
        int i7 = 0;
        while (i7 != i2) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = (jArr[i8] >> i9) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr[i7];
                int iHashCode = (obj != null ? obj.hashCode() : i3) * (-862048943);
                int i10 = iHashCode ^ (iHashCode << 16);
                int i11 = i10 >>> 7;
                long j4 = j;
                int iN = n(i11);
                int i12 = i11 & i2;
                if (((iN - i12) & i2) / 8 == ((i7 - i12) & i2) / 8) {
                    jArr[i8] = (((long) (i10 & 127)) << i9) | (jArr[i8] & (~(255 << i9)));
                    if (jArr3[i7] == j4) {
                        long j5 = i7;
                        jArr3[i7] = j5 | (j5 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i3];
                    i7++;
                    j = j4;
                } else {
                    int i13 = iN >> 3;
                    long j6 = jArr[i13];
                    int i14 = (iN & 7) << 3;
                    int i15 = i3;
                    if (((j6 >> i14) & 255) == 128) {
                        int i16 = i7;
                        jArr[i13] = (j6 & (~(255 << i14))) | (((long) (i10 & 127)) << i14);
                        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (128 << i9);
                        objArr[iN] = objArr[i16];
                        objArr[i16] = null;
                        jArr2[iN] = jArr2[i16];
                        jArr2[i16] = 4611686018427387903L;
                        int i17 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i17 != Integer.MAX_VALUE) {
                            jArr3[i17] = (jArr3[i17] & (-4294967296L)) | ((long) iN);
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i16] = (((long) Integer.MAX_VALUE) << 32) | ((long) iN);
                        }
                        i = i16;
                        jArr3[iN] = ((long) Integer.MAX_VALUE) | (((long) i) << 32);
                    } else {
                        jArr[i13] = (((long) (i10 & 127)) << i14) | (j6 & (~(255 << i14)));
                        Object obj2 = objArr[iN];
                        objArr[iN] = objArr[i7];
                        objArr[i7] = obj2;
                        long j7 = jArr2[iN];
                        jArr2[iN] = jArr2[i7];
                        jArr2[i7] = j7;
                        int i18 = (int) ((jArr3[i7] >> 32) & 4294967295L);
                        if (i18 != Integer.MAX_VALUE) {
                            long j8 = iN;
                            jArr3[i18] = (jArr3[i18] & (-4294967296L)) | j8;
                            jArr3[i7] = (jArr3[i7] & 4294967295L) | (j8 << 32);
                        } else {
                            long j9 = iN;
                            jArr3[i7] = j9 | (j9 << 32);
                            i18 = i7;
                        }
                        jArr3[iN] = (((long) i18) << 32) | ((long) i7);
                        i = i7 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i15];
                    i7 = i + 1;
                    j = j4;
                    i3 = i15;
                }
            } else {
                i7++;
            }
        }
        q();
        p(jArr3);
    }

    public final void t(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
    }

    public final void u(E element) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.e(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            z(iNumberOfTrailingZeros);
        }
    }

    public final void v(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public final void w(E element) {
        int iM = m(element);
        this.elements[iM] = element;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iM] = (((long) i) & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((((long) iM) & 2147483647L) << 31) | (jArr[i] & (-4611686016279904257L));
        }
        this.head = iM;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iM;
        }
    }

    public final boolean x(E element) {
        int iNumberOfTrailingZeros;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (Intrinsics.e(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            z(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final boolean y(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = get_size();
        t(elements);
        return i != get_size();
    }

    public final void z(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j2 = jArr2[index];
        int i4 = (int) ((j2 >> 31) & 2147483647L);
        int i5 = (int) (j2 & 2147483647L);
        if (i4 != Integer.MAX_VALUE) {
            jArr2[i4] = (jArr2[i4] & (-2147483648L)) | (((long) i5) & 2147483647L);
        } else {
            this.head = i5;
        }
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = ((((long) i4) & 2147483647L) << 31) | (jArr2[i5] & (-4611686016279904257L));
        } else {
            this.tail = i4;
        }
        jArr2[index] = 4611686018427387903L;
    }

    public c(int i) {
        super(null);
        if (!(i >= 0)) {
            qra.a("Capacity must be a positive value.");
        }
        s(k4b.f(i));
    }
}
