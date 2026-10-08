package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.m;
import com.google.inputmethod.al4;
import com.google.inputmethod.dl4;
import com.google.inputmethod.e58;
import com.google.inputmethod.gba;
import com.google.inputmethod.ik4;
import com.google.inputmethod.k33;
import com.google.inputmethod.ki8;
import com.google.inputmethod.mq1;
import com.google.inputmethod.ni8;
import com.google.inputmethod.nk4;
import com.google.inputmethod.r58;
import com.google.inputmethod.ri6;
import com.google.inputmethod.si6;
import com.google.inputmethod.uy7;
import com.google.inputmethod.va9;
import com.google.inputmethod.x23;
import com.google.inputmethod.x48;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/J7\u00103\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010\u001a2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b01H\u0016¢\u0006\u0004\b3\u00104J%\u00107\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b05H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b9\u0010\u0017J%\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b05H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\b2\u0006\u0010;\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020 H\u0016¢\u0006\u0004\bA\u0010\"J\u000f\u0010B\u001a\u00020 H\u0016¢\u0006\u0004\bB\u0010\"J\u0017\u0010D\u001a\u00020 2\u0006\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020 2\u0006\u0010C\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020 H\u0016¢\u0006\u0004\bI\u0010\"J\u0011\u0010J\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\bH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\bH\u0016¢\u0006\u0004\bN\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010QR\"\u0010U\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010R\u001a\u0004\bS\u0010\u000f\"\u0004\bT\u0010ER\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010WR\u001a\u0010\\\u001a\u00020Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010Z\u001a\u0004\bO\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R \u0010g\u001a\b\u0012\u0004\u0012\u00020b0a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR.\u0010k\u001a\u0004\u0018\u00010\r2\b\u0010h\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010R\u001a\u0004\bi\u0010\u000f\"\u0004\bj\u0010ER*\u0010n\u001a\u00020\b2\u0006\u0010h\u001a\u00020\b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010l\u001a\u0004\bm\u0010M\"\u0004\b^\u0010&R\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Lcom/google/android/va9;", "platformFocusOwner", "Landroidx/compose/ui/node/m;", "owner", "<init>", "(Lcom/google/android/va9;Landroidx/compose/ui/node/m;)V", "", "forced", "refreshFocusEvents", "D", "(ZZ)Z", "Landroidx/compose/ui/focus/FocusTargetNode;", "E", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Lcom/google/android/x23;", "Landroidx/compose/ui/b$c;", "G", "(Lcom/google/android/x23;)Landroidx/compose/ui/b$c;", "Lcom/google/android/oi6;", "keyEvent", "I", "(Landroid/view/KeyEvent;)Z", "Landroidx/compose/ui/focus/b;", "focusDirection", "Lcom/google/android/gba;", "previouslyFocusedRect", "b", "(Landroidx/compose/ui/focus/b;Lcom/google/android/gba;)Z", "H", "(ILcom/google/android/gba;)Z", "", "B", "()V", "d", "force", "C", "(Z)V", "clearOwnerFocus", "n", "(ZZZI)Z", "p", "(I)Z", "v", "wrapAroundForOneDimensionalFocus", "s", "(IZ)Z", "focusedRect", "Lkotlin/Function1;", "onFound", "w", "(ILcom/google/android/gba;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "Lkotlin/Function0;", "onFocusedItem", "y", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "h", "Lcom/google/android/bqa;", "event", "u", "(Lcom/google/android/bqa;Lkotlin/jvm/functions/Function0;)Z", "Lcom/google/android/ev5;", "r", "(Lcom/google/android/ev5;)Z", "l", "c", "node", "x", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Lcom/google/android/ik4;", "k", "(Lcom/google/android/ik4;)V", "j", "e", "()Lcom/google/android/gba;", "o", "()Z", "z", "a", "Lcom/google/android/va9;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/focus/FocusTargetNode;", "F", "setRootFocusNode$ui", "rootFocusNode", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/b;", "Landroidx/compose/ui/b;", "()Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/x48;", "f", "Lcom/google/android/x48;", "keysCurrentlyDown", "Lcom/google/android/e58;", "Lcom/google/android/nk4;", "g", "Lcom/google/android/e58;", "getListeners", "()Lcom/google/android/e58;", "listeners", "value", "i", "q", "activeFocusTargetNode", "Z", "m", "isFocusCaptured", "Lcom/google/android/dl4;", "A", "()Lcom/google/android/dl4;", "rootState", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusOwnerImpl implements FocusOwner {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final va9 platformFocusOwner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final m owner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FocusInvalidationManager focusInvalidationManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private x48 keysCurrentlyDown;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private FocusTargetNode activeFocusTargetNode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isFocusCaptured;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private FocusTargetNode rootFocusNode = new FocusTargetNode(j.INSTANCE.b(), false, null, null, 14, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final androidx.compose.ui.b modifier = new b();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final e58<nk4> listeners = new e58<>(1);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/compose/ui/focus/FocusOwnerImpl$b", "Lcom/google/android/uy7;", "Landroidx/compose/ui/focus/FocusTargetNode;", "d", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends uy7<FocusTargetNode> {
        b() {
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode a() {
            return FocusOwnerImpl.this.getRootFocusNode();
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(FocusTargetNode node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return FocusOwnerImpl.this.getRootFocusNode().hashCode();
        }
    }

    public FocusOwnerImpl(va9 va9Var, m mVar) {
        this.platformFocusOwner = va9Var;
        this.owner = mVar;
        this.focusInvalidationManager = new FocusInvalidationManager(this, mVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final boolean D(boolean forced, boolean refreshFocusEvents) throws KotlinNothingValueException {
        ki8 nodes;
        if (i() == null) {
            return true;
        }
        if (getIsFocusCaptured() && !forced) {
            return false;
        }
        FocusTargetNode focusTargetNodeI = i();
        q(null);
        if (refreshFocusEvents && focusTargetNodeI != null) {
            focusTargetNodeI.s3(getIsFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active, FocusStateImpl.Inactive);
            int iA = ni8.a(1024);
            if (!focusTargetNodeI.getNode().getIsAttached()) {
                zw5.c("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.b.c parent = focusTargetNodeI.getNode().getParent();
            LayoutNode layoutNodeQ = y23.q(focusTargetNodeI);
            while (layoutNodeQ != null) {
                if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iA) != 0) {
                            r58 r58Var = null;
                            androidx.compose.ui.b.c cVarJ = parent;
                            while (cVarJ != null) {
                                if (cVarJ instanceof FocusTargetNode) {
                                    ((FocusTargetNode) cVarJ).s3(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                    int i = 0;
                                    for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVarJ = delegate;
                                            } else {
                                                if (r58Var == null) {
                                                    r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                                }
                                                if (cVarJ != null) {
                                                    r58Var.c(cVarJ);
                                                    cVarJ = null;
                                                }
                                                r58Var.c(delegate);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVarJ = y23.j(r58Var);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeQ = layoutNodeQ.C0();
                parent = (layoutNodeQ == null || (nodes = layoutNodeQ.getNodes()) == null) ? null : nodes.getTail();
            }
        }
        return true;
    }

    private final FocusTargetNode E() {
        return i.b(this.rootFocusNode);
    }

    private final androidx.compose.ui.b.c G(x23 x23Var) {
        int iA = ni8.a(1024) | ni8.a(8192);
        if (!x23Var.getNode().getIsAttached()) {
            zw5.c("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.b.c node = x23Var.getNode();
        androidx.compose.ui.b.c cVar = null;
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            for (androidx.compose.ui.b.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    if ((ni8.a(1024) & child.getKindSet()) != 0) {
                        return cVar;
                    }
                    cVar = child;
                }
            }
        }
        return cVar;
    }

    private final boolean I(KeyEvent keyEvent) {
        long jA = si6.a(keyEvent);
        int iB = si6.b(keyEvent);
        ri6.Companion companion = ri6.INSTANCE;
        if (ri6.e(iB, companion.a())) {
            x48 x48Var = this.keysCurrentlyDown;
            if (x48Var == null) {
                x48Var = new x48(3);
                this.keysCurrentlyDown = x48Var;
            }
            x48Var.l(jA);
        } else if (ri6.e(iB, companion.b())) {
            x48 x48Var2 = this.keysCurrentlyDown;
            if (x48Var2 == null || !x48Var2.a(jA)) {
                return false;
            }
            x48 x48Var3 = this.keysCurrentlyDown;
            if (x48Var3 != null) {
                x48Var3.m(jA);
            }
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public dl4 A() {
        return this.rootFocusNode.v1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public void B() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        FocusTransactionsKt.c(this.rootFocusNode, true, true);
        if (!mq1.isOptimizedFocusEventDispatchEnabled || i() == null) {
            return;
        }
        FocusTargetNode focusTargetNodeI = i();
        q(null);
        if (focusTargetNodeI != null) {
            focusTargetNodeI.s3(FocusStateImpl.Active, FocusStateImpl.Inactive);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.ok4
    public void C(boolean force) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        n(force, true, true, androidx.compose.ui.focus.b.INSTANCE.c());
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public boolean H(final int focusDirection, gba previouslyFocusedRect) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        Boolean boolW = w(focusDirection, previouslyFocusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.n1(focusDirection));
            }
        });
        if (boolW != null) {
            return boolW.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: a, reason: from getter */
    public androidx.compose.ui.b getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean b(androidx.compose.ui.focus.b focusDirection, gba previouslyFocusedRect) {
        return this.platformFocusOwner.b(focusDirection, previouslyFocusedRect);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void c() {
        this.platformFocusOwner.c();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void d() {
        this.platformFocusOwner.d();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public gba e() {
        FocusTargetNode focusTargetNodeE = E();
        if (focusTargetNodeE != null) {
            return i.d(focusTargetNodeE);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void f(boolean z) {
        if (!((z && i() == null) ? false : true)) {
            zw5.a("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public e58<nk4> getListeners() {
        return this.listeners;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean h(android.view.KeyEvent r15) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.h(android.view.KeyEvent):boolean");
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTargetNode i() {
        FocusTargetNode focusTargetNode = this.activeFocusTargetNode;
        if (focusTargetNode == null || !focusTargetNode.getIsAttached()) {
            return null;
        }
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void j() {
        this.focusInvalidationManager.e();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void k(ik4 node) {
        this.focusInvalidationManager.g(node);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public void l() throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.l():void");
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getIsFocusCaptured() {
        return this.isFocusCaptured;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean n(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        boolean zD;
        if (force) {
            zD = D(force, refreshFocusEvents);
        } else {
            int i = a.$EnumSwitchMapping$0[FocusTransactionsKt.g(this.rootFocusNode, focusDirection).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                zD = false;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                zD = D(force, refreshFocusEvents);
            }
        }
        if (zD && clearOwnerFocus) {
            d();
        }
        return zD;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean o() throws KotlinNothingValueException {
        if (!this.rootFocusNode.getIsAttached()) {
            return false;
        }
        FocusTargetNode focusTargetNode = this.rootFocusNode;
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitSubtreeIf called on an unattached node");
        }
        r58 r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
        androidx.compose.ui.b.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            y23.c(r58Var, focusTargetNode.getNode(), false);
        } else {
            r58Var.c(child);
        }
        while (r58Var.getSize() != 0) {
            androidx.compose.ui.b.c cVar = (androidx.compose.ui.b.c) r58Var.u(r58Var.getSize() - 1);
            if ((cVar.getAggregateChildKindSet() & iA) != 0) {
                for (androidx.compose.ui.b.c child2 = cVar; child2 != null && child2.getIsAttached(); child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        androidx.compose.ui.b.c cVarJ = child2;
                        r58 r58Var2 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarJ;
                                if (focusTargetNode2.getIsAttached() && focusTargetNode2.t3().getCanFocus()) {
                                    return true;
                                }
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var2 == null) {
                                                r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var2.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var2.c(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVarJ = y23.j(r58Var2);
                        }
                    }
                }
            }
            y23.c(r58Var, cVar, false);
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean p(final int focusDirection) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (!n(false, true, false, focusDirection)) {
            return false;
        }
        Boolean boolW = w(focusDirection, null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$resetFocus$successfulReset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.n1(focusDirection));
            }
        });
        boolean zBooleanValue = boolW != null ? boolW.booleanValue() : false;
        if (!zBooleanValue) {
            d();
        }
        return zBooleanValue;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void q(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            f(false);
        }
        e58<nk4> listeners = getListeners();
        Object[] objArr = listeners.content;
        int i = listeners._size;
        for (int i2 = 0; i2 < i; i2++) {
            ((nk4) objArr[i2]).w(focusTargetNode2, focusTargetNode);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean r(com.google.inputmethod.ev5 r15) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.r(com.google.android.ev5):boolean");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean s(final int focusDirection, boolean wrapAroundForOneDimensionalFocus) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        FocusTargetNode focusTargetNodeI;
        if ((mq1.isViewFocusFixEnabled || (mq1.isBypassUnfocusableComposeViewEnabled && (focusTargetNodeI = i()) != null && focusTargetNodeI.getIsInteropViewHost())) && this.platformFocusOwner.y(focusDirection)) {
            return true;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Boolean.FALSE;
        FocusTargetNode focusTargetNodeI2 = i();
        Boolean boolW = w(focusDirection, this.platformFocusOwner.getEmbeddedViewFocusRect(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = Boolean.valueOf(focusTargetNode.n1(focusDirection));
                return (Boolean) objectRef.element;
            }
        });
        if (Intrinsics.e(boolW, Boolean.TRUE) && focusTargetNodeI2 != i()) {
            return true;
        }
        if (boolW != null && objectRef.element != null) {
            if (boolW.booleanValue() && ((Boolean) objectRef.element).booleanValue()) {
                return true;
            }
            if (e.a(focusDirection) && wrapAroundForOneDimensionalFocus) {
                return n(false, true, false, focusDirection) && H(focusDirection, null);
            }
            if (!mq1.isViewFocusFixEnabled && !mq1.isBypassUnfocusableComposeViewEnabled) {
                return this.platformFocusOwner.y(focusDirection);
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.b$c] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.b$c] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean u(com.google.inputmethod.RotaryScrollEvent r17, kotlin.jvm.functions.Function0<java.lang.Boolean> r18) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.u(com.google.android.bqa, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // com.google.inputmethod.ok4
    public boolean v(int focusDirection) {
        return s(focusDirection, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public Boolean w(int focusDirection, gba focusedRect, final Function1<? super FocusTargetNode, Boolean> onFound) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        final FocusTargetNode focusTargetNodeE = E();
        r58 r58Var = null;
        if (focusTargetNodeE != null) {
            f fVarA = i.a(focusTargetNodeE, focusDirection, this.owner.getLayoutDirection());
            f.Companion companion = f.INSTANCE;
            if (Intrinsics.e(fVarA, companion.a())) {
                return null;
            }
            if (Intrinsics.e(fVarA, companion.c())) {
                FocusTargetNode focusTargetNodeE2 = E();
                if (focusTargetNodeE2 != null) {
                    return (Boolean) onFound.invoke(focusTargetNodeE2);
                }
                return null;
            }
            if (!Intrinsics.e(fVarA, companion.b())) {
                if (fVarA == companion.b()) {
                    throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                if (fVarA == companion.a()) {
                    throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                boolean z = false;
                if (fVarA.f().getSize() == 0) {
                    System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                } else {
                    r58<al4> r58VarF = fVarA.f();
                    al4[] al4VarArr = r58VarF.content;
                    int size = r58VarF.getSize();
                    int i = 0;
                    boolean z2 = false;
                    while (i < size) {
                        al4 al4Var = al4VarArr[i];
                        int iA = ni8.a(1024);
                        if (!al4Var.getNode().getIsAttached()) {
                            zw5.c("visitChildren called on an unattached node");
                        }
                        r58 r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
                        androidx.compose.ui.b.c child = al4Var.getNode().getChild();
                        if (child == null) {
                            y23.c(r58Var2, al4Var.getNode(), false);
                        } else {
                            r58Var2.c(child);
                        }
                        while (r58Var2.getSize() != 0) {
                            androidx.compose.ui.b.c cVarJ = (androidx.compose.ui.b.c) r58Var2.u(r58Var2.getSize() - 1);
                            if ((cVarJ.getAggregateChildKindSet() & iA) == 0) {
                                y23.c(r58Var2, cVarJ, false);
                            } else {
                                while (cVarJ != null) {
                                    if ((cVarJ.getKindSet() & iA) != 0) {
                                        r58 r58Var3 = r58Var;
                                        while (cVarJ != null) {
                                            if (cVarJ instanceof FocusTargetNode) {
                                                if (((Boolean) onFound.invoke((FocusTargetNode) cVarJ)).booleanValue()) {
                                                    z2 = true;
                                                    break;
                                                }
                                            } else {
                                                if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                                    int i2 = 0;
                                                    for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                                        if ((delegate.getKindSet() & iA) != 0) {
                                                            i2++;
                                                            if (i2 == 1) {
                                                                cVarJ = delegate;
                                                            } else {
                                                                if (r58Var3 == null) {
                                                                    r58Var3 = new r58(new androidx.compose.ui.b.c[16], 0);
                                                                }
                                                                if (cVarJ != null) {
                                                                    r58Var3.c(cVarJ);
                                                                    cVarJ = null;
                                                                }
                                                                r58Var3.c(delegate);
                                                            }
                                                        }
                                                    }
                                                    if (i2 == 1) {
                                                    }
                                                }
                                                r58Var = null;
                                            }
                                            cVarJ = y23.j(r58Var3);
                                            r58Var = null;
                                        }
                                        break;
                                    }
                                    cVarJ = cVarJ.getChild();
                                    r58Var = null;
                                }
                            }
                        }
                        i++;
                        r58Var = null;
                    }
                    z = z2;
                }
                return Boolean.valueOf(z);
            }
        } else {
            focusTargetNodeE = null;
        }
        return i.e(this.rootFocusNode, focusDirection, this.owner.getLayoutDirection(), focusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (Intrinsics.e(focusTargetNode, focusTargetNodeE)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.e(focusTargetNode, this.getRootFocusNode())) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) onFound.invoke(focusTargetNode)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void x(FocusTargetNode node) {
        this.focusInvalidationManager.f(node);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0186 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x018b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0104 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0113 A[ADDED_TO_REGION, LOOP:15: B:73:0x0113->B:101:0x0169, LOOP_START, PHI: r10
  0x0113: PHI (r10v9 androidx.compose.ui.b$c) = (r10v4 androidx.compose.ui.b$c), (r10v10 androidx.compose.ui.b$c) binds: [B:72:0x0111, B:101:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0115 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0120 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0126 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0038, B:114:0x018e, B:116:0x019c, B:117:0x019f, B:119:0x01ae, B:122:0x01bf, B:126:0x01ca, B:129:0x01d0, B:130:0x01d5, B:133:0x01dd, B:135:0x01e4, B:137:0x01e8, B:139:0x01f2, B:141:0x01f9, B:143:0x01fd, B:145:0x0203, B:147:0x020c, B:148:0x0210, B:149:0x0213, B:152:0x021b, B:153:0x0220, B:154:0x0225, B:156:0x022b, B:158:0x0231, B:161:0x023c, B:163:0x0244, B:170:0x025b, B:171:0x025d, B:173:0x0264, B:175:0x0268, B:198:0x02b2, B:179:0x0274, B:181:0x027b, B:183:0x027f, B:185:0x0289, B:187:0x0290, B:189:0x0294, B:191:0x029a, B:193:0x02a3, B:194:0x02a7, B:195:0x02aa, B:199:0x02b7, B:203:0x02c7, B:205:0x02ce, B:207:0x02d2, B:230:0x031c, B:211:0x02de, B:213:0x02e5, B:215:0x02e9, B:217:0x02f3, B:219:0x02fa, B:221:0x02fe, B:223:0x0304, B:225:0x030d, B:226:0x0311, B:227:0x0314, B:232:0x0323, B:234:0x032a, B:239:0x033d, B:240:0x033f, B:20:0x0040, B:22:0x004e, B:23:0x0051, B:25:0x005b, B:28:0x006c, B:32:0x0077, B:63:0x00d9, B:65:0x00dd, B:35:0x007d, B:37:0x0084, B:39:0x0088, B:41:0x0092, B:43:0x0099, B:45:0x009d, B:47:0x00a3, B:49:0x00ac, B:50:0x00b0, B:51:0x00b3, B:54:0x00bb, B:55:0x00c0, B:56:0x00c5, B:58:0x00cb, B:60:0x00d1, B:66:0x00e3, B:68:0x00f3, B:69:0x00f6, B:71:0x0104, B:74:0x0115, B:78:0x0120, B:109:0x0182, B:111:0x0186, B:81:0x0126, B:83:0x012d, B:85:0x0131, B:87:0x013b, B:89:0x0142, B:91:0x0146, B:93:0x014c, B:95:0x0155, B:96:0x0159, B:97:0x015c, B:100:0x0164, B:101:0x0169, B:102:0x016e, B:104:0x0174, B:106:0x017a), top: B:245:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean y(android.view.KeyEvent r17, kotlin.jvm.functions.Function0<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.y(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean z() throws KotlinNothingValueException {
        if (!this.rootFocusNode.getIsAttached()) {
            return false;
        }
        FocusTargetNode focusTargetNode = this.rootFocusNode;
        int iA = ni8.a(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            zw5.c("visitSubtreeIf called on an unattached node");
        }
        r58 r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
        androidx.compose.ui.b.c child = focusTargetNode.getNode().getChild();
        if (child == null) {
            y23.c(r58Var, focusTargetNode.getNode(), false);
        } else {
            r58Var.c(child);
        }
        while (r58Var.getSize() != 0) {
            androidx.compose.ui.b.c cVar = (androidx.compose.ui.b.c) r58Var.u(r58Var.getSize() - 1);
            if ((cVar.getAggregateChildKindSet() & iA) != 0) {
                for (androidx.compose.ui.b.c child2 = cVar; child2 != null && child2.getIsAttached(); child2 = child2.getChild()) {
                    if ((child2.getKindSet() & iA) != 0) {
                        androidx.compose.ui.b.c cVarJ = child2;
                        r58 r58Var2 = null;
                        while (cVarJ != null) {
                            if (cVarJ instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVarJ;
                                if (focusTargetNode2.getIsAttached()) {
                                    FocusProperties focusPropertiesT3 = focusTargetNode2.t3();
                                    if (focusTargetNode2.getIsAttached() && !focusTargetNode2.getIsInteropViewHost() && focusPropertiesT3.getCanFocus()) {
                                        return true;
                                    }
                                }
                            } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                int i = 0;
                                for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i++;
                                        if (i == 1) {
                                            cVarJ = delegate;
                                        } else {
                                            if (r58Var2 == null) {
                                                r58Var2 = new r58(new androidx.compose.ui.b.c[16], 0);
                                            }
                                            if (cVarJ != null) {
                                                r58Var2.c(cVarJ);
                                                cVarJ = null;
                                            }
                                            r58Var2.c(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            cVarJ = y23.j(r58Var2);
                        }
                    }
                }
            }
            y23.c(r58Var, cVar, false);
        }
        return false;
    }
}
