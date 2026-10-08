package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import com.google.inputmethod.lo6;
import com.google.inputmethod.us3;
import com.google.inputmethod.xe2;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
final class CredentialProviderCreatePublicKeyCredentialController$handleResponse$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ JSONException $e;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.$e = jSONException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        xe2 xe2Var = credentialProviderCreatePublicKeyCredentialController.callback;
        if (xe2Var == null) {
            Intrinsics.x("callback");
            xe2Var = null;
        }
        xe2Var.a(new CreatePublicKeyCredentialDomException(new us3(), jSONException.getMessage()));
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m115invoke();
        return Unit.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m115invoke() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            Intrinsics.x("executor");
            executor = null;
        }
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        final JSONException jSONException = this.$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$6.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
            }
        });
    }
}
