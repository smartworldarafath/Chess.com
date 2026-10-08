package androidx.compose.p001foundation.gestures;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.inputmethod.dg3;
import com.google.inputmethod.rg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {1159}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    final /* synthetic */ ps4<rg, dg3<T>, q22<? super Unit>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/google/android/dg3;", "latestAnchors", "", "<anonymous>", "(Lcom/google/android/dg3;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {1160}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<dg3<T>, q22<? super Unit>, Object> {
        final /* synthetic */ ps4<rg, dg3<T>, q22<? super Unit>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(ps4<? super rg, ? super dg3<T>, ? super q22<? super Unit>, ? extends Object> ps4Var, AnchoredDraggableState<T> anchoredDraggableState, q22<? super AnonymousClass2> q22Var) {
            super(2, q22Var);
            this.$block = ps4Var;
            this.this$0 = anchoredDraggableState;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dg3<T> dg3Var, q22<? super Unit> q22Var) {
            return create(dg3Var, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, q22Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                dg3 dg3Var = (dg3) this.L$0;
                ps4<rg, dg3<T>, q22<? super Unit>, Object> ps4Var = this.$block;
                AnchoredDraggableState.b bVar = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                if (ps4Var.invoke(bVar, dg3Var, this) == objG) {
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
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState<T> anchoredDraggableState, ps4<? super rg, ? super dg3<T>, ? super q22<? super Unit>, ? extends Object> ps4Var, q22<? super AnchoredDraggableState$anchoredDrag$2> q22Var) {
        super(1, q22Var);
        this.this$0 = anchoredDraggableState;
        this.$block = ps4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dg3 l(AnchoredDraggableState anchoredDraggableState) {
        return anchoredDraggableState.q();
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new AnchoredDraggableState$anchoredDrag$2(this.this$0, this.$block, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            Function0 function0 = new Function0() { // from class: androidx.compose.foundation.gestures.e
                public final Object invoke() {
                    return AnchoredDraggableState$anchoredDrag$2.l(anchoredDraggableState);
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
            this.label = 1;
            if (AnchoredDraggableKt.B(function0, anonymousClass2, this) == objG) {
                return objG;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        Object objB = this.this$0.q().b(this.this$0.w());
        if (objB != null) {
            if (Math.abs(this.this$0.w() - this.this$0.q().c(objB)) < 0.5f && ((Boolean) this.this$0.r().invoke(objB)).booleanValue()) {
                this.this$0.O(objB);
                this.this$0.I(objB);
            }
        }
        return Unit.a;
    }
}
