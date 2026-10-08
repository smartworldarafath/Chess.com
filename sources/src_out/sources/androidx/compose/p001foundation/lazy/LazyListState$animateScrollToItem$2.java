package androidx.compose.p001foundation.lazy;

import androidx.compose.p001foundation.lazy.layout.LazyLayoutScrollScopeKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.ew6;
import com.google.inputmethod.f43;
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
@lq2(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {587}, m = "invokeSuspend", v = 1)
final class LazyListState$animateScrollToItem$2 extends SuspendLambda implements Function2<p9b, q22<? super Unit>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyListState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListState$animateScrollToItem$2(LazyListState lazyListState, int i, int i2, q22<? super LazyListState$animateScrollToItem$2> q22Var) {
        super(2, q22Var);
        this.this$0 = lazyListState;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(p9b p9bVar, q22<? super Unit> q22Var) {
        return create(p9bVar, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, q22Var);
        lazyListState$animateScrollToItem$2.L$0 = obj;
        return lazyListState$animateScrollToItem$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            qu6 qu6VarA = ew6.a(this.this$0, (p9b) this.L$0);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            f43 f43VarW = this.this$0.w();
            this.label = 1;
            if (LazyLayoutScrollScopeKt.c(qu6VarA, i2, i3, 100, f43VarW, this) == objG) {
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
