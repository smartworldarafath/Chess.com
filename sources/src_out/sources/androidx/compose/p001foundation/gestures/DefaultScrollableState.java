package androidx.compose.p001foundation.gestures;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.MutatorMutex;
import androidx.compose.p004runtime.s0;
import com.google.android.q22;
import com.google.inputmethod.hab;
import com.google.inputmethod.o58;
import com.google.inputmethod.p9b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.j;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010'\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010&¨\u0006("}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollableState;", "Lcom/google/android/hab;", "Lkotlin/Function1;", "", "onDelta", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lcom/google/android/p9b;", "Lcom/google/android/q22;", "", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "delta", "d", "(F)F", "Lkotlin/jvm/functions/Function1;", "l", "()Lkotlin/jvm/functions/Function1;", "b", "Lcom/google/android/p9b;", "scrollScope", "Landroidx/compose/foundation/MutatorMutex;", "c", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Lcom/google/android/o58;", "", "Lcom/google/android/o58;", "isScrollingState", "e", "isLastScrollForwardState", "f", "isLastScrollBackwardState", "()Z", "isScrollInProgress", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DefaultScrollableState implements hab {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1<Float, Float> onDelta;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final p9b scrollScope = new a();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final MutatorMutex scrollMutex = new MutatorMutex();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o58<Boolean> isScrollingState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final o58<Boolean> isLastScrollForwardState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o58<Boolean> isLastScrollBackwardState;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/DefaultScrollableState$a", "Lcom/google/android/p9b;", "", "pixels", "e", "(F)F", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p9b {
        a() {
        }

        @Override // com.google.inputmethod.p9b
        public float e(float pixels) {
            if (Float.isNaN(pixels)) {
                return 0.0f;
            }
            float fFloatValue = ((Number) DefaultScrollableState.this.l().invoke(Float.valueOf(pixels))).floatValue();
            DefaultScrollableState.this.isLastScrollForwardState.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            DefaultScrollableState.this.isLastScrollBackwardState.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(Function1<? super Float, Float> function1) {
        this.onDelta = function1;
        Boolean bool = Boolean.FALSE;
        this.isScrollingState = s0.e(bool, null, 2, null);
        this.isLastScrollForwardState = s0.e(bool, null, 2, null);
        this.isLastScrollBackwardState = s0.e(bool, null, 2, null);
    }

    @Override // com.google.inputmethod.hab
    public Object a(MutatePriority mutatePriority, Function2<? super p9b, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        Object objG = j.g(new DefaultScrollableState$scroll$2(this, mutatePriority, function2, null), q22Var);
        return objG == kotlin.coroutines.intrinsics.a.g() ? objG : Unit.a;
    }

    @Override // com.google.inputmethod.hab
    public boolean b() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // com.google.inputmethod.hab
    public float d(float delta) {
        return ((Number) this.onDelta.invoke(Float.valueOf(delta))).floatValue();
    }

    public final Function1<Float, Float> l() {
        return this.onDelta;
    }
}
