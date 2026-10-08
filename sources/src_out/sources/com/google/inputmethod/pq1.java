package com.google.inputmethod;

import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.f;
import androidx.compose.p004runtime.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u00017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J\u0015\u00101\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b1\u0010/J\u001f\u00103\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u00102\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0018¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b9\u0010%J\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\nJ\u0017\u0010<\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\nJ\r\u0010?\u001a\u00020\b¢\u0006\u0004\b?\u0010\nJ\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\nJ\r\u0010A\u001a\u00020\b¢\u0006\u0004\bA\u0010\nJ\u001d\u0010C\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020B¢\u0006\u0004\bC\u0010DJ%\u0010G\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020B2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020\u0018¢\u0006\u0004\bJ\u0010%J)\u0010O\u001a\u00020\b2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\b0K2\u0006\u0010N\u001a\u00020L¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bR\u0010=J;\u0010V\u001a\u00020\b\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010S2\u0006\u0010)\u001a\u00028\u00012\u0018\u0010U\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0T¢\u0006\u0004\bV\u0010WJ\u001d\u0010Y\u001a\u00020\b2\u0006\u0010X\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bY\u0010\u001cJ%\u0010Z\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bZ\u0010!J\r\u0010[\u001a\u00020\b¢\u0006\u0004\b[\u0010\nJ\r\u0010\\\u001a\u00020\b¢\u0006\u0004\b\\\u0010\nJ\u001d\u0010^\u001a\u00020\b2\u0006\u0010X\u001a\u00020\u00182\u0006\u0010]\u001a\u00020\u0018¢\u0006\u0004\b^\u0010\u001cJ\r\u0010_\u001a\u00020\b¢\u0006\u0004\b_\u0010\nJ\u0017\u0010`\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b`\u0010=J\u001b\u0010c\u001a\u00020\b2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\b0a¢\u0006\u0004\bc\u0010dJ\u001d\u0010g\u001a\u00020\b2\u0006\u0010f\u001a\u00020e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bg\u0010hJ%\u0010l\u001a\u00020\b2\u000e\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010i2\u0006\u0010k\u001a\u00020e¢\u0006\u0004\bl\u0010mJ/\u0010s\u001a\u00020\b2\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020p2\u0006\u0010\u001e\u001a\u00020r2\u0006\u0010\u001d\u001a\u00020r¢\u0006\u0004\bs\u0010tJ%\u0010w\u001a\u00020\b2\u0006\u0010N\u001a\u00020u2\u0006\u0010q\u001a\u00020p2\u0006\u0010v\u001a\u00020r¢\u0006\u0004\bw\u0010xJ\r\u0010y\u001a\u00020\b¢\u0006\u0004\by\u0010\nJ!\u0010{\u001a\u00020\b2\u0006\u0010z\u001a\u00020\u00042\n\b\u0002\u0010k\u001a\u0004\u0018\u00010e¢\u0006\u0004\b{\u0010|J\r\u0010}\u001a\u00020\b¢\u0006\u0004\b}\u0010\nJ\r\u0010~\u001a\u00020\b¢\u0006\u0004\b~\u0010\nJ\r\u0010\u007f\u001a\u00020\b¢\u0006\u0004\b\u007f\u0010\nR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010\u0080\u0001R&\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bl\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\bS\u0010\u0084\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u00100R\u0017\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0087\u0001R&\u0010\u008c\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\bg\u00100\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0005\b\u008b\u0001\u0010\u000fR\u0017\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u0017R\u0017\u0010\u008e\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0017R\u001f\u0010\u0091\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0090\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010\u0017R\u0017\u0010\u0092\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\u0017R\u0017\u0010\u0093\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\u0017R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0014\u0010\u0099\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u008a\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/google/android/pq1;", "", "Landroidx/compose/runtime/k;", "composer", "Lcom/google/android/c81;", "changeList", "<init>", "(Landroidx/compose/runtime/k;Lcom/google/android/c81;)V", "", "C", "()V", "E", "", "useParentSlot", "F", "(Z)V", "n", "Lcom/google/android/ku4;", "anchor", "m", "(Lcom/google/android/ku4;)V", "forParent", "J", "I", "", "removeFrom", "moveCount", "L", "(II)V", "to", "from", "count", "H", "(III)V", "D", "location", "z", "(I)V", "A", "M", "Lcom/google/android/zea;", "value", "P", "(Lcom/google/android/zea;)V", "Landroidx/compose/runtime/b0;", "scope", "Q", "(Landroidx/compose/runtime/b0;)V", "Z", "k", "groupSlotIndex", "e0", "(Ljava/lang/Object;I)V", "b0", "(Ljava/lang/Object;Lcom/google/android/ku4;I)V", "a", "(Lcom/google/android/ku4;Ljava/lang/Object;)V", "a0", "T", "data", "c0", "(Ljava/lang/Object;)V", "l", "g", "Y", "R", "Lcom/google/android/fub;", "u", "(Lcom/google/android/ku4;Lcom/google/android/fub;)V", "Lcom/google/android/pe4;", "fixups", "v", "(Lcom/google/android/ku4;Lcom/google/android/fub;Lcom/google/android/pe4;)V", "offset", "w", "Lkotlin/Function1;", "Lcom/google/android/pr1;", "action", "composition", "f", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/pr1;)V", "node", "f0", "V", "Lkotlin/Function2;", "block", "d0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nodeIndex", "S", "y", "N", "i", "group", "j", "B", "x", "Lkotlin/Function0;", "effect", "X", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/m16;", "effectiveNodeIndexOut", "e", "(Lcom/google/android/m16;Lcom/google/android/ku4;)V", "", "nodes", "effectiveNodeIndex", "b", "(Ljava/util/List;Lcom/google/android/m16;)V", "Lcom/google/android/q08;", "resolvedState", "Landroidx/compose/runtime/f;", "parentContext", "Lcom/google/android/r08;", "c", "(Lcom/google/android/q08;Landroidx/compose/runtime/f;Lcom/google/android/r08;Lcom/google/android/r08;)V", "Lcom/google/android/x22;", "reference", "O", "(Lcom/google/android/x22;Landroidx/compose/runtime/f;Lcom/google/android/r08;)V", "h", "other", "t", "(Lcom/google/android/c81;Lcom/google/android/m16;)V", "o", "U", "d", "Landroidx/compose/runtime/k;", "Lcom/google/android/c81;", "p", "()Lcom/google/android/c81;", "(Lcom/google/android/c81;)V", "startedGroup", "Lcom/google/android/t16;", "Lcom/google/android/t16;", "startedGroups", "q", "()Z", "W", "implicitRootStart", "writersReaderDelta", "pendingUps", "Lcom/google/android/w3c;", "Ljava/util/ArrayList;", "pendingDownNodes", "moveFrom", "moveTo", "Lcom/google/android/bub;", "s", "()Lcom/google/android/bub;", "reader", "r", "pastParent", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class pq1 {
    public static final int n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k composer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private c81 changeList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean startedGroup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int writersReaderDelta;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int pendingUps;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int moveCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final t16 startedGroups = new t16();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean implicitRootStart = true;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ArrayList<Object> pendingDownNodes = w3c.c(null, 1, null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int removeFrom = -1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int moveFrom = -1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int moveTo = -1;

    public pq1(k kVar, c81 c81Var) {
        this.composer = kVar;
        this.changeList = c81Var;
    }

    private final void C() {
        D();
    }

    private final void D() {
        int i = this.pendingUps;
        if (i > 0) {
            this.changeList.L(i);
            this.pendingUps = 0;
        }
        if (w3c.f(this.pendingDownNodes)) {
            this.changeList.l(w3c.k(this.pendingDownNodes));
            w3c.a(this.pendingDownNodes);
        }
    }

    private final void E() {
        K(this, false, 1, null);
        M();
    }

    private final void F(boolean useParentSlot) {
        J(useParentSlot);
    }

    static /* synthetic */ void G(pq1 pq1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pq1Var.F(z);
    }

    private final void H(int to, int from, int count) {
        C();
        this.changeList.w(to, from, count);
    }

    private final void I() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFrom;
            if (i2 >= 0) {
                L(i2, i);
                this.removeFrom = -1;
            } else {
                H(this.moveTo, this.moveFrom, i);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void J(boolean forParent) {
        int parent = forParent ? s().getParent() : s().getCurrent();
        int i = parent - this.writersReaderDelta;
        if (!(i >= 0)) {
            e.b("Tried to seek backward");
        }
        if (i > 0) {
            this.changeList.f(i);
            this.writersReaderDelta = parent;
        }
    }

    static /* synthetic */ void K(pq1 pq1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        pq1Var.J(z);
    }

    private final void L(int removeFrom, int moveCount) {
        C();
        this.changeList.B(removeFrom, moveCount);
    }

    private final void m(ku4 anchor) {
        G(this, false, 1, null);
        this.changeList.q(anchor);
        this.startedGroup = true;
    }

    private final void n() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        G(this, false, 1, null);
        this.changeList.r();
        this.startedGroup = true;
    }

    private final SlotReader s() {
        return this.composer.getReader();
    }

    public final void A(int location) {
        this.writersReaderDelta = location;
    }

    public final void B() {
        I();
        if (w3c.f(this.pendingDownNodes)) {
            w3c.i(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void M() {
        SlotReader slotReaderS;
        int parent;
        if (s().getGroupsSize() <= 0 || this.startedGroups.f(-2) == (parent = (slotReaderS = s()).getParent())) {
            return;
        }
        n();
        if (parent > 0) {
            ku4 ku4VarA = slotReaderS.a(parent);
            this.startedGroups.i(parent);
            m(ku4VarA);
        }
    }

    public final void N() {
        D();
        if (this.startedGroup) {
            Y();
            l();
        }
    }

    public final void O(x22 composition, f parentContext, r08 reference) {
        this.changeList.x(composition, parentContext, reference);
    }

    public final void P(zea value) {
        this.changeList.y(value);
    }

    public final void Q(b0 scope) {
        this.changeList.z(scope);
    }

    public final void R() {
        E();
        this.changeList.A();
        this.writersReaderDelta += s().p();
    }

    public final void S(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                e.b("Invalid remove index " + nodeIndex);
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            I();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void T() {
        this.changeList.C();
    }

    public final void U() {
        this.startedGroup = false;
        this.startedGroups.a();
        this.writersReaderDelta = 0;
        this.implicitRootStart = true;
        this.pendingUps = 0;
        w3c.a(this.pendingDownNodes);
        this.removeFrom = -1;
        this.moveFrom = -1;
        this.moveTo = -1;
        this.moveCount = 0;
    }

    public final void V(c81 c81Var) {
        this.changeList = c81Var;
    }

    public final void W(boolean z) {
        this.implicitRootStart = z;
    }

    public final void X(Function0<Unit> effect) {
        this.changeList.D(effect);
    }

    public final void Y() {
        this.changeList.E();
    }

    public final void Z(b0 scope) {
        this.changeList.F(scope);
    }

    public final void a(ku4 anchor, Object value) {
        this.changeList.g(anchor, value);
    }

    public final void a0(int count) {
        if (count > 0) {
            E();
            this.changeList.G(count);
        }
    }

    public final void b(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        this.changeList.h(nodes, effectiveNodeIndex);
    }

    public final void b0(Object value, ku4 anchor, int groupSlotIndex) {
        this.changeList.H(value, anchor, groupSlotIndex);
    }

    public final void c(q08 resolvedState, f parentContext, r08 from, r08 to) {
        this.changeList.i(resolvedState, parentContext, from, to);
    }

    public final void c0(Object data) {
        G(this, false, 1, null);
        this.changeList.I(data);
    }

    public final void d() {
        G(this, false, 1, null);
        this.changeList.j();
    }

    public final <T, V> void d0(V value, Function2<? super T, ? super V, Unit> block) {
        C();
        this.changeList.J(value, block);
    }

    public final void e(IntRef effectiveNodeIndexOut, ku4 anchor) {
        D();
        this.changeList.k(effectiveNodeIndexOut, anchor);
    }

    public final void e0(Object value, int groupSlotIndex) {
        F(true);
        this.changeList.K(value, groupSlotIndex);
    }

    public final void f(Function1<? super pr1, Unit> action, pr1 composition) {
        this.changeList.m(action, composition);
    }

    public final void f0(Object node) {
        C();
        this.changeList.M(node);
    }

    public final void g() {
        int parent = s().getParent();
        if (!(this.startedGroups.f(-1) <= parent)) {
            e.b("Missed recording an endGroup");
        }
        if (this.startedGroups.f(-1) == parent) {
            G(this, false, 1, null);
            this.startedGroups.g();
            this.changeList.n();
        }
    }

    public final void h() {
        D();
        this.changeList.o();
        this.writersReaderDelta = 0;
    }

    public final void i() {
        I();
    }

    public final void j(int nodeIndex, int group) {
        i();
        D();
        int iO = s().K(group) ? 1 : s().O(group);
        if (iO > 0) {
            S(nodeIndex, iO);
        }
    }

    public final void k(b0 scope) {
        this.changeList.p(scope);
    }

    public final void l() {
        if (this.startedGroup) {
            G(this, false, 1, null);
            G(this, false, 1, null);
            this.changeList.n();
            this.startedGroup = false;
        }
    }

    public final void o() {
        D();
        if (this.startedGroups.tos == 0) {
            return;
        }
        e.b("Missed recording an endGroup()");
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final c81 getChangeList() {
        return this.changeList;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final boolean r() {
        return s().getParent() - this.writersReaderDelta < 0;
    }

    public final void t(c81 other, IntRef effectiveNodeIndex) {
        this.changeList.s(other, effectiveNodeIndex);
    }

    public final void u(ku4 anchor, fub from) {
        D();
        E();
        I();
        this.changeList.t(anchor, from);
    }

    public final void v(ku4 anchor, fub from, pe4 fixups) {
        D();
        E();
        I();
        this.changeList.u(anchor, from, fixups);
    }

    public final void w(int offset) {
        E();
        this.changeList.v(offset);
    }

    public final void x(Object node) {
        I();
        w3c.j(this.pendingDownNodes, node);
    }

    public final void y(int from, int to, int count) {
        if (count > 0) {
            int i = this.moveCount;
            if (i > 0 && this.moveFrom == from - i && this.moveTo == to - i) {
                this.moveCount = i + count;
                return;
            }
            I();
            this.moveFrom = from;
            this.moveTo = to;
            this.moveCount = count;
        }
    }

    public final void z(int location) {
        this.writersReaderDelta += location - s().getCurrent();
    }
}
