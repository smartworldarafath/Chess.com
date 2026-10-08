package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/m89;", "T", "Lcom/google/android/p2;", "", "", "root", "tail", "", "index", "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "next", "()Ljava/lang/Object;", "previous", "c", "[Ljava/lang/Object;", "Lcom/google/android/rhd;", "d", "Lcom/google/android/rhd;", "trieIterator", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m89<T> extends p2<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final T[] tail;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final rhd<T> trieIterator;

    public m89(Object[] objArr, T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        this.tail = tArr;
        int iD = oyd.d(i2);
        this.trieIterator = new rhd<>(objArr, g.j(i, iD), iD, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        a();
        if (this.trieIterator.hasNext()) {
            f(getIndex() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int index = getIndex();
        f(index + 1);
        return tArr[index - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        b();
        if (getIndex() <= this.trieIterator.getSize()) {
            f(getIndex() - 1);
            return this.trieIterator.previous();
        }
        T[] tArr = this.tail;
        f(getIndex() - 1);
        return tArr[getIndex() - this.trieIterator.getSize()];
    }
}
