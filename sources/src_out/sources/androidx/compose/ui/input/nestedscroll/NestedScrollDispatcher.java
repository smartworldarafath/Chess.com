package androidx.compose.ui.input.nestedscroll;

import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.re8;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R*\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0016\u0010/\u001a\u0004\u0018\u00010,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "<init>", "()V", "Lcom/google/android/rn8;", "available", "Lcom/google/android/we8;", "source", "d", "(JI)J", "consumed", "b", "(JJI)J", "Lcom/google/android/t3e;", "c", "(JLcom/google/android/q22;)Ljava/lang/Object;", "a", "(JJLcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "f", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "k", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "nestedScrollNode", "getLastKnownParentNode$ui", "j", "lastKnownParentNode", "Lkotlin/Function0;", "Lcom/google/android/ta2;", "Lkotlin/jvm/functions/Function0;", "getCalculateNestedScrollScope$ui", "()Lkotlin/jvm/functions/Function0;", "i", "(Lkotlin/jvm/functions/Function0;)V", "calculateNestedScrollScope", "Lcom/google/android/ta2;", "h", "()Lcom/google/android/ta2;", "l", "(Lcom/google/android/ta2;)V", "scope", "e", "coroutineScope", "Lcom/google/android/re8;", "g", "()Lcom/google/android/re8;", "parent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NestedScrollDispatcher {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private NestedScrollNode nestedScrollNode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private NestedScrollNode lastKnownParentNode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function0<? extends ta2> calculateNestedScrollScope = new Function0<ta2>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ta2 invoke() {
            return this.this$0.getScope();
        }
    };

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ta2 scope;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, long r10, com.google.android.q22<? super com.google.inputmethod.t3e> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            kotlin.f.b(r12)
            goto L71
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.f.b(r12)
            goto L52
        L3a:
            kotlin.f.b(r12)
            com.google.android.re8 r12 = r7.g()
            if (r12 != 0) goto L60
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r1 = r7.lastKnownParentNode
            if (r1 == 0) goto L59
            r6.label = r3
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.r1(r2, r4, r6)
            if (r12 != r0) goto L52
            goto L70
        L52:
            com.google.android.t3e r12 = (com.google.inputmethod.t3e) r12
            long r8 = r12.getPackedValue()
            goto L7e
        L59:
            com.google.android.t3e$a r8 = com.google.inputmethod.t3e.INSTANCE
            long r8 = r8.a()
            goto L7e
        L60:
            r4 = r10
            com.google.android.re8 r1 = r7.g()
            if (r1 == 0) goto L78
            r6.label = r2
            r2 = r8
            java.lang.Object r12 = r1.r1(r2, r4, r6)
            if (r12 != r0) goto L71
        L70:
            return r0
        L71:
            com.google.android.t3e r12 = (com.google.inputmethod.t3e) r12
            long r8 = r12.getPackedValue()
            goto L7e
        L78:
            com.google.android.t3e$a r8 = com.google.inputmethod.t3e.INSTANCE
            long r8 = r8.a()
        L7e:
            com.google.android.t3e r8 = com.google.inputmethod.t3e.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.a(long, long, com.google.android.q22):java.lang.Object");
    }

    public final long b(long consumed, long available, int source) {
        re8 re8VarG = g();
        return re8VarG != null ? re8VarG.o0(consumed, available, source) : rn8.INSTANCE.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, q22<? super t3e> q22Var) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long jA;
        if (q22Var instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) q22Var;
            int i = nestedScrollDispatcher$dispatchPreFling$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label = i - t04.INVALID_ID;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, q22Var);
            }
        } else {
            nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, q22Var);
        }
        Object objQ0 = nestedScrollDispatcher$dispatchPreFling$1.result;
        Object objG = a.g();
        int i2 = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i2 == 0) {
            f.b(objQ0);
            re8 re8VarG = g();
            if (re8VarG != null) {
                nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                objQ0 = re8VarG.q0(j, nestedScrollDispatcher$dispatchPreFling$1);
                if (objQ0 == objG) {
                    return objG;
                }
            } else {
                jA = t3e.INSTANCE.a();
            }
            return t3e.b(jA);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(objQ0);
        jA = ((t3e) objQ0).getPackedValue();
        return t3e.b(jA);
    }

    public final long d(long available, int source) {
        re8 re8VarG = g();
        return re8VarG != null ? re8VarG.v2(available, source) : rn8.INSTANCE.c();
    }

    public final ta2 e() {
        ta2 ta2Var = (ta2) this.calculateNestedScrollScope.invoke();
        if (ta2Var != null) {
            return ta2Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final NestedScrollNode getNestedScrollNode() {
        return this.nestedScrollNode;
    }

    public final re8 g() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        if (nestedScrollNode != null) {
            return nestedScrollNode.p3();
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ta2 getScope() {
        return this.scope;
    }

    public final void i(Function0<? extends ta2> function0) {
        this.calculateNestedScrollScope = function0;
    }

    public final void j(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void k(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void l(ta2 ta2Var) {
        this.scope = ta2Var;
    }
}
