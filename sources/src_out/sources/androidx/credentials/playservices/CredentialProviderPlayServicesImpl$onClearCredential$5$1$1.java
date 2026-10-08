package androidx.credentials.playservices;

import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import com.google.inputmethod.lo6;
import com.google.inputmethod.xe2;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
final class CredentialProviderPlayServicesImpl$onClearCredential$5$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ xe2<Void, ClearCredentialException> $callback;
    final /* synthetic */ Exception $e;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderPlayServicesImpl$onClearCredential$5$1$1(Exception exc, Executor executor, xe2<Void, ClearCredentialException> xe2Var) {
        super(0);
        this.$e = exc;
        this.$executor = executor;
        this.$callback = xe2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(xe2 xe2Var, Exception exc) {
        xe2Var.a(new ClearCredentialUnknownException(exc.getMessage()));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m93invoke();
        return Unit.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m93invoke() {
        Objects.toString(this.$e);
        Executor executor = this.$executor;
        final xe2<Void, ClearCredentialException> xe2Var = this.$callback;
        final Exception exc = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.e
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$5$1$1.invoke$lambda$0(xe2Var, exc);
            }
        });
    }
}
