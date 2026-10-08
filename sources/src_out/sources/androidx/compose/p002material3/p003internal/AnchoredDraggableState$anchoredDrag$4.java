package androidx.compose.p002material3.p003internal;

import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.rs4;
import com.google.inputmethod.cg3;
import com.google.inputmethod.qg;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@lq2(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {566}, m = "invokeSuspend")
final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements Function1<q22<? super Unit>, Object> {
    final /* synthetic */ rs4<qg, cg3<T>, T, q22<? super Unit>, Object> $block;
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlin/Pair;", "Lcom/google/android/cg3;", "<destruct>", "", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {568}, m = "invokeSuspend")
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<Pair<? extends cg3<T>, ? extends T>, q22<? super Unit>, Object> {
        final /* synthetic */ rs4<qg, cg3<T>, T, q22<? super Unit>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(rs4<? super qg, ? super cg3<T>, ? super T, ? super q22<? super Unit>, ? extends Object> rs4Var, AnchoredDraggableState<T> anchoredDraggableState, q22<? super AnonymousClass2> q22Var) {
            super(2, q22Var);
            this.$block = rs4Var;
            this.this$0 = anchoredDraggableState;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair<? extends cg3<T>, ? extends T> pair, q22<? super Unit> q22Var) {
            return create(pair, q22Var).invokeSuspend(Unit.a);
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
                Pair pair = (Pair) this.L$0;
                cg3 cg3Var = (cg3) pair.a();
                Object objB = pair.b();
                rs4<qg, cg3<T>, T, q22<? super Unit>, Object> rs4Var = this.$block;
                qg qgVar = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                if (rs4Var.invoke(qgVar, cg3Var, objB, this) == objG) {
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
    AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState<T> anchoredDraggableState, T t, rs4<? super qg, ? super cg3<T>, ? super T, ? super q22<? super Unit>, ? extends Object> rs4Var, q22<? super AnchoredDraggableState$anchoredDrag$4> q22Var) {
        super(1, q22Var);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = t;
        this.$block = rs4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair l(AnchoredDraggableState anchoredDraggableState) {
        return qjd.a(anchoredDraggableState.p(), anchoredDraggableState.y());
    }

    public final q22<Unit> create(q22<?> q22Var) {
        return new AnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, this.$block, q22Var);
    }

    public final Object invoke(q22<? super Unit> q22Var) {
        return create(q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            this.this$0.F(this.$targetValue);
            final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            Function0 function0 = new Function0() { // from class: androidx.compose.material3.internal.c
                public final Object invoke() {
                    return AnchoredDraggableState$anchoredDrag$4.l(anchoredDraggableState);
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
            this.label = 1;
            if (AnchoredDraggableKt.g(function0, anonymousClass2, this) == objG) {
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
