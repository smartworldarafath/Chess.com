package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.rn8;
import com.google.inputmethod.ve8;
import com.google.inputmethod.we8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ve8;", "", "<anonymous>", "(Lcom/google/android/ve8;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {370}, m = "invokeSuspend", v = 1)
final class ScrollableNode$drag$2$1 extends SuspendLambda implements Function2<ve8, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<Function1<? super l.b, Unit>, q22<? super Unit>, Object> $forEachDelta;
    final /* synthetic */ ScrollingLogic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNode$drag$2$1(Function2<? super Function1<? super l.b, Unit>, ? super q22<? super Unit>, ? extends Object> function2, ScrollingLogic scrollingLogic, q22<? super ScrollableNode$drag$2$1> q22Var) {
        super(2, q22Var);
        this.$forEachDelta = function2;
        this.$this_with = scrollingLogic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(ve8 ve8Var, ScrollingLogic scrollingLogic, l.b bVar) {
        ve8Var.a(rn8.r(scrollingLogic.D(bVar.getDelta()), bVar.getIsIndirectPointerEvent() ? -1.0f : 1.0f), we8.INSTANCE.b());
        return Unit.a;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, q22Var);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final ve8 ve8Var = (ve8) this.L$0;
            Function2<Function1<? super l.b, Unit>, q22<? super Unit>, Object> function2 = this.$forEachDelta;
            final ScrollingLogic scrollingLogic = this.$this_with;
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.t
                public final Object invoke(Object obj2) {
                    return ScrollableNode$drag$2$1.m(ve8Var, scrollingLogic, (l.b) obj2);
                }
            };
            this.label = 1;
            if (function2.invoke(function1, this) == objG) {
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
    public final Object invoke(ve8 ve8Var, q22<? super Unit> q22Var) {
        return create(ve8Var, q22Var).invokeSuspend(Unit.a);
    }
}
