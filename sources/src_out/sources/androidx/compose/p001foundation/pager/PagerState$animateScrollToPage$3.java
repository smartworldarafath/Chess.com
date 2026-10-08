package androidx.compose.p001foundation.pager;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.kr;
import com.google.inputmethod.oz8;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qu6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/p9b;", "", "<anonymous>", "(Lcom/google/android/p9b;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {672}, m = "invokeSuspend", v = 1)
final class PagerState$animateScrollToPage$3 extends SuspendLambda implements Function2<p9b, q22<? super Unit>, Object> {
    final /* synthetic */ kr<Float> $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$animateScrollToPage$3(PagerState pagerState, int i, float f, kr<Float> krVar, q22<? super PagerState$animateScrollToPage$3> q22Var) {
        super(2, q22Var);
        this.this$0 = pagerState;
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = krVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(PagerState pagerState, p9b p9bVar, int i) {
        pagerState.B0(p9bVar, i);
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, q22Var);
        pagerState$animateScrollToPage$3.L$0 = obj;
        return pagerState$animateScrollToPage$3;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            qu6 qu6VarA = oz8.a(this.this$0, (p9b) this.L$0);
            int i2 = this.$targetPage;
            float f = this.$targetPageOffsetToSnappedPosition;
            kr<Float> krVar = this.$animationSpec;
            final PagerState pagerState = this.this$0;
            Function2 function2 = new Function2() { // from class: androidx.compose.foundation.pager.i
                public final Object invoke(Object obj2, Object obj3) {
                    return PagerState$animateScrollToPage$3.m(pagerState, (p9b) obj2, ((Integer) obj3).intValue());
                }
            };
            this.label = 1;
            if (j.f(qu6VarA, i2, f, krVar, function2, this) == objG) {
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

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object invoke(p9b p9bVar, q22<? super Unit> q22Var) {
        return create(p9bVar, q22Var).invokeSuspend(Unit.a);
    }
}
