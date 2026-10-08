package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\nR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/google/android/p37;", "", "previous", "next", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "()V", "(Ljava/lang/Object;)V", "newNext", "e", "(Ljava/lang/Object;)Lcom/google/android/p37;", "newPrevious", "f", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "c", "", "()Z", "hasNext", "hasPrevious", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p37 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object previous;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Object next;

    public p37(Object obj, Object obj2) {
        this.previous = obj;
        this.next = obj2;
    }

    public final boolean a() {
        return this.next != zs3.a;
    }

    public final boolean b() {
        return this.previous != zs3.a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getPrevious() {
        return this.previous;
    }

    public final p37 e(Object newNext) {
        return new p37(this.previous, newNext);
    }

    public final p37 f(Object newPrevious) {
        return new p37(newPrevious, this.next);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p37() {
        zs3 zs3Var = zs3.a;
        this(zs3Var, zs3Var);
    }

    public p37(Object obj) {
        this(obj, zs3.a);
    }
}
