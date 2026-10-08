package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qg4;
import com.google.inputmethod.ve8;
import com.google.inputmethod.we8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ve8;", "", "<anonymous>", "(Lcom/google/android/ve8;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {921}, m = "invokeSuspend", v = 1)
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements Function2<ve8, q22<? super Unit>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref.LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/ScrollingLogic$doFlingAnimation$2$a", "Lcom/google/android/p9b;", "", "pixels", "e", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p9b {
        final /* synthetic */ ScrollingLogic a;
        final /* synthetic */ ve8 b;

        a(ScrollingLogic scrollingLogic, ve8 ve8Var) {
            this.a = scrollingLogic;
            this.b = ve8Var;
        }

        @Override // com.google.inputmethod.p9b
        public float e(float pixels) {
            if (Math.abs(pixels) != 0.0f && !((Boolean) this.a.isScrollableNodeAttached.invoke()).booleanValue()) {
                throw new FlingCancellationException();
            }
            ScrollingLogic scrollingLogic = this.a;
            return scrollingLogic.z(scrollingLogic.G(this.b.a(scrollingLogic.A(scrollingLogic.H(pixels)), we8.INSTANCE.a())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j, q22<? super ScrollingLogic$doFlingAnimation$2> q22Var) {
        super(2, q22Var);
        this.this$0 = scrollingLogic;
        this.$result = longRef;
        this.$available = j;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ve8 ve8Var, q22<? super Unit> q22Var) {
        return create(ve8Var, q22Var).invokeSuspend(Unit.a);
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, q22Var);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Ref.LongRef longRef;
        ScrollingLogic scrollingLogic2;
        long j;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            a aVar = new a(this.this$0, (ve8) this.L$0);
            scrollingLogic = this.this$0;
            Ref.LongRef longRef2 = this.$result;
            long j2 = this.$available;
            qg4 qg4Var = scrollingLogic.flingBehavior;
            long j3 = longRef2.element;
            float fZ = scrollingLogic.z(scrollingLogic.F(j2));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = longRef2;
            this.J$0 = j3;
            this.label = 1;
            Object objA = qg4Var.a(aVar, fZ, this);
            if (objA == objG) {
                return objG;
            }
            longRef = longRef2;
            obj = objA;
            scrollingLogic2 = scrollingLogic;
            j = j3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            longRef = (Ref.LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            f.b(obj);
        }
        longRef.element = scrollingLogic.L(j, scrollingLogic2.z(((Number) obj).floatValue()));
        return Unit.a;
    }
}
