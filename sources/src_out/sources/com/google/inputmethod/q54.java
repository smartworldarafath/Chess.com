package com.google.inputmethod;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class q54<K, V> extends exa<K, V> {
    private final HashMap<K, exa.c<K, V>> e = new HashMap<>();

    @Override // com.google.inputmethod.exa
    protected exa.c<K, V> c(K k) {
        return this.e.get(k);
    }

    public boolean contains(K k) {
        return this.e.containsKey(k);
    }

    @Override // com.google.inputmethod.exa
    public V i(K k, V v) {
        exa.c<K, V> cVarC = c(k);
        if (cVarC != null) {
            return cVarC.b;
        }
        this.e.put(k, f(k, v));
        return null;
    }

    @Override // com.google.inputmethod.exa
    public V j(K k) {
        V v = (V) super.j(k);
        this.e.remove(k);
        return v;
    }

    public Map.Entry<K, V> n(K k) {
        if (contains(k)) {
            return this.e.get(k).d;
        }
        return null;
    }
}
