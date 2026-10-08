package androidx.compose.p004runtime;

import com.google.inputmethod.ez;
import com.google.inputmethod.gs1;
import com.google.inputmethod.n08;
import com.google.inputmethod.os9;
import com.google.inputmethod.qaa;
import com.google.inputmethod.r08;
import com.google.inputmethod.rr1;
import com.google.inputmethod.s6b;
import com.google.inputmethod.zr1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u0081\u00012\u00020\u0001:\u0002\u0081\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\u00042\u001a\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c0\u001bH'¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H'¢\u0006\u0004\b!\u0010\bJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H'¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H'¢\u0006\u0004\b&\u0010\bJ\u000f\u0010'\u001a\u00020\u0004H'¢\u0006\u0004\b'\u0010\bJ#\u0010+\u001a\u00020\u0004\"\u0004\b\u0000\u0010(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H'¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H'¢\u0006\u0004\b-\u0010\bJ\u000f\u0010.\u001a\u00020\u0004H'¢\u0006\u0004\b.\u0010\bJ!\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b/\u0010\rJ\u000f\u00100\u001a\u00020\u0004H'¢\u0006\u0004\b0\u0010\bJ\u0017\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0002H'¢\u0006\u0004\b2\u0010\u0006J=\u00105\u001a\u00020\u0004\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010(2\u0006\u0010\u0017\u001a\u00028\u00002\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000403H'¢\u0006\u0004\b5\u00106J#\u00109\u001a\u00020\u00012\b\u00107\u001a\u0004\u0018\u00010\u00012\b\u00108\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b9\u0010:J\u0011\u0010;\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\"H\u0017¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020EH\u0017¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\"2\u0006\u0010\u0017\u001a\u00020HH\u0017¢\u0006\u0004\bI\u0010JJ\u0019\u0010(\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\b(\u0010@J\u0017\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH'¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020\"2\u0006\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\u0002H'¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\u00042\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040)H'¢\u0006\u0004\bT\u0010,J#\u0010V\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000UH'¢\u0006\u0004\bV\u0010WJ#\u0010[\u001a\u00020\u00042\u0012\u0010Z\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030Y0XH'¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0004H'¢\u0006\u0004\b]\u0010\bJ\u001b\u0010^\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030YH'¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0004H'¢\u0006\u0004\b`\u0010\bJ\u000f\u0010a\u001a\u00020\u0004H&¢\u0006\u0004\ba\u0010\bJ\u000f\u0010c\u001a\u00020bH'¢\u0006\u0004\bc\u0010dR\u001e\u0010i\u001a\u0006\u0012\u0002\b\u00030e8&X§\u0004¢\u0006\f\u0012\u0004\bh\u0010\b\u001a\u0004\bf\u0010gR\u001a\u0010m\u001a\u00020\"8&X§\u0004¢\u0006\f\u0012\u0004\bl\u0010\b\u001a\u0004\bj\u0010kR\u001a\u0010p\u001a\u00020\"8&X§\u0004¢\u0006\f\u0012\u0004\bo\u0010\b\u001a\u0004\bn\u0010kR\u001a\u0010s\u001a\u00020\"8&X§\u0004¢\u0006\f\u0012\u0004\br\u0010\b\u001a\u0004\bq\u0010kR\u001c\u0010w\u001a\u0004\u0018\u00010K8&X§\u0004¢\u0006\f\u0012\u0004\bv\u0010\b\u001a\u0004\bt\u0010uR\u001a\u0010{\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\bz\u0010\b\u001a\u0004\bx\u0010yR\u001f\u0010\u0080\u0001\u001a\u00060Hj\u0002`|8&X§\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010\b\u001a\u0004\b}\u0010~R\u001d\u0010\u0083\u0001\u001a\u00020\u00028&X§\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\b\u001a\u0005\b\u0081\u0001\u0010yR\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\u0090\u0001\u001a\u00030\u008c\u00018'X§\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\u0082\u0001\u0002\u0091\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0092\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/d;", "", "", "key", "", "Q", "(I)V", "a0", "()V", "y", "u", "dataKey", "V", "(ILjava/lang/Object;)V", "Z", "U", "M", "F", "(I)Landroidx/compose/runtime/d;", "Lcom/google/android/s6b;", "H", "()Lcom/google/android/s6b;", "Lcom/google/android/n08;", "value", "parameter", "s", "(Lcom/google/android/n08;Ljava/lang/Object;)V", "", "Lkotlin/Pair;", "Lcom/google/android/r08;", "references", "d", "(Ljava/util/List;)V", "q", "", "changed", "b", "(Z)V", "J", "o", "T", "Lkotlin/Function0;", "factory", "W", "(Lkotlin/jvm/functions/Function0;)V", "k", "m", "p", "P", "marker", "h", "Lkotlin/Function2;", "block", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "I", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "R", "()Ljava/lang/Object;", "L", "(Ljava/lang/Object;)V", "x", "(Ljava/lang/Object;)Z", "A", "(Z)Z", "C", "(I)Z", "", "B", "(F)Z", "", "D", "(J)Z", "Lcom/google/android/qaa;", "scope", "z", "(Lcom/google/android/qaa;)V", "parametersChanged", "flags", "g", "(ZI)Z", "effect", "n", "Lcom/google/android/zr1;", "v", "(Lcom/google/android/zr1;)Ljava/lang/Object;", "", "Lcom/google/android/os9;", "values", "i", "([Lcom/google/android/os9;)V", "X", "r", "(Lcom/google/android/os9;)V", "l", "N", "Landroidx/compose/runtime/f;", "w", "()Landroidx/compose/runtime/f;", "Lcom/google/android/ez;", "G", "()Lcom/google/android/ez;", "getApplier$annotations", "applier", "E", "()Z", "getInserting$annotations", "inserting", "c", "getSkipping$annotations", "skipping", "t", "getDefaultsInvalid$annotations", "defaultsInvalid", "O", "()Lcom/google/android/qaa;", "getRecomposeScope$annotations", "recomposeScope", "Y", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/CompositeKeyHashCode;", "f", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "a", "getCurrentMarker$annotations", "currentMarker", "Lcom/google/android/gs1;", "j", "()Lcom/google/android/gs1;", "currentCompositionLocalMap", "Lcom/google/android/rr1;", "S", "()Lcom/google/android/rr1;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "K", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/o;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.compose.runtime.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/d$a;", "", "<init>", "()V", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Empty", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final Object Empty = new C0046a();

        /* JADX INFO: renamed from: androidx.compose.runtime.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/d$a$a", "", "", "toString", "()Ljava/lang/String;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0046a {
            C0046a() {
            }

            public String toString() {
                return "Empty";
            }
        }

        private Companion() {
        }

        public final Object a() {
            return Empty;
        }
    }

    default boolean A(boolean value) {
        return A(value);
    }

    default boolean B(float value) {
        return B(value);
    }

    default boolean C(int value) {
        return C(value);
    }

    default boolean D(long value) {
        return D(value);
    }

    boolean E();

    d F(int key);

    ez<?> G();

    s6b H();

    Object I(Object left, Object right);

    void J();

    CoroutineContext K();

    void L(Object value);

    void M();

    void N();

    qaa O();

    void P();

    void Q(int key);

    Object R();

    rr1 S();

    default boolean T(Object value) {
        return x(value);
    }

    void U();

    void V(int key, Object dataKey);

    <T> void W(Function0<? extends T> factory);

    void X();

    default int Y() {
        return Long.hashCode(f());
    }

    void Z();

    int a();

    void a0();

    void b(boolean changed);

    boolean c();

    void d(List<Pair<r08, r08>> references);

    <V, T> void e(V value, Function2<? super T, ? super V, Unit> block);

    long f();

    boolean g(boolean parametersChanged, int flags);

    void h(int marker);

    void i(os9<?>[] values);

    gs1 j();

    void k();

    void l();

    void m();

    void n(Function0<Unit> effect);

    void o();

    void p(int key, Object dataKey);

    void q();

    void r(os9<?> value);

    void s(n08<?> value, Object parameter);

    boolean t();

    void u();

    <T> T v(zr1<T> key);

    f w();

    boolean x(Object value);

    void y(int key);

    void z(qaa scope);
}
