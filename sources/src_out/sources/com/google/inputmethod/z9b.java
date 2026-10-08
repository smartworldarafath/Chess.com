package com.google.inputmethod;

import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.ScrollableNode;
import androidx.compose.ui.node.l;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J]\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010\"R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00103R\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010)¨\u0006G"}, d2 = {"Lcom/google/android/z9b;", "Lcom/google/android/k33;", "Lcom/google/android/bs1;", "Lcom/google/android/on8;", "Lcom/google/android/hab;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseScrolling", "Lcom/google/android/qg4;", "flingBehavior", "Lcom/google/android/r48;", "interactionSource", "Lcom/google/android/fu0;", "bringIntoViewSpec", "useLocalOverscrollFactory", "Lcom/google/android/zv8;", "userProvidedOverscrollEffect", "<init>", "(Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;ZZLcom/google/android/qg4;Lcom/google/android/r48;Lcom/google/android/fu0;ZLcom/google/android/zv8;)V", "", "t3", "()V", "v3", "()Lcom/google/android/zv8;", "V2", "W2", "C1", "overscrollEffect", "x3", "(Lcom/google/android/hab;Landroidx/compose/foundation/gestures/Orientation;ZLcom/google/android/zv8;ZZLcom/google/android/qg4;Lcom/google/android/r48;Lcom/google/android/fu0;)V", "w3", "()Z", "M1", "r", "Lcom/google/android/hab;", "s", "Landroidx/compose/foundation/gestures/Orientation;", "t", "Z", "u", "v", "Lcom/google/android/qg4;", "w", "Lcom/google/android/r48;", "x", "Lcom/google/android/fu0;", "y", "z", "Lcom/google/android/zv8;", "A", "Q2", "shouldAutoInvalidate", "Landroidx/compose/foundation/gestures/ScrollableNode;", "B", "Landroidx/compose/foundation/gestures/ScrollableNode;", "scrollableNode", "Lcom/google/android/x23;", "C", "Lcom/google/android/x23;", "overscrollNode", "Lcom/google/android/aw8;", "D", "Lcom/google/android/aw8;", "localOverscrollFactory", "E", "localOverscrollFactoryCreatedOverscrollEffect", "F", "shouldReverseDirection", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z9b extends k33 implements bs1, on8 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private ScrollableNode scrollableNode;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private x23 overscrollNode;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private aw8 localOverscrollFactory;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private zv8 localOverscrollFactoryCreatedOverscrollEffect;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean shouldReverseDirection;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private hab state;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private qg4 flingBehavior;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private r48 interactionSource;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private fu0 bringIntoViewSpec;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean useLocalOverscrollFactory;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private zv8 userProvidedOverscrollEffect;

    public z9b(hab habVar, Orientation orientation, boolean z, boolean z2, qg4 qg4Var, r48 r48Var, fu0 fu0Var, boolean z3, zv8 zv8Var) {
        this.state = habVar;
        this.orientation = orientation;
        this.enabled = z;
        this.reverseScrolling = z2;
        this.flingBehavior = qg4Var;
        this.interactionSource = r48Var;
        this.bringIntoViewSpec = fu0Var;
        this.useLocalOverscrollFactory = z3;
        this.userProvidedOverscrollEffect = zv8Var;
    }

    private final void t3() {
        x23 x23Var = this.overscrollNode;
        if (x23Var != null) {
            if (x23Var == null || x23Var.getNode().getIsAttached()) {
                return;
            }
            m3(x23Var);
            return;
        }
        if (this.useLocalOverscrollFactory) {
            l.a(this, new Function0() { // from class: com.google.android.y9b
                public final Object invoke() {
                    return z9b.u3(this.a);
                }
            });
        }
        zv8 zv8VarV3 = v3();
        if (zv8VarV3 != null) {
            x23 node = zv8VarV3.getNode();
            if (node.getNode().getIsAttached()) {
                return;
            }
            this.overscrollNode = m3(node);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u3(z9b z9bVar) {
        aw8 aw8Var = (aw8) cs1.a(z9bVar, cw8.c());
        z9bVar.localOverscrollFactory = aw8Var;
        z9bVar.localOverscrollFactoryCreatedOverscrollEffect = aw8Var != null ? aw8Var.a() : null;
        return Unit.a;
    }

    @Override // com.google.inputmethod.x23
    public void C1() {
        boolean zW3 = w3();
        if (this.shouldReverseDirection != zW3) {
            this.shouldReverseDirection = zW3;
            x3(this.state, this.orientation, this.useLocalOverscrollFactory, v3(), this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    @Override // com.google.inputmethod.on8
    public void M1() {
        aw8 aw8Var = (aw8) cs1.a(this, cw8.c());
        if (Intrinsics.e(aw8Var, this.localOverscrollFactory)) {
            return;
        }
        this.localOverscrollFactory = aw8Var;
        this.localOverscrollFactoryCreatedOverscrollEffect = null;
        x23 x23Var = this.overscrollNode;
        if (x23Var != null) {
            p3(x23Var);
        }
        this.overscrollNode = null;
        t3();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.C4(this.state, this.orientation, v3(), this.enabled, this.shouldReverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    @Override // androidx.compose.ui.b.c
    /* JADX INFO: renamed from: Q2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        this.shouldReverseDirection = w3();
        t3();
        if (this.scrollableNode == null) {
            this.scrollableNode = (ScrollableNode) m3(new ScrollableNode(this.state, v3(), this.flingBehavior, this.orientation, this.enabled, this.shouldReverseDirection, this.interactionSource, this.bringIntoViewSpec));
        }
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        x23 x23Var = this.overscrollNode;
        if (x23Var != null) {
            p3(x23Var);
        }
    }

    public final zv8 v3() {
        return this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
    }

    public final boolean w3() {
        LayoutDirection layoutDirectionP = LayoutDirection.Ltr;
        if (getIsAttached()) {
            layoutDirectionP = y23.p(this);
        }
        return cab.a.b(layoutDirectionP, this.orientation, this.reverseScrolling);
    }

    public final void x3(hab state, Orientation orientation, boolean useLocalOverscrollFactory, zv8 overscrollEffect, boolean enabled, boolean reverseScrolling, qg4 flingBehavior, r48 interactionSource, fu0 bringIntoViewSpec) {
        boolean z;
        this.state = state;
        this.orientation = orientation;
        boolean z2 = true;
        if (this.useLocalOverscrollFactory != useLocalOverscrollFactory) {
            this.useLocalOverscrollFactory = useLocalOverscrollFactory;
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.e(this.userProvidedOverscrollEffect, overscrollEffect)) {
            z2 = false;
        } else {
            this.userProvidedOverscrollEffect = overscrollEffect;
        }
        if (z || (z2 && !useLocalOverscrollFactory)) {
            x23 x23Var = this.overscrollNode;
            if (x23Var != null) {
                p3(x23Var);
            }
            this.overscrollNode = null;
            t3();
        }
        this.enabled = enabled;
        this.reverseScrolling = reverseScrolling;
        this.flingBehavior = flingBehavior;
        this.interactionSource = interactionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.shouldReverseDirection = w3();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.C4(state, orientation, v3(), enabled, this.shouldReverseDirection, flingBehavior, interactionSource, bringIntoViewSpec);
        }
    }
}
