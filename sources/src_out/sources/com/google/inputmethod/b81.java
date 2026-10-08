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
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J5\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u00020\b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010 J\u001d\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\b2\u0006\u0010*\u001a\u00020)2\b\u0010\u001a\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010+¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u00020\b2\n\u00101\u001a\u00060)j\u0002`02\u0006\u00102\u001a\u00020)¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\b¢\u0006\u0004\b5\u0010\u0003J\r\u00106\u001a\u00020\b¢\u0006\u0004\b6\u0010\u0003J\u0017\u00108\u001a\u00020\b2\b\u00107\u001a\u0004\u0018\u00010+¢\u0006\u0004\b8\u0010/J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\u0003J!\u0010?\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\n\u0010>\u001a\u00060<j\u0002`=¢\u0006\u0004\b?\u0010@J)\u0010C\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\n\u0010>\u001a\u00060<j\u0002`=2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020)¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\b¢\u0006\u0004\bH\u0010\u0003J)\u0010M\u001a\u00020\b2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0I2\u0006\u0010L\u001a\u00020J¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010+¢\u0006\u0004\bP\u0010/J;\u0010U\u001a\u00020\b\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010R2\u0006\u0010\u001a\u001a\u00028\u00012\u0018\u0010T\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0S¢\u0006\u0004\bU\u0010VJ\u001d\u0010Y\u001a\u00020\b2\u0006\u0010W\u001a\u00020)2\u0006\u0010X\u001a\u00020)¢\u0006\u0004\bY\u00104J%\u0010\\\u001a\u00020\b2\u0006\u0010Z\u001a\u00020)2\u0006\u0010[\u001a\u00020)2\u0006\u00102\u001a\u00020)¢\u0006\u0004\b\\\u0010]J\u0019\u0010_\u001a\u00020\b2\n\u0010^\u001a\u00060<j\u0002`=¢\u0006\u0004\b_\u0010`J!\u0010c\u001a\u00020\b2\u0006\u0010b\u001a\u00020a2\n\u0010^\u001a\u00060<j\u0002`=¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\b¢\u0006\u0004\be\u0010\u0003J\r\u0010f\u001a\u00020\b¢\u0006\u0004\bf\u0010\u0003J\u0015\u0010g\u001a\u00020\b2\u0006\u00102\u001a\u00020)¢\u0006\u0004\bg\u0010GJ\u001d\u0010j\u001a\u00020\b2\u000e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0h¢\u0006\u0004\bj\u0010kJ\u001b\u0010n\u001a\u00020\b2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\b0l¢\u0006\u0004\bn\u0010oJ!\u0010s\u001a\u00020\b2\u0006\u0010q\u001a\u00020p2\n\u0010r\u001a\u00060<j\u0002`=¢\u0006\u0004\bs\u0010tJ%\u0010w\u001a\u00020\b2\u000e\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0u2\u0006\u0010v\u001a\u00020p¢\u0006\u0004\bw\u0010xJ/\u0010~\u001a\u00020\b2\b\u0010z\u001a\u0004\u0018\u00010y2\u0006\u0010|\u001a\u00020{2\u0006\u0010[\u001a\u00020}2\u0006\u0010Z\u001a\u00020}¢\u0006\u0004\b~\u0010\u007fJ*\u0010\u0082\u0001\u001a\u00020\b2\u0007\u0010L\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020{2\u0007\u0010\u0081\u0001\u001a\u00020}¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020\b¢\u0006\u0005\b\u0084\u0001\u0010\u0003J\u0018\u0010\u0085\u0001\u001a\u00020\b2\u0006\u0010z\u001a\u00020y¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J%\u0010\u0088\u0001\u001a\u00020\b2\u0007\u0010\u0087\u0001\u001a\u00020\u00002\n\b\u0002\u0010v\u001a\u0004\u0018\u00010p¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008c\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/google/android/b81;", "Lcom/google/android/g81;", "<init>", "()V", "", "c", "()Z", "f", "", "a", "Lcom/google/android/cub;", "slotStorage", "Lcom/google/android/ez;", "applier", "Lcom/google/android/sea;", "rememberManager", "Lcom/google/android/ur1;", "errorContext", "b", "(Lcom/google/android/cub;Lcom/google/android/ez;Lcom/google/android/sea;Lcom/google/android/ur1;)V", "Lcom/google/android/kub;", "slots", "Lcom/google/android/ts8;", "e", "(Lcom/google/android/ez;Lcom/google/android/kub;Lcom/google/android/sea;Lcom/google/android/ts8;)V", "Lcom/google/android/zea;", "value", "x", "(Lcom/google/android/zea;)V", "Landroidx/compose/runtime/b0;", "scope", "y", "(Landroidx/compose/runtime/b0;)V", "I", "q", "Lcom/google/android/g37;", "holder", "Lcom/google/android/t27;", "after", "M", "(Lcom/google/android/g37;Lcom/google/android/t27;)V", "", "slotIndex", "", "L", "(ILjava/lang/Object;)V", "g", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "firstTailGroupToRemove", "count", "B", "(II)V", "C", "k", "data", "J", "z", "Lcom/google/android/eub;", "sourceTable", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "source", "s", "(Lcom/google/android/eub;J)V", "Lcom/google/android/oe4;", "fixups", "t", "(Lcom/google/android/eub;JLcom/google/android/oe4;)V", "offset", "u", "(I)V", "h", "Lkotlin/Function1;", "Lcom/google/android/pr1;", "action", "composition", "o", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/pr1;)V", "node", "O", "T", "V", "Lkotlin/Function2;", "block", "K", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nodeIndex", "removeCount", "A", "to", "from", "v", "(III)V", "handle", "E", "(J)V", "Lcom/google/android/hub;", "addressSpace", "D", "(Lcom/google/android/hub;J)V", "H", "G", "N", "", "nodes", "n", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "F", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/m16;", "effectiveNodeIndexOut", "groupHandle", "l", "(Lcom/google/android/m16;J)V", "", "effectiveNodeIndex", "i", "(Ljava/util/List;Lcom/google/android/m16;)V", "Lcom/google/android/q08;", "resolvedState", "Landroidx/compose/runtime/f;", "parentContext", "Lcom/google/android/r08;", "j", "(Lcom/google/android/q08;Landroidx/compose/runtime/f;Lcom/google/android/r08;Lcom/google/android/r08;)V", "Lcom/google/android/x22;", "reference", "w", "(Lcom/google/android/x22;Landroidx/compose/runtime/f;Lcom/google/android/r08;)V", "p", "m", "(Lcom/google/android/q08;)V", "changeList", "r", "(Lcom/google/android/b81;Lcom/google/android/m16;)V", "Lcom/google/android/at8;", "Lcom/google/android/at8;", "operations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b81 extends g81 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final at8 operations = new at8();

    public final void A(int nodeIndex, int removeCount) {
        at8 at8Var = this.operations;
        ns8.z zVar = ns8.z.d;
        at8Var.l(zVar);
        at8 at8VarA = at8.b.a(at8Var);
        int iD = at8VarA.intArgsSize - at8VarA.opCodes[at8VarA.opCodesSize - 1].getInts();
        int[] iArr = at8VarA.intArgs;
        iArr[iD] = nodeIndex;
        iArr[iD + 1] = removeCount;
        at8Var.d(zVar);
    }

    public final void B(int firstTailGroupToRemove, int count) {
        at8 at8Var = this.operations;
        ns8.a0 a0Var = ns8.a0.d;
        at8Var.l(a0Var);
        at8 at8VarA = at8.b.a(at8Var);
        int iD = at8VarA.intArgsSize - at8VarA.opCodes[at8VarA.opCodesSize - 1].getInts();
        int[] iArr = at8VarA.intArgs;
        iArr[iD] = firstTailGroupToRemove;
        iArr[iD + 1] = count;
        at8Var.d(a0Var);
    }

    public final void C() {
        this.operations.k(ns8.b0.d);
    }

    public final void D(hub addressSpace, long handle) {
        at8 at8Var = this.operations;
        ns8.c0 c0Var = ns8.c0.d;
        at8Var.l(c0Var);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), u27.a(addressSpace, handle));
        at8Var.d(c0Var);
    }

    public final void E(long handle) {
        at8 at8Var = this.operations;
        ns8.d0 d0Var = ns8.d0.d;
        at8Var.l(d0Var);
        at8.b.c(at8.b.a(at8Var), 0, 1, handle);
        at8Var.d(d0Var);
    }

    public final void F(Function0<Unit> effect) {
        at8 at8Var = this.operations;
        ns8.e0 e0Var = ns8.e0.d;
        at8Var.l(e0Var);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), effect);
        at8Var.d(e0Var);
    }

    public final void G() {
        this.operations.k(ns8.f0.d);
    }

    public final void H() {
        this.operations.k(ns8.g0.d);
    }

    public final void I(b0 scope) {
        at8 at8Var = this.operations;
        ns8.h0 h0Var = ns8.h0.d;
        at8Var.l(h0Var);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), scope);
        at8Var.d(h0Var);
    }

    public final void J(Object data) {
        at8 at8Var = this.operations;
        ns8.i0 i0Var = ns8.i0.d;
        at8Var.l(i0Var);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), data);
        at8Var.d(i0Var);
    }

    public final <T, V> void K(V value, Function2<? super T, ? super V, Unit> block) {
        at8 at8Var = this.operations;
        ns8.j0 j0Var = ns8.j0.d;
        at8Var.l(j0Var);
        at8 at8VarA = at8.b.a(at8Var);
        int iA = ns8.s.a(0);
        int iA2 = ns8.s.a(1);
        Intrinsics.h(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        at8.b.e(at8VarA, iA, value, iA2, (Function2) a.f(block, 2));
        at8Var.d(j0Var);
    }

    public final void L(int slotIndex, Object value) {
        at8 at8Var = this.operations;
        ns8.l0 l0Var = ns8.l0.d;
        at8Var.l(l0Var);
        at8 at8VarA = at8.b.a(at8Var);
        at8VarA.intArgs[at8VarA.intArgsSize - at8VarA.opCodes[at8VarA.opCodesSize - 1].getInts()] = slotIndex;
        at8.b.d(at8VarA, ns8.s.a(0), value);
        at8Var.d(l0Var);
    }

    public final void M(g37 holder, t27 after) {
        at8 at8Var = this.operations;
        ns8.k0 k0Var = ns8.k0.d;
        at8Var.l(k0Var);
        at8 at8VarA = at8.b.a(at8Var);
        at8.b.d(at8VarA, ns8.s.a(1), holder);
        at8.b.d(at8VarA, ns8.s.a(0), after);
        at8Var.d(k0Var);
    }

    public final void N(int count) {
        at8 at8Var = this.operations;
        ns8.m0 m0Var = ns8.m0.d;
        at8Var.l(m0Var);
        at8 at8VarA = at8.b.a(at8Var);
        at8VarA.intArgs[at8VarA.intArgsSize - at8VarA.opCodes[at8VarA.opCodesSize - 1].getInts()] = count;
        at8Var.d(m0Var);
    }

    public final void O(Object node) {
        if (node instanceof aq1) {
            this.operations.k(ns8.n0.d);
        }
    }

    @Override // com.google.inputmethod.g81
    public void a() {
        this.operations.b();
    }

    @Override // com.google.inputmethod.g81
    public void b(cub slotStorage, ez<?> applier, sea rememberManager, ur1 errorContext) {
        kub kubVarO = sub.f(slotStorage).O();
        try {
            e(applier, kubVarO, rememberManager, errorContext);
            Unit unit = Unit.a;
        } finally {
            kubVarO.b();
        }
    }

    @Override // com.google.inputmethod.g81
    public boolean c() {
        return this.operations.h();
    }

    public final void e(ez<?> applier, kub slots, sea rememberManager, ts8 errorContext) {
        this.operations.e(applier, slots, rememberManager, errorContext);
    }

    public final boolean f() {
        return this.operations.getRequiresApplication();
    }

    public final void g(Object value) {
        at8 at8Var = this.operations;
        ns8.a aVar = ns8.a.d;
        at8Var.l(aVar);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), value);
        at8Var.d(aVar);
    }

    public final void h() {
        this.operations.k(ns8.c.d);
    }

    public final void i(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        at8 at8Var = this.operations;
        ns8.d dVar = ns8.d.d;
        at8Var.l(dVar);
        at8.b.e(at8.b.a(at8Var), ns8.s.a(1), nodes, ns8.s.a(0), effectiveNodeIndex);
        at8Var.d(dVar);
    }

    public final void j(q08 resolvedState, f parentContext, r08 from, r08 to) {
        at8 at8Var = this.operations;
        ns8.e eVar = ns8.e.d;
        at8Var.l(eVar);
        at8.b.g(at8.b.a(at8Var), ns8.s.a(0), resolvedState, ns8.s.a(1), parentContext, ns8.s.a(3), to, ns8.s.a(2), from);
        at8Var.d(eVar);
    }

    public final void k() {
        this.operations.k(ns8.f.d);
    }

    public final void l(IntRef effectiveNodeIndexOut, long groupHandle) {
        at8 at8Var = this.operations;
        ns8.g gVar = ns8.g.d;
        at8Var.l(gVar);
        at8 at8VarA = at8.b.a(at8Var);
        at8.b.d(at8VarA, ns8.s.a(0), effectiveNodeIndexOut);
        at8.b.c(at8VarA, 1, 0, groupHandle);
        at8Var.d(gVar);
    }

    public final void m(q08 resolvedState) {
        at8 at8Var = this.operations;
        ns8.h hVar = ns8.h.d;
        at8Var.l(hVar);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), resolvedState);
        at8Var.d(hVar);
    }

    public final void n(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        at8 at8Var = this.operations;
        ns8.i iVar = ns8.i.d;
        at8Var.l(iVar);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), nodes);
        at8Var.d(iVar);
    }

    public final void o(Function1<? super pr1, Unit> action, pr1 composition) {
        at8 at8Var = this.operations;
        ns8.j jVar = ns8.j.d;
        at8Var.l(jVar);
        at8.b.e(at8.b.a(at8Var), ns8.s.a(0), action, ns8.s.a(1), composition);
        at8Var.d(jVar);
    }

    public final void p() {
        this.operations.k(ns8.k.d);
    }

    public final void q(b0 scope) {
        at8 at8Var = this.operations;
        ns8.l lVar = ns8.l.d;
        at8Var.l(lVar);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), scope);
        at8Var.d(lVar);
    }

    public final void r(b81 changeList, IntRef effectiveNodeIndex) {
        if (changeList.d()) {
            at8 at8Var = this.operations;
            ns8.b bVar = ns8.b.d;
            at8Var.l(bVar);
            at8 at8VarA = at8.b.a(at8Var);
            at8.b.e(at8VarA, ns8.s.a(0), changeList, ns8.s.a(1), effectiveNodeIndex);
            if (changeList.operations.getRequiresApplication()) {
                at8.b.b(at8VarA);
            }
            at8Var.d(bVar);
        }
    }

    public final void s(eub sourceTable, long source) {
        at8 at8Var = this.operations;
        ns8.o oVar = ns8.o.d;
        at8Var.l(oVar);
        at8 at8VarA = at8.b.a(at8Var);
        at8.b.c(at8VarA, 0, 1, source);
        at8.b.d(at8VarA, ns8.s.a(0), sourceTable);
        at8Var.d(oVar);
    }

    public final void t(eub sourceTable, long source, oe4 fixups) {
        at8 at8Var = this.operations;
        ns8.p pVar = ns8.p.d;
        at8Var.l(pVar);
        at8 at8VarA = at8.b.a(at8Var);
        at8.b.c(at8VarA, 0, 1, source);
        at8.b.e(at8VarA, ns8.s.a(0), sourceTable, ns8.s.a(1), fixups);
        at8Var.d(pVar);
    }

    public final void u(int offset) {
        at8 at8Var = this.operations;
        ns8.q qVar = ns8.q.d;
        at8Var.l(qVar);
        at8 at8VarA = at8.b.a(at8Var);
        at8VarA.intArgs[at8VarA.intArgsSize - at8VarA.opCodes[at8VarA.opCodesSize - 1].getInts()] = offset;
        at8Var.d(qVar);
    }

    public final void v(int to, int from, int count) {
        at8 at8Var = this.operations;
        ns8.r rVar = ns8.r.d;
        at8Var.l(rVar);
        at8 at8VarA = at8.b.a(at8Var);
        int iD = at8VarA.intArgsSize - at8VarA.opCodes[at8VarA.opCodesSize - 1].getInts();
        int[] iArr = at8VarA.intArgs;
        iArr[iD + 1] = to;
        iArr[iD] = from;
        iArr[iD + 2] = count;
        at8Var.d(rVar);
    }

    public final void w(x22 composition, f parentContext, r08 reference) {
        at8 at8Var = this.operations;
        ns8.v vVar = ns8.v.d;
        at8Var.l(vVar);
        at8.b.f(at8.b.a(at8Var), ns8.s.a(0), composition, ns8.s.a(1), parentContext, ns8.s.a(2), reference);
        at8Var.d(vVar);
    }

    public final void x(zea value) {
        at8 at8Var = this.operations;
        ns8.w wVar = ns8.w.d;
        at8Var.l(wVar);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), value);
        at8Var.d(wVar);
    }

    public final void y(b0 scope) {
        at8 at8Var = this.operations;
        ns8.x xVar = ns8.x.d;
        at8Var.l(xVar);
        at8.b.d(at8.b.a(at8Var), ns8.s.a(0), scope);
        at8Var.d(xVar);
    }

    public final void z() {
        this.operations.k(ns8.y.d);
    }
}
