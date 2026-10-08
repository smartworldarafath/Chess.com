package com.google.inputmethod;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/did;", "K", "V", "Lcom/google/android/vhd;", "", "Lcom/google/android/n69;", "parentIterator", "<init>", "(Lcom/google/android/n69;)V", "n", "()Ljava/util/Map$Entry;", "d", "Lcom/google/android/n69;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class did<K, V> extends vhd<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final n69<K, V> parentIterator;

    public did(n69<K, V> n69Var) {
        this.parentIterator = n69Var;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        ok1.a(f());
        m(getIndex() + 2);
        return new b58(this.parentIterator, getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
