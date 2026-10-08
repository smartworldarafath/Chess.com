package androidx.compose.p002material3;

import androidx.compose.p000animation.core.SuspendAnimationKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rs4;
import com.google.inputmethod.cg3;
import com.google.inputmethod.qg;
import com.google.inputmethod.xa4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/android/qg;", "Lcom/google/android/cg3;", "Landroidx/compose/material3/SheetValue;", "anchors", "latestTarget", "", "<anonymous>", "(Lcom/google/android/qg;Lcom/google/android/cg3;Landroidx/compose/material3/SheetValue;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", l = {245}, m = "invokeSuspend")
final class SheetState$animateTo$2 extends SuspendLambda implements rs4<qg, cg3<SheetValue>, SheetValue, q22<? super Unit>, Object> {
    final /* synthetic */ xa4<Float> $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ SheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SheetState$animateTo$2(SheetState sheetState, float f, xa4<Float> xa4Var, q22<? super SheetState$animateTo$2> q22Var) {
        super(4, q22Var);
        this.this$0 = sheetState;
        this.$velocity = f;
        this.$animationSpec = xa4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(qg qgVar, Ref.FloatRef floatRef, float f, float f2) {
        qgVar.a(f, f2);
        floatRef.element = f;
        return Unit.a;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final qg qgVar = (qg) this.L$0;
            float fC = ((cg3) this.L$1).c((SheetValue) this.L$2);
            if (!Float.isNaN(fC)) {
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                float fL = Float.isNaN(this.this$0.l()) ? 0.0f : this.this$0.l();
                floatRef.element = fL;
                float f = this.$velocity;
                xa4<Float> xa4Var = this.$animationSpec;
                Function2 function2 = new Function2() { // from class: androidx.compose.material3.n1
                    public final Object invoke(Object obj2, Object obj3) {
                        return SheetState$animateTo$2.m(qgVar, floatRef, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (SuspendAnimationKt.j(fL, fC, f, xa4Var, function2, this) == objG) {
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
    public final Object invoke(qg qgVar, cg3<SheetValue> cg3Var, SheetValue sheetValue, q22<? super Unit> q22Var) {
        SheetState$animateTo$2 sheetState$animateTo$2 = new SheetState$animateTo$2(this.this$0, this.$velocity, this.$animationSpec, q22Var);
        sheetState$animateTo$2.L$0 = qgVar;
        sheetState$animateTo$2.L$1 = cg3Var;
        sheetState$animateTo$2.L$2 = sheetValue;
        return sheetState$animateTo$2.invokeSuspend(Unit.a);
    }
}
