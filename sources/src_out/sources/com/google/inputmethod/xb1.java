package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/google/android/xb1;", "E", "", "", "minCapacity", "<init>", "(I)V", "", "b", "()V", "element", "a", "(Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "index", "c", "(I)Ljava/lang/Object;", "f", "()I", "", "d", "()Z", "", "[Ljava/lang/Object;", "elements", "I", "head", "tail", "capacityBitmask", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class xb1<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private E[] elements;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int head;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int tail;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int capacityBitmask;

    public xb1(int i) {
        if (!(i >= 1)) {
            qra.a("capacity must be >= 1");
        }
        if (!(i <= 1073741824)) {
            qra.a("capacity must be <= 2^30");
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.capacityBitmask = i - 1;
        this.elements = (E[]) new Object[i];
    }

    private final void b() {
        E[] eArr = this.elements;
        int length = eArr.length;
        int i = this.head;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i3];
        f.n(eArr, eArr2, 0, i, length);
        f.n(this.elements, eArr2, i2, 0, this.head);
        this.elements = eArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i3 - 1;
    }

    public final void a(E element) {
        E[] eArr = this.elements;
        int i = this.tail;
        eArr[i] = element;
        int i2 = this.capacityBitmask & (i + 1);
        this.tail = i2;
        if (i2 == this.head) {
            b();
        }
    }

    public final E c(int index) {
        if (index < 0 || index >= f()) {
            rh1 rh1Var = rh1.a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.elements[this.capacityBitmask & (this.head + index)];
        Intrinsics.g(e);
        return e;
    }

    public final boolean d() {
        return this.head == this.tail;
    }

    public final E e() {
        int i = this.head;
        if (i == this.tail) {
            rh1 rh1Var = rh1.a;
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.elements;
        E e = eArr[i];
        eArr[i] = null;
        this.head = (i + 1) & this.capacityBitmask;
        return e;
    }

    public final int f() {
        return (this.tail - this.head) & this.capacityBitmask;
    }
}
