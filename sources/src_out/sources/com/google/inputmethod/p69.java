package com.google.inputmethod;

import com.google.android.oh6;
import com.google.android.y2;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\fJ\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/android/p69;", "K", "V", "", "Lcom/google/android/y2;", "Lcom/google/android/h69;", "builder", "<init>", "(Lcom/google/android/h69;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "contains", "a", "Lcom/google/android/h69;", "", "b", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p69<K, V> extends y2<K> implements Set<K>, oh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final h69<K, V> builder;

    public p69(h69<K, V> h69Var) {
        this.builder = h69Var;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K element) {
        throw new UnsupportedOperationException();
    }

    public int b() {
        return this.builder.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return this.builder.containsKey(element);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<K> iterator() {
        return new r69(this.builder);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        if (!this.builder.containsKey(element)) {
            return false;
        }
        this.builder.remove(element);
        return true;
    }
}
