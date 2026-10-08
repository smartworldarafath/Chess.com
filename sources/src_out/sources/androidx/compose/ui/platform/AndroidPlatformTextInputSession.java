package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import com.google.android.q22;
import com.google.android.ta2;
import com.google.inputmethod.bc9;
import com.google.inputmethod.dxc;
import com.google.inputmethod.t04;
import com.google.inputmethod.xb9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/platform/AndroidPlatformTextInputSession;", "Lcom/google/android/bc9;", "Lcom/google/android/ta2;", "Landroid/view/View;", "view", "Lcom/google/android/dxc;", "textInputService", "coroutineScope", "<init>", "(Landroid/view/View;Lcom/google/android/dxc;Lcom/google/android/ta2;)V", "Lcom/google/android/xb9;", "request", "", "a", "(Lcom/google/android/xb9;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "e", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "b", "Lcom/google/android/dxc;", "c", "Lcom/google/android/ta2;", "Landroidx/compose/ui/SessionMutex;", "Landroidx/compose/ui/platform/InputMethodSession;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "methodSessionMutex", "", "f", "()Z", "isReadyForConnection", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidPlatformTextInputSession implements bc9, ta2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final dxc textInputService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ta2 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AtomicReference<SessionMutex.a<InputMethodSession>> methodSessionMutex = SessionMutex.a();

    public AndroidPlatformTextInputSession(View view, dxc dxcVar, ta2 ta2Var) {
        this.view = view;
        this.textInputService = dxcVar;
        this.coroutineScope = ta2Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.inputmethod.ac9
    public Object a(final xb9 xb9Var, q22<?> q22Var) throws KotlinNothingValueException {
        AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        if (q22Var instanceof AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (AndroidPlatformTextInputSession$startInputMethod$1) q22Var;
            int i = androidPlatformTextInputSession$startInputMethod$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.label = i - t04.INVALID_ID;
            } else {
                androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, q22Var);
            }
        } else {
            androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, q22Var);
        }
        Object obj = androidPlatformTextInputSession$startInputMethod$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = androidPlatformTextInputSession$startInputMethod$1.label;
        if (i2 == 0) {
            kotlin.f.b(obj);
            AtomicReference<SessionMutex.a<InputMethodSession>> atomicReference = this.methodSessionMutex;
            Function1<ta2, InputMethodSession> function1 = new Function1<ta2, InputMethodSession>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InputMethodSession invoke(ta2 ta2Var) {
                    xb9 xb9Var2 = xb9Var;
                    final AndroidPlatformTextInputSession androidPlatformTextInputSession = this;
                    return new InputMethodSession(xb9Var2, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2.1
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m47invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m47invoke() {
                            kotlinx.coroutines.j.f(androidPlatformTextInputSession.coroutineScope, (CancellationException) null, 1, (Object) null);
                        }
                    });
                }
            };
            AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this, null);
            androidPlatformTextInputSession$startInputMethod$1.label = 1;
            if (SessionMutex.d(atomicReference, function1, androidPlatformTextInputSession$startInputMethod$3, androidPlatformTextInputSession$startInputMethod$1) == objG) {
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

    public final InputConnection e(EditorInfo outAttrs) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.c(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.c(outAttrs);
        }
        return null;
    }

    public final boolean f() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.c(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.e();
    }

    public CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // com.google.inputmethod.ac9
    public View getView() {
        return this.view;
    }
}
