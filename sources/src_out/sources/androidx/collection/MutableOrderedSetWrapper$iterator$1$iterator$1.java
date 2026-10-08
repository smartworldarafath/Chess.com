package androidx.collection;

import com.google.android.ggb;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.inputmethod.lo6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lcom/google/android/ggb;", "", "<anonymous>", "(Lcom/google/android/ggb;)V"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0})
@lq2(c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", f = "OrderedScatterSet.kt", l = {1489}, m = "invokeSuspend")
final class MutableOrderedSetWrapper$iterator$1$iterator$1<E> extends RestrictedSuspendLambda implements Function2<ggb<? super E>, q22<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableOrderedSetWrapper<E> this$0;
    final /* synthetic */ MutableOrderedSetWrapper.AnonymousClass1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableOrderedSetWrapper$iterator$1$iterator$1(MutableOrderedSetWrapper<E> mutableOrderedSetWrapper, MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1, q22<? super MutableOrderedSetWrapper$iterator$1$iterator$1> q22Var) {
        super(2, q22Var);
        this.this$0 = mutableOrderedSetWrapper;
        this.this$1 = anonymousClass1;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, q22Var);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    public final Object invoke(ggb<? super E> ggbVar, q22<? super Unit> q22Var) {
        return create(ggbVar, q22Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        MutableOrderedSetWrapper<E> mutableOrderedSetWrapper;
        int i;
        MutableOrderedSetWrapper.AnonymousClass1 anonymousClass1;
        long[] jArr;
        ggb ggbVar;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = this.label;
        if (i2 == 0) {
            f.b(obj);
            ggb ggbVar2 = (ggb) this.L$0;
            c cVar = ((MutableOrderedSetWrapper) this.this$0).parent;
            MutableOrderedSetWrapper.AnonymousClass1 anonymousClass2 = this.this$1;
            mutableOrderedSetWrapper = this.this$0;
            long[] jArr2 = cVar.nodes;
            i = cVar.tail;
            anonymousClass1 = anonymousClass2;
            jArr = jArr2;
            ggbVar = ggbVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            jArr = (long[]) this.L$3;
            mutableOrderedSetWrapper = (MutableOrderedSetWrapper) this.L$2;
            anonymousClass1 = (MutableOrderedSetWrapper.AnonymousClass1) this.L$1;
            ggbVar = (ggb) this.L$0;
            f.b(obj);
        }
        while (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            anonymousClass1.a(i);
            Object obj2 = ((MutableOrderedSetWrapper) mutableOrderedSetWrapper).parent.elements[i];
            this.L$0 = ggbVar;
            this.L$1 = anonymousClass1;
            this.L$2 = mutableOrderedSetWrapper;
            this.L$3 = jArr;
            this.I$0 = i3;
            this.label = 1;
            if (ggbVar.a(obj2, this) == objG) {
                return objG;
            }
            i = i3;
        }
        return Unit.a;
    }
}
