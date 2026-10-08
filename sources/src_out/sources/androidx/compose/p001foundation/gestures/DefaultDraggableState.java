package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.MutatorMutex;
import com.google.android.q22;
import com.google.inputmethod.bg3;
import com.google.inputmethod.og3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableState;", "Lcom/google/android/og3;", "Lkotlin/Function1;", "", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Lcom/google/android/bg3;", "Lcom/google/android/q22;", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "b", "Lcom/google/android/bg3;", "dragScope", "Landroidx/compose/foundation/MutatorMutex;", "c", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DefaultDraggableState implements og3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Float, Unit> onDelta;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final bg3 dragScope = new a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final MutatorMutex scrollMutex = new MutatorMutex();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/gestures/DefaultDraggableState$a", "Lcom/google/android/bg3;", "", "pixels", "", "a", "(F)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements bg3 {
        a() {
        }

        @Override // com.google.inputmethod.bg3
        public void a(float pixels) {
            DefaultDraggableState.this.d().invoke(Float.valueOf(pixels));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableState(Function1<? super Float, Unit> function1) {
        this.onDelta = function1;
    }

    @Override // com.google.inputmethod.og3
    public Object a(MutatePriority mutatePriority, Function2<? super bg3, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objG = j.g(new DefaultDraggableState$drag$2(this, mutatePriority, function2, null), q22Var);
        return objG == kotlin.coroutines.intrinsics.a.g() ? objG : Unit.a;
    }

    public final Function1<Float, Unit> d() {
        return this.onDelta;
    }
}
