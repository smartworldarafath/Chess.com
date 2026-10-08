package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.b;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.fhd;
import com.google.inputmethod.ghd;
import com.google.inputmethod.re8;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.t3e;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000eJ!\u0010 \u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b \u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00106\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010$R\u001a\u0010=\u001a\u0002098BX\u0082\u0004¢\u0006\f\u0012\u0004\b<\u0010\u000e\u001a\u0004\b:\u0010;R\u0016\u0010?\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010-¨\u0006@"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Lcom/google/android/fhd;", "Lcom/google/android/re8;", "Landroidx/compose/ui/b$c;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Lcom/google/android/re8;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "newDispatcher", "", "r3", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "s3", "()V", "q3", "Lcom/google/android/rn8;", "available", "Lcom/google/android/we8;", "source", "v2", "(JI)J", "consumed", "o0", "(JJI)J", "Lcom/google/android/t3e;", "q0", "(JLcom/google/android/q22;)Ljava/lang/Object;", "r1", "(JJLcom/google/android/q22;)Ljava/lang/Object;", "V2", "W2", "t3", "p", "Lcom/google/android/re8;", "getConnection", "()Lcom/google/android/re8;", "setConnection", "(Lcom/google/android/re8;)V", "q", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "resolvedDispatcher", "r", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getLastKnownParentNode$ui", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setLastKnownParentNode$ui", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "lastKnownParentNode", "", "s", "Ljava/lang/Object;", "p1", "()Ljava/lang/Object;", "traverseKey", "o3", "parentConnection", "Lcom/google/android/ta2;", "n3", "()Lcom/google/android/ta2;", "getNestedCoroutineScope$annotations", "nestedCoroutineScope", "p3", "parentNestedScrollNode", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NestedScrollNode extends b.c implements fhd, re8 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private re8 connection;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private NestedScrollDispatcher resolvedDispatcher;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private NestedScrollNode lastKnownParentNode;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Object traverseKey;

    public NestedScrollNode(re8 re8Var, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = re8Var;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ta2 n3() {
        NestedScrollNode nestedScrollNodeP3 = p3();
        ta2 ta2VarN3 = nestedScrollNodeP3 != null ? nestedScrollNodeP3.n3() : null;
        if (ta2VarN3 != null && j.i(ta2VarN3)) {
            return ta2VarN3;
        }
        ta2 ta2VarH = this.resolvedDispatcher.getScope();
        if (ta2VarH != null) {
            return ta2VarH;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final re8 o3() {
        if (getIsAttached()) {
            return p3();
        }
        return null;
    }

    private final void q3() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.k(null);
        }
    }

    private final void r3(NestedScrollDispatcher newDispatcher) {
        q3();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!Intrinsics.e(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            s3();
        }
    }

    private final void s3() {
        this.resolvedDispatcher.k(this);
        this.resolvedDispatcher.j(null);
        this.lastKnownParentNode = null;
        this.resolvedDispatcher.i(new Function0<ta2>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ta2 invoke() {
                return this.this$0.n3();
            }
        });
        this.resolvedDispatcher.l(L2());
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        s3();
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNodeKt.b(this);
        this.lastKnownParentNode = nestedScrollNode;
        this.resolvedDispatcher.j(nestedScrollNode);
        q3();
    }

    @Override // com.google.inputmethod.re8
    public long o0(long consumed, long available, int source) {
        long jO0 = this.connection.o0(consumed, available, source);
        re8 re8VarO3 = o3();
        return rn8.q(jO0, re8VarO3 != null ? re8VarO3.o0(rn8.q(consumed, jO0), rn8.p(available, jO0), source) : rn8.INSTANCE.c());
    }

    @Override // com.google.inputmethod.fhd
    /* JADX INFO: renamed from: p1, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final NestedScrollNode p3() {
        if (getIsAttached()) {
            return (NestedScrollNode) ghd.b(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r11 == r1) goto L26;
     */
    @Override // com.google.inputmethod.re8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q0(long r9, com.google.android.q22<? super com.google.inputmethod.t3e> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.J$0
            kotlin.f.b(r11)
            goto L72
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.J$0
            kotlin.f.b(r11)
            goto L50
        L3c:
            kotlin.f.b(r11)
            com.google.android.re8 r11 = r8.o3()
            if (r11 == 0) goto L5a
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.q0(r9, r0)
            if (r11 != r1) goto L50
            goto L71
        L50:
            com.google.android.t3e r11 = (com.google.inputmethod.t3e) r11
            long r4 = r11.getPackedValue()
        L56:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L61
        L5a:
            com.google.android.t3e$a r11 = com.google.inputmethod.t3e.INSTANCE
            long r4 = r11.a()
            goto L56
        L61:
            com.google.android.re8 r11 = r8.connection
            long r4 = com.google.inputmethod.t3e.k(r4, r9)
            r0.J$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.q0(r4, r0)
            if (r11 != r1) goto L72
        L71:
            return r1
        L72:
            com.google.android.t3e r11 = (com.google.inputmethod.t3e) r11
            long r0 = r11.getPackedValue()
            long r9 = com.google.inputmethod.t3e.l(r9, r0)
            com.google.android.t3e r9 = com.google.inputmethod.t3e.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.q0(long, com.google.android.q22):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.google.inputmethod.re8
    public Object r1(long j, long j2, q22<? super t3e> q22Var) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        long j3;
        long j4;
        long packedValue;
        long jA;
        long j5;
        if (q22Var instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) q22Var;
            int i = nestedScrollNode$onPostFling$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                nestedScrollNode$onPostFling$1.label = i - t04.INVALID_ID;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, q22Var);
            }
        } else {
            nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, q22Var);
        }
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$2 = nestedScrollNode$onPostFling$1;
        Object objR1 = nestedScrollNode$onPostFling$2.result;
        Object objG = a.g();
        int i2 = nestedScrollNode$onPostFling$2.label;
        if (i2 == 0) {
            f.b(objR1);
            re8 re8Var = this.connection;
            nestedScrollNode$onPostFling$2.J$0 = j;
            nestedScrollNode$onPostFling$2.J$1 = j2;
            nestedScrollNode$onPostFling$2.label = 1;
            objR1 = re8Var.r1(j, j2, nestedScrollNode$onPostFling$2);
            if (objR1 != objG) {
                j3 = j;
                j4 = j2;
            }
            return objG;
        }
        if (i2 == 1) {
            j4 = nestedScrollNode$onPostFling$2.J$1;
            j3 = nestedScrollNode$onPostFling$2.J$0;
            f.b(objR1);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = nestedScrollNode$onPostFling$2.J$0;
            f.b(objR1);
        }
        jA = ((t3e) objR1).getPackedValue();
        packedValue = j5;
        return t3e.b(t3e.l(packedValue, jA));
        packedValue = ((t3e) objR1).getPackedValue();
        re8 re8VarO3 = getIsAttached() ? o3() : this.lastKnownParentNode;
        if (re8VarO3 != null) {
            long jL = t3e.l(j3, packedValue);
            long jK = t3e.k(j4, packedValue);
            nestedScrollNode$onPostFling$2.J$0 = packedValue;
            nestedScrollNode$onPostFling$2.label = 2;
            objR1 = re8VarO3.r1(jL, jK, nestedScrollNode$onPostFling$2);
            if (objR1 != objG) {
                j5 = packedValue;
                jA = ((t3e) objR1).getPackedValue();
                packedValue = j5;
            }
            return objG;
        }
        jA = t3e.INSTANCE.a();
        return t3e.b(t3e.l(packedValue, jA));
    }

    public final void t3(re8 connection, NestedScrollDispatcher dispatcher) {
        this.connection = connection;
        r3(dispatcher);
    }

    @Override // com.google.inputmethod.re8
    public long v2(long available, int source) {
        re8 re8VarO3 = o3();
        long jV2 = re8VarO3 != null ? re8VarO3.v2(available, source) : rn8.INSTANCE.c();
        return rn8.q(jV2, this.connection.v2(rn8.p(available, jV2), source));
    }
}
