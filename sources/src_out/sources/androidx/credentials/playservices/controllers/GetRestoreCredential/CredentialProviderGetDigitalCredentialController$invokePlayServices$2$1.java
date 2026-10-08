package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialException;
import com.google.inputmethod.lo6;
import com.google.inputmethod.xe2;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
final class CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ xe2<androidx.credentials.e, GetCredentialException> $callback;
    final /* synthetic */ Executor $executor;
    final /* synthetic */ GetCredentialException $getException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1(Executor executor, xe2<androidx.credentials.e, GetCredentialException> xe2Var, GetCredentialException getCredentialException) {
        super(0);
        this.$executor = executor;
        this.$callback = xe2Var;
        this.$getException = getCredentialException;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m137invoke();
        return Unit.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m137invoke() {
        Executor executor = this.$executor;
        final xe2<androidx.credentials.e, GetCredentialException> xe2Var = this.$callback;
        final GetCredentialException getCredentialException = this.$getException;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.e
            @Override // java.lang.Runnable
            public final void run() {
                xe2Var.a(getCredentialException);
            }
        });
    }
}
