package androidx.credentials;

import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.Credential;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.ClearCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import com.google.inputmethod.ef2;
import com.google.inputmethod.ju8;
import com.google.inputmethod.nf2;
import com.google.inputmethod.of2;
import com.google.inputmethod.pf2;
import com.google.inputmethod.qf2;
import com.google.inputmethod.rf2;
import com.google.inputmethod.td1;
import com.google.inputmethod.tf2;
import com.google.inputmethod.wf2;
import com.google.inputmethod.x72;
import com.google.inputmethod.xe2;
import com.google.inputmethod.xf2;
import com.google.inputmethod.yf2;
import com.google.inputmethod.ze2;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020,2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020.0\u001cH\u0016¢\u0006\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u0001018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102¨\u00064"}, d2 = {"Landroidx/credentials/CredentialProviderFrameworkImpl;", "Lcom/google/android/ze2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", "", "handleNullCredMan", "", "e", "(Lkotlin/jvm/functions/Function0;)Z", "Landroidx/credentials/d;", "request", "Landroid/credentials/GetCredentialRequest;", "a", "(Landroidx/credentials/d;)Landroid/credentials/GetCredentialRequest;", "Landroid/credentials/GetCredentialRequest$Builder;", "builder", "f", "(Landroidx/credentials/d;Landroid/credentials/GetCredentialRequest$Builder;)V", "Landroid/credentials/ClearCredentialStateRequest;", "d", "()Landroid/credentials/ClearCredentialStateRequest;", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lcom/google/android/xe2;", "Landroidx/credentials/e;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/d;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lcom/google/android/xe2;)V", "Landroid/credentials/GetCredentialException;", "error", "c", "(Landroid/credentials/GetCredentialException;)Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/credentials/GetCredentialResponse;", "response", "b", "(Landroid/credentials/GetCredentialResponse;)Landroidx/credentials/e;", "isAvailableOnDevice", "()Z", "Lcom/google/android/td1;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Lcom/google/android/td1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lcom/google/android/xe2;)V", "Landroid/credentials/CredentialManager;", "Landroid/credentials/CredentialManager;", "credentialManager", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderFrameworkImpl implements ze2 {
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final android.credentials.CredentialManager credentialManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/credentials/CredentialProviderFrameworkImpl$a;", "", "<init>", "()V", "", "CREATE_DOM_EXCEPTION_PREFIX", "Ljava/lang/String;", "GET_DOM_EXCEPTION_PREFIX", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$b", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "response", "", "b", "(Ljava/lang/Void;)V", "error", "a", "(Landroid/credentials/ClearCredentialStateException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements OutcomeReceiver {
        final /* synthetic */ xe2<Void, ClearCredentialException> a;

        b(xe2<Void, ClearCredentialException> xe2Var) {
            this.a = xe2Var;
        }

        public void a(ClearCredentialStateException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a.a(new ClearCredentialUnknownException(null, 1, null));
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Void response) {
            this.a.onResult(response);
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            a(wf2.a(th));
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$c", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "", "b", "(Landroid/credentials/GetCredentialResponse;)V", "error", "a", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {
        final /* synthetic */ xe2<e, GetCredentialException> a;
        final /* synthetic */ CredentialProviderFrameworkImpl b;

        c(xe2<e, GetCredentialException> xe2Var, CredentialProviderFrameworkImpl credentialProviderFrameworkImpl) {
            this.a = xe2Var;
            this.b = credentialProviderFrameworkImpl;
        }

        public void a(android.credentials.GetCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.a.a(this.b.c(error));
        }

        public void b(GetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.a.onResult(this.b.b(response));
        }

        public /* bridge */ /* synthetic */ void onError(Throwable th) {
            a(xf2.a(th));
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            b(yf2.a(obj));
        }
    }

    public CredentialProviderFrameworkImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.credentialManager = tf2.a(context.getSystemService("credential"));
    }

    private final GetCredentialRequest a(d request) {
        qf2.a();
        GetCredentialRequest.Builder builderA = of2.a(d.INSTANCE.a(request));
        for (androidx.credentials.b bVar : request.a()) {
            rf2.a();
            builderA.addCredentialOption(pf2.a(bVar.getType(), bVar.getRequestData(), bVar.getCandidateQueryData()).setIsSystemProviderRequired(bVar.getIsSystemProviderRequired()).setAllowedProviders(bVar.a()).build());
        }
        f(request, builderA);
        GetCredentialRequest getCredentialRequestBuild = builderA.build();
        Intrinsics.checkNotNullExpressionValue(getCredentialRequestBuild, "builder.build()");
        return getCredentialRequestBuild;
    }

    private final ClearCredentialStateRequest d() {
        nf2.a();
        return ef2.a(new Bundle());
    }

    private final boolean e(Function0<Unit> handleNullCredMan) {
        if (this.credentialManager != null) {
            return false;
        }
        handleNullCredMan.invoke();
        return true;
    }

    private final void f(d request, GetCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    public final e b(GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Credential credential = response.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "response.credential");
        androidx.credentials.a.Companion companion = androidx.credentials.a.INSTANCE;
        String type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "credential.type");
        Bundle data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "credential.data");
        return new e(companion.b(type, data));
    }

    public final GetCredentialException c(android.credentials.GetCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "error.type");
        return x72.a(type, error.getMessage());
    }

    @Override // com.google.inputmethod.ze2
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @Override // com.google.inputmethod.ze2
    public void onClearCredential(td1 request, CancellationSignal cancellationSignal, Executor executor, final xe2<Void, ClearCredentialException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (e(new Function0<Unit>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl.onClearCredential.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m83invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m83invoke() {
                callback.a(new ClearCredentialUnsupportedException("Your device doesn't support credential manager"));
            }
        })) {
            return;
        }
        b bVar = new b(callback);
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.g(credentialManager);
        credentialManager.clearCredentialState(d(), cancellationSignal, executor, ju8.a(bVar));
    }

    @Override // com.google.inputmethod.ze2
    public void onGetCredential(Context context, d request, CancellationSignal cancellationSignal, Executor executor, final xe2<e, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (e(new Function0<Unit>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl.onGetCredential.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m84invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m84invoke() {
                callback.a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            }
        })) {
            return;
        }
        c cVar = new c(callback, this);
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.g(credentialManager);
        credentialManager.getCredential(context, a(request), cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, android.credentials.GetCredentialException>) ju8.a(cVar));
    }
}
