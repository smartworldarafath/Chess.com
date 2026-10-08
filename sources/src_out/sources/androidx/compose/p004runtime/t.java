package androidx.compose.p004runtime;

import androidx.collection.d;
import com.google.android.bqd;
import com.google.android.qjd;
import com.google.inputmethod.JoinedKey;
import com.google.inputmethod.eub;
import com.google.inputmethod.g37;
import com.google.inputmethod.hub;
import com.google.inputmethod.k58;
import com.google.inputmethod.l4b;
import com.google.inputmethod.q38;
import com.google.inputmethod.r6b;
import com.google.inputmethod.t04;
import com.google.inputmethod.t16;
import com.google.inputmethod.uub;
import com.google.inputmethod.v15;
import com.google.inputmethod.yea;
import com.google.inputmethod.zea;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aE\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u001a0\u0019*\u00020\u00122\n\u0010\u0014\u001a\u00060\u000fj\u0002`\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001d\u001a\u0004\u0018\u00010\u0016*\u00020\u00122\n\u0010\u0014\u001a\u00060\u000fj\u0002`\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a7\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"\"\b\b\u0000\u0010\u001f*\u00020\u0017\"\b\b\u0001\u0010 *\u00020\u00172\u0006\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010$\u001a/\u0010(\u001a\u0004\u0018\u00010\u00172\b\u0010%\u001a\u0004\u0018\u00010\u00172\b\u0010&\u001a\u0004\u0018\u00010\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010+\u001a\u00020\u000f*\u00020*H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010-\u001a\u00020**\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010.\u001a/\u00101\u001a\u00060\u0000j\u0002`\u0001*\u00020\f2\n\u0010/\u001a\u00060\u0000j\u0002`\u00012\n\u00100\u001a\u00060\u0000j\u0002`\u0001H\u0002¢\u0006\u0004\b1\u00102\u001a;\u00105\u001a\u00060\u000fj\u0002`\u0013*\u0002032\n\u00104\u001a\u00060\u000fj\u0002`\u00132\n\u0010/\u001a\u00060\u000fj\u0002`\u00132\n\u00100\u001a\u00060\u000fj\u0002`\u0013H\u0002¢\u0006\u0004\b5\u00106\u001a'\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0019*\u00020\f2\n\u0010\u0014\u001a\u00060\u000fj\u0002`\u0013H\u0002¢\u0006\u0004\b7\u00108\"\u001c\u0010<\u001a\u00020**\u00060\u0000j\u0002`98BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;*\u0010\b\u0002\u0010=\"\u0002`\u00012\u00060\u0000j\u0002`\u0001¨\u0006>"}, d2 = {"", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "v", "(J)J", "Landroidx/compose/runtime/d;", "Landroidx/compose/runtime/s;", "k", "(Landroidx/compose/runtime/d;)Landroidx/compose/runtime/s;", "Lcom/google/android/zea;", "Lcom/google/android/g37;", "l", "(Lcom/google/android/zea;)Lcom/google/android/g37;", "Lcom/google/android/eub;", "Landroidx/compose/runtime/f;", "context", "", "p", "(Lcom/google/android/eub;Landroidx/compose/runtime/f;)Ljava/lang/Integer;", "Lcom/google/android/uub;", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "Lcom/google/android/r6b;", "Landroidx/compose/runtime/b0;", "", "invalidations", "", "Lkotlin/Pair;", "o", "(Lcom/google/android/uub;ILcom/google/android/k58;)Ljava/util/List;", "s", "(Lcom/google/android/uub;I)Landroidx/compose/runtime/b0;", "K", "V", "initialCapacity", "Lcom/google/android/q38;", "u", "(I)Lcom/google/android/k58;", "value", "left", "right", "r", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "j", "(Z)I", "i", "(I)Z", "a", "b", "q", "(Lcom/google/android/eub;JJ)J", "Lcom/google/android/hub;", "parent", "n", "(Lcom/google/android/hub;III)I", "m", "(Lcom/google/android/eub;I)Ljava/util/List;", "Landroidx/compose/runtime/VirtualGroupHandle;", "t", "(J)Z", "isInsertHandle", "VirtualGroupHandle", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final s k(d dVar) throws KotlinNothingValueException {
        s sVar = dVar instanceof s ? (s) dVar : null;
        if (sVar != null) {
            return sVar;
        }
        e.c("Inconsistent composition");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final g37 l(zea zeaVar) throws KotlinNothingValueException {
        g37 g37Var = zeaVar instanceof g37 ? (g37) zeaVar : null;
        if (g37Var != null) {
            return g37Var;
        }
        e.c("Inconsistent composition");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> m(eub eubVar, int i) {
        boolean z;
        int i2;
        ArrayList arrayList = new ArrayList();
        uub uubVarP = eubVar.P();
        try {
            hub hubVar = uubVarP.addressSpace;
            if (i >= 0) {
                t16 t16Var = new t16();
                int[] groups = hubVar.getGroups();
                int iG = i;
                while (true) {
                    if (uubVarP.P(iG)) {
                        arrayList.add(uubVarP.S(iG));
                        z = false;
                    } else {
                        z = true;
                    }
                    if (iG != i && (i2 = groups[iG + 1]) >= 0) {
                        t16Var.i(i2);
                    }
                    iG = groups[iG + 3];
                    if (!z || iG < 0) {
                        if (t16Var.tos == 0) {
                            break;
                        }
                        iG = t16Var.g();
                    }
                }
            }
            Unit unit = Unit.a;
            return arrayList;
        } finally {
            uubVarP.d();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final int n(hub hubVar, int i, int i2, int i3) throws KotlinNothingValueException {
        if (i2 != -1) {
            if (i3 != -1) {
                int[] groups = hubVar.getGroups();
                for (int i4 = groups[i + 3]; i4 > 0; i4 = groups[i4 + 1]) {
                    if (i4 != i2) {
                        if (i4 != i3) {
                        }
                    }
                }
                e.c("Unexpected slot table structure");
                throw new KotlinNothingValueException();
            }
            return i2;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7 A[LOOP:1: B:26:0x005f->B:38:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa A[EDGE_INSN: B:47:0x00aa->B:39:0x00aa BREAK  A[LOOP:1: B:26:0x005f->B:38:0x00a7], SYNTHETIC] */
    public static final List<Pair<b0, Object>> o(uub uubVar, int i, k58<Object, Object> k58Var) {
        int i2;
        if (r6b.j(k58Var)) {
            return m.p();
        }
        List listC = m.c();
        d dVarB = l4b.b();
        hub addressSpace = uubVar.getTable().getAddressSpace();
        if (i >= 0) {
            t16 t16Var = new t16();
            int[] groups = addressSpace.getGroups();
            int iG = i;
            while (true) {
                b0 b0VarS = s(uubVar, iG);
                if (b0VarS != null) {
                    dVarB.h(b0VarS);
                }
                if (iG != i && (i2 = groups[iG + 1]) >= 0) {
                    t16Var.i(i2);
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
        Object[] objArr = k58Var.keys;
        Object[] objArr2 = k58Var.values;
        long[] jArr = k58Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            Intrinsics.h(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            b0 b0Var = (b0) obj;
                            if (dVarB.a(b0Var)) {
                                listC.add(qjd.a(b0Var, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return m.a(listC);
    }

    public static final Integer p(eub eubVar, f fVar) {
        int i;
        uub uubVarP = eubVar.P();
        try {
            int root = eubVar.getRoot();
            int iH = uubVarP.h(root);
            loop0: while (iH != -1) {
                if ((eubVar.I(iH) & 1073741824) == 1073741824 && (i = eubVar.A()[iH + 5]) != -1) {
                    hub addressSpace = eubVar.getAddressSpace();
                    int iC = (i & 15) + 1;
                    int i2 = i >> 4;
                    if (iC > 15) {
                        iC = addressSpace.o().c(i2);
                    }
                    for (int i3 = 0; i3 < iC; i3++) {
                        Object obj = eubVar.G()[i2 + i3];
                        if (Intrinsics.e(obj, d.INSTANCE.a())) {
                            break;
                        }
                        zea zeaVar = obj instanceof zea ? (zea) obj : null;
                        yea wrapped = zeaVar != null ? zeaVar.getWrapped() : null;
                        s.a aVar = wrapped instanceof s.a ? (s.a) wrapped : null;
                        if (aVar != null && Intrinsics.e(aVar.a(), fVar)) {
                            Integer numValueOf = Integer.valueOf(iH);
                            uubVarP.d();
                            return numValueOf;
                        }
                    }
                }
                int iH2 = uubVarP.h(iH);
                if (iH2 == -1 || (eubVar.I(iH) & t04.INVALID_ID) != Integer.MIN_VALUE) {
                    int iU = iH;
                    iH = uubVarP.R(iH);
                    while (iH == -1) {
                        iU = uubVarP.U(iU);
                        if (iU == -1 || iU == root) {
                            break loop0;
                            break loop0;
                        }
                        iH = uubVarP.R(iU);
                    }
                } else {
                    iH = iH2;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
    
        if (r2 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (r3 == r2) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long q(com.google.inputmethod.eub r12, long r13, long r15) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004runtime.t.q(com.google.android.eub, long, long):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (Intrinsics.e(joinedKey.getLeft(), obj2) && Intrinsics.e(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object objR = r(joinedKey.getLeft(), obj2, obj3);
        return objR == null ? r(joinedKey.getRight(), obj2, obj3) : objR;
    }

    public static final b0 s(uub uubVar, int i) {
        Object objT = uubVar.t(i, 0);
        if (objT instanceof b0) {
            return (b0) objT;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(long j) {
        return v15.b(j) < -8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> k58<Object, Object> u(int i) {
        return q38.d(new k58(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j) {
        int iA = v15.a(j);
        return (((long) bqd.c((-10) - v15.b(j))) & 4294967295L) | (((long) iA) << 32);
    }
}
