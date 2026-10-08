package com.google.inputmethod;

import androidx.compose.p004runtime.snapshots.SnapshotStateList;
import androidx.compose.p004runtime.snapshots.a;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a9\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001a\"\u0018\u0010#\u001a\u00060 j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"\"$\u0010&\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"0\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018@X\u0080\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"T", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function1;", "", "", "block", "k", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/jvm/functions/Function1;)Z", "Lcom/google/android/v6c;", "", "currentModification", "Lcom/google/android/i79;", "newList", "structural", "f", "(Lcom/google/android/v6c;ILcom/google/android/i79;Z)Z", "list", "Lcom/google/android/c7c;", "l", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/google/android/i79;)Lcom/google/android/c7c;", "size", "init", "a", "(ILkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "j", "()Ljava/lang/Void;", "index", "", "m", "(II)V", "i", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "sync", "h", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)I", "structure", "g", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)Lcom/google/android/v6c;", "getReadable$annotations", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "readable", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ixb {
    private static final Object a = new Object();

    public static final <T> SnapshotStateList<T> a(int i, Function1<? super Integer, ? extends T> function1) {
        if (i == 0) {
            return new SnapshotStateList<>();
        }
        i79.a aVarBuilder = j24.b().builder();
        for (int i2 = 0; i2 < i; i2++) {
            aVarBuilder.add(function1.invoke(Integer.valueOf(i2)));
        }
        return new SnapshotStateList<>(aVarBuilder.build());
    }

    public static final <T> boolean f(v6c<T> v6cVar, int i, i79<? extends T> i79Var, boolean z) {
        boolean z2;
        synchronized (a) {
            try {
                if (v6cVar.k() == i) {
                    v6cVar.m(i79Var);
                    z2 = true;
                    if (z) {
                        v6cVar.o(v6cVar.l() + 1);
                    }
                    v6cVar.n(v6cVar.k() + 1);
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final <T> v6c<T> g(SnapshotStateList<T> snapshotStateList) {
        c7c firstStateRecord = snapshotStateList.getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (v6c) i.c0((v6c) firstStateRecord, snapshotStateList);
    }

    public static final <T> int h(SnapshotStateList<T> snapshotStateList) {
        c7c firstStateRecord = snapshotStateList.getFirstStateRecord();
        Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((v6c) i.I((v6c) firstStateRecord)).l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i() {
        throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void j() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final <T> boolean k(SnapshotStateList<T> snapshotStateList, Function1<? super List<T>, Boolean> function1) {
        int iK;
        i79<T> i79VarJ;
        Object objInvoke;
        g gVarC;
        boolean zF;
        do {
            synchronized (a) {
                c7c firstStateRecord = snapshotStateList.getFirstStateRecord();
                Intrinsics.h(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                v6c v6cVar = (v6c) i.I((v6c) firstStateRecord);
                iK = v6cVar.k();
                i79VarJ = v6cVar.j();
                Unit unit = Unit.a;
            }
            Intrinsics.g(i79VarJ);
            i79.a<T> aVarBuilder = i79VarJ.builder();
            objInvoke = function1.invoke(aVarBuilder);
            i79<T> i79VarBuild = aVarBuilder.build();
            if (Intrinsics.e(i79VarBuild, i79VarJ)) {
                break;
            }
            c7c firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            Intrinsics.h(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            v6c v6cVar2 = (v6c) firstStateRecord2;
            synchronized (i.M()) {
                gVarC = g.INSTANCE.c();
                zF = f((v6c) i.n0(v6cVar2, snapshotStateList, gVarC), iK, i79VarBuild, true);
            }
            i.V(gVarC, snapshotStateList);
        } while (!zF);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static final <T> c7c l(SnapshotStateList<T> snapshotStateList, i79<? extends T> i79Var) {
        g gVarK = i.K();
        v6c v6cVar = new v6c(gVarK.getSnapshotId(), i79Var);
        if (!(gVarK instanceof a)) {
            v6cVar.h(new v6c(kwb.c(1), i79Var));
        }
        return v6cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }
}
