package com.google.inputmethod;

import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.i;
import com.google.android.kh6;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.google.android.kxb, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001*B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0006J!\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00132\u0014\u0010%\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b)\u0010\u0018R$\u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R,\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R \u00106\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b5\u00103R \u0010;\u001a\b\u0012\u0004\u0012\u00028\u0001078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/google/android/kxb;", "K", "V", "Lcom/google/android/a7c;", "", "<init>", "()V", "Lcom/google/android/kxb$a;", "", "currentModification", "Lcom/google/android/k79;", "newMap", "", "b", "(Lcom/google/android/kxb$a;ILcom/google/android/k79;)Z", "c", "(Lcom/google/android/kxb$a;Lcom/google/android/k79;)I", "Lcom/google/android/c7c;", "value", "", "x", "(Lcom/google/android/c7c;)V", "key", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "j", "a", "Lcom/google/android/c7c;", "t", "()Lcom/google/android/c7c;", "firstStateRecord", "", "", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "entries", "e", "keys", "", "Ljava/util/Collection;", "i", "()Ljava/util/Collection;", "values", "h", "()I", "size", "f", "modification", "g", "()Lcom/google/android/kxb$a;", "getReadable$runtime$annotations", "readable", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotStateMap<K, V> implements a7c, Map<K, V>, kh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private c7c firstStateRecord;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<Map.Entry<K, V>> entries;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Set<K> keys;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Collection<V> values;

    /* JADX INFO: renamed from: com.google.android.kxb$a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B)\b\u0000\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/android/kxb$a;", "K", "V", "Lcom/google/android/c7c;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lcom/google/android/k79;", "map", "<init>", "(JLcom/google/android/k79;)V", "value", "", "c", "(Lcom/google/android/c7c;)V", "d", "()Lcom/google/android/c7c;", "e", "(J)Lcom/google/android/c7c;", "Lcom/google/android/k79;", "j", "()Lcom/google/android/k79;", "l", "(Lcom/google/android/k79;)V", "", "I", "k", "()I", "m", "(I)V", "modification", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<K, V> extends c7c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private k79<K, ? extends V> map;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private int modification;

        public a(long j, k79<K, ? extends V> k79Var) {
            super(j);
            this.map = k79Var;
        }

        @Override // com.google.inputmethod.c7c
        public void c(c7c value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) value;
            synchronized (lxb.a) {
                this.map = aVar.map;
                this.modification = aVar.modification;
                Unit unit = Unit.a;
            }
        }

        @Override // com.google.inputmethod.c7c
        public c7c d() {
            return new a(i.K().getSnapshotId(), this.map);
        }

        @Override // com.google.inputmethod.c7c
        public c7c e(long snapshotId) {
            return new a(snapshotId, this.map);
        }

        public final k79<K, V> j() {
            return this.map;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        public final void l(k79<K, ? extends V> k79Var) {
            this.map = k79Var;
        }

        public final void m(int i) {
            this.modification = i;
        }
    }

    public SnapshotStateMap() {
        k79 k79VarA = j24.a();
        g gVarK = i.K();
        a aVar = new a(gVarK.getSnapshotId(), k79VarA);
        if (!(gVarK instanceof androidx.compose.p004runtime.snapshots.a)) {
            aVar.h(new a(kwb.c(1), k79VarA));
        }
        this.firstStateRecord = aVar;
        this.entries = new uwb(this);
        this.keys = new vwb(this);
        this.values = new xwb(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(a<K, V> aVar, int i, k79<K, ? extends V> k79Var) {
        boolean z;
        synchronized (lxb.a) {
            if (aVar.getModification() == i) {
                aVar.l(k79Var);
                z = true;
                aVar.m(aVar.getModification() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    private final int c(a<K, V> aVar, k79<K, ? extends V> k79Var) {
        int modification;
        synchronized (lxb.a) {
            aVar.l(k79Var);
            modification = aVar.getModification();
            aVar.m(modification + 1);
        }
        return modification;
    }

    @Override // java.util.Map
    public void clear() {
        g gVarC;
        c7c firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) i.I((a) firstStateRecord);
        aVar.j();
        k79<K, ? extends V> k79VarA = j24.a();
        if (k79VarA != aVar.j()) {
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                c((a) i.n0(aVar2, this, gVarC), k79VarA);
            }
            i.V(gVarC, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return g().j().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return g().j().containsValue(value);
    }

    public Set<Map.Entry<K, V>> d() {
        return this.entries;
    }

    public Set<K> e() {
        return this.keys;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return d();
    }

    public final int f() {
        return g().getModification();
    }

    public final a<K, V> g() {
        c7c firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) i.c0((a) firstStateRecord, this);
    }

    @Override // java.util.Map
    public V get(Object key) {
        return g().j().get(key);
    }

    public int h() {
        return g().j().size();
    }

    public Collection<V> i() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return g().j().isEmpty();
    }

    public final boolean j(V value) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.e(((Map.Entry) next).getValue(), value));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return e();
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        k79<K, V> k79VarJ;
        int modification;
        V vPut;
        g gVarC;
        boolean zB;
        do {
            synchronized (lxb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) i.I((a) firstStateRecord);
                k79VarJ = aVar.j();
                modification = aVar.getModification();
                Unit unit = Unit.a;
            }
            Intrinsics.g(k79VarJ);
            k79.a<K, V> aVarBuilder2 = k79VarJ.builder2();
            vPut = aVarBuilder2.put(key, value);
            k79<K, V> k79VarBuild2 = aVarBuilder2.build2();
            if (Intrinsics.e(k79VarBuild2, k79VarJ)) {
                break;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zB = b((a) i.n0(aVar2, this, gVarC), modification, k79VarBuild2);
            }
            i.V(gVarC, this);
        } while (!zB);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        k79<K, V> k79VarJ;
        int modification;
        g gVarC;
        boolean zB;
        do {
            synchronized (lxb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) i.I((a) firstStateRecord);
                k79VarJ = aVar.j();
                modification = aVar.getModification();
                Unit unit = Unit.a;
            }
            Intrinsics.g(k79VarJ);
            k79.a<K, V> aVarBuilder2 = k79VarJ.builder2();
            aVarBuilder2.putAll(from);
            k79<K, V> k79VarBuild2 = aVarBuilder2.build2();
            if (Intrinsics.e(k79VarBuild2, k79VarJ)) {
                return;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zB = b((a) i.n0(aVar2, this, gVarC), modification, k79VarBuild2);
            }
            i.V(gVarC, this);
        } while (!zB);
    }

    @Override // java.util.Map
    public V remove(Object key) {
        k79<K, V> k79VarJ;
        int modification;
        V vRemove;
        g gVarC;
        boolean zB;
        do {
            synchronized (lxb.a) {
                c7c firstStateRecord = getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) i.I((a) firstStateRecord);
                k79VarJ = aVar.j();
                modification = aVar.getModification();
                Unit unit = Unit.a;
            }
            Intrinsics.g(k79VarJ);
            k79.a<K, V> aVarBuilder2 = k79VarJ.builder2();
            vRemove = aVarBuilder2.remove(key);
            k79<K, V> k79VarBuild2 = aVarBuilder2.build2();
            if (Intrinsics.e(k79VarBuild2, k79VarJ)) {
                break;
            }
            c7c firstStateRecord2 = getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zB = b((a) i.n0(aVar2, this, gVarC), modification, k79VarBuild2);
            }
            i.V(gVarC, this);
        } while (!zB);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @Override // com.google.inputmethod.a7c
    /* JADX INFO: renamed from: t, reason: from getter */
    public c7c getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public String toString() {
        c7c firstStateRecord = getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) i.I((a) firstStateRecord)).j() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }

    @Override // com.google.inputmethod.a7c
    public void x(c7c value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (a) value;
    }
}
