package com.google.inputmethod;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/aee;", "T", "", "<init>", "()V", "", "a", "element", "c", "(Ljava/lang/Object;)V", "b", "()Ljava/lang/Object;", "Lcom/google/android/r58;", "Ljava/lang/ref/Reference;", "Lcom/google/android/r58;", "values", "Ljava/lang/ref/ReferenceQueue;", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class aee<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final r58<Reference<T>> values = new r58<>(new Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void a() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.values.s(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final T b() {
        a();
        while (this.values.getSize() != 0) {
            r58<Reference<T>> r58Var = this.values;
            T t = r58Var.u(r58Var.getSize() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final void c(T element) {
        a();
        this.values.c(new WeakReference(element, this.referenceQueue));
    }
}
