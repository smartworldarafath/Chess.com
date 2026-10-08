package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import com.google.inputmethod.MutableRect;
import com.google.inputmethod.ay3;
import com.google.inputmethod.bi7;
import com.google.inputmethod.dw8;
import com.google.inputmethod.e16;
import com.google.inputmethod.e58;
import com.google.inputmethod.g16;
import com.google.inputmethod.ja;
import com.google.inputmethod.lba;
import com.google.inputmethod.nea;
import com.google.inputmethod.ni8;
import com.google.inputmethod.oba;
import com.google.inputmethod.r1d;
import com.google.inputmethod.r58;
import com.google.inputmethod.rn8;
import com.google.inputmethod.x23;
import com.google.inputmethod.y23;
import com.google.inputmethod.zh7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u001b\u0010\u0012\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010#\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u001bJ\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u001bJ\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u001bJA\u00105\u001a\u0002042\u0006\u0010+\u001a\u00020 2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\t01¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b7\u0010\u000bJ%\u0010:\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u0014¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b<\u0010\u000bJ\u0015\u0010=\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b=\u0010\u0019J\u0015\u0010>\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b>\u0010\u000bJ\u0015\u0010?\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b?\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0017\u0010G\u001a\u00020C8\u0006¢\u0006\f\n\u0004\b&\u0010D\u001a\u0004\bE\u0010FR \u0010M\u001a\u00020H8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b=\u0010I\u0012\u0004\bL\u0010\u001b\u001a\u0004\bJ\u0010KR \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010PR\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010RR\u0016\u0010U\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010VR\u0016\u0010Y\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010ZR\u0014\u0010]\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\\¨\u0006^"}, d2 = {"Landroidx/compose/ui/spatial/RectManager;", "", "Lcom/google/android/e16;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "Lcom/google/android/ay3;", "executeDelayed", "<init>", "(Lcom/google/android/e16;Lcom/google/android/ay3;)V", "", "p", "(Landroidx/compose/ui/node/LayoutNode;)V", "layoutNode", "h", "g", "Landroidx/compose/ui/node/NodeCoordinator;", "Lcom/google/android/i58;", "rect", "b", "(Landroidx/compose/ui/node/NodeCoordinator;Lcom/google/android/i58;)V", "", "f", "(Landroidx/compose/ui/node/NodeCoordinator;)Z", "Lcom/google/android/g16;", "k", "(Landroidx/compose/ui/node/LayoutNode;)J", "i", "()V", "screenOffset", "windowOffset", "Lcom/google/android/zh7;", "viewToWindowMatrix", "", "windowWidth", "windowHeight", "u", "(JJ[FII)V", "q", "c", "ensureSomethingScheduled", "r", "(Z)V", "o", "id", "", "throttleMillis", "debounceMillis", "Lcom/google/android/x23;", "node", "Lkotlin/Function1;", "Lcom/google/android/nea;", "callback", "Lcom/google/android/x23$a;", "m", "(IJJLcom/google/android/x23;Lkotlin/jvm/functions/Function1;)Lcom/google/android/x23$a;", "j", "focusable", "gesturable", "t", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "l", "d", "n", "s", "a", "Lcom/google/android/e16;", "Lcom/google/android/ay3;", "Lcom/google/android/lba;", "Lcom/google/android/lba;", "e", "()Lcom/google/android/lba;", "rects", "Lcom/google/android/r1d;", "Lcom/google/android/r1d;", "getThrottledCallbacks$ui", "()Lcom/google/android/r1d;", "getThrottledCallbacks$ui$annotations", "throttledCallbacks", "Lcom/google/android/e58;", "Lkotlin/Function0;", "Lcom/google/android/e58;", "callbacks", "Z", "isDirty", "isScreenOrWindowDirty", "isFragmented", "Ljava/lang/Object;", "dispatchToken", "J", "scheduledDispatchDeadline", "Lkotlin/jvm/functions/Function0;", "dispatchLambda", "Lcom/google/android/i58;", "cachedRect", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RectManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final e16<LayoutNode> layoutNodes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ay3 executeDelayed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isDirty;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isScreenOrWindowDirty;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isFragmented;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Object dispatchToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final lba rects = new lba();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final r1d throttledCallbacks = new r1d();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final e58<Function0<Unit>> callbacks = new e58<>(0, 1, null);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long scheduledDispatchDeadline = -1;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Function0<Unit> dispatchLambda = new Function0<Unit>() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
        {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m63invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m63invoke() {
            this.this$0.dispatchToken = null;
            RectManager rectManager = this.this$0;
            Trace.beginSection("OnPositionedDispatch");
            try {
                rectManager.c();
                Unit unit = Unit.a;
            } finally {
                Trace.endSection();
            }
        }
    };

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final MutableRect cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);

    public RectManager(e16<LayoutNode> e16Var, ay3 ay3Var) {
        this.layoutNodes = e16Var;
        this.executeDelayed = ay3Var;
    }

    private final void b(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.x0() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                long jD = d(layoutNode);
                if (!g16.j(jD, g16.INSTANCE.a())) {
                    float fK = g16.k(jD);
                    mutableRect.m(rn8.e((((long) Float.floatToRawIntBits(g16.l(jD))) & 4294967295L) | (Float.floatToRawIntBits(fK) << 32)));
                    return;
                }
            }
            dw8 layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] fArrMo52getUnderlyingMatrixsQKQjiQ = layer.mo52getUnderlyingMatrixsQKQjiQ();
                if (!bi7.a(fArrMo52getUnderlyingMatrixsQKQjiQ)) {
                    zh7.h(fArrMo52getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long position = nodeCoordinator.getPosition();
            float fK2 = g16.k(position);
            mutableRect.m(rn8.e((((long) Float.floatToRawIntBits(g16.l(position))) & 4294967295L) | (Float.floatToRawIntBits(fK2) << 32)));
            nodeCoordinator = nodeCoordinator.getWrappedBy();
        }
    }

    private final boolean f(NodeCoordinator nodeCoordinator) {
        dw8 layer = nodeCoordinator.getLayer();
        return (layer == null || bi7.a(layer.mo52getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    private final void g(LayoutNode layoutNode) {
        layoutNode.S1(true);
        NodeCoordinator nodeCoordinatorX0 = layoutNode.x0();
        MeasurePassDelegate measurePassDelegateO0 = layoutNode.o0();
        int iJ0 = measurePassDelegateO0.J0();
        int iG0 = measurePassDelegateO0.G0();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.g(0.0f, 0.0f, iJ0, iG0);
        b(nodeCoordinatorX0, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        boolean addedToRectList = layoutNode.getAddedToRectList();
        layoutNode.P1(true);
        if (!addedToRectList || !this.rects.m(semanticsId, left, top, right, bottom)) {
            LayoutNode layoutNodeC0 = layoutNode.C0();
            lba.f(this.rects, semanticsId, left, top, right, bottom, layoutNodeC0 != null ? layoutNodeC0.getSemanticsId() : -1, layoutNode.getNodes().p(ni8.a(1024)), layoutNode.getNodes().p(ni8.a(16)), this.throttledCallbacks.j().a(semanticsId), 0, 512, null);
        }
        layoutNode.c2(false);
        i();
    }

    private final void h(LayoutNode layoutNode) {
        g(layoutNode);
        r58<LayoutNode> r58VarL0 = layoutNode.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.x()) {
                h(layoutNode2);
            }
        }
    }

    private final long k(LayoutNode layoutNode) {
        NodeCoordinator nodeCoordinatorX0 = layoutNode.x0();
        long jB = g16.INSTANCE.b();
        for (NodeCoordinator nodeCoordinatorB0 = layoutNode.b0(); nodeCoordinatorB0 != null && nodeCoordinatorB0 != nodeCoordinatorX0; nodeCoordinatorB0 = nodeCoordinatorB0.getWrappedBy()) {
            if (f(nodeCoordinatorB0)) {
                return g16.INSTANCE.a();
            }
            jB = g16.o(jB, nodeCoordinatorB0.getPosition());
        }
        return jB;
    }

    private final void p(LayoutNode layoutNode) {
        if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot() || f(layoutNode.x0())) {
            return;
        }
        layoutNode.S1(false);
        if (layoutNode.getOuterToInnerOffsetDirty()) {
            layoutNode.a2(k(layoutNode));
            layoutNode.b2(false);
        }
        if (g16.j(layoutNode.getOuterToInnerOffset(), g16.INSTANCE.a())) {
            return;
        }
        r58<LayoutNode> r58VarL0 = layoutNode.L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            p(layoutNodeArr[i]);
        }
    }

    public final void c() {
        o();
        long jC = ja.c();
        boolean z = this.isDirty;
        boolean z2 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            e58<Function0<Unit>> e58Var = this.callbacks;
            Object[] objArr = e58Var.content;
            int i = e58Var._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((Function0) objArr[i2]).invoke();
            }
            lba lbaVar = this.rects;
            long[] jArr = lbaVar.items;
            int i3 = lbaVar.itemsSize;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j = jArr[i4 + 2];
                if ((((int) (j >> 60)) & 1) != 0) {
                    this.throttledCallbacks.g(33554431 & ((int) j), jArr[i4], jArr[i4 + 1], jC);
                }
            }
            this.rects.a();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.f(jC);
        }
        if (z2) {
            this.throttledCallbacks.e(jC);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.b();
        }
        this.throttledCallbacks.p(jC);
        if (this.throttledCallbacks.getMinDebounceDeadline() > 0) {
            r(true);
        }
    }

    public final long d(LayoutNode layoutNode) {
        long jD = this.rects.d(layoutNode.getSemanticsId());
        if (jD == Long.MAX_VALUE) {
            return g16.INSTANCE.a();
        }
        return g16.f((((long) ((int) (jD >> 32))) << 32) | (((long) ((int) jD)) & 4294967295L));
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final lba getRects() {
        return this.rects;
    }

    public final void i() {
        this.isDirty = true;
    }

    public final void j(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.isDirty = true;
            this.rects.h(layoutNode.getSemanticsId());
        }
        r(true);
    }

    public final void l(LayoutNode layoutNode) {
        long jB;
        if (layoutNode.x() && layoutNode.getRectInParentDirty()) {
            LayoutNode layoutNodeC0 = layoutNode.C0();
            if (layoutNodeC0 == null || layoutNodeC0.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                jB = layoutNodeC0 == null ? g16.INSTANCE.b() : g16.INSTANCE.a();
            } else {
                if (layoutNodeC0.getOuterToInnerOffsetDirty()) {
                    layoutNodeC0.b2(false);
                    layoutNodeC0.a2(k(layoutNodeC0));
                }
                jB = layoutNodeC0.getOuterToInnerOffset();
            }
            NodeCoordinator nodeCoordinatorX0 = layoutNode.x0();
            if (!oba.d(jB) || f(nodeCoordinatorX0)) {
                h(layoutNode);
            } else if (layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                h(layoutNode);
                p(layoutNode);
            } else {
                long jO = g16.o(jB, nodeCoordinatorX0.getPosition());
                MeasurePassDelegate measurePassDelegateO0 = layoutNode.o0();
                int iJ0 = measurePassDelegateO0.J0();
                int iG0 = measurePassDelegateO0.G0();
                int semanticsId = layoutNode.getSemanticsId();
                if (!layoutNode.getAddedToRectList()) {
                    layoutNode.P1(true);
                    boolean zP = layoutNode.getNodes().p(ni8.a(1024));
                    boolean zP2 = layoutNode.getNodes().p(ni8.a(16));
                    boolean zA = this.throttledCallbacks.j().a(semanticsId);
                    if (layoutNodeC0 != null) {
                        this.rects.g(semanticsId, layoutNodeC0.getSemanticsId(), g16.k(jO), g16.l(jO), iJ0, iG0, zP, zP2, zA);
                    } else {
                        lba.f(this.rects, semanticsId, g16.k(jO), g16.l(jO), g16.k(jO) + iJ0, g16.l(jO) + iG0, 0, zP, zP2, zA, 0, 544, null);
                    }
                } else if (layoutNodeC0 != null) {
                    this.rects.j(semanticsId, layoutNodeC0.getSemanticsId(), g16.k(jO), g16.l(jO), iJ0, iG0);
                } else {
                    this.rects.i(semanticsId, g16.k(jO), g16.l(jO), g16.k(jO) + iJ0, g16.l(jO) + iG0);
                }
            }
            layoutNode.c2(false);
            i();
            r(true);
        }
    }

    public final x23.a m(int id, long throttleMillis, long debounceMillis, x23 node, Function1<? super nea, Unit> callback) {
        x23.a aVarN = this.throttledCallbacks.n(id, throttleMillis, debounceMillis, node, callback);
        if (y23.q(node.getNode()).getAddedToRectList()) {
            this.rects.o(id, true);
        }
        i();
        r(true);
        return aVarN;
    }

    public final void n(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList()) {
            this.rects.k(layoutNode.getSemanticsId());
            layoutNode.P1(false);
            layoutNode.c2(true);
            i();
            this.isFragmented = true;
        }
    }

    public final void o() {
        Object obj = this.dispatchToken;
        if (obj != null) {
            this.executeDelayed.h(obj);
            this.dispatchToken = null;
        }
    }

    public final void q() {
        r1d r1dVar = this.throttledCallbacks;
        g16.Companion companion = g16.INSTANCE;
        this.isScreenOrWindowDirty = r1dVar.q(companion.b(), companion.b(), null, 0, 0);
    }

    public final void r(boolean ensureSomethingScheduled) {
        boolean z = (ensureSomethingScheduled && this.dispatchToken == null) ? false : true;
        long jI = this.throttledCallbacks.getMinDebounceDeadline();
        if (jI >= 0 || !z) {
            if (this.scheduledDispatchDeadline == jI && z) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                this.executeDelayed.h(obj);
            }
            long jC = ja.c();
            long jMax = Math.max(jI, ((long) 16) + jC);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = this.executeDelayed.O(jMax - jC, this.dispatchLambda);
        }
    }

    public final void s(LayoutNode layoutNode) {
        this.rects.o(layoutNode.getSemanticsId(), false);
    }

    public final void t(LayoutNode layoutNode, boolean focusable, boolean gesturable) {
        if (layoutNode.b()) {
            this.rects.n(layoutNode.getSemanticsId(), focusable, gesturable);
        }
    }

    public final void u(long screenOffset, long windowOffset, float[] viewToWindowMatrix, int windowWidth, int windowHeight) {
        int iC = oba.c(viewToWindowMatrix);
        r1d r1dVar = this.throttledCallbacks;
        if ((iC & 2) != 0) {
            viewToWindowMatrix = null;
        }
        this.isScreenOrWindowDirty = r1dVar.q(screenOffset, windowOffset, viewToWindowMatrix, windowWidth, windowHeight) || this.isScreenOrWindowDirty;
    }
}
