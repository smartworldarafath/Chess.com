package com.google.inputmethod;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class imb {
    private SparseIntArray a = new SparseIntArray();
    private HashMap<Integer, HashSet<WeakReference<a>>> b = new HashMap<>();

    public interface a {
    }

    public void a(int i, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.b.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.b.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
