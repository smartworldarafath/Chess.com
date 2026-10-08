package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u000e\u0017B3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/google/android/z59;", "Lcom/google/android/c69;", "Lcom/google/android/zr1;", "", "Lcom/google/android/c1e;", "Lcom/google/android/a69;", "Lcom/google/android/shd;", "node", "", "size", "<init>", "(Lcom/google/android/shd;I)V", "T", "key", "a", "(Lcom/google/android/zr1;)Ljava/lang/Object;", "value", "Y0", "(Lcom/google/android/zr1;Lcom/google/android/c1e;)Lcom/google/android/a69;", "Lcom/google/android/z59$a;", "v", "()Lcom/google/android/z59$a;", "g", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z59 extends c69<zr1<Object>, c1e<Object>> implements a69 {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int h = 8;
    private static final z59 i;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/google/android/z59$a;", "Lcom/google/android/h69;", "Lcom/google/android/zr1;", "", "Lcom/google/android/c1e;", "Lcom/google/android/a69$a;", "Lcom/google/android/z59;", "map", "<init>", "(Lcom/google/android/z59;)V", "n", "()Lcom/google/android/z59;", "g", "Lcom/google/android/z59;", "getMap$runtime", "setMap$runtime", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends h69<zr1<Object>, c1e<Object>> implements a69.a {

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private z59 map;

        public a(z59 z59Var) {
            super(z59Var);
            this.map = z59Var;
        }

        @Override // com.google.inputmethod.h69, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof zr1) {
                return o((zr1) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof c1e) {
                return p((c1e) obj);
            }
            return false;
        }

        @Override // com.google.inputmethod.h69, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof zr1) {
                return q((zr1) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof zr1) ? obj2 : r((zr1) obj, (c1e) obj2);
        }

        @Override // com.google.inputmethod.h69
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public z59 build() {
            z59 z59Var;
            if (g() == this.map.q()) {
                z59Var = this.map;
            } else {
                k(new e48());
                z59Var = new z59(g(), size());
            }
            this.map = z59Var;
            return z59Var;
        }

        public /* bridge */ boolean o(zr1<Object> zr1Var) {
            return super.containsKey(zr1Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* bridge */ boolean p(c1e<Object> c1eVar) {
            return super/*java.util.AbstractMap*/.containsValue(c1eVar);
        }

        public /* bridge */ c1e<Object> q(zr1<Object> zr1Var) {
            return (c1e) super.get(zr1Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* bridge */ c1e<Object> r(zr1<Object> zr1Var, c1e<Object> c1eVar) {
            return (c1e) super/*java.util.AbstractMap*/.getOrDefault(zr1Var, c1eVar);
        }

        @Override // com.google.inputmethod.h69, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof zr1) {
                return s((zr1) obj);
            }
            return null;
        }

        public /* bridge */ c1e<Object> s(zr1<Object> zr1Var) {
            return (c1e) super.remove(zr1Var);
        }
    }

    /* JADX INFO: renamed from: com.google.android.z59$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/google/android/z59$b;", "", "<init>", "()V", "Lcom/google/android/z59;", "Empty", "Lcom/google/android/z59;", "a", "()Lcom/google/android/z59;", "getEmpty$annotations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z59 a() {
            return z59.i;
        }

        private Companion() {
        }
    }

    static {
        shd shdVarA = shd.INSTANCE.a();
        Intrinsics.h(shdVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        i = new z59(shdVarA, 0);
    }

    public z59(shd<zr1<Object>, c1e<Object>> shdVar, int i2) {
        super(shdVar, i2);
    }

    @Override // com.google.inputmethod.a69
    public a69 Y0(zr1<Object> key, c1e<Object> value) {
        shd.b<zr1<Object>, c1e<Object>> bVarP = q().P(key.hashCode(), key, value, 0);
        return bVarP == null ? this : new z59(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    @Override // com.google.inputmethod.gs1
    public <T> T a(zr1<T> key) {
        return (T) hs1.b(this, key);
    }

    @Override // com.google.inputmethod.c69, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof zr1) {
            return w((zr1) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof c1e) {
            return x((c1e) obj);
        }
        return false;
    }

    @Override // com.google.inputmethod.c69, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof zr1) {
            return y((zr1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof zr1) ? obj2 : z((zr1) obj, (c1e) obj2);
    }

    @Override // com.google.inputmethod.c69
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a builder() {
        return new a(this);
    }

    public /* bridge */ boolean w(zr1<Object> zr1Var) {
        return super.containsKey(zr1Var);
    }

    public /* bridge */ boolean x(c1e<Object> c1eVar) {
        return super.containsValue(c1eVar);
    }

    public /* bridge */ c1e<Object> y(zr1<Object> zr1Var) {
        return (c1e) super.get(zr1Var);
    }

    public /* bridge */ c1e<Object> z(zr1<Object> zr1Var, c1e<Object> c1eVar) {
        return (c1e) super.getOrDefault(zr1Var, c1eVar);
    }
}
