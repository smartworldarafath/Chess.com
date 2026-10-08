package androidx.compose.ui.platform;

import com.google.android.q22;
import com.google.inputmethod.bc9;
import com.google.inputmethod.o58;
import com.google.inputmethod.t04;
import com.google.inputmethod.wb9;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "", "Landroidx/compose/ui/node/m;", "owner", "Lkotlin/Function2;", "Lcom/google/android/bc9;", "Lcom/google/android/q22;", "", "session", "c", "(Landroidx/compose/ui/node/m;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "parent", "Lcom/google/android/wb9;", "<set-?>", "b", "Lcom/google/android/o58;", "()Lcom/google/android/wb9;", "setInterceptor", "(Lcom/google/android/wb9;)V", "interceptor", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ChainedPlatformTextInputInterceptor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ChainedPlatformTextInputInterceptor parent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 interceptor;

    /* JADX INFO: Access modifiers changed from: private */
    public final wb9 b() {
        return (wb9) this.interceptor.getValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(androidx.compose.ui.node.m mVar, Function2<? super bc9, ? super q22<?>, ? extends Object> function2, q22<?> q22Var) throws KotlinNothingValueException {
        ChainedPlatformTextInputInterceptor$textInputSession$1 chainedPlatformTextInputInterceptor$textInputSession$1;
        if (q22Var instanceof ChainedPlatformTextInputInterceptor$textInputSession$1) {
            chainedPlatformTextInputInterceptor$textInputSession$1 = (ChainedPlatformTextInputInterceptor$textInputSession$1) q22Var;
            int i = chainedPlatformTextInputInterceptor$textInputSession$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$1.label = i - t04.INVALID_ID;
            } else {
                chainedPlatformTextInputInterceptor$textInputSession$1 = new ChainedPlatformTextInputInterceptor$textInputSession$1(this, q22Var);
            }
        } else {
            chainedPlatformTextInputInterceptor$textInputSession$1 = new ChainedPlatformTextInputInterceptor$textInputSession$1(this, q22Var);
        }
        Object obj = chainedPlatformTextInputInterceptor$textInputSession$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = chainedPlatformTextInputInterceptor$textInputSession$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = this.parent;
            ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(function2, this, null);
            chainedPlatformTextInputInterceptor$textInputSession$1.label = 1;
            if (PlatformTextInputModifierNodeKt.c(mVar, chainedPlatformTextInputInterceptor, chainedPlatformTextInputInterceptor$textInputSession$2, chainedPlatformTextInputInterceptor$textInputSession$1) == objG) {
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
}
