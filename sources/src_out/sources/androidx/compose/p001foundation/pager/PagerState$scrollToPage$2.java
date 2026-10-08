package androidx.compose.p001foundation.pager;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.cx5;
import com.google.inputmethod.p9b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/p9b;", "", "<anonymous>", "(Lcom/google/android/p9b;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {551}, m = "invokeSuspend", v = 1)
final class PagerState$scrollToPage$2 extends SuspendLambda implements Function2<p9b, q22<? super Unit>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$scrollToPage$2(PagerState pagerState, float f, int i, q22<? super PagerState$scrollToPage$2> q22Var) {
        super(2, q22Var);
        this.this$0 = pagerState;
        this.$pageOffsetFraction = f;
        this.$page = i;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(p9b p9bVar, q22<? super Unit> q22Var) {
        return create(p9bVar, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new PagerState$scrollToPage$2(this.this$0, this.$pageOffsetFraction, this.$page, q22Var);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            PagerState pagerState = this.this$0;
            this.label = 1;
            if (pagerState.s(this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        float f = this.$pageOffsetFraction;
        double d = f;
        boolean z = false;
        if (-0.5d <= d && d <= 0.5d) {
            z = true;
        }
        if (!z) {
            cx5.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.this$0.y0(this.this$0.w(this.$page), this.$pageOffsetFraction, true);
        return Unit.a;
    }
}
