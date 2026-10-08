package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import androidx.compose.p000animation.core.TransitionKt;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.co6;
import com.google.inputmethod.dj7;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff1;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g16;
import com.google.inputmethod.h02;
import com.google.inputmethod.jtb;
import com.google.inputmethod.k4b;
import com.google.inputmethod.k58;
import com.google.inputmethod.lr;
import com.google.inputmethod.o58;
import com.google.inputmethod.q16;
import com.google.inputmethod.q6c;
import com.google.inputmethod.rr;
import com.google.inputmethod.tc;
import com.google.inputmethod.uy7;
import com.google.inputmethod.w19;
import com.google.inputmethod.w2e;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003(\u0014WB'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0004¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00182\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0011H\u0001¢\u0006\u0004\b&\u0010'R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010>\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R,\u0010D\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0@0?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010A\u001a\u0004\bB\u0010CR*\u0010K\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0018\u0010O\u001a\u00020L*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010Q\u001a\u00020L*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0014\u0010\r\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010;R\u0014\u0010U\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010V\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010T¨\u0006Y²\u0006\u000e\u0010X\u001a\u00020L8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/core/Transition;", "transition", "Lcom/google/android/tc;", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/Transition;Lcom/google/android/tc;Landroidx/compose/ui/unit/LayoutDirection;)V", "Lcom/google/android/q16;", "fullSize", "currentSize", "Lcom/google/android/g16;", "k", "(JJ)J", "Lcom/google/android/h02;", "Lcom/google/android/jtb;", "sizeTransform", "b", "(Lcom/google/android/h02;Lcom/google/android/jtb;)Lcom/google/android/h02;", "Landroidx/compose/animation/AnimatedContentTransitionScope$a;", "towards", "Lcom/google/android/xa4;", "animationSpec", "Lkotlin/Function1;", "", "initialOffset", "Landroidx/compose/animation/d;", "h", "(ILcom/google/android/xa4;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/d;", "targetOffset", "Landroidx/compose/animation/f;", "e", "(ILcom/google/android/xa4;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/f;", "contentTransform", "Landroidx/compose/ui/b;", "l", "(Lcom/google/android/h02;Landroidx/compose/runtime/d;I)Landroidx/compose/ui/b;", "a", "Landroidx/compose/animation/core/Transition;", "s", "()Landroidx/compose/animation/core/Transition;", "Lcom/google/android/tc;", "o", "()Lcom/google/android/tc;", "w", "(Lcom/google/android/tc;)V", "c", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation", "()Landroidx/compose/ui/unit/LayoutDirection;", "x", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "d", "Lcom/google/android/o58;", "q", "()J", "y", "(J)V", "measuredSize", "Lcom/google/android/k58;", "Lcom/google/android/q6c;", "Lcom/google/android/k58;", "r", "()Lcom/google/android/k58;", "targetSizeMap", "f", "Lcom/google/android/q6c;", "getAnimatedSize$animation", "()Lcom/google/android/q6c;", "v", "(Lcom/google/android/q6c;)V", "animatedSize", "", "t", "(I)Z", "isLeft", "u", "isRight", "p", "g", "()Ljava/lang/Object;", "initialState", "targetState", "SizeModifierNode", "shouldAnimateSize", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Transition<S> transition;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private tc contentAlignment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o58 measuredSize = s0.e(q16.b(q16.INSTANCE.a()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final k58<S, q6c<q16>> targetSizeMap = k4b.c();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private q6c<q16> animatedSize;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BE\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR:\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "S", "Lcom/google/android/co6;", "Landroidx/compose/animation/core/Transition$a;", "Lcom/google/android/q16;", "Lcom/google/android/rr;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Lcom/google/android/q6c;", "Lcom/google/android/jtb;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/core/Transition$a;Lcom/google/android/q6c;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "default", "p3", "(J)J", "", "X2", "()V", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "q", "Landroidx/compose/animation/core/Transition$a;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$a;", "r3", "(Landroidx/compose/animation/core/Transition$a;)V", "r", "Lcom/google/android/q6c;", "o3", "()Lcom/google/android/q6c;", "s3", "(Lcom/google/android/q6c;)V", "s", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "n3", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "q3", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "t", "J", "lastSize", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class SizeModifierNode<S> extends co6 {

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private Transition<S>.a<q16, rr> sizeAnimation;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private q6c<? extends jtb> sizeTransform;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private AnimatedContentTransitionScopeImpl<S> scope;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private long lastSize = AnimatedContentKt.a;

        public SizeModifierNode(Transition<S>.a<q16, rr> aVar, q6c<? extends jtb> q6cVar, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = aVar;
            this.sizeTransform = q6cVar;
            this.scope = animatedContentTransitionScopeImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long p3(long j) {
            return q16.f(this.lastSize, AnimatedContentKt.a) ? j : this.lastSize;
        }

        @Override // androidx.compose.ui.b.c
        public void X2() {
            super.X2();
            this.lastSize = AnimatedContentKt.a;
        }

        @Override // androidx.compose.ui.node.c
        public fj7 b(j jVar, dj7 dj7Var, long j) {
            final long packedValue;
            final o oVarR0 = dj7Var.r0(j);
            if (jVar.G1()) {
                packedValue = q16.c((((long) oVarR0.getWidth()) << 32) | (((long) oVarR0.getHeight()) & 4294967295L));
            } else if (this.sizeAnimation == null) {
                packedValue = q16.c((((long) oVarR0.getWidth()) << 32) | (((long) oVarR0.getHeight()) & 4294967295L));
                this.lastSize = q16.c((((long) oVarR0.getWidth()) << 32) | (((long) oVarR0.getHeight()) & 4294967295L));
            } else {
                final long jC = q16.c((((long) oVarR0.getWidth()) << 32) | (((long) oVarR0.getHeight()) & 4294967295L));
                Transition<S>.a<q16, rr> aVar = this.sizeAnimation;
                Intrinsics.g(aVar);
                q6c<q16> q6cVarA = aVar.a(new Function1<Transition.b<S>, xa4<q16>>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final xa4<q16> invoke(Transition.b<S> bVar) {
                        long packedValue2;
                        xa4<q16> xa4VarA;
                        if (Intrinsics.e(bVar.g(), this.this$0.n3().g())) {
                            packedValue2 = this.this$0.p3(jC);
                        } else {
                            q6c<q16> q6cVarE = this.this$0.n3().r().e(bVar.g());
                            packedValue2 = q6cVarE != null ? q6cVarE.getValue().getPackedValue() : q16.INSTANCE.a();
                        }
                        q6c<q16> q6cVarE2 = this.this$0.n3().r().e(bVar.d());
                        long packedValue3 = q6cVarE2 != null ? q6cVarE2.getValue().getPackedValue() : q16.INSTANCE.a();
                        jtb value = this.this$0.o3().getValue();
                        return (value == null || (xa4VarA = value.a(packedValue2, packedValue3)) == null) ? lr.j(0.0f, 400.0f, null, 5, null) : xa4VarA;
                    }
                }, (Function1<? super S, ? extends q16>) new Function1<S, q16>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.this$0 = this;
                    }

                    public final long a(S s) {
                        if (Intrinsics.e(s, this.this$0.n3().g())) {
                            return this.this$0.p3(jC);
                        }
                        q6c<q16> q6cVarE = this.this$0.n3().r().e(s);
                        return q6cVarE != null ? q6cVarE.getValue().getPackedValue() : q16.INSTANCE.a();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return q16.b(a(obj));
                    }
                });
                this.scope.v(q6cVarA);
                packedValue = q6cVarA.getValue().getPackedValue();
                this.lastSize = q6cVarA.getValue().getPackedValue();
            }
            return j.Q1(jVar, (int) (packedValue >> 32), (int) (packedValue & 4294967295L), null, new Function1<o.a, Unit>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((o.a) obj);
                    return Unit.a;
                }

                public final void invoke(o.a aVar2) {
                    o.a.F(aVar2, oVarR0, this.this$0.n3().getContentAlignment().a(q16.c((((long) oVarR0.getWidth()) << 32) | (((long) oVarR0.getHeight()) & 4294967295L)), packedValue, LayoutDirection.Ltr), 0.0f, 2, null);
                }
            }, 4, null);
        }

        public final AnimatedContentTransitionScopeImpl<S> n3() {
            return this.scope;
        }

        public final q6c<jtb> o3() {
            return this.sizeTransform;
        }

        public final void q3(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public final void r3(Transition<S>.a<q16, rr> aVar) {
            this.sizeAnimation = aVar;
        }

        public final void s3(q6c<? extends jtb> q6cVar) {
            this.sizeTransform = q6cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$a;", "Lcom/google/android/w19;", "", "isTarget", "<init>", "(Z)V", "Lcom/google/android/f43;", "", "parentData", "r", "(Lcom/google/android/f43;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", "d", "Lcom/google/android/o58;", "a", "()Z", "c", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements w19 {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final o58 isTarget;

        public a(boolean z) {
            this.isTarget = s0.e(Boolean.valueOf(z), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.isTarget.getValue()).booleanValue();
        }

        public final void c(boolean z) {
            this.isTarget.setValue(Boolean.valueOf(z));
        }

        @Override // com.google.inputmethod.w19
        public Object r(f43 f43Var, Object obj) {
            return this;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$b;", "S", "Lcom/google/android/uy7;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "Landroidx/compose/animation/core/Transition$a;", "Lcom/google/android/q16;", "Lcom/google/android/rr;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Lcom/google/android/q6c;", "Lcom/google/android/jtb;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/core/Transition$a;Lcom/google/android/q6c;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "d", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "node", "", "e", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;)V", "Landroidx/compose/animation/core/Transition$a;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$a;", "Lcom/google/android/q6c;", "getSizeTransform", "()Lcom/google/android/q6c;", "f", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b<S> extends uy7<SizeModifierNode<S>> {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Transition<S>.a<q16, rr> sizeAnimation;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final q6c<jtb> sizeTransform;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AnimatedContentTransitionScopeImpl<S> scope;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Transition<S>.a<q16, rr> aVar, q6c<? extends jtb> q6cVar, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
            this.sizeAnimation = aVar;
            this.sizeTransform = q6cVar;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SizeModifierNode<S> a() {
            return new SizeModifierNode<>(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        @Override // com.google.inputmethod.uy7
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(SizeModifierNode<S> node) {
            node.r3(this.sizeAnimation);
            node.s3(this.sizeTransform);
            node.q3(this.scope);
        }

        public boolean equals(Object other) {
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.e(bVar.sizeAnimation, this.sizeAnimation) && Intrinsics.e(bVar.sizeTransform, this.sizeTransform);
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            Transition<S>.a<q16, rr> aVar = this.sizeAnimation;
            return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, tc tcVar, LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = tcVar;
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k(long fullSize, long currentSize) {
        return getContentAlignment().a(fullSize, currentSize, LayoutDirection.Ltr);
    }

    private static final boolean m(o58<Boolean> o58Var) {
        return o58Var.getValue().booleanValue();
    }

    private static final void n(o58<Boolean> o58Var, boolean z) {
        o58Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long p() {
        q6c<q16> q6cVar = this.animatedSize;
        return q6cVar != null ? q6cVar.getValue().getPackedValue() : q();
    }

    private final boolean t(int i) {
        AnimatedContentTransitionScope.a.Companion companion = AnimatedContentTransitionScope.a.INSTANCE;
        if (AnimatedContentTransitionScope.a.h(i, companion.c())) {
            return true;
        }
        if (AnimatedContentTransitionScope.a.h(i, companion.e()) && this.layoutDirection == LayoutDirection.Ltr) {
            return true;
        }
        return AnimatedContentTransitionScope.a.h(i, companion.b()) && this.layoutDirection == LayoutDirection.Rtl;
    }

    private final boolean u(int i) {
        AnimatedContentTransitionScope.a.Companion companion = AnimatedContentTransitionScope.a.INSTANCE;
        if (AnimatedContentTransitionScope.a.h(i, companion.d())) {
            return true;
        }
        if (AnimatedContentTransitionScope.a.h(i, companion.e()) && this.layoutDirection == LayoutDirection.Rtl) {
            return true;
        }
        return AnimatedContentTransitionScope.a.h(i, companion.b()) && this.layoutDirection == LayoutDirection.Ltr;
    }

    @Override // androidx.compose.p000animation.AnimatedContentTransitionScope
    public h02 b(h02 h02Var, jtb jtbVar) {
        h02Var.e(jtbVar);
        return h02Var;
    }

    @Override // androidx.compose.animation.core.Transition.b
    public S d() {
        return this.transition.u().d();
    }

    @Override // androidx.compose.p000animation.AnimatedContentTransitionScope
    public f e(int towards, xa4<g16> animationSpec, final Function1<? super Integer, Integer> targetOffset) {
        if (t(towards)) {
            return EnterExitTransitionKt.J(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                public final Integer a(int i) {
                    q6c q6cVar = (q6c) this.this$0.r().e(this.this$0.s().w());
                    long j = i;
                    return (Integer) targetOffset.invoke(Integer.valueOf((-g16.k(this.this$0.k(q16.c((j & 4294967295L) | (j << 32)), q6cVar != null ? ((q16) q6cVar.getValue()).getPackedValue() : q16.INSTANCE.a()))) - i));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            });
        }
        if (u(towards)) {
            return EnterExitTransitionKt.J(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                public final Integer a(int i) {
                    q6c q6cVar = (q6c) this.this$0.r().e(this.this$0.s().w());
                    long packedValue = q6cVar != null ? ((q16) q6cVar.getValue()).getPackedValue() : q16.INSTANCE.a();
                    long j = i;
                    return (Integer) targetOffset.invoke(Integer.valueOf((-g16.k(this.this$0.k(q16.c((j & 4294967295L) | (j << 32)), packedValue))) + ((int) (packedValue >> 32))));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            });
        }
        AnimatedContentTransitionScope.a.Companion companion = AnimatedContentTransitionScope.a.INSTANCE;
        if (AnimatedContentTransitionScope.a.h(towards, companion.f())) {
            return EnterExitTransitionKt.L(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                public final Integer a(int i) {
                    q6c q6cVar = (q6c) this.this$0.r().e(this.this$0.s().w());
                    long j = i;
                    return (Integer) targetOffset.invoke(Integer.valueOf((-g16.l(this.this$0.k(q16.c((j & 4294967295L) | (j << 32)), q6cVar != null ? ((q16) q6cVar.getValue()).getPackedValue() : q16.INSTANCE.a()))) - i));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            });
        }
        return AnimatedContentTransitionScope.a.h(towards, companion.a()) ? EnterExitTransitionKt.L(animationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            public final Integer a(int i) {
                q6c q6cVar = (q6c) this.this$0.r().e(this.this$0.s().w());
                long packedValue = q6cVar != null ? ((q16) q6cVar.getValue()).getPackedValue() : q16.INSTANCE.a();
                long j = i;
                return (Integer) targetOffset.invoke(Integer.valueOf((-g16.l(this.this$0.k(q16.c((j & 4294967295L) | (j << 32)), packedValue))) + ((int) (packedValue & 4294967295L))));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }) : f.INSTANCE.a();
    }

    @Override // androidx.compose.animation.core.Transition.b
    public S g() {
        return this.transition.u().g();
    }

    @Override // androidx.compose.p000animation.AnimatedContentTransitionScope
    public d h(int towards, xa4<g16> animationSpec, final Function1<? super Integer, Integer> initialOffset) {
        if (t(towards)) {
            return EnterExitTransitionKt.D(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final Integer a(int i) {
                    long j = i;
                    return (Integer) initialOffset.invoke(Integer.valueOf(((int) (this.p() >> 32)) - g16.k(this.k(q16.c((j & 4294967295L) | (j << 32)), this.p()))));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            });
        }
        if (u(towards)) {
            return EnterExitTransitionKt.D(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final Integer a(int i) {
                    long j = i;
                    return (Integer) initialOffset.invoke(Integer.valueOf((-g16.k(this.k(q16.c((j & 4294967295L) | (j << 32)), this.p()))) - i));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            });
        }
        AnimatedContentTransitionScope.a.Companion companion = AnimatedContentTransitionScope.a.INSTANCE;
        if (AnimatedContentTransitionScope.a.h(towards, companion.f())) {
            return EnterExitTransitionKt.F(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final Integer a(int i) {
                    long j = i;
                    return (Integer) initialOffset.invoke(Integer.valueOf(((int) (this.p() & 4294967295L)) - g16.l(this.k(q16.c((4294967295L & j) | (j << 32)), this.p()))));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return a(((Number) obj).intValue());
                }
            });
        }
        return AnimatedContentTransitionScope.a.h(towards, companion.a()) ? EnterExitTransitionKt.F(animationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final Integer a(int i) {
                long j = i;
                return (Integer) initialOffset.invoke(Integer.valueOf((-g16.l(this.k(q16.c((j & 4294967295L) | (j << 32)), this.p()))) - i));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }) : d.INSTANCE.a();
    }

    public final androidx.compose.ui.b l(h02 h02Var, d dVar, int i) {
        androidx.compose.ui.b bVar;
        if (e.k()) {
            e.o(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:557)");
        }
        boolean zX = dVar.x(this);
        Object objR = dVar.R();
        Transition.a aVarP = null;
        if (zX || objR == d.INSTANCE.a()) {
            objR = s0.e(Boolean.FALSE, null, 2, null);
            dVar.L(objR);
        }
        o58 o58Var = (o58) objR;
        q6c q6cVarR = p0.r(h02Var.getSizeTransform(), dVar, 0);
        if (Intrinsics.e(this.transition.p(), this.transition.w())) {
            n(o58Var, false);
        } else if (q6cVarR.getValue() != null) {
            n(o58Var, true);
        }
        if (m(o58Var)) {
            dVar.y(1353077497);
            aVarP = TransitionKt.p(this.transition, w2e.Q(q16.INSTANCE), null, dVar, 0, 2);
            boolean zX2 = dVar.x(aVarP);
            Object objR2 = dVar.R();
            if (zX2 || objR2 == d.INSTANCE.a()) {
                jtb jtbVar = (jtb) q6cVarR.getValue();
                objR2 = (jtbVar == null || jtbVar.getClip()) ? ff1.b(androidx.compose.ui.b.INSTANCE) : androidx.compose.ui.b.INSTANCE;
                dVar.L(objR2);
            }
            bVar = (androidx.compose.ui.b) objR2;
            dVar.u();
        } else {
            dVar.y(1353343539);
            dVar.u();
            this.animatedSize = null;
            bVar = androidx.compose.ui.b.INSTANCE;
        }
        androidx.compose.ui.b bVarThen = bVar.then(new b(aVarP, q6cVarR, this));
        if (e.k()) {
            e.n();
        }
        return bVarThen;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public tc getContentAlignment() {
        return this.contentAlignment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long q() {
        return ((q16) this.measuredSize.getValue()).getPackedValue();
    }

    public final k58<S, q6c<q16>> r() {
        return this.targetSizeMap;
    }

    public final Transition<S> s() {
        return this.transition;
    }

    public final void v(q6c<q16> q6cVar) {
        this.animatedSize = q6cVar;
    }

    public void w(tc tcVar) {
        this.contentAlignment = tcVar;
    }

    public final void x(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    public final void y(long j) {
        this.measuredSize.setValue(q16.b(j));
    }
}
