package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.tw4;
import com.google.inputmethod.fd2;
import com.google.inputmethod.gd2;
import com.google.inputmethod.jl9;
import com.google.inputmethod.kw4;
import com.google.inputmethod.ld2;
import com.google.inputmethod.lo6;
import com.google.inputmethod.nd2;
import com.google.inputmethod.pd2;
import com.google.inputmethod.sw4;
import com.google.inputmethod.td1;
import com.google.inputmethod.xe2;
import com.google.inputmethod.ze2;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJE\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001fJ?\u0010#\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"0\u0010H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R(\u0010'\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lcom/google/android/ze2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "minApkVersion", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "Landroidx/credentials/d;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Lcom/google/android/xe2;", "Landroidx/credentials/e;", "Landroidx/credentials/exceptions/GetCredentialException;", "callback", "", "onGetCredential", "(Landroid/content/Context;Landroidx/credentials/d;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lcom/google/android/xe2;)V", "Lcom/google/android/fd2;", "Lcom/google/android/gd2;", "Landroidx/credentials/exceptions/CreateCredentialException;", "onCreateCredential", "(Landroid/content/Context;Lcom/google/android/fd2;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lcom/google/android/xe2;)V", "", "isAvailableOnDevice", "()Z", "(I)Z", "Lcom/google/android/td1;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "onClearCredential", "(Lcom/google/android/td1;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lcom/google/android/xe2;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
public final class CredentialProviderPlayServicesImpl implements ze2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private GoogleApiAvailability googleApiAvailability;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "Landroidx/credentials/d;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(Landroidx/credentials/d;)Z", "isGetSignInIntentRequest", "isGetRestoreCredentialRequest$credentials_play_services_auth_release", "isGetRestoreCredentialRequest", "isDigitalCredentialRequest$credentials_play_services_auth_release", "isDigitalCredentialRequest", "", "MIN_GMS_APK_VERSION", "I", "MIN_GMS_APK_VERSION_DIGITAL_CRED", "MIN_GMS_APK_VERSION_RESTORE_CRED", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            return cancellationSignal != null && cancellationSignal.isCanceled();
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth_release(androidx.credentials.d request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<androidx.credentials.b> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof kw4) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth_release(androidx.credentials.d request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<androidx.credentials.b> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof sw4) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(androidx.credentials.d request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<androidx.credentials.b> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof tw4) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ xe2<Void, ClearCredentialException> $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Executor executor, xe2<Void, ClearCredentialException> xe2Var) {
            super(0);
            this.$executor = executor;
            this.$callback = xe2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(xe2 xe2Var) {
            xe2Var.a(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m88invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m88invoke() {
            Executor executor = this.$executor;
            final xe2<Void, ClearCredentialException> xe2Var = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.a
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.AnonymousClass1.invoke$lambda$0(xe2Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onCreateCredential$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
    static final class C02211 extends Lambda implements Function0<Unit> {
        final /* synthetic */ xe2<gd2, CreateCredentialException> $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02211(Executor executor, xe2<gd2, CreateCredentialException> xe2Var) {
            super(0);
            this.$executor = executor;
            this.$callback = xe2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(xe2 xe2Var) {
            xe2Var.a(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m95invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m95invoke() {
            Executor executor = this.$executor;
            final xe2<gd2, CreateCredentialException> xe2Var = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.f
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.C02211.invoke$lambda$0(xe2Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onGetCredential$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
    static final class C02221 extends Lambda implements Function0<Unit> {
        final /* synthetic */ xe2<androidx.credentials.e, GetCredentialException> $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02221(Executor executor, xe2<androidx.credentials.e, GetCredentialException> xe2Var) {
            super(0);
            this.$executor = executor;
            this.$callback = xe2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(xe2 xe2Var) {
            xe2Var.a(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m97invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m97invoke() {
            Executor executor = this.$executor;
            final xe2<androidx.credentials.e, GetCredentialException> xe2Var = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.g
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.C02221.invoke$lambda$0(xe2Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onGetCredential$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
    static final class C02232 extends Lambda implements Function0<Unit> {
        final /* synthetic */ xe2<androidx.credentials.e, GetCredentialException> $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02232(Executor executor, xe2<androidx.credentials.e, GetCredentialException> xe2Var) {
            super(0);
            this.$executor = executor;
            this.$callback = xe2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(xe2 xe2Var) {
            xe2Var.a(new GetCredentialProviderConfigurationException("this feature requires the minimum API level to be 23"));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m99invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m99invoke() {
            Executor executor = this.$executor;
            final xe2<androidx.credentials.e, GetCredentialException> xe2Var = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.h
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.C02232.invoke$lambda$0(xe2Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onGetCredential$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
    static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ xe2<androidx.credentials.e, GetCredentialException> $callback;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Executor executor, xe2<androidx.credentials.e, GetCredentialException> xe2Var) {
            super(0);
            this.$executor = executor;
            this.$callback = xe2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(xe2 xe2Var) {
            xe2Var.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m100invoke();
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m100invoke() {
            Executor executor = this.$executor;
            final xe2<androidx.credentials.e, GetCredentialException> xe2Var = this.$callback;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.i
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.AnonymousClass3.invoke$lambda$0(xe2Var);
                }
            });
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailabilityQ = GoogleApiAvailability.q();
        Intrinsics.checkNotNullExpressionValue(googleApiAvailabilityQ, "getInstance(...)");
        this.googleApiAvailability = googleApiAvailabilityQ;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.j(context, minApkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, xe2 xe2Var, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).b() == 40201) {
            objectRef.element = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$3$1(executor, xe2Var, objectRef));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, xe2 xe2Var, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$5$1$1(exc, executor, xe2Var));
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // com.google.inputmethod.ze2
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    @Override // com.google.inputmethod.ze2
    public void onClearCredential(td1 request, final CancellationSignal cancellationSignal, final Executor executor, final xe2<Void, ClearCredentialException> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (!Intrinsics.e(request.getRequestType(), "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            Task taskL = Identity.c(this.context).l();
            final Function1<Void, Unit> function1 = new Function1<Void, Unit>() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl.onClearCredential.4

                /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$4$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
                static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                    final /* synthetic */ xe2<Void, ClearCredentialException> $callback;
                    final /* synthetic */ Executor $executor;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Executor executor, xe2<Void, ClearCredentialException> xe2Var) {
                        super(0);
                        this.$executor = executor;
                        this.$callback = xe2Var;
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m92invoke();
                        return Unit.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m92invoke() {
                        Executor executor = this.$executor;
                        final xe2<Void, ClearCredentialException> xe2Var = this.$callback;
                        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                xe2Var.onResult(null);
                            }
                        });
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Void) obj);
                    return Unit.a;
                }

                public final void invoke(Void r5) {
                    CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass1(executor, callback));
                }
            };
            taskL.f(new OnSuccessListener() { // from class: com.google.android.fg2
                public final void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            }).d(new OnFailureListener() { // from class: com.google.android.gg2
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(this.a, cancellationSignal, executor, callback, exc);
                }
            });
        } else {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass1(executor, callback));
                return;
            }
            Task taskA = RestoreCredential.a(this.context).a(new ClearRestoreCredentialRequest(request.getRequestBundle()));
            final Function1<Boolean, Unit> function2 = new Function1<Boolean, Unit>() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl.onClearCredential.2

                /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2$1, reason: invalid class name */
                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, lo6.HASACTION_FIELD_NUMBER, 0}, xi = 48)
                static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                    final /* synthetic */ xe2<Void, ClearCredentialException> $callback;
                    final /* synthetic */ Executor $executor;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Executor executor, xe2<Void, ClearCredentialException> xe2Var) {
                        super(0);
                        this.$executor = executor;
                        this.$callback = xe2Var;
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m89invoke();
                        return Unit.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m89invoke() {
                        Executor executor = this.$executor;
                        final xe2<Void, ClearCredentialException> xe2Var = this.$callback;
                        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                xe2Var.onResult(null);
                            }
                        });
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Boolean) obj);
                    return Unit.a;
                }

                public final void invoke(Boolean bool) {
                    CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass1(executor, callback));
                }
            };
            taskA.f(new OnSuccessListener() { // from class: com.google.android.dg2
                public final void onSuccess(Object obj) {
                    function2.invoke(obj);
                }
            }).d(new OnFailureListener() { // from class: com.google.android.eg2
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(cancellationSignal, executor, callback, exc);
                }
            });
        }
    }

    public void onCreateCredential(Context context, fd2 request, CancellationSignal cancellationSignal, Executor executor, xe2<gd2, CreateCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof ld2) {
            CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((ld2) request, callback, executor, cancellationSignal);
            return;
        }
        if (request instanceof nd2) {
            CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((nd2) request, callback, executor, cancellationSignal);
        } else {
            if (!(request instanceof pd2)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderCreateRestoreCredentialController(context).invokePlayServices((pd2) request, callback, executor, cancellationSignal);
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new C02211(executor, callback));
            }
        }
    }

    @Override // com.google.inputmethod.ze2
    public /* bridge */ /* synthetic */ void onGetCredential(Context context, jl9 jl9Var, CancellationSignal cancellationSignal, Executor executor, xe2 xe2Var) {
        super.onGetCredential(context, jl9Var, cancellationSignal, executor, (xe2<androidx.credentials.e, GetCredentialException>) xe2Var);
    }

    @Override // com.google.inputmethod.ze2
    public /* bridge */ /* synthetic */ void onPrepareCredential(androidx.credentials.d dVar, CancellationSignal cancellationSignal, Executor executor, xe2 xe2Var) {
        super.onPrepareCredential(dVar, cancellationSignal, executor, xe2Var);
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        Intrinsics.checkNotNullParameter(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = iIsGooglePlayServicesAvailable == 0;
        if (!z) {
            new ConnectionResult(iIsGooglePlayServicesAvailable).toString();
        }
        return z;
    }

    @Override // com.google.inputmethod.ze2
    public void onGetCredential(Context context, androidx.credentials.d request, CancellationSignal cancellationSignal, Executor executor, xe2<androidx.credentials.e, GetCredentialException> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth_release(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new C02221(executor, callback));
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth_release(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new AnonymousClass3(executor, callback));
                return;
            }
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }
}
