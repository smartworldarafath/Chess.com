package com.google.inputmethod;

import com.google.android.x2;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010&\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00105\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010<\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010>\u001a\u0002062\u0006\u0010\u0011\u001a\u0002068\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00107\u001a\u0004\b(\u00109\"\u0004\b=\u0010;R&\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@0?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010D8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010E¨\u0006G"}, d2 = {"Lcom/google/android/h69;", "K", "V", "Lcom/google/android/k79$a;", "Lcom/google/android/x2;", "Lcom/google/android/c69;", "map", "<init>", "(Lcom/google/android/c69;)V", "e", "()Lcom/google/android/c69;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "a", "Lcom/google/android/c69;", "Lcom/google/android/e48;", "b", "Lcom/google/android/e48;", "h", "()Lcom/google/android/e48;", "k", "(Lcom/google/android/e48;)V", "ownership", "Lcom/google/android/shd;", "c", "Lcom/google/android/shd;", "g", "()Lcom/google/android/shd;", "setNode$runtime", "(Lcom/google/android/shd;)V", "node", "d", "Ljava/lang/Object;", "getOperationResult$runtime", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "operationResult", "", "I", "f", "()I", "i", "(I)V", "modCount", "m", "size", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class h69<K, V> extends x2<K, V> implements k79.a<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private c69<K, V> map;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private e48 ownership = new e48();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private shd<K, V> node;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private V operationResult;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int modCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int size;

    public h69(c69<K, V> c69Var) {
        this.map = c69Var;
        this.node = this.map.q();
        this.size = this.map.size();
    }

    public Set<Map.Entry<K, V>> a() {
        return (Set<Map.Entry<K, V>>) new l69(this);
    }

    public Set<K> b() {
        return new p69(this);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.Map
    public void clear() {
        shd<K, V> shdVarA = shd.INSTANCE.a();
        Intrinsics.h(shdVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = shdVarA;
        m(0);
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    public Collection<V> d() {
        return new t69(this);
    }

    @Override // com.google.android.k79.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c69<K, V> build2() {
        c69<K, V> c69Var;
        if (this.node == this.map.q()) {
            c69Var = this.map;
        } else {
            this.ownership = new e48();
            c69Var = new c69<>(this.node, size());
        }
        this.map = c69Var;
        return c69Var;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    public final shd<K, V> g() {
        return this.node;
    }

    @Override // java.util.Map
    public V get(Object key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e48 getOwnership() {
        return this.ownership;
    }

    public final void i(int i) {
        this.modCount = i;
    }

    public final void j(V v) {
        this.operationResult = v;
    }

    protected final void k(e48 e48Var) {
        this.ownership = e48Var;
    }

    public void m(int i) {
        this.size = i;
        this.modCount++;
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.D(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        c69<K, V> c69VarBuild = from instanceof c69 ? (c69) from : null;
        if (c69VarBuild == null) {
            h69 h69Var = from instanceof h69 ? (h69) from : null;
            c69VarBuild = h69Var != null ? h69Var.build2() : null;
        }
        if (c69VarBuild == null) {
            super/*java.util.AbstractMap*/.putAll(from);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        shd<K, V> shdVar = this.node;
        shd<K, V> shdVarQ = c69VarBuild.q();
        Intrinsics.h(shdVarQ, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = shdVar.E(shdVarQ, 0, deltaCounter, this);
        int size2 = (c69VarBuild.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            m(size2);
        }
    }

    @Override // java.util.Map
    public V remove(Object key) {
        this.operationResult = null;
        shd shdVarG = this.node.G(key != null ? key.hashCode() : 0, key, 0, this);
        if (shdVarG == null) {
            shdVarG = shd.INSTANCE.a();
            Intrinsics.h(shdVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = shdVarG;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int size = size();
        shd shdVarH = this.node.H(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (shdVarH == null) {
            shdVarH = shd.INSTANCE.a();
            Intrinsics.h(shdVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = shdVarH;
        return size != size();
    }
}
