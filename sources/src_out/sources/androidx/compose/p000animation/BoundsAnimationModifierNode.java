package androidx.compose.p000animation;

import androidx.compose.ui.b;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.v;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.LookaheadAnimationVisualDebugConfig;
import com.google.inputmethod.bs1;
import com.google.inputmethod.cs1;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ei1;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fz1;
import com.google.inputmethod.gba;
import com.google.inputmethod.gz;
import com.google.inputmethod.it0;
import com.google.inputmethod.kn6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.nx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.r16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.sa7;
import com.google.inputmethod.wa7;
import com.google.inputmethod.yg3;
import com.google.inputmethod.z66;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\r*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010%\u001a\u00020$*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020\u0013*\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R4\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010=R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010Q\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010\u0015R$\u0010Y\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010a\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006b"}, d2 = {"Landroidx/compose/animation/BoundsAnimationModifierNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/b$c;", "Lcom/google/android/bs1;", "Lcom/google/android/yg3;", "Lcom/google/android/wa7;", "lookaheadScope", "Lcom/google/android/it0;", "boundsTransform", "Lkotlin/Function2;", "Lcom/google/android/q16;", "Lcom/google/android/kx1;", "onChooseMeasureConstraints", "", "animateMotionFrameOfReference", "<init>", "(Lcom/google/android/wa7;Lcom/google/android/it0;Lkotlin/jvm/functions/Function2;Z)V", "Landroidx/compose/ui/text/font/l$b;", "fontFamilyResolver", "", "t3", "(Landroidx/compose/ui/text/font/l$b;)V", "lookaheadSize", "Y1", "(J)Z", "V2", "()V", "Landroidx/compose/ui/layout/o$a;", "Lcom/google/android/kn6;", "lookaheadCoordinates", "Q", "(Landroidx/compose/ui/layout/o$a;Lcom/google/android/kn6;)Z", "Lcom/google/android/gz;", "Lcom/google/android/dj7;", "measurable", "constraints", "Lcom/google/android/fj7;", "d2", "(Lcom/google/android/gz;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "p", "Lcom/google/android/wa7;", "o3", "()Lcom/google/android/wa7;", "r3", "(Lcom/google/android/wa7;)V", "q", "Lcom/google/android/it0;", "getBoundsTransform", "()Lcom/google/android/it0;", "q3", "(Lcom/google/android/it0;)V", "r", "Lkotlin/jvm/functions/Function2;", "getOnChooseMeasureConstraints", "()Lkotlin/jvm/functions/Function2;", "s3", "(Lkotlin/jvm/functions/Function2;)V", "s", "Z", "n3", "()Z", "p3", "(Z)V", "t", "directManipulationParentsDirty", "Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "u", "Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "boundsAnimation", "Landroidx/compose/ui/text/v;", "v", "Landroidx/compose/ui/text/v;", "textMeasurer", "w", "Landroidx/compose/ui/text/font/l$b;", "getCurrentResolver", "()Landroidx/compose/ui/text/font/l$b;", "setCurrentResolver", "currentResolver", "Lcom/google/android/f43;", "x", "Lcom/google/android/f43;", "getCurrentDensity", "()Lcom/google/android/f43;", "setCurrentDensity", "(Lcom/google/android/f43;)V", "currentDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "y", "Landroidx/compose/ui/unit/LayoutDirection;", "getCurrentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setCurrentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "currentLayoutDirection", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BoundsAnimationModifierNode extends b.c implements ApproachLayoutModifierNode, bs1, yg3 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private wa7 lookaheadScope;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private it0 boundsTransform;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function2<? super q16, ? super kx1, kx1> onChooseMeasureConstraints;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean animateMotionFrameOfReference;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean directManipulationParentsDirty = true;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final BoundsTransformDeferredAnimation boundsAnimation = new BoundsTransformDeferredAnimation();

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private v textMeasurer;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private l.b currentResolver;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private f43 currentDensity;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private LayoutDirection currentLayoutDirection;

    public BoundsAnimationModifierNode(wa7 wa7Var, it0 it0Var, Function2<? super q16, ? super kx1, kx1> function2, boolean z) {
        this.lookaheadScope = wa7Var;
        this.boundsTransform = it0Var;
        this.onChooseMeasureConstraints = function2;
        this.animateMotionFrameOfReference = z;
    }

    private final void t3(l.b fontFamilyResolver) {
        if (this.textMeasurer == null || !Intrinsics.e(this.currentResolver, fontFamilyResolver)) {
            f43 f43Var = this.currentDensity;
            Intrinsics.g(f43Var);
            LayoutDirection layoutDirection = this.currentLayoutDirection;
            Intrinsics.g(layoutDirection);
            this.textMeasurer = new v(fontFamilyResolver, f43Var, layoutDirection, 0, 8, null);
            this.currentResolver = fontFamilyResolver;
        }
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean Q(o.a aVar, kn6 kn6Var) {
        if (z66.a() && this.boundsAnimation.getLookaheadAnimationVisualDebugHelper() == null) {
            this.boundsAnimation.k(new sa7());
        }
        this.boundsAnimation.n(this.lookaheadScope, aVar, L2(), this.directManipulationParentsDirty, this.animateMotionFrameOfReference, this.boundsTransform);
        this.directManipulationParentsDirty = this.animateMotionFrameOfReference;
        return !this.boundsAnimation.i();
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        this.directManipulationParentsDirty = true;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean Y1(long lookaheadSize) {
        this.boundsAnimation.o(r16.e(lookaheadSize));
        return !this.boundsAnimation.i();
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public fj7 d2(gz gzVar, dj7 dj7Var, long j) {
        long jE = this.boundsAnimation.getCurrentSize() == 9205357640488583168L ? r16.e(gzVar.s0()) : this.boundsAnimation.getCurrentSize();
        gba gbaVarH = this.boundsAnimation.h();
        if (gbaVarH != null) {
            jE = gbaVarH.k();
        }
        long jC = r16.c(jE);
        long value = ((kx1) this.onChooseMeasureConstraints.invoke(q16.b(jC), kx1.a(j))).getValue();
        final o oVarR0 = dj7Var.r0(value);
        long jD = nx1.d(value, jC);
        return j.Q1(gzVar, (int) (jD >> 32), (int) (jD & 4294967295L), null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.BoundsAnimationModifierNode$approachMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o.a) obj);
                return Unit.a;
            }

            public final void invoke(o.a aVar) {
                long jM;
                gba gbaVarH2 = this.this$0.boundsAnimation.h();
                wa7 lookaheadScope = this.this$0.getLookaheadScope();
                BoundsAnimationModifierNode boundsAnimationModifierNode = this.this$0;
                kn6 kn6VarV = aVar.v();
                rn8 rn8VarD = kn6VarV != null ? rn8.d(lookaheadScope.b(aVar).f0(kn6VarV, rn8.INSTANCE.c(), boundsAnimationModifierNode.getAnimateMotionFrameOfReference())) : null;
                if (gbaVarH2 != null) {
                    this.this$0.boundsAnimation.l(gbaVarH2.m(), gbaVarH2.k());
                    jM = gbaVarH2.m();
                } else {
                    gba gbaVarC = this.this$0.boundsAnimation.c();
                    jM = gbaVarC != null ? gbaVarC.m() : rn8.INSTANCE.c();
                }
                long jP = rn8VarD != null ? rn8.p(jM, rn8VarD.getPackedValue()) : rn8.INSTANCE.c();
                o.a.z(aVar, oVarR0, Math.round(Float.intBitsToFloat((int) (jP >> 32))), Math.round(Float.intBitsToFloat((int) (jP & 4294967295L))), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) throws Throwable {
        fz1Var.j1();
        if (z66.a() && kx1.j(((kx1) this.onChooseMeasureConstraints.invoke(q16.b(q16.INSTANCE.a()), kx1.a(nx1.b(0, 0, 0, 0, 15, null)))).getValue())) {
            LookaheadAnimationVisualDebugConfig lookaheadAnimationVisualDebugConfig = (LookaheadAnimationVisualDebugConfig) cs1.a(this, CompositionLocalsKt.b());
            if (lookaheadAnimationVisualDebugConfig.getIsEnabled()) {
                if (this.currentDensity == null) {
                    this.currentDensity = (f43) cs1.a(this, CompositionLocalsKt.g());
                    this.currentLayoutDirection = (LayoutDirection) cs1.a(this, CompositionLocalsKt.m());
                }
                sa7 lookaheadAnimationVisualDebugHelper = this.boundsAnimation.getLookaheadAnimationVisualDebugHelper();
                Intrinsics.g(lookaheadAnimationVisualDebugHelper);
                long value = ((ei1) cs1.a(this, CompositionLocalsKt.a())).getValue();
                t3((l.b) cs1.a(this, CompositionLocalsKt.i()));
                if (this.boundsAnimation.i()) {
                    boolean isShowKeyLabelEnabled = lookaheadAnimationVisualDebugConfig.getIsShowKeyLabelEnabled();
                    float fX2 = fz1Var.x2(ff3.i((float) 2.5d));
                    String strSubstring = this.boundsAnimation.toString().substring(60);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    lookaheadAnimationVisualDebugHelper.d(fz1Var, value, isShowKeyLabelEnabled, fX2, strSubstring, this.textMeasurer);
                    return;
                }
                long targetOffset = this.boundsAnimation.getTargetOffset();
                long targetSize = this.boundsAnimation.getTargetSize();
                gba gbaVarH = this.boundsAnimation.h();
                Intrinsics.g(gbaVarH);
                long jA = fz1Var.A();
                boolean isShowKeyLabelEnabled2 = lookaheadAnimationVisualDebugConfig.getIsShowKeyLabelEnabled();
                float fX3 = fz1Var.x2(ff3.i((float) 2.5d));
                String strSubstring2 = this.boundsAnimation.toString().substring(60);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                lookaheadAnimationVisualDebugHelper.e(fz1Var, value, targetOffset, targetSize, gbaVarH, jA, isShowKeyLabelEnabled2, fX3, strSubstring2, this.textMeasurer);
            }
        }
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final wa7 getLookaheadScope() {
        return this.lookaheadScope;
    }

    public final void p3(boolean z) {
        this.animateMotionFrameOfReference = z;
    }

    public final void q3(it0 it0Var) {
        this.boundsTransform = it0Var;
    }

    public final void r3(wa7 wa7Var) {
        this.lookaheadScope = wa7Var;
    }

    public final void s3(Function2<? super q16, ? super kx1, kx1> function2) {
        this.onChooseMeasureConstraints = function2;
    }
}
