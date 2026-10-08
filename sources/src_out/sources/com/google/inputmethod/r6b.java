package com.google.inputmethod;

import androidx.collection.ScatterSet;
import androidx.collection.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\nJ\u001d\u0010\"\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b$\u0010%R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006*"}, d2 = {"Lcom/google/android/r6b;", "", "Key", "Scope", "Lcom/google/android/k58;", "map", "d", "(Lcom/google/android/k58;)Lcom/google/android/k58;", "key", "h", "(Lcom/google/android/k58;Ljava/lang/Object;)Ljava/lang/Object;", "scope", "", "a", "(Lcom/google/android/k58;Ljava/lang/Object;Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "b", "(Lcom/google/android/k58;Ljava/lang/Object;Landroidx/collection/ScatterSet;)V", "value", "o", "element", "", "f", "(Lcom/google/android/k58;Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "g", "(Lcom/google/android/k58;Lkotlin/jvm/functions/Function1;)V", "c", "(Lcom/google/android/k58;)V", "j", "(Lcom/google/android/k58;)Z", "k", "l", "m", "(Lcom/google/android/k58;Ljava/lang/Object;Ljava/lang/Object;)Z", "n", "(Lcom/google/android/k58;Ljava/lang/Object;)V", "", "i", "(Lcom/google/android/k58;)I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r6b<Key, Scope> {
    public static final void a(k58<Object, Object> k58Var, Key key, Scope scope) {
        int iN = k58Var.n(key);
        int i = 0;
        int i2 = 1;
        boolean z = iN < 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Object obj = z ? null : k58Var.values[iN];
        if (obj != null) {
            if (obj instanceof d) {
                Intrinsics.h(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((d) obj).h(scope);
            } else if (obj != scope) {
                d dVar = new d(i, i2, defaultConstructorMarker);
                Intrinsics.h(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                dVar.h(obj);
                dVar.h(scope);
                scope = (Scope) dVar;
            }
            scope = (Scope) obj;
        }
        if (!z) {
            k58Var.values[iN] = scope;
            return;
        }
        int i3 = ~iN;
        k58Var.keys[i3] = key;
        k58Var.values[i3] = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(k58<Object, Object> k58Var, Key key, ScatterSet<Scope> scatterSet) {
        Object obj;
        Object obj2;
        Object obj3;
        d dVar;
        d dVarB;
        int iN = k58Var.n(key);
        boolean z = iN < 0;
        if (z) {
            obj2 = null;
        } else {
            obj = k58Var.values[iN];
        }
        if (obj2 == null) {
            obj2 = obj;
            dVarB = l4b.b();
            dVarB.i(scatterSet);
        } else {
            obj2 = obj;
            if (obj2 instanceof d) {
                Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                dVar = (d) obj2;
                dVar.i(scatterSet);
            } else {
                Intrinsics.h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                if (scatterSet.get_size() != 1 || !scatterSet.a(obj2)) {
                    obj3 = obj2;
                    d dVarB2 = l4b.b();
                    dVarB2.i(scatterSet);
                    dVarB2.h(obj2);
                    obj3 = dVarB2;
                }
            }
        }
        if (!z) {
            obj3 = dVar;
            obj3 = dVarB;
            k58Var.values[iN] = obj3;
        } else {
            obj3 = dVar;
            obj3 = dVarB;
            int i = ~iN;
            k58Var.keys[i] = key;
            k58Var.values[i] = obj3;
        }
    }

    public static final void c(k58<Object, Object> k58Var) {
        k58Var.k();
    }

    public static <Key, Scope> k58<Object, Object> d(k58<Object, Object> k58Var) {
        return k58Var;
    }

    public static /* synthetic */ k58 e(k58 k58Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            k58Var = k4b.c();
        }
        return d(k58Var);
    }

    public static final boolean f(k58<Object, Object> k58Var, Key key) {
        return k58Var.c(key);
    }

    public static final void g(k58<Object, Object> k58Var, Function1<? super Key, Unit> function1) {
        Intrinsics.h(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        Function1 function2 = (Function1) a.f(function1, 1);
        Object[] objArr = k58Var.keys;
        long[] jArr = k58Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        function2.invoke(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final Object h(k58<Object, Object> k58Var, Key key) {
        return k58Var.e(key);
    }

    public static final int i(k58<Object, Object> k58Var) {
        return k58Var.get_size();
    }

    public static final boolean j(k58<Object, Object> k58Var) {
        return k58Var.h();
    }

    public static final boolean k(k58<Object, Object> k58Var) {
        return k58Var.i();
    }

    public static final Object l(k58<Object, Object> k58Var, Key key) {
        return k58Var.u(key);
    }

    public static final boolean m(k58<Object, Object> k58Var, Key key, Scope scope) {
        Object objE = k58Var.e(key);
        if (objE == null) {
            return false;
        }
        if (!(objE instanceof d)) {
            if (!Intrinsics.e(objE, scope)) {
                return false;
            }
            k58Var.u(key);
            return true;
        }
        d dVar = (d) objE;
        boolean zY = dVar.y(scope);
        if (zY && dVar.d()) {
            k58Var.u(key);
        }
        return zY;
    }

    public static final void n(k58<Object, Object> k58Var, Scope scope) {
        boolean zD;
        long[] jArr = k58Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = k58Var.keys[i4];
                        Object obj2 = k58Var.values[i4];
                        if (obj2 instanceof d) {
                            Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            d dVar = (d) obj2;
                            dVar.y(scope);
                            zD = dVar.d();
                        } else {
                            zD = obj2 == scope;
                        }
                        if (zD) {
                            k58Var.v(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void o(k58<Object, Object> k58Var, Key key, Scope scope) {
        k58Var.x(key, scope);
    }
}
