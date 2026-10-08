package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.SessionMutex;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.bc9;
import com.google.inputmethod.t04;
import com.google.inputmethod.xb9;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/ui/platform/ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", "Lcom/google/android/bc9;", "Lcom/google/android/xb9;", "request", "", "a", "(Lcom/google/android/xb9;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements bc9 {
    private final /* synthetic */ bc9 a;
    final /* synthetic */ bc9 b;
    final /* synthetic */ AtomicReference<SessionMutex.a<Unit>> c;
    final /* synthetic */ ChainedPlatformTextInputInterceptor d;

    ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(bc9 bc9Var, AtomicReference<SessionMutex.a<Unit>> atomicReference, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.b = bc9Var;
        this.c = atomicReference;
        this.d = chainedPlatformTextInputInterceptor;
        this.a = bc9Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.ac9
    public Object a(xb9 xb9Var, q22<?> q22Var) throws KotlinNothingValueException {
        ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1;
        if (q22Var instanceof ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) {
            chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = (ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) q22Var;
            int i = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label = i - t04.INVALID_ID;
            } else {
                chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(this, q22Var);
            }
        } else {
            chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1(this, q22Var);
        }
        Object obj = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            AtomicReference<SessionMutex.a<Unit>> atomicReference = this.c;
            ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 = new Function1<ta2, Unit>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                public final void a(ta2 ta2Var) {
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    a((ta2) obj2);
                    return Unit.a;
                }
            };
            ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.d, xb9Var, this.b, null);
            chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1.label = 1;
            if (SessionMutex.d(atomicReference, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3, chainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) == objG) {
                return objG;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    @Override // com.google.inputmethod.ac9
    public View getView() {
        return this.a.getView();
    }
}
