package androidx.compose.p002material3;

import androidx.compose.p000animation.core.Animatable;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.c08;
import com.google.inputmethod.cs1;
import com.google.inputmethod.d08;
import com.google.inputmethod.ff3;
import com.google.inputmethod.kh7;
import com.google.inputmethod.kr;
import com.google.inputmethod.lr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", l = {1611}, m = "invokeSuspend")
final class C0183IndicatorLineNode$invalidateIndicator$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    int label;
    final /* synthetic */ IndicatorLineNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0183IndicatorLineNode$invalidateIndicator$2(IndicatorLineNode indicatorLineNode, q22<? super C0183IndicatorLineNode$invalidateIndicator$2> q22Var) {
        super(2, q22Var);
        this.this$0 = indicatorLineNode;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new C0183IndicatorLineNode$invalidateIndicator$2(this.this$0, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Animatable animatable = this.this$0.widthAnimatable;
            ff3 ff3VarE = ff3.e((this.this$0.focused && this.this$0.enabled) ? this.this$0.focusedIndicatorWidth : this.this$0.unfocusedIndicatorWidth);
            kr krVarA = this.this$0.enabled ? d08.a((c08) cs1.a(this.this$0, kh7.a.b()), MotionSchemeKeyTokens.FastSpatial) : lr.h(0, 1, null);
            this.label = 1;
            if (Animatable.f(animatable, ff3VarE, krVarA, null, null, this, 12, null) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return Unit.a;
    }
}
