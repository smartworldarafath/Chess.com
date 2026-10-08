package androidx.compose.ui.platform;

import android.content.Context;
import com.google.android.r6c;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.l48;
import com.google.inputmethod.rz7;
import com.google.inputmethod.tm9;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0018¨\u0006#"}, d2 = {"Landroidx/compose/ui/platform/MotionDurationScaleImpl;", "Lcom/google/android/rz7;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Lkotlinx/coroutines/s;", "g", "()Lkotlinx/coroutines/s;", "a", "Landroid/content/Context;", "Lcom/google/android/ta2;", "b", "Lcom/google/android/ta2;", "getCoroutineScope", "()Lcom/google/android/ta2;", "e", "(Lcom/google/android/ta2;)V", "coroutineScope", "", "<set-?>", "c", "Lcom/google/android/l48;", "d", "()F", "f", "(F)V", "_scaleFactor", "Lkotlinx/coroutines/s;", "getJob", "setJob", "(Lkotlinx/coroutines/s;)V", "job", "B0", "scaleFactor", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class MotionDurationScaleImpl implements rz7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ta2 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final l48 _scaleFactor = tm9.a(1.0f);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private kotlinx.coroutines.s job;

    public MotionDurationScaleImpl(Context context) {
        this.applicationContext = context;
    }

    private final float d() {
        return this._scaleFactor.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(float f) {
        this._scaleFactor.p(f);
    }

    private final kotlinx.coroutines.s g() {
        r6c r6cVarF = WindowRecomposer_androidKt.f(this.applicationContext);
        f(((Number) r6cVarF.getValue()).floatValue());
        ta2 ta2Var = this.coroutineScope;
        if (ta2Var != null) {
            return rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new MotionDurationScaleImpl$startObservingSystemScaleFactor$1(r6cVarF, this, null), 3, (Object) null);
        }
        throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
    }

    @Override // com.google.inputmethod.rz7
    public float B0() {
        if (this.job == null) {
            this.job = g();
        }
        return d();
    }

    public final void e(ta2 ta2Var) {
        this.coroutineScope = ta2Var;
    }

    public /* bridge */ <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) rz7.a.a(this, r, function2);
    }

    public /* bridge */ <E extends CoroutineContext.Element> E get(CoroutineContext.b<E> bVar) {
        return (E) rz7.a.b(this, bVar);
    }

    public /* bridge */ CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return rz7.a.c(this, bVar);
    }

    public /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return rz7.a.d(this, coroutineContext);
    }
}
