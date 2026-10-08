package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.android.g41;
import com.google.android.oq2;
import com.google.android.q22;
import com.google.inputmethod.td1;
import com.google.inputmethod.we2;
import com.google.inputmethod.xe2;
import com.google.inputmethod.ye2;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0011H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/credentials/CredentialManager;", "", "Landroid/content/Context;", "context", "Landroidx/credentials/d;", "request", "Landroidx/credentials/e;", "d", "(Landroid/content/Context;Landroidx/credentials/d;Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/td1;", "", "f", "(Lcom/google/android/td1;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lcom/google/android/xe2;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "b", "(Landroid/content/Context;Landroidx/credentials/d;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lcom/google/android/xe2;)V", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "e", "(Lcom/google/android/td1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lcom/google/android/xe2;)V", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CredentialManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: androidx.credentials.CredentialManager$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/CredentialManager$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/credentials/CredentialManager;", "a", "(Landroid/content/Context;)Landroidx/credentials/CredentialManager;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }

        public final CredentialManager a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ye2(context);
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialManager$b", "Lcom/google/android/xe2;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "result", "", "c", "(Ljava/lang/Void;)V", "e", "b", "(Landroidx/credentials/exceptions/ClearCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements xe2<Void, ClearCredentialException> {
        final /* synthetic */ g41<Unit> a;

        b(g41<? super Unit> g41Var) {
            this.a = g41Var;
        }

        @Override // com.google.inputmethod.xe2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ClearCredentialException e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.a.b()) {
                g41<Unit> g41Var = this.a;
                Result.a aVar = Result.a;
                g41Var.resumeWith(Result.b(kotlin.f.a(e)));
            }
        }

        @Override // com.google.inputmethod.xe2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(Void result) {
            if (this.a.b()) {
                g41<Unit> g41Var = this.a;
                Result.a aVar = Result.a;
                g41Var.resumeWith(Result.b(Unit.a));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialManager$c", "Lcom/google/android/xe2;", "Landroidx/credentials/e;", "Landroidx/credentials/exceptions/GetCredentialException;", "result", "", "c", "(Landroidx/credentials/e;)V", "e", "b", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements xe2<e, GetCredentialException> {
        final /* synthetic */ g41<e> a;

        /* JADX WARN: Multi-variable type inference failed */
        c(g41<? super e> g41Var) {
            this.a = g41Var;
        }

        @Override // com.google.inputmethod.xe2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(GetCredentialException e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.a.b()) {
                g41<e> g41Var = this.a;
                Result.a aVar = Result.a;
                g41Var.resumeWith(Result.b(kotlin.f.a(e)));
            }
        }

        @Override // com.google.inputmethod.xe2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(e result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (this.a.b()) {
                this.a.resumeWith(Result.b(result));
            }
        }
    }

    static /* synthetic */ Object a(CredentialManager credentialManager, td1 td1Var, q22<? super Unit> q22Var) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        eVar.D(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.a;
            }

            public final void invoke(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.e(td1Var, cancellationSignal, new we2(), new b(eVar));
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY == kotlin.coroutines.intrinsics.a.g() ? objY : Unit.a;
    }

    static /* synthetic */ Object c(CredentialManager credentialManager, Context context, d dVar, q22<? super e> q22Var) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        eVar.D(new Function1<Throwable, Unit>() { // from class: androidx.credentials.CredentialManager$getCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.a;
            }

            public final void invoke(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.b(context, dVar, cancellationSignal, new we2(), new c(eVar));
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY;
    }

    void b(Context context, d request, CancellationSignal cancellationSignal, Executor executor, xe2<e, GetCredentialException> callback);

    default Object d(Context context, d dVar, q22<? super e> q22Var) {
        return c(this, context, dVar, q22Var);
    }

    void e(td1 request, CancellationSignal cancellationSignal, Executor executor, xe2<Void, ClearCredentialException> callback);

    default Object f(td1 td1Var, q22<? super Unit> q22Var) {
        return a(this, td1Var, q22Var);
    }
}
