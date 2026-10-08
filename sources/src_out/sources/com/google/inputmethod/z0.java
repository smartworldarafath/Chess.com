package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b!\u0010\u0005¨\u0006#"}, d2 = {"Lcom/google/android/z0;", "T", "Lcom/google/android/ez;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "j", "k", "()V", "clear", "n", "", "", "index", "count", "o", "(Ljava/util/List;II)V", "from", "to", "m", "(Ljava/util/List;III)V", "a", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "Lcom/google/android/w3c;", "b", "Ljava/util/ArrayList;", "stack", "value", "c", "p", "current", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z0<T> implements ez<T> {
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final T root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ArrayList<T> stack = w3c.c(null, 1, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private T current;

    public z0(T t) {
        this.root = t;
        this.current = t;
    }

    @Override // com.google.inputmethod.ez
    public T a() {
        return this.current;
    }

    @Override // com.google.inputmethod.ez
    public final void clear() {
        w3c.a(this.stack);
        p(this.root);
        n();
    }

    @Override // com.google.inputmethod.ez
    public void j(T node) {
        w3c.j(this.stack, a());
        p(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.ez
    public void k() {
        p(w3c.i(this.stack));
    }

    public final T l() {
        return this.root;
    }

    protected final void m(List<T> list, int i, int i2, int i3) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List<T> listSubList = list.subList(i, i3 + i);
            List listB1 = m.B1(listSubList);
            listSubList.clear();
            list.addAll(i4, listB1);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }

    protected abstract void n();

    protected final void o(List<T> list, int i, int i2) {
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    protected void p(T t) {
        this.current = t;
    }
}
