package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.restorecredential.CreateRestoreCredentialDomException;
import androidx.credentials.exceptions.restorecredential.E2eeUnavailableException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.inputmethod.cm2;
import com.google.inputmethod.gd2;
import com.google.inputmethod.lo6;
import com.google.inputmethod.pd2;
import com.google.inputmethod.qd2;
import com.google.inputmethod.xe2;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lcom/google/android/pd2;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "Lcom/google/android/gd2;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lcom/google/android/xe2;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Lcom/google/android/pd2;Lcom/google/android/xe2;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lcom/google/android/pd2;)Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)Lcom/google/android/gd2;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<pd2, CreateRestoreCredentialRequest, CreateRestoreCredentialResponse, gd2, CreateCredentialException> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Executor executor, xe2 xe2Var, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new CreateCredentialUnknownException("Create restore credential failed for unknown reason, failure: " + exc.getMessage());
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            switch (apiException.b()) {
                case 40201:
                    objectRef.element = new CreateCredentialUnknownException("The restore credential internal service had a failure, failure: " + exc.getMessage());
                    break;
                case 40202:
                    objectRef.element = new CreateRestoreCredentialDomException(new cm2(), "The request did not match the fido spec, failure: " + exc.getMessage());
                    break;
                case 40203:
                    objectRef.element = new E2eeUnavailableException("E2ee is not available on the device. Check whether the backup and screen lock are enabled.");
                    break;
                default:
                    objectRef.element = new CreateCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + apiException.b());
                    break;
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1(executor, xe2Var, objectRef));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public CreateRestoreCredentialRequest convertRequestToPlayServices(pd2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new CreateRestoreCredentialRequest(request.getCredentialData());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public gd2 convertResponseToCredentialManager(CreateRestoreCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return qd2.INSTANCE.a(response.N());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(pd2 request, final xe2<gd2, CreateCredentialException> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task taskN = RestoreCredential.a(this.context).n(convertRequestToPlayServices(request));
        final Function1<CreateRestoreCredentialResponse, Unit> function1 = new Function1<CreateRestoreCredentialResponse, Unit>() { // from class: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController.invokePlayServices.1

            /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
            static final class C00761 extends Lambda implements Function0<Unit> {
                final /* synthetic */ xe2<gd2, CreateCredentialException> $callback;
                final /* synthetic */ Executor $executor;
                final /* synthetic */ gd2 $response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00761(Executor executor, xe2<gd2, CreateCredentialException> xe2Var, gd2 gd2Var) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = xe2Var;
                    this.$response = gd2Var;
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m122invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m122invoke() {
                    Executor executor = this.$executor;
                    final xe2<gd2, CreateCredentialException> xe2Var = this.$callback;
                    final gd2 gd2Var = this.$response;
                    executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreateRestoreCredential.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            xe2Var.onResult(gd2Var);
                        }
                    });
                }
            }

            /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
            static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
                final /* synthetic */ xe2<gd2, CreateCredentialException> $callback;
                final /* synthetic */ Exception $e;
                final /* synthetic */ Executor $executor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Executor executor, xe2<gd2, CreateCredentialException> xe2Var, Exception exc) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = xe2Var;
                    this.$e = exc;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$0(xe2 xe2Var, Exception exc) {
                    xe2Var.a(new CreateCredentialUnknownException(exc.getMessage()));
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m124invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m124invoke() {
                    Executor executor = this.$executor;
                    final xe2<gd2, CreateCredentialException> xe2Var = this.$callback;
                    final Exception exc = this.$e;
                    executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreateRestoreCredential.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            CredentialProviderCreateRestoreCredentialController.AnonymousClass1.AnonymousClass2.invoke$lambda$0(xe2Var, exc);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CreateRestoreCredentialResponse) obj);
                return Unit.a;
            }

            public final void invoke(CreateRestoreCredentialResponse createRestoreCredentialResponse) {
                try {
                    CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController = CredentialProviderCreateRestoreCredentialController.this;
                    Intrinsics.g(createRestoreCredentialResponse);
                    gd2 gd2VarConvertResponseToCredentialManager = credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(createRestoreCredentialResponse);
                    CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C00761(executor, callback, gd2VarConvertResponseToCredentialManager));
                } catch (Exception e) {
                    CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2(executor, callback, e));
                }
            }
        };
        taskN.f(new OnSuccessListener() { // from class: com.google.android.bf2
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).d(new OnFailureListener() { // from class: com.google.android.cf2
            public final void onFailure(Exception exc) {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$1(cancellationSignal, executor, callback, exc);
            }
        });
    }
}
