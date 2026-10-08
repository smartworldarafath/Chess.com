package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.rn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/rn8;", "offset", "<anonymous>", "(Lcom/google/android/rn8;)Lcom/google/android/rn8;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {610}, m = "invokeSuspend", v = 1)
final class ScrollableNode$setScrollSemanticsActions$2 extends SuspendLambda implements Function2<rn8, q22<? super rn8>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNode$setScrollSemanticsActions$2(ScrollableNode scrollableNode, q22<? super ScrollableNode$setScrollSemanticsActions$2> q22Var) {
        super(2, q22Var);
        this.this$0 = scrollableNode;
    }

    public final Object a(long j, q22<? super rn8> q22Var) {
        return create(rn8.d(j), q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, q22Var);
        scrollableNode$setScrollSemanticsActions$2.J$0 = ((rn8) obj).getPackedValue();
        return scrollableNode$setScrollSemanticsActions$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((rn8) obj).getPackedValue(), (q22) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return obj;
        }
        f.b(obj);
        long j = this.J$0;
        ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
        this.label = 1;
        Object objN = ScrollableKt.n(scrollingLogic, j, this);
        return objN == objG ? objG : objN;
    }
}
