package com.google.inputmethod;

import androidx.compose.p004runtime.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J3\u0010\u0011\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001a\u001a\u00020\u00072\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0003J;\u0010\"\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001d\"\u0004\b\u0001\u0010\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%¨\u0006("}, d2 = {"Lcom/google/android/pe4;", "Lcom/google/android/bt8;", "<init>", "()V", "", "e", "()Z", "", "a", "Lcom/google/android/ez;", "applier", "Lcom/google/android/wub;", "slots", "Lcom/google/android/sea;", "rememberManager", "Lcom/google/android/ts8;", "errorContext", "d", "(Lcom/google/android/ez;Lcom/google/android/wub;Lcom/google/android/sea;Lcom/google/android/ts8;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Lcom/google/android/ku4;", "groupAnchor", "b", "(Lkotlin/jvm/functions/Function0;ILcom/google/android/ku4;)V", "c", "V", "T", "value", "Lkotlin/Function2;", "block", "f", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/android/zs8;", "Lcom/google/android/zs8;", "operations", "pendingOperations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pe4 extends bt8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final zs8 operations = new zs8();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final zs8 pendingOperations = new zs8();

    public final void a() {
        this.pendingOperations.a();
        this.operations.a();
    }

    public final void b(Function0<? extends Object> factory, int insertIndex, ku4 groupAnchor) {
        zs8 zs8Var = this.operations;
        ls8.o oVar = ls8.o.c;
        zs8Var.j(oVar);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        zs8.b.b(zs8VarA, ls8.t.a(0), factory);
        zs8VarA.intArgs[zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts()] = insertIndex;
        zs8.b.b(zs8VarA, ls8.t.a(1), groupAnchor);
        zs8Var.c(oVar);
        zs8 zs8Var2 = this.pendingOperations;
        ls8.u uVar = ls8.u.c;
        zs8Var2.j(uVar);
        zs8 zs8VarA2 = zs8.b.a(zs8Var2);
        zs8VarA2.intArgs[zs8VarA2.intArgsSize - zs8VarA2.opCodes[zs8VarA2.opCodesSize - 1].getInts()] = insertIndex;
        zs8.b.b(zs8VarA2, ls8.t.a(0), groupAnchor);
        zs8Var2.c(uVar);
    }

    public final void c() {
        if (!this.pendingOperations.g()) {
            e.b("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.h(this.operations);
    }

    public final void d(ez<?> applier, SlotWriter slots, sea rememberManager, ts8 errorContext) {
        if (!this.pendingOperations.f()) {
            e.b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.d(applier, slots, rememberManager, errorContext);
    }

    public final boolean e() {
        return this.operations.f();
    }

    public final <V, T> void f(V value, Function2<? super T, ? super V, Unit> block) {
        zs8 zs8Var = this.operations;
        ls8.h0 h0Var = ls8.h0.c;
        zs8Var.j(h0Var);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        zs8.b.b(zs8VarA, ls8.t.a(0), value);
        int iA = ls8.t.a(1);
        Intrinsics.h(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        zs8.b.b(zs8VarA, iA, (Function2) a.f(block, 2));
        zs8Var.c(h0Var);
    }
}
