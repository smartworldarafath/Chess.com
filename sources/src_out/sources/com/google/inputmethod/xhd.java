package com.google.inputmethod;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/xhd;", "K", "V", "Lcom/google/android/vhd;", "", "<init>", "()V", "n", "()Ljava/util/Map$Entry;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class xhd<K, V> extends vhd<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        ok1.a(f());
        m(getIndex() + 2);
        return new mf7(getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
