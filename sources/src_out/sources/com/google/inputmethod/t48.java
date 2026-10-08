package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\u00100\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\tR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006\""}, d2 = {"Lcom/google/android/t48;", "T", "Lcom/google/android/d66;", "<init>", "()V", "", "itemIndex", "Lcom/google/android/d66$a;", "d", "(I)Lcom/google/android/d66$a;", "index", "", "c", "(Lcom/google/android/d66$a;I)Z", "size", "value", "", "b", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "block", "a", "(IILkotlin/jvm/functions/Function1;)V", "get", "Lcom/google/android/r58;", "Lcom/google/android/r58;", "intervals", "I", "getSize", "()I", "Lcom/google/android/d66$a;", "lastInterval", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t48<T> implements d66<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final r58<d66.a<T>> intervals = new r58<>(new d66.a[16], 0);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private d66.a<? extends T> lastInterval;

    private final boolean c(d66.a<? extends T> aVar, int i) {
        return i < aVar.getStartIndex() + aVar.getSize() && aVar.getStartIndex() <= i;
    }

    private final d66.a<T> d(int itemIndex) {
        d66.a<? extends T> aVar = this.lastInterval;
        if (aVar != null && c(aVar, itemIndex)) {
            return aVar;
        }
        r58<d66.a<T>> r58Var = this.intervals;
        d66.a aVar2 = (d66.a<? extends T>) r58Var.content[e66.b(r58Var, itemIndex)];
        this.lastInterval = aVar2;
        return aVar2;
    }

    @Override // com.google.inputmethod.d66
    public void a(int fromIndex, int toIndex, Function1<? super d66.a<? extends T>, Unit> block) {
        if (fromIndex < 0 || fromIndex >= getSize()) {
            cx5.e("Index " + fromIndex + ", size " + getSize());
        }
        if (toIndex < 0 || toIndex >= getSize()) {
            cx5.e("Index " + toIndex + ", size " + getSize());
        }
        if (!(toIndex >= fromIndex)) {
            cx5.a("toIndex (" + toIndex + ") should be not smaller than fromIndex (" + fromIndex + ')');
        }
        int iB = e66.b(this.intervals, fromIndex);
        int startIndex = this.intervals.content[iB].getStartIndex();
        while (startIndex <= toIndex) {
            d66.a<T> aVar = this.intervals.content[iB];
            block.invoke(aVar);
            startIndex += aVar.getSize();
            iB++;
        }
    }

    public final void b(int size, T value) {
        if (!(size >= 0)) {
            cx5.a("size should be >=0");
        }
        if (size == 0) {
            return;
        }
        d66.a<T> aVar = new d66.a<>(getSize(), size, value);
        this.size = getSize() + size;
        this.intervals.c(aVar);
    }

    @Override // com.google.inputmethod.d66
    public d66.a<T> get(int index) {
        if (index < 0 || index >= getSize()) {
            cx5.e("Index " + index + ", size " + getSize());
        }
        return d(index);
    }

    @Override // com.google.inputmethod.d66
    public int getSize() {
        return this.size;
    }
}
