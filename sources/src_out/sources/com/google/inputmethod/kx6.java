package com.google.inputmethod;

import androidx.collection.d;
import androidx.compose.p004runtime.e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0018\u00010\b\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\rJ#\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\t2\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%¨\u0006'"}, d2 = {"Lcom/google/android/kx6;", "Lcom/google/android/qya;", "Lcom/google/android/cya;", "wrappedRegistry", "wrappedHolder", "<init>", "(Lcom/google/android/qya;Lcom/google/android/cya;)V", "parentRegistry", "", "", "", "", "restoredValues", "(Lcom/google/android/qya;Ljava/util/Map;Lcom/google/android/cya;)V", "c", "()Ljava/util/Map;", "key", "Lkotlin/Function0;", "", "content", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "d", "(Ljava/lang/Object;)V", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "valueProvider", "Lcom/google/android/qya$a;", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/google/android/qya$a;", "value", "", "a", "(Ljava/lang/Object;)Z", "Lcom/google/android/qya;", "Lcom/google/android/cya;", "Landroidx/collection/d;", "Landroidx/collection/d;", "previouslyComposedKeys", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class kx6 implements qya, cya {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final qya wrappedRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final cya wrappedHolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d<Object> previouslyComposedKeys;

    /* JADX INFO: renamed from: com.google.android.kx6$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f0\n0\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/kx6$a;", "", "<init>", "()V", "Lcom/google/android/qya;", "parentRegistry", "Lcom/google/android/cya;", "wrappedHolder", "Lcom/google/android/k0b;", "Lcom/google/android/kx6;", "", "", "", "c", "(Lcom/google/android/qya;Lcom/google/android/cya;)Lcom/google/android/k0b;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map d(o0b o0bVar, kx6 kx6Var) {
            Map<String, List<Object>> mapC = kx6Var.c();
            if (mapC.isEmpty()) {
                return null;
            }
            return mapC;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kx6 e(qya qyaVar, cya cyaVar, Map map) {
            return new kx6(qyaVar, map, cyaVar);
        }

        public final k0b<kx6, Map<String, List<Object>>> c(final qya parentRegistry, final cya wrappedHolder) {
            return n0b.e(new Function2() { // from class: com.google.android.ix6
                public final Object invoke(Object obj, Object obj2) {
                    return kx6.Companion.d((o0b) obj, (kx6) obj2);
                }
            }, new Function1() { // from class: com.google.android.jx6
                public final Object invoke(Object obj) {
                    return kx6.Companion.e(parentRegistry, wrappedHolder, (Map) obj);
                }
            });
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/kx6$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ Object b;

        public b(Object obj) {
            this.b = obj;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            kx6.this.previouslyComposedKeys.x(this.b);
        }
    }

    public kx6(qya qyaVar, cya cyaVar) {
        this.wrappedRegistry = qyaVar;
        this.wrappedHolder = cyaVar;
        this.previouslyComposedKeys = l4b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 j(kx6 kx6Var, Object obj, kd3 kd3Var) {
        kx6Var.previouslyComposedKeys.u(obj);
        return kx6Var.new b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(kx6 kx6Var, Object obj, Function2 function2, int i, androidx.compose.p004runtime.d dVar, int i2) {
        kx6Var.e(obj, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(qya qyaVar, Object obj) {
        if (qyaVar != null) {
            return qyaVar.a(obj);
        }
        return true;
    }

    @Override // com.google.inputmethod.qya
    public boolean a(Object value) {
        return this.wrappedRegistry.a(value);
    }

    @Override // com.google.inputmethod.qya
    public qya.a b(String key, Function0<? extends Object> valueProvider) {
        return this.wrappedRegistry.b(key, valueProvider);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // com.google.inputmethod.qya
    public Map<String, List<Object>> c() {
        d<Object> dVar = this.previouslyComposedKeys;
        Object[] objArr = dVar.elements;
        long[] jArr = dVar.metadata;
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
                            this.wrappedHolder.d(objArr[(i << 3) + i3]);
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
        return this.wrappedRegistry.c();
    }

    @Override // com.google.inputmethod.cya
    public void d(Object key) {
        this.wrappedHolder.d(key);
    }

    @Override // com.google.inputmethod.cya
    public void e(final Object obj, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i) {
        int i2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-858296452);
        if ((i & 6) == 0) {
            i2 = (dVarF.T(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dVarF.T(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dVarF.T(this) ? 256 : 128;
        }
        if (dVarF.g((i2 & 147) != 146, i2 & 1)) {
            if (e.k()) {
                e.o(-858296452, i2, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            int i3 = i2 & 14;
            this.wrappedHolder.e(obj, function2, dVarF, i2 & 126);
            boolean zT = dVarF.T(this) | dVarF.T(obj);
            Object objR = dVarF.R();
            if (zT || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.fx6
                    public final Object invoke(Object obj2) {
                        return kx6.j(this.a, obj, (kd3) obj2);
                    }
                };
                dVarF.L(objR);
            }
            vn3.c(obj, (Function1) objR, dVarF, i3);
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.gx6
                public final Object invoke(Object obj2, Object obj3) {
                    return kx6.k(this.a, obj, function2, i, (androidx.compose.p004runtime.d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    @Override // com.google.inputmethod.qya
    public Object f(String key) {
        return this.wrappedRegistry.f(key);
    }

    public kx6(final qya qyaVar, Map<String, ? extends List<? extends Object>> map, cya cyaVar) {
        this(tya.c(map, new Function1() { // from class: com.google.android.hx6
            public final Object invoke(Object obj) {
                return Boolean.valueOf(kx6.l(qyaVar, obj));
            }
        }), cyaVar);
    }
}
