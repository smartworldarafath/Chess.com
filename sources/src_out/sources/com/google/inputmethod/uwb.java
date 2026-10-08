package com.google.inputmethod;

import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.i;
import com.google.android.qjd;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b0;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001a\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u0016J)\u0010\u001b\u001a\u00020\u00142\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/google/android/uwb;", "K", "V", "Lcom/google/android/wwb;", "", "Lcom/google/android/kxb;", "map", "<init>", "(Lcom/google/android/kxb;)V", "element", "", "d", "(Ljava/util/Map$Entry;)Ljava/lang/Void;", "", "elements", "e", "(Ljava/util/Collection;)Ljava/lang/Void;", "", "iterator", "()Ljava/util/Iterator;", "", "i", "(Ljava/util/Map$Entry;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "f", "containsAll", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class uwb<K, V> extends wwb<K, V, Map.Entry<K, V>> {
    public uwb(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) d((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) e(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (a.p(obj)) {
            return f((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Collection<?> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public Void d(Map.Entry<K, V> element) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public Void e(Collection<? extends Map.Entry<K, V>> elements) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    public boolean f(Map.Entry<K, V> element) {
        return Intrinsics.e(b().get(element.getKey()), element.getValue());
    }

    public boolean i(Map.Entry<K, V> element) {
        return b().remove(element.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new w6c(b(), ((iq5) b().g().j().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (a.p(obj)) {
            return i((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        Iterator<?> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (b().remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        k79<K, V> k79VarJ;
        int modification;
        g gVarC;
        boolean zB;
        Collection<?> collection = elements;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(b0.e(m.A(collection, 10)), 16));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = qjd.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        SnapshotStateMap<K, V> snapshotStateMapB = b();
        boolean z = false;
        do {
            synchronized (lxb.a) {
                c7c firstStateRecord = snapshotStateMapB.getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.a aVar = (SnapshotStateMap.a) i.I((SnapshotStateMap.a) firstStateRecord);
                k79VarJ = aVar.j();
                modification = aVar.getModification();
                Unit unit = Unit.a;
            }
            Intrinsics.g(k79VarJ);
            k79.a<K, V> aVarBuilder2 = k79VarJ.builder2();
            for (Map.Entry<K, V> entry2 : snapshotStateMapB.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.e(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarBuilder2.remove(entry2.getKey());
                    z = true;
                }
            }
            Unit unit2 = Unit.a;
            k79<K, V> k79VarBuild2 = aVarBuilder2.build2();
            if (Intrinsics.e(k79VarBuild2, k79VarJ)) {
                break;
            }
            c7c firstStateRecord2 = snapshotStateMapB.getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.a aVar2 = (SnapshotStateMap.a) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zB = snapshotStateMapB.b((SnapshotStateMap.a) i.n0(aVar2, snapshotStateMapB, gVarC), modification, k79VarBuild2);
            }
            i.V(gVarC, snapshotStateMapB);
        } while (!zB);
        return z;
    }
}
