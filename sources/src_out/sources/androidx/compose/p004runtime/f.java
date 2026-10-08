package androidx.compose.p004runtime;

import androidx.collection.ScatterSet;
import com.google.inputmethod.a69;
import com.google.inputmethod.ez;
import com.google.inputmethod.fob;
import com.google.inputmethod.js1;
import com.google.inputmethod.o41;
import com.google.inputmethod.pr1;
import com.google.inputmethod.q08;
import com.google.inputmethod.qr1;
import com.google.inputmethod.r08;
import com.google.inputmethod.rr1;
import com.google.inputmethod.x22;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH ¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000eH ¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0010¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010%\u001a\u00020$H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0010¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0007H\u0010¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H ¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H ¢\u0006\u0004\b-\u0010,J+\u00102\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010/\u001a\u00020.2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H ¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b6\u0010\u0018J\u001d\u00109\u001a\u0002082\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b9\u0010:R\u0018\u0010?\u001a\u00060;j\u0002`<8 X \u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010G\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0014\u0010I\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bH\u0010BR\u0016\u0010M\u001a\u0004\u0018\u00010J8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010\u0005\u001a\u0004\u0018\u00010R8 X \u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Landroidx/compose/runtime/f;", "", "<init>", "()V", "Lcom/google/android/x22;", "composition", "Lkotlin/Function0;", "", "content", "a", "(Lcom/google/android/x22;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/android/fob;", "shouldPause", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/b0;", "b", "(Lcom/google/android/x22;Lcom/google/android/fob;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "invalidScopes", "r", "(Lcom/google/android/x22;Lcom/google/android/fob;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "scope", "u", "(Landroidx/compose/runtime/b0;)V", "o", "(Lcom/google/android/x22;)V", "", "Lcom/google/android/rr1;", "table", "s", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/d;", "composer", "t", "(Landroidx/compose/runtime/d;)V", "y", "z", "Lcom/google/android/a69;", "j", "()Lcom/google/android/a69;", "x", "d", "Lcom/google/android/r08;", "reference", "n", "(Lcom/google/android/r08;)V", "c", "Lcom/google/android/q08;", "data", "Lcom/google/android/ez;", "applier", "p", "(Lcom/google/android/r08;Lcom/google/android/q08;Lcom/google/android/ez;)V", "q", "(Lcom/google/android/r08;)Lcom/google/android/q08;", "v", "action", "Lcom/google/android/o41;", "w", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/o41;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "h", "()J", "compositeKeyHashCode", "", "f", "()Z", "collectingParameterInformation", "g", "collectingSourceInformation", "e", "collectingCallByInformation", "m", "stackTraceEnabled", "Lcom/google/android/js1;", "l", "()Lcom/google/android/js1;", "observerHolder", "Lkotlin/coroutines/CoroutineContext;", "k", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "Lcom/google/android/pr1;", "i", "()Lcom/google/android/pr1;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f {
    public abstract void a(x22 composition, Function2<? super d, ? super Integer, Unit> content);

    public abstract ScatterSet<b0> b(x22 composition, fob shouldPause, Function2<? super d, ? super Integer, Unit> content);

    public abstract void c(r08 reference);

    public void d() {
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract long h();

    public abstract pr1 i();

    public a69 j() {
        return qr1.a;
    }

    public abstract CoroutineContext k();

    public js1 l() {
        return null;
    }

    public abstract boolean m();

    public abstract void n(r08 reference);

    public abstract void o(x22 composition);

    public abstract void p(r08 reference, q08 data, ez<?> applier);

    public q08 q(r08 reference) {
        return null;
    }

    public abstract ScatterSet<b0> r(x22 composition, fob shouldPause, ScatterSet<b0> invalidScopes);

    public void s(Set<rr1> table) {
    }

    public void t(d composer) {
    }

    public abstract void u(b0 scope);

    public abstract void v(x22 composition);

    public abstract o41 w(Function0<Unit> action);

    public void x() {
    }

    public void y(d composer) {
    }

    public abstract void z(x22 composition);
}
