package androidx.p008glance.p009appwidget.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class x0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<x0<K, V>.d> a;
    private Map<K, V> b;
    private boolean c;
    private volatile x0<K, V>.f d;
    private Map<K, V> e;
    private volatile x0<K, V>.c f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    class a<FieldDescriptorType> extends x0<FieldDescriptorType, Object> {
        a() {
            super(null);
        }

        @Override // androidx.p008glance.p009appwidget.protobuf.x0
        public void p() {
            if (!o()) {
                for (int i = 0; i < k(); i++) {
                    Map.Entry<FieldDescriptorType, Object> entryJ = j(i);
                    if (((q.b) entryJ.getKey()).isRepeated()) {
                        entryJ.setValue(Collections.unmodifiableList((List) entryJ.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                    if (((q.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((Comparable) obj, obj2);
        }
    }

    private class c extends x0<K, V>.f {
        private c() {
            super(x0.this, null);
        }

        @Override // androidx.glance.appwidget.protobuf.x0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(x0.this, null);
        }

        /* synthetic */ c(x0 x0Var, a aVar) {
            this();
        }
    }

    private class d implements Map.Entry<K, V>, Comparable<x0<K, V>.d> {
        private final K a;
        private V b;

        d(x0 x0Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(x0<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c(this.a, entry.getKey()) && c(this.b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.a;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.b;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            x0.this.g();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public String toString() {
            return this.a + "=" + this.b;
        }

        d(K k, V v) {
            this.a = k;
            this.b = v;
        }
    }

    private class f extends AbstractSet<Map.Entry<K, V>> {
        private f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            x0.this.r(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            x0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = x0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(x0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            x0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return x0.this.size();
        }

        /* synthetic */ f(x0 x0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ x0(a aVar) {
        this();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    private int f(K k) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.a.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = k.compareTo(this.a.get(i3).getKey());
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo(this.a.get(i4).getKey());
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = k.compareTo(this.a.get(i3).getKey());
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (!this.a.isEmpty() || (this.a instanceof ArrayList)) {
            return;
        }
        this.a = new ArrayList(16);
    }

    private SortedMap<K, V> n() {
        g();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    static <FieldDescriptorType extends q.b<FieldDescriptorType>> x0<FieldDescriptorType, Object> q() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int i) {
        g();
        V value = this.a.remove(i).getValue();
        if (!this.b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.d == null) {
            this.d = new f(this, null);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return super.equals(obj);
        }
        x0 x0Var = (x0) obj;
        int size = size();
        if (size != x0Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != x0Var.k()) {
            return entrySet().equals(x0Var.entrySet());
        }
        for (int i = 0; i < iK; i++) {
            if (!j(i).equals(x0Var.j(i))) {
                return false;
            }
        }
        if (iK != size) {
            return this.b.equals(x0Var.b);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.a.get(iF).getValue() : this.b.get(comparable);
    }

    Set<Map.Entry<K, V>> h() {
        if (this.f == null) {
            this.f = new c(this, null);
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i = 0; i < iK; i++) {
            iHashCode += this.a.get(i).hashCode();
        }
        return l() > 0 ? iHashCode + this.b.hashCode() : iHashCode;
    }

    public Map.Entry<K, V> j(int i) {
        return this.a.get(i);
    }

    public int k() {
        return this.a.size();
    }

    public int l() {
        return this.b.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    public boolean o() {
        return this.c;
    }

    public void p() {
        if (this.c) {
            return;
        }
        this.b = this.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.b);
        this.e = this.e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.e);
        this.c = true;
    }

    public V r(K k, V v) {
        g();
        int iF = f(k);
        if (iF >= 0) {
            return this.a.get(iF).setValue(v);
        }
        i();
        int i = -(iF + 1);
        if (i >= 16) {
            return n().put(k, v);
        }
        if (this.a.size() == 16) {
            x0<K, V>.d dVarRemove = this.a.remove(15);
            n().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.a.add(i, new d(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return s(iF);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.a.size() + this.b.size();
    }

    private class b implements Iterator<Map.Entry<K, V>> {
        private int a;
        private Iterator<Map.Entry<K, V>> b;

        private b() {
            this.a = x0.this.a.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.b == null) {
                this.b = x0.this.e.entrySet().iterator();
            }
            return this.b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = x0.this.a;
            int i = this.a - 1;
            this.a = i;
            return (Map.Entry) list.get(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.a;
            return (i > 0 && i <= x0.this.a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(x0 x0Var, a aVar) {
            this();
        }
    }

    private class e implements Iterator<Map.Entry<K, V>> {
        private int a;
        private boolean b;
        private Iterator<Map.Entry<K, V>> c;

        private e() {
            this.a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.c == null) {
                this.c = x0.this.b.entrySet().iterator();
            }
            return this.c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            return i < x0.this.a.size() ? (Map.Entry) x0.this.a.get(this.a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a + 1 < x0.this.a.size() || (!x0.this.b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.b = false;
            x0.this.g();
            if (this.a >= x0.this.a.size()) {
                a().remove();
                return;
            }
            x0 x0Var = x0.this;
            int i = this.a;
            this.a = i - 1;
            x0Var.s(i);
        }

        /* synthetic */ e(x0 x0Var, a aVar) {
            this();
        }
    }

    private x0() {
        this.a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.b = map;
        this.e = map;
    }
}
