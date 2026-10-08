package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rs4;
import com.google.inputmethod.dg3;
import com.google.inputmethod.jr;
import com.google.inputmethod.kr;
import com.google.inputmethod.rg;
import com.google.inputmethod.vq2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Lcom/google/android/rg;", "Lcom/google/android/dg3;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1425, 1443, 1467}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableKt$animateToWithDecay$2<T> extends SuspendLambda implements rs4<rg, dg3<T>, T, q22<? super Unit>, Object> {
    final /* synthetic */ vq2<Float> $decayAnimationSpec;
    final /* synthetic */ Ref.FloatRef $remainingVelocity;
    final /* synthetic */ kr<Float> $snapAnimationSpec;
    final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateToWithDecay$2(AnchoredDraggableState<T> anchoredDraggableState, float f, kr<Float> krVar, Ref.FloatRef floatRef, vq2<Float> vq2Var, q22<? super AnchoredDraggableKt$animateToWithDecay$2> q22Var) {
        super(4, q22Var);
        this.$this_animateToWithDecay = anchoredDraggableState;
        this.$velocity = f;
        this.$snapAnimationSpec = krVar;
        this.$remainingVelocity = floatRef;
        this.$decayAnimationSpec = vq2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(float f, Ref.FloatRef floatRef, rg rgVar, Ref.FloatRef floatRef2, jr jrVar) {
        if ((((Number) jrVar.e()).floatValue() >= f || floatRef.element <= f) && (((Number) jrVar.e()).floatValue() <= f || floatRef.element >= f)) {
            rgVar.a(((Number) jrVar.e()).floatValue(), ((Number) jrVar.f()).floatValue());
            floatRef2.element = ((Number) jrVar.f()).floatValue();
            floatRef.element = ((Number) jrVar.e()).floatValue();
        } else {
            float fY = AnchoredDraggableKt.y(((Number) jrVar.e()).floatValue(), f);
            rgVar.a(fY, ((Number) jrVar.f()).floatValue());
            floatRef2.element = Float.isNaN(((Number) jrVar.f()).floatValue()) ? 0.0f : ((Number) jrVar.f()).floatValue();
            floatRef.element = fY;
            jrVar.a();
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        if (androidx.compose.p000animation.core.SuspendAnimationKt.v(r1, r1, false, r3, r24, 2, null) == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (androidx.compose.p001foundation.gestures.AnchoredDraggableKt.u(r0, r11, r0, r4, r5, r5, r24) == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
    
        if (androidx.compose.p001foundation.gestures.AnchoredDraggableKt.u(r0, r12, r0, r4, r5, r5, r24) == r7) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object invoke(rg rgVar, dg3<T> dg3Var, T t, q22<? super Unit> q22Var) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, q22Var);
        anchoredDraggableKt$animateToWithDecay$2.L$0 = rgVar;
        anchoredDraggableKt$animateToWithDecay$2.L$1 = dg3Var;
        anchoredDraggableKt$animateToWithDecay$2.L$2 = t;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(Unit.a);
    }
}
