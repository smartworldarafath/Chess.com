package androidx.compose.p001foundation.relocation;

import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.du0;
import com.google.inputmethod.gba;
import com.google.inputmethod.kn6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "Lkotlinx/coroutines/s;", "<anonymous>", "(Lcom/google/android/ta2;)Lkotlinx/coroutines/s;"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend", v = 1)
final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements Function2<ta2, q22<? super s>, Object> {
    final /* synthetic */ Function0<gba> $boundsProvider;
    final /* synthetic */ kn6 $childCoordinates;
    final /* synthetic */ Function0<gba> $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ Function0<gba> $boundsProvider;
        final /* synthetic */ kn6 $childCoordinates;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final /* synthetic */ class C00231 extends FunctionReferenceImpl implements Function0<gba> {
            final /* synthetic */ Function0<gba> $boundsProvider;
            final /* synthetic */ kn6 $childCoordinates;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00231(BringIntoViewResponderNode bringIntoViewResponderNode, kn6 kn6Var, Function0<gba> function0) {
                super(0, Intrinsics.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = kn6Var;
                this.$boundsProvider = function0;
            }

            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final gba invoke() {
                return BringIntoViewResponderNode.p3(this.this$0, this.$childCoordinates, this.$boundsProvider);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, kn6 kn6Var, Function0<gba> function0, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.this$0 = bringIntoViewResponderNode;
            this.$childCoordinates = kn6Var;
            this.$boundsProvider = function0;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                du0 responder = this.this$0.getResponder();
                C00231 c00231 = new C00231(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                if (responder.W(c00231, this) == objG) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ Function0<gba> $parentRect;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, Function0<gba> function0, q22<? super AnonymousClass2> q22Var) {
            super(2, q22Var);
            this.this$0 = bringIntoViewResponderNode;
            this.$parentRect = function0;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass2(this.this$0, this.$parentRect, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                BringIntoViewResponderNode bringIntoViewResponderNode = this.this$0;
                Function0<gba> function0 = this.$parentRect;
                this.label = 1;
                if (BringIntoViewModifierNodeKt.a(bringIntoViewResponderNode, function0, this) == objG) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BringIntoViewResponderNode$bringIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, kn6 kn6Var, Function0<gba> function0, Function0<gba> function1, q22<? super BringIntoViewResponderNode$bringIntoView$2> q22Var) {
        super(2, q22Var);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = kn6Var;
        this.$boundsProvider = function0;
        this.$parentRect = function1;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, q22Var);
        bringIntoViewResponderNode$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super s> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        ta2 ta2Var = (ta2) this.L$0;
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3, (Object) null);
        return rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3, (Object) null);
    }
}
