package androidx.compose.p002material3.p003internal;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rs4;
import com.google.inputmethod.cg3;
import com.google.inputmethod.kr;
import com.google.inputmethod.qg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Lcom/google/android/qg;", "Lcom/google/android/cg3;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {682}, m = "invokeSuspend")
final class AnchoredDraggableKt$animateTo$2<T> extends SuspendLambda implements rs4<qg, cg3<T>, T, q22<? super Unit>, Object> {
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$animateTo$2(AnchoredDraggableState<T> anchoredDraggableState, float f, q22<? super AnchoredDraggableKt$animateTo$2> q22Var) {
        super(4, q22Var);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(qg qgVar, Ref.FloatRef floatRef, float f, float f2) {
        qgVar.a(f, f2);
        floatRef.element = f;
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final qg qgVar = (qg) this.L$0;
            float fC = ((cg3) this.L$1).c(this.L$2);
            if (!Float.isNaN(fC)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float fX = Float.isNaN(this.$this_animateTo.x()) ? 0.0f : this.$this_animateTo.x();
                floatRef.element = fX;
                float f = this.$velocity;
                kr krVar = (kr) this.$this_animateTo.q().invoke();
                Function2 function2 = new Function2() { // from class: androidx.compose.material3.internal.a
                    public final Object invoke(Object obj2, Object obj3) {
                        return AnchoredDraggableKt$animateTo$2.m(qgVar, floatRef, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (SuspendAnimationKt.j(fX, fC, f, krVar, function2, this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qg qgVar, cg3<T> cg3Var, T t, q22<? super Unit> q22Var) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, this.$velocity, q22Var);
        anchoredDraggableKt$animateTo$2.L$0 = qgVar;
        anchoredDraggableKt$animateTo$2.L$1 = cg3Var;
        anchoredDraggableKt$animateTo$2.L$2 = t;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(Unit.a);
    }
}
