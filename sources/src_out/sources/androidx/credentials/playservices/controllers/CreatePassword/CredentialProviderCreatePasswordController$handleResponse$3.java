package androidx.credentials.playservices.controllers.CreatePassword;

import com.google.inputmethod.gd2;
import com.google.inputmethod.lo6;
import com.google.inputmethod.xe2;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
final class CredentialProviderCreatePasswordController$handleResponse$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ gd2 $response;
    final /* synthetic */ CredentialProviderCreatePasswordController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CredentialProviderCreatePasswordController$handleResponse$3(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, gd2 gd2Var) {
        super(0);
        this.this$0 = credentialProviderCreatePasswordController;
        this.$response = gd2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, gd2 gd2Var) {
        xe2 xe2Var = credentialProviderCreatePasswordController.callback;
        if (xe2Var == null) {
            Intrinsics.x("callback");
            xe2Var = null;
        }
        xe2Var.onResult(gd2Var);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m110invoke();
        return Unit.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m110invoke() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            Intrinsics.x("executor");
            executor = null;
        }
        final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
        final gd2 gd2Var = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePassword.b
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(credentialProviderCreatePasswordController, gd2Var);
            }
        });
    }
}
