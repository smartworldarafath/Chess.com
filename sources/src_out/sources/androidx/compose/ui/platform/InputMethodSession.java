package androidx.compose.ui.platform;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.inputmethod.dee;
import com.google.inputmethod.qk8;
import com.google.inputmethod.r58;
import com.google.inputmethod.xb9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\"\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/InputMethodSession;", "", "Lcom/google/android/xb9;", "request", "Lkotlin/Function0;", "", "onAllConnectionsClosed", "<init>", "(Lcom/google/android/xb9;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "c", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "d", "()V", "a", "Lcom/google/android/xb9;", "b", "Lkotlin/jvm/functions/Function0;", "Ljava/lang/Object;", "lock", "Lcom/google/android/r58;", "Lcom/google/android/dee;", "Lcom/google/android/qk8;", "Lcom/google/android/r58;", "connections", "", "e", "Z", "disposed", "()Z", "isActive", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class InputMethodSession {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final xb9 request;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function0<Unit> onAllConnectionsClosed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private r58<dee<qk8>> connections = new r58<>(new dee[16], 0);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean disposed;

    public InputMethodSession(xb9 xb9Var, Function0<Unit> function0) {
        this.request = xb9Var;
        this.onAllConnectionsClosed = function0;
    }

    public final InputConnection c(EditorInfo outAttrs) {
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            qk8 qk8VarA = com.google.inputmethod.InputConnection.a(this.request.a(outAttrs), new Function1<qk8, Unit>() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                {
                    super(1);
                }

                public final void a(qk8 qk8Var) {
                    qk8Var.a();
                    r58 r58Var = this.this$0.connections;
                    Object[] objArr = r58Var.content;
                    int size = r58Var.getSize();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            i = -1;
                            break;
                        } else if (Intrinsics.e((dee) objArr[i], qk8Var)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        this.this$0.connections.u(i);
                    }
                    if (this.this$0.connections.getSize() == 0) {
                        this.this$0.onAllConnectionsClosed.invoke();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((qk8) obj);
                    return Unit.a;
                }
            });
            this.connections.c(new dee<>(qk8VarA));
            return qk8VarA;
        }
    }

    public final void d() {
        synchronized (this.lock) {
            try {
                this.disposed = true;
                r58<dee<qk8>> r58Var = this.connections;
                dee<qk8>[] deeVarArr = r58Var.content;
                int size = r58Var.getSize();
                for (int i = 0; i < size; i++) {
                    qk8 qk8Var = deeVarArr[i].get();
                    if (qk8Var != null) {
                        qk8Var.a();
                    }
                }
                this.connections.j();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return !this.disposed;
    }
}
