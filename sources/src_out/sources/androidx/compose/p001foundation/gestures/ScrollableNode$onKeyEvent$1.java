package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.ve8;
import com.google.inputmethod.we8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {552}, m = "invokeSuspend", v = 1)
final class ScrollableNode$onKeyEvent$1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ long $scrollAmount;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ve8;", "", "<anonymous>", "(Lcom/google/android/ve8;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ve8, q22<? super Unit>, Object> {
        final /* synthetic */ long $scrollAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$scrollAmount = j;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ve8 ve8Var, q22<? super Unit> q22Var) {
            return create(ve8Var, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, q22Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invokeSuspend(Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            ((ve8) this.L$0).b(this.$scrollAmount, we8.INSTANCE.b());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j, q22<? super ScrollableNode$onKeyEvent$1> q22Var) {
        super(2, q22Var);
        this.this$0 = scrollableNode;
        this.$scrollAmount = j;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, q22Var);
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ScrollingLogic scrollingLogic = this.this$0.scrollingLogic;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, null);
            this.label = 1;
            if (scrollingLogic.B(mutatePriority, anonymousClass1, this) == objG) {
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
