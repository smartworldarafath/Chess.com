package com.google.inputmethod;

import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J5\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0016\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u001fJ\u001f\u0010%\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\"2\u0006\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\b\u0010\u0019\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00072\u0006\u0010-\u001a\u00020#¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0007¢\u0006\u0004\b0\u0010\u0003J\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u0010\u0003J\u0017\u00103\u001a\u00020\u00072\b\u00102\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0007¢\u0006\u0004\b5\u0010\u0003J\u0015\u00106\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0007¢\u0006\u0004\b8\u0010\u0003J\r\u00109\u001a\u00020\u0007¢\u0006\u0004\b9\u0010\u0003J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010\u0003J\u001d\u0010=\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J%\u0010A\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'2\u0006\u0010<\u001a\u00020;2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020#¢\u0006\u0004\bD\u0010/J)\u0010I\u001a\u00020\u00072\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00070E2\u0006\u0010H\u001a\u00020F¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00072\b\u0010K\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bL\u00104J;\u0010Q\u001a\u00020\u0007\"\u0004\b\u0000\u0010M\"\u0004\b\u0001\u0010N2\u0006\u0010\u0019\u001a\u00028\u00012\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070O¢\u0006\u0004\bQ\u0010RJ\u001d\u0010U\u001a\u00020\u00072\u0006\u0010S\u001a\u00020#2\u0006\u0010T\u001a\u00020#¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020#2\u0006\u0010<\u001a\u00020#2\u0006\u0010-\u001a\u00020#¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020#¢\u0006\u0004\b[\u0010/J\u0015\u0010\\\u001a\u00020\u00072\u0006\u0010-\u001a\u00020#¢\u0006\u0004\b\\\u0010/J\u001d\u0010_\u001a\u00020\u00072\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0]¢\u0006\u0004\b_\u0010`J\u001b\u0010c\u001a\u00020\u00072\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070a¢\u0006\u0004\bc\u0010dJ\u001d\u0010g\u001a\u00020\u00072\u0006\u0010f\u001a\u00020e2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\bg\u0010hJ%\u0010k\u001a\u00020\u00072\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0i2\u0006\u0010j\u001a\u00020e¢\u0006\u0004\bk\u0010lJ/\u0010r\u001a\u00020\u00072\b\u0010n\u001a\u0004\u0018\u00010m2\u0006\u0010p\u001a\u00020o2\u0006\u0010<\u001a\u00020q2\u0006\u0010W\u001a\u00020q¢\u0006\u0004\br\u0010sJ%\u0010v\u001a\u00020\u00072\u0006\u0010H\u001a\u00020t2\u0006\u0010p\u001a\u00020o2\u0006\u0010u\u001a\u00020q¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u0007¢\u0006\u0004\bx\u0010\u0003J!\u0010z\u001a\u00020\u00072\u0006\u0010y\u001a\u00020\u00002\n\b\u0002\u0010j\u001a\u0004\u0018\u00010e¢\u0006\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010}¨\u0006\u007f"}, d2 = {"Lcom/google/android/c81;", "Lcom/google/android/g81;", "<init>", "()V", "", "c", "()Z", "", "a", "Lcom/google/android/cub;", "slotStorage", "Lcom/google/android/ez;", "applier", "Lcom/google/android/sea;", "rememberManager", "Lcom/google/android/ur1;", "errorContext", "b", "(Lcom/google/android/cub;Lcom/google/android/ez;Lcom/google/android/sea;Lcom/google/android/ur1;)V", "Lcom/google/android/wub;", "slots", "Lcom/google/android/ts8;", "e", "(Lcom/google/android/ez;Lcom/google/android/wub;Lcom/google/android/sea;Lcom/google/android/ts8;)V", "Lcom/google/android/zea;", "value", "y", "(Lcom/google/android/zea;)V", "Landroidx/compose/runtime/b0;", "scope", "z", "(Landroidx/compose/runtime/b0;)V", "F", "p", "", "", "groupSlotIndex", "K", "(Ljava/lang/Object;I)V", "Lcom/google/android/ku4;", "anchor", "H", "(Ljava/lang/Object;Lcom/google/android/ku4;I)V", "g", "(Lcom/google/android/ku4;Ljava/lang/Object;)V", "count", "G", "(I)V", "C", "j", "data", "I", "(Ljava/lang/Object;)V", "r", "q", "(Lcom/google/android/ku4;)V", "n", "E", "A", "Lcom/google/android/fub;", "from", "t", "(Lcom/google/android/ku4;Lcom/google/android/fub;)V", "Lcom/google/android/pe4;", "fixups", "u", "(Lcom/google/android/ku4;Lcom/google/android/fub;Lcom/google/android/pe4;)V", "offset", "v", "Lkotlin/Function1;", "Lcom/google/android/pr1;", "action", "composition", "m", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/pr1;)V", "node", "M", "T", "V", "Lkotlin/Function2;", "block", "J", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeFrom", "moveCount", "B", "(II)V", "to", "w", "(III)V", "distance", "f", "L", "", "nodes", "l", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "D", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/m16;", "effectiveNodeIndexOut", "k", "(Lcom/google/android/m16;Lcom/google/android/ku4;)V", "", "effectiveNodeIndex", "h", "(Ljava/util/List;Lcom/google/android/m16;)V", "Lcom/google/android/q08;", "resolvedState", "Landroidx/compose/runtime/f;", "parentContext", "Lcom/google/android/r08;", "i", "(Lcom/google/android/q08;Landroidx/compose/runtime/f;Lcom/google/android/r08;Lcom/google/android/r08;)V", "Lcom/google/android/x22;", "reference", "x", "(Lcom/google/android/x22;Landroidx/compose/runtime/f;Lcom/google/android/r08;)V", "o", "changeList", "s", "(Lcom/google/android/c81;Lcom/google/android/m16;)V", "Lcom/google/android/zs8;", "Lcom/google/android/zs8;", "operations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c81 extends g81 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final zs8 operations = new zs8();

    public final void A() {
        this.operations.i(ls8.y.c);
    }

    public final void B(int removeFrom, int moveCount) {
        zs8 zs8Var = this.operations;
        ls8.z zVar = ls8.z.c;
        zs8Var.j(zVar);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        int ints = zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts();
        int[] iArr = zs8VarA.intArgs;
        iArr[ints] = removeFrom;
        iArr[ints + 1] = moveCount;
        zs8Var.c(zVar);
    }

    public final void C() {
        this.operations.i(ls8.a0.c);
    }

    public final void D(Function0<Unit> effect) {
        zs8 zs8Var = this.operations;
        ls8.b0 b0Var = ls8.b0.c;
        zs8Var.j(b0Var);
        zs8.b.b(zs8.b.a(zs8Var), ls8.t.a(0), effect);
        zs8Var.c(b0Var);
    }

    public final void E() {
        this.operations.i(ls8.c0.c);
    }

    public final void F(b0 scope) {
        zs8 zs8Var = this.operations;
        ls8.d0 d0Var = ls8.d0.c;
        zs8Var.j(d0Var);
        zs8.b.b(zs8.b.a(zs8Var), ls8.t.a(0), scope);
        zs8Var.c(d0Var);
    }

    public final void G(int count) {
        zs8 zs8Var = this.operations;
        ls8.e0 e0Var = ls8.e0.c;
        zs8Var.j(e0Var);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        zs8VarA.intArgs[zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts()] = count;
        zs8Var.c(e0Var);
    }

    public final void H(Object value, ku4 anchor, int groupSlotIndex) {
        zs8 zs8Var = this.operations;
        ls8.f0 f0Var = ls8.f0.c;
        zs8Var.j(f0Var);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        zs8.b.c(zs8VarA, ls8.t.a(0), value, ls8.t.a(1), anchor);
        zs8VarA.intArgs[zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts()] = groupSlotIndex;
        zs8Var.c(f0Var);
    }

    public final void I(Object data) {
        zs8 zs8Var = this.operations;
        ls8.g0 g0Var = ls8.g0.c;
        zs8Var.j(g0Var);
        zs8.b.b(zs8.b.a(zs8Var), ls8.t.a(0), data);
        zs8Var.c(g0Var);
    }

    public final <T, V> void J(V value, Function2<? super T, ? super V, Unit> block) {
        zs8 zs8Var = this.operations;
        ls8.h0 h0Var = ls8.h0.c;
        zs8Var.j(h0Var);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        int iA = ls8.t.a(0);
        int iA2 = ls8.t.a(1);
        Intrinsics.h(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        zs8.b.c(zs8VarA, iA, value, iA2, (Function2) a.f(block, 2));
        zs8Var.c(h0Var);
    }

    public final void K(Object value, int groupSlotIndex) {
        zs8 zs8Var = this.operations;
        ls8.i0 i0Var = ls8.i0.c;
        zs8Var.j(i0Var);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        zs8.b.b(zs8VarA, ls8.t.a(0), value);
        zs8VarA.intArgs[zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts()] = groupSlotIndex;
        zs8Var.c(i0Var);
    }

    public final void L(int count) {
        zs8 zs8Var = this.operations;
        ls8.j0 j0Var = ls8.j0.c;
        zs8Var.j(j0Var);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        zs8VarA.intArgs[zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts()] = count;
        zs8Var.c(j0Var);
    }

    public final void M(Object node) {
        if (node instanceof aq1) {
            this.operations.i(ls8.k0.c);
        }
    }

    @Override // com.google.inputmethod.g81
    public void a() {
        this.operations.a();
    }

    @Override // com.google.inputmethod.g81
    public void b(cub slotStorage, ez<?> applier, sea rememberManager, ur1 errorContext) {
        SlotWriter slotWriterN = tub.o(slotStorage).N();
        try {
            e(applier, slotWriterN, rememberManager, errorContext);
            Unit unit = Unit.a;
            boolean z = true;
        } finally {
            slotWriterN.K(false);
        }
    }

    @Override // com.google.inputmethod.g81
    public boolean c() {
        return this.operations.f();
    }

    public final void e(ez<?> applier, SlotWriter slots, sea rememberManager, ts8 errorContext) {
        this.operations.d(applier, slots, rememberManager, errorContext);
    }

    public final void f(int distance) {
        zs8 zs8Var = this.operations;
        ls8.a aVar = ls8.a.c;
        zs8Var.j(aVar);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        zs8VarA.intArgs[zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts()] = distance;
        zs8Var.c(aVar);
    }

    public final void g(ku4 anchor, Object value) {
        zs8 zs8Var = this.operations;
        ls8.b bVar = ls8.b.c;
        zs8Var.j(bVar);
        zs8.b.c(zs8.b.a(zs8Var), ls8.t.a(0), anchor, ls8.t.a(1), value);
        zs8Var.c(bVar);
    }

    public final void h(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        zs8 zs8Var = this.operations;
        ls8.d dVar = ls8.d.c;
        zs8Var.j(dVar);
        zs8.b.c(zs8.b.a(zs8Var), ls8.t.a(1), nodes, ls8.t.a(0), effectiveNodeIndex);
        zs8Var.c(dVar);
    }

    public final void i(q08 resolvedState, f parentContext, r08 from, r08 to) {
        zs8 zs8Var = this.operations;
        ls8.e eVar = ls8.e.c;
        zs8Var.j(eVar);
        zs8.b.e(zs8.b.a(zs8Var), ls8.t.a(0), resolvedState, ls8.t.a(1), parentContext, ls8.t.a(3), to, ls8.t.a(2), from);
        zs8Var.c(eVar);
    }

    public final void j() {
        this.operations.i(ls8.f.c);
    }

    public final void k(IntRef effectiveNodeIndexOut, ku4 anchor) {
        zs8 zs8Var = this.operations;
        ls8.g gVar = ls8.g.c;
        zs8Var.j(gVar);
        zs8.b.c(zs8.b.a(zs8Var), ls8.t.a(0), effectiveNodeIndexOut, ls8.t.a(1), anchor);
        zs8Var.c(gVar);
    }

    public final void l(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        zs8 zs8Var = this.operations;
        ls8.h hVar = ls8.h.c;
        zs8Var.j(hVar);
        zs8.b.b(zs8.b.a(zs8Var), ls8.t.a(0), nodes);
        zs8Var.c(hVar);
    }

    public final void m(Function1<? super pr1, Unit> action, pr1 composition) {
        zs8 zs8Var = this.operations;
        ls8.i iVar = ls8.i.c;
        zs8Var.j(iVar);
        zs8.b.c(zs8.b.a(zs8Var), ls8.t.a(0), action, ls8.t.a(1), composition);
        zs8Var.c(iVar);
    }

    public final void n() {
        this.operations.i(ls8.j.c);
    }

    public final void o() {
        this.operations.i(ls8.k.c);
    }

    public final void p(b0 scope) {
        zs8 zs8Var = this.operations;
        ls8.l lVar = ls8.l.c;
        zs8Var.j(lVar);
        zs8.b.b(zs8.b.a(zs8Var), ls8.t.a(0), scope);
        zs8Var.c(lVar);
    }

    public final void q(ku4 anchor) {
        zs8 zs8Var = this.operations;
        ls8.m mVar = ls8.m.c;
        zs8Var.j(mVar);
        zs8.b.b(zs8.b.a(zs8Var), ls8.t.a(0), anchor);
        zs8Var.c(mVar);
    }

    public final void r() {
        this.operations.i(ls8.n.c);
    }

    public final void s(c81 changeList, IntRef effectiveNodeIndex) {
        if (changeList.d()) {
            zs8 zs8Var = this.operations;
            ls8.c cVar = ls8.c.c;
            zs8Var.j(cVar);
            zs8.b.c(zs8.b.a(zs8Var), ls8.t.a(0), changeList, ls8.t.a(1), effectiveNodeIndex);
            zs8Var.c(cVar);
        }
    }

    public final void t(ku4 anchor, fub from) {
        zs8 zs8Var = this.operations;
        ls8.p pVar = ls8.p.c;
        zs8Var.j(pVar);
        zs8.b.c(zs8.b.a(zs8Var), ls8.t.a(0), anchor, ls8.t.a(1), from);
        zs8Var.c(pVar);
    }

    public final void u(ku4 anchor, fub from, pe4 fixups) {
        zs8 zs8Var = this.operations;
        ls8.q qVar = ls8.q.c;
        zs8Var.j(qVar);
        zs8.b.d(zs8.b.a(zs8Var), ls8.t.a(0), anchor, ls8.t.a(1), from, ls8.t.a(2), fixups);
        zs8Var.c(qVar);
    }

    public final void v(int offset) {
        zs8 zs8Var = this.operations;
        ls8.r rVar = ls8.r.c;
        zs8Var.j(rVar);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        zs8VarA.intArgs[zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts()] = offset;
        zs8Var.c(rVar);
    }

    public final void w(int to, int from, int count) {
        zs8 zs8Var = this.operations;
        ls8.s sVar = ls8.s.c;
        zs8Var.j(sVar);
        zs8 zs8VarA = zs8.b.a(zs8Var);
        int ints = zs8VarA.intArgsSize - zs8VarA.opCodes[zs8VarA.opCodesSize - 1].getInts();
        int[] iArr = zs8VarA.intArgs;
        iArr[ints + 1] = to;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        zs8Var.c(sVar);
    }

    public final void x(x22 composition, f parentContext, r08 reference) {
        zs8 zs8Var = this.operations;
        ls8.v vVar = ls8.v.c;
        zs8Var.j(vVar);
        zs8.b.d(zs8.b.a(zs8Var), ls8.t.a(0), composition, ls8.t.a(1), parentContext, ls8.t.a(2), reference);
        zs8Var.c(vVar);
    }

    public final void y(zea value) {
        zs8 zs8Var = this.operations;
        ls8.w wVar = ls8.w.c;
        zs8Var.j(wVar);
        zs8.b.b(zs8.b.a(zs8Var), ls8.t.a(0), value);
        zs8Var.c(wVar);
    }

    public final void z(b0 scope) {
        zs8 zs8Var = this.operations;
        ls8.x xVar = ls8.x.c;
        zs8Var.j(xVar);
        zs8.b.b(zs8.b.a(zs8Var), ls8.t.a(0), scope);
        zs8Var.c(xVar);
    }
}
