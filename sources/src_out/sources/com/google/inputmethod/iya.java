package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.u67;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0018B1\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u0010\u001a\u00020\u000f*\u00020\f2&\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R4\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00060\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010'¨\u0006)"}, d2 = {"Lcom/google/android/iya;", "Lcom/google/android/cya;", "", "", "", "", "", "savedStates", "<init>", "(Ljava/util/Map;)V", "q", "()Ljava/util/Map;", "Lcom/google/android/qya;", "map", "key", "", "r", "(Lcom/google/android/qya;Ljava/util/Map;Ljava/lang/Object;)V", "Lkotlin/Function0;", "content", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;I)V", "d", "(Ljava/lang/Object;)V", "a", "Ljava/util/Map;", "Lcom/google/android/k58;", "b", "Lcom/google/android/k58;", "registries", "c", "Lcom/google/android/qya;", "getParentSaveableStateRegistry", "()Lcom/google/android/qya;", "s", "(Lcom/google/android/qya;)V", "parentSaveableStateRegistry", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "canBeSaved", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class iya implements cya {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final k0b<iya, ?> f = n0b.e(new Function2() { // from class: com.google.android.eya
        public final Object invoke(Object obj, Object obj2) {
            return iya.j((o0b) obj, (iya) obj2);
        }
    }, new Function1() { // from class: com.google.android.fya
        public final Object invoke(Object obj) {
            return iya.k((Map) obj);
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final k58<Object, qya> registries;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private qya parentSaveableStateRegistry;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<Object, Boolean> canBeSaved;

    /* JADX INFO: renamed from: com.google.android.iya$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/iya$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Lcom/google/android/iya;", "Saver", "Lcom/google/android/k0b;", "a", "()Lcom/google/android/k0b;", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k0b<iya, ?> a() {
            return iya.f;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/android/iya$b", "Lcom/google/android/jd3;", "", "dispose", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements jd3 {
        final /* synthetic */ Object b;
        final /* synthetic */ vya c;

        public b(Object obj, vya vyaVar) {
            this.b = obj;
            this.c = vyaVar;
        }

        @Override // com.google.inputmethod.jd3
        public void dispose() {
            Object objU = iya.this.registries.u(this.b);
            vya vyaVar = this.c;
            if (objU == vyaVar) {
                iya iyaVar = iya.this;
                iyaVar.r(vyaVar, iyaVar.savedStates, this.b);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public iya() {
        Map map = null;
        this(map, 1, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jd3 h(iya iyaVar, Object obj, vya vyaVar, kd3 kd3Var) {
        if (!iyaVar.registries.b(obj)) {
            iyaVar.savedStates.remove(obj);
            iyaVar.registries.x(obj, vyaVar);
            return iyaVar.new b(obj, vyaVar);
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(iya iyaVar, Object obj, Function2 function2, int i, d dVar, int i2) {
        iyaVar.e(obj, function2, dVar, saa.a(i | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(o0b o0bVar, iya iyaVar) {
        return iyaVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iya k(Map map) {
        return new iya(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(iya iyaVar, Object obj) {
        qya qyaVar = iyaVar.parentSaveableStateRegistry;
        if (qyaVar != null) {
            return qyaVar.a(obj);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004c A[LOOP:0: B:5:0x0013->B:15:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f A[EDGE_INSN: B:21:0x004f->B:16:0x004f BREAK  A[LOOP:0: B:5:0x0013->B:15:0x004c], SYNTHETIC] */
    private final Map<Object, Map<String, List<Object>>> q() {
        Map<Object, Map<String, List<Object>>> map = this.savedStates;
        k58<Object, qya> k58Var = this.registries;
        Object[] objArr = k58Var.keys;
        Object[] objArr2 = k58Var.values;
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
                            int i4 = (i << 3) + i3;
                            r((qya) objArr2[i4], map, objArr[i4]);
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
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(qya qyaVar, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> mapC = qyaVar.c();
        if (mapC.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapC);
        }
    }

    @Override // com.google.inputmethod.cya
    public void d(Object key) {
        if (this.registries.u(key) == null) {
            this.savedStates.remove(key);
        }
    }

    @Override // com.google.inputmethod.cya
    public void e(final Object obj, final Function2<? super d, ? super Integer, Unit> function2, d dVar, final int i) {
        int i2;
        d dVarF = dVar.F(533563200);
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
                e.o(533563200, i2, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            dVarF.p(207, obj);
            Object objR = dVarF.R();
            d.Companion companion = d.INSTANCE;
            if (objR == companion.a()) {
                if (!((Boolean) this.canBeSaved.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objR = new vya(tya.c(this.savedStates.get(obj), this.canBeSaved));
                dVarF.L(objR);
            }
            final vya vyaVar = (vya) objR;
            fs1.d(new os9[]{tya.g().d(vyaVar), u67.c().d(vyaVar)}, function2, dVarF, (i2 & 112) | os9.i);
            Unit unit = Unit.a;
            boolean zT = dVarF.T(this) | dVarF.T(obj) | dVarF.T(vyaVar);
            Object objR2 = dVarF.R();
            if (zT || objR2 == companion.a()) {
                objR2 = new Function1() { // from class: com.google.android.gya
                    public final Object invoke(Object obj2) {
                        return iya.h(this.a, obj, vyaVar, (kd3) obj2);
                    }
                };
                dVarF.L(objR2);
            }
            vn3.c(unit, (Function1) objR2, dVarF, 6);
            dVarF.P();
            if (e.k()) {
                e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.hya
                public final Object invoke(Object obj2, Object obj3) {
                    return iya.i(this.a, obj, function2, i, (d) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public final void s(qya qyaVar) {
        this.parentSaveableStateRegistry = qyaVar;
    }

    public iya(Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registries = k4b.c();
        this.canBeSaved = new Function1() { // from class: com.google.android.dya
            public final Object invoke(Object obj) {
                return Boolean.valueOf(iya.p(this.a, obj));
            }
        };
    }

    public /* synthetic */ iya(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }
}
