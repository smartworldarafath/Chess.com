package com.google.inputmethod;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001.B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u000eR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/google/android/c69;", "K", "V", "Lkotlin/collections/c;", "Lcom/google/android/k79;", "Lcom/google/android/shd;", "node", "", "size", "<init>", "(Lcom/google/android/shd;I)V", "Lcom/google/android/iq5;", "", "o", "()Lcom/google/android/iq5;", "", "d", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "s", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/c69;", "t", "(Ljava/lang/Object;)Lcom/google/android/c69;", "Lcom/google/android/h69;", "n", "()Lcom/google/android/h69;", "b", "Lcom/google/android/shd;", "q", "()Lcom/google/android/shd;", "c", "I", "f", "()I", "p", "keys", "Lcom/google/android/bq5;", "r", "()Lcom/google/android/bq5;", "values", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c69<K, V> extends c<K, V> implements k79<K, V> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;
    private static final c69 f = new c69(shd.INSTANCE.a(), 0);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final shd<K, V> node;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: com.google.android.c69$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/android/c69$a;", "", "<init>", "()V", "K", "V", "Lcom/google/android/c69;", "a", "()Lcom/google/android/c69;", "", "EMPTY", "Lcom/google/android/c69;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> c69<K, V> a() {
            c69<K, V> c69Var = c69.f;
            Intrinsics.h(c69Var, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return c69Var;
        }

        private Companion() {
        }
    }

    public c69(shd<K, V> shdVar, int i) {
        this.node = shdVar;
        this.size = i;
    }

    private final iq5<Map.Entry<K, V>> o() {
        return new x69(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    public final Set<Map.Entry<K, V>> d() {
        return o();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.Map
    public V get(Object key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // com.google.inputmethod.k79
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public h69<K, V> builder2() {
        return new h69<>(this);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public iq5<K> e() {
        return new b79(this);
    }

    public final shd<K, V> q() {
        return this.node;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public bq5<V> g() {
        return new f79(this);
    }

    public c69<K, V> s(K key, V value) {
        shd.b<K, V> bVarP = this.node.P(key != null ? key.hashCode() : 0, key, value, 0);
        return bVarP == null ? this : new c69<>(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    public c69<K, V> t(K key) {
        shd<K, V> shdVarQ = this.node.Q(key != null ? key.hashCode() : 0, key, 0);
        if (this.node == shdVarQ) {
            return this;
        }
        return shdVarQ == null ? INSTANCE.a() : new c69<>(shdVarQ, size() - 1);
    }
}
