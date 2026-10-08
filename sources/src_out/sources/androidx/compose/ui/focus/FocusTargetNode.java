package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.l;
import com.google.inputmethod.bs1;
import com.google.inputmethod.dl4;
import com.google.inputmethod.fn6;
import com.google.inputmethod.gba;
import com.google.inputmethod.hm0;
import com.google.inputmethod.ik4;
import com.google.inputmethod.k33;
import com.google.inputmethod.kba;
import com.google.inputmethod.ki8;
import com.google.inputmethod.kn6;
import com.google.inputmethod.mq1;
import com.google.inputmethod.ni8;
import com.google.inputmethod.on8;
import com.google.inputmethod.qy7;
import com.google.inputmethod.r16;
import com.google.inputmethod.r58;
import com.google.inputmethod.rn8;
import com.google.inputmethod.tk4;
import com.google.inputmethod.uy7;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001TBQ\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020$2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0000¢\u0006\u0004\b'\u0010\u0019J\u001f\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0000¢\u0006\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R(\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010-R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010-R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010>\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R*\u0010\b\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010O\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0013\u0010S\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Lcom/google/android/bs1;", "Lcom/google/android/fn6;", "Landroidx/compose/ui/focus/g;", "Lcom/google/android/on8;", "Lcom/google/android/qy7;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/focus/j;", "focusability", "", "isInteropViewHost", "Lkotlin/Function2;", "Lcom/google/android/dl4;", "", "onFocusChange", "Lkotlin/Function1;", "onDispatchEventsCompleted", "<init>", "(IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/focus/b;", "focusDirection", "r3", "(I)Z", "n1", "M1", "()V", "X2", "W2", "Lcom/google/android/kn6;", "coordinates", "w", "(Lcom/google/android/kn6;)V", "Landroidx/compose/ui/focus/FocusProperties;", "t3", "()Landroidx/compose/ui/focus/FocusProperties;", "relativeCoordinates", "Lcom/google/android/gba;", "u3", "(Lcom/google/android/kn6;)Lcom/google/android/gba;", "z3", "previousState", "newState", "s3", "(Lcom/google/android/dl4;Lcom/google/android/dl4;)V", "p", "Z", "A3", "()Z", "q", "Lkotlin/jvm/functions/Function2;", "r", "Lkotlin/jvm/functions/Function1;", "s", "isProcessingCustomExit", "t", "isProcessingCustomEnter", "Landroidx/compose/ui/focus/FocusStateImpl;", "u", "Landroidx/compose/ui/focus/FocusStateImpl;", "committedFocusState", "v", "Q2", "shouldAutoInvalidate", "value", "I", "y3", "()I", "setFocusability-josRg5g", "(I)V", "", "x", "Ljava/lang/Integer;", "getPreviouslyFocusedChildHash", "()Ljava/lang/Integer;", "B3", "(Ljava/lang/Integer;)V", "previouslyFocusedChildHash", "x3", "()Landroidx/compose/ui/focus/FocusStateImpl;", "focusState", "Lcom/google/android/hm0;", "w3", "()Lcom/google/android/hm0;", "beyondBoundsLayoutParent", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusTargetNode extends androidx.compose.ui.b.c implements bs1, fn6, g, on8, qy7 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final boolean isInteropViewHost;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final Function2<dl4, dl4, Unit> onFocusChange;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Function1<FocusTargetNode, Unit> onDispatchEventsCompleted;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean isProcessingCustomExit;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean isProcessingCustomEnter;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private FocusStateImpl committedFocusState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int focusability;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private Integer previouslyFocusedChildHash;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$a;", "Lcom/google/android/uy7;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "d", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends uy7<FocusTargetNode> {
        public static final a d = new a();

        private a() {
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode a() {
            return new FocusTargetNode(0, false, null, null, 15, null);
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(FocusTargetNode node) {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return 1739042953;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ FocusTargetNode(int i, boolean z, Function2 function2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, function2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean r3(int focusDirection) throws NoWhenBranchMatchedException {
        int i = b.$EnumSwitchMapping$0[FocusTransactionsKt.j(this, focusDirection).ordinal()];
        if (i == 1) {
            return FocusTransactionsKt.k(this);
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ gba v3(FocusTargetNode focusTargetNode, kn6 kn6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            kn6Var = null;
        }
        return focusTargetNode.u3(kn6Var);
    }

    /* JADX INFO: renamed from: A3, reason: from getter */
    public final boolean getIsInteropViewHost() {
        return this.isInteropViewHost;
    }

    public final void B3(Integer num) {
        this.previouslyFocusedChildHash = num;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.on8
    public void M1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        z3();
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.compose.ui.b.c
    public void W2() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        int i = b.$EnumSwitchMapping$1[v1().ordinal()];
        if (i == 1 || i == 2) {
            FocusOwner focusOwner = y23.r(this).getFocusOwner();
            focusOwner.n(true, true, false, androidx.compose.ui.focus.b.INSTANCE.c());
            if (this.isInteropViewHost) {
                focusOwner.b(null, null);
            }
            focusOwner.j();
        } else if (i == 3) {
            FocusOwner focusOwner2 = y23.r(this).getFocusOwner();
            FocusTargetNode focusTargetNodeB = i.b(this);
            if (focusTargetNodeB != null && focusTargetNodeB.isInteropViewHost) {
                focusOwner2.b(null, null);
                focusOwner2.j();
            }
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.committedFocusState = null;
        this.previouslyFocusedChildHash = null;
    }

    @Override // androidx.compose.ui.b.c
    public void X2() {
        if (v1().a()) {
            y23.r(this).getFocusOwner().n(true, true, true, androidx.compose.ui.focus.b.INSTANCE.c());
        }
    }

    @Override // androidx.compose.ui.focus.g
    public boolean n1(final int focusDirection) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return t3().getCanFocus() ? r3(focusDirection) : TwoDimensionalFocusSearchKt.k(this, focusDirection, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.valueOf(focusTargetNode.r3(focusDirection));
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    public final void s3(dl4 previousState, dl4 newState) throws KotlinNothingValueException {
        ki8 nodes;
        Function2<dl4, dl4, Unit> function2;
        FocusOwner focusOwner = y23.r(this).getFocusOwner();
        FocusTargetNode focusTargetNodeI = focusOwner.i();
        if (!Intrinsics.e(previousState, newState) && (function2 = this.onFocusChange) != null) {
            function2.invoke(previousState, newState);
        }
        int iA = ni8.a(4096);
        int iA2 = ni8.a(1024);
        androidx.compose.ui.b.c node = getNode();
        int i = iA | iA2;
        if (!getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.b.c node2 = getNode();
        LayoutNode layoutNodeQ = y23.q(this);
        loop0: while (layoutNodeQ != null) {
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            androidx.compose.ui.b.c cVarJ = node2;
                            r58 r58Var = null;
                            while (cVarJ != 0) {
                                if (cVarJ instanceof ik4) {
                                    ik4 ik4Var = (ik4) cVarJ;
                                    if (focusTargetNodeI == focusOwner.i()) {
                                        ik4Var.J(newState);
                                    }
                                } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                    androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate();
                                    int i2 = 0;
                                    cVarJ = cVarJ;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarJ = delegate;
                                            } else {
                                                if (r58Var == null) {
                                                    r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                                }
                                                if (cVarJ != 0) {
                                                    r58Var.c(cVarJ);
                                                    cVarJ = 0;
                                                }
                                                r58Var.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        cVarJ = cVarJ;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarJ = y23.j(r58Var);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeQ = layoutNodeQ.C0();
            node2 = (layoutNodeQ == null || (nodes = layoutNodeQ.getNodes()) == null) ? null : nodes.getTail();
        }
        Function1<FocusTargetNode, Unit> function1 = this.onDispatchEventsCompleted;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14 */
    public final FocusProperties t3() throws KotlinNothingValueException {
        ki8 nodes;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        focusPropertiesImpl.h(j.d(getFocusability(), this));
        int iA = ni8.a(2048);
        int iA2 = ni8.a(1024);
        androidx.compose.ui.b.c node = getNode();
        int i = iA | iA2;
        if (!getNode().getIsAttached()) {
            zw5.c("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.b.c node2 = getNode();
        LayoutNode layoutNodeQ = y23.q(this);
        while (layoutNodeQ != null) {
            if ((layoutNodeQ.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & iA2) != 0) {
                            return focusPropertiesImpl;
                        }
                        if ((node2.getKindSet() & iA) != 0) {
                            androidx.compose.ui.b.c cVarJ = node2;
                            r58 r58Var = null;
                            while (cVarJ != 0) {
                                if (cVarJ instanceof tk4) {
                                    ((tk4) cVarJ).m2(focusPropertiesImpl);
                                } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                                    androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate();
                                    int i2 = 0;
                                    cVarJ = cVarJ;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iA) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cVarJ = delegate;
                                            } else {
                                                if (r58Var == null) {
                                                    r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                                }
                                                if (cVarJ != 0) {
                                                    r58Var.c(cVarJ);
                                                    cVarJ = 0;
                                                }
                                                r58Var.c(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        cVarJ = cVarJ;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                cVarJ = y23.j(r58Var);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeQ = layoutNodeQ.C0();
            node2 = (layoutNodeQ == null || (nodes = layoutNodeQ.getNodes()) == null) ? null : nodes.getTail();
        }
        return focusPropertiesImpl;
    }

    public final gba u3(kn6 relativeCoordinates) {
        gba gbaVarR;
        gba gbaVarE = t3().getFocusRect();
        if (gbaVarE != FocusProperties.INSTANCE.a()) {
            return relativeCoordinates == null ? gbaVarE : gbaVarE.u(kn6.e0(relativeCoordinates, y23.o(this), 0L, false, 6, null));
        }
        return (relativeCoordinates == null || (gbaVarR = relativeCoordinates.R(y23.o(this), false)) == null) ? kba.c(rn8.INSTANCE.c(), r16.e(y23.o(this).a())) : gbaVarR;
    }

    @Override // com.google.inputmethod.fn6
    public void w(kn6 coordinates) {
        if (mq1.isInitialFocusOnFocusableAvailable) {
            y23.r(getNode()).getFocusOwner().c();
        }
    }

    public final hm0 w3() {
        return y23.f(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.focus.g
    /* JADX INFO: renamed from: x3, reason: merged with bridge method [inline-methods] */
    public FocusStateImpl v1() throws KotlinNothingValueException {
        FocusOwner focusOwner;
        FocusTargetNode focusTargetNodeI;
        ki8 nodes;
        if (getIsAttached() && (focusTargetNodeI = (focusOwner = y23.r(this).getFocusOwner()).i()) != null) {
            if (this == focusTargetNodeI) {
                return focusOwner.m() ? FocusStateImpl.Captured : FocusStateImpl.Active;
            }
            if (focusTargetNodeI.getIsAttached()) {
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
                                androidx.compose.ui.b.c cVarJ = parent;
                                r58 r58Var = null;
                                while (cVarJ != null) {
                                    if (cVarJ instanceof FocusTargetNode) {
                                        if (this == ((FocusTargetNode) cVarJ)) {
                                            return FocusStateImpl.ActiveParent;
                                        }
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
            return FocusStateImpl.Inactive;
        }
        return FocusStateImpl.Inactive;
    }

    /* JADX INFO: renamed from: y3, reason: from getter */
    public int getFocusability() {
        return this.focusability;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void z3() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        FocusProperties focusProperties;
        int i = b.$EnumSwitchMapping$1[v1().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        l.a(this, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m10invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m10invoke() {
                objectRef.element = this.t3();
            }
        });
        Object obj = objectRef.element;
        if (obj == null) {
            Intrinsics.x("focusProperties");
            focusProperties = null;
        } else {
            focusProperties = (FocusProperties) obj;
        }
        if (focusProperties.getCanFocus()) {
            return;
        }
        y23.r(this).getFocusOwner().C(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FocusTargetNode(int i, boolean z, Function2<? super dl4, ? super dl4, Unit> function2, Function1<? super FocusTargetNode, Unit> function1) {
        this.isInteropViewHost = z;
        this.onFocusChange = function2;
        this.onDispatchEventsCompleted = function1;
        this.focusability = i;
    }

    public /* synthetic */ FocusTargetNode(int i, boolean z, Function2 function2, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? j.INSTANCE.a() : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : function2, (i2 & 8) != 0 ? null : function1, null);
    }
}
