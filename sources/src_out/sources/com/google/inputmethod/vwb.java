package com.google.inputmethod;

import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/google/android/vwb;", "K", "V", "Lcom/google/android/wwb;", "Lcom/google/android/kxb;", "map", "<init>", "(Lcom/google/android/kxb;)V", "element", "", "d", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "e", "(Ljava/util/Collection;)Ljava/lang/Void;", "Lcom/google/android/y6c;", "f", "()Lcom/google/android/y6c;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class vwb<K, V> extends wwb<K, V, K> {
    public vwb(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) d(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) e(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return b().containsKey(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Collection<?> collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!b().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public Void d(K element) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public Void e(Collection<? extends K> elements) throws KotlinNothingValueException {
        lxb.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public y6c<K, V> iterator() {
        return new y6c<>(b(), ((iq5) b().g().j().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return b().remove(element) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> elements) {
        Iterator<T> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (b().remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> elements) {
        k79<K, V> k79VarJ;
        int modification;
        g gVarC;
        boolean zB;
        Set setD1 = m.D1(elements);
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
            for (Map.Entry<K, V> entry : snapshotStateMapB.entrySet()) {
                if (!setD1.contains(entry.getKey())) {
                    aVarBuilder2.remove(entry.getKey());
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
