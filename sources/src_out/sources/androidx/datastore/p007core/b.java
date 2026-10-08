package androidx.datastore.p007core;

import com.google.android.hl1;
import com.google.android.q22;
import com.google.inputmethod.o6c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/datastore/core/b;", "T", "", "<init>", "()V", "a", "Landroidx/datastore/core/b$a;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b<T> {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002BQ\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/datastore/core/b$a;", "T", "Landroidx/datastore/core/b;", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "transform", "Lcom/google/android/hl1;", "ack", "Lcom/google/android/o6c;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/hl1;Lcom/google/android/o6c;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/jvm/functions/Function2;", "d", "()Lkotlin/jvm/functions/Function2;", "b", "Lcom/google/android/hl1;", "()Lcom/google/android/hl1;", "c", "Lcom/google/android/o6c;", "()Lcom/google/android/o6c;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> extends b<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Function2<T, q22<? super T>, Object> transform;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final hl1<T> ack;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final o6c<T> lastState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final CoroutineContext callerContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super T, ? super q22<? super T>, ? extends Object> function2, hl1<T> hl1Var, o6c<T> o6cVar, CoroutineContext coroutineContext) {
            super(null);
            Intrinsics.checkNotNullParameter(function2, "transform");
            Intrinsics.checkNotNullParameter(hl1Var, "ack");
            Intrinsics.checkNotNullParameter(coroutineContext, "callerContext");
            this.transform = function2;
            this.ack = hl1Var;
            this.lastState = o6cVar;
            this.callerContext = coroutineContext;
        }

        public final hl1<T> a() {
            return this.ack;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CoroutineContext getCallerContext() {
            return this.callerContext;
        }

        public o6c<T> c() {
            return this.lastState;
        }

        public final Function2<T, q22<? super T>, Object> d() {
            return this.transform;
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
