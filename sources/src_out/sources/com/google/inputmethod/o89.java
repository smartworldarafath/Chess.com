package com.google.inputmethod;

import com.google.android.fh6;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lcom/google/android/o89;", "T", "", "Lcom/google/android/p2;", "Lcom/google/android/k89;", "builder", "", "index", "<init>", "(Lcom/google/android/k89;I)V", "", "reset", "()V", "j", "h", "i", "previous", "()Ljava/lang/Object;", "next", "element", "add", "(Ljava/lang/Object;)V", "remove", "set", "c", "Lcom/google/android/k89;", "d", "I", "expectedModCount", "Lcom/google/android/rhd;", "e", "Lcom/google/android/rhd;", "trieIterator", "f", "lastIteratedIndex", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o89<T> extends p2<T> implements ListIterator<T>, fh6 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final k89<T> builder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int expectedModCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private rhd<? extends T> trieIterator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int lastIteratedIndex;

    public o89(k89<T> k89Var, int i) {
        super(i, k89Var.size());
        this.builder = k89Var;
        this.expectedModCount = k89Var.e();
        this.lastIteratedIndex = -1;
        j();
    }

    private final void h() {
        if (this.expectedModCount != this.builder.e()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    private final void j() {
        Object[] objArrF = this.builder.getRoot();
        if (objArrF == null) {
            this.trieIterator = null;
            return;
        }
        int iD = oyd.d(this.builder.size());
        int iJ = g.j(getIndex(), iD);
        int i = (this.builder.getRootShift() / 5) + 1;
        rhd<? extends T> rhdVar = this.trieIterator;
        if (rhdVar == null) {
            this.trieIterator = new rhd<>(objArrF, iJ, iD, i);
        } else {
            Intrinsics.g(rhdVar);
            rhdVar.k(objArrF, iJ, iD, i);
        }
    }

    private final void reset() {
        g(this.builder.size());
        this.expectedModCount = this.builder.e();
        this.lastIteratedIndex = -1;
        j();
    }

    @Override // com.google.inputmethod.p2, java.util.ListIterator
    public void add(T element) {
        h();
        this.builder.add(getIndex(), element);
        f(getIndex() + 1);
        reset();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        h();
        a();
        this.lastIteratedIndex = getIndex();
        rhd<? extends T> rhdVar = this.trieIterator;
        if (rhdVar == null) {
            Object[] objArrJ = this.builder.getTail();
            int index = getIndex();
            f(index + 1);
            return (T) objArrJ[index];
        }
        if (rhdVar.hasNext()) {
            f(getIndex() + 1);
            return rhdVar.next();
        }
        Object[] objArrJ2 = this.builder.getTail();
        int index2 = getIndex();
        f(index2 + 1);
        return (T) objArrJ2[index2 - rhdVar.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        h();
        b();
        this.lastIteratedIndex = getIndex() - 1;
        rhd<? extends T> rhdVar = this.trieIterator;
        if (rhdVar == null) {
            Object[] objArrJ = this.builder.getTail();
            f(getIndex() - 1);
            return (T) objArrJ[getIndex()];
        }
        if (getIndex() <= rhdVar.getSize()) {
            f(getIndex() - 1);
            return rhdVar.previous();
        }
        Object[] objArrJ2 = this.builder.getTail();
        f(getIndex() - 1);
        return (T) objArrJ2[getIndex() - rhdVar.getSize()];
    }

    @Override // com.google.inputmethod.p2, java.util.ListIterator, java.util.Iterator
    public void remove() {
        h();
        i();
        this.builder.remove(this.lastIteratedIndex);
        if (this.lastIteratedIndex < getIndex()) {
            f(this.lastIteratedIndex);
        }
        reset();
    }

    @Override // com.google.inputmethod.p2, java.util.ListIterator
    public void set(T element) {
        h();
        i();
        this.builder.set(this.lastIteratedIndex, element);
        this.expectedModCount = this.builder.e();
        j();
    }
}
