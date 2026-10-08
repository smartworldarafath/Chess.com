package androidx.p008glance.p009appwidget;

import com.google.android.q22;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bà\u0080\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\rJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/glance/appwidget/d;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/Function0;", "", "content", "", "Y0", "(Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "w1", "b", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d extends CoroutineContext.Element {

    /* JADX INFO: renamed from: w1, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R a(d dVar, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(dVar, r, function2);
        }

        public static <E extends CoroutineContext.Element> E b(d dVar, CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(dVar, bVar);
        }

        public static CoroutineContext c(d dVar, CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(dVar, bVar);
        }

        public static CoroutineContext d(d dVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(dVar, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/d$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Landroidx/glance/appwidget/d;", "<init>", "()V", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b<d> {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    Object Y0(Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, q22<?> q22Var);

    default CoroutineContext.b<?> getKey() {
        return INSTANCE;
    }
}
