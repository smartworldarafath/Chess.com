package com.google.inputmethod;

import com.google.android.fh6;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0003H$¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/pu5;", "T", "", "", "startingSize", "<init>", "(I)V", "index", "a", "(I)Ljava/lang/Object;", "", "b", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "remove", "()V", "I", "size", "c", "Z", "canRemove", "collection"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public abstract class pu5<T> implements Iterator<T>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean canRemove;

    public pu5(int i) {
        this.size = i;
    }

    protected abstract T a(int index);

    protected abstract void b(int index);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tA = a(this.index);
        this.index++;
        this.canRemove = true;
        return tA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            qra.b("Call next() before removing an element.");
        }
        int i = this.index - 1;
        this.index = i;
        b(i);
        this.size--;
        this.canRemove = false;
    }
}
