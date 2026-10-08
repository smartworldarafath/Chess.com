package androidx.compose.ui.node;

import android.os.Trace;
import com.google.inputmethod.go6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.lq1;
import com.google.inputmethod.lr8;
import com.google.inputmethod.r58;
import com.google.inputmethod.w43;
import com.google.inputmethod.wc;
import com.google.inputmethod.zw5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u0014J\u001f\u0010#\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b#\u0010\u0014J\u001f\u0010$\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b$\u0010\u0014J\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\t¢\u0006\u0004\b%\u0010\u0014J\u0015\u0010&\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0005J\u001f\u0010)\u001a\u00020\t2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010\u0011J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b2\u0010\u001aJ\u0017\u00104\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b6\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\"\u0010B\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u00105R\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010>R\u0014\u0010G\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020.0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010IR$\u0010P\u001a\u00020K2\u0006\u0010L\u001a\u00020K8F@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010$\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0018\u0010T\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010VR\u0018\u0010Z\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0018\u0010\\\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0018\u0010^\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0018\u0010`\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b_\u0010YR\u0018\u0010b\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010YR\u0018\u0010d\u001a\u00020\t*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010YR\u0011\u0010f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\be\u0010@R\u0011\u0010h\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bg\u0010@R$\u0010j\u001a\u0004\u0018\u00010i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006p"}, d2 = {"Landroidx/compose/ui/node/j;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "layoutNode", "Lcom/google/android/kx1;", "constraints", "", "h", "(Landroidx/compose/ui/node/LayoutNode;Lcom/google/android/kx1;)Z", "i", "", "H", "k", "e", "()V", "affectsLookahead", "E", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "shouldTraceMeasure", "F", "(Landroidx/compose/ui/node/LayoutNode;ZZ)Z", "j", "I", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "node", "C", "m", "A", "Q", "(J)V", "forced", "K", "N", "J", "M", "L", "Lkotlin/Function0;", "onLayout", "x", "(Lkotlin/jvm/functions/Function0;)Z", "z", "y", "(Landroidx/compose/ui/node/LayoutNode;J)V", "Landroidx/compose/ui/node/m$b;", "listener", "D", "(Landroidx/compose/ui/node/m$b;)V", "l", "forceDispatch", "f", "(Z)V", "B", "a", "Landroidx/compose/ui/node/LayoutNode;", "Lcom/google/android/w43;", "b", "Lcom/google/android/w43;", "relayoutNodes", "c", "Z", "p", "()Z", "setDuringMeasureLayout$ui", "duringMeasureLayout", "d", "duringFullMeasureLayoutPass", "Lcom/google/android/lr8;", "Lcom/google/android/lr8;", "onPositionedDispatcher", "Lcom/google/android/r58;", "Lcom/google/android/r58;", "onLayoutCompletedListeners", "", "value", "g", "t", "()J", "measureIteration", "Landroidx/compose/ui/node/j$a;", "postponedMeasureRequests", "Lcom/google/android/kx1;", "rootConstraints", "Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/node/g;", "consistencyChecker", "w", "(Landroidx/compose/ui/node/LayoutNode;)Z", "isUsedInMeasureOrLayout", "v", "remeasureCanAffectParentSize", "u", "measuredByPlacedParent", "o", "canAffectPlacedParent", "n", "canAffectParentInLookahead", "s", "lookaheadRemeasureCanAffectParentSize", "q", "hasPendingMeasureOrLayout", "r", "hasPendingOnPositionedCallbacks", "Landroidx/compose/ui/node/o$a;", "uncaughtExceptionHandler", "Landroidx/compose/ui/node/o$a;", "getUncaughtExceptionHandler$ui", "()Landroidx/compose/ui/node/o$a;", "P", "(Landroidx/compose/ui/node/o$a;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LayoutNode root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final w43 relayoutNodes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean duringMeasureLayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean duringFullMeasureLayoutPass;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final lr8 onPositionedDispatcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final r58<m.b> onLayoutCompletedListeners;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long measureIteration;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final r58<a> postponedMeasureRequests;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private kx1 rootConstraints;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final g consistencyChecker;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/j$a;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isLookahead", "isForced", "<init>", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "a", "Landroidx/compose/ui/node/LayoutNode;", "()Landroidx/compose/ui/node/LayoutNode;", "b", "Z", "c", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LayoutNode node;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isLookahead;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isForced;

        public a(LayoutNode layoutNode, boolean z, boolean z2) {
            this.node = layoutNode;
            this.isLookahead = z;
            this.isForced = z2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LayoutNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsForced() {
            return this.isForced;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsLookahead() {
            return this.isLookahead;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(LayoutNode layoutNode) {
        this.root = layoutNode;
        m.Companion companion = m.INSTANCE;
        w43 w43Var = new w43(companion.a());
        this.relayoutNodes = w43Var;
        this.onPositionedDispatcher = new lr8();
        this.onLayoutCompletedListeners = new r58<>(new m.b[16], 0);
        this.measureIteration = 1L;
        r58<a> r58Var = new r58<>(new a[16], 0);
        this.postponedMeasureRequests = r58Var;
        this.consistencyChecker = companion.a() ? new g(layoutNode, w43Var, r58Var.i()) : null;
    }

    private final boolean A(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.k0() : layoutNode.p0();
    }

    private final void C(LayoutNode node, boolean affectsLookahead) {
        if (A(node, affectsLookahead)) {
            G(this, node, affectsLookahead, false, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(LayoutNode layoutNode, boolean affectsLookahead) {
        kx1 kx1Var;
        boolean zI;
        LayoutNode layoutNodeC0;
        boolean zH;
        boolean z = false;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (w(layoutNode)) {
            if (layoutNode == this.root) {
                kx1Var = this.rootConstraints;
                Intrinsics.g(kx1Var);
            } else {
                kx1Var = null;
            }
            if (affectsLookahead) {
                if (layoutNode.k0()) {
                    if (lq1.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadMeasure");
                        try {
                            zH = h(layoutNode, kx1Var);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zH = h(layoutNode, kx1Var);
                    }
                    z = zH;
                }
                if ((z || layoutNode.j0()) && Intrinsics.e(layoutNode.Z0(), Boolean.TRUE)) {
                    if (lq1.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadLayout");
                        try {
                            layoutNode.d1();
                            Unit unit = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        layoutNode.d1();
                    }
                }
            } else {
                if (!layoutNode.p0()) {
                    zI = false;
                } else if (lq1.isVerboseTracingEnabled) {
                    Trace.beginSection("Compose:measure");
                    try {
                        zI = i(layoutNode, kx1Var);
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } else {
                    zI = i(layoutNode, kx1Var);
                }
                if (layoutNode.h0() && (layoutNode == this.root || ((layoutNodeC0 = layoutNode.C0()) != null && layoutNodeC0.x() && layoutNode.Y0()))) {
                    if (lq1.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:layout");
                        try {
                            if (layoutNode == this.root) {
                                layoutNode.v1(0, 0);
                            } else {
                                layoutNode.B1();
                            }
                            Unit unit2 = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    } else if (layoutNode == this.root) {
                        layoutNode.v1(0, 0);
                    } else {
                        layoutNode.B1();
                    }
                    this.onPositionedDispatcher.d(layoutNode);
                    g gVar = this.consistencyChecker;
                    if (gVar != null) {
                        gVar.a();
                    }
                }
                z = zI;
            }
            j();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F(LayoutNode layoutNode, boolean affectsLookahead, boolean shouldTraceMeasure) {
        kx1 kx1Var;
        boolean zI;
        boolean z = false;
        if (layoutNode.getIsDeactivated()) {
            return false;
        }
        if (w(layoutNode)) {
            if (layoutNode == this.root) {
                kx1Var = this.rootConstraints;
                Intrinsics.g(kx1Var);
            } else {
                kx1Var = null;
            }
            if (affectsLookahead) {
                if (layoutNode.k0()) {
                    if (lq1.isVerboseTracingEnabled && shouldTraceMeasure) {
                        Trace.beginSection("Compose:lookaheadMeasure");
                        try {
                            zI = h(layoutNode, kx1Var);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zI = h(layoutNode, kx1Var);
                    }
                    z = zI;
                }
            } else if (layoutNode.p0()) {
                if (lq1.isVerboseTracingEnabled && shouldTraceMeasure) {
                    Trace.beginSection("Compose:measure");
                    try {
                        zI = i(layoutNode, kx1Var);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } else {
                    zI = i(layoutNode, kx1Var);
                }
                z = zI;
            }
            j();
        }
        return z;
    }

    static /* synthetic */ boolean G(j jVar, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return jVar.F(layoutNode, z, z2);
    }

    private final void H(LayoutNode layoutNode) {
        r58<LayoutNode> r58VarL0 = layoutNode.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (v(layoutNode2)) {
                if (go6.a(layoutNode2)) {
                    I(layoutNode2, true);
                } else {
                    H(layoutNode2);
                }
            }
        }
    }

    private final void I(LayoutNode layoutNode, boolean affectsLookahead) {
        kx1 kx1Var;
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (layoutNode == this.root) {
            kx1Var = this.rootConstraints;
            Intrinsics.g(kx1Var);
        } else {
            kx1Var = null;
        }
        if (affectsLookahead) {
            h(layoutNode, kx1Var);
        } else {
            i(layoutNode, kx1Var);
        }
    }

    public static /* synthetic */ boolean O(j jVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jVar.N(layoutNode, z);
    }

    private final void e() {
        r58<m.b> r58Var = this.onLayoutCompletedListeners;
        m.b[] bVarArr = r58Var.content;
        int size = r58Var.getSize();
        for (int i = 0; i < size; i++) {
            bVarArr[i].q();
        }
        this.onLayoutCompletedListeners.j();
    }

    public static /* synthetic */ void g(j jVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        jVar.f(z);
    }

    private final boolean h(LayoutNode layoutNode, kx1 constraints) {
        if (layoutNode.getLookaheadRoot() == null) {
            return false;
        }
        boolean zB1 = constraints != null ? layoutNode.b1(constraints) : LayoutNode.c1(layoutNode, null, 1, null);
        LayoutNode layoutNodeC0 = layoutNode.C0();
        if (zB1 && layoutNodeC0 != null) {
            if (layoutNodeC0.getLookaheadRoot() == null) {
                LayoutNode.K1(layoutNodeC0, false, false, false, 3, null);
                return zB1;
            }
            if (layoutNode.s0() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.G1(layoutNodeC0, false, false, false, 3, null);
                return zB1;
            }
            if (layoutNode.s0() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.E1(layoutNodeC0, false, 1, null);
            }
        }
        return zB1;
    }

    private final boolean i(LayoutNode layoutNode, kx1 constraints) {
        boolean zX1 = constraints != null ? layoutNode.x1(constraints) : LayoutNode.y1(layoutNode, null, 1, null);
        LayoutNode layoutNodeC0 = layoutNode.C0();
        if (zX1 && layoutNodeC0 != null) {
            if (layoutNode.r0() == LayoutNode.UsageByParent.InMeasureBlock) {
                LayoutNode.K1(layoutNodeC0, false, false, false, 3, null);
                return zX1;
            }
            if (layoutNode.r0() == LayoutNode.UsageByParent.InLayoutBlock) {
                LayoutNode.I1(layoutNodeC0, false, 1, null);
            }
        }
        return zX1;
    }

    private final void j() {
        if (this.postponedMeasureRequests.getSize() != 0) {
            r58<a> r58Var = this.postponedMeasureRequests;
            a[] aVarArr = r58Var.content;
            int size = r58Var.getSize();
            for (int i = 0; i < size; i++) {
                a aVar = aVarArr[i];
                if (aVar.getNode().b()) {
                    if (aVar.getIsLookahead()) {
                        LayoutNode.G1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                    } else {
                        LayoutNode.K1(aVar.getNode(), aVar.getIsForced(), false, false, 2, null);
                    }
                }
            }
            this.postponedMeasureRequests.j();
        }
    }

    private final void k(LayoutNode layoutNode) {
        r58<LayoutNode> r58VarL0 = layoutNode.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (Intrinsics.e(layoutNode2.Z0(), Boolean.TRUE) && !layoutNode2.getIsDeactivated()) {
                if (this.relayoutNodes.f(layoutNode2, true)) {
                    layoutNode2.d1();
                }
                k(layoutNode2);
            }
        }
    }

    private final void m(LayoutNode layoutNode, boolean affectsLookahead) {
        r58<LayoutNode> r58VarL0 = layoutNode.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if ((!affectsLookahead && v(layoutNode2)) || (affectsLookahead && s(layoutNode2))) {
                if (go6.a(layoutNode2) && !affectsLookahead) {
                    if (layoutNode2.k0() && this.relayoutNodes.f(layoutNode2, true)) {
                        G(this, layoutNode2, true, false, 4, null);
                    } else {
                        l(layoutNode2, true);
                    }
                }
                C(layoutNode2, affectsLookahead);
                if (!A(layoutNode2, affectsLookahead)) {
                    m(layoutNode2, affectsLookahead);
                }
            }
        }
        C(layoutNode, affectsLookahead);
    }

    private final boolean n(LayoutNode layoutNode) {
        wc wcVarO;
        AlignmentLines alignmentLinesJ;
        if (layoutNode.k0()) {
            return (layoutNode.s0() == LayoutNode.UsageByParent.NotUsed && ((wcVarO = layoutNode.getLayoutDelegate().o()) == null || (alignmentLinesJ = wcVarO.getAlignmentLines()) == null || !alignmentLinesJ.k())) ? false : true;
        }
        return false;
    }

    private final boolean o(LayoutNode layoutNode) {
        return layoutNode.p0() && u(layoutNode);
    }

    private final boolean s(LayoutNode layoutNode) {
        wc wcVarO;
        AlignmentLines alignmentLinesJ;
        return layoutNode.s0() == LayoutNode.UsageByParent.InMeasureBlock || !((wcVarO = layoutNode.getLayoutDelegate().o()) == null || (alignmentLinesJ = wcVarO.getAlignmentLines()) == null || !alignmentLinesJ.k());
    }

    private final boolean u(LayoutNode layoutNode) {
        do {
            if (layoutNode.r0() == LayoutNode.UsageByParent.NotUsed && !layoutNode.getLayoutDelegate().b().getAlignmentLines().k()) {
                LayoutNode layoutNodeC0 = layoutNode.C0();
                if ((layoutNodeC0 != null ? layoutNodeC0.i0() : null) != LayoutNode.LayoutState.Measuring) {
                    return false;
                }
            }
            layoutNode = layoutNode.C0();
            if (layoutNode == null) {
                return false;
            }
        } while (!layoutNode.x());
        return true;
    }

    private final boolean v(LayoutNode layoutNode) {
        return layoutNode.r0() == LayoutNode.UsageByParent.InMeasureBlock || layoutNode.getLayoutDelegate().b().getAlignmentLines().k();
    }

    private final boolean w(LayoutNode layoutNode) {
        return layoutNode.x() || layoutNode.Y0() || o(layoutNode) || Intrinsics.e(layoutNode.Z0(), Boolean.TRUE) || n(layoutNode) || layoutNode.M();
    }

    public final void B(LayoutNode node) {
        this.relayoutNodes.j(node);
        this.onPositionedDispatcher.f(node);
    }

    public final void D(m.b listener) {
        this.onLayoutCompletedListeners.c(listener);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean J(LayoutNode layoutNode, boolean forced) throws NoWhenBranchMatchedException {
        int i = b.$EnumSwitchMapping$0[layoutNode.i0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((layoutNode.k0() || layoutNode.j0()) && !forced) {
                g gVar = this.consistencyChecker;
                if (gVar != null) {
                    gVar.a();
                }
                return false;
            }
            layoutNode.f1();
            layoutNode.e1();
            if (layoutNode.getIsDeactivated()) {
                return false;
            }
            LayoutNode layoutNodeC0 = layoutNode.C0();
            if (Intrinsics.e(layoutNode.Z0(), Boolean.TRUE) && ((layoutNodeC0 == null || !layoutNodeC0.k0()) && (layoutNodeC0 == null || !layoutNodeC0.j0()))) {
                this.relayoutNodes.d(layoutNode, Invalidation.LookaheadPlacement);
            } else if (layoutNode.x() && ((layoutNodeC0 == null || !layoutNodeC0.h0()) && (layoutNodeC0 == null || !layoutNodeC0.p0()))) {
                this.relayoutNodes.d(layoutNode, Invalidation.Placement);
            }
            return !this.duringFullMeasureLayoutPass;
        }
        g gVar2 = this.consistencyChecker;
        if (gVar2 != null) {
            gVar2.a();
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean K(LayoutNode layoutNode, boolean forced) throws NoWhenBranchMatchedException {
        LayoutNode layoutNodeC0;
        LayoutNode layoutNodeC1;
        if (!(layoutNode.getLookaheadRoot() != null)) {
            zw5.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = b.$EnumSwitchMapping$0[layoutNode.i0().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.k0() && !forced) {
                    return false;
                }
                layoutNode.g1();
                layoutNode.h1();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if ((Intrinsics.e(layoutNode.Z0(), Boolean.TRUE) || n(layoutNode)) && ((layoutNodeC0 = layoutNode.C0()) == null || !layoutNodeC0.k0())) {
                    this.relayoutNodes.d(layoutNode, Invalidation.LookaheadMeasurement);
                } else if ((layoutNode.x() || o(layoutNode)) && ((layoutNodeC1 = layoutNode.C0()) == null || !layoutNodeC1.p0())) {
                    this.relayoutNodes.d(layoutNode, Invalidation.Measurement);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.c(new a(layoutNode, true, forced));
            g gVar = this.consistencyChecker;
            if (gVar != null) {
                gVar.a();
            }
        }
        return false;
    }

    public final void L(LayoutNode layoutNode) {
        this.onPositionedDispatcher.d(layoutNode);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean M(LayoutNode layoutNode, boolean forced) throws NoWhenBranchMatchedException {
        int i = b.$EnumSwitchMapping$0[layoutNode.i0().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            g gVar = this.consistencyChecker;
            if (gVar != null) {
                gVar.a();
            }
            return false;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        LayoutNode layoutNodeC0 = layoutNode.C0();
        boolean z = layoutNodeC0 == null || layoutNodeC0.x();
        if (!forced && (layoutNode.p0() || (layoutNode.h0() && layoutNode.x() == z && layoutNode.x() == layoutNode.Y0()))) {
            g gVar2 = this.consistencyChecker;
            if (gVar2 != null) {
                gVar2.a();
            }
            return false;
        }
        layoutNode.e1();
        if (!layoutNode.getIsDeactivated() && layoutNode.Y0() && z) {
            if ((layoutNodeC0 == null || !layoutNodeC0.h0()) && (layoutNodeC0 == null || !layoutNodeC0.p0())) {
                this.relayoutNodes.d(layoutNode, Invalidation.Placement);
            }
            if (!this.duringFullMeasureLayoutPass) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean N(LayoutNode layoutNode, boolean forced) throws NoWhenBranchMatchedException {
        int i = b.$EnumSwitchMapping$0[layoutNode.i0().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutNode.p0() && !forced) {
                    return false;
                }
                layoutNode.h1();
                if (layoutNode.getIsDeactivated()) {
                    return false;
                }
                if (!layoutNode.x() && !o(layoutNode)) {
                    return false;
                }
                LayoutNode layoutNodeC0 = layoutNode.C0();
                if (layoutNodeC0 == null || !layoutNodeC0.p0()) {
                    this.relayoutNodes.d(layoutNode, Invalidation.Measurement);
                }
                return !this.duringFullMeasureLayoutPass;
            }
            this.postponedMeasureRequests.c(new a(layoutNode, false, forced));
            g gVar = this.consistencyChecker;
            if (gVar != null) {
                gVar.a();
            }
        }
        return false;
    }

    public final void P(o.a aVar) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void Q(long constraints) throws NoWhenBranchMatchedException {
        kx1 kx1Var = this.rootConstraints;
        if (kx1Var == null ? false : kx1.f(kx1Var.getValue(), constraints)) {
            return;
        }
        if (this.duringMeasureLayout) {
            zw5.a("updateRootConstraints called while measuring");
        }
        this.rootConstraints = kx1.a(constraints);
        if (this.root.getLookaheadRoot() != null) {
            this.root.g1();
        }
        this.root.h1();
        w43 w43Var = this.relayoutNodes;
        LayoutNode layoutNode = this.root;
        w43Var.d(layoutNode, layoutNode.getLookaheadRoot() != null ? Invalidation.LookaheadMeasurement : Invalidation.Measurement);
    }

    public final void f(boolean forceDispatch) {
        if (forceDispatch) {
            this.onPositionedDispatcher.e(this.root);
        }
        if (this.onPositionedDispatcher.c()) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                this.onPositionedDispatcher.a();
                Unit unit = Unit.a;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void l(LayoutNode layoutNode, boolean affectsLookahead) {
        if (!this.duringMeasureLayout) {
            zw5.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (A(layoutNode, affectsLookahead)) {
            zw5.a("node not yet measured");
        }
        m(layoutNode, affectsLookahead);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getDuringMeasureLayout() {
        return this.duringMeasureLayout;
    }

    public final boolean q() {
        return this.relayoutNodes.i();
    }

    public final boolean r() {
        return this.onPositionedDispatcher.c();
    }

    public final long t() {
        if (!this.duringMeasureLayout) {
            zw5.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean x(Function0<Unit> onLayout) {
        boolean z;
        LayoutNode layoutNodeD;
        boolean z2;
        boolean z3;
        boolean zF;
        if (!this.root.b()) {
            zw5.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.x()) {
            zw5.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            zw5.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = true;
            try {
                if (this.relayoutNodes.i()) {
                    w43 w43Var = this.relayoutNodes;
                    z = false;
                    while (true) {
                        if (!w43Var.lookaheadAndAncestorMeasureSet.c()) {
                            layoutNodeD = w43Var.lookaheadAndAncestorMeasureSet.d();
                            z3 = layoutNodeD.getLookaheadRoot() != null;
                            z2 = false;
                        } else if (!w43Var.lookaheadAndAncestorPlaceSet.c()) {
                            layoutNodeD = w43Var.lookaheadAndAncestorPlaceSet.d();
                            z3 = layoutNodeD.getLookaheadRoot() != null;
                            z2 = true;
                        } else {
                            if (w43Var.approachSet.c()) {
                                break;
                            }
                            layoutNodeD = w43Var.approachSet.d();
                            z2 = true;
                            z3 = false;
                        }
                        if (z2) {
                            zF = E(layoutNodeD, z3);
                        } else {
                            zF = F(layoutNodeD, z3, true);
                            if (layoutNodeD.j0()) {
                                this.relayoutNodes.d(layoutNodeD, Invalidation.LookaheadPlacement);
                            }
                            if (layoutNodeD.h0()) {
                                this.relayoutNodes.d(layoutNodeD, Invalidation.Placement);
                            }
                        }
                        if (layoutNodeD == this.root && zF) {
                            z = true;
                        }
                    }
                    if (onLayout != null) {
                        onLayout.invoke();
                    }
                } else {
                    z = false;
                }
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                g gVar = this.consistencyChecker;
                if (gVar != null) {
                    gVar.a();
                }
                z4 = z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th2;
                }
            }
        }
        e();
        return z4;
    }

    public final void y(LayoutNode layoutNode, long constraints) {
        if (layoutNode.getIsDeactivated()) {
            return;
        }
        if (Intrinsics.e(layoutNode, this.root)) {
            zw5.a("measureAndLayout called on root");
        }
        if (!this.root.b()) {
            zw5.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.root.x()) {
            zw5.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.duringMeasureLayout) {
            zw5.a("performMeasureAndLayout called during measure layout");
        }
        if (this.rootConstraints != null) {
            this.duringMeasureLayout = true;
            this.duringFullMeasureLayoutPass = false;
            try {
                this.relayoutNodes.j(layoutNode);
                if (h(layoutNode, kx1.a(constraints)) || layoutNode.j0()) {
                    if (Intrinsics.e(layoutNode.Z0(), Boolean.TRUE)) {
                        layoutNode.d1();
                    }
                }
                k(layoutNode);
                i(layoutNode, kx1.a(constraints));
                if (layoutNode.h0() && layoutNode.x()) {
                    layoutNode.B1();
                    this.onPositionedDispatcher.d(layoutNode);
                }
                j();
                this.duringMeasureLayout = false;
                this.duringFullMeasureLayoutPass = false;
                g gVar = this.consistencyChecker;
                if (gVar != null) {
                    gVar.a();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    throw th2;
                }
            }
        }
        e();
    }

    public final void z() {
        if (this.relayoutNodes.i()) {
            if (!this.root.b()) {
                zw5.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.root.x()) {
                zw5.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.duringMeasureLayout) {
                zw5.a("performMeasureAndLayout called during measure layout");
            }
            if (this.rootConstraints != null) {
                this.duringMeasureLayout = true;
                this.duringFullMeasureLayoutPass = false;
                try {
                    if (lq1.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:lookaheadRemeasure");
                        try {
                            if (this.relayoutNodes.g()) {
                                if (this.root.getLookaheadRoot() != null) {
                                    I(this.root, true);
                                } else {
                                    H(this.root);
                                }
                            }
                            Unit unit = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else if (this.relayoutNodes.g()) {
                        if (this.root.getLookaheadRoot() != null) {
                            I(this.root, true);
                        } else {
                            H(this.root);
                        }
                    }
                    if (lq1.isVerboseTracingEnabled) {
                        Trace.beginSection("Compose:remeasure");
                        try {
                            I(this.root, false);
                            Unit unit2 = Unit.a;
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } else {
                        I(this.root, false);
                    }
                    this.duringMeasureLayout = false;
                    this.duringFullMeasureLayoutPass = false;
                    g gVar = this.consistencyChecker;
                    if (gVar != null) {
                        gVar.a();
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        this.duringMeasureLayout = false;
                        this.duringFullMeasureLayoutPass = false;
                        throw th4;
                    }
                }
            }
        }
    }
}
