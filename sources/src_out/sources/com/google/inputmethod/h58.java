package com.google.inputmethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b0;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ$\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J)\u0010\u001e\u001a\u00020\n2\u001a\u0010\u001d\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b\"\u0006\u0012\u0002\b\u00030\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b \u0010\u0013J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\fJ\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010\u0016R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.¨\u00060"}, d2 = {"Lcom/google/android/h58;", "Lcom/google/android/uk9;", "", "Lcom/google/android/uk9$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "", "g", "()V", "i", "T", "key", "b", "(Lcom/google/android/uk9$a;)Z", "c", "(Lcom/google/android/uk9$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "value", "l", "(Lcom/google/android/uk9$a;Ljava/lang/Object;)V", "m", "", "Lcom/google/android/uk9$b;", "pairs", "j", "([Lcom/google/android/uk9$b;)V", "k", "h", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core", "Lcom/google/android/o30;", "Lcom/google/android/o30;", "frozen", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h58 extends uk9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<uk9.a<?>, Object> preferencesMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o30 frozen;

    /* JADX WARN: Illegal instructions before constructor call */
    public h58() {
        Map map = null;
        this(map, false, 3, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence n(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object value = entry.getValue();
        return "  " + ((uk9.a) entry.getKey()).getName() + " = " + (value instanceof byte[] ? f.N0((byte[]) value, ", ", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null) : String.valueOf(entry.getValue()));
    }

    @Override // com.google.inputmethod.uk9
    public Map<uk9.a<?>, Object> a() {
        Pair pair;
        Set<Map.Entry<uk9.a<?>, Object>> setEntrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(b0.e(m.A(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.c(), pair.d());
        }
        return ka.b(linkedHashMap);
    }

    @Override // com.google.inputmethod.uk9
    public <T> boolean b(uk9.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.uk9
    public <T> T c(uk9.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.preferencesMap.get(key);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        T t2 = (T) Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(t2, "copyOf(...)");
        return t2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(Object other) {
        boolean zE;
        if (!(other instanceof h58)) {
            return false;
        }
        h58 h58Var = (h58) other;
        Map<uk9.a<?>, Object> map = h58Var.preferencesMap;
        if (map == this.preferencesMap) {
            return true;
        }
        if (map.size() != this.preferencesMap.size()) {
            return false;
        }
        Map<uk9.a<?>, Object> map2 = h58Var.preferencesMap;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<uk9.a<?>, Object> entry : map2.entrySet()) {
            Object obj = this.preferencesMap.get(entry.getKey());
            if (obj != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zE = Intrinsics.e(value, obj);
                } else if ((obj instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj)) {
                    zE = true;
                } else {
                    zE = false;
                }
            } else {
                zE = false;
            }
            if (!zE) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        if (this.frozen.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void h() {
        g();
        this.preferencesMap.clear();
    }

    public int hashCode() {
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i() {
        this.frozen.b(true);
    }

    public final void j(uk9.b<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        g();
        for (uk9.b<?> bVar : pairs) {
            m(bVar.a(), bVar.b());
        }
    }

    public final <T> T k(uk9.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        g();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void l(uk9.a<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        m(key, value);
    }

    public final void m(uk9.a<?> key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        g();
        if (value == null) {
            k(key);
            return;
        }
        if (value instanceof Set) {
            this.preferencesMap.put(key, ka.a((Set) value));
            return;
        }
        if (!(value instanceof byte[])) {
            this.preferencesMap.put(key, value);
            return;
        }
        Map<uk9.a<?>, Object> map = this.preferencesMap;
        byte[] bArr = (byte[]) value;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return m.J0(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, new Function1() { // from class: com.google.android.g58
            public final Object invoke(Object obj) {
                return h58.n((Map.Entry) obj);
            }
        }, 24, (Object) null);
    }

    public h58(Map<uk9.a<?>, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "preferencesMap");
        this.preferencesMap = map;
        this.frozen = new o30(z);
    }

    public /* synthetic */ h58(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }
}
