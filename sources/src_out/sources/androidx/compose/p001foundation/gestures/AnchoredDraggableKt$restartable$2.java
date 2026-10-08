package androidx.compose.p001foundation.gestures;

import androidx.compose.p004runtime.p0;
import com.google.android.ai4;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.android.ui4;
import com.google.inputmethod.t04;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.j;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
@lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {1580}, m = "invokeSuspend", v = 1)
final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
    final /* synthetic */ Function2<I, q22<? super Unit>, Object> $block;
    final /* synthetic */ Function0<I> $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class AnonymousClass1<T> implements ui4 {
        final /* synthetic */ Ref.ObjectRef<s> a;
        final /* synthetic */ ta2 b;
        final /* synthetic */ Function2<I, q22<? super Unit>, Object> c;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
        @lq2(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {1587}, m = "invokeSuspend", v = 1)
        static final class AnonymousClass2 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
            final /* synthetic */ ta2 $$this$coroutineScope;
            final /* synthetic */ Function2<I, q22<? super Unit>, Object> $block;
            final /* synthetic */ I $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function2<? super I, ? super q22<? super Unit>, ? extends Object> function2, I i, ta2 ta2Var, q22<? super AnonymousClass2> q22Var) {
                super(2, q22Var);
                this.$block = function2;
                this.$latestInputs = i;
                this.$$this$coroutineScope = ta2Var;
            }

            public final q22<Unit> create(Object obj, q22<?> q22Var) {
                return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, q22Var);
            }

            public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
                return create(ta2Var, q22Var).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object objG = a.g();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    Function2<I, q22<? super Unit>, Object> function2 = this.$block;
                    I i2 = this.$latestInputs;
                    this.label = 1;
                    if (function2.invoke(i2, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                j.d(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Ref.ObjectRef<s> objectRef, ta2 ta2Var, Function2<? super I, ? super q22<? super Unit>, ? extends Object> function2) {
            this.a = objectRef;
            this.b = ta2Var;
            this.c = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object emit(I i, q22<? super Unit> q22Var) {
            AnchoredDraggableKt$restartable$2$1$emit$1 anchoredDraggableKt$restartable$2$1$emit$1;
            Object obj;
            if (q22Var instanceof AnchoredDraggableKt$restartable$2$1$emit$1) {
                anchoredDraggableKt$restartable$2$1$emit$1 = (AnchoredDraggableKt$restartable$2$1$emit$1) q22Var;
                int i2 = anchoredDraggableKt$restartable$2$1$emit$1.label;
                if ((i2 & t04.INVALID_ID) != 0) {
                    anchoredDraggableKt$restartable$2$1$emit$1.label = i2 - t04.INVALID_ID;
                } else {
                    anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, q22Var);
                }
            } else {
                anchoredDraggableKt$restartable$2$1$emit$1 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, q22Var);
            }
            Object obj2 = anchoredDraggableKt$restartable$2$1$emit$1.result;
            Object objG = a.g();
            int i3 = anchoredDraggableKt$restartable$2$1$emit$1.label;
            if (i3 == 0) {
                f.b(obj2);
                s sVar = (s) this.a.element;
                if (sVar != null) {
                    sVar.k(new AnchoredDragFinishedSignal());
                    anchoredDraggableKt$restartable$2$1$emit$1.L$0 = i;
                    anchoredDraggableKt$restartable$2$1$emit$1.L$1 = sVar;
                    anchoredDraggableKt$restartable$2$1$emit$1.label = 1;
                    if (sVar.f1(anchoredDraggableKt$restartable$2$1$emit$1) == objG) {
                        obj = i;
                        obj = i;
                        return objG;
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = anchoredDraggableKt$restartable$2$1$emit$1.L$0;
                f.b(obj2);
                obj = obj3;
            }
            obj = i;
            obj = i;
            obj = i;
            Ref.ObjectRef<s> objectRef = this.a;
            ta2 ta2Var = this.b;
            objectRef.element = rw0.d(ta2Var, (CoroutineContext) null, CoroutineStart.d, new AnonymousClass2(this.c, obj, ta2Var, null), 1, (Object) null);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableKt$restartable$2(Function0<? extends I> function0, Function2<? super I, ? super q22<? super Unit>, ? extends Object> function2, q22<? super AnchoredDraggableKt$restartable$2> q22Var) {
        super(2, q22Var);
        this.$inputs = function0;
        this.$block = function2;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, q22Var);
        anchoredDraggableKt$restartable$2.L$0 = obj;
        return anchoredDraggableKt$restartable$2;
    }

    public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
        return create(ta2Var, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ta2 ta2Var = (ta2) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ai4 ai4VarS = p0.s(this.$inputs);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, ta2Var, this.$block);
            this.label = 1;
            if (ai4VarS.collect(anonymousClass1, this) == objG) {
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
