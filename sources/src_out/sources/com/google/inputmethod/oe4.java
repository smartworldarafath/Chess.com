package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J3\u0010\u0011\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001b\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001f\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0003J;\u0010'\u001a\u00020\u0007\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u00028\u00002\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070%¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*¨\u0006-"}, d2 = {"Lcom/google/android/oe4;", "Lcom/google/android/pq2;", "<init>", "()V", "", "f", "()Z", "", "a", "Lcom/google/android/ez;", "applier", "Lcom/google/android/kub;", "slots", "Lcom/google/android/sea;", "rememberManager", "Lcom/google/android/ts8;", "errorContext", "e", "(Lcom/google/android/ez;Lcom/google/android/kub;Lcom/google/android/sea;Lcom/google/android/ts8;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "groupHandle", "b", "(Lkotlin/jvm/functions/Function0;IJ)V", "Lcom/google/android/t27;", "anchor", "c", "(Lkotlin/jvm/functions/Function0;ILcom/google/android/t27;)V", "d", "V", "T", "value", "Lkotlin/Function2;", "block", "g", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/android/at8;", "Lcom/google/android/at8;", "operations", "pendingOperations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oe4 extends pq2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final at8 operations = new at8();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final at8 pendingOperations = new at8();

    public final void a() {
        this.pendingOperations.b();
        this.operations.b();
    }

    public final void b(Function0<? extends Object> factory, int insertIndex, long groupHandle) {
        at8 at8Var = this.operations;
        ns8.m mVar = ns8.m.d;
        at8Var.l(mVar);
        at8 at8VarA = at8.b.a(at8Var);
        at8.b.d(at8VarA, ns8.s.a(0), factory);
        at8VarA.intArgs[at8VarA.intArgsSize - at8VarA.opCodes[at8VarA.opCodesSize - 1].getInts()] = insertIndex;
        at8.b.c(at8VarA, 1, 2, groupHandle);
        at8Var.d(mVar);
        at8 at8Var2 = this.pendingOperations;
        ns8.t tVar = ns8.t.d;
        at8Var2.l(tVar);
        at8 at8VarA2 = at8.b.a(at8Var2);
        at8VarA2.intArgs[at8VarA2.intArgsSize - at8VarA2.opCodes[at8VarA2.opCodesSize - 1].getInts()] = insertIndex;
        at8.b.c(at8VarA2, 1, 2, groupHandle);
        at8Var2.d(tVar);
    }

    public final void c(Function0<? extends Object> factory, int insertIndex, t27 anchor) {
        at8 at8Var = this.operations;
        ns8.n nVar = ns8.n.d;
        at8Var.l(nVar);
        at8 at8VarA = at8.b.a(at8Var);
        at8.b.d(at8VarA, ns8.s.a(0), factory);
        at8VarA.intArgs[at8VarA.intArgsSize - at8VarA.opCodes[at8VarA.opCodesSize - 1].getInts()] = insertIndex;
        at8.b.d(at8VarA, ns8.s.a(1), anchor);
        at8Var.d(nVar);
        at8 at8Var2 = this.pendingOperations;
        ns8.u uVar = ns8.u.d;
        at8Var2.l(uVar);
        at8 at8VarA2 = at8.b.a(at8Var2);
        at8VarA2.intArgs[at8VarA2.intArgsSize - at8VarA2.opCodes[at8VarA2.opCodesSize - 1].getInts()] = insertIndex;
        at8.b.d(at8VarA2, ns8.s.a(0), anchor);
        at8Var2.d(uVar);
    }

    public final void d() {
        if (!this.pendingOperations.i()) {
            e.b("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.j(this.operations);
    }

    public final void e(ez<?> applier, kub slots, sea rememberManager, ts8 errorContext) {
        if (!this.pendingOperations.h()) {
            e.b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.e(applier, slots, rememberManager, errorContext);
    }

    public final boolean f() {
        return this.operations.h();
    }

    public final <V, T> void g(V value, Function2<? super T, ? super V, Unit> block) {
        at8 at8Var = this.operations;
        ns8.j0 j0Var = ns8.j0.d;
        at8Var.l(j0Var);
        at8 at8VarA = at8.b.a(at8Var);
        at8.b.d(at8VarA, ns8.s.a(0), value);
        int iA = ns8.s.a(1);
        Intrinsics.h(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        at8.b.d(at8VarA, iA, (Function2) a.f(block, 2));
        at8Var.d(j0Var);
    }
}
