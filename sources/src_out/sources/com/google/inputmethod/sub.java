package com.google.inputmethod;

import androidx.compose.p004runtime.InvalidationResult;
import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.bqd;
import com.google.android.qjd;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\r2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00012\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u001f0\u001dH\u0000¢\u0006\u0004\b\"\u0010#\u001a'\u0010'\u001a\u00020\u0004*\u00020\u00012\n\u0010$\u001a\u00060\rj\u0002`\u000e2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b'\u0010(\u001a)\u0010-\u001a\u0004\u0018\u00010,*\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0)2\n\u0010+\u001a\u00060\rj\u0002`*H\u0002¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/google/android/cub;", "Lcom/google/android/eub;", "f", "(Lcom/google/android/cub;)Lcom/google/android/eub;", "", "o", "()V", "Lcom/google/android/kub;", "Lcom/google/android/sea;", "rememberManager", "m", "(Lcom/google/android/kub;Lcom/google/android/sea;)V", "g", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "groupAddress", "table", "k", "(ILcom/google/android/eub;)I", "Lcom/google/android/x22;", "composition", "Lcom/google/android/r08;", "reference", "slots", "Lcom/google/android/ez;", "applier", "Lcom/google/android/q08;", "i", "(Lcom/google/android/x22;Lcom/google/android/r08;Lcom/google/android/kub;Lcom/google/android/ez;)Lcom/google/android/q08;", "Lkotlin/Function1;", "", "", "filter", "Lcom/google/android/bm8;", "j", "(Lcom/google/android/eub;Lkotlin/jvm/functions/Function1;)Lcom/google/android/bm8;", "group", "Lcom/google/android/taa;", "newOwner", "e", "(Lcom/google/android/eub;ILcom/google/android/taa;)V", "", "Landroidx/compose/runtime/composer/linkbuffer/SlotRange;", "slotRegion", "Landroidx/compose/runtime/b0;", "l", "([Ljava/lang/Object;I)Landroidx/compose/runtime/b0;", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class sub {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/google/android/sub$a", "Lcom/google/android/taa;", "Landroidx/compose/runtime/b0;", "scope", "", "instance", "Landroidx/compose/runtime/InvalidationResult;", "m", "(Landroidx/compose/runtime/b0;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "", "d", "(Landroidx/compose/runtime/b0;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements taa {
        final /* synthetic */ x22 a;
        final /* synthetic */ r08 b;

        a(x22 x22Var, r08 r08Var) {
            this.a = x22Var;
            this.b = r08Var;
        }

        @Override // com.google.inputmethod.taa
        public void a(Object value) {
        }

        @Override // com.google.inputmethod.taa
        public void d(b0 scope) {
        }

        @Override // com.google.inputmethod.taa
        public InvalidationResult m(b0 scope, Object instance) {
            InvalidationResult invalidationResultM;
            x22 x22Var = this.a;
            taa taaVar = x22Var instanceof taa ? (taa) x22Var : null;
            if (taaVar == null || (invalidationResultM = taaVar.m(scope, instance)) == null) {
                invalidationResultM = InvalidationResult.IGNORED;
            }
            if (invalidationResultM != InvalidationResult.IGNORED) {
                return invalidationResultM;
            }
            r08 r08Var = this.b;
            List<Pair<b0, Object>> listD = r08Var.d();
            if (instance == null) {
                instance = q6b.a;
            }
            r08Var.i(m.b1(listD, qjd.a(scope, instance)));
            return InvalidationResult.SCHEDULED;
        }
    }

    public static final void e(eub eubVar, int i, taa taaVar) {
        int i2;
        int[] groups = eubVar.getAddressSpace().getGroups();
        Object[] slots = eubVar.getAddressSpace().getSlots();
        hub addressSpace = eubVar.getAddressSpace();
        if (i < 0) {
            return;
        }
        t16 t16Var = new t16();
        int[] groups2 = addressSpace.getGroups();
        int iG = i;
        while (true) {
            b0 b0VarL = l(slots, groups[iG + 5]);
            if (b0VarL != null) {
                b0VarL.c(taaVar);
            }
            if (iG != i && (i2 = groups2[iG + 1]) >= 0) {
                t16Var.i(i2);
            }
            iG = groups2[iG + 3];
            if (iG < 0) {
                if (t16Var.tos == 0) {
                    return;
                } else {
                    iG = t16Var.g();
                }
            }
        }
    }

    public static final eub f(cub cubVar) {
        eub eubVar = cubVar instanceof eub ? (eub) cubVar : null;
        if (eubVar != null) {
            return eubVar;
        }
        e.c("Inconsistent composer");
        throw new KotlinNothingValueException();
    }

    public static final void g(kub kubVar, final sea seaVar) {
        kubVar.O(kubVar.getCurrent(), new kub.a() { // from class: com.google.android.rub
            @Override // com.google.android.kub.a
            public final boolean a(int i, int i2, Object obj) {
                return sub.h(seaVar, i, i2, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(sea seaVar, int i, int i2, Object obj) {
        if (obj instanceof aq1) {
            seaVar.h((aq1) obj);
            return false;
        }
        if (obj instanceof ena) {
            return false;
        }
        if (obj instanceof zea) {
            seaVar.e((zea) obj);
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        ((b0) obj).A();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final q08 i(x22 x22Var, r08 r08Var, kub kubVar, ez<?> ezVar) throws KotlinNothingValueException {
        int current = kubVar.getCurrent();
        if (ezVar != null && kubVar.y(current) > 0) {
            hub addressSpace = kubVar.getTable().getAddressSpace();
            int parent = kubVar.getParent();
            int[] groups = addressSpace.getGroups();
            int i = groups[parent + 2];
            while (true) {
                if (i <= 0) {
                    if (!(i != 0)) {
                        e.b("Traversing parent of group not in the slot table: " + parent);
                    }
                    i = -1;
                    break;
                }
                if (kubVar.r(i)) {
                    break;
                }
                i = groups[i + 2];
            }
            if (i >= 0 && kubVar.r(i)) {
                Object objX = kubVar.x(i);
                if (objX == null) {
                    e.b("Invalid slot table structure");
                    objX = Unit.a;
                }
                int iK = k(current, kubVar.getTable());
                int iY = kubVar.y(current);
                ezVar.j(objX);
                ezVar.b(iK, iY);
                ezVar.k();
            }
        }
        eub table = kubVar.getTable();
        eub.Companion companion = eub.INSTANCE;
        iub iubVar = new iub(table.getAddressSpace(), false, false);
        iubVar.f();
        n08<Object> n08VarC = r08Var.c();
        iubVar.C(126665345, n08VarC == d.INSTANCE.a() ? 0 : 16777216, n08VarC, null, null);
        iubVar.b(268435456);
        iubVar.c(r08Var.getParameter());
        iubVar.v(kubVar, (((long) 0) << 32) | (((long) bqd.c(kubVar.e(u27.c(r08Var.getAnchor()).getAddress()))) & 4294967295L));
        iubVar.i();
        eub eubVarD = iubVar.d();
        q08 q08Var = new q08(eubVarD);
        if (eubVarD.B()) {
            e.b("Cannot read while an editor is pending");
        }
        hub addressSpace2 = eubVarD.getAddressSpace();
        int root = eubVarD.getRoot();
        if (root < 0) {
            return q08Var;
        }
        t16 t16Var = new t16();
        int[] groups2 = addressSpace2.getGroups();
        a aVar = null;
        while (true) {
            int i2 = eubVarD.A()[root + 5];
            if (i2 != -1) {
                hub addressSpace3 = eubVarD.getAddressSpace();
                int iC = (i2 & 15) + 1;
                int i3 = i2 >> 4;
                if (iC > 15) {
                    iC = addressSpace3.o().c(i3);
                }
                for (int i4 = 0; i4 < iC; i4++) {
                    Object obj = eubVarD.G()[i3 + i4];
                    if (Intrinsics.e(obj, d.INSTANCE.a())) {
                        break;
                    }
                    if (obj instanceof b0) {
                        if (aVar == null) {
                            aVar = new a(x22Var, r08Var);
                        }
                        ((b0) obj).c(aVar);
                        aVar = aVar;
                    }
                }
            }
            int i5 = groups2[root + 1];
            if (i5 >= 0) {
                t16Var.i(i5);
            }
            root = groups2[root + 3];
            if (root < 0) {
                if (t16Var.tos == 0) {
                    return q08Var;
                }
                root = t16Var.g();
            }
        }
    }

    public static final ObjectLocation j(eub eubVar, Function1<Object, Boolean> function1) {
        int i;
        uub uubVarP = eubVar.P();
        try {
            int root = eubVar.getRoot();
            hub addressSpace = eubVar.getAddressSpace();
            if (root >= 0) {
                t16 t16Var = new t16();
                int[] groups = addressSpace.getGroups();
                int iG = root;
                while (true) {
                    if (uubVarP.P(iG) && ((Boolean) function1.invoke(uubVarP.S(iG))).booleanValue()) {
                        ObjectLocation objectLocation = new ObjectLocation(iG, null);
                        uubVarP.d();
                        return objectLocation;
                    }
                    int i2 = eubVar.A()[iG + 5];
                    if (i2 != -1) {
                        hub addressSpace2 = eubVar.getAddressSpace();
                        int iC = (i2 & 15) + 1;
                        int i3 = i2 >> 4;
                        if (iC > 15) {
                            iC = addressSpace2.o().c(i3);
                        }
                        for (int i4 = 0; i4 < iC; i4++) {
                            Object obj = eubVar.G()[i3 + i4];
                            if (Intrinsics.e(obj, d.INSTANCE.a())) {
                                break;
                            }
                            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                                ObjectLocation objectLocation2 = new ObjectLocation(iG, Integer.valueOf(i4));
                                uubVarP.d();
                                return objectLocation2;
                            }
                        }
                    }
                    if (iG != root && (i = groups[iG + 1]) >= 0) {
                        t16Var.i(i);
                    }
                    iG = groups[iG + 3];
                    if (iG < 0) {
                        if (t16Var.tos == 0) {
                            break;
                        }
                        iG = t16Var.g();
                    }
                }
            }
            Unit unit = Unit.a;
            uubVarP.d();
            return null;
        } catch (Throwable th) {
            uubVarP.d();
            throw th;
        }
    }

    public static final int k(int i, eub eubVar) {
        hub addressSpace = eubVar.getAddressSpace();
        int[] groups = addressSpace.getGroups();
        int i2 = 0;
        while (i > 0) {
            int i3 = groups[i + 2];
            int[] groups2 = addressSpace.getGroups();
            for (int i4 = groups2[i3 + 3]; i4 > 0 && i4 != i; i4 = groups2[i4 + 1]) {
                int i5 = groups[i + 4];
                i2 += (i5 & 8388608) == 8388608 ? 1 : 8388607 & i5;
            }
            if ((groups[i3 + 4] & 8388608) == 8388608) {
                return i2;
            }
            i = i3;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 l(Object[] objArr, int i) {
        if (i < 0) {
            return null;
        }
        Object obj = objArr[i >> 4];
        if (obj instanceof b0) {
            return (b0) obj;
        }
        return null;
    }

    public static final void m(kub kubVar, final sea seaVar) {
        kubVar.O(kubVar.getCurrent(), new kub.a() { // from class: com.google.android.qub
            @Override // com.google.android.kub.a
            public final boolean a(int i, int i2, Object obj) {
                return sub.n(seaVar, i, i2, obj);
            }
        });
        kub.D(kubVar, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(sea seaVar, int i, int i2, Object obj) {
        if (obj instanceof aq1) {
            seaVar.c((aq1) obj);
        }
        if (obj instanceof zea) {
            seaVar.e((zea) obj);
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        ((b0) obj).A();
        return false;
    }

    public static final void o() {
        throw new ConcurrentModificationException();
    }
}
