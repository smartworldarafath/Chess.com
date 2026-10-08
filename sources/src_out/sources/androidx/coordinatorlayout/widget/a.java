package androidx.coordinatorlayout.widget;

import androidx.core.util.Pools$SimplePool;
import com.google.inputmethod.jg9;
import com.google.inputmethod.qpb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public final class a<T> {
    private final jg9<ArrayList<T>> a = new Pools$SimplePool(10);
    private final qpb<T, ArrayList<T>> b = new qpb<>();
    private final ArrayList<T> c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    private ArrayList<T> f() {
        ArrayList<T> arrayListAcquire = this.a.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    private void l(ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.release(arrayList);
    }

    public void a(T t, T t2) {
        if (!this.b.containsKey(t) || !this.b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.b.get(t);
        if (arrayListF == null) {
            arrayListF = f();
            this.b.put(t, arrayListF);
        }
        arrayListF.add(t2);
    }

    public void b(T t) {
        if (this.b.containsKey(t)) {
            return;
        }
        this.b.put(t, null);
    }

    public void c() {
        int size = this.b.getSize();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListJ = this.b.j(i);
            if (arrayListJ != null) {
                l(arrayListJ);
            }
        }
        this.b.clear();
    }

    public boolean d(T t) {
        return this.b.containsKey(t);
    }

    public List<T> g(T t) {
        ArrayList<T> arrayListH = h(t);
        if (arrayListH == null) {
            return null;
        }
        return new ArrayList(arrayListH);
    }

    ArrayList<T> h(T t) {
        return this.b.get(t);
    }

    public List<T> i(T t) {
        int size = this.b.getSize();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListJ = this.b.j(i);
            if (arrayListJ != null && arrayListJ.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.f(i));
            }
        }
        return arrayList;
    }

    public ArrayList<T> j() {
        this.c.clear();
        this.d.clear();
        int size = this.b.getSize();
        for (int i = 0; i < size; i++) {
            e(this.b.f(i), this.c, this.d);
        }
        return this.c;
    }

    public boolean k(T t) {
        int size = this.b.getSize();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListJ = this.b.j(i);
            if (arrayListJ != null && arrayListJ.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
