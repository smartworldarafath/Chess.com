package androidx.compose.p004runtime;

import androidx.collection.d;
import androidx.compose.p004runtime.snapshots.b;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.k;
import androidx.compose.p004runtime.snapshots.l;
import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.r08;
import com.google.inputmethod.r58;
import com.google.inputmethod.vbd;
import com.google.inputmethod.x22;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/ta2;", "Landroidx/compose/runtime/v;", "parentFrameClock", "", "<anonymous>", "(Lcom/google/android/ta2;Landroidx/compose/runtime/v;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {615, 626}, m = "invokeSuspend", v = 1)
final class C0211Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements ps4<ta2, v, q22<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0211Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, q22<? super C0211Recomposer$runRecomposeAndApplyChanges$2> q22Var) {
        super(3, q22Var);
        this.this$0 = recomposer;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[Catch: all -> 0x002b, LOOP:1: B:12:0x0043->B:22:0x0079, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00be A[Catch: all -> 0x002b, LOOP:3: B:27:0x0091->B:37:0x00be, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101 A[Catch: all -> 0x002b, LOOP:5: B:41:0x00d1->B:51:0x0101, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[EDGE_INSN: B:61:0x0084->B:24:0x0084 BREAK  A[LOOP:1: B:12:0x0043->B:22:0x0079], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1 A[EDGE_INSN: B:66:0x00c1->B:38:0x00c1 BREAK  A[LOOP:3: B:27:0x0091->B:37:0x00be], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0104 A[EDGE_INSN: B:71:0x0104->B:52:0x0104 BREAK  A[LOOP:5: B:41:0x00d1->B:51:0x0101], SYNTHETIC] */
    private static final void m(Recomposer recomposer, List<x22> list, List<r08> list2, List<x22> list3, d<x22> dVar, d<x22> dVar2, d<Object> dVar3, d<x22> dVar4) {
        char c;
        long j;
        long j2;
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    x22 x22Var = list3.get(i);
                    x22Var.v();
                    recomposer.S0(x22Var);
                }
                list3.clear();
                Object[] objArr = dVar.elements;
                long[] jArr = dVar.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    x22 x22Var2 = (x22) objArr[(i2 << 3) + i4];
                                    x22Var2.v();
                                    recomposer.S0(x22Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                dVar.m();
                Object[] objArr2 = dVar2.elements;
                long[] jArr2 = dVar2.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) == j2) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((x22) objArr2[(i5 << 3) + i7]).h();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                dVar2.m();
                dVar3.m();
                Object[] objArr3 = dVar4.elements;
                long[] jArr3 = dVar4.metadata;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) == j2) {
                            if (i8 != length3) {
                                break;
                                break;
                            }
                            i8++;
                        } else {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    x22 x22Var3 = (x22) objArr3[(i8 << 3) + i10];
                                    x22Var3.v();
                                    recomposer.S0(x22Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 != length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                dVar4.m();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final void o(List<r08> list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                List list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((r08) list2.get(i));
                }
                recomposer.movableContentAwaitingInsert.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:112:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ee A[LOOP:4: B:100:0x01bc->B:113:0x01ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x01f1 A[EDGE_INSN: B:255:0x01f1->B:114:0x01f1 BREAK  A[LOOP:4: B:100:0x01bc->B:113:0x01ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x0176 A[EDGE_INSN: B:261:0x0176->B:82:0x0176 BREAK  A[LOOP:6: B:67:0x013a->B:80:0x016f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x016d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x016f A[LOOP:6: B:67:0x013a->B:80:0x016f, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [T[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static final Unit p(Recomposer recomposer, d dVar, d dVar2, List list, List list2, d dVar3, List list3, d dVar4, Set set, long j) {
        boolean z;
        char c;
        long j2;
        Recomposer recomposer2 = recomposer;
        List list4 = list;
        ?? r8 = list3;
        dVar4 = dVar4;
        if (recomposer2.v0()) {
            vbd vbdVar = vbd.a;
            Object objA = vbdVar.a("Recomposer:animation");
            try {
                recomposer2.broadcastFrameClock.g(j);
                g.INSTANCE.m();
                Unit unit = Unit.a;
                vbdVar.b(objA);
            } catch (Throwable th) {
                vbd.a.b(objA);
                throw th;
            }
        }
        Object objA2 = vbd.a.a("Recomposer:recompose");
        try {
            recomposer2.R0();
            synchronized (recomposer2.stateLock) {
                try {
                    r58 r58Var = recomposer2.compositionInvalidations;
                    Object[] objArr = r58Var.content;
                    int size = r58Var.getSize();
                    z = false;
                    for (int i = 0; i < size; i++) {
                        list4.add((x22) objArr[i]);
                    }
                    recomposer2.compositionInvalidations.j();
                    Unit unit2 = Unit.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.m();
            dVar2.m();
            while (true) {
                if (list4.isEmpty() && list2.isEmpty()) {
                    break;
                }
                List list5 = list4;
                ?? r13 = r8;
                try {
                    int size2 = list5.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        x22 x22Var = (x22) list5.get(i2);
                        x22 x22VarK0 = recomposer2.K0(x22Var, dVar);
                        if (x22VarK0 != null) {
                            r13.add(x22VarK0);
                            Unit unit3 = Unit.a;
                        }
                        dVar2.h(x22Var);
                    }
                    list5.clear();
                    if (dVar.e() || recomposer2.compositionInvalidations.getSize() != 0) {
                        synchronized (recomposer2.stateLock) {
                            try {
                                List listD0 = recomposer2.D0();
                                int size3 = listD0.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    x22 x22Var2 = (x22) listD0.get(i3);
                                    if (!dVar2.a(x22Var2) && x22Var2.e(set)) {
                                        list5.add(x22Var2);
                                    }
                                }
                                r58 r58Var2 = recomposer2.compositionInvalidations;
                                int size4 = r58Var2.getSize();
                                int i4 = 0;
                                for (int i5 = 0; i5 < size4; i5++) {
                                    x22 x22Var3 = (x22) r58Var2.content[i5];
                                    if (!dVar2.a(x22Var3) && !list5.contains(x22Var3)) {
                                        list5.add(x22Var3);
                                        i4++;
                                    } else if (i4 > 0) {
                                        Object[] objArr2 = r58Var2.content;
                                        objArr2[i5 - i4] = objArr2[i5];
                                    }
                                }
                                int i6 = size4 - i4;
                                f.A((Object[]) r58Var2.content, (Object) null, i6, size4);
                                r58Var2.z(i6);
                                Unit unit4 = Unit.a;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (list5.isEmpty()) {
                        try {
                            o(list2, recomposer2);
                            while (!list2.isEmpty()) {
                                dVar3.w(recomposer2.J0(list2, dVar));
                                o(list2, recomposer2);
                            }
                            list4 = list5;
                            r8 = r13;
                            z = false;
                        } catch (Throwable th4) {
                            Recomposer.N0(recomposer2, th4, null, true, 2, null);
                            m(recomposer, list5, list2, r13, dVar3, dVar4, dVar, dVar2);
                            Unit unit5 = Unit.a;
                            vbd.a.b(objA2);
                            return unit5;
                        }
                    } else {
                        recomposer2 = recomposer;
                        list4 = list;
                        r8 = list3;
                        z = false;
                    }
                } catch (Throwable th5) {
                    try {
                        Recomposer.N0(recomposer, th5, null, true, 2, null);
                        m(recomposer, list, list2, list3, dVar3, dVar4, dVar, dVar2);
                        Unit unit6 = Unit.a;
                        list.clear();
                        vbd.a.b(objA2);
                        return unit6;
                    } catch (Throwable th6) {
                        list.clear();
                        throw th6;
                    }
                }
                vbd.a.b(objA2);
                throw th;
            }
            g gVarC = g.INSTANCE.c();
            g kVar = gVarC instanceof b ? new k((b) gVarC, null, null, true, false) : new l(gVarC, null, true, z);
            try {
                g gVarL = kVar.l();
                try {
                    if (!r8.isEmpty()) {
                        recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                        try {
                            int size5 = r8.size();
                            for (?? r3 = z; r3 < size5; r3++) {
                                dVar4.h((x22) r8.get(r3));
                            }
                            int size6 = r8.size();
                            for (?? r4 = z; r4 < size6; r4++) {
                                ((x22) r8.get(r4)).p();
                            }
                            r8.clear();
                        } catch (Throwable th7) {
                            try {
                                Recomposer.N0(recomposer2, th7, null, false, 6, null);
                                m(recomposer, list4, list2, r8, dVar3, dVar4, dVar, dVar2);
                                Unit unit7 = Unit.a;
                                list3.clear();
                                kVar.s(gVarL);
                                kVar.d();
                                vbd.a.b(objA2);
                                return unit7;
                            } catch (Throwable th8) {
                                list3.clear();
                                throw th8;
                            }
                        }
                    }
                    if (dVar3.e()) {
                        try {
                            dVar4.v(dVar3);
                            Object[] objArr3 = dVar3.elements;
                            long[] jArr = dVar3.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                ?? r1 = z;
                                c = 7;
                                while (true) {
                                    long j3 = jArr[r1];
                                    j2 = 128;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (r1 != length) {
                                            break;
                                            break;
                                        }
                                        r1++;
                                    } else {
                                        int i7 = 8 - ((~(r1 - length)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j3 & 255) < 128) {
                                                ((x22) objArr3[(r1 << 3) + i8]).j();
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (r1 != length) {
                                            break;
                                        }
                                        r1++;
                                    }
                                }
                            } else {
                                c = 7;
                                j2 = 128;
                            }
                            dVar3.m();
                        } catch (Throwable th9) {
                            try {
                                Recomposer.N0(recomposer, th9, null, false, 6, null);
                                m(recomposer, list, list2, list3, dVar3, dVar4, dVar, dVar2);
                                Unit unit8 = Unit.a;
                                dVar3.m();
                                kVar.s(gVarL);
                                kVar.d();
                                vbd.a.b(objA2);
                                return unit8;
                            } catch (Throwable th10) {
                                dVar3.m();
                                throw th10;
                            }
                        }
                    } else {
                        c = 7;
                        j2 = 128;
                    }
                    if (dVar4.e()) {
                        try {
                            Object[] objArr4 = dVar4.elements;
                            long[] jArr2 = dVar4.metadata;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i9 = 0;
                                while (true) {
                                    long j4 = jArr2[i9];
                                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i9 != length2) {
                                            break;
                                            break;
                                        }
                                        i9++;
                                    } else {
                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((j4 & 255) < j2) {
                                                ((x22) objArr4[(i9 << 3) + i11]).h();
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i10 != 8) {
                                            break;
                                        }
                                        if (i9 != length2) {
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                            }
                            dVar4.m();
                        } catch (Throwable th11) {
                            try {
                                Recomposer.N0(recomposer, th11, null, false, 6, null);
                                m(recomposer, list, list2, list3, dVar3, dVar4, dVar, dVar2);
                                Unit unit9 = Unit.a;
                                dVar4.m();
                                kVar.s(gVarL);
                                kVar.d();
                                vbd.a.b(objA2);
                                return unit9;
                            } catch (Throwable th12) {
                                dVar4.m();
                                throw th12;
                            }
                        }
                    }
                    Unit unit10 = Unit.a;
                    kVar.s(gVarL);
                    kVar.d();
                    synchronized (recomposer.stateLock) {
                        if (!(recomposer.p0() == null)) {
                            e.b("unexpected to get continuation here");
                        }
                    }
                    g.INSTANCE.f();
                    dVar2.m();
                    dVar.m();
                    recomposer.compositionsRemoved = null;
                    vbd.a.b(objA2);
                    return Unit.a;
                } catch (Throwable th13) {
                    kVar.s(gVarL);
                    throw th13;
                }
            } catch (Throwable th14) {
                kVar.d();
                throw th14;
            }
        } catch (Throwable th15) {
            vbd.a.b(objA2);
            throw th15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:20:0x00df  */
    /* JADX WARN: Code duplicated, block: B:23:0x0101  */
    /* JADX WARN: Code duplicated, block: B:25:0x0118  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0118 -> B:12:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004runtime.C0211Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ta2 ta2Var, v vVar, q22<? super Unit> q22Var) {
        C0211Recomposer$runRecomposeAndApplyChanges$2 c0211Recomposer$runRecomposeAndApplyChanges$2 = new C0211Recomposer$runRecomposeAndApplyChanges$2(this.this$0, q22Var);
        c0211Recomposer$runRecomposeAndApplyChanges$2.L$0 = vVar;
        return c0211Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.a);
    }
}
