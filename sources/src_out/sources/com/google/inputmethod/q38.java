package com.google.inputmethod;

import androidx.collection.ObjectList;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001f\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006+"}, d2 = {"Lcom/google/android/q38;", "", "K", "V", "Lcom/google/android/k58;", "map", "d", "(Lcom/google/android/k58;)Lcom/google/android/k58;", "key", "value", "", "a", "(Lcom/google/android/k58;Ljava/lang/Object;Ljava/lang/Object;)V", "c", "(Lcom/google/android/k58;)V", "", "f", "(Lcom/google/android/k58;Ljava/lang/Object;)Z", "Landroidx/collection/ObjectList;", "h", "(Lcom/google/android/k58;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "j", "(Lcom/google/android/k58;)Z", "k", "m", "(Lcom/google/android/k58;Ljava/lang/Object;)Ljava/lang/Object;", "l", "q", "(Lcom/google/android/k58;)Landroidx/collection/ObjectList;", "Lkotlin/Function1;", "condition", "n", "(Lcom/google/android/k58;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/k58;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q38<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k58<Object, Object> map;

    private /* synthetic */ q38(k58 k58Var) {
        this.map = k58Var;
    }

    public static final void a(k58<Object, Object> k58Var, K k, V v) {
        int iN = k58Var.n(k);
        boolean z = iN < 0;
        Object obj = z ? null : k58Var.values[iN];
        a.n(obj);
        if (obj != null) {
            if (obj instanceof e58) {
                Intrinsics.h(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                e58 e58Var = (e58) obj;
                e58Var.n(v);
                v = (V) e58Var;
            } else {
                v = (V) am8.h(obj, v);
            }
        }
        if (!z) {
            k58Var.values[iN] = v;
            return;
        }
        int i = ~iN;
        k58Var.keys[i] = k;
        k58Var.values[i] = v;
    }

    public static final /* synthetic */ q38 b(k58 k58Var) {
        return new q38(k58Var);
    }

    public static final void c(k58<Object, Object> k58Var) {
        k58Var.k();
    }

    public static <K, V> k58<Object, Object> d(k58<Object, Object> k58Var) {
        return k58Var;
    }

    public static /* synthetic */ k58 e(k58 k58Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            k58Var = new k58(0, 1, null);
        }
        return d(k58Var);
    }

    public static final boolean f(k58<Object, Object> k58Var, K k) {
        return k58Var.b(k);
    }

    public static boolean g(k58<Object, Object> k58Var, Object obj) {
        return (obj instanceof q38) && Intrinsics.e(k58Var, ((q38) obj).getMap());
    }

    public static final ObjectList<V> h(k58<Object, Object> k58Var, K k) {
        Object objE = k58Var.e(k);
        if (objE == null) {
            return am8.f();
        }
        return objE instanceof e58 ? (ObjectList) objE : am8.i(objE);
    }

    public static int i(k58<Object, Object> k58Var) {
        return k58Var.hashCode();
    }

    public static final boolean j(k58<Object, Object> k58Var) {
        return k58Var.h();
    }

    public static final boolean k(k58<Object, Object> k58Var) {
        return k58Var.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V l(k58<Object, Object> k58Var, K k) {
        V v = (V) k58Var.e(k);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof e58)) {
            k58Var.u(k);
            return v;
        }
        e58 e58Var = (e58) v;
        V v2 = (V) e58Var.B(0);
        if (e58Var.g()) {
            k58Var.u(k);
        }
        if (e58Var.get_size() == 1) {
            k58Var.x(k, e58Var.c());
        }
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V m(k58<Object, Object> k58Var, K k) {
        V v = (V) k58Var.e(k);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof e58)) {
            k58Var.u(k);
            return v;
        }
        e58 e58Var = (e58) v;
        V v2 = (V) i24.b(e58Var);
        Intrinsics.h(v2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (e58Var.g()) {
            k58Var.u(k);
        }
        if (e58Var.get_size() == 1) {
            k58Var.x(k, e58Var.c());
        }
        return v2;
    }

    public static final void n(k58<Object, Object> k58Var, K k, Function1<? super V, Boolean> function1) {
        Object objE = k58Var.e(k);
        if (objE != null) {
            if (!(objE instanceof e58)) {
                if (((Boolean) function1.invoke(objE)).booleanValue()) {
                    k58Var.u(k);
                    return;
                }
                return;
            }
            e58 e58Var = (e58) objE;
            int i = e58Var._size;
            Object[] objArr = e58Var.content;
            int i2 = 0;
            IntRange intRangeA = g.A(0, i);
            int iF = intRangeA.f();
            int i3 = intRangeA.i();
            if (iF <= i3) {
                while (true) {
                    objArr[iF - i2] = objArr[iF];
                    if (((Boolean) function1.invoke(objArr[iF])).booleanValue()) {
                        i2++;
                    }
                    if (iF == i3) {
                        break;
                    } else {
                        iF++;
                    }
                }
            }
            f.A(objArr, (Object) null, i - i2, i);
            e58Var._size -= i2;
            if (e58Var.g()) {
                k58Var.u(k);
            }
            if (e58Var.get_size() == 0) {
                k58Var.x(k, e58Var.c());
            }
        }
    }

    public static String o(k58<Object, Object> k58Var) {
        return "MultiValueMap(map=" + k58Var + ')';
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[LOOP:0: B:9:0x001d->B:22:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069 A[EDGE_INSN: B:25:0x0069->B:23:0x0069 BREAK  A[LOOP:0: B:9:0x001d->B:22:0x0066], SYNTHETIC] */
    public static final ObjectList<V> q(k58<Object, Object> k58Var) {
        if (k58Var.h()) {
            return am8.f();
        }
        e58 e58Var = new e58(0, 1, null);
        Object[] objArr = k58Var.values;
        long[] jArr = k58Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof e58) {
                                Intrinsics.h(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                e58Var.p((e58) obj);
                            } else {
                                Intrinsics.h(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                e58Var.n(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return e58Var;
    }

    public boolean equals(Object other) {
        return g(this.map, other);
    }

    public int hashCode() {
        return i(this.map);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final /* synthetic */ k58 getMap() {
        return this.map;
    }

    public String toString() {
        return o(this.map);
    }
}
