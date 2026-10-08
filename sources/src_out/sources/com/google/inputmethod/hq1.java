package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.f;
import androidx.compose.p004runtime.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000f2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/android/wub;", "", "child", "", "group", "parent", "", "Lcom/google/android/iq1;", "b", "(Lcom/google/android/wub;Ljava/lang/Object;ILjava/lang/Integer;)Ljava/util/List;", "Lcom/google/android/bub;", "a", "(Lcom/google/android/bub;)Ljava/util/List;", "g", "(Lcom/google/android/bub;ILjava/lang/Object;)Ljava/util/List;", "Lcom/google/android/fub;", "Lkotlin/Function1;", "", "filter", "Lcom/google/android/bm8;", "d", "(Lcom/google/android/fub;Lkotlin/jvm/functions/Function1;)Lcom/google/android/bm8;", "Landroidx/compose/runtime/f;", "context", "e", "(Lcom/google/android/fub;Landroidx/compose/runtime/f;)Ljava/lang/Integer;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class hq1 {
    public static final List<ComposeStackTraceFrame> a(SlotReader slotReader) {
        if (slotReader.getClosed() || slotReader.getGroupsSize() == 0) {
            return m.p();
        }
        j9a j9aVar = new j9a(slotReader);
        int parent = slotReader.getParent();
        Object objValueOf = Integer.valueOf(slotReader.y());
        while (parent >= 0) {
            j9aVar.f(slotReader.D(parent), slotReader.H(parent) ? slotReader.E(parent) : d.INSTANCE.a(), slotReader.getTable().R(parent), objValueOf);
            objValueOf = slotReader.a(parent);
            parent = slotReader.Q(parent);
        }
        return j9aVar.i();
    }

    public static final List<ComposeStackTraceFrame> b(SlotWriter slotWriter, Object obj, int i, Integer num) {
        int iL0;
        int iJ0;
        if (slotWriter.getClosed() || slotWriter.f0() == 0) {
            return m.p();
        }
        vne vneVar = new vne(slotWriter);
        if (num != null) {
            iL0 = num.intValue();
        } else {
            iL0 = slotWriter.getParent() < 0 ? slotWriter.L0(i) : slotWriter.getParent();
        }
        if (obj == null) {
            obj = Integer.valueOf(slotWriter.m0(i));
        }
        if (slotWriter.x0(i)) {
            iJ0 = slotWriter.j0(i);
        } else {
            int iL1 = iL0 >= 0 ? slotWriter.L0(iL0) : iL0;
            iJ0 = slotWriter.j0(iL0);
            int i2 = iL0;
            iL0 = iL1;
            i = i2;
        }
        while (i >= 0) {
            vneVar.f(iJ0, slotWriter.n0(i) ? slotWriter.k0(i) : d.INSTANCE.a(), slotWriter.k1(i), obj);
            obj = slotWriter.B(i);
            if (iL0 >= 0) {
                int iL2 = slotWriter.L0(iL0);
                iJ0 = slotWriter.j0(iL0);
                int i3 = iL0;
                iL0 = iL2;
                i = i3;
            } else {
                i = iL0;
            }
        }
        return vneVar.i();
    }

    public static /* synthetic */ List c(SlotWriter slotWriter, Object obj, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        if ((i2 & 2) != 0) {
            i = slotWriter.getCurrentGroup();
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return b(slotWriter, obj, i, num);
    }

    public static final ObjectLocation d(fub fubVar, Function1<Object, Boolean> function1) {
        SlotReader slotReaderM = fubVar.M();
        for (int i = 0; i < fubVar.getGroupsSize(); i++) {
            try {
                if (slotReaderM.K(i) && ((Boolean) function1.invoke(slotReaderM.M(i))).booleanValue()) {
                    ObjectLocation objectLocation = new ObjectLocation(i, null);
                    slotReaderM.d();
                    return objectLocation;
                }
                int iV = slotReaderM.V(i);
                for (int i2 = 0; i2 < iV; i2++) {
                    if (((Boolean) function1.invoke(slotReaderM.C(i, i2))).booleanValue()) {
                        ObjectLocation objectLocation2 = new ObjectLocation(i, Integer.valueOf(i2));
                        slotReaderM.d();
                        return objectLocation2;
                    }
                }
            } catch (Throwable th) {
                slotReaderM.d();
                throw th;
            }
        }
        Unit unit = Unit.a;
        slotReaderM.d();
        return null;
    }

    public static final Integer e(fub fubVar, f fVar) {
        SlotReader slotReaderM = fubVar.M();
        try {
            return f(slotReaderM, fVar, 0, slotReaderM.getGroupsSize());
        } finally {
            slotReaderM.d();
        }
    }

    private static final Integer f(SlotReader slotReader, f fVar, int i, int i2) {
        Integer numF;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iF = slotReader.F(i) + i;
            if (slotReader.G(i) && slotReader.D(i) == 206 && Intrinsics.e(slotReader.E(i), e.j())) {
                Object objC = slotReader.C(i, 0);
                zea zeaVar = objC instanceof zea ? (zea) objC : null;
                yea wrapped = zeaVar != null ? zeaVar.getWrapped() : null;
                k.a aVar = wrapped instanceof k.a ? (k.a) wrapped : null;
                if (aVar != null && Intrinsics.e(aVar.getRef(), fVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (slotReader.e(i) && (numF = f(slotReader, fVar, i + 1, iF)) != null) {
                return Integer.valueOf(numF.intValue());
            }
            i = iF;
        }
    }

    public static final List<ComposeStackTraceFrame> g(SlotReader slotReader, int i, Object obj) {
        j9a j9aVar = new j9a(slotReader);
        i = slotReader.Q(i);
        ku4 ku4VarA = slotReader.a(i);
        while (i >= 0) {
            j9aVar.f(slotReader.D(i), slotReader.H(i) ? slotReader.E(i) : d.INSTANCE.a(), slotReader.getTable().R(i), obj);
            if (i >= 0) {
                ku4 ku4Var = ku4VarA;
                ku4VarA = slotReader.a(i);
                i = slotReader.Q(i);
                obj = ku4Var;
            } else {
                obj = ku4VarA;
            }
        }
        return j9aVar.i();
    }
}
