package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.ChangeSize;
import com.google.inputmethod.Slide;
import com.google.inputmethod.co6;
import com.google.inputmethod.dj7;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g16;
import com.google.inputmethod.j05;
import com.google.inputmethod.nx1;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rr;
import com.google.inputmethod.tc;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001aJ#\u0010%\u001a\u00020$*\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u001aR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R:\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b\u0012\u0010H\"\u0004\bI\u0010JR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010[\u001a\u00020\"2\u0006\u0010W\u001a\u00020\"8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bX\u0010U\"\u0004\bY\u0010ZR$\u0010c\u001a\u0004\u0018\u00010\\8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR/\u0010k\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060f0d8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR/\u0010n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0f0d8\u0006¢\u0006\f\n\u0004\bl\u0010h\u001a\u0004\bm\u0010jR\u0013\u0010p\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\bo\u0010`¨\u0006q"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Lcom/google/android/co6;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "transition", "Landroidx/compose/animation/core/Transition$a;", "Lcom/google/android/q16;", "Lcom/google/android/rr;", "sizeAnimation", "Lcom/google/android/g16;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/d;", "enter", "Landroidx/compose/animation/f;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lcom/google/android/j05;", "graphicsLayerBlock", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Lkotlin/jvm/functions/Function0;Lcom/google/android/j05;)V", "targetState", "fullSize", "y3", "(Landroidx/compose/animation/EnterExitState;J)J", "", "V2", "()V", "A3", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "z3", "q", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "x3", "(Landroidx/compose/animation/core/Transition;)V", "r", "Landroidx/compose/animation/core/Transition$a;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$a;", "v3", "(Landroidx/compose/animation/core/Transition$a;)V", "s", "getOffsetAnimation", "u3", "t", "getSlideAnimation", "w3", "u", "Landroidx/compose/animation/d;", "n3", "()Landroidx/compose/animation/d;", "q3", "(Landroidx/compose/animation/d;)V", "v", "Landroidx/compose/animation/f;", "o3", "()Landroidx/compose/animation/f;", "r3", "(Landroidx/compose/animation/f;)V", "w", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "p3", "(Lkotlin/jvm/functions/Function0;)V", "x", "Lcom/google/android/j05;", "getGraphicsLayerBlock", "()Lcom/google/android/j05;", "s3", "(Lcom/google/android/j05;)V", "y", "Z", "lookaheadConstraintsAvailable", "z", "J", "lookaheadSize", "value", "A", "t3", "(J)V", "lookaheadConstraints", "Lcom/google/android/tc;", "B", "Lcom/google/android/tc;", "getCurrentAlignment", "()Lcom/google/android/tc;", "setCurrentAlignment", "(Lcom/google/android/tc;)V", "currentAlignment", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$b;", "Lcom/google/android/xa4;", "C", "Lkotlin/jvm/functions/Function1;", "getSizeTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "sizeTransitionSpec", "D", "getSlideSpec", "slideSpec", "m3", "alignment", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EnterExitTransitionModifierNode extends co6 {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private tc currentAlignment;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private Transition<EnterExitState> transition;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Transition<EnterExitState>.a<q16, rr> sizeAnimation;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private Transition<EnterExitState>.a<g16, rr> offsetAnimation;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Transition<EnterExitState>.a<g16, rr> slideAnimation;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private d enter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private f exit;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private Function0<Boolean> isEnabled;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private j05 graphicsLayerBlock;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private long lookaheadSize = b.c();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private long lookaheadConstraints = nx1.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final Function1<Transition.b<EnterExitState>, xa4<q16>> sizeTransitionSpec = new Function1<Transition.b<EnterExitState>, xa4<q16>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
        {
            super(1);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xa4<q16> invoke(Transition.b<EnterExitState> bVar) {
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            xa4<q16> xa4VarB = null;
            if (bVar.c(enterExitState, enterExitState2)) {
                ChangeSize changeSize = this.this$0.getEnter().getData().getChangeSize();
                if (changeSize != null) {
                    xa4VarB = changeSize.b();
                }
            } else if (bVar.c(enterExitState2, EnterExitState.PostExit)) {
                ChangeSize changeSize2 = this.this$0.getExit().getData().getChangeSize();
                if (changeSize2 != null) {
                    xa4VarB = changeSize2.b();
                }
            } else {
                xa4VarB = EnterExitTransitionKt.e;
            }
            return xa4VarB == null ? EnterExitTransitionKt.e : xa4VarB;
        }
    };

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final Function1<Transition.b<EnterExitState>, xa4<g16>> slideSpec = new Function1<Transition.b<EnterExitState>, xa4<g16>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
        {
            super(1);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xa4<g16> invoke(Transition.b<EnterExitState> bVar) {
            xa4<g16> xa4VarA;
            xa4<g16> xa4VarA2;
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            if (bVar.c(enterExitState, enterExitState2)) {
                Slide slide = this.this$0.getEnter().getData().getSlide();
                return (slide == null || (xa4VarA2 = slide.a()) == null) ? EnterExitTransitionKt.d : xa4VarA2;
            }
            if (!bVar.c(enterExitState2, EnterExitState.PostExit)) {
                return EnterExitTransitionKt.d;
            }
            Slide slide2 = this.this$0.getExit().getData().getSlide();
            return (slide2 == null || (xa4VarA = slide2.a()) == null) ? EnterExitTransitionKt.d : xa4VarA;
        }
    };

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnterExitTransitionModifierNode(Transition<EnterExitState> transition, Transition<EnterExitState>.a<q16, rr> aVar, Transition<EnterExitState>.a<g16, rr> aVar2, Transition<EnterExitState>.a<g16, rr> aVar3, d dVar, f fVar, Function0<Boolean> function0, j05 j05Var) {
        this.transition = transition;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = dVar;
        this.exit = fVar;
        this.isEnabled = function0;
        this.graphicsLayerBlock = j05Var;
    }

    private final void t3(long j) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final long A3(EnterExitState targetState, long fullSize) throws NoWhenBranchMatchedException {
        int i;
        if (this.currentAlignment != null && m3() != null && !Intrinsics.e(this.currentAlignment, m3()) && (i = a.$EnumSwitchMapping$0[targetState.ordinal()]) != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            ChangeSize changeSize = this.exit.getData().getChangeSize();
            if (changeSize == null) {
                return g16.INSTANCE.b();
            }
            long packedValue = ((q16) changeSize.d().invoke(q16.b(fullSize))).getPackedValue();
            tc tcVarM3 = m3();
            Intrinsics.g(tcVarM3);
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            long jA = tcVarM3.a(fullSize, packedValue, layoutDirection);
            tc tcVar = this.currentAlignment;
            Intrinsics.g(tcVar);
            return g16.n(jA, tcVar.a(fullSize, packedValue, layoutDirection));
        }
        return g16.INSTANCE.b();
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        super.V2();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = b.c();
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(j jVar, dj7 dj7Var, long j) {
        q6c<g16> q6cVarA;
        q6c<g16> q6cVarA2;
        if (this.transition.p() == this.transition.w()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            tc tcVarM3 = m3();
            if (tcVarM3 == null) {
                tcVarM3 = tc.INSTANCE.o();
            }
            this.currentAlignment = tcVarM3;
        }
        if (jVar.G1()) {
            final o oVarR0 = dj7Var.r0(j);
            long jC = q16.c((((long) oVarR0.getWidth()) << 32) | (((long) oVarR0.getHeight()) & 4294967295L));
            this.lookaheadSize = jC;
            t3(j);
            return j.Q1(jVar, (int) (jC >> 32), (int) (jC & 4294967295L), null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((o.a) obj);
                    return Unit.a;
                }

                public final void invoke(o.a aVar) {
                    o.a.z(aVar, oVarR0, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        if (!((Boolean) this.isEnabled.invoke()).booleanValue()) {
            final o oVarR1 = dj7Var.r0(j);
            return j.Q1(jVar, oVarR1.getWidth(), oVarR1.getHeight(), null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$3$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((o.a) obj);
                    return Unit.a;
                }

                public final void invoke(o.a aVar) {
                    o.a.z(aVar, oVarR1, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        final Function1<m, Unit> function1Init = this.graphicsLayerBlock.init();
        final o oVarR2 = dj7Var.r0(j);
        long jC2 = q16.c((((long) oVarR2.getWidth()) << 32) | (((long) oVarR2.getHeight()) & 4294967295L));
        final long j2 = b.d(this.lookaheadSize) ? this.lookaheadSize : jC2;
        Transition<EnterExitState>.a<q16, rr> aVar = this.sizeAnimation;
        q6c<q16> q6cVarA3 = aVar != null ? aVar.a(this.sizeTransitionSpec, new Function1<EnterExitState, q16>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$animSize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long a(EnterExitState enterExitState) {
                return this.this$0.y3(enterExitState, j2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return q16.b(a((EnterExitState) obj));
            }
        }) : null;
        if (q6cVarA3 != null) {
            jC2 = q6cVarA3.getValue().getPackedValue();
        }
        long jD = nx1.d(j, jC2);
        Transition<EnterExitState>.a<g16, rr> aVar2 = this.offsetAnimation;
        long jB = (aVar2 == null || (q6cVarA2 = aVar2.a(new Function1<Transition.b<EnterExitState>, xa4<g16>>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final xa4<g16> invoke(Transition.b<EnterExitState> bVar) {
                return EnterExitTransitionKt.d;
            }
        }, new Function1<EnterExitState, g16>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$offsetDelta$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long a(EnterExitState enterExitState) {
                return this.this$0.A3(enterExitState, j2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return g16.c(a((EnterExitState) obj));
            }
        })) == null) ? g16.INSTANCE.b() : q6cVarA2.getValue().getPackedValue();
        Transition<EnterExitState>.a<g16, rr> aVar3 = this.slideAnimation;
        long jB2 = (aVar3 == null || (q6cVarA = aVar3.a(this.slideSpec, new Function1<EnterExitState, g16>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$slideOffset$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final long a(EnterExitState enterExitState) {
                return this.this$0.z3(enterExitState, j2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return g16.c(a((EnterExitState) obj));
            }
        })) == null) ? g16.INSTANCE.b() : q6cVarA.getValue().getPackedValue();
        tc tcVar = this.currentAlignment;
        final long jO = g16.o(tcVar != null ? tcVar.a(j2, jD, LayoutDirection.Ltr) : g16.INSTANCE.b(), jB2);
        final long j3 = jB;
        return j.Q1(jVar, (int) (jD >> 32), (int) (jD & 4294967295L), null, new Function1<o.a, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((o.a) obj);
                return Unit.a;
            }

            public final void invoke(o.a aVar4) {
                aVar4.c0(oVarR2, g16.k(j3) + g16.k(jO), g16.l(j3) + g16.l(jO), 0.0f, function1Init);
            }
        }, 4, null);
    }

    public final tc m3() {
        tc alignment;
        tc alignment2;
        if (this.transition.u().c(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.getData().getChangeSize();
            if (changeSize != null && (alignment2 = changeSize.getAlignment()) != null) {
                return alignment2;
            }
            ChangeSize changeSize2 = this.exit.getData().getChangeSize();
            if (changeSize2 != null) {
                return changeSize2.getAlignment();
            }
            return null;
        }
        ChangeSize changeSize3 = this.exit.getData().getChangeSize();
        if (changeSize3 != null && (alignment = changeSize3.getAlignment()) != null) {
            return alignment;
        }
        ChangeSize changeSize4 = this.enter.getData().getChangeSize();
        if (changeSize4 != null) {
            return changeSize4.getAlignment();
        }
        return null;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final d getEnter() {
        return this.enter;
    }

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final f getExit() {
        return this.exit;
    }

    public final void p3(Function0<Boolean> function0) {
        this.isEnabled = function0;
    }

    public final void q3(d dVar) {
        this.enter = dVar;
    }

    public final void r3(f fVar) {
        this.exit = fVar;
    }

    public final void s3(j05 j05Var) {
        this.graphicsLayerBlock = j05Var;
    }

    public final void u3(Transition<EnterExitState>.a<g16, rr> aVar) {
        this.offsetAnimation = aVar;
    }

    public final void v3(Transition<EnterExitState>.a<q16, rr> aVar) {
        this.sizeAnimation = aVar;
    }

    public final void w3(Transition<EnterExitState>.a<g16, rr> aVar) {
        this.slideAnimation = aVar;
    }

    public final void x3(Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final long y3(EnterExitState targetState, long fullSize) throws NoWhenBranchMatchedException {
        Function1<q16, q16> function1D;
        Function1<q16, q16> function1D2;
        int i = a.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ChangeSize changeSize = this.enter.getData().getChangeSize();
                if (changeSize != null && (function1D = changeSize.d()) != null) {
                    return ((q16) function1D.invoke(q16.b(fullSize))).getPackedValue();
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ChangeSize changeSize2 = this.exit.getData().getChangeSize();
                if (changeSize2 != null && (function1D2 = changeSize2.d()) != null) {
                    return ((q16) function1D2.invoke(q16.b(fullSize))).getPackedValue();
                }
            }
        }
        return fullSize;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final long z3(EnterExitState targetState, long fullSize) throws NoWhenBranchMatchedException {
        Function1<q16, g16> function1B;
        Function1<q16, g16> function1B2;
        Slide slide = this.enter.getData().getSlide();
        long jB = (slide == null || (function1B2 = slide.b()) == null) ? g16.INSTANCE.b() : ((g16) function1B2.invoke(q16.b(fullSize))).getPackedValue();
        Slide slide2 = this.exit.getData().getSlide();
        long jB2 = (slide2 == null || (function1B = slide2.b()) == null) ? g16.INSTANCE.b() : ((g16) function1B.invoke(q16.b(fullSize))).getPackedValue();
        int i = a.$EnumSwitchMapping$0[targetState.ordinal()];
        if (i == 1) {
            return g16.INSTANCE.b();
        }
        if (i == 2) {
            return jB;
        }
        if (i == 3) {
            return jB2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
