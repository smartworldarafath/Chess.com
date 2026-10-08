package androidx.compose.p001foundation.gestures.snapping;

import com.google.android.q22;
import com.google.inputmethod.kr;
import com.google.inputmethod.or;
import com.google.inputmethod.p9b;
import com.google.inputmethod.qr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/k;", "Landroidx/compose/foundation/gestures/snapping/b;", "", "Lcom/google/android/qr;", "Lcom/google/android/kr;", "animationSpec", "<init>", "(Lcom/google/android/kr;)V", "Lcom/google/android/p9b;", "scope", "offset", "velocity", "Lkotlin/Function1;", "", "onAnimationStep", "Landroidx/compose/foundation/gestures/snapping/a;", "b", "(Lcom/google/android/p9b;FFLkotlin/jvm/functions/Function1;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Lcom/google/android/kr;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k implements b<Float, qr> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final kr<Float> animationSpec;

    public k(kr<Float> krVar) {
        this.animationSpec = krVar;
    }

    @Override // androidx.compose.p001foundation.gestures.snapping.b
    public /* bridge */ /* synthetic */ Object a(p9b p9bVar, Float f, Float f2, Function1<? super Float, Unit> function1, q22 q22Var) {
        return b(p9bVar, f.floatValue(), f2.floatValue(), function1, q22Var);
    }

    public Object b(p9b p9bVar, float f, float f2, Function1<? super Float, Unit> function1, q22<? super a<Float, qr>> q22Var) {
        Object objI = SnapFlingBehaviorKt.i(p9bVar, Math.abs(f) * Math.signum(f2), f, or.c(0.0f, f2, 0L, 0L, false, 28, null), this.animationSpec, function1, q22Var);
        return objI == a.g() ? objI : (a) objI;
    }
}
