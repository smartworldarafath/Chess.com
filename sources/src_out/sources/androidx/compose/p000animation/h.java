package androidx.compose.p000animation;

import com.google.inputmethod.q16;
import com.google.inputmethod.tc;
import com.google.inputmethod.uy7;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/animation/h;", "Lcom/google/android/uy7;", "Landroidx/compose/animation/SizeAnimationModifierNode;", "Lcom/google/android/xa4;", "Lcom/google/android/q16;", "animationSpec", "Lcom/google/android/tc;", "alignment", "Lkotlin/Function2;", "", "finishedListener", "<init>", "(Lcom/google/android/xa4;Lcom/google/android/tc;Lkotlin/jvm/functions/Function2;)V", "d", "()Landroidx/compose/animation/SizeAnimationModifierNode;", "node", "e", "(Landroidx/compose/animation/SizeAnimationModifierNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/xa4;", "getAnimationSpec", "()Lcom/google/android/xa4;", "Lcom/google/android/tc;", "getAlignment", "()Lcom/google/android/tc;", "f", "Lkotlin/jvm/functions/Function2;", "getFinishedListener", "()Lkotlin/jvm/functions/Function2;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h extends uy7<SizeAnimationModifierNode> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final xa4<q16> animationSpec;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final tc alignment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function2<q16, q16, Unit> finishedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public h(xa4<q16> xa4Var, tc tcVar, Function2<? super q16, ? super q16, Unit> function2) {
        this.animationSpec = xa4Var;
        this.alignment = tcVar;
        this.finishedListener = function2;
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SizeAnimationModifierNode a() {
        return new SizeAnimationModifierNode(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // com.google.inputmethod.uy7
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(SizeAnimationModifierNode node) {
        node.t3(this.animationSpec);
        node.u3(this.finishedListener);
        node.r3(this.alignment);
    }

    public boolean equals(Object other) {
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return Intrinsics.e(hVar.animationSpec, this.animationSpec) && hVar.finishedListener == this.finishedListener && Intrinsics.e(hVar.alignment, this.alignment);
    }

    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        Function2<q16, q16, Unit> function2 = this.finishedListener;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }
}
