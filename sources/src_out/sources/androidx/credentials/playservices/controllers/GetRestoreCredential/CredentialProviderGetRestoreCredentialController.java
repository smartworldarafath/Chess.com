package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.inputmethod.lo6;
import com.google.inputmethod.sw4;
import com.google.inputmethod.xe2;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Landroidx/credentials/d;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "Landroidx/credentials/e;", "Landroidx/credentials/exceptions/GetCredentialException;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lcom/google/android/xe2;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Landroidx/credentials/d;Lcom/google/android/xe2;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Landroidx/credentials/d;)Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)Landroidx/credentials/e;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<androidx.credentials.d, GetRestoreCredentialRequest, GetRestoreCredentialResponse, androidx.credentials.e, GetCredentialException> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Executor executor, xe2 xe2Var, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new GetCredentialUnknownException("Get restore credential failed for unknown reason, failure: " + exc.getMessage());
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            if (apiException.b() == 40201) {
                objectRef.element = new GetCredentialUnknownException("The restore credential internal service had a failure, failure: " + exc.getMessage());
            } else {
                objectRef.element = new GetCredentialUnknownException("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + apiException.b());
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1(executor, xe2Var, objectRef));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetRestoreCredentialRequest convertRequestToPlayServices(androidx.credentials.d request) {
        androidx.credentials.b bVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Iterator<androidx.credentials.b> it = request.a().iterator();
        do {
            bVar = null;
            if (!it.hasNext()) {
                break;
            }
        } while (!(it.next() instanceof sw4));
        Intrinsics.x("credentialOption");
        return new GetRestoreCredentialRequest(bVar.getRequestData());
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public androidx.credentials.e convertResponseToCredentialManager(GetRestoreCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new androidx.credentials.e(androidx.credentials.a.INSTANCE.b("androidx.credentials.TYPE_RESTORE_CREDENTIAL", response.N()));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(androidx.credentials.d request, final xe2<androidx.credentials.e, GetCredentialException> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task taskD = RestoreCredential.a(this.context).d(convertRequestToPlayServices(request));
        final Function1<GetRestoreCredentialResponse, Unit> function1 = new Function1<GetRestoreCredentialResponse, Unit>() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController.invokePlayServices.1

            /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
            static final class C00771 extends Lambda implements Function0<Unit> {
                final /* synthetic */ xe2<androidx.credentials.e, GetCredentialException> $callback;
                final /* synthetic */ Executor $executor;
                final /* synthetic */ androidx.credentials.e $response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00771(Executor executor, xe2<androidx.credentials.e, GetCredentialException> xe2Var, androidx.credentials.e eVar) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = xe2Var;
                    this.$response = eVar;
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m139invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m139invoke() {
                    Executor executor = this.$executor;
                    final xe2<androidx.credentials.e, GetCredentialException> xe2Var = this.$callback;
                    final androidx.credentials.e eVar = this.$response;
                    executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            xe2Var.onResult(eVar);
                        }
                    });
                }
            }

            /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
            static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
                final /* synthetic */ xe2<androidx.credentials.e, GetCredentialException> $callback;
                final /* synthetic */ Exception $e;
                final /* synthetic */ Executor $executor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Executor executor, xe2<androidx.credentials.e, GetCredentialException> xe2Var, Exception exc) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = xe2Var;
                    this.$e = exc;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$0(xe2 xe2Var, Exception exc) {
                    xe2Var.a(exc instanceof NoCredentialException ? (GetCredentialException) exc : new GetCredentialUnknownException(exc.getMessage()));
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m140invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m140invoke() {
                    Executor executor = this.$executor;
                    final xe2<androidx.credentials.e, GetCredentialException> xe2Var = this.$callback;
                    final Exception exc = this.$e;
                    executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            CredentialProviderGetRestoreCredentialController.AnonymousClass1.AnonymousClass2.invoke$lambda$0(xe2Var, exc);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GetRestoreCredentialResponse) obj);
                return Unit.a;
            }

            public final void invoke(GetRestoreCredentialResponse getRestoreCredentialResponse) {
                try {
                    CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController = CredentialProviderGetRestoreCredentialController.this;
                    Intrinsics.g(getRestoreCredentialResponse);
                    androidx.credentials.e eVarConvertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(getRestoreCredentialResponse);
                    CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C00771(executor, callback, eVarConvertResponseToCredentialManager));
                } catch (Exception e) {
                    CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2(executor, callback, e));
                }
            }
        };
        taskD.f(new OnSuccessListener() { // from class: com.google.android.bg2
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).d(new OnFailureListener() { // from class: com.google.android.cg2
            public final void onFailure(Exception exc) {
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$1(cancellationSignal, executor, callback, exc);
            }
        });
    }
}
