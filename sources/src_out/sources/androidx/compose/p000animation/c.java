package androidx.compose.p000animation;

import androidx.compose.p000animation.core.Transition;
import com.google.inputmethod.g16;
import com.google.inputmethod.j05;
import com.google.inputmethod.q16;
import com.google.inputmethod.rr;
import com.google.inputmethod.uy7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b)\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b&\u0010'R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\b\u0013\u0010A\"\u0004\bB\u0010CR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006J"}, d2 = {"Landroidx/compose/animation/c;", "Lcom/google/android/uy7;", "Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "transition", "Landroidx/compose/animation/core/Transition$a;", "Lcom/google/android/q16;", "Lcom/google/android/rr;", "sizeAnimation", "Lcom/google/android/g16;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/d;", "enter", "Landroidx/compose/animation/f;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lcom/google/android/j05;", "graphicsLayerBlock", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/core/Transition$a;Landroidx/compose/animation/d;Landroidx/compose/animation/f;Lkotlin/jvm/functions/Function0;Lcom/google/android/j05;)V", "d", "()Landroidx/compose/animation/EnterExitTransitionModifierNode;", "node", "", "e", "(Landroidx/compose/animation/EnterExitTransitionModifierNode;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/Transition$a;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$a;", "setSizeAnimation", "(Landroidx/compose/animation/core/Transition$a;)V", "f", "getOffsetAnimation", "setOffsetAnimation", "g", "getSlideAnimation", "setSlideAnimation", "h", "Landroidx/compose/animation/d;", "getEnter", "()Landroidx/compose/animation/d;", "setEnter", "(Landroidx/compose/animation/d;)V", "i", "Landroidx/compose/animation/f;", "getExit", "()Landroidx/compose/animation/f;", "setExit", "(Landroidx/compose/animation/f;)V", "j", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "k", "Lcom/google/android/j05;", "getGraphicsLayerBlock", "()Lcom/google/android/j05;", "setGraphicsLayerBlock", "(Lcom/google/android/j05;)V", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c extends uy7<EnterExitTransitionModifierNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Transition<EnterExitState> transition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Transition<EnterExitState>.a<q16, rr> sizeAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Transition<EnterExitState>.a<g16, rr> offsetAnimation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Transition<EnterExitState>.a<g16, rr> slideAnimation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private d enter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private f exit;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Function0<Boolean> isEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private j05 graphicsLayerBlock;

    public c(Transition<EnterExitState> transition, Transition<EnterExitState>.a<q16, rr> aVar, Transition<EnterExitState>.a<g16, rr> aVar2, Transition<EnterExitState>.a<g16, rr> aVar3, d dVar, f fVar, Function0<Boolean> function0, j05 j05Var) {
        this.transition = transition;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = dVar;
        this.exit = fVar;
        this.isEnabled = function0;
        this.graphicsLayerBlock = j05Var;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public EnterExitTransitionModifierNode a() {
        return new EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(EnterExitTransitionModifierNode node) {
        node.x3(this.transition);
        node.v3(this.sizeAnimation);
        node.u3(this.offsetAnimation);
        node.w3(this.slideAnimation);
        node.q3(this.enter);
        node.r3(this.exit);
        node.p3(this.isEnabled);
        node.s3(this.graphicsLayerBlock);
    }

    public boolean equals(Object other) {
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Intrinsics.e(cVar.transition, this.transition) && Intrinsics.e(cVar.sizeAnimation, this.sizeAnimation) && Intrinsics.e(cVar.offsetAnimation, this.offsetAnimation) && Intrinsics.e(cVar.slideAnimation, this.slideAnimation) && Intrinsics.e(cVar.enter, this.enter) && Intrinsics.e(cVar.exit, this.exit) && cVar.isEnabled == this.isEnabled && Intrinsics.e(cVar.graphicsLayerBlock, this.graphicsLayerBlock);
    }

    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        Transition<EnterExitState>.a<q16, rr> aVar = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Transition<EnterExitState>.a<g16, rr> aVar2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        Transition<EnterExitState>.a<g16, rr> aVar3 = this.slideAnimation;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }
}
