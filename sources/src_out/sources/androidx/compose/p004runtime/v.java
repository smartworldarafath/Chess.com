package androidx.compose.p004runtime;

import com.google.android.q22;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\rJ*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/v;", "Lkotlin/coroutines/CoroutineContext$Element;", "R", "Lkotlin/Function1;", "", "onFrame", "d0", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "q1", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface v extends CoroutineContext.Element {

    /* JADX INFO: renamed from: q1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <R> R a(v vVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(vVar, r, function2);
        }

        public static <E extends CoroutineContext.Element> E b(v vVar, CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(vVar, bVar);
        }

        public static CoroutineContext c(v vVar, CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(vVar, bVar);
        }

        public static CoroutineContext d(v vVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(vVar, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.v$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/v$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/compose/runtime/v;", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b<v> {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    <R> Object d0(Function1<? super Long, ? extends R> function1, q22<? super R> q22Var);

    default CoroutineContext.b<?> getKey() {
        return INSTANCE;
    }
}
