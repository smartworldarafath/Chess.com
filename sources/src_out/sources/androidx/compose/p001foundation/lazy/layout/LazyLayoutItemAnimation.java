package androidx.compose.p001foundation.lazy.layout;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.yg4;
import com.google.inputmethod.g16;
import com.google.inputmethod.i05;
import com.google.inputmethod.o58;
import com.google.inputmethod.qr;
import com.google.inputmethod.rr;
import com.google.inputmethod.w2e;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R$\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u00109\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00101\"\u0004\b7\u00108R+\u0010=\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00101\"\u0004\b<\u00108R+\u0010A\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u00105\u001a\u0004\b?\u00101\"\u0004\b@\u00108R+\u0010D\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\bB\u00101\"\u0004\bC\u00108R\"\u0010I\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010G\"\u0004\bE\u0010HR\"\u0010L\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010E\u001a\u0004\bJ\u0010G\"\u0004\bK\u0010HR(\u0010Q\u001a\u0004\u0018\u00010M2\b\u0010-\u001a\u0004\u0018\u00010M8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010PR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010TR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020V0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010TR+\u0010[\u001a\u00020\r2\u0006\u00103\u001a\u00020\r8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u00105\u001a\u0004\bY\u0010G\"\u0004\bZ\u0010HR\"\u0010]\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010E\u001a\u0004\bX\u0010G\"\u0004\b\\\u0010H¨\u0006^"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "", "Lcom/google/android/ta2;", "coroutineScope", "Lcom/google/android/i05;", "graphicsContext", "Lkotlin/Function0;", "", "onLayerPropertyChanged", "<init>", "(Lcom/google/android/ta2;Lcom/google/android/i05;Lkotlin/jvm/functions/Function0;)V", "n", "()V", "Lcom/google/android/g16;", "delta", "", "isMovingAway", "m", "(JZ)V", "k", "l", "y", "a", "Lcom/google/android/ta2;", "b", "Lcom/google/android/i05;", "c", "Lkotlin/jvm/functions/Function0;", "Lcom/google/android/xa4;", "", "d", "Lcom/google/android/xa4;", "getFadeInSpec", "()Lcom/google/android/xa4;", "C", "(Lcom/google/android/xa4;)V", "fadeInSpec", "e", "getPlacementSpec", "I", "placementSpec", "f", "getFadeOutSpec", "D", "fadeOutSpec", "value", "g", "Z", "x", "()Z", "isRunningMovingAwayAnimation", "<set-?>", "h", "Lcom/google/android/o58;", "w", "G", "(Z)V", "isPlacementAnimationInProgress", "i", "t", "z", "isAppearanceAnimationInProgress", "j", "v", "B", "isDisappearanceAnimationInProgress", "u", "A", "isDisappearanceAnimationFinished", "J", "s", "()J", "(J)V", "rawOffset", "o", "E", "finalOffset", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "p", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Landroidx/compose/animation/core/Animatable;", "Lcom/google/android/rr;", "Landroidx/compose/animation/core/Animatable;", "placementDeltaAnimation", "Lcom/google/android/qr;", "visibilityAnimation", "q", "r", "H", "placementDelta", "F", "lookaheadOffset", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LazyLayoutItemAnimation {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int t = 8;
    private static final long u;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ta2 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final i05 graphicsContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function0<Unit> onLayerPropertyChanged;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private xa4<Float> fadeInSpec;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private xa4<g16> placementSpec;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private xa4<Float> fadeOutSpec;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isRunningMovingAwayAnimation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final o58 isPlacementAnimationInProgress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final o58 isAppearanceAnimationInProgress;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final o58 isDisappearanceAnimationInProgress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final o58 isDisappearanceAnimationFinished;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private long rawOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long finalOffset;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private GraphicsLayer layer;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Animatable<g16, rr> placementDeltaAnimation;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Animatable<Float, qr> visibilityAnimation;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final o58 placementDelta;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private long lookaheadOffset;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$a;", "", "<init>", "()V", "Lcom/google/android/g16;", "NotInitialized", "J", "a", "()J", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return LazyLayoutItemAnimation.u;
        }

        private Companion() {
        }
    }

    static {
        long j = Integer.MAX_VALUE;
        u = g16.f((j & 4294967295L) | (j << 32));
    }

    public LazyLayoutItemAnimation(ta2 ta2Var, i05 i05Var, Function0<Unit> function0) {
        this.coroutineScope = ta2Var;
        this.graphicsContext = i05Var;
        this.onLayerPropertyChanged = function0;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress = s0.e(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = s0.e(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress = s0.e(bool, null, 2, null);
        this.isDisappearanceAnimationFinished = s0.e(bool, null, 2, null);
        long j = u;
        this.rawOffset = j;
        g16.Companion companion = g16.INSTANCE;
        this.finalOffset = companion.b();
        this.layer = i05Var != null ? i05Var.b() : null;
        String str = null;
        this.placementDeltaAnimation = new Animatable<>(g16.c(companion.b()), w2e.P(companion), null, str, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), w2e.N(yg4.a), str, null, 12, null);
        this.placementDelta = s0.e(g16.c(companion.b()), null, 2, null);
        this.lookaheadOffset = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(boolean z) {
        this.isDisappearanceAnimationFinished.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(boolean z) {
        this.isDisappearanceAnimationInProgress.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(boolean z) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(long j) {
        this.placementDelta.setValue(g16.c(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(boolean z) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z));
    }

    public final void C(xa4<Float> xa4Var) {
        this.fadeInSpec = xa4Var;
    }

    public final void D(xa4<Float> xa4Var) {
        this.fadeOutSpec = xa4Var;
    }

    public final void E(long j) {
        this.finalOffset = j;
    }

    public final void F(long j) {
        this.lookaheadOffset = j;
    }

    public final void I(xa4<g16> xa4Var) {
        this.placementSpec = xa4Var;
    }

    public final void J(long j) {
        this.rawOffset = j;
    }

    public final void k() {
        GraphicsLayer graphicsLayer = this.layer;
        xa4<Float> xa4Var = this.fadeInSpec;
        if (t() || xa4Var == null || graphicsLayer == null) {
            if (v()) {
                if (graphicsLayer != null) {
                    graphicsLayer.K(1.0f);
                }
                rw0.d(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3, (Object) null);
                return;
            }
            return;
        }
        z(true);
        boolean zV = v();
        boolean z = !zV;
        if (!zV) {
            graphicsLayer.K(0.0f);
        }
        rw0.d(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$animateAppearance$2(z, this, xa4Var, graphicsLayer, null), 3, (Object) null);
    }

    public final void l() {
        GraphicsLayer graphicsLayer = this.layer;
        xa4<Float> xa4Var = this.fadeOutSpec;
        if (graphicsLayer == null || v() || xa4Var == null) {
            return;
        }
        B(true);
        rw0.d(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$animateDisappearance$1(this, xa4Var, graphicsLayer, null), 3, (Object) null);
    }

    public final void m(long delta, boolean isMovingAway) {
        xa4<g16> xa4Var = this.placementSpec;
        if (xa4Var == null) {
            return;
        }
        long jN = g16.n(r(), delta);
        H(jN);
        G(true);
        this.isRunningMovingAwayAnimation = isMovingAway;
        rw0.d(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, xa4Var, jN, null), 3, (Object) null);
    }

    public final void n() {
        if (w()) {
            rw0.d(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3, (Object) null);
        }
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getFinalOffset() {
        return this.finalOffset;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final GraphicsLayer getLayer() {
        return this.layer;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((g16) this.placementDelta.getValue()).getPackedValue();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.isDisappearanceAnimationFinished.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v() {
        return ((Boolean) this.isDisappearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean w() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void y() {
        i05 i05Var;
        if (w()) {
            G(false);
            rw0.d(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$release$1(this, null), 3, (Object) null);
        }
        if (t()) {
            z(false);
            rw0.d(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$release$2(this, null), 3, (Object) null);
        }
        if (v()) {
            B(false);
            rw0.d(this.coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new LazyLayoutItemAnimation$release$3(this, null), 3, (Object) null);
        }
        this.isRunningMovingAwayAnimation = false;
        H(g16.INSTANCE.b());
        this.rawOffset = u;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (i05Var = this.graphicsContext) != null) {
            i05Var.c(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }
}
