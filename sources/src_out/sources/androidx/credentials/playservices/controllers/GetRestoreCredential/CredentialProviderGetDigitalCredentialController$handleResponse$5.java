package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import com.google.inputmethod.lo6;
import com.google.inputmethod.xe2;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
final class CredentialProviderGetDigitalCredentialController$handleResponse$5 extends Lambda implements Function0<Unit> {
    final /* synthetic */ GetCredentialException $providerException;
    final /* synthetic */ CredentialProviderGetDigitalCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderGetDigitalCredentialController$handleResponse$5(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException) {
        super(0);
        this.this$0 = credentialProviderGetDigitalCredentialController;
        this.$providerException = getCredentialException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, GetCredentialException getCredentialException) {
        xe2<androidx.credentials.e, GetCredentialException> callback = credentialProviderGetDigitalCredentialController.getCallback();
        if (getCredentialException == null) {
            getCredentialException = new GetCredentialUnknownException("Unexpected configuration error");
        }
        callback.a(getCredentialException);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m136invoke();
        return Unit.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m136invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this.this$0;
        final GetCredentialException getCredentialException = this.$providerException;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetDigitalCredentialController$handleResponse$5.invoke$lambda$0(credentialProviderGetDigitalCredentialController, getCredentialException);
            }
        });
    }
}
