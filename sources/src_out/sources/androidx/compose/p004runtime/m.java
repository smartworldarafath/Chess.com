package androidx.compose.p004runtime;

import androidx.collection.d;
import androidx.compose.p004runtime.m;
import com.google.inputmethod.JoinedKey;
import com.google.inputmethod.SlotReader;
import com.google.inputmethod.SlotWriter;
import com.google.inputmethod.aq1;
import com.google.inputmethod.ena;
import com.google.inputmethod.fub;
import com.google.inputmethod.k58;
import com.google.inputmethod.ku4;
import com.google.inputmethod.l4b;
import com.google.inputmethod.q38;
import com.google.inputmethod.sea;
import com.google.inputmethod.ui6;
import com.google.inputmethod.yu4;
import com.google.inputmethod.zea;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000e\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\b\b\u0000\u0010\u0010*\u00020\f\"\b\b\u0001\u0010\u0011*\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001e\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010 \u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001f\u001a3\u0010%\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b%\u0010&\u001a+\u0010)\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*\u001a#\u0010+\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010,\u001a)\u0010-\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.\u001a\u0013\u00100\u001a\u00020\n*\u00020/H\u0002¢\u0006\u0004\b0\u00101\u001a\u0013\u00102\u001a\u00020/*\u00020\nH\u0002¢\u0006\u0004\b2\u00103\u001a#\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001b*\u0002042\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108\u001a#\u0010;\u001a\u00020\n*\u0002092\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010<\u001a+\u0010@\u001a\u00020\n*\u0002092\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010A\"$\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u001c0Bj\b\u0012\u0004\u0012\u00020\u001c`C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010D\"\u0018\u0010I\u001a\u00020\f*\u00020F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/google/android/zea;", "Lcom/google/android/yu4;", "r", "(Lcom/google/android/zea;)Lcom/google/android/yu4;", "Lcom/google/android/wub;", "Lcom/google/android/sea;", "rememberManager", "", "v", "(Lcom/google/android/wub;Lcom/google/android/sea;)V", "", "index", "", "data", "G", "(Lcom/google/android/wub;ILjava/lang/Object;)V", "K", "V", "initialCapacity", "Lcom/google/android/q38;", "E", "(I)Lcom/google/android/k58;", "value", "left", "right", "C", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/p;", "location", "z", "(Ljava/util/List;I)I", "y", "", "Landroidx/compose/runtime/b0;", "scope", "instance", "D", "(Ljava/util/List;ILandroidx/compose/runtime/b0;Ljava/lang/Object;)V", "start", "end", "A", "(Ljava/util/List;II)Landroidx/compose/runtime/p;", "H", "(Ljava/util/List;I)Landroidx/compose/runtime/p;", "I", "(Ljava/util/List;II)V", "", "s", "(Z)I", "q", "(I)Z", "Lcom/google/android/fub;", "Lcom/google/android/ku4;", "anchor", "t", "(Lcom/google/android/fub;Lcom/google/android/ku4;)Ljava/util/List;", "Lcom/google/android/bub;", "root", "x", "(Lcom/google/android/bub;II)I", "a", "b", "common", "F", "(Lcom/google/android/bub;III)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "InvalidationLocationAscending", "Lcom/google/android/ui6;", "B", "(Lcom/google/android/ui6;)Ljava/lang/Object;", "joinedKey", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    private static final Comparator<p> a = new Comparator() { // from class: androidx.compose.runtime.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return m.c((p) obj, (p) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final p A(List<p> list, int i, int i2) {
        int iY = y(list, i);
        if (iY >= list.size()) {
            return null;
        }
        p pVar = list.get(iY);
        if (pVar.getLocation() < i2) {
            return pVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object B(ui6 ui6Var) {
        return ui6Var.getObjectKey() != null ? new JoinedKey(Integer.valueOf(ui6Var.getKey()), ui6Var.getObjectKey()) : Integer.valueOf(ui6Var.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object C(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (Intrinsics.e(joinedKey.getLeft(), obj2) && Intrinsics.e(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object objC = C(joinedKey.getLeft(), obj2, obj3);
        return objC == null ? C(joinedKey.getRight(), obj2, obj3) : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(List<p> list, int i, b0 b0Var, Object obj) {
        int iZ = z(list, i);
        if (iZ < 0) {
            int i2 = -(iZ + 1);
            if (!(obj instanceof j)) {
                obj = null;
            }
            list.add(i2, new p(b0Var, i, obj));
            return;
        }
        p pVar = list.get(iZ);
        if (!(obj instanceof j)) {
            pVar.e(null);
            return;
        }
        Object instances = pVar.getInstances();
        if (instances == null) {
            pVar.e(obj);
        } else if (instances instanceof d) {
            ((d) instances).h(obj);
        } else {
            pVar.e(l4b.c(instances, obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> k58<Object, Object> E(int i) {
        return q38.d(new k58(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(SlotReader bubVar, int i, int i2, int i3) {
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                return i3;
            }
            if (bubVar.Q(i) == i2) {
                return i2;
            }
            if (bubVar.Q(i2) != i) {
                if (bubVar.Q(i) == bubVar.Q(i2)) {
                    return bubVar.Q(i);
                }
                int iX = x(bubVar, i, i3);
                int iX2 = x(bubVar, i2, i3);
                int i4 = iX - iX2;
                for (int i5 = 0; i5 < i4; i5++) {
                    i = bubVar.Q(i);
                }
                int i6 = iX2 - iX;
                for (int i7 = 0; i7 < i6; i7++) {
                    i2 = bubVar.Q(i2);
                }
                while (i != i2) {
                    i = bubVar.Q(i);
                    i2 = bubVar.Q(i2);
                }
                return i;
            }
        }
        return i;
    }

    private static final void G(SlotWriter slotWriter, int i, Object obj) {
        Object objI = slotWriter.I(i);
        if (obj == objI) {
            return;
        }
        e.b("Slot table is out of sync (expected " + obj + ", got " + objI + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p H(List<p> list, int i) {
        int iZ = z(list, i);
        if (iZ >= 0) {
            return list.remove(iZ);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(List<p> list, int i, int i2) {
        int iY = y(list, i);
        while (iY < list.size() && list.get(iY).getLocation() < i2) {
            list.remove(iY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(p pVar, p pVar2) {
        return Intrinsics.i(pVar.getLocation(), pVar2.getLocation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(int i) {
        return i != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final yu4 r(zea zeaVar) throws KotlinNothingValueException {
        yu4 yu4Var = zeaVar instanceof yu4 ? (yu4) zeaVar : null;
        if (yu4Var != null) {
            return yu4Var;
        }
        e.c("Inconsistent composition");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> t(fub fubVar, ku4 ku4Var) {
        ArrayList arrayList = new ArrayList();
        SlotReader bubVarM = fubVar.M();
        try {
            u(bubVarM, arrayList, fubVar.u(ku4Var));
            Unit unit = Unit.a;
            return arrayList;
        } finally {
            bubVarM.d();
        }
    }

    private static final void u(SlotReader bubVar, List<Object> list, int i) {
        if (bubVar.K(i)) {
            list.add(bubVar.M(i));
            return;
        }
        int iF = i + 1;
        int iF2 = i + bubVar.F(i);
        while (iF < iF2) {
            u(bubVar, list, iF);
            iF += bubVar.F(iF);
        }
    }

    public static final void v(final SlotWriter slotWriter, final sea seaVar) {
        slotWriter.X(slotWriter.getCurrentGroup(), new Function2() { // from class: com.google.android.vu4
            public final Object invoke(Object obj, Object obj2) {
                return m.w(seaVar, slotWriter, ((Integer) obj).intValue(), obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(sea seaVar, SlotWriter slotWriter, int i, Object obj) {
        if (obj instanceof aq1) {
            seaVar.h((aq1) obj);
        } else if (!(obj instanceof ena)) {
            if (obj instanceof zea) {
                G(slotWriter, i, obj);
                seaVar.e((zea) obj);
            } else if (obj instanceof b0) {
                G(slotWriter, i, obj);
                ((b0) obj).A();
            }
        }
        return Unit.a;
    }

    private static final int x(SlotReader bubVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = bubVar.Q(i);
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int y(List<p> list, int i) {
        int iZ = z(list, i);
        return iZ < 0 ? -(iZ + 1) : iZ;
    }

    private static final int z(List<p> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = Intrinsics.i(list.get(i3).getLocation(), i);
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}
