package androidx.credentials.provider;

import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.inputmethod.cm0;
import com.google.inputmethod.el0;
import com.google.inputmethod.jg2;
import com.google.inputmethod.jl0;
import com.google.inputmethod.ju8;
import com.google.inputmethod.kg2;
import com.google.inputmethod.kl0;
import com.google.inputmethod.lg2;
import com.google.inputmethod.mg2;
import com.google.inputmethod.ng2;
import com.google.inputmethod.og2;
import com.google.inputmethod.rs9;
import com.google.inputmethod.sk0;
import com.google.inputmethod.tk0;
import com.google.inputmethod.vd1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\b¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\b¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u001a0\bH&¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010 \u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\bH&¢\u0006\u0004\b \u0010!J3\u0010%\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\bH&¢\u0006\u0004\b%\u0010&R*\u0010*\u001a\u00020'2\u0006\u0010(\u001a\u00020'8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u00103\u001a\u0004\u0018\u00010\"2\b\u0010(\u001a\u0004\u0018\u00010\"8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R.\u00109\u001a\u0004\u0018\u00010\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u001d8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R.\u0010@\u001a\u0004\u0018\u00010\u00192\b\u0010(\u001a\u0004\u0018\u00010\u00198G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/credentials/provider/CredentialProviderService;", "Landroid/service/credentials/CredentialProviderService;", "<init>", "()V", "Landroid/service/credentials/BeginGetCredentialRequest;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/OutcomeReceiver;", "Landroid/service/credentials/BeginGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "callback", "", "onBeginGetCredential", "(Landroid/service/credentials/BeginGetCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/BeginCreateCredentialRequest;", "Landroid/service/credentials/BeginCreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "onBeginCreateCredential", "(Landroid/service/credentials/BeginCreateCredentialRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Landroid/service/credentials/ClearCredentialStateRequest;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "onClearCredentialState", "(Landroid/service/credentials/ClearCredentialStateRequest;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Lcom/google/android/rs9;", "Landroidx/credentials/exceptions/ClearCredentialException;", "c", "(Lcom/google/android/rs9;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Lcom/google/android/jl0;", "Lcom/google/android/kl0;", "Landroidx/credentials/exceptions/GetCredentialException;", "b", "(Lcom/google/android/jl0;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "Lcom/google/android/sk0;", "Lcom/google/android/tk0;", "Landroidx/credentials/exceptions/CreateCredentialException;", "a", "(Lcom/google/android/sk0;Landroid/os/CancellationSignal;Landroid/os/OutcomeReceiver;)V", "", "<set-?>", "Z", "isTestMode", "()Z", "setTestMode", "(Z)V", "Lcom/google/android/sk0;", "getLastCreateRequest", "()Lcom/google/android/sk0;", "setLastCreateRequest", "(Lcom/google/android/sk0;)V", "lastCreateRequest", "Lcom/google/android/jl0;", "getLastGetRequest", "()Lcom/google/android/jl0;", "setLastGetRequest", "(Lcom/google/android/jl0;)V", "lastGetRequest", "d", "Lcom/google/android/rs9;", "getLastClearRequest", "()Lcom/google/android/rs9;", "setLastClearRequest", "(Lcom/google/android/rs9;)V", "lastClearRequest", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isTestMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private sk0 lastCreateRequest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private jl0 lastGetRequest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private rs9 lastClearRequest;

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/provider/CredentialProviderService$a", "Landroid/os/OutcomeReceiver;", "Lcom/google/android/tk0;", "Landroidx/credentials/exceptions/CreateCredentialException;", "response", "", "b", "(Lcom/google/android/tk0;)V", "error", "a", "(Landroidx/credentials/exceptions/CreateCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements OutcomeReceiver {
        final /* synthetic */ OutcomeReceiver a;

        a(OutcomeReceiver outcomeReceiver) {
            this.a = outcomeReceiver;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(CreateCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            OutcomeReceiver outcomeReceiver = this.a;
            kg2.a();
            outcomeReceiver.onError(jg2.a(error.getType(), error.getMessage()));
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(tk0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.a.onResult(el0.INSTANCE.a(response));
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/provider/CredentialProviderService$b", "Landroid/os/OutcomeReceiver;", "Lcom/google/android/kl0;", "Landroidx/credentials/exceptions/GetCredentialException;", "response", "", "b", "(Lcom/google/android/kl0;)V", "error", "a", "(Landroidx/credentials/exceptions/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements OutcomeReceiver {
        final /* synthetic */ OutcomeReceiver a;

        b(OutcomeReceiver outcomeReceiver) {
            this.a = outcomeReceiver;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(GetCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            OutcomeReceiver outcomeReceiver = this.a;
            mg2.a();
            outcomeReceiver.onError(lg2.a(error.getType(), error.getMessage()));
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(kl0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.a.onResult(cm0.INSTANCE.a(response));
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/provider/CredentialProviderService$c", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroidx/credentials/exceptions/ClearCredentialException;", "response", "", "b", "(Ljava/lang/Void;)V", "error", "a", "(Landroidx/credentials/exceptions/ClearCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {
        final /* synthetic */ OutcomeReceiver a;

        c(OutcomeReceiver outcomeReceiver) {
            this.a = outcomeReceiver;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(ClearCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            OutcomeReceiver outcomeReceiver = this.a;
            og2.a();
            outcomeReceiver.onError(ng2.a(error.getType(), error.getMessage()));
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Void response) {
            this.a.onResult(response);
        }
    }

    public abstract void a(sk0 request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public abstract void b(jl0 request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public abstract void c(rs9 request, CancellationSignal cancellationSignal, OutcomeReceiver callback);

    public final void onBeginCreateCredential(BeginCreateCredentialRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        a aVar = new a(callback);
        sk0 sk0VarB = el0.INSTANCE.b(request);
        if (this.isTestMode) {
            this.lastCreateRequest = sk0VarB;
        }
        a(sk0VarB, cancellationSignal, ju8.a(aVar));
    }

    public final void onBeginGetCredential(BeginGetCredentialRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        jl0 jl0VarB = cm0.INSTANCE.b(request);
        b bVar = new b(callback);
        if (this.isTestMode) {
            this.lastGetRequest = jl0VarB;
        }
        b(jl0VarB, cancellationSignal, ju8.a(bVar));
    }

    public final void onClearCredentialState(ClearCredentialStateRequest request, CancellationSignal cancellationSignal, OutcomeReceiver callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        Intrinsics.checkNotNullParameter(callback, "callback");
        c cVar = new c(callback);
        rs9 rs9VarA = vd1.INSTANCE.a(request);
        if (this.isTestMode) {
            this.lastClearRequest = rs9VarA;
        }
        c(rs9VarA, cancellationSignal, ju8.a(cVar));
    }
}
