package androidx.datastore.p007core;

import com.google.android.lq2;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ui4;
import com.google.android.ut0;
import com.google.inputmethod.o6c;
import com.google.inputmethod.ol2;
import com.google.inputmethod.ua4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/google/android/ui4;", "", "<anonymous>", "(Lcom/google/android/ui4;)V"}, k = 3, mv = {2, 0, 0})
@lq2(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {69, 71, 98}, m = "invokeSuspend", v = 1)
final class DataStoreImpl$data$1<T> extends SuspendLambda implements Function2<ui4<? super T>, q22<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/google/android/ui4;", "Lcom/google/android/o6c;", "", "<anonymous>", "(Lcom/google/android/ui4;)V"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {100}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ui4<? super o6c<T>>, q22<? super Unit>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataStoreImpl<T> dataStoreImpl, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.this$0 = dataStoreImpl;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass1(this.this$0, q22Var);
        }

        public final Object invoke(ui4<? super o6c<T>> ui4Var, q22<? super Unit> q22Var) {
            return create(ui4Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.y(this) == objG) {
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

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/google/android/o6c;", "it", "", "<anonymous>", "(Lcom/google/android/o6c;)Z"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass2 extends SuspendLambda implements Function2<o6c<T>, q22<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(q22<? super AnonymousClass2> q22Var) {
            super(2, q22Var);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o6c<T> o6cVar, q22<? super Boolean> q22Var) {
            return create(o6cVar, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(q22Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invokeSuspend(Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return ut0.a(!(((o6c) this.L$0) instanceof ua4));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/google/android/o6c;", "it", "", "<anonymous>", "(Lcom/google/android/o6c;)Z"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass3 extends SuspendLambda implements Function2<o6c<T>, q22<? super Boolean>, Object> {
        final /* synthetic */ o6c<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(o6c<T> o6cVar, q22<? super AnonymousClass3> q22Var) {
            super(2, q22Var);
            this.$startState = o6cVar;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o6c<T> o6cVar, q22<? super Boolean> q22Var) {
            return create(o6cVar, q22Var).invokeSuspend(Unit.a);
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$startState, q22Var);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invokeSuspend(Object obj) {
            a.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            o6c o6cVar = (o6c) this.L$0;
            return ut0.a((o6cVar instanceof ol2) && ((ol2) o6cVar).getVersion() <= ((ol2) this.$startState).getVersion());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lcom/google/android/ui4;", "", "it", "", "<anonymous>", "(Lcom/google/android/ui4;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @lq2(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {115}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass5 extends SuspendLambda implements ps4<ui4<? super T>, Throwable, q22<? super Unit>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(DataStoreImpl<T> dataStoreImpl, q22<? super AnonymousClass5> q22Var) {
            super(3, q22Var);
            this.this$0 = dataStoreImpl;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ui4<? super T> ui4Var, Throwable th, q22<? super Unit> q22Var) {
            return new AnonymousClass5(this.this$0, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = a.g();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.t(this) == objG) {
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
    DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, q22<? super DataStoreImpl$data$1> q22Var) {
        super(2, q22Var);
        this.this$0 = dataStoreImpl;
    }

    public final q22<Unit> create(Object obj, q22<?> q22Var) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, q22Var);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    public final Object invoke(ui4<? super T> ui4Var, q22<? super Unit> q22Var) {
        return create(ui4Var, q22Var).invokeSuspend(Unit.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (kotlinx.coroutines.flow.d.A(r3, r9, r8) == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.p007core.DataStoreImpl$data$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
