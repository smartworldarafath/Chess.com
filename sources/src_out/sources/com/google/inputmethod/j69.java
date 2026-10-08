package com.google.inputmethod;

import com.google.android.fh6;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/google/android/j69;", "K", "V", "T", "", "Lcom/google/android/f69;", "Lcom/google/android/h69;", "builder", "", "Lcom/google/android/vhd;", "path", "<init>", "(Lcom/google/android/h69;[Lcom/google/android/vhd;)V", "", "keyHash", "Lcom/google/android/shd;", "node", "key", "pathIndex", "", "j", "(ILcom/google/android/shd;Ljava/lang/Object;I)V", "i", "()V", "h", "next", "()Ljava/lang/Object;", "remove", "newValue", "k", "(Ljava/lang/Object;Ljava/lang/Object;)V", "d", "Lcom/google/android/h69;", "e", "Ljava/lang/Object;", "lastIteratedKey", "", "f", "Z", "nextWasInvoked", "g", "I", "expectedModCount", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j69<K, V, T> extends f69<K, V, T> implements Iterator<T>, fh6 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final h69<K, V> builder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private K lastIteratedKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean nextWasInvoked;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int expectedModCount;

    public j69(h69<K, V> h69Var, vhd<K, V, T>[] vhdVarArr) {
        super(h69Var.g(), vhdVarArr);
        this.builder = h69Var;
        this.expectedModCount = h69Var.getModCount();
    }

    private final void h() {
        if (this.builder.getModCount() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final void j(int keyHash, shd<?, ?> node, K key, int pathIndex) {
        int i = pathIndex * 5;
        if (i > 30) {
            e()[pathIndex].k(node.getBuffer(), node.getBuffer().length, 0);
            while (!Intrinsics.e(e()[pathIndex].a(), key)) {
                e()[pathIndex].h();
            }
            g(pathIndex);
            return;
        }
        int iF = 1 << bid.f(keyHash, i);
        if (node.q(iF)) {
            e()[pathIndex].k(node.getBuffer(), node.m() * 2, node.n(iF));
            g(pathIndex);
        } else {
            int iO = node.O(iF);
            shd<?, ?> shdVarN = node.N(iO);
            e()[pathIndex].k(node.getBuffer(), node.m() * 2, iO);
            j(keyHash, shdVarN, key, pathIndex + 1);
        }
    }

    public final void k(K key, V newValue) {
        if (this.builder.containsKey(key)) {
            if (getHasNext()) {
                K kB = b();
                this.builder.put(key, newValue);
                j(kB != null ? kB.hashCode() : 0, this.builder.g(), kB, 0);
            } else {
                this.builder.put(key, newValue);
            }
            this.expectedModCount = this.builder.getModCount();
        }
    }

    @Override // com.google.inputmethod.f69, java.util.Iterator
    public T next() {
        h();
        this.lastIteratedKey = b();
        this.nextWasInvoked = true;
        return (T) super.next();
    }

    @Override // com.google.inputmethod.f69, java.util.Iterator
    public void remove() {
        i();
        if (getHasNext()) {
            K kB = b();
            a.d(this.builder).remove(this.lastIteratedKey);
            j(kB != null ? kB.hashCode() : 0, this.builder.g(), kB, 0);
        } else {
            a.d(this.builder).remove(this.lastIteratedKey);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount();
    }
}
